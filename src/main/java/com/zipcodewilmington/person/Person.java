package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name;
    private int age;
    private String hairColor;

    public Person() {
        name = "";
        age = Integer.MAX_VALUE;
    }

    public Person(int age) {
        this.age = 5;
    }

    public Person(String name) {
        this.name = "Leon";
    }

    public Person(String name, int age) {
        this.name = "Leon";
        this.age = 5;
    }


    void setName(String name) {
        this.name = name;
    }

    void setAge(int age) {
        this.age = age;
    }

    void setHairColor(String hairColor){
        this.hairColor = hairColor;
    }

    String getName() {
        return name;
    }

    Integer getAge() {
        return age;
    }

    String getHairColor(){
        return hairColor;
    }

    static Boolean oldEnoughToDrive(Integer age){
        return age > 16;
    }

    static Integer setHeightInInches (Integer feet, Integer inches){
        return feet * 12 + inches;
    }

    static Double getHeightInCentimeters(Integer feet,Integer inches){
        Integer heightInInches = setHeightInInches(feet,inches);
        return heightInInches * 2.54;
    }
}
