package com.example.ui_matrix;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.Toast;

public class polygon_profile extends AppCompatActivity {


    private ImageView serch_icn,more_icn,back2_icn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_polygon_profile);
        binding();

        Window window = getWindow();
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(ContextCompat.getColor(this,R.color.blue));
//            super.onCreate(savedInstanceState);
//            setContentView(R.layout.activity_polygon_profile);
//            getActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#1c2833")));
//        int res = getResources().getIdentifier(imagename, "drawable", this.getPackageName());
//        imageview= (ImageView)findViewById(R.id.imageView);
//        imageview.setImageResource(res);

//        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.KITKAT) {
//            return;
//        }
//        mDecorView = getWindow().getDecorView();
//        mDecorView.setSystemUiVisibility(
//                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
//                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
//                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
//                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION // hide nav bar
//                        | View.SYSTEM_UI_FLAG_FULLSCREEN // hide status bar
//                        | View.SYSTEM_UI_FLAG_IMMERSIVE);

        serch_icn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(polygon_profile.this, "Search", Toast.LENGTH_SHORT).show();
            }
        });
        more_icn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(polygon_profile.this, "Setting", Toast.LENGTH_SHORT).show();
            }
        });
        back2_icn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(polygon_profile.this , profile_selection.class);
                startActivity(intent);
            }
        });
    }

    private void binding(){
        serch_icn = (ImageView) findViewById(R.id.serch_icn);
        more_icn = (ImageView) findViewById(R.id.more_icn);
        back2_icn = (ImageView) findViewById(R.id.back2_icn);
    }
}