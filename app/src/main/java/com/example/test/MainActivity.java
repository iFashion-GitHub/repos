package com.example.test;

import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        TextView textView = findViewById( R.id.textView );
        String text = Environment.getExternalStorageDirectory().getAbsolutePath() + "/patch_signed_7zip.apk";
//        textView.setText( Environment.getExternalStorageDirectory()+"");
        textView.setText( text);
        Log.i( "test" ,"text:"+text);
    }
}
