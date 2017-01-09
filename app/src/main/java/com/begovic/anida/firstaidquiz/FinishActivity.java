package com.begovic.anida.firstaidquiz;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FinishActivity extends AppCompatActivity {

    Button info;
    Button main;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finish);

        info = (Button) findViewById(R.id.bInfo);
        main = (Button) findViewById(R.id.bMain);


        main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goMain = new Intent(FinishActivity.this, MainActivity.class);
                startActivity(goMain);
            }
        });

        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("http://www.redcross.org.uk/What-we-do/First-aid");
                Intent openURL = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(openURL);
            }
        });
    }
}
