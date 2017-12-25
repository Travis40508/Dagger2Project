package com.example.rodneytressler.dagger2work.data.network;

import android.arch.lifecycle.LiveData;

import retrofit2.Call;

/**
 * Created by rodneytressler on 12/24/17.
 */

public class PokemonApiImpl implements PokemonApi {

    private PokemonRetrofit pokemonRetrofit;

    public PokemonApiImpl(PokemonRetrofit pokemonRetrofit) {
        this.pokemonRetrofit = pokemonRetrofit;
    }

    @Override
    public Call<PokemonRetrofit.Pokemon> getPokemon(String pokemonName) {
        return pokemonRetrofit.getPokemon(pokemonName);
    }
}
