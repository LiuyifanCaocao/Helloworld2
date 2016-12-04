package com.jredu.liuyifan.helloworld;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radioGroup);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.radioButton1:
                        Toast.makeText(MainActivity.this,"男",Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.radioButton2:
                        Toast.makeText(MainActivity.this,"女",Toast.LENGTH_LONG).show();
                        break;
                }
            }
        });
        CheckBox checkBox = (CheckBox) findViewById(R.id.agree);
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    Toast.makeText(getApplication(),"你bua不同意了",Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(getApplication(),"你不同意",Toast.LENGTH_SHORT).show();
                }
            }
        });
        final Button button = (Button) findViewById(R.id.button);
        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(clickListener1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "大师傅", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this,New1.class);
                startActivity(intent);
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*button.performClick();*/
                button.setEnabled(true);
                button.setText("哈哈");
            }
        });
    }
    View.OnClickListener clickListener1 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(MainActivity.this, "注册", Toast.LENGTH_SHORT).show();

        }
    };
}

