package com.epam.utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
      if (str == null){
          return false;
      }
        int i = Integer.parseInt(str);
      return i>0;
    }
}
