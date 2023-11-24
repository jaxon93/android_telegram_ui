package com.example.telegram_main_java.model;

public class Chat {
    private int profile;
    private String fullname;
    private String message;
    private String time;

    public Chat(int profile, String fullname, String message, String time) {
        this.profile = profile;
        this.fullname = fullname;
        this.message = message;
        this.time = time;
    }

    public int getProfile() {
        return profile;
    }

    public void setProfile(int profile) {
        this.profile = profile;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
