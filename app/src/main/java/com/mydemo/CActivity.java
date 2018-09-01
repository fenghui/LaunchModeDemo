package com.mydemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class CActivity extends AppCompatActivity {

    private Button btn;
    private Button btnSelf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_c);

        btn = (Button) findViewById(R.id.btn);
        btnSelf = (Button) findViewById(R.id.btnSelf);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CActivity.this, AActivity.class);
                startActivity(intent);
            }
        });

        btnSelf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CActivity.this, CActivity.class);
                startActivity(intent);
            }
        });
    }
}
