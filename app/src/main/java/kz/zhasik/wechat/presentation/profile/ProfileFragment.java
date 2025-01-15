package kz.zhasik.wechat.presentation.profile;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import kz.zhasik.wechat.coreData.network.RetrofitProvider;
import kz.zhasik.wechat.data.network.PeopleApiService;
import kz.zhasik.wechat.data.network.model.ProfileResponse;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ProfileFragment extends Fragment {
    private TextView textView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        textView = new TextView(getContext());
        textView.setText("Profile");
        return textView;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        RetrofitProvider.getInstance()
                .create(PeopleApiService.class)
                .getProfile()
                .enqueue(new Callback<>() {
            @Override
            public void onResponse(Call<ProfileResponse> call, Response<ProfileResponse> response) {
                ProfileResponse profileResponse = response.body();
                Log.d("ProfileResponse",  profileResponse.toString());
                textView.setText(profileResponse.toString());
            }

            @Override
            public void onFailure(Call<ProfileResponse> call, Throwable t) {
                t.printStackTrace();
            }
        });

    }
}
