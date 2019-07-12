package com.mounika.midterm.adminportal;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class ViewLocationFragment extends Fragment {
    View root;
    GoogleMap gMap;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        root = inflater.inflate(R.layout.fragment_view_location, container, false);

        SupportMapFragment mapFragment = (SupportMapFragment) getChildFragmentManager().findFragmentById(R.id.mapFragment);
        mapFragment.getMapAsync(new OnMapReadyCallback() {
            @Override
            public void onMapReady(GoogleMap googleMap) {
                gMap = googleMap;

                LatLng latLng = new LatLng(47.6062095, -122.3320708);
                gMap.addMarker(new MarkerOptions().position(latLng).title("Seattle"));
                gMap.moveCamera(CameraUpdateFactory.newLatLng(latLng));
                gMap.setMinZoomPreference(5);
                gMap.setMaxZoomPreference(20);
            }
        });

        return root;
    }
}
