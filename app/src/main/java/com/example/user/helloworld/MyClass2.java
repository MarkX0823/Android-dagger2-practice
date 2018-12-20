package com.example.user.helloworld;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class MyClass2 {
    public String name = "";
    public int id = 0;

    @Inject
    public MyClass2() {
    }

    @Override
    public String toString() {
        return id + ":" + name;
    }
}
