package com.hicola.lambda.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 * @author Willis Bai
 * @title: FunctionDemo
 * @projectName BasicCoreJavaWithGradle
 * @description: TODO
 * @date 10/12/20214:57 PM
 */
public class FunctionDemo {

    public static void main(String[] args) {
        List<People> peopleList = initList();
        // sample 1:
        /*for (People people : peopleList) {
            System.out.println(people.show(p -> p.getId() + "," + p.getName()));
        }*/

        // sample 2: 构造一个function函数，
        // Function<T,R>, T是函数参数，R是结果
        // 即，传入一个People对象，返回一个Integer类型结果
        Function<People, Integer> peopleFunction = p -> {
            Integer result = p.getId() + p.getAge();
            return result;// 此处返回结果，即R
        };

        for(People people:peopleList){
            System.out.println(people.show(peopleFunction));
        }
    }

    private static List<People> initList() {
        List<People> resultList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            People people = new People();
            people.setId(i);
            people.setName("Willis" + i);
            people.setAge(33);
            resultList.add(people);
        }
        return resultList;
    }
}
