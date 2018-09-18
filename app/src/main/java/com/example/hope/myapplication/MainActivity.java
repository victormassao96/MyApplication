package com.example.hope.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button submitButton;
    EditText nameEditText, emailEditText, postalAddressEditText, phoneNumberEditText, nextOfKinEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        submitButton = findViewById(R.id.submitButton);
        nameEditText = findViewById(R.id.nameEditText);
        emailEditText = findViewById(R.id.emailEditText);
        postalAddressEditText = findViewById(R.id.postalAddressEditText);
        phoneNumberEditText = findViewById(R.id.phoneNumberEditText);
        nextOfKinEditText = findViewById(R.id.nextOfKinEditText);

        nameEditText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean hasFocus) {

                if(view instanceof EditText && !hasFocus ) {
                    String value = nameEditText.getText().toString();

                    if(value.equalsIgnoreCase("")) {
                        nameEditText.setError("Name field is required");
                        return;
                    }

                    if(!value.matches("([A-Za-z])+\\s+([A-Za-z])+")) {
                        nameEditText.setError("At least two names are required");
                        return;
                    }
                }

            }
        });

        emailEditText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean hasFocus) {

                if(view instanceof EditText && !hasFocus ) {
                    String value = emailEditText.getText().toString();

                    if(value.equalsIgnoreCase("")) {
                        emailEditText.setError("Email field is required");
                        return;
                    }

                    if(!value.matches("^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+$")) {
                        emailEditText.setError("Please enter valid email address");
                        return;
                    }
                }

            }
        });
        phoneNumberEditText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean hasFocus) {

                if(view instanceof EditText && !hasFocus ) {
                    String value = phoneNumberEditText.getText().toString();

                    if(value.equalsIgnoreCase("")) {
                        phoneNumberEditText.setError("Your phone number field is required");
                        return;
                    }


                }

            }
        });
        postalAddressEditText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean hasFocus) {

                if(view instanceof EditText && !hasFocus ) {
                    String value = postalAddressEditText.getText().toString();

                    if(value.equalsIgnoreCase("")) {
                        postalAddressEditText.setError("Your postal address field is required");
                        return;
                    }


                }

            }
        });
        nextOfKinEditText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean hasFocus) {

                if(view instanceof EditText && !hasFocus ) {
                    String value = nextOfKinEditText.getText().toString();

                    if(value.equalsIgnoreCase("")) {
                        nextOfKinEditText.setError("Your next of kin field is required");
                    }

                }

            }
        });


        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, PersonalDetailsActivity.class);

                intent.putExtra("name", nameEditText.getText().toString());
                intent.putExtra("email", emailEditText.getText().toString());
                intent.putExtra("postalAddress", postalAddressEditText.getText().toString());
                intent.putExtra("phoneNumber", phoneNumberEditText.getText().toString());
                intent.putExtra("nextOfKin", nextOfKinEditText.getText().toString());

                startActivity(intent);


            }

        });
    }


}
