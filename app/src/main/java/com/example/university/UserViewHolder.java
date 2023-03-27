package com.example.university;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class UserViewHolder extends RecyclerView.ViewHolder {
    ImageView imageView;
    TextView firstNameView;
    TextView lastNameView;
    TextView emailView;
    TextView degreeprogramView;

    public UserViewHolder(@NonNull View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.imageView);
        firstNameView =itemView.findViewById(R.id.firstnameView);
        lastNameView = itemView.findViewById((R.id.lastnameView));
        emailView =itemView.findViewById(R.id.emailView);
        degreeprogramView = itemView.findViewById(R.id.degreeprogramView);


    }
}
