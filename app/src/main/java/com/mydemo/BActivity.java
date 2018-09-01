package com.mydemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class BActivity extends AppCompatActivity {

    private Button btn;
    private Button btnSelf;
    private Button btnOpenC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_b);

        btn = (Button) findViewById(R.id.btn);
        btnSelf = (Button) findViewById(R.id.btnSelf);
        btnOpenC = (Button) findViewById(R.id.btnOpenC);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BActivity.this, AActivity.class);
                startActivity(intent);
            }
        });

        btnSelf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BActivity.this, BActivity.class);
                startActivity(intent);
            }
        });

        btnOpenC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BActivity.this, CActivity.class);
                startActivity(intent);
            }
        });
    }
}
