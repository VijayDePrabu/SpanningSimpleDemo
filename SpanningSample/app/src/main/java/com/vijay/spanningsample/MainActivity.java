package com.vijay.spanningsample;

import android.content.res.AssetManager;
import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView ourTextView = (TextView) findViewById(R.id.textView1);

        // we need a Spannable object(text) to set and style Span as we wish and then set it to TextView


        // (1) Create SpannableString out of the String we need to style
        // (2) Then, create a Spannable object out of SpannableString
        SpannableString sampleSpannableString =new SpannableString(ourTextView.getText());
        Spannable spannableText=sampleSpannableString; // since SpannableString implements Spannable, this is possible
        // Now setting the span
        // spannableText.setSpan(spanProperty,startOfSpan,lastofSpan,flagIfAny);
        spannableText.setSpan(new ForegroundColorSpan(Color.parseColor("#0266C8")),0,1,0);
        spannableText.setSpan(new ForegroundColorSpan(Color.parseColor("#F90101")),1,2,0);
        spannableText.setSpan(new ForegroundColorSpan(Color.parseColor("#F2B50F")),2,3,0);
        spannableText.setSpan(new ForegroundColorSpan(Color.parseColor("#0266C8")),3,4,0);
        spannableText.setSpan(new ForegroundColorSpan(Color.parseColor("#00933B")),4,5,0);
        spannableText.setSpan(new ForegroundColorSpan(Color.parseColor("#F90101")),5,6,0);
        // SpanProperty property can be ForegroundColorSpan, BackgroundColorSpan, BackgroundColorSpan
        ourTextView.setText(spannableText);

        // Now setting the font face, though this is not exactly related to our point of discussion; we do this to make the text look closer to original logo
        Typeface font = Typeface.createFromAsset(getAssets(), "Catull.ttf");
        ourTextView.setTypeface(font);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
