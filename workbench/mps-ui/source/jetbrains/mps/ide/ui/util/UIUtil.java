/*
 * Copyright 2003-2016 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package jetbrains.mps.ide.ui.util;

import com.intellij.openapi.ui.Messages;
import com.intellij.openapi.util.SystemInfo;
import com.intellij.ui.BrowserHyperlinkListener;

import javax.swing.JTextPane;

public class UIUtil {
  public static void setTextPaneHtmlText(JTextPane textPane, String text) {
    textPane.removeHyperlinkListener(BrowserHyperlinkListener.INSTANCE);
    Messages.installHyperlinkSupport(textPane);
    String s = "<html><body><font face=\"Verdana\" " + (SystemInfo.isMac ? "" : "size=\"-1\"") + '>' +
        text + "</font></body></html>";
    textPane.setText(s);
  }
}
