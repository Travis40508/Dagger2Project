package com.example.rodneytressler.dagger2work.data.network;

import android.arch.lifecycle.LiveData;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by rodneytressler on 12/24/17.
 */

public interface PokemonRetrofit {

    @GET("/api/v2/pokemon/{name}")
    Call<Pokemon> getPokemon(@Path("name") String pokemonName);

    class Pokemon {
        @SerializedName("weight")
        @Expose private int weight;

        public int getWeight() {
            return weight;
        }
    }
}
