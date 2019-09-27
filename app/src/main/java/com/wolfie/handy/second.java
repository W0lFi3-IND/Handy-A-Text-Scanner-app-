package com.wolfie.handy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class second extends AppCompatActivity {
TextView mTextView;
EditText mEditText;
    String ans ,find,ans2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        mEditText = findViewById(R.id.editText);

        mTextView = findViewById(R.id.textView);
        Bundle b = new Bundle();
        b = getIntent().getExtras();
        ans = b.getString("text").toLowerCase();
        mTextView.setText(ans);
        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                find = mEditText.getText().toString().toLowerCase();
                String replace = "<font color='red'>" + find + "</font>";
                String modifiedString = ans.replaceAll(find,replace);
                mTextView.setText(Html.fromHtml(modifiedString));
            }
        });
        findViewById(R.id.button4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });
    }
}
