package com.practice.solve;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortElementsinArrayOfArraysTest {

    private SortElementsinArrayOfArrays sort = new SortElementsinArrayOfArrays();

    @Test
    void sortWithoutStreams() {
        assertArrayEquals(new int[]{0, 1, 1, 2, 3, 4, 5, 6, 7, 8, 9},
                sort.sortWithoutStreams(new int[][]{{9, 7, 5, 3, 1}, {8, 6, 4, 2, 0}, {}, {1}}));
        assertArrayEquals(new int[]{-2, -1, -1, 0, 1, 1, 1, 2, 3},
                sort.sortWithoutStreams(new int[][]{{1}, {}, {1}, {}, {}, {-1, -2, -1}, {0, 3}, {1}, {2}}));
        assertArrayEquals(new int[]{64, 100, 202, 303, 503, 504, 2500, 4096},
                sort.sortWithoutStreams(new int[][]{{}, {}, {64}, {}, {504, 503}, {4096}, {}, {303}, {202}, {2500}, {}, {100}}));
        assertArrayEquals(new int[]{0, 18, 27, 35, 46, 54, 63, 72, 81, 90},
                sort.sortWithoutStreams(new int[][]{{90, 81, 72}, {63, 54, 35}, {}, {46}, {27, 18, 0}}));
        assertArrayEquals(new int[]{-1, -1, -1, 0, 0, 0, 1, 1, 1},
                sort.sortWithoutStreams(new int[][]{{1}, {}, {1}, {1}, {0}, {-1}, {}, {0}, {-1}, {0}, {-1}}));
        assertArrayEquals(new int[]{-9, -8, -7, -6, -5, -4, -3, -2, -1},
                sort.sortWithoutStreams(new int[][]{{-9, -8, -7, -6, -5, -4, -3, -2, -1}}));
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9},
                sort.sortWithoutStreams(new int[][]{{9, 8, 7, 6, 5, 4, 3, 2, 1}}));
    }

    @Test
    void sortUsingStreams() {
        assertArrayEquals(new int[]{0, 1, 1, 2, 3, 4, 5, 6, 7, 8, 9},
                sort.sortUsingStreams(new int[][]{{9, 7, 5, 3, 1}, {8, 6, 4, 2, 0}, {}, {1}}));
        assertArrayEquals(new int[]{-2, -1, -1, 0, 1, 1, 1, 2, 3},
                sort.sortUsingStreams(new int[][]{{1}, {}, {1}, {}, {}, {-1, -2, -1}, {0, 3}, {1}, {2}}));
        assertArrayEquals(new int[]{64, 100, 202, 303, 503, 504, 2500, 4096},
                sort.sortUsingStreams(new int[][]{{}, {}, {64}, {}, {504, 503}, {4096}, {}, {303}, {202}, {2500}, {}, {100}}));
        assertArrayEquals(new int[]{0, 18, 27, 35, 46, 54, 63, 72, 81, 90},
                sort.sortUsingStreams(new int[][]{{90, 81, 72}, {63, 54, 35}, {}, {46}, {27, 18, 0}}));
        assertArrayEquals(new int[]{-1, -1, -1, 0, 0, 0, 1, 1, 1},
                sort.sortUsingStreams(new int[][]{{1}, {}, {1}, {1}, {0}, {-1}, {}, {0}, {-1}, {0}, {-1}}));
        assertArrayEquals(new int[]{-9, -8, -7, -6, -5, -4, -3, -2, -1},
                sort.sortUsingStreams(new int[][]{{-9, -8, -7, -6, -5, -4, -3, -2, -1}}));
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9},
                sort.sortUsingStreams(new int[][]{{9, 8, 7, 6, 5, 4, 3, 2, 1}}));
    }
}