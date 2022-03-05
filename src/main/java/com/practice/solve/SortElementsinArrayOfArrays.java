package com.practice.solve;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortElementsinArrayOfArrays {

    public int[] sortWithoutStreams(int[][] input){
        List<Integer> result = new ArrayList<>();
        for(int i=0; i<input.length; i++){
            for(int j=0; j<input[i].length; j++){
                result.add(input[i][j]);
            }
        }
        Collections.sort(result);
        return result.stream().mapToInt(i -> i).toArray();
    }

    public int[] sortUsingStreams(int[][] input){
        return Arrays.stream(input)
                .flatMapToInt(Arrays::stream)
                .sorted()
                .toArray();
    }
}
