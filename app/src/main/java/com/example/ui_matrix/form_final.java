package com.example.ui_matrix;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class form_final extends AppCompatActivity {

    private ImageView back1_icon,notification_img,setting_img,done_img,age_icn,gender_icn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_final);

        Window window = getWindow();

        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);

        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);

        window.setStatusBarColor(ContextCompat.getColor(this,R.color.plpl));

        binding();

        back1_icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(form_final.this , form_select.class);
                startActivity(intent);
                finish();
            }
        });

        notification_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(form_final.this, "Notifications", Toast.LENGTH_SHORT).show();
            }
        });

        done_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(form_final.this, "Done", Toast.LENGTH_SHORT).show();
            }
        });
        age_icn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(form_final.this, "Age", Toast.LENGTH_SHORT).show();
            }
        });
        gender_icn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(form_final.this, "Gender", Toast.LENGTH_SHORT).show();
            }
        });


//        <string name="edittext_hint"><font size="15">Hint here!</font></string>
//        email_edt.setHint(Html.fromHtml(
//                "<font size=\"5\">" +
//                        "<small>" + "E-mail" + "</small>" ));

    }
    private void binding(){
        back1_icon = (ImageView) findViewById(R.id.back1_icon);
        notification_img = (ImageView) findViewById(R.id.notification_img);
        setting_img = (ImageView) findViewById(R.id.setting_img);
        done_img = (ImageView) findViewById(R.id.done_img);
        age_icn = (ImageView) findViewById(R.id.age_icn);
        gender_icn = (ImageView) findViewById(R.id.gender_icn);

    }
}