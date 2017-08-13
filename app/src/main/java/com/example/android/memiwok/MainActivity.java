package com.example.android.memiwok;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView numberClickListner = (TextView)findViewById(R.id.number_xml_view);
        numberClickListner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent numberIntet = new Intent(MainActivity.this,NumberJava.class);
                startActivity(numberIntet);
                Toast.makeText(v.getContext(),"go to number view",Toast.LENGTH_SHORT).show();
            }
        });

    }
}
