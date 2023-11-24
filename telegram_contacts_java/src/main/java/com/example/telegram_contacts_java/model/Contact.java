package com.example.telegram_contacts_java.model;

public class Contact {

    private int profile;
    private String fullname;
    private boolean isButton;

    public Contact(int profile, String fullname, boolean isButton) {
        this.profile = profile;
        this.fullname = fullname;
        this.isButton = isButton;
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

    public boolean isButton() {
        return isButton;
    }

    public void setButton(boolean button) {
        isButton = button;
    }
}
