package jetbrains.mps.internal.make.runtime.java;

/*Generated by MPS */

import java.util.List;
import java.util.ArrayList;
import jetbrains.mps.vfs.IFile;
import jetbrains.mps.messages.IMessageHandler;
import jetbrains.mps.util.FileUtil;
import org.jdom.Element;
import org.jdom.Document;
import java.io.ByteArrayOutputStream;
import jetbrains.mps.util.JDOMUtil;
import java.io.IOException;
import jetbrains.mps.messages.Message;
import jetbrains.mps.messages.MessageKind;
import java.util.Collection;
import java.io.OutputStream;
import java.io.InputStream;

public class FileProcessor {
  private final List<FileProcessor.FileContent> myFilesAndContents = new ArrayList<FileProcessor.FileContent>();
  private final List<IFile> myFilesToDelete = new ArrayList<IFile>();
  private final IMessageHandler myMessageHandler;

  public FileProcessor(IMessageHandler messageHandler) {
    myMessageHandler = messageHandler;
  }

  public boolean saveContent(IFile file, String content) {
    return saveContent(new FileProcessor.FileContent(file, content.getBytes(FileUtil.DEFAULT_CHARSET)));
  }

  public boolean saveContent(IFile file, Element content) {
    Document document;
    if (content.getDocument() != null) {
      assert content.isRootElement() : "Need a document to serialize an xml element; could not save if element is already inside a document";
      document = content.getDocument();
    } else {
      document = new Document(content);
    }
    ByteArrayOutputStream bos = new ByteArrayOutputStream(1 << 13);
    try {
      JDOMUtil.writeDocument(document, bos);
    } catch (IOException ex) {
      Message msg = new Message(MessageKind.ERROR, FileProcessor.class, (ex.getMessage() == null ? ex.getClass().getName() : ex.getMessage()));
      msg.setException(ex);
      msg.setHintObject(file);
      myMessageHandler.handle(msg);
    }
    return saveContent(new FileProcessor.FileContent(file, bos.toByteArray()));
  }

  public boolean saveContent(IFile file, byte[] content) {
    return saveContent(new FileProcessor.FileContent(file, content));
  }

  private boolean saveContent(FileProcessor.FileContent fileContent) {
    // XXX though it seems more honest to collect all fileContent 
    //     and make decision whether isChanged right before the write operation 
    //     I need to tell written/touch at this moment, therefore isChanged is here 
    //     and no reason to keep the data we aren't going to write anyway 
    if (fileContent.isChanged()) {
      myFilesAndContents.add(fileContent);
      return true;
    }
    return false;
  }
  public void filesToDelete(Collection<IFile> files) {
    myFilesToDelete.addAll(files);
  }
  public void flushChanges() {
    for (FileProcessor.FileContent fileContent : myFilesAndContents) {
      fileContent.saveToFile(myMessageHandler);
    }
    for (IFile file : myFilesToDelete) {
      file.delete();
    }
  }

  private static class FileContent {
    private final IFile myFile;
    private final byte[] myContent;

    private FileContent(IFile file, byte[] content) {
      myFile = file;
      myContent = content;
    }

    public void saveToFile(IMessageHandler messageHandler) {
      OutputStream stream = null;
      try {
        stream = myFile.openOutputStream();
        stream.write(myContent);
      } catch (IOException ex) {
        Message msg = new Message(MessageKind.ERROR, FileProcessor.class, (ex.getMessage() == null ? ex.getClass().getName() : ex.getMessage()));
        msg.setException(ex);
        msg.setHintObject(myFile);
        messageHandler.handle(msg);
      } finally {
        if (stream != null) {
          try {
            stream.close();
          } catch (IOException ignored) {
          }
        }
      }
    }

    public boolean isChanged() {
      if (!(myFile.exists())) {
        return true;
      }
      long len = myFile.length();
      if (len != myContent.length) {
        return true;
      }
      if (len == 0) {
        return false;
      }

      // stream.read(byte[0]) never gives -1 
      assert myContent.length > 0;

      byte[] res = new byte[Math.min(1 << 13, myContent.length)];
      InputStream stream = null;
      try {
        stream = myFile.openInputStream();
        int bytesRead = 0;
        int index = 0;
        while ((bytesRead = stream.read(res)) != -1) {
          for (int i = 0; i < bytesRead; i++) {
            if (myContent[index++] != res[i]) {
              return true;
            }
          }
        }
        return false;
      } catch (IOException ex) {
        return true;
      } finally {
        if (stream != null) {
          try {
            stream.close();
          } catch (IOException ex) {
            return true;
          }
        }
      }
    }
  }
}
