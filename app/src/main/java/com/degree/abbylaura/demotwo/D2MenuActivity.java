package com.degree.abbylaura.demotwo;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.content.Intent;
/**
 * Created by abbylaura on 01/02/2018.
 */

public class D2MenuActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_d2_menu);


    }

    public void onMenuNoticeClick(View view) {


        //This shouldn't work yet
        Intent goToNotices = new Intent();
        setResult(RESULT_OK, goToNotices);
        finish();

    }

    public void onMenuCalendarClick(View view) {
    }

    public void onMenuStatisticsClick(View view) {
    }

    public void onMenuMembersClick(View view) {
    }

    public void onMenuLogClick(View view) {
    }

    public void onMenuGalleryClick(View view) {
    }
}
