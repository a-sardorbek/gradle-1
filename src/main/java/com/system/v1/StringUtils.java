package com.system.v1;

import org.apache.commons.lang3.math.NumberUtils;

public class StringUtils {

    public static boolean isPositiveNumber(String str){

        if(str == null){
            throw new NullPointerException();
        }
        if(NumberUtils.isParsable(str)){
           return NumberUtils.toDouble(str)>0;
        }else {
            throw new NumberFormatException(str + " is not a number");
        }


    }
}
