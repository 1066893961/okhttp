package application.app.okhttp.constant;


/**
 * 全局配置常量
 * Created by lwz on 2018/4/24.
 */
public final class GlobalConfigContants {
    public static final int intEnviSwitch = 0; // 0 测试环境 1 预上线环境  2 上线环境
    public static boolean isOpenCrashHandle = false;//是否开启崩溃日志写入本地文件
    public static final boolean isOpenJPushDebugMode = false;//是否开启极光推送测试模式
    public static final boolean isOpenUmengDebugMode = false;//是否开启友盟测试模式
    public static boolean isOpenUmengCrash = false;//是否开启友盟崩溃日志统计
    public static boolean isOpenLeakCanary = false; //是否打开leackcanary 分析工具
    static {
        if(intEnviSwitch == 0 || intEnviSwitch == 1)
        {
            isOpenCrashHandle = false; //打开本地日志收集
            isOpenLeakCanary = true;
        }
        else if(intEnviSwitch == 2)
        {
            isOpenUmengCrash = true;            //打开友盟日志收集
            isOpenLeakCanary = false;
        }
    }
}
