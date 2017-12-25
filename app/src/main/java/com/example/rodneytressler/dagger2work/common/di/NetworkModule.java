package com.example.rodneytressler.dagger2work.common.di;

import com.example.rodneytressler.dagger2work.data.network.PokemonApi;
import com.example.rodneytressler.dagger2work.data.network.PokemonApiImpl;
import com.example.rodneytressler.dagger2work.data.network.PokemonRetrofit;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by rodneytressler on 12/24/17.
 */

/**This is a module providing objects. It's included in the ApplicationComponent, meaning any other module there will have access to these objects. */
@Module
public class NetworkModule {

    private final String baseUrl;

    public NetworkModule(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    @Provides
    Retrofit providesRetrofit() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return  retrofit;
    }

    @Provides
    PokemonRetrofit providesPokemonRetrofit(Retrofit retrofit) {
        PokemonRetrofit pokemonRetrofit = retrofit.create(PokemonRetrofit.class);
        return pokemonRetrofit;
    }

    @Provides
    PokemonApi providesPokemonApi(PokemonRetrofit pokemonRetrofit) {
        return new PokemonApiImpl(pokemonRetrofit);
    }
}
