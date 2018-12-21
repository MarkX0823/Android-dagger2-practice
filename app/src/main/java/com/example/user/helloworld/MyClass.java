package com.example.user.helloworld;


public class MyClass {

    public String name = "";
    public int id = 0;

    @Override
    public String toString() {
        return getClass().getSimpleName() + ":" + id + ":" + name;
    }
}
