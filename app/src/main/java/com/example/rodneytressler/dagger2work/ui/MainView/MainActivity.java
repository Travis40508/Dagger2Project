package com.example.rodneytressler.dagger2work.ui.MainView;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.rodneytressler.dagger2work.R;
import com.example.rodneytressler.dagger2work.data.network.PokemonApi;
import com.example.rodneytressler.dagger2work.data.network.PokemonRetrofit;

import javax.inject.Inject;

import dagger.android.AndroidInjection;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {


    @Inject
    public PokemonApi pokemonApi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

}
