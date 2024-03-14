package com.example.api_application;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.toolbox.StringRequest;

public class Api_calling extends AppCompatActivity {


    EditText   editText;
    EditText editText2;
    Button button;
    TextView textView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.api_calling_activity);


        editText = findViewById(R.id.editText_1);
        editText2= findViewById(R.id.editText_2);
        button= findViewById(R.id.btn_submit);
        textView= findViewById(R.id.textview);

    //Button Calling
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Api calling Method
                processdata(editText.getText().toString(),editText2.getText().toString());


            }
        });

    }

    public void processdata(final String name, final String email)
    {


    }
}