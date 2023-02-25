package com.epam.demo;

import java.util.List;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        if (args == null){
            return false;
        }
       return args.stream().allMatch(a ->a.matches("\\d+") && Integer.parseInt(a)>=0);
    }
}