package com.example.clasepractica1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnHolaMundo = (Button) findViewById(R.id.btnHolaMundo);

        btnHolaMundo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                EditText txtName = (EditText) findViewById(R.id.txtName);
                System.out.println("Hola " + txtName.getText() + "!!!");
            }
        });
    }
}