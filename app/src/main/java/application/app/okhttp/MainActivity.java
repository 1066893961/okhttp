package application.app.okhttp;

import android.Manifest;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.lzy.okgo.OkGo;

import java.util.HashMap;
import java.util.List;

import application.app.okhttp.bean.AdviceBean;
import application.app.okhttp.constant.AddressContants;
import application.app.okhttp.generallist.GeneralListActivity;
import application.app.okhttp.http.JsonCallback;
import application.app.okhttp.http.LzyResponse;
import application.app.okhttp.permission.MPermission;
import application.app.okhttp.utils.ParamsUtils;
import application.app.okhttp.utils.ToastUtils;
import okhttp3.Call;
import okhttp3.Response;

public class MainActivity extends AppCompatActivity {
    private final int BASIC_PERMISSION_REQUEST_CODE = 100;
    private TextView post_tv, list_tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        requestBasicPermission();

        post_tv = (TextView) findViewById(R.id.post_tv);
        list_tv = (TextView) findViewById(R.id.list_tv);
        post_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getListData(false, "1");
            }
        });
        list_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GeneralListActivity.startAction(getApplicationContext());
            }
        });
    }

    /**
     * 基本权限管理
     */
    private final String[] BASIC_PERMISSIONS = new String[]{
//            Manifest.permission.WRITE_EXTERNAL_STORAGE,
//            Manifest.permission.READ_EXTERNAL_STORAGE,
//            Manifest.permission.CAMERA,
            Manifest.permission.READ_PHONE_STATE,
//            Manifest.permission.RECORD_AUDIO,
//            Manifest.permission.ACCESS_COARSE_LOCATION,
//            Manifest.permission.ACCESS_FINE_LOCATION,
//            Manifest.permission.CALL_PHONE,
//            Manifest.permission.MODIFY_AUDIO_SETTINGS
    };

    private void requestBasicPermission() {
        MPermission.printMPermissionResult(true, this, BASIC_PERMISSIONS);
        MPermission.with(MainActivity.this)
                .setRequestCode(BASIC_PERMISSION_REQUEST_CODE)
                .permissions(BASIC_PERMISSIONS)
                .request();
    }

    protected void getListData(final boolean isLoadMore, String mTabId) {
        long time = System.currentTimeMillis();
        String str = String.valueOf(time);

        HashMap<String, String> params = ParamsUtils.getParams();
        params.put("pageNum", 1 + "");
        params.put("pageSize", 10 + "");
        params.put("firstStageType", "0" + mTabId);
        params.put("timePointer", str);
        OkGo.post(AddressContants.API_ADVICE_LIST)
                .tag(this)
                .upJson(ParamsUtils.getJson(params))
                .execute(new JsonCallback<LzyResponse<List<AdviceBean>>>() {

                    @Override
                    public void onSuccess(LzyResponse<List<AdviceBean>> listLzyResponse, Call call, Response response) {
//                        udaptUi(isLoadMore, listLzyResponse.data, listLzyResponse.pageNum, listLzyResponse.pages);

                        post_tv.setText(listLzyResponse.data.toString());
                    }

                    @Override
                    public void onError(Call call, Response response, Exception e) {
                        super.onError(call, response, e);
                        ToastUtils.showLongToast(e.getMessage());
                    }
                });
    }
}
