package com.nbd.nguyenbaoduy_59130423_lifecycle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;
import android.widget .Toast;


public class MainActivity extends AppCompatActivity
{
    TextView txttime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("LifeCycle", "onCreate Called");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("LifeCycle", "onRestar Called");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("LifeCycle", "onStart Called");
        Toast.makeText(getApplicationContext(), "Chào mừng bạn đến với Ứng dụng của NBD", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("LifeCycle", "onResume Called");
        txttime=findViewById(R.id.txttime);
        SimpleDateFormat spDF=new SimpleDateFormat("HH:mm:ss");
        String date=spDF.format(new Date());
        txttime.setText(date);
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("LifeCycle", "onPause Called");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("LifeCycle", "onStop Called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("LifeCycle", "onDestroy Called");
    }
}
