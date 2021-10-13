package com.objectiva.demo;

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

    @Override
    public String toString() {
        return "PersonBean{" +
                "personID=" + personID +
                ", name='" + name + '\'' +
                '}';
    }
}
