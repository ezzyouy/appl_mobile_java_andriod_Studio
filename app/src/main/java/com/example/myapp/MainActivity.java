package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.constraint_layout);

        Button reset= findViewById(R.id.button2);
        Button somme= findViewById(R.id.button);
        EditText txt1= findViewById(R.id.editTextText1);
        EditText txt2= findViewById(R.id.editTextText2);
        EditText txt3= findViewById(R.id.editText3);

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt1.setText("");
                txt2.setText("");
                txt3.setText("");
            }
        });
        somme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                somme(view);
            }
        });
    }

    public void somme(View view){
        EditText Etxt1= findViewById(R.id.editTextText1);
        EditText Etxt2= findViewById(R.id.editTextText2);
        EditText result= findViewById(R.id.editText3);

        Double n1=Double.parseDouble(Etxt1.getText().toString());
        Double n2=Double.parseDouble(Etxt2.getText().toString());
        int res= (int) (n1+n2);
        result.setText(String.valueOf(res));

    }

}