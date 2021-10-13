package com.objectiva.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 * @author Willis Bai
 * @title: Main
 * @projectName BasicCoreJavaWithGradle
 * @description: TODO
 * @date 10/12/20212:17 PM
 */
public class Main {

    private static Function<PersonBean, PersonBean> createRequestProcessor = (PersonBean reqData) -> {
        PersonBean personBean = printInfo(reqData);
        return null;
    };

    public static void main(String[] args) {
        List<PersonBean> requestDataList = initList();
        NewBatchProcessor<PersonBean, PersonBean> batchProcessor = new NewBatchProcessor<>(requestDataList, createRequestProcessor);
        batchProcessor.process();
    }


    private static PersonBean printInfo(PersonBean personBean) {
        System.out.println(personBean);
        return null;
    }

    private static List<PersonBean> initList() {
        List<PersonBean> resultList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            PersonBean personBean = new PersonBean();
            personBean.setPersonID(i);
            personBean.setName("name+" + i);
            resultList.add(personBean);
        }
        return resultList;
    }
}
