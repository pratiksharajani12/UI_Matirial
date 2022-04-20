package com.example.ui_matrix;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.Toast;

public class red_profile extends AppCompatActivity {
    private ImageView serch1_icn,more1_icn,back3_icn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_red_profile);

        binding();


        Window window = getWindow();
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(ContextCompat.getColor(this,R.color.pink));

        serch1_icn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(red_profile.this, "Search", Toast.LENGTH_SHORT).show();
            }
        });
        more1_icn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(red_profile.this, "Setting", Toast.LENGTH_SHORT).show();
            }
        });
        back3_icn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(red_profile.this, profile_selection.class);
                startActivity(intent);
            }
        });


    }
    private void binding(){
        serch1_icn = (ImageView) findViewById(R.id.serch1_icn);
        more1_icn = (ImageView) findViewById(R.id.more1_icn);
        back3_icn = (ImageView) findViewById(R.id.back3_icn);
    }
}