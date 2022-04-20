package com.example.ui_matrix;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

public class profile_selection extends AppCompatActivity {

    private ImageView polygon_pfl,red_pfl,blurappbar_prf,fabmenu_pfl,cardheader_pfl,cardheder_img_pfl,cardovrlap_pfl,wallet_pfl,dark_pfl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_selection);
        binding();

        Window window = getWindow();
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(ContextCompat.getColor(this,R.color.dblue));

        polygon_pfl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(profile_selection.this , polygon_profile.class);
                startActivity(intent);
            }
        });
        red_pfl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(profile_selection.this , red_profile.class);
                startActivity(intent);
            }
        });
        blurappbar_prf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(profile_selection.this , blurappbar_profile.class);
                startActivity(intent);
            }
        });
        fabmenu_pfl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(profile_selection.this , fabmenu_profile.class);
                startActivity(intent);
            }
        });
        cardheader_pfl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(profile_selection.this , cardHeader_profile.class);
                startActivity(intent);
            }
        });
        cardheder_img_pfl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(profile_selection.this , cardheader_img.class);
                startActivity(intent);
            }
        });
        cardovrlap_pfl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(profile_selection.this ,cardovrlap_profile.class);
                startActivity(intent);
            }
        });
        wallet_pfl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(profile_selection.this ,wallet_profile.class);
                startActivity(intent);
            }
        });
        dark_pfl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(profile_selection.this ,drak_profile.class);
                startActivity(intent);
            }
        });


    }

    private  void binding(){
        polygon_pfl = (ImageView) findViewById(R.id.polygon_pfl);
        red_pfl = (ImageView) findViewById(R.id.red_pfl);
        blurappbar_prf = (ImageView) findViewById(R.id.blurappbar_prf);
        fabmenu_pfl = (ImageView) findViewById(R.id.fabmenu_pfl);
        cardheader_pfl = (ImageView) findViewById(R.id.cardheader_pfl);
        cardheder_img_pfl = (ImageView) findViewById(R.id.cardheder_img_pfl);
        cardovrlap_pfl = (ImageView) findViewById(R.id.cardovrlap_pfl);
        wallet_pfl = (ImageView) findViewById(R.id.wallet_pfl);
        dark_pfl = (ImageView) findViewById(R.id.dark_pfl);
    }
}