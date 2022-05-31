package com.example.movieappretrofit.model;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.databinding.BaseObservable;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Result extends BaseObservable implements Parcelable {

    @SerializedName("page")
    @Expose
    private Integer page;
    @SerializedName("results")
    @Expose
    private List<Movie> results = null;
    @SerializedName("total_results")
    @Expose
    private Integer totalResults;
    @SerializedName("total_pages")
    @Expose
    private Integer totalPages;

    //Parcel creator

    public final static Parcelable.Creator<Result> CREATOR= new Creator<Result>() {
        @Override
        public Result createFromParcel(Parcel parcel) {
            return new Result(parcel);
        }

        @Override
        public Result[] newArray(int size) {
            return new Result[0];
        }
    };





    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public List<Movie> getResults() {
        return results;
    }

    public void setResults(List<Movie> results) {
        this.results = results;
    }

    public Integer getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(Integer totalResults) {
        this.totalResults = totalResults;
    }

    public Integer getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }


    //Methods

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(page);
        dest.writeValue(totalResults);
        dest.writeValue(totalPages);
        dest.writeList(results);
    }

    public Result() {
    }


    public Result(Parcel in) {
        this.page = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.totalResults = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.totalPages = ((Integer) in.readValue((Integer.class.getClassLoader())));
        //loding results
        in.readList(this.results,com.example.movieappretrofit.model.Movie.class.getClassLoader());
    }
}
