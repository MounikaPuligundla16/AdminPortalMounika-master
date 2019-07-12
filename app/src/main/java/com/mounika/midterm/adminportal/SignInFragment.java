package com.mounika.midterm.adminportal;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.AppCompatButton;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;

public class SignInFragment extends Fragment {
    View root;
    EditText username, password;
    AppCompatButton signIn;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        root = inflater.inflate(R.layout.fragment_sign_in, container, false);

        username = root.findViewById(R.id.username);
        password = root.findViewById(R.id.password);
        signIn = root.findViewById(R.id.signIn);

        signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (username.getText().toString().equals("test") && password.getText().toString().equals("test123")) {
                    startActivity(new Intent(root.getContext(), HomeActivity.class));
                } else {
                    Toast.makeText(root.getContext(), "invalid username/password", Toast.LENGTH_SHORT).show();
                }
            }
        });


        return root;
    }
}
