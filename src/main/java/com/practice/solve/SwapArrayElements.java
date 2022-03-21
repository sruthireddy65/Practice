package com.practice.solve;

public class SwapArrayElements {

    public int[] swapElements(int[] a){
        int positiveIndex = 0;
        for(int i=0; i<a.length; i++){
            if(a[i] < 0){
                if(i != positiveIndex){
                    int temp = a[positiveIndex];
                    a[positiveIndex] = a[i];
                    a[i] = temp;
                }

                positiveIndex = i;
            }
        }
        return a;
    }
}
