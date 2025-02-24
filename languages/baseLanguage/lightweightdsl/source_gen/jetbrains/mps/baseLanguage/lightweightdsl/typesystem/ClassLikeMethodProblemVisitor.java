package jetbrains.mps.baseLanguage.lightweightdsl.typesystem;

/*Generated by MPS */

import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.baseLanguage.closures.runtime._FunctionTypes;

public interface ClassLikeMethodProblemVisitor {
  void visitName(SNode method, String corrected) throws ClassLikeMethodChecker.StopMethodCheckerException;
  void visitReturnType(SNode method, _FunctionTypes._return_P0_E0<? extends SNode> getCorrected) throws ClassLikeMethodChecker.StopMethodCheckerException;
  void visitMissingParam(SNode method, int index, _FunctionTypes._return_P0_E0<? extends SNode> getCorrected) throws ClassLikeMethodChecker.StopMethodCheckerException;
  void visitOddParam(SNode param) throws ClassLikeMethodChecker.StopMethodCheckerException;
  void visitUnknownParam(SNode method, int index) throws ClassLikeMethodChecker.StopMethodCheckerException;
  void visitParamName(SNode param, String corrected) throws ClassLikeMethodChecker.StopMethodCheckerException;
  void visitParamType(SNode param, _FunctionTypes._return_P0_E0<? extends SNode> getCorrected) throws ClassLikeMethodChecker.StopMethodCheckerException;
}
