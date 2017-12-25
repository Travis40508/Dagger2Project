package com.example.rodneytressler.dagger2work.ui.MainView;

import android.arch.lifecycle.ViewModel;
import android.util.Log;

import com.example.rodneytressler.dagger2work.data.network.PokemonApi;
import com.example.rodneytressler.dagger2work.data.network.PokemonRetrofit;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by rodneytressler on 12/24/17.
 */

public class MainViewModel extends ViewModel {

    public MainViewModel(PokemonApi pokemonApi) {
        pokemonApi.getPokemon("bulbasaur").enqueue(new Callback<PokemonRetrofit.Pokemon>() {
            @Override
            public void onResponse(Call<PokemonRetrofit.Pokemon> call, Response<PokemonRetrofit.Pokemon> response) {
                if(response.isSuccessful()) {
                    Log.d("@@@@", String.valueOf(response.body().getWeight()));
                }
            }

            @Override
            public void onFailure(Call<PokemonRetrofit.Pokemon> call, Throwable t) {

            }
        });
    }
}
