package com.mounika.midterm.adminportal;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView signIn, signUp;
    FrameLayout frameLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        signIn = findViewById(R.id.singInText);
        signUp = findViewById(R.id.singUpText);
        frameLayout = findViewById(R.id.frameLayout);
        replaceFragment(new SignInFragment());
        signIn.setTextColor(getResources().getColor(android.R.color.darker_gray));
        signUp.setTextColor(getResources().getColor(android.R.color.white));

        signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signIn.setTextColor(getResources().getColor(android.R.color.darker_gray));
                signUp.setTextColor(getResources().getColor(android.R.color.white));

                replaceFragment(new SignInFragment());
            }
        });

        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signIn.setTextColor(getResources().getColor(android.R.color.white));
                signUp.setTextColor(getResources().getColor(android.R.color.darker_gray));

                replaceFragment(new SignUpFragment());
            }
        });
    }

    private void replaceFragment(Fragment fragment) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frameLayout, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }
}
