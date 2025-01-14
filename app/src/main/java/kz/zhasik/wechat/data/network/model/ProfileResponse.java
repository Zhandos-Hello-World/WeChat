package kz.zhasik.wechat.data.network.model;

import com.google.gson.annotations.SerializedName;

public class ProfileResponse {

    @SerializedName("full_name")
    private String fullName;

    @SerializedName("email")
    private String email;

    @SerializedName("user_id")
    private int userId;

    @SerializedName("avatar_version")
    private int avatarVersion;

    @SerializedName("is_admin")
    private boolean isAdmin;

    @SerializedName("is_owner")
    private boolean isOwner;

    @SerializedName("is_guest")
    private boolean isGuest;

    @SerializedName("timezone")
    private String timezone;

    @SerializedName("is_active")
    private boolean isActive;

    @SerializedName("avatar_url")
    private String avatarUrl;

    @SerializedName("date_joined")
    private String dateJoined;

    @SerializedName("delivery_email")
    private String deliveredEmail;

    // Getters and setters

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getAvatarVersion() {
        return avatarVersion;
    }

    public void setAvatarVersion(int avatarVersion) {
        this.avatarVersion = avatarVersion;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    public boolean isOwner() {
        return isOwner;
    }

    public void setOwner(boolean isOwner) {
        this.isOwner = isOwner;
    }

    public boolean isGuest() {
        return isGuest;
    }

    public void setGuest(boolean isGuest) {
        this.isGuest = isGuest;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getDateJoined() {
        return dateJoined;
    }

    public void setDateJoined(String dateJoined) {
        this.dateJoined = dateJoined;
    }

    public String getDeliveredEmail() {
        return deliveredEmail;
    }

    public void setDeliveredEmail(String deliveredEmail) {
        this.deliveredEmail = deliveredEmail;
    }

    @Override
    public String toString() {
        return "ProfileResponse{" +
                "fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", userId=" + userId +
                ", avatarVersion=" + avatarVersion +
                ", isAdmin=" + isAdmin +
                ", isOwner=" + isOwner +
                ", isGuest=" + isGuest +
                ", timezone='" + timezone + '\'' +
                ", isActive=" + isActive +
                ", avatarUrl='" + avatarUrl + '\'' +
                ", dateJoined='" + dateJoined + '\'' +
                ", deliveredEmail='" + deliveredEmail + '\'' +
                '}';
    }
}
