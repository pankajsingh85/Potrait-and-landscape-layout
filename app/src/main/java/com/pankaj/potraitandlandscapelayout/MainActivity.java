package com.pankaj.potraitandlandscapelayout;

import androidx.appcompat.app.AppCompatActivity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn=(Button)findViewById(R.id.btnShowToast);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(getResources().getConfiguration().orientation== Configuration.ORIENTATION_PORTRAIT) {
                    Toast.makeText(MainActivity.this, "we are in portrait mode", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(MainActivity.this, "we are in landscape mode", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}