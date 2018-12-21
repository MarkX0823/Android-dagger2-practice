package com.example.user.helloworld;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class MyClass3 {
    MyClass myClass;

    @Inject
    public MyClass3(MyClass myClass) {
        this.myClass = myClass;
    }

    @Override
    public String toString() {
        return myClass.toString();
    }
}
