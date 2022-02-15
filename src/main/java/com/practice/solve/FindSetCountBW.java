package com.practice.solve;

public class FindSetCountBW {

    /**
     * Naive approach
     */
    public int findSetBits(int input){
        int result = 0;
        while (input != 0){
            if(input%2 != 0){
                result++;
            }
            input = input/2;
        }
        return result;
    }
}
