package application.app.okhttp.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;

/**
 * Created by lwz on 2018/4/24.
 */
public class DeviceUtils {
    /**
     * 手机对应的是IMEIdeviceid
     * IMEI（International Mobile Equipment Identity）是移动设备国际身份码的缩写，
     * 移动装备国际辨识码，是由15位数字组成的"电子串号"，它与每台手机一一对应，而且该码是全世界唯一的。
     * 畅享6 A000005EA99327
     * @return
     */
    public static String getIMEI(Context context) {
        TelephonyManager systemService = (TelephonyManager) context.getSystemService(Context.TELEPHONY_SERVICE);
        @SuppressLint("MissingPermission") String imei = systemService.getDeviceId();
        return imei;
    }

    /**
     * IMSI是相对手机卡而言的
     * 国际移动用户识别码（IMSI：International Mobile Subscriber Identification Number）
     * @param context
     * @return
     */
    @SuppressLint("MissingPermission")
    public static String getIMSI(Context context) {
        TelephonyManager tm = (TelephonyManager) context
                .getSystemService(Context.TELEPHONY_SERVICE);
        return tm.getSubscriberId();
    }

    /**
     * 手机号
     * @param context
     * @return
     */
    public static String getLine1Number(Context context) {
        TelephonyManager tm = (TelephonyManager) context
                .getSystemService(Context.TELEPHONY_SERVICE);
        return tm.getLine1Number();
    }


    /**
     * 返回设备型号
     * @param mContext
     * @return
     */

    public static String getDeviceInfo(Context mContext) {
        TelephonyManager tm = (TelephonyManager) mContext
                .getSystemService(Context.TELEPHONY_SERVICE);
        String deviceInfo = android.os.Build.MODEL;
        return deviceInfo;
    }

    /**
     * 获取androidManifest.xml上配置的渠道信息
     *
     * @param context
     * @param name
     * @return
     */
    public static String getChannelValue(Context context, String name) {
        PackageManager packageManager = context.getPackageManager();
        String msg = null;
        try {
            ApplicationInfo appInfo = packageManager.getApplicationInfo(
                    context.getPackageName(), PackageManager.GET_META_DATA);
            msg = appInfo.metaData.getString(name);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        return msg;
    }

    public static int getChannelCode(Context context) {
        String channelValue = getChannelValue(context, "UMENG_CHANNEL");
        int channelCode = 1000;
        if(TextUtils.isEmpty(channelValue)){
            return channelCode;
        }
        try{
            channelCode = Integer.valueOf(channelValue);
        }catch (NumberFormatException e){
            e.printStackTrace();
        }
        /*switch (channelValue) {
            case "fazhiwang":
                channelCode = 1000;
                break;
            case "yingyongbao":
                channelCode = 1002;
                break;
            case "androidguanwang":
                channelCode = 1003;
                break;
            case "market360":
                channelCode = 1004;
                break;
            default:
                break;
        }*/
        return channelCode;
    }
}
