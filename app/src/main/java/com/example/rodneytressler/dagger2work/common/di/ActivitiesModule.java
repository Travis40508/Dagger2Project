package com.example.rodneytressler.dagger2work.common.di;

import com.example.rodneytressler.dagger2work.ui.MainView.MainActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by rodneytressler on 12/24/17.
 */

@Module
public abstract class ActivitiesModule {

    @ContributesAndroidInjector
    abstract MainActivity contributesMainActivityInjector();
}
