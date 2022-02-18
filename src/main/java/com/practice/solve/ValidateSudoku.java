package com.practice.solve;

import java.util.HashSet;

public class ValidateSudoku {

    public boolean isValidSudoku(int[][] a){
        if(isRowsValid(a) && isColumnsValid(a) && is3_3MatricesValid(a)){
            return true;
        }
        return false;
    }

    private boolean is3_3MatricesValid(int[][] a) {
        for(int i=0; i<9; i+=3){
            for(int j=0; j<9; j+=3){
                if(!isValidMatrix(i,j,a)){
                    return false;
                }
            }
        }
        return true;
    }

    private boolean isValidMatrix(int row, int col, int[][] a) {
        HashSet<Integer> ints = new HashSet<>();
        for(int i=row; i<row+3; i++){
            for(int j=col; j<col+3; j++){
                if(ints.contains(a[i][j]) || a[i][j] == 0){
                    return false;
                }
                ints.add(a[i][j]);
            }
        }
        return true;
    }

    private boolean isColumnsValid(int[][] a) {
        for(int i=0; i<9; i++){
            HashSet<Integer> ints = new HashSet<>();
            for(int j=0; j<9; j++){
                if(ints.contains(a[j][i]) || a[j][i] == 0){
                    return false;
                }
                ints.add(a[j][i]);
            }
        }
        return true;
    }

    private boolean isRowsValid(int[][] a) {
        for(int i=0; i<9; i++){
            HashSet<Integer> ints = new HashSet<>();
            for(int j=0; j<9; j++){
                if(ints.contains(a[i][j]) || a[i][j] == 0){
                    return false;
                }
                ints.add(a[i][j]);
            }
        }
        return true;
    }
}
