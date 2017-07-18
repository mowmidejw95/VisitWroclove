package com.example.dawid.visitwroclove.view.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;


import com.example.dawid.visitwroclove.DAO.implementation.ObjectDAOImpl;
import com.example.dawid.visitwroclove.R;
import com.example.dawid.visitwroclove.model.AddressDTO;
import com.example.dawid.visitwroclove.model.ObjectDTO;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;



public class MainPanelActivity extends Activity {

    private String mLog = MainPanelActivity.class.getName();
    @BindView(R.id.ll_map)
    public LinearLayout mpa_ll_map;
    @BindView(R.id.ll_events)
    public LinearLayout mpa_ll_events;
    @BindView(R.id.ll_places)
    public LinearLayout mpa_ll_places;
    @BindView(R.id.ll_tracks)
    public LinearLayout mpa_ll_tracks;

    private ObjectDAOImpl mRepo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_panel);
        ButterKnife.bind(this);
        Log.d(mLog, "MainPanelActivity.onCreate()");

        mRepo = new ObjectDAOImpl();
        scripts();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(mLog, "MainPanelActivity.onResume()");
    }

    @OnClick(R.id.ll_map)
    public void showMapActivity() {
        Intent intent = new Intent(getApplicationContext(), MapActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.ll_places)
    public void showPlacesActivity() {
        Intent intent = new Intent(getApplicationContext(), PlacesActivity.class);
        startActivity(intent);
    }


    private void scripts(){
        ObjectDTO objectDTO = new ObjectDTO();
        objectDTO.setId(0);
        objectDTO.setFavourite(true);
        objectDTO.setName("Ratusz Wrocławski");
        objectDTO.setDescription("Budynek gdzie mieści się starostwo miasta Wrocław.");
        objectDTO.setPhone("42 455 34 43");
        objectDTO.setRank(7.53);
        objectDTO.setType("building");
        objectDTO.setImage("https://upload.wikimedia.org/wikipedia/commons/5/52/2017_Ratusz_Staromiejski_we_Wroc%C5%82awiu_01.jpg");
        AddressDTO addressDTO = new AddressDTO();
        addressDTO.setId(0);
        addressDTO.setCity("Wrocław");
        addressDTO.setStreet("Rynek");
        addressDTO.setHomeNumber("19");
        addressDTO.setLat("51.109678");
        addressDTO.setLng("17.031879");
        objectDTO.setAddress(addressDTO);
        mRepo.add(objectDTO);

        ObjectDTO objectDTO1 = new ObjectDTO();
        objectDTO1.setId(1);
        objectDTO1.setFavourite(true);
        objectDTO1.setName("Hala Stulecia");
        objectDTO1.setDescription("Odbywają się w niej liczbne wydarzenia kulturalne.");
        objectDTO1.setPhone("42 455 34 43");
        objectDTO1.setRank(9.53);
        objectDTO1.setType("building");
        objectDTO1.setImage("https://upload.wikimedia.org/wikipedia/commons/0/06/Wroc%C5%82aw_-_Jahrhunderthalle1.jpg");
        AddressDTO addressDTO1 = new AddressDTO();
        addressDTO1.setId(1);
        addressDTO1.setCity("Wrocław");
        addressDTO1.setStreet("Biskupin");
        addressDTO1.setHomeNumber("14");
        addressDTO1.setLat("51.106586");
        addressDTO1.setLng("17.077028");
        objectDTO1.setAddress(addressDTO1);
        mRepo.add(objectDTO1);
    }
}
