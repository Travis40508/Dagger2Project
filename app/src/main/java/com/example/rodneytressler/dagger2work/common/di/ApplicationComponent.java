package com.example.rodneytressler.dagger2work.common.di;

import com.example.rodneytressler.dagger2work.common.PokedexApplication;

import dagger.Component;
import dagger.android.AndroidInjectionModule;

/**
 * Created by rodneytressler on 12/24/17.
 */

@Component(modules = {AndroidInjectionModule.class, ApplicationModule.class, NetworkModule.class, ActivitiesModule.class})
public interface ApplicationComponent {

    void inject(PokedexApplication pokedexApplication);
}
