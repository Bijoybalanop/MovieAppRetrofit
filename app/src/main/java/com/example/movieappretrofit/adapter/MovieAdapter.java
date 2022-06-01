package com.example.movieappretrofit.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.example.movieappretrofit.MovieActivity;
import com.example.movieappretrofit.R;
import com.example.movieappretrofit.databinding.MovieListItemBinding;
import com.example.movieappretrofit.model.Movie;

import java.util.ArrayList;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MovieViewHolder> {

    private Context context;
    private ArrayList<Movie> movies;

    public MovieAdapter(Context context, ArrayList<Movie> movies) {
        this.context = context;
        this.movies = movies;
    }


    public class MovieViewHolder extends RecyclerView.ViewHolder{

        private MovieListItemBinding movieListItemBinding;

       public MovieViewHolder(MovieListItemBinding movieListItemBinding) {
           super(movieListItemBinding.getRoot());
           this.movieListItemBinding = movieListItemBinding;
           movieListItemBinding.getRoot().setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   int position =getAdapterPosition();
                   if(position!= RecyclerView.NO_POSITION){
                       Movie selectedMovie=movies.get(position);
                       Intent i =new Intent(context, MovieActivity.class);
                       i.putExtra("movie",selectedMovie);
                       context.startActivity(i);

                   }
               }
           });

       }
   }

    @NonNull
    @Override
    public MovieViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        MovieListItemBinding movieListItemBinding= DataBindingUtil.inflate
                (LayoutInflater.from(parent.getContext()),
                R.layout.movie_list_item,
                parent,
                false);
        return new MovieViewHolder(movieListItemBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull MovieViewHolder holder, int position) {
        Movie movie=movies.get(position);
        holder.movieListItemBinding.setMovie(movie);

    }

    @Override
    public int getItemCount() {
        return movies.size();
    }

}
