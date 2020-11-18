package com.example.helloword;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity //android built-in thing for an android activity
{

    @Override
    //all activities have this onCreate method
    //automatically gets called in an Android activity
    protected void onCreate(Bundle savedInstanceState)
    {
        //parent calls onCreate
        super.onCreate(savedInstanceState);

        //part that makes us special
        //MVC- this is how this particular controller to link itself to this particular view
        this.setContentView(R.layout.activity_main);

    }

    public void onButtonClicked(View v)
    {
        TextView myTextView = this.findViewById(R.id.myTextView);
        myTextView.setText("Hello World");
    }
}