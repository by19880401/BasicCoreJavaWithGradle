package com.hicola.lambda.function;

import cn.hutool.log.StaticLog;

import java.util.function.Function;

/**
 * @author Willis Bai
 * @title: FunctionDemo2
 * @projectName BasicCoreJavaWithGradle
 * @description: given string, return string
 * @date 10/14/20214:48 PM
 */
public class FunctionDemo2 {
    // define a function interface, it has an apply method, we handle return result in the apply method
    private Function<String, String> processor = new Function<String, String>() {
        @Override
        public String apply(String s) {
            // core handling logic
            String returnVal = "Hello, " + s;
            StaticLog.info("Given params: {}, and return: {}", s, returnVal);
            return returnVal;
        }
    };

    public String handle(Function<String, String> processor, String givenStr) {
        return processor.apply(givenStr);
    }

    public static void main(String[] args) {
        FunctionDemo2 fd2 = new FunctionDemo2();
        fd2.handle(fd2.processor, "Willis");
    }

}
