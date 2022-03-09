package com.practice.solve;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LagestPalindrome {

    public String largest(String input){
        List<String> result = new ArrayList<>();
        for(int i=0; i< input.length(); i++){
            char start = input.charAt(i);
            StringBuilder sb = new StringBuilder().append(start);
            for(int j=i+1; j< input.length();j++ ){
                if(input.charAt(j) == start){
                    sb.append(input.charAt(j));
                    if(isPalindrome(sb.toString())){
                        result.add(sb.toString());
                    }
                }else {
                    sb.append(input.charAt(j));
                }
            }
        }

        String output="";
        for(int i=0; i< result.size(); i++){
            if(output.length() < result.get(i).length()){
                output = result.get(i);
            }
        }
        return output;
    }

    private boolean isPalindrome(String a) {
       int length = a.length()-1;
        for(int i=0 ; i< a.length(); i++){
            if(a.charAt(i) != a.charAt(length-i)){
                return false;
            }
        }
        return true;
    }
}
