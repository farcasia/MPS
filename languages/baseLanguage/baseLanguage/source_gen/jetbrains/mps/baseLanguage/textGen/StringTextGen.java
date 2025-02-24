package jetbrains.mps.baseLanguage.textGen;

/*Generated by MPS */

import jetbrains.mps.text.rt.TextGenContext;
import jetbrains.mps.text.impl.TextGenSupport;

public abstract class StringTextGen {
  public static void compilableString(String s, final TextGenContext ctx) {
    final TextGenSupport tgs = new TextGenSupport(ctx);
    String result = s;
    if (s.indexOf('"') >= 0 || s.indexOf('\n') >= 0 || s.indexOf('\r') >= 0) {
      boolean needsEscaping = false;
      for (int i = 0; i < s.length(); i++) {
        if (StringTextGen.isBadDoubleQuote(s, i, ctx) || result.charAt(i) == '\r' || result.charAt(i) == '\n') {
          needsEscaping = true;
          break;
        }
      }
      if (needsEscaping) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
          if (StringTextGen.isBadDoubleQuote(s, i, ctx)) {
            stringBuilder.append("\\\"");
          } else if (result.charAt(i) == '\r') {
            stringBuilder.append("\\r");
          } else if (result.charAt(i) == '\n') {
            stringBuilder.append("\\n");
          } else {
            stringBuilder.append(s.charAt(i));
          }
        }
        result = stringBuilder.toString();
      }
    }
    tgs.append(result);
  }
  protected static boolean isBadDoubleQuote(String s, int i, final TextGenContext ctx) {
    final TextGenSupport tgs = new TextGenSupport(ctx);
    return s.charAt(i) == '"' && (i == 0 || s.charAt(i - 1) != '\\');
  }
}
