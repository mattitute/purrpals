package com.example.purrpalsapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;


public class fragment_editProfile extends Fragment {


    private ImageView userImageView;
    private EditText editUsername;
    private EditText editBirthdate;
    private EditText editPhone;
    private EditText editEmail;
    private EditText editPassword;
    private Button saveProfileButton;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_edit_profile, container, false);

        userImageView = view.findViewById(R.id.userImageView);
        editUsername = view.findViewById(R.id.editUsername);
        editBirthdate = view.findViewById(R.id.editBirthdate);
        editPhone = view.findViewById(R.id.editPhone);
        editEmail = view.findViewById(R.id.editEmail);
        editPassword = view.findViewById(R.id.editPassword);
        saveProfileButton = view.findViewById(R.id.saveProfileButton);


        saveProfileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveProfile();
            }
        });

        userImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // allow user add new user icon
            }
        });

        return view;

    }

    private void saveProfile() {
        String username = editUsername.getText().toString().trim();
        String birthdate = editBirthdate.getText().toString().trim();
        String phone = editPhone.getText().toString().trim();
        String email = editEmail.getText().toString().trim();
        String password = editPassword.getText().toString().trim();


        // To Do: write logic to put the edited data in to database
        //        check if user made changes to field(entered anything), if so update database
        //        if user inputs are same as before, return error and don't change database


        Toast.makeText(getContext(), "Profile saved", Toast.LENGTH_SHORT).show();
    }
}
