package com.example.university;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class UserViewAdapter extends RecyclerView.Adapter<UserViewHolder> {

    private Context context;
    private ArrayList<User> users = new ArrayList<>();

    public UserViewAdapter(Context context, ArrayList<User> users) {
        this.context = context;
        this.users = users;
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new UserViewHolder(LayoutInflater.from(context).inflate(R.layout.user_view, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
        holder.firstNameView.setText(users.get(position).getFirstName());
        holder.lastNameView.setText(users.get(position).getLastName());
        holder.emailView.setText(users.get(position).getEmail());
        holder.degreeprogramView.setText(users.get(position).getDegreeProgram());
        holder.imageView.setImageResource(users.get(position).getImage());


    }

    @Override
    public int getItemCount() {
        return users.size();
    }
}
