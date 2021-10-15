package com.hicola.lambda.optional;

import cn.hutool.log.StaticLog;
import org.junit.jupiter.api.Assertions;
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

    /**
     * that is how to test a method which has exceptions by junit 5
     */
    @Test
    @Disabled
    public void createEmptyOptional() {
        // NoSuchElementException is an excepted exception
        NoSuchElementException noSuchElementException = Assertions.assertThrows(NoSuchElementException.class, () -> {
            // Test method call here
            Optional<Person> emptyOpt = Optional.empty();
            Person person = emptyOpt.get();// here get() method will throw exceptions: NoSuchElementException("No value present")
            StaticLog.info("Person info: {}", person);
        });
        // expected exception message is: No value present, actually yes
        Assertions.assertEquals("No value present", noSuchElementException.getMessage());
    }

    @Test
    public void optionalOfNullableString(){
        String name = "ok";
        Optional<String> opt = Optional.ofNullable(name);
        StaticLog.info("Info: {}",opt.get());// result is 'ok'
    }

    @Test
    @Disabled
    public void optionalOfNullableObj(){
        /*Person person = null;*/ // isPresent： false
        Person person = new Person(1,"Willis-Test"); // isPresent： true
        Optional<Person> opt = Optional.ofNullable(person);
        StaticLog.info("is present? {}", opt.isPresent());// one way

        // another way
        opt.ifPresent(p->StaticLog.info("Person info: {},{}", p.getId(),p.getName()));
    }


}
