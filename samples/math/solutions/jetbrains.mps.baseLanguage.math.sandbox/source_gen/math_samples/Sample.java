package math_samples;

/*Generated by MPS */

import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.baseLanguage.closures.runtime._FunctionTypes;
import jetbrains.mps.baseLanguage.math.runtime.Matrix;
import jetbrains.mps.baseLanguage.math.runtime.MatrixOperation;
import jetbrains.mps.baseLanguage.math.runtime.Complex;
import java.io.IOException;

public class Sample {

  public static void main(String[] args) {
    double a = Math.random();
    double b = Math.random();
    final List<Integer> list = ListSequence.fromListAndArray(new ArrayList<Integer>(), 1, 2, 3, 4);
    System.out.println(String.valueOf((new _FunctionTypes._return_P0_E0<Matrix<Double>>() {
      public Matrix<Double> invoke() {
        Matrix<Double> r_a0a0a3a1;
        r_a0a0a3a1 = null;
        for (int i_a0a0a0d0b = 0; i_a0a0a0d0b <= 99; i_a0a0a0d0b++) {
          int k_a0a0a0d0b = i_a0a0a0d0b;
          r_a0a0a3a1 = new Matrix(r_a0a0a3a1, new Matrix<Double>(true, Matrix.soDouble, new Matrix<Double>(new Matrix<Integer>(new Integer[][]{{1, k_a0a0a0d0b, 0}}, Matrix.soInt), Matrix.soDouble), new Matrix<Double>(new Double[][]{{(double) 0, 1.0, (double) 0}}, Matrix.soDouble), new Matrix<Double>(new Matrix<Integer>(new Integer[][]{{0, 0, 1}}, Matrix.soInt), Matrix.soDouble)), MatrixOperation.MatrixAdd, Matrix.soDouble);
        }
        return r_a0a0a3a1;
      }
    }.invoke())));
    System.out.println(String.valueOf((new _FunctionTypes._return_P0_E0<Matrix<Double>>() {
      public Matrix<Double> invoke() {
        Matrix<Double> r_a0a0a4a1;
        r_a0a0a4a1 = null;
        for (Integer k_a0a0a0e0b : ListSequence.fromList(list)) {
          r_a0a0a4a1 = new Matrix(r_a0a0a4a1, new Matrix<Double>(true, Matrix.soDouble, new Matrix<Double>(new Matrix<Integer>(new Integer[][]{{1, k_a0a0a0e0b, 0}}, Matrix.soInt), Matrix.soDouble), new Matrix<Double>(new Double[][]{{(double) 0, 1.0, (double) 0}}, Matrix.soDouble), new Matrix<Double>(new Matrix<Integer>(new Integer[][]{{0, 0, 1}}, Matrix.soInt), Matrix.soDouble)), MatrixOperation.MatrixAdd, Matrix.soDouble);
        }
        return r_a0a0a4a1;
      }
    }.invoke())));
    System.out.println(new Complex(a, b).exp().sub(new Complex(Math.exp(a), 0).mul((new Complex(Math.cos(b), Math.sin(b))))));
    Matrix<Double> s = new Matrix<Double>(false, Matrix.soDouble, new Matrix<Double>(new Double[][]{{3.0}, {Math.pow(3, 2)}, {(double) 0}, {(double) 4}}, Matrix.soDouble), new Matrix<Double>(new Double[][]{{Math.sin(1)}, {(double) 1}, {Math.pow(2, 7 - (1.0 / 2) + 1)}, {(double) 0}}, Matrix.soDouble), new Matrix<Double>(new Double[][]{{(double) 1}, {3 + (1.0 / 2)}, {Math.exp(1)}, {(double) 0}}, Matrix.soDouble), new Matrix<Double>(new Matrix<Integer>(new Integer[][]{{1}, {2}, {3}, {0}}, Matrix.soInt), Matrix.soDouble));
    Matrix<Double> r = new Matrix<Double>(false, Matrix.soDouble, new Matrix<Double>(new Double[][]{{Math.cos(a)}, {Math.pow(3, 2)}, {new _FunctionTypes._return_P0_E0<Double>() {
      public Double invoke() {
        Double r_c0a0h0b;
        r_c0a0h0b = null;
        for (Integer e_a2a0a7a1 : ListSequence.fromList(list)) {
          {
            Double v_c0a0h0b = 3 * Math.log(e_a2a0a7a1);
            if (r_c0a0h0b == null) {
              r_c0a0h0b = v_c0a0h0b;
            } else if (r_c0a0h0b.compareTo(v_c0a0h0b) < 0) {
              r_c0a0h0b = v_c0a0h0b;
            }
          }
        }
        return r_c0a0h0b;
      }
    }.invoke()}, {(double) 4}}, Matrix.soDouble), new Matrix<Double>(new Double[][]{{Math.sin(1)}, {(double) 1}, {Math.pow(2, 7 - (a / 2) + b)}, {(double) 0}}, Matrix.soDouble), new Matrix<Double>(true, Matrix.soDouble, 1, 3 + (1.0 / 2), Math.exp(1), new _FunctionTypes._return_P0_E0<Integer>() {
      public Integer invoke() {
        Integer r_d2a0h0b;
        r_d2a0h0b = (Integer) 1;
        for (Integer n_a3c0a7a1 : ListSequence.fromList(list)) {
          r_d2a0h0b = r_d2a0h0b * (n_a3c0a7a1);
        }
        return r_d2a0h0b;
      }
    }.invoke()));

    System.out.println(s);
    System.out.println(r);
    try {
      int i = 1;
      while (i != 0) {
        i = System.in.read();
      }
    } catch (IOException e) {
      System.out.println("Error!");
    }
  }
}
