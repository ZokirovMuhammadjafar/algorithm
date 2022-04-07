package com.company;

public class Matrix {
    public static int mat2[][];
    public static int mat[][];
    static {
        mat= new int[][]{
                {1, 2},
                {1, 3},
                {1, 4},
                {1, 5}
        };
        mat2= new int[][]{
                {1, 2, 5, 6},
                {1, 3, 7, 8}

        };
    }
    private static int add(int i,int j){
        return i + j;
    }
    private static int multiply(int i,int j){
        return i*j;
    }

    public static int[][] multiplyMatrix(int[][] A,int[][] B){
        int height=A.length;
        int weight=B[0].length;
        int[][] result =new int [height][weight];
        if(A.length!=B[0].length){
            throw new RuntimeException("cant multiply");
        }
        for (int i = 0; i < height; i++) {
            int[]arr=A[i];
            result[i]=counts(arr,B);
        }
        return result;
    }

    private static int[] counts(int[] arr,  int[][] b) {
        int[] res=new int[b[0].length];
        for (int k = 0; k < b[0].length; k++) {
            int sum=0;
            for (int l = 0; l < arr.length; l++) {
                sum+= arr[l] * b[l][k];
            }
            res[k]=sum;
        }
        return res;
    }
}
