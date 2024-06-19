package com.example.labtest02.Activities;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.labtest02.Domains.PopularDomain;
import com.example.labtest02.R;

public class DetailActivity extends AppCompatActivity{
    private TextView titleTxt,locationTxt,bedTxt,guideTxt,wifiTxt,descriptionTxt,scoreTxt;
    private PopularDomain item;
    private ImageView picImg,backBtn;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_detail);

            initView();
            setVariable();
        }

    private void setVariable() {
            item= (PopularDomain) getIntent().getSerializableExtra("object");

            titleTxt.setText(item.getTitle());
            scoreTxt.setText(""+ item.getScore());
            locationTxt.setText(item.getLocation());
            bedTxt.setText(item.getBed()+"Bed");
            descriptionTxt.setText(item.getDeccription());

            if (item.isGuide()){
                guideTxt.setText("Guide");
            }else {
                guideTxt.setText("No-Guide");
            }

            if (item.isWifi()){
                wifiTxt.setText("wifi");
            }else {
                wifiTxt.setText("No-wifi");
            }

        int drawableResId = getIntent().getIntExtra("imageResourceId", 0); // Retrieve the image resource ID
        if (drawableResId != 0) {
            picImg.setImageResource(drawableResId); // Set the correct image resource to ImageView
        }

            backBtn.setOnClickListener(v -> finish());

    }

    private void initView() {
            titleTxt=findViewById(R.id.titleTxt);
            locationTxt=findViewById(R.id.locationTxt);
            bedTxt=findViewById(R.id.bedTxt);
            guideTxt=findViewById(R.id.guideTxt);
            wifiTxt=findViewById(R.id.wifiTxt);
            descriptionTxt=findViewById(R.id.descriptionTxt);
            scoreTxt=findViewById(R.id.scoreTxt);
            picImg=findViewById(R.id.picImg);
            scoreTxt=findViewById(R.id.scoreTxt);
            backBtn=findViewById(R.id.backBtn);
    }
}