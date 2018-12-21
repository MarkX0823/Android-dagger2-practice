package com.example.user.helloworld;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import javax.inject.Inject;

public class MainActivity extends Activity implements Injectable {

    private Button buttonHelloWorld;
    private Button buttonNext;
    private TextView viewInfo;

    private int id = 0;

    @Inject
    MyClass2 myClass2;

    @Inject
    MyClass3 myClass3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonHelloWorld = findViewById(R.id.button_hello_world);
        buttonNext = findViewById(R.id.button_next);
        viewInfo = findViewById(R.id.view_info);

        buttonHelloWorld.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myClass3.myClass.id = id++;
                myClass3.myClass.name = Long.toString(System.currentTimeMillis());
                viewInfo.setText(myClass3.toString());
            }
        });

        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Main2Activity.class));
            }
        });
    }
}
