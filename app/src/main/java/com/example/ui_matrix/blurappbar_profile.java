package com.example.ui_matrix;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.Toast;

public class blurappbar_profile extends AppCompatActivity {

    private ImageView more3_icn,serch2_icn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blurappbar_profile);

        binding();

        Window window = getWindow();
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(ContextCompat.getColor(this,R.color.dblue));

        more3_icn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(blurappbar_profile.this, "Settings", Toast.LENGTH_SHORT).show();
            }
        });
        serch2_icn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(blurappbar_profile.this, "Search", Toast.LENGTH_SHORT).show();
            }
        });

    }
    private void binding(){
        more3_icn = findViewById(R.id.more3_icn);
        serch2_icn = findViewById(R.id.serch2_icn);
    }
}
