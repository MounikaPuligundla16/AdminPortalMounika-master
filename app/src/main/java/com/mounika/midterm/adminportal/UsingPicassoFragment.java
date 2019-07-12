package com.mounika.midterm.adminportal;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class UsingPicassoFragment extends Fragment {
    View root;
    ImageView imageView;
    TextView imageText;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        root = inflater.inflate(R.layout.fragment_picasso, container, false);

        imageView = root.findViewById(R.id.picassoImage);
        imageText = root.findViewById(R.id.imageText);
        Picasso.with(root.getContext())
                .load("https://echoesglobaleducation.com/wp-content/uploads/2017/09/Australia-is-the-New-Hot-Destination-for-Indian-Students.jpg")
                .placeholder(R.drawable.ic_person_black_24dp)
                .into(imageView);
        imageText.setText("Students");

        return root;
    }
}
