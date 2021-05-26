package com.example.test01;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;


public class BlankFragment extends Fragment {
    public BlankFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank, container, false);
    }
    GoogleMap map;
    MapView miMapa;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        miMapa = view.findViewById(R.id.mapViewP);
        miMapa.onCreate(null);
        miMapa.onResume();
        miMapa.getMapAsync((OnMapReadyCallback) this);
    }

    @Override
    public void onCreate(@Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }



    // @Override
    public void onMapReady(GoogleMap googleMap) {
        MapsInitializer.initialize(getContext());
        map = googleMap;
        //puntos GO VEGAN
        LatLng restaurantSoju = new LatLng(-33.4381297,-70.6487444);
       // map.addMarker(new MarkerOptions().position(restaurantSoju).title("Restaurant Soju Vegano Vegetariano").snippet("Dirección: Merced 821, 17, Santiago, Región Metropolitana").icon(BitmapDescriptorFactory.fromResource(R.drawable.)));
        //Centrar Mapa
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(restaurantSoju, 11));
    }
}