package com.example.owner.day1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Coba1 extends AppCompatActivity {

    TextView tombolshare, isi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coba1);

        tombolshare = (TextView) findViewById(R.id.Raflesia);
        isi = (TextView) findViewById(R.id.textView);
        tombolshare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i;
                i = new Intent(Intent.ACTION_SEND);
                i.putExtra(Intent.EXTRA_TEXT, isi.getText().toString());
                i.setType("text/plain");
                startActivity(i);

            }
        });
    }
}
