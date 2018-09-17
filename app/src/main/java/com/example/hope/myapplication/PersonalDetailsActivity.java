package com.example.hope.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class PersonalDetailsActivity extends AppCompatActivity {

    TextView nameTextView,emailTextView,postalAddressTextView,phoneNumberTextView,nextOfKinTextView;
    String name,email,postalAddress,phoneNumber,nextOfKin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.personal_details);

        nameTextView = findViewById(R.id.nameTextView);
        emailTextView = findViewById(R.id.emailTextView);
        postalAddressTextView = findViewById(R.id.postalAddressTextView);
        phoneNumberTextView = findViewById(R.id.phoneNumberTextView);
        nextOfKinTextView = findViewById(R.id.nextOfKinTextView);

        name = getIntent().getExtras().getString("name");
        email = getIntent().getExtras().getString("email");
        postalAddress = getIntent().getExtras().getString("postalAddress");
        phoneNumber = getIntent().getExtras().getString("phoneNumber");
        nextOfKin = getIntent().getExtras().getString("nextOfKin");

        nameTextView.setText(name);
        emailTextView.setText(email);
        postalAddressTextView.setText(postalAddress);
        phoneNumberTextView.setText(phoneNumber);
        nextOfKinTextView.setText(nextOfKin);

    }
}
