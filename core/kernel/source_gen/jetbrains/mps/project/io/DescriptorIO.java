package jetbrains.mps.project.io;

/*Generated by MPS */

import jetbrains.mps.vfs.IFile;
import org.jdom.Element;

public interface DescriptorIO<T> {
  T readFromFile(IFile file) throws DescriptorIOException;
  void writeToFile(T t, IFile file) throws DescriptorIOException;
  T readFromXml(Element element, IFile anchorFile) throws DescriptorIOException;
  void writeToXml(T t, Element element, IFile anchorFile) throws DescriptorIOException;
}
