package com.company;

import java.util.Arrays;

import static com.company.Matrix.mat;
import static com.company.Matrix.mat2;

public class Main {

    public static void main(String[] args) {
        int[][] ints = Matrix.multiplyMatrix(mat, mat2);
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints.length; j++) {
                System.out.print(ints[i][j]+" ");
            }
            System.out.println();
        }
    }
}
