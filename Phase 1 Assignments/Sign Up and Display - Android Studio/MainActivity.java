package com.example.firstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText nameText, ageText, emailText, phoneText, bioText, addressText;
    private Button button;
    private String name, phone, email, address, bio;
    private int age;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameText = findViewById(R.id.mName);
        ageText = findViewById(R.id.mAge);
        emailText = findViewById(R.id.mEmail);
        phoneText = findViewById(R.id.mPhone);
        bioText = findViewById(R.id.mBio);
        addressText = findViewById(R.id.mAddress);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name = nameText.getText().toString().trim();
                age = Integer.parseInt(ageText.getText().toString().trim());
                email = emailText.getText().toString().trim();
                phone = phoneText.getText().toString().trim();
                address = addressText.getText().toString().trim();
                bio = bioText.getText().toString().trim();

                boolean check = validateInfo(name, age, email, phone, bio, address);
                if(check == true){
                    Toast.makeText(getApplicationContext(), "Data is valid", Toast.LENGTH_SHORT).show();
                    sendData();
                }
                else {
                    Toast.makeText(getApplicationContext(), "Check info again", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    boolean isEmpty(EditText text) {
        CharSequence str = text.getText().toString();
        return TextUtils.isEmpty(str);
    }

    private Boolean validateInfo(String name, int age, String email, String phone, String bio, String address) {
        if(name.length()==0){
            nameText.requestFocus();
            nameText.setError("Enter name to register");
            return false;
        }
        else if (!name.matches("[a-zA-Z. ]+")){
            nameText.requestFocus();
            nameText.setError("Enter only alphabets");
            return false;
        }
        else if(email.length()==0){
            emailText.requestFocus();
            emailText.setError("Enter email to register");
            return false;
        }
        else if (!email.matches("[a-zA-Z0-9._]+@+[a-z]+\\.+[a-z]+")){
            emailText.requestFocus();
            emailText.setError("Enter valid email");
            return false;
        }
        else if(ageText == null){
            ageText.requestFocus();
            ageText.setError("Enter age to register");
            return false;
        }
        else if(phone.length()==0){
            phoneText.requestFocus();
            phoneText.setError("Enter phone number to register");
            return false;
        }
        else if(bio.length()==0){
            bioText.requestFocus();
            bioText.setError("Enter bio to register");
            return false;
        }
        else if(address.length()==0){
            addressText.requestFocus();
            addressText.setError("Enter address to register");
            return false;
        }
        else
            return true;
    }

    public void sendData(){

            Intent i = new Intent( MainActivity.this, DisplayRegisterDetails.class);
            i.putExtra(DisplayRegisterDetails.NAME, name);
            i.putExtra(DisplayRegisterDetails.AGE, age);
            i.putExtra(DisplayRegisterDetails.PHONE, phone);
            i.putExtra(DisplayRegisterDetails.EMAIL, email);
            i.putExtra(DisplayRegisterDetails.BIO, bio);
            i.putExtra(DisplayRegisterDetails.ADDRESS, address);
            startActivity(i);
        }
}
