package com.example.multipleactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {


    public void goBack(View view)
    {
//        Intent i=new Intent(getApplicationContext(),MainActivity.class);
//        startActivity(i);
finish();

}
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent i=getIntent();
        String name=i.getStringExtra("Name of friend:  ");

        Toast.makeText(this, "Name of friend:  "+name, Toast.LENGTH_SHORT).show();

    }
}
