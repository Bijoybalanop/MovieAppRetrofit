package com.example.movieappretrofit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toolbar;

import com.example.movieappretrofit.databinding.ActivityMovieBinding;
import com.example.movieappretrofit.model.Movie;

public class MovieActivity extends AppCompatActivity {

    private Movie movie;
    private ActivityMovieBinding activityMovieBinding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie);


        //Toolbar

        Toolbar toolbar =(Toolbar)  findViewById(R.id.toolbar);
        setActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        activityMovieBinding= DataBindingUtil.setContentView(this,R.layout.activity_movie);
        Intent i =getIntent();
        if(i.hasExtra("movie")){
            movie=getIntent().getParcelableExtra("movie");
            activityMovieBinding.setMovie(movie);
            getSupportActionBar().setTitle(movie.getTitle());
        }

    }
}