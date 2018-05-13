package com.bhargav.taxinn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Portal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portal);
    }
    public void img1(View view){
        Intent i = new Intent(this, First.class);
        startActivity(i);
    }
    public void img2(View view){
        Intent i = new Intent(this, Second.class);
        startActivity(i);
    }
    public void img3(View view){
        Intent i = new Intent(this, Third.class);
        startActivity(i);
    }
    public void img4(View view){
        Intent i = new Intent(this, Fourth.class);
        startActivity(i);
    }
}
