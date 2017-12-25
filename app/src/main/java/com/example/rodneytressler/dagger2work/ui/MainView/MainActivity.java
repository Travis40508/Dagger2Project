package com.example.rodneytressler.dagger2work.ui.MainView;

import android.arch.lifecycle.ViewModelProviders;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.rodneytressler.dagger2work.R;
import com.example.rodneytressler.dagger2work.data.network.PokemonApi;
import com.example.rodneytressler.dagger2work.data.network.PokemonRetrofit;
import com.example.rodneytressler.dagger2work.databinding.ActivityMainBinding;

import javax.inject.Inject;

import dagger.android.AndroidInjection;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Inject MainViewModelFactory factory;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        setContentView(R.layout.activity_main);
        MainViewModel mainViewModel = getViewModel();
        binding.setViewModel(mainViewModel);
    }

    public MainViewModel getViewModel() {
        return ViewModelProviders.of(this, factory).get(MainViewModel.class);
    }
}
