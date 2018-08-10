package com.example.alexk.firstui;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RelativeLayout relativeLayout;

    TextView textView;

    ImageView imageView;

    SeekBar seekBar;

    RadioGroup radioGroupBackG;
    RadioGroup radioGroupImage;

    RadioButton radioButton_changeBackBlue;
    RadioButton radioButton_changeBackGreen;
    RadioButton radioButton_changeImage2D;
    RadioButton getRadioButton_changeImage3D;

    Button buttonUpdate;

    int colorBlue;
    int colorGreen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        relativeLayout = findViewById(R.id.mainRelativeLayout);

        textView = findViewById(R.id.textView_head);

        imageView = findViewById(R.id.imageView5);

        colorBlue = Color.parseColor("#39add1");
        colorGreen = Color.parseColor("#51b46d");

        radioGroupBackG = findViewById(R.id.radioGroupBackG);
        radioGroupImage = findViewById(R.id.radioGroupImage);

        radioButton_changeBackBlue = findViewById(R.id.radioButton_blue);
        radioButton_changeBackGreen = findViewById(R.id.radioButton_green);
        radioButton_changeImage2D = findViewById(R.id.radioButton_2d);
        getRadioButton_changeImage3D = findViewById(R.id.radioButton_3d);

        buttonUpdate = findViewById(R.id.button_update);
        buttonUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (radioGroupBackG.getCheckedRadioButtonId()) {
                    case R.id.radioButton_blue: relativeLayout.setBackgroundColor(colorBlue);
                        break;
                    case R.id.radioButton_green: relativeLayout.setBackgroundColor(colorGreen);
                        break;
                }

                switch (radioGroupImage.getCheckedRadioButtonId()) {
                    case R.id.radioButton_2d: imageView.setImageResource(R.drawable.android_icon_2d);
                        break;
                    case R.id.radioButton_3d: imageView.setImageResource(R.drawable.android_icon_3d);
                        break;
                }

            }
        });

        seekBar = findViewById(R.id.seekBar);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                textView.setText(String.valueOf(progress + 1));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {}
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {}
        });
    }
}

