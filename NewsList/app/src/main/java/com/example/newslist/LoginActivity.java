package com.example.newslist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG ="NewsList " ;
    private EditText usernameEdit;
    private Button buttonlogin;
     NewsListApplication app;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonlogin=findViewById(R.id.login);
        buttonlogin.setOnClickListener(this);

        usernameEdit= findViewById(R.id.username);
    }

    @Override
    public void onClick(View v) {
        Intent intent;
        app=(NewsListApplication) getApplicationContext();
        app.setUsername(usernameEdit.getText().toString());
        switch (v.getId()){
            case R.id.login:
                intent=new Intent(getApplicationContext(),NewsActivity.class);
                //intent = new Intent(this, NewsActivity.class);
                intent.putExtra("username",usernameEdit.getText().toString());
                startActivity(intent);
             break;

        }

    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
    //@Override
   /* protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "terminaison de l'activité " + getLocalClassName());


    }*/
}
