package com.cn466.retrofit.pojo;
import com.google.gson.annotations.SerializedName;
public class Record {
    @SerializedName("name")
    public String name;
    @SerializedName("value")
    public longvalue;

    public Record(String name, longvalue) {
        this.name = name;
        this.value = value;
    }
}