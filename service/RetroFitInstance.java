package com.northcoders.record_shop_application.service;

import retrofit2.Retrofit;

public class RetroFitInstance {
    private static Retrofit retrofit = null;
    private static final String baseURL = "http://localhost:8080/api/v1/records";

    public static AlbumApiService getService() {
        return null;
    }
}
