package com.example.myapplication2.model;



import com.google.gson.annotations.SerializedName;

public class MsanModel {

    /*
        ------ Msan ------------
        @id
        @ip
        @label
        @adresse
        @longitude
        @latitude
        @Type_Msan
        @Date_Mise_En_Place
        @Active
     */
    @SerializedName("id")
    private String id;
    @SerializedName("ip")
    private String ip;
    @SerializedName("label")
    private String label;
    @SerializedName("adresse")
    private String adresse;
    @SerializedName("longitude")
    private String longitude;
    @SerializedName("latitude")
    private String latitude;
    @SerializedName("Type_Msan")
    private Integer Type_Msan;
    @SerializedName("Date_Mise_En_Place")
    private String Date_Mise_En_Place;
    @SerializedName("Active")
    private Integer Active;

    public MsanModel(String id, String ip, String label, String adresse, String longitude, String latitude, Integer type_Msan, String date_Mise_En_Place, Integer active) {
        this.id = id;
        this.ip = ip;
        this.label = label;
        this.adresse = adresse;
        this.longitude = longitude;
        this.latitude = latitude;
        Type_Msan = type_Msan;
        Date_Mise_En_Place = date_Mise_En_Place;
        Active = active;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public Integer getType_Msan() {
        return Type_Msan;
    }

    public void setType_Msan(Integer type_Msan) {
        Type_Msan = type_Msan;
    }

    public String getDate_Mise_En_Place() {
        return Date_Mise_En_Place;
    }

    public void setDate_Mise_En_Place(String date_Mise_En_Place) {
        Date_Mise_En_Place = date_Mise_En_Place;
    }

    public Integer getActive() {
        return Active;
    }

    public void setActive(Integer active) {
        Active = active;
    }
}
