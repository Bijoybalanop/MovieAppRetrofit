package com.example.movieappretrofit.service;

import com.example.movieappretrofit.model.Result;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface MovieDataService {

    //base Url
    //https://api.themoviedb.org/3/

    // End point Url
    //movie/popular?api_key=dcd7aabdb1af627883eda1e300b05ff8

    @GET("movie/popular")
    Call<Result> getPopularMovies(@Query("api_key") String apiKey);


}
