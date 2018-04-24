package application.app.okhttp.utils;

import com.google.gson.Gson;

import java.util.HashMap;

//import com.networkbench.com.google.gson.Gson;

/**
 * Created by lwz on 2018/4/24.
 */
public class ParamsUtils {

    public static HashMap<String,String> getParams(){

        HashMap<String,String> params = new HashMap<>();
        return params;
    }
    public static HashMap<String,Object> getObjParams(){

        HashMap<String,Object> params = new HashMap<>();
        return params;
    }
    public static String getJson(HashMap<String,String> params){
        Gson gson = new Gson();
        String josn = gson.toJson(params);
        LogUtil.i("ParamsJson",josn);
        return josn;
    }
    public static String getObjJson(HashMap<String,Object> params){
        Gson gson = new Gson();
        String josn = gson.toJson(params);
        LogUtil.i("ParamsJson",josn);
        return josn;
    }
}
