package com.practice.solve;

import java.util.Arrays;
import java.util.stream.Collectors;

public class CountFrequency {

    public String count(String input){
        StringBuilder result = new StringBuilder();
        char ch = input.charAt(0);
        int count = 1;
        char current;
        for(int i=1; i < input.length(); i++){
            current = input.charAt(i);
            if(ch == current){
                count++;
            } else {
                result.append(ch).append(count);
                ch = current;
                count = 1;
            }
        }
        return result.append(ch).append(count).toString();
    }
}
