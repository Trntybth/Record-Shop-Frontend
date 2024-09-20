package com.northcoders.record_shop_application.ui.mainactivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.northcoders.api_new_project.R;
import com.northcoders.api_new_project.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Set up data binding
//        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
//
//        // Set up RecyclerView
//        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
//        AlbumAdapter adapter = new AlbumAdapter(albumList); // Pass in your album data
//        binding.recyclerView.setAdapter(adapter);
    }
}