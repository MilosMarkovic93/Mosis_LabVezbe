package com.example.milos.myplaces;


import  android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
/**
 * Created by Milos on 4/18/2020.
 */

public class About extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);
        Button ok=(Button)findViewById(R.id.about_ok);
        ok.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                finish();
            }
        });
    }
}
