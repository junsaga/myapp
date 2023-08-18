package com.junsaga.myapplication.api;

import com.junsaga.myapplication.model.AddressList;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Query;

public interface MapApi {
    @GET("map-static/v2/raster")
    Call<ResponseBody> getStaticMap(
            @Header("1npnqdm1vz") String apiKeyId,
            @Header("jhBEesqzmhvmW4r2a8kQrhLBfUYxeAUuMCTuHNyi") String apiKey,
            @Query("w") int width,
            @Query("h") int height,
            @Query("center") String center,
            @Query("level") int level,
            @Query("format") String format
    );
}
