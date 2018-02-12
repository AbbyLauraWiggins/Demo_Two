package com.degree.abbylaura.demotwo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class D2NoticeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_d2_notice);
    }

    public void onComposeNotice(View view) {
        //when this is clicked, we want to go to D2NoticeComposeActivity
        //should return with activity name and notice content

        Intent getReturnUserInput = new Intent(this, D2NoticeComposeActivity.class);

        final int result = 1;
        getReturnUserInput.putExtra("User Input", "APPLES");

        startActivityForResult(getReturnUserInput, result);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        //handle text being sent back to from D2NoticeActivity

        TextView usersMessage = (TextView)
                findViewById(R.id.input_text_view);

        String composeText = data.getStringExtra("User Input");

        usersMessage.append(" " + composeText);

    }
}
