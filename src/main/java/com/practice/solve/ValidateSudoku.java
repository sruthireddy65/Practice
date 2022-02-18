package com.practice.solve;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ValidateSudoku {

    public boolean isValidSudoku(int[][] a) {
        if (isRowsValid(a) && isColumnsValid(a) && is3_3MatricesValid(a)) {
            return true;
        }
        return false;
    }

    private boolean is3_3MatricesValid(int[][] a) {
        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {
                if (!isValidMatrix(i, j, a)) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean isValidMatrix(int row, int col, int[][] a) {
        Set<Integer> ints = IntStream.rangeClosed(1, a.length).mapToObj(Integer::valueOf).collect(Collectors.toSet());
        for (int i = row; i < row + 3; i++) {
            for (int j = col; j < col + 3; j++) {
                if (!ints.remove(a[i][j])) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean isColumnsValid(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            Set<Integer> ints = IntStream.rangeClosed(1, a.length).mapToObj(Integer::valueOf).collect(Collectors.toSet());
            for (int j = 0; j < a.length; j++) {
                if (!ints.remove(a[j][i])) {
                    return false;
                }
            }
            if (!ints.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    private boolean isRowsValid(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            Set<Integer> ints = IntStream.rangeClosed(1, a.length).mapToObj(Integer::valueOf).collect(Collectors.toSet());
            for (int j = 0; j < a.length; j++) {
                if (!ints.remove(a[i][j])) {
                    return false;
                }
            }
            if (!ints.isEmpty()) {
                return false;
            }
        }
        return true;
    }
}
