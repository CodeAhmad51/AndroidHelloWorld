package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button loginButton , signupButton , gamingButton;
    EditText username , password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginButton = findViewById(R.id.login_button);
        signupButton = findViewById(R.id.sign_in);
        gamingButton = findViewById(R.id.Game);


        username = findViewById(R.id.name_edit_text);
        password = findViewById(R.id.password);


        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(username.getText().length() == 0 || password.getText().length() == 0){
                    Toast.makeText(getApplicationContext(), "Please enter username & password", Toast.LENGTH_SHORT).show();
                }else{
                    String name = username.getText().toString();

                    Toast.makeText(getApplicationContext(), name + " logged in", Toast.LENGTH_SHORT).show();

                    Intent i = new Intent(getApplicationContext(), HomePage.class);
                    startActivity(i);

                }

            }
        });

        signupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = username.getText().toString();
                Toast.makeText(getApplicationContext(), name + " SignUp Success", Toast.LENGTH_SHORT).show();
                Intent j = new Intent(getApplicationContext(), WelcomePage.class);
                startActivity(j);
            }
        });
        gamingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j = new Intent(getApplicationContext(),Gaming.class);
                startActivity(j);

            }
        });

    }
}