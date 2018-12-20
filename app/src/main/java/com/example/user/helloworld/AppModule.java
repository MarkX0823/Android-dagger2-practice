package com.example.user.helloworld;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    @Provides
    @Singleton
    MyClass provideMyClass() {
        return new MyClass();
    }
}
