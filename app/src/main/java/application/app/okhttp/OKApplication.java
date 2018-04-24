package application.app.okhttp;

import android.app.Application;
import android.content.Context;

import com.lzy.okgo.OkGo;

/**
 * Created by lwz on 2018/4/24.
 */

public class OKApplication extends Application {
    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
        OkGo.init(this);
    }

    public static Context getContext() {
        return context;
    }
}
