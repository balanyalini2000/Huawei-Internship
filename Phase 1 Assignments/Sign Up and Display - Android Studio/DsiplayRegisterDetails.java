package com.example.firstapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayRegisterDetails extends AppCompatActivity {

    public static final String NAME = "NAME";
    public static final String AGE = "AGE";
    public static final String EMAIL = "EMAIL";
    public static final String PHONE = "PHONE";
    public static final String BIO = "BIO";
    public static final String ADDRESS = "ADDRESS";
    private TextView nameText, ageText, emailText, addressText, phoneText, bioText;
    private String name, email, phone, address, bio;
    private int age;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_register_details);
        nameText = findViewById(R.id.mName);
        ageText = findViewById(R.id.mAge);
        emailText = findViewById(R.id.mEmail);
        phoneText = findViewById(R.id.mPhone);
        bioText = findViewById(R.id.mBio);
        addressText = findViewById(R.id.mAddress);
        Intent i = getIntent();
        name = i.getStringExtra(NAME);
        age = i.getIntExtra(AGE,0);
        email = i.getStringExtra(EMAIL);
        phone = i.getStringExtra(PHONE);
        bio = i.getStringExtra(BIO);
        address = i.getStringExtra(ADDRESS);

        nameText.setText("NAME: " + name);
        ageText.setText("AGE: " + age);
        emailText.setText("EMAIL: " + email);
        phoneText.setText("PHONE: " + phone);
        bioText.setText("BIO: " + bio);
        addressText.setText("ADDRESS: " + address);
    }
}