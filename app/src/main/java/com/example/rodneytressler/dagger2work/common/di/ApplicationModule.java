package com.example.rodneytressler.dagger2work.common.di;

import android.app.Application;
import android.content.Context;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by rodneytressler on 12/24/17.
 */

/**This is a module providing objects. It's included in the ApplicationComponent, meaning any other module there will have access to these objects. */
@Module
public class ApplicationModule {

    private final Application application;

    public ApplicationModule(Application application) {
        this.application = application;
    }

    @Provides
    @Singleton
    Context providesApplicationContext() {
        return application;
    }
}
