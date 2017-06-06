package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:

    TextView mTextView;
    Button mTopButton;
    Button mBottomButton;
    int mStoryIndex = 1;

//    private int [] textviewVal =
//            {
//                R.string.T1_Story,
//                R.string.T2_Story,
//                R.string.T3_Story,
//                R.string.T4_End,
//                R.string.T5_End,
//                R.string.T6_End
//            };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:

        mTextView = (TextView) findViewById(R.id.storyTextView);
        mTopButton = (Button) findViewById(R.id.buttonTop);
        mBottomButton = (Button) findViewById(R.id.buttonBottom);

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:

        mTopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mStoryIndex == 1)
                {
                    mStoryIndex = 3;
                    updateViews(3);
                    Toast.makeText(getApplicationContext(),"Story1 : Top button clicked..moving to T3_Story",Toast.LENGTH_SHORT).show();

                }
                else if(mStoryIndex == 3)
                {
                    mStoryIndex = 6;
                    updateViews(6);
                    Toast.makeText(getApplicationContext(),"Story3 : Top button clicked..moving to T6_Story",Toast.LENGTH_SHORT).show();
                }
                else if(mStoryIndex == 2)
                {
                    mStoryIndex = 3;
                    updateViews(3);
                }
            }
        });


        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:

        mBottomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mStoryIndex == 1)
                {
                    mStoryIndex = 2;
                    updateViews(2);
                    Toast.makeText(getApplicationContext(),"Story1 : Bottom button clicked..moving to T2_Story",Toast.LENGTH_SHORT).show();
                }
                else if(mStoryIndex == 3)
                {
                    mStoryIndex = 5;
                    updateViews(5);
                    Toast.makeText(getApplicationContext(),"Story3 : Bottom button clicked..moving to T5_Story",Toast.LENGTH_SHORT).show();
                }
                else if(mStoryIndex == 2)
                {
                    mStoryIndex = 4;
                    updateViews(4);
                }
            }
        });

    }

    public void updateViews(int currentIndex)
    {
        currentIndex = mStoryIndex;
        if(mStoryIndex == 1)
        {
            mTextView.setText(R.string.T1_Story);
            mTopButton.setText(R.string.T1_Ans1);
            mBottomButton.setText(R.string.T1_Ans2);
        }
        else if(mStoryIndex == 2)
        {
            mTextView.setText(R.string.T2_Story);
            mTopButton.setText(R.string.T2_Ans1);
            mBottomButton.setText(R.string.T2_Ans2);
        }
        else if(mStoryIndex == 3)
        {
            mTextView.setText(R.string.T3_Story);
            mTopButton.setText(R.string.T3_Ans1);
            mBottomButton.setText(R.string.T3_Ans2);
        }
        else if(mStoryIndex == 6)
        {
            mTextView.setText(R.string.T6_End);
            mTopButton.setVisibility(View.GONE);
            mBottomButton.setVisibility(View.GONE);
        }
        else if(mStoryIndex == 5)
        {
            mTextView.setText(R.string.T5_End);
            mTopButton.setVisibility(View.GONE);
            mBottomButton.setVisibility(View.GONE);
        }
        else if(mStoryIndex == 4)
        {
            mTextView.setText(R.string.T4_End);
            mTopButton.setVisibility(View.GONE);
            mBottomButton.setVisibility(View.GONE);
        }
    }
}
