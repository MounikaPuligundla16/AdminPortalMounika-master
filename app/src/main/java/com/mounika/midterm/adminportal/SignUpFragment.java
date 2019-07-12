package com.mounika.midterm.adminportal;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.AppCompatButton;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

public class SignUpFragment extends Fragment {
    View root;
    EditText name, username, password, retypePwd;
    AppCompatButton signUp;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        root = inflater.inflate(R.layout.fragment_sign_up, container, false);

        name = root.findViewById(R.id.name);
        username = root.findViewById(R.id.username);
        password = root.findViewById(R.id.password);
        retypePwd = root.findViewById(R.id.reTypePassword);
        signUp = root.findViewById(R.id.signUp);

        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(root.getContext(), HomeActivity.class);
                intent.putExtra("Username", name.getText().toString());
                startActivity(intent);
            }
        });

        return root;
    }
}
