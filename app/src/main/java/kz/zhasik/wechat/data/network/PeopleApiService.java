package kz.zhasik.wechat.data.network;

import kz.zhasik.wechat.data.network.model.ProfileResponse;
import retrofit2.Call;
import retrofit2.http.GET;

public interface PeopleApiService {

    @GET("/api/v1/users/me")
    Call<ProfileResponse> getProfile();

}


//interface PeopleApiService {
//
//    @GET("/api/v1/users")
//    suspend fun getAllPeople(): PeopleListResponse
//
//    @GET("/api/v1/users/me")
//    suspend fun getProfile(): ProfileResponse
//
//    @GET("/api/v1/users/{user_id_or_email}/presence")
//    suspend fun getPresence(@Path("user_id_or_email") userIdOrEmail: String): PresenceResponse
//
//}