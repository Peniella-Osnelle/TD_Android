package com.example.newslist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView Usertext;
    private TextView loginText;
    private Button ok;
    NewsListApplication app;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        ok=findViewById(R.id.ok);
        ok.setOnClickListener(this);

        Usertext=findViewById(R.id.username);
        loginText=findViewById(R.id.loginText);


    }

    public void onClick(View v) {
        Intent intent;
        app=(NewsListApplication) getApplicationContext();
       String username = app.getUsername();
       Usertext.setText(username);
      loginText.setText(loginText.getText().toString()+" "+username);
        switch (v.getId()){
            case R.id.ok:
                intent = new Intent(this, NewsActivity.class);
                startActivity(intent);
                break;


        }
    }
}
