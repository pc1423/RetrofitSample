package com.example.retrofitsample.retrofit;

import com.example.retrofitsample.model.LottoResult;

import io.reactivex.Single;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface LottoService {
    //http://blog.kaisyu.com/2010/07/web-api.html#gsc.tab=0 참조
    //http://lotto.kaisyu.com/api?method=get&gno=202
    @GET("/api?method=get")
    Single<LottoResult> getLottoNumber(@Query("gno") int number);
}
