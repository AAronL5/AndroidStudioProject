package com.example.katlendar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView username =(TextView) findViewById(R.id.email);
        TextView password =(TextView) findViewById(R.id.password);

        Button loginbtn = (Button) findViewById(R.id.loginbtn);
        TextView btn = findViewById(R.id.SignUpBtn);
        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                startActivity(new Intent(MainActivity.this, RegisterScreen.class));
            }
        });

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(username.getText().toString().equals("admin") && password.getText().toString().equals("admin")){
                    //correct
                    Toast.makeText(MainActivity.this,"LOGIN SUCCESSFUL",Toast.LENGTH_SHORT).show();
                }else
                    //incorrect
                    Toast.makeText(MainActivity.this,"LOGIN FAILED",Toast.LENGTH_SHORT).show();

            }
        });
    }
}