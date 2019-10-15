package com.example.a2ndproj;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class IntentFilter2Activity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void showLoanPayments1(View clickedButton) {
        Uri uri = Uri.parse("loan://coreservlets.com/calc");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        intent.putExtras
                (LoanBundler.makeRandomizedLoanInfoBundle());
        startActivity(intent);
    }

}