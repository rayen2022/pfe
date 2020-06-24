package com.example.myapplication2.rest;

import com.example.myapplication2.model.MsanResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;


public interface ApiInterface {

    // behi a7na el url eli bech njibou menha e lista mta3 les Msan hiyya
    // http://localhost/MsanManager/ListMsan.json
    // w a7na deja declarina el BASE_URl fi retrofit : // http://localhost/MsanManager/
    // ma3neha l'url mte3na eli bech njibou menha e list mta3 les Msan mawjouda ta7t el BASE_URL
    // // http://localhost/MsanManager/ListMsan.json
    // BASE_URL w ta7tha  ListMsan.json
    // behi el BASE_URL mte3na eli declarineha
    // BASE_URL = "                                  http://localhost/MsanManager/";
    // w a7na e l'url eli bech njibou menha e lista :http://localhost/MsanManager/ListMsan.json
    // ma3neha BASE_URL w ta7tha ListMsan.json fuhiemt ??????????????????????????


    // t7otha lehna ya rayyen aman rakez aman
    //ay ne5dohom bel getter w setter w enti ta7kili 3al url sda9ni ki tfasarli llel sbe7 le tji el mo5i bh en passe
    //@GET("ListMsan.json")
    @GET("msan/aff.php")
    Call<MsanResponse> getListMsan();
    //Call<MsanResponse> getListMsan(@Query("api_key") String apiKey);
    // 7atta el (@Query("api_key") String apiKey) dhaherli mouch bech nest7a9ouha zeda ( taw nchoufou )
    // rit howwa el url mte3ou hakka : //
    //( http://api.themoviedb.org/3/movie/top_rated?api_key=INSERT_YOUR_API_KEY
    //3ou ifebla e5er fiha : ?api_key=INSERT_YOUR_API_KEY
    // donc hne howwa esta3mel el @Query("api_key") fhemt ????

    //ma3neha howa 3ibara 5edem site web kemel
    //mich fil local 3la heheka lezmo apikey
    // 7atta a7na konna najmou ne5dmou nafss el5edma fi local na3mlou site web
    // w api_key hiyya variable 7atha fel url howwa mdefiniha fi sirte mte3ou
    // enajmou a7na na3mlou ay variable o5ra ken je 3anna site web 7atta fi local
    // fhemt ??????????
    //bh ena achniya bech tbadali fi 7yeti hal apikey chy wala le ?
    //// en passe = chay

    // behi el fonction hedhi getListMsan eli mdeclariha lehne yelzem ndevelopi el code eli fiha


    // normalement mouch bech nes7a9ouha hedhi tawwa
    /*@GET("ListMsan.json/{id}")
    Call<MsanResponse> getMovieDetails(@Path("id") int id, @Query("api_key") String apiKey);*/




}

