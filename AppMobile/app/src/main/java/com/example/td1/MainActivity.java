package com.example.td1;

import android.annotation.SuppressLint;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.TextureView;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.mariuszgromada.math.mxparser.Expression;

import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

   private TextView nombre;
   private TextView resultat;
    private Expression expression;
    private double variable;
    private Button buttonAdd,buttonSoust,buttonMul,buttonDiv,buttonEqalite, button1, button2, button3, button4, button5, button6, button7, button8,button9;


    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonAdd=findViewById(R.id.buttonAdd);
        buttonSoust=findViewById(R.id.buttonSoust);
        buttonMul=findViewById(R.id.buttonMul);
        buttonDiv=findViewById(R.id.buttonDiv);
        buttonEqalite=findViewById(R.id.buttonEgalite);

        button1=findViewById(R.id.button1);
        button2=findViewById(R.id.button2);
        button3=findViewById(R.id.button3);
        button4=findViewById(R.id.button4);
        button5=findViewById(R.id.button5);
        button6=findViewById(R.id.button6);
        button7=findViewById(R.id.button7);
        button8=findViewById(R.id.button8);
        button9=findViewById(R.id.button9);

        buttonAdd.setOnClickListener(this);
        buttonSoust.setOnClickListener(this);
        buttonMul.setOnClickListener(this);
        buttonDiv.setOnClickListener(this);
        buttonEqalite.setOnClickListener(this);



        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);


        nombre=findViewById(R.id.Nombre);
        nombre.setText("");
        resultat=findViewById(R.id.resultat);
        resultat.setText("0");
        expression=new Expression(nombre.getText().toString());

    }
    public void onClick(View v) {

        Button buttonClick=findViewById(v.getId());
        if(v.getId()==R.id.buttonEgalite){

            nombre.setText(Double.toString(variable));

        }
        else {
            nombre.setText(nombre.getText()+buttonClick.getText().toString());
        }


        if(nombre.getText().toString().isEmpty()){
            expression.setExpressionString("0");
        }
        else{
            expression.setExpressionString(nombre.getText().toString());
        }
        variable = expression.calculate();
        resultat.setText(Double.toString(variable));
    }




}
