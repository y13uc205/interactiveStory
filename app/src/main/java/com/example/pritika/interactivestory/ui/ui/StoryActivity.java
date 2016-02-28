package com.example.pritika.interactivestory.ui.ui;

import android.content.Intent;
import android.graphics.drawable.Drawable;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.pritika.interactivestory.R;
import com.example.pritika.interactivestory.ui.model.Page;
import com.example.pritika.interactivestory.ui.model.Story;

public class StoryActivity extends AppCompatActivity {
// private Page[] mPage ;
    public static final String TAG =StoryActivity.class.getSimpleName();
    private Story mStory = new Story();
    private ImageView mImageView;
    private TextView mTextView;
    private Button mChoice1;
    private Button mChoice2;
    private String mName ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);
     Intent intent = getIntent();
        mName =intent.getStringExtra(getString(R.string.key_name));
        if(mName ==null)
        {
            mName = "FRIENDS" ;
        }
        Log.d(TAG, mName);
 // mPage = new Page[7];
        mImageView = (ImageView)findViewById(R.id.storyimageview);
        mTextView = (TextView)findViewById(R.id.storytextview);
        mChoice1 = (Button)findViewById(R.id.choicebutton1);
        mChoice2 =(Button)findViewById(R.id.choicebutton2);
        loadPage(0);
    }
private void loadPage(int choice) {
    final Page page = mStory.getPage(choice);
    Drawable drawable = getResources().getDrawable(page.getImageId());
    mImageView.setImageDrawable(drawable);
    String pageText = page.getText();
    //add the name only if placeholder included
    pageText = String.format(pageText, mName);
    mTextView.setText(pageText);
    if (page.isFinal()) {
mChoice1.setVisibility(View.INVISIBLE);
        mChoice2.setText("Play again");
        mChoice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    } else {
        mChoice1.setText(page.getChoice1().getText());
        mChoice2.setText(page.getChoice2().getText());

        mChoice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int nextpage = page.getChoice1().getNextPage();

                loadPage(nextpage);


            }
        });
        mChoice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int nextpage = page.getChoice2().getNextPage();

                loadPage(nextpage);


            }
        });
    }}
}
