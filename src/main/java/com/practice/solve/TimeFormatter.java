package com.practice.solve;

import java.util.LinkedList;
import java.util.Queue;

/**
 * input - #ofseconds --> output :  string representation of duration
 *
 * examples:
 *
 * 61 --> "1 minute and 2 seconds"
 * 3665 --> "1 hour, 1 minute and 5 seconds"
 *
 * duration is expressed as a combination of years, days, hours, minutes and seconds ( no weeks and no months )
 */
public class TimeFormatter {

    public String format2(int input){
        if(input == 0){
            return "now";
        }
        int minSecs = 60;
        int hrSecs = 60 * minSecs;
        int daySecs = 24 * hrSecs;
        int yearSecs = 365 * daySecs;
        int[] seconds = new int[]{yearSecs, daySecs, hrSecs, minSecs, 1};
        String[] values = new String[]{" year", " day", " hour", " minute", " second"};
        Queue<StringBuilder> queue = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i< values.length; i++){
            int val = input/seconds[i];
            if(val != 0){
                queue.add(new StringBuilder().append(val).append(values[i]).append(val == 1 ? "" : "s"));
            }
            input = input % seconds[i];
        }
        if(queue.size() == 1){
            return queue.poll().toString();
        }

        while (!queue.isEmpty()){
            sb.append(queue.poll());
            if(queue.size() == 1){
                sb.append(" and ");
            } else if(queue.size() > 1){
                sb.append(", ");
            }
        }
        return sb.toString();
    }

    public String format(int input){
        if(input == 0){
            return "now";
        }
        int minSecs = 60;
        int hrSecs = 60 * minSecs;
        int daySecs = 24 * hrSecs;
        int yearSecs = 365 * daySecs;
        Queue<StringBuilder> queue = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        if(input/yearSecs != 0){
            int val = input/yearSecs;
            queue.add(new StringBuilder().append(val).append(val == 1 ? " year" : " years"));
            input = input % yearSecs;
        }
        if(input/daySecs != 0){
            int val = input/daySecs;
            queue.add(new StringBuilder().append(val).append(val == 1 ? " day" : " days"));
            input = input % daySecs;
        }
        if(input/hrSecs != 0){
            int val = input/hrSecs;
            queue.add(new StringBuilder().append(val).append(val == 1 ? " hour" : " hours"));
            input = input % hrSecs;
        }
        if(input/minSecs != 0){
            int val = input/minSecs;
            queue.add(new StringBuilder().append(val).append(val == 1 ? " minute" : " minutes"));
            input = input % minSecs;
        }
        if(input != 0){
            queue.add(new StringBuilder().append(input).append(input == 1 ? " second" : " seconds"));
        }

        if(queue.size() == 1){
            return queue.poll().toString();
        }

        while (!queue.isEmpty()){
            sb.append(queue.poll());
            if(queue.size() == 1){
                sb.append(" and ");
            } else if(queue.size() > 1){
                sb.append(", ");
            }
        }
        return sb.toString();
    }


}
