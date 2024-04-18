package com.example.github11_danilov;

public class Contributor {

    public String login;
    public int contributions;

    // И другие поля
    //String html_url;

    @Override
    public String toString() {
        return login + " (" + contributions + ")";
    }
}
