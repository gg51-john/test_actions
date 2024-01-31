package com.example.demo.Service;

import com.squareup.okhttp.*;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class TestService {

    public String test() throws IOException {
        OkHttpClient client = new OkHttpClient();

        MediaType mediaType = MediaType.parse("application/json");
        RequestBody body = RequestBody.create(mediaType, "{\"grant_type\":\"client_credentials\"}");
        Request request = new Request.Builder()
                .url("https://api.1nce.com/management-api/oauth/token")
                .post(body)
                .addHeader("accept", "application/json")
                .addHeader("content-type", "application/json")
                .addHeader("authorization", "MTIzOjEyMw==")
                .build();

        Response response = client.newCall(request).execute();
        System.out.println(response);
        return response.message();
    }
}
