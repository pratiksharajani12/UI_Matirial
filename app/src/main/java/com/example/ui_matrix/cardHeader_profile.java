package com.example.ui_matrix;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.Toast;

public class cardHeader_profile extends AppCompatActivity {
private ImageView serch3_icn,more4_icn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_header_profile);

        binding();

        Window window = getWindow();
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(ContextCompat.getColor(this,R.color.grreen));


        serch3_icn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(cardHeader_profile.this, "Search", Toast.LENGTH_SHORT).show();
            }
        });
        more4_icn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(cardHeader_profile.this, "Settings", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void binding() {

        serch3_icn =(ImageView) findViewById(R.id.serch3_icn);
        more4_icn =(ImageView) findViewById(R.id.more4_icn);
    }
}