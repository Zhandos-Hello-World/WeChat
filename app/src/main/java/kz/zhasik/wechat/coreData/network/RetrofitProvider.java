package kz.zhasik.wechat.coreData.network;

import kz.zhasik.wechat.coreData.network.builder.WeChatRetrofitBuilder;
import kz.zhasik.wechat.coreData.network.interceptor.AuthInterceptor;
import retrofit2.Retrofit;

public class RetrofitProvider {
    private final static Object lock = new Object();
    private static volatile Retrofit retrofit;

    public static Retrofit getInstance() {
        synchronized (lock) {
            if (retrofit == null) {
                retrofit = WeChatRetrofitBuilder.provideBaseRetrofit(
                        WeChatRetrofitBuilder.provideOKHttpClient(new AuthInterceptor()),
                        WeChatRetrofitBuilder.provideGsonConverterFactory()
                );
                return retrofit;
            }
            return retrofit;
        }

    }

}
