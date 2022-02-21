package com.practice.solve;

import java.util.Set;

public class PermutationsOfString {

    public Set<String> findPermutations(String input, int start, Set<String> result){
        if(start == input.length()-1){
            result.add(input);
        }
        for(int i=start; i< input.length(); i++){
            input = swap(input, start, i);
            findPermutations(input, start+1, result);
            input = swap(input, i, start);
        }
        return result;
    }

    private String swap(String input, int start, int i) {
        char[] chArray = input.toCharArray();
        char temp = chArray[start];
        chArray[start] = chArray[i];
        chArray[i] = temp;
        return new String(chArray);
    }
}
