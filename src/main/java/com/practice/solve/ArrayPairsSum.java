package com.practice.solve;

import java.util.HashSet;

public class ArrayPairsSum {

    public void findPairs(int[] a, int sum){
        HashSet<Integer> intsSet = new HashSet<>();
        HashSet<String> result = new HashSet<>();
        for(int i=0; i< a.length; i++){
            if(intsSet.contains(sum-a[i])){
                result.add(a[i]+"-"+(sum-a[i]));
            }
            intsSet.add(a[i]);
        }
        System.out.println(result);
    }
}
