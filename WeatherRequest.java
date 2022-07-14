package Lesson6HW;

import okhttp3.*;

import java.io.IOException;

public class WeatherRequest {

    public static void main(String[] args) throws IOException {

        OkHttpClient okHttpClient = new OkHttpClient();

        HttpUrl httpUrl = new HttpUrl.Builder()
                .scheme("http")
                .host("dataservice.accuweather.com")
              //  .addPathSegment("forecasts/v1/daily/1day/294021?apikey=CA5cnp3NWDoEL0wgosOkQ8qnkaPfsSBi")
                .addPathSegment("forecasts")
                .addPathSegment("v1")
                .addPathSegment("daily")
                .addPathSegment("1day")
                .addPathSegment("295212")
                .addQueryParameter("apikey","CA5cnp3NWDoEL0wgosOkQ8qnkaPfsSBi")
                .build();

        Request weatherRequest = new Request.Builder()
                .url(httpUrl)
                .build();

        Response weatherResponse = okHttpClient.newCall(weatherRequest).execute();
        System.out.println(weatherResponse.body().string());


    }
}
