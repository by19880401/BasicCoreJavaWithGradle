package com.hicola.commons.string;

import org.apache.commons.lang3.StringUtils;

/**
 * @author Willis Bai
 * @title: Demo
 * @projectName BasicCoreJavaWithGradle
 * @description: split demo
 * @date 10/12/202112:26 PM
 */
public class SplitDemo {
    public static void main(String[] args) {
        String str = "1,2,3,";
        System.out.println(StringUtils.split(str));
    }
}
