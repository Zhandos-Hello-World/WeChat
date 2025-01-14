package kz.zhasik.wechat.coreData.network.builder;

import kz.zhasik.wechat.BuildConfig;
import kz.zhasik.wechat.coreData.network.interceptor.BaseInterceptor;
import okhttp3.OkHttpClient;
import retrofit2.Converter;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class WeChatRetrofitBuilder {

    public static OkHttpClient provideOKHttpClient(BaseInterceptor interceptor) {
        return new OkHttpClient.Builder().addInterceptor(interceptor).build();
    }

    public static GsonConverterFactory provideGsonConverterFactory() {
        return GsonConverterFactory.create();
    }

    public static Retrofit provideBaseRetrofit(OkHttpClient client, Converter.Factory factory) {
        return new Retrofit.Builder().baseUrl(BuildConfig.BASE_URL).addConverterFactory(factory).client(client).build();
    }
}
