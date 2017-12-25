package com.example.rodneytressler.dagger2work.common.di;

import com.example.rodneytressler.dagger2work.ui.MainView.MainActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by rodneytressler on 12/24/17.
 */

@Module
public abstract class ActivitiesModule {




    /** This works as a subcomponent with the ApplicationComponent as its parent component, since it's inside of the ActivitiesModule that is
     * one of the ApplicationComponent's modules. You could specify modules for this subcomponent, but remember, subcomponents get
     * objects from parent components (such as the App Component), but parent components don't get access to objects created by subcomponents.*/
    @ContributesAndroidInjector
    abstract MainActivity contributesMainActivityInjector();
}
