package com.objectiva.function;

import cn.hutool.log.StaticLog;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;

/**
 * @author Willis Bai
 * @title: NewBatchProcessor
 * @projectName BasicCoreJavaWithGradle
 * @description: TODO
 * @date 10/12/20212:18 PM
 */
public class NewBatchProcessor<T, U> {
    private Collection<T> requestDataCollection;
    private Function<T, U> requestProcessor;

    public NewBatchProcessor(Collection<T> requestDataCollection, Function<T, U> requestProcessor) {
        this.requestDataCollection = requestDataCollection;
        this.requestProcessor = requestProcessor;
    }

    public List<U> process() {
        List<U> successList = new ArrayList<>();
        this.requestDataCollection.stream().forEach(requestData -> {
            U responseObj = this.requestProcessor.apply(requestData);
            successList.add(responseObj);
        });
        return successList;
    }
}
