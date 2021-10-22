package com.hicola.lambda.function;

import cn.hutool.log.StaticLog;
import org.junit.jupiter.api.Test;

import java.util.function.Function;

/**
 * @author Willis Bai
 * @title: FunctionDemo2
 * @projectName BasicCoreJavaWithGradle
 * @description: case1: given string, return string
 *               case2: given Integer, return string
 *               stringProcessor's definition is a normal way, and integerProcessor's definition is a lambda way, these two ways are the same
 * @date 10/14/20214:48 PM
 */
public class FunctionDemo2 {
    // define a function interface, it has an apply method, we handle return string result in the apply method
    private Function<String, String> stringProcessor = new Function<String, String>() {
        @Override
        public String apply(String s) {
            // core handling logic
            String returnVal = "Hello, " + s;
            StaticLog.info("Given params: {}, and return: {}", s, returnVal);
            return returnVal;
        }
    };

    // define a function interface, return string
    private Function<Integer, String> integerProcessor = i -> {
        // core handing logic
        String returnVal = "Hello, " + i;
        StaticLog.info("Given params: {}, return: {}", i, returnVal);
        return returnVal;
    };

    public String handle(Function<String, String> processor, String givenStr) {
        return processor.apply(givenStr);
    }

    public String handle(Function<Integer, String> processor, Integer iVal) {
        return processor.apply(iVal);
    }

    @Test
    public void testReturnString() {
        handle(stringProcessor, "Willis");
    }

    /**
     * result:
     * [2021-10-20 10:09:30] [INFO] com.hicola.lambda.function.FunctionDemo2$1: Given params: Willis, and return: Hello, Willis
     */

    @Test
    public void testReturnInteger() {
        handle(integerProcessor, 100);
    }

    /**
     * result:
     * [INFO] com.hicola.lambda.function.FunctionDemo2: Given params: 100, return: Hello, 100
     */

}
