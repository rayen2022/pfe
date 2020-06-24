package com.example.myapplication2.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MsanResponse {

    @SerializedName("page")
    private int page;// no9sdou biha Numero mta3 elpage actuel
    @SerializedName("results")
    private List<MsanModel> results; // no9ssdou bila tableu fih llista mta3 les Msan
    @SerializedName("total_results")
    private int totalResults;// no9sdou biha 9adech men Msan mayjouda
    @SerializedName("total_pages")
    private int totalPages; // no9ssdoubiha 9adech men page mawjouda



    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public List<MsanModel> getResults() {
        return results;
    }

    public void setResults(List<MsanModel> results) {
        this.results = results;
    }

    public int getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(int totalResults) {
        this.totalResults = totalResults;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

}
