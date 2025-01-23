package kz.zhasik.wechat.presentation.profile;

import android.util.Log;

import androidx.lifecycle.ViewModel;

import java.io.IOException;

import kz.concurrent.reactionx.Cancellable;
import kz.concurrent.reactionx.Observable;
import kz.zhasik.wechat.data.network.PeopleApiService;
import kz.zhasik.wechat.data.network.model.ProfileResponse;

public class ProfileViewModel extends ViewModel {
    private Cancellable cancellable = new Cancellable();
    private PeopleApiService apiService;

    public ProfileViewModel(PeopleApiService apiService) {
        this.apiService = apiService;
    }

    void getProfile() {
        cancellable.execute(Observable.<ProfileResponse>create(() -> {
            try {
                return apiService.getProfile().execute().body();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }).onSuccess(profileResponse -> {
            // handle success
            Log.d("ProfileResponse2", profileResponse.toString());
        }).onError(throwable -> {
            // handle error
            throwable.printStackTrace();
        }));
    }

    @Override
    protected void onCleared() {
        super.onCleared();
        cancellable.clear();
    }
}
