package com.bhargav.taxinn;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class First extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
    }
    public void img1(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://portal.incometaxindiaefiling.gov.in/e-Filing/UserLogin/LoginHome.html"));
        startActivity(intent);
    }
    public void img2(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://portal.incometaxindiaefiling.gov.in/e-Filing/Registration/RegistrationHome.html"));
        startActivity(intent);
    }
    public void img3(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.onlineservices.nsdl.com/paam/endUserRegisterContact.html"));
        startActivity(intent);
    }
    public void img4(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://portal.incometaxindiaefiling.gov.in/e-Filing/Services/KnowYourPanLinkGS.html?lang=eng"));
        startActivity(intent);
    }
    public void img5(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://portal.incometaxindiaefiling.gov.in/e-Filing/Services/LinkAadhaarHome.html?lang=eng"));
        startActivity(intent);
    }
    public void img6(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://portal.incometaxindiaefiling.gov.in/e-Filing/UserLogin/LoginHome.html?nextPage=efileItr1&lang=eng"));
        startActivity(intent);
    }
    public void img7(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.incometaxindiaefiling.gov.in/help/?lang=eng"));
        startActivity(intent);
    }
    public void img8(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.incometaxindiaefiling.gov.in/home"));
        startActivity(intent);
    }
}
