package jetbrains.mps.lang.structure.intentions;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.tuples.runtime.Tuples;
import java.util.Random;
import java.awt.Color;
import jetbrains.mps.baseLanguage.tuples.runtime.MultiTuple;

public class ConceptIconHelper {
  public static Tuples._2<String, String> createColors() {
    // make it not less than 80 in each color 
    int mainColor = new Random().nextInt(0x1000000) | 0x808080;
    int borderColor = new Color(mainColor).darker().getRGB() & 0xFFFFFF;

    return MultiTuple.<String,String>from(toColor(mainColor), toColor(borderColor));
  }

  private static String toColor(int ic) {
    String c = Integer.toHexString(ic) + "";
    while (c.length() < 6) {
      c = "0" + c;
    }
    return c;
  }
}
