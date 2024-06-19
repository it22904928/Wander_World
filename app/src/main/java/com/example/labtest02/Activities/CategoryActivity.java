package com.example.labtest02.Activities;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.labtest02.Domains.CategoryDomain;
import com.example.labtest02.R;

public class CategoryActivity extends AppCompatActivity{

    private TextView titleTxt,descriptionTxt;

    private CategoryDomain item;

    private ImageView backBtn;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

            initView();
            setVariable();

        }

    private void setVariable() {
            item = (CategoryDomain) getIntent().getSerializableExtra("object");

            titleTxt.setText(item.getTitle());
            descriptionTxt.setText(item.getDeccription());


        int drawableResId=getResources().getIdentifier(item.getPicPath(), "drawable",getPackageName());

        backBtn.setOnClickListener(v -> finish());
    }

    private void initView() {
        titleTxt=findViewById(R.id.titleTxt);
        descriptionTxt=findViewById(R.id.descriptionTxt);
        backBtn=findViewById(R.id.backBtn);
    }
}