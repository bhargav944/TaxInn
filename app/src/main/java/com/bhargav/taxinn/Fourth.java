package com.bhargav.taxinn;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Fourth extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
    }
    public void img1(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://reg.gst.gov.in/registration/"));
        startActivity(intent);
    }
    public void img2(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://services.gst.gov.in/services/login"));
        startActivity(intent);
    }
    public void img3(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://services.gst.gov.in/services/gstlaw/gstlawlist"));
        startActivity(intent);
    }
    public void img4(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://services.gst.gov.in/services/quicklinks/services"));
        startActivity(intent);
    }
    public void img5(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://services.gst.gov.in/services/ewaybill/ewaybillsystem"));
        startActivity(intent);
    }
    public void img6(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.gst.gov.in/       "));
        startActivity(intent);
    }
}
