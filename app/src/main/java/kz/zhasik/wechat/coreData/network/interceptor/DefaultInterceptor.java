package kz.zhasik.wechat.coreData.network.interceptor;

import java.io.IOException;

import okhttp3.Response;

public class DefaultInterceptor extends BaseInterceptor {

    @Override
    public Response intercept(Chain chain) throws IOException {
        return chain.proceed(chain.request());
    }
}
