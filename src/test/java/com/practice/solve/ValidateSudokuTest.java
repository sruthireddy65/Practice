package com.practice.solve;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidateSudokuTest {

    private ValidateSudoku validateSudoku;

    @BeforeEach
    public void setup() {
        validateSudoku = new ValidateSudoku();
    }

    @Test
    void isValidSudoku() {
        ValidateSudoku validateSudoku = new ValidateSudoku();
        int[][] sudoku = {
                {5, 3, 4, 6, 7, 8, 9, 1, 2},
                {6, 7, 2, 1, 9, 5, 3, 4, 8},
                {1, 9, 8, 3, 4, 2, 5, 6, 7},
                {8, 5, 9, 7, 6, 1, 4, 2, 3},
                {4, 2, 6, 8, 5, 3, 7, 9, 1},
                {7, 1, 3, 9, 2, 4, 8, 5, 6},
                {9, 6, 1, 5, 3, 7, 2, 8, 4},
                {2, 8, 7, 4, 1, 9, 6, 3, 5},
                {3, 4, 5, 2, 8, 6, 1, 7, 9}
        };
        assertTrue(validateSudoku.isValidSudoku(sudoku));
    }

    @Test
    void exampleTest() {
        int[][] sudoku = {
                {5, 3, 4, 6, 7, 8, 9, 1, 2},
                {6, 7, 2, 1, 9, 5, 3, 4, 8},
                {1, 9, 8, 3, 4, 2, 5, 6, 7},
                {8, 5, 9, 7, 6, 1, 4, 2, 3},
                {4, 2, 6, 8, 5, 3, 7, 9, 1},
                {7, 1, 3, 9, 2, 4, 8, 5, 6},
                {9, 6, 1, 5, 3, 7, 2, 8, 4},
                {2, 8, 7, 4, 1, 9, 6, 3, 5},
                {3, 4, 5, 2, 8, 6, 1, 7, 9}
        };
        assertTrue(validateSudoku.isValidSudoku(sudoku));

        sudoku[0][0]++;
        sudoku[1][1]++;
        sudoku[0][1]--;
        sudoku[1][0]--;

        assertFalse(validateSudoku.isValidSudoku(sudoku));

        sudoku[0][0]--;
        sudoku[1][1]--;
        sudoku[0][1]++;
        sudoku[1][0]++;

        sudoku[4][4] = 0;

        assertFalse(validateSudoku.isValidSudoku(sudoku));
    }

    @Test
    void subsquaresTest() {
        int[][] sudoku = {
                {1, 2, 3, 4, 5, 6, 7, 8, 9},
                {2, 3, 4, 5, 6, 7, 8, 9, 1},
                {3, 4, 5, 6, 7, 8, 9, 1, 2},
                {4, 5, 6, 7, 8, 9, 1, 2, 3},
                {5, 6, 7, 8, 9, 1, 2, 3, 4},
                {6, 7, 8, 9, 1, 2, 3, 4, 5},
                {7, 8, 9, 1, 2, 3, 4, 5, 6},
                {8, 9, 1, 2, 3, 4, 5, 6, 7},
                {9, 1, 2, 3, 4, 5, 6, 7, 8}
        };
        assertFalse(validateSudoku.isValidSudoku(sudoku));
    }

    @Test
    public void test3() {
        int[][] sudoku = {
                {8, 7, 9, 1, 2, 3, 5, 4, 6},
                {2, 1, 3, 4, 5, 6, 8, 7, 9},
                {5, 4, 6, 7, 8, 9, 2, 1, 3},
                {6, 5, 7, 8, 9, 1, 3, 2, 4},
                {9, 8, 1, 2, 3, 4, 6, 5, 7},
                {3, 2, 4, 5, 6, 7, 9, 8, 1},
                {1, 9, 2, 3, 4, 5, 7, 6, 8},
                {7, 6, 8, 9, 1, 2, 4, 3, 5},
                {4, 3, 5, 6, 7, 8, 1, 9, 2},
        };
        assertTrue(validateSudoku.isValidSudoku(sudoku));
    }

    @Test
    public void test4() {
        int[][] sudoku = {
                {3, 2, 1, 5, 4, 6, 8, 9, 7},
                {9, 8, 7, 2, 1, 3, 5, 6, 4},
                {6, 5, 4, 8, 7, 9, 2, 3, 1},
                {7, 6, 5, 9, 8, 1, 3, 4, 2},
                {4, 3, 2, 6, 5, 7, 9, 1, 8},
                {1, 9, 8, 3, 2, 4, 6, 7, 5},
                {5, 4, 3, 7, 6, 8, 1, 2, 9},
                {2, 1, 9, 4, 3, 5, 7, 8, 6},
                {8, 7, 6, 1, 9, 2, 4, 5, 3},
        };
        assertTrue(validateSudoku.isValidSudoku(sudoku));
    }

    @Test
    public void test5() {
        int[][] sudoku = {
                {5, 7, 3, 3, 7, 5, 4, 4, 0},
                {0, 5, 4, 1, 2, 1, 1, 5, 4},
                {7, 2, 4, 4, 6, 9, 5, 5, 7},
                {8, 7, 8, 7, 0, 6, 5, 1, 1},
                {5, 6, 5, 8, 1, 9, 8, 1, 7},
                {1, 5, 8, 2, 7, 2, 6, 7, 9},
                {5, 3, 2, 4, 4, 6, 4, 0, 5},
                {4, 6, 0, 9, 0, 6, 1, 4, 5},
                {2, 0, 2, 7, 1, 7, 9, 1, 3},
        };
        assertFalse(validateSudoku.isValidSudoku(sudoku));
    }

    @Test
    public void test6() {
        int[][] sudoku = {
                {8, 6, 9, 1, 2, 5, 7, 3, 4},
                {1, 8, 2, 3, 4, 7, 9, 5, 6},
                {3, 1, 4, 5, 6, 9, 2, 7, 8},
                {9, 7, 1, 2, 3, 6, 8, 4, 5},
                {7, 5, 8, 9, 1, 4, 6, 2, 3},
                {5, 3, 6, 7, 8, 2, 4, 9, 1},
                {2, 9, 3, 4, 5, 8, 1, 6, 7},
                {6, 4, 7, 8, 9, 3, 5, 1, 2},
                {4, 2, 5, 6, 7, 1, 3, 8, 9},
        };
        assertFalse(validateSudoku.isValidSudoku(sudoku));
    }

    @Test
    public void test7() {
        int[][] sudoku = {
                {1, 2, 3, 4, 5, 6, 7, 8, 9},
                {4, 5, 6, 7, 8, 9, 1, 2, 3},
                {7, 8, 9, 1, 2, 3, 4, 5, 6},
                {1, 2, 3, 4, 5, 6, 7, 8, 9},
                {4, 5, 6, 7, 8, 9, 1, 2, 3},
                {7, 8, 9, 1, 2, 3, 4, 5, 6},
                {1, 2, 3, 4, 5, 6, 7, 8, 9},
                {4, 5, 6, 7, 8, 9, 1, 2, 3},
                {7, 8, 9, 1, 2, 3, 4, 5, 6}
        };
        assertFalse(validateSudoku.isValidSudoku(sudoku));

    }

    @Test
    public void test8() {
        int[][] sudoku = {
                {3, 2, 1, 5, 4, 6, 8, 9, 7},
                {9, 8, 7, 2, 1, 3, 5, 6, 4},
                {6, 5, 4, 8, 7, 9, 2, 3, 1},
                {7, 6, 5, 9, 8, 1, 3, 4, 2},
                {4, 3, 2, 6, 5, 7, 9, 1, 8},
                {1, 9, 8, 3, 2, 4, 6, 7, 5},
                {5, 4, 3, 7, 6, 8, 1, 2, 9},
                {2, 1, 9, 4, 3, 5, 7, 8, 6},
                {8, 7, 6, 1, 9, 12, 4, 5, 3},
        };
        assertFalse(validateSudoku.isValidSudoku(sudoku), "booooo....");
    }
}