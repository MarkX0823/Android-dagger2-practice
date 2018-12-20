package com.example.user.helloworld;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class BuildersModule {

    @ContributesAndroidInjector
    abstract MainActivity contributeMainActivity();

    @ContributesAndroidInjector
    abstract Main2Activity contributeMain2Activity();

    @ContributesAndroidInjector
    abstract BlankFragment contributeBlankFragment();
}
