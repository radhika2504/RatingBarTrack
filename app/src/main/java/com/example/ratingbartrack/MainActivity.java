package com.example.ratingbartrack;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private RatingBar RtBar;
    private TextView tv;
    private Button set_result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RtBar=findViewById(R.id.ratingbar);
        tv=findViewById(R.id.tv);
        set_result=findViewById(R.id.btnResult);

        set_result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val=String.valueOf(RtBar.getRating());
                tv.setText(val);
            }
        });

    }
}