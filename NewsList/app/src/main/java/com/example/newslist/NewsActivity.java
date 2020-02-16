package com.example.newslist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class NewsActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "NewsList ";
    private Button details;
    private Button logout;
    private Button about;
    private TextView UserText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);

        details=findViewById(R.id.details);
        details.setOnClickListener(this);

        logout=findViewById(R.id.logout);
        logout.setOnClickListener(this);

        about=findViewById(R.id.about);
        about.setOnClickListener(this);

        UserText=findViewById(R.id.user);

       Intent  intent = getIntent();
        if (intent != null){
            if (intent.hasExtra("username")){
                UserText.setText(intent.getStringExtra("username"));
            }
        }
    }
    public void onClick(View v) {
        Intent intent;


        switch (v.getId()){
            case R.id.details:
                intent = new Intent(this, DetailsActivity.class);
                startActivity(intent);
              break;
            case R.id.logout:
                        intent = new Intent(this, LoginActivity.class);
                        startActivity(intent);
             break;
            case R.id.about:
                String url = "http://android.busin.fr/";
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
              break;

                }


    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
    /*@Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "terminaison de l'activité " + getLocalClassName());


    }*/
}




