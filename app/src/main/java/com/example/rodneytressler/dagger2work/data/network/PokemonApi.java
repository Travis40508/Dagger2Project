package com.example.rodneytressler.dagger2work.data.network;

import android.arch.lifecycle.LiveData;

import retrofit2.Call;

/**
 * Created by rodneytressler on 12/24/17.
 */

public interface PokemonApi {
    Call<PokemonRetrofit.Pokemon> getPokemon(String pokemonName);
}
