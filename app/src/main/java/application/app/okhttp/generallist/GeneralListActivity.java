package application.app.okhttp.generallist;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import application.app.okhttp.R;

/**
 * Created by lwz on 2018/5/10.
 */

public class GeneralListActivity extends AppCompatActivity {

    public static void startAction(Context context){
        Intent intent = new Intent();
        intent.setClass(context, GeneralListActivity.class);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_general_list);
    }
}
