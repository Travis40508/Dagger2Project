package com.example.rodneytressler.dagger2work.common.di;

import com.example.rodneytressler.dagger2work.common.PokedexApplication;

import dagger.Component;
import dagger.android.AndroidInjectionModule;

/**
 * Created by rodneytressler on 12/24/17.
 */

/**Here our ApplicationComponent is built with its corresponding app-scoped Modules. Every subcomponent inside of these modules is now added
 * to this parent component. Meaning the subcomponents will have access to the objects provided by these modules.
 * In the case of ActivitiesModule, the subcomponents inside of it will have full-access to the objects inside of these modules, since
 * ActivitiesModule is being included here. This means that the views that are being injected there by these subcomponents will have
 * access to these objects.*/
@Component(modules = {AndroidInjectionModule.class, ApplicationModule.class, NetworkModule.class, ActivitiesModule.class})
public interface ApplicationComponent {

    void inject(PokedexApplication pokedexApplication);
}
