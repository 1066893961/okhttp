package application.app.okhttp.http;

import com.alibaba.fastjson.JSON;
import com.lzy.okgo.callback.AbsCallback;
import com.lzy.okgo.request.BaseRequest;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import application.app.okhttp.OKApplication;
import application.app.okhttp.utils.DeviceUtils;
import application.app.okhttp.utils.LogUtil;
import okhttp3.Response;

/**
 * 解析回掉
 * Created by lwz on 2018/4/24.
 */
public abstract class JsonCallback<T> extends AbsCallback<T> {

    @Override
    public void onBefore(BaseRequest request) {
        super.onBefore(request);
        request.headers("deviceType","1");
        request.headers("deviceId", DeviceUtils.getIMEI(OKApplication.getContext()));
//        request.headers("accessToken", Preferences.getKDUserToken());
        LogUtil.i("RequestJson",request.getUrl());
    }

    /**
     * 该方法是子线程处理，不能做ui相关的工作
     * 主要作用是解析网络返回的 response 对象,生产onSuccess回调中需要的数据对象
     * 这里的解析工作不同的业务逻辑基本都不一样,所以需要自己实现,以下给出的时模板代码,实际使用根据需要修改
     */
    @Override
    public T convertSuccess(Response response) throws Exception {

        Type genType = getClass().getGenericSuperclass();
        Type[] params = ((ParameterizedType) genType).getActualTypeArguments();
        Type type = params[0];
        if (!(type instanceof ParameterizedType)) {
            throw new IllegalStateException("没有填写泛型参数");
        }
        Type rawType = ((ParameterizedType) type).getRawType();
        Type typeArgument = ((ParameterizedType) type).getActualTypeArguments()[0];
        String json  = response.body().string();
        LogUtil.i("ResponseJson",json);
        if (typeArgument == Void.class) {
            SimpleResponse simpleResponse = JSON.parseObject(json, SimpleResponse.class);
            response.close();
            return (T) simpleResponse.toLzyResponse();
        } else if (rawType == LzyResponse.class) {
            LzyResponse lzyResponse = JSON.parseObject(json, type);
            response.close();
            int code = lzyResponse.code;
            if (code == 0) {
                return (T) lzyResponse;
            } else if (code == 21105){//品牌下架
                return (T) lzyResponse;
            }else if (code == 10001){//资讯下架
                return (T) lzyResponse;
            }else if (code == 21802){
//                EventBus.getDefault().post(new UserEvent(GlobalKeyContans.EVENT_KEY_TOKENOUT));
                throw new IllegalStateException(lzyResponse.msg);
            }else {
//                throw new IllegalStateException(lzyResponse.msg +":" + code);
                throw new IllegalStateException(lzyResponse.msg);
            }
        } else {
            response.close();
            throw new IllegalStateException("基类错误无法解析!");
        }
    }
}