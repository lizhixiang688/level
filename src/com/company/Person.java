package com.company;

public class Person {
    private String name;
    private int age;
    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void sleep(){
        System.out.println(name+"在睡觉");
    }
    public void eat(){
        System.out.println(name+"在吃饭");
    }
    public void study(){
        System.out.println(name+"在学习");
    }
    public String getName(){
        return name;
    }
}
