package com.example.unitconvertor;

import static android.widget.Toast.makeText;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private EditText editTextNumberDecimal;
    private TextView textView4;

    public MainActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        editTextNumberDecimal = findViewById(R.id.editTextNumberDecimal);
        textView4 = findViewById(R.id.textView4);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                
                String s = editTextNumberDecimal.getText().toString();
                int kg = Integer.parseInt(s);
                double pound = 2.20462262 * kg;
                textView4.setText("THE CORRESPONDING VALUE IN POUNDS IS   "  +  pound);
               // makeText(MainActivity.this, "hi", Toast.LENGTH_SHORT).show();
               //String msg = "KG --> LB BY SYED AQARIB ALI";
                //Toast.makeText(MainActivity.this,
                      //   msg, Toast.LENGTH_SHORT).show();


            }
        });


    }
}