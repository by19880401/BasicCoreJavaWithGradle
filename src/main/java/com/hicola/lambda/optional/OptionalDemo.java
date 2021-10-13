package com.hicola.lambda.optional;

import cn.hutool.log.StaticLog;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;
import java.util.Optional;

/**
 * @author Willis Bai
 * @title: OptionalDemo
 * @projectName BasicCoreJavaWithGradle
 * @description: TODO
 * @date 10/13/20211:14 PM
 */
public class OptionalDemo {

    @Test
    @Disabled
    public void createEmptyOptional(){
        Optional<Person> emptyOpt = Optional.empty();
        Person person = emptyOpt.get();
        StaticLog.info("Person info: {}",person);
    }

    @Test
    @Disabled
    public void optionalOfNullableString(){
        String name = "ok";
        Optional<String> opt = Optional.ofNullable(name);
        StaticLog.info("Info: {}",opt);
    }

    @Test
    public void optionalOfNullableObj(){
        /*Person person = null;*/ // isPresent： false
        Person person = new Person(1,"Willis-Test"); // isPresent： true
        Optional<Person> opt = Optional.ofNullable(person);
        StaticLog.info("is present? {}", opt.isPresent());// one way

        // another way
        opt.ifPresent(p->StaticLog.info("Person info: {},{}", p.getId(),p.getName()));
    }


}
