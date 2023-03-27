package com.example.university;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;

public class AddUserActivity extends AppCompatActivity {
    private EditText firstname;
    private EditText lastname;
    private EditText email;
    private String Degreeprogram;

    private int image;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_user);

        firstname = findViewById(R.id.firstName);
        lastname = findViewById((R.id.lastName));
        email = findViewById(R.id.email);




    }
    public void addUser(View view){

        RadioGroup RGDegreeProgram = findViewById(R.id.RGDegreeProgram);
        RadioGroup RGimage = findViewById(R.id.RGimage);

        switch (RGDegreeProgram.getCheckedRadioButtonId()) {

            case R.id.rbLate:
                Degreeprogram = "Laskennallinen tekniikka";
                break;

            case R.id.rbSahko:
                Degreeprogram = "Sähkötekniikka";
                break;
            case R.id.rbTuta:
                Degreeprogram = "Tuotantotalous";
                break;
            case R.id.rbTite:
                Degreeprogram = "Tietotekniikka";
                break;
        }

        switch (RGimage.getCheckedRadioButtonId()){

            case R.id.rbAku1:
                image = R.drawable.aku;
                break;

            case R.id.rbRicardo:
                image =R.drawable.ricardo_milos;
                break;
            case R.id.rbHessu:
                image = R.drawable.gooby;
                break;

        }



        String lastName = String.valueOf(lastname.getText());

        String firstName = String.valueOf(firstname.getText());
        String emaill = String.valueOf(email.getText());
        User user = new User(firstName,lastName,emaill,Degreeprogram, image);
        UserStorage.getInstance().addUser(user);


        }

    }
