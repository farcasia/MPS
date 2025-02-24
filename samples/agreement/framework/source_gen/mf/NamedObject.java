package mf;

/*Generated by MPS */


public class NamedObject {
  protected String myName = "no name";
  public NamedObject() {
  }
  public NamedObject(String name) {
    myName = name;
  }
  public String name() {
    return myName;
  }
  @Override
  public String toString() {
    return myName;
  }
  protected void assertNonNull(Object arg) {
    if (arg == null) {
      throw new NullPointerException();
    }
  }
  protected void assertNonNull(Object arg, String message) {
    if (arg == null) {
      throw new NullPointerException(message);
    }
  }
}
