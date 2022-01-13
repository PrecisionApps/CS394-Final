package com.example.ozgeyildizplantsapp;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public class RetrofitBuilder {
    public static final String BASE_URL = "https://api.weatherbit.io/v2.0/";
    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    Gson gson = new GsonBuilder()
            .setDateFormat("yyyy-MM-dd'T'HH:mm:ssZ")
            .create();





    public interface MyApiEndpointInterface {
        // Request method and URL specified in the annotation

        @GET("current?postal_code=34000&country=tr&key=ac1258ad2db24d81b4890af21d0cf461")
        Call<Weather> getWeather();
    }
}
