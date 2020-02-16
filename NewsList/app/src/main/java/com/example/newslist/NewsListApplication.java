package com.example.newslist;

public class NewsListApplication extends android.app.Application {

    private String username;

    @Override
    public void onCreate(){
        super.onCreate();
        this.username=null;

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String login) {
        this.username = username;
    }

}
