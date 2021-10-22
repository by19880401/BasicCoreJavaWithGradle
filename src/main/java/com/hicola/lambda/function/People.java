package com.hicola.lambda.function;

import lombok.*;

import java.util.function.Function;

/**
 * @author Willis Bai
 * @title: People
 * @projectName BasicCoreJavaWithGradle
 * @description: Function is an interface, it has a method called 'apply'
 * @date 10/12/20214:50 PM
 */

@ToString(of = {"id", "name"}, exclude = {"age"})
public class People {
    private int id;
    private String name;
    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /**
     * R show(T)
     * @param function
     * @return
     */
    public Integer show(Function<People, Integer> function) {
        /**
         * R apply(T t)
         * R is the result (return) value, and T is the parameters
         */
        return function.apply(this);
    }

}
