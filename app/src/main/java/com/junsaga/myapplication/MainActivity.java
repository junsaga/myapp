package com.junsaga.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.junsaga.myapplication.adapter.MapAdapter;
import com.junsaga.myapplication.api.MapApi;
import com.junsaga.myapplication.api.NetworkClient;
import com.junsaga.myapplication.model.Address;
import com.junsaga.myapplication.model.AddressList;
import com.naver.maps.map.NaverMapSdk;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    MapAdapter adapter;
    ArrayList<Address> addressArrayList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));

//        NaverMapSdk.getInstance(this).setClient(
//                new NaverMapSdk.NaverCloudPlatformClient("1npnqdm1vz"));

        Retrofit retrofit = NetworkClient.getRetrofitClient(MainActivity.this);
        MapApi api = retrofit.create(MapApi.class);

        Call<AddressList> call = api.getStaticMap()

        );

    }
}