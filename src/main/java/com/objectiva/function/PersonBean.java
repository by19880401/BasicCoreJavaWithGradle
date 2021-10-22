package com.objectiva.function;

import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Willis Bai
 * @title: PersonBean
 * @projectName BasicCoreJavaWithGradle
 * @description: TODO
 * @date 10/12/20212:27 PM
 */
public class PersonBean {
    private int personID;
    private String name;
    private List<String> sList = new ArrayList<>();

    public int getPersonID() {
        return personID;
    }

    public void setPersonID(int personID) {
        this.personID = personID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getsList() {
        return sList;
    }

    public void setsList(List<String> sList) {
        this.sList = sList;
    }

    @Override
    public String toString() {
        return "PersonBean{" +
                "personID=" + personID +
                ", name='" + name + '\'' +
                ", sList=" + sList +
                '}';
    }
}
