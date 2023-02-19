package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SignUpActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText email;
    private EditText pass;
    private EditText name;
    private Button submit;
    private TextView title;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_up_activity);
        title=findViewById(R.id.title);
        pass=findViewById(R.id.password);
        email=findViewById(R.id.email);
        name=findViewById(R.id.name);
        submit.findViewById(R.id.submit);
        submit.setOnClickListener(this);
    }
    public void onClick(View view) {
        if (view== submit){
            Intent i= new Intent(this, SignUpActivity.class);
            i.putExtra("email", email.getText().toString());
            startActivity(i);
        }
    }

}