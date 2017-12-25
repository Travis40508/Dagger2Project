package com.example.rodneytressler.dagger2work.ui.MainView;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import android.support.annotation.NonNull;

import com.example.rodneytressler.dagger2work.data.network.PokemonApi;

import javax.inject.Inject;

/**
 * Created by rodneytressler on 12/24/17.
 */

public class MainViewModelFactory implements ViewModelProvider.Factory {

    private PokemonApi pokemonApi;

    @Inject
    public MainViewModelFactory(PokemonApi pokemonApi) {
        this.pokemonApi = pokemonApi;
    }


    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        return (T) new MainViewModel(pokemonApi);
    }
}
