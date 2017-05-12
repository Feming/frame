package com.frame.util;

import java.util.UUID;

/**
 * Created by Fengmy on 2017/4/28.
 */
public class IdCreate {

    /**
     * 封装JDK自带的UUID, 通过Random数字生成, 中间无-分割.
     */
    public static String uuid() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }

    public static void main(String[] args){
        System.out.println(uuid());
    }
}
