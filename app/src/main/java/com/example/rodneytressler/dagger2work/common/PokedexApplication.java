package com.example.rodneytressler.dagger2work.common;

import android.app.Activity;
import android.app.Application;

import com.example.rodneytressler.dagger2work.common.di.ApplicationComponent;
import com.example.rodneytressler.dagger2work.common.di.ApplicationModule;
import com.example.rodneytressler.dagger2work.common.di.DaggerApplicationComponent;
import com.example.rodneytressler.dagger2work.common.di.NetworkModule;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;

/**
 * Created by rodneytressler on 12/24/17.
 */

/**This is where we set our dependency injection up. Ths dispatching Android injector specifies how it will inject inside of activities.
 * Then we build our modules onCreate of our application class. Finally, in our activities, we use AndroidInjection.inject(this) BEFORE
 * super(onCreate)*/
public class PokedexApplication extends Application implements HasActivityInjector {

    @Inject
    DispatchingAndroidInjector<Activity> dispatchingAndroidInjector;

    private String baseUrl = "https://pokeapi.co";

    @Override
    public void onCreate() {
        super.onCreate();
        DaggerApplicationComponent.builder()
                .networkModule(new NetworkModule(baseUrl))
                .applicationModule(new ApplicationModule(this))
                .build()
                .inject(this);
    }

    @Override
    public AndroidInjector<Activity> activityInjector() {
        return dispatchingAndroidInjector;
    }
}
