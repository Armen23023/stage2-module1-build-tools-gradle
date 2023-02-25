package com.epam.utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
      if (str == null){
          return false;
      }
        double i = Double.parseDouble(str);
      return i>0;
    }
}
