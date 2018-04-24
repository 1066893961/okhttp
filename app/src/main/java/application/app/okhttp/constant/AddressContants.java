package application.app.okhttp.constant;

/**
 * Created by lwz on 2018/4/24.
 */

public final class AddressContants {

    private static String SERVER_ADDR_INFORMATION = "";

    static {
        if (GlobalConfigContants.intEnviSwitch == 0) {
            SERVER_ADDR_INFORMATION = "http://kuaidaoservice-information-test.kuaidaoapp.com";//资讯地址测试
        } else if (GlobalConfigContants.intEnviSwitch == 1) {
            SERVER_ADDR_INFORMATION = "http://information-pre.kuaidaoapp.com";//资讯地址预上线
        } else if (GlobalConfigContants.intEnviSwitch == 2) {
            SERVER_ADDR_INFORMATION = "https://information.kuaidao.cn";//资讯地址 正式
        }

    }

    public static final String API_ADVICE_LIST = SERVER_ADDR_INFORMATION + "/v1.0/information/app/list";//咨询列表--头条

}
