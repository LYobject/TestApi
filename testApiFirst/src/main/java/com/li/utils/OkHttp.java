package com.li.utils;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import java.io.IOException;

/**
 * @Author:李烨
 * @Description: TODO
 * @DateTime: 2022-11-27 17:58
 **/
public class OkHttp {
    OkHttpClient client = new OkHttpClient();

     public String run(String url) throws IOException {
        Request request = new Request.Builder()
                .url(url)
                .build();

        try (Response response = client.newCall(request).execute()) {
            return response.body().string();
        }
    }
}
