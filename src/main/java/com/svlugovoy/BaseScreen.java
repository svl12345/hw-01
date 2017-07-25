package com.svlugovoy;

public abstract class BaseScreen {

    public static final String APPLICATION_NAME = "Facebook";

    private String username;

    abstract String getTitle();

    protected void goBack(){
        System.out.println("This is goBack() method in super class.");
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
