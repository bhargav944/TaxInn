package com.bhargav.taxinn;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Third extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
    }
    public void img1(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.incometaxindia.gov.in/Pages/tools/rent-free-accommodation-calculator.aspx"));
        startActivity(intent);
    }
    public void img2(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.incometaxindia.gov.in/Pages/tools/medical-facility-india.aspx"));
        startActivity(intent);
    }
    public void img3(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.incometaxindia.gov.in/Pages/tools/income-tax-calculator-234ABC.aspx"));
        startActivity(intent);
    }
    public void img4(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.incometaxindia.gov.in/Pages/tools/house-rent-allowance-calculator.aspx"));
        startActivity(intent);
    }
    public void img5(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.incometaxindia.gov.in/Pages/tools/children-hostel-allowance.aspx"));
        startActivity(intent);
    }
    public void img6(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.incometaxindia.gov.in/Pages/tools/deferred-tax-calculator.aspx"));
        startActivity(intent);
    }
    public void img7(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.incometaxindia.gov.in/Pages/tools/transport-allowance-calculator.aspx"));
        startActivity(intent);
    }
    public void img8(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.incometaxindia.gov.in/Pages/tax-calculators.aspx"));
        startActivity(intent);
    }
}
