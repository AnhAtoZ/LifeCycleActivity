package com.example.ps08392.lifecycleactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(MainActivity.this,"Gọi hàm onCreate", Toast.LENGTH_SHORT).show();
        //Log.i("Test","Gọi hàm onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "Gọi hàm onStart", Toast.LENGTH_SHORT).show();
        //Log.i("Test","Gọi hàm onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "Gọi hàm onResume", Toast.LENGTH_SHORT).show();
        //Log.i("Test","Gọi hàm onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "Gọi hàm onPause", Toast.LENGTH_SHORT).show();
        //Log.i("Test","Gọi hàm onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "Gọi hàm onStop", Toast.LENGTH_SHORT).show();
        //Log.i("Test","Gọi hàm onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "Gọi hàm onRestart", Toast.LENGTH_SHORT).show();
        //Log.i("Test","Gọi hàm onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "Gọi hàm onDestroy", Toast.LENGTH_SHORT).show();
        //Log.i("Test","Gọi hàm onDestroy");
    }
}
