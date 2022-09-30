package com.group3.project4.util;

import com.group3.project4.profile.UpdateUserResult;
import com.group3.project4.login.LoginResult;
import com.group3.project4.signup.SignupResult;

import java.util.HashMap;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;

public interface RetrofitInterface {
    @POST("/api/auth")
    Call<LoginResult> login(@Body HashMap<String, String> data);

    @POST("/api/signup")
    Call<SignupResult> signup(@Body HashMap<String, String> data);

    @POST("/api/user/update")
    Call<UpdateUserResult> updateUser(@Header ("x-jwt-token") String token, @Body HashMap<String, Object> data);
}