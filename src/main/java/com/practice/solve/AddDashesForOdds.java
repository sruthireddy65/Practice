package com.practice.solve;

import java.util.Arrays;
import java.util.stream.Collectors;

public class AddDashesForOdds {

    public String addDashes(int input){
        return Arrays.stream(String.valueOf(input).split(""))
                .map(x -> Integer.parseInt(x)%2==0 ? x : "-"+x+"-")
                .collect(Collectors.joining())
                .replaceAll("--","-")
                .replaceAll("-$", "")
                .replaceAll("^-", "");
    }
}
