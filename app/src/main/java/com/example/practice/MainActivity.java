package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView title;
    private EditText password;
    private EditText email;
    private Button signIn;
    private Button signUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        title=findViewById(R.id.title);
        password=findViewById(R.id.password);
        email=findViewById(R.id.email);
        signIn=findViewById(R.id.signIn);
        signUp=findViewById(R.id.signUp);
        signUp.setOnClickListener(this);
        signIn.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if (view == signIn && email.getText().toString().contains("@") && email.getText().toString().contains(".com") && password.getText().toString().length()>5){
            Intent i= new Intent(this, homeActivity.class);
            i.putExtra("email", email.getText().toString());
             startActivity(i);}
        if (view== signUp){
            Intent i= new Intent(this, SignUpActivity.class);
            startActivity(i);
        }
    }

}