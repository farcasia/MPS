package jetbrains.mps.baseLanguage.textGen;

/*Generated by MPS */

import org.jetbrains.mps.annotations.Immutable;

@Immutable
public final class ImportEntry {
  private final String myNameToImport;
  private final String myNameToUse;
  /*package*/ ImportEntry(String name2use) {
    this(null, name2use);
  }
  /*package*/ ImportEntry(String nestedName, ImportEntry another) {
    this(another.myNameToImport, another.myNameToUse + nestedName);
  }
  /*package*/ ImportEntry(String name2import, String name2use) {
    // name2import == null indicates no import needed 
    myNameToImport = name2import;
    myNameToUse = name2use;
  }
  public boolean needsImport() {
    return myNameToImport != null;
  }
  public String getImport() {
    return myNameToImport;
  }
  public String getName() {
    return myNameToUse;
  }
}
