package com.ideal.filter;

/**
 * @Auther: devoty
 * @Date: 2019/1/11 15:11
 * @Description:
 */

public class StringUtil {
    public static boolean isNotEmpty(String D){

        if(null==D || "".equals(D)){
            return true;
        }

        return false;
    }
}
