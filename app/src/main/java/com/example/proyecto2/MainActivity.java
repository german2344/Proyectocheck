package com.example.proyecto2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText val1,val2;
    private RadioButton radi1,radi2;
    private TextView tex1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        val1=findViewById(R.id.val1);
        val2=findViewById(R.id.val2);
        radi1=findViewById(R.id.radi1);
        radi2=findViewById(R.id.radi2);
        tex1=findViewById(R.id.tex1);
    }
    public void click (View R){
        String dd=val1.getText().toString();
        String ee=val2.getText().toString();
        int v1=Integer.parseInt(dd);
        int v2=Integer.parseInt(ee);
        if(radi1.isChecked()){
           int suma=v1+v2;
            tex1.setText("la suma es" +suma);
        } else if (radi2.isChecked()) {
            int resta=v1-v2;
            tex1.setText("la resta es" +resta);
        }

    }

}