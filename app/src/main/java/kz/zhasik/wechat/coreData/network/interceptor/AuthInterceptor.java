package kz.zhasik.wechat.coreData.network.interceptor;

import java.io.IOException;

import kz.zhasik.wechat.BuildConfig;
import okhttp3.Credentials;
import okhttp3.Request;
import okhttp3.Response;

public class AuthInterceptor extends BaseInterceptor {

    @Override
    public Response intercept(Chain chain) throws IOException {
        Request original = chain.request();
        String credentials = Credentials.basic(BuildConfig.EMAIL, BuildConfig.API_KEY);

        Request.Builder requestBuilder = original.newBuilder();
        requestBuilder.header("Authorization", credentials).method(
                original.method(),
                original.body()).build();
        return chain.proceed(requestBuilder.build());
    }

}
