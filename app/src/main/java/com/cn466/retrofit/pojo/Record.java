package com.cn466.retrofit.pojo;
import com.google.gson.annotations.SerializedName;
public class Record {
    @SerializedName("name")
    public String name;
    @SerializedName("value")
    public long value;
    public Record(String name, long value) 
    {this.name = name;this.value = value;}
}