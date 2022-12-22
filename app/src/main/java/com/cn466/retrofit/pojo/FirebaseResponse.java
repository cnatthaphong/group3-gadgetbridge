package com.cn466.retrofit.pojo;
import com.google.gson.annotations.SerializedName;
public class FirebaseResponse {
    @SerializedName("name")
    public String name;
    public FirebaseResponse(String name)
     {this.name = name;}
    }