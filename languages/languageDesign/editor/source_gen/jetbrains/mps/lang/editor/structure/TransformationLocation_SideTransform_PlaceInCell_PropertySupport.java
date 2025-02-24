package jetbrains.mps.lang.editor.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.PropertySupport;
import java.util.Iterator;
import jetbrains.mps.internal.collections.runtime.ListSequence;

public class TransformationLocation_SideTransform_PlaceInCell_PropertySupport extends PropertySupport {
  public boolean canSetValue(String value) {
    if (value == null) {
      return true;
    }
    Iterator<TransformationLocation_SideTransform_PlaceInCell> constants = ListSequence.fromList(TransformationLocation_SideTransform_PlaceInCell.getConstants()).iterator();
    while (constants.hasNext()) {
      TransformationLocation_SideTransform_PlaceInCell constant = constants.next();
      if (value.equals(constant.getName())) {
        return true;
      }
    }
    return false;
  }
  public String toInternalValue(String value) {
    if (value == null) {
      return null;
    }
    Iterator<TransformationLocation_SideTransform_PlaceInCell> constants = ListSequence.fromList(TransformationLocation_SideTransform_PlaceInCell.getConstants()).iterator();
    while (constants.hasNext()) {
      TransformationLocation_SideTransform_PlaceInCell constant = constants.next();
      if (value.equals(constant.getName())) {
        return constant.getValueAsString();
      }
    }
    return null;
  }
  public String fromInternalValue(String value) {
    TransformationLocation_SideTransform_PlaceInCell constant = TransformationLocation_SideTransform_PlaceInCell.parseValue(value);
    if (constant != null) {
      return constant.getName();
    }
    return "";
  }
}
