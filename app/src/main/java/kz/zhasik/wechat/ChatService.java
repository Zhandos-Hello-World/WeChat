package kz.zhasik.wechat;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.Collectors;

import javax.security.auth.callback.Callback;

public class ChatService {
    private ExecutorService executorService = Executors.newCachedThreadPool();


    @RequiresApi(api = Build.VERSION_CODES.N)
    public Future<String> getImage(){
        return executorService.submit((Callable<String>) () -> {
            HttpURLConnection urlConnection = null;
            try {
                urlConnection = (HttpURLConnection) new URL("https://api.open-meteo.com/v1/forecast?latitude=52.52&longitude=13.41&hourly=temperature_2m").openConnection();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                InputStream in = new BufferedInputStream(urlConnection.getInputStream());
                String weather = convertFormatter(in);
                return weather;
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        });
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    private String convertFormatter(InputStream in) {
        return new BufferedReader(new InputStreamReader(in))
                .lines().collect(Collectors.joining("\n"));
    }

}
