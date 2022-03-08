package com.practice.solve;

public class SecondLargestNumber {

    public int findSecondLargest(int[] input){
        int largest = -1;
        int secondLargest = -1;
        for(int i=0; i< input.length; i++){
            if(input[i] > largest){
                secondLargest = largest;
                largest = input[i];
            } else if (input[i] > secondLargest && input[i]!=largest){
                secondLargest = input[i];
            }
        }
        return secondLargest;
    }
}
