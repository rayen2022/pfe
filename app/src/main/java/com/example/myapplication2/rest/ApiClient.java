package com.example.myapplication2.rest;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class ApiClient {

    //public static final String BASE_URL = "http://localhost/MsanManager/";
    //public static final String BASE_URL = "http://10.0.2.2:80/MsanManager/";
    public static final String BASE_URL = "http://10.0.2.2:80/MsanManagerWebService/";
    // behi 5allini nfasserlek  chma3neha el BASE_URl
    // el BASE_URL hiyya l'url parent eli yabda ta7tha les url lo5rin el kol
    // mathan a7na fel projet mte3na 3anna :
    // http://localhost/MsanManager/ListMsan.json
    // http://localhost/MsanManager/ListAlert.json
    // http://localhost/MsanManager/Login.php

    // fel exemple mta3na el BASE_URL hiyya http://localhost/MsanManager/
    // el base eli bch nel9a feha tous les autre url ( list , login , ajout modif .... )

    private static Retrofit retrofit = null;


    public static Retrofit getClient() {
        if (retrofit==null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}