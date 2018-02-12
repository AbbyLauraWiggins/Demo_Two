package com.degree.abbylaura.demotwo;

/**
 * Created by abbylaura on 01/02/2018.
 */

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.*;

public class D2NoticeComposeActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //set layout
        setContentView(R.layout.activity_d2_notice_compose);

    }

    public void onComposeDoneButton(View view) {

        //when clicked we want the contents of compose_user_input_text from D2NoticeComposeActivity
        //to show on input_text_view in D2NoticeActivity

        // 1. Get the text
        EditText user_input_edit_text = (EditText)
                findViewById(R.id.compose_user_input_text);
        String user_input = String.valueOf(user_input_edit_text.getText());

        // 2. Send it back to D2NoticeActivity using an intent
        Intent sendContent = new Intent();
        sendContent.putExtra("User Input", user_input);
        setResult(RESULT_OK, sendContent);

        finish();

    }



    public void onComposeBackButton(View view) {

        //when clicked we want to go back to D2NoticeActivity with no changes occuring

        Intent goBack = new Intent();
        setResult(RESULT_OK, goBack);
        finish();
    }
}
