package com.cn466.retrofit;
import com.cn466.retrofit.pojo.Record;
import com.cn466.retrofit.pojo.FirebaseResponse;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;
public interface FirebaseService {
    @POST("/test.json")
    Call<FirebaseResponse> appendRecord(@Body Record record);
}