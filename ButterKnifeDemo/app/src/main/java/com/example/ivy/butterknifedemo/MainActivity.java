package com.example.ivy.butterknifedemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Date;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.textView)
    TextView textView;
    @BindView(R.id.button)
    Button button;
    @BindView(R.id.checkBox)
    CheckBox checkBox;
    @BindView(R.id.progressBar)
    ProgressBar progressBar;
    @BindView(R.id.imageView)
    ImageView imageView;


//    @BindView(R.id.textView)
//    TextView textView;
//    @OnClick(R.id.button)
//    public void change(){
//        textView.setText(new Date().toLocaleString());
//    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

//        textView.setText("Hello,ButterKnife!");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @OnClick(R.id.button)
    public void onClick() {
        Toast.makeText(this,"Hello"+new Date().toString(),Toast.LENGTH_SHORT).show();
    }
}
