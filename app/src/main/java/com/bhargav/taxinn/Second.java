package com.bhargav.taxinn;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Second extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }
    public void img1(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.incometaxindia.gov.in/Pages/tax-services.aspx"));
        startActivity(intent);
    }
    public void img2(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://onlineservices.tin.egov-nsdl.com/etaxnew/tdsnontds.jsp"));
        startActivity(intent);
    }
    public void img3(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.incometaxindia.gov.in/pages/domestic-company-specific-content.aspx"));
        startActivity(intent);
    }
    public void img4(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.incometaxindia.gov.in/Pages/Tax-helpline.aspx"));
        startActivity(intent);
    }
    public void img5(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.incometaxindia.gov.in/Pages/tps/ask-it.aspx"));
        startActivity(intent);
    }
    public void img6(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.incometaxindia.gov.in/Pages/default.aspx"));
        startActivity(intent);
    }
}
