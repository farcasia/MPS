package jetbrains.mps.core.baseLanguage.constructors.sandbox.test2;

/*Generated by MPS */

import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

public class Rectangle {
  public Rectangle() {
  }
  public static Point2D Point(double x, double y) {
    return new Point2D.Double(x, y);
  }
  public static Rectangle2D Rectangle(Point2D topleft, Point2D bottomright) {
    double x = topleft.getX();
    double y = topleft.getY();
    return new Rectangle2D.Double(x, y, bottomright.getX() - x, bottomright.getY() - y);
  }
}
