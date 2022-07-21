package com.example.ctatracker;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    int c = 3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        //onClick();
    }

    public void onClick(View view) {

        System.out.print("Drew S");
        String uname = "asnarski1@hawk.iit.edu", pass = "password";
        EditText name, word;
        name = findViewById(R.id.textUserName);
        word = findViewById(R.id.textPassword);
        boolean isValid = Utils.checkEmailForValidity(name.toString());
        if((uname.equals(name.getText().toString()) && (pass.equals(word.getText().toString())))){
            Toast t = Toast.makeText(getApplicationContext(), "Redirecting...", Toast.LENGTH_SHORT);
            t.show();
            Intent i = new Intent(this, MainActivity.class);
            startActivity(i);
        }
        else{
            showMessage();
            c--;
        }

    }


    public void showMessage() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle("Password Tries remaining");
        builder.setMessage("Tries left => " + c);
        builder.show();
    }


}