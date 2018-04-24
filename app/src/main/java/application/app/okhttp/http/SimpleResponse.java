package application.app.okhttp.http;

import java.io.Serializable;

/**
 *
 * 返回无数据类型
 * Created by lwz on 2018/4/24.
 */


public class SimpleResponse implements Serializable {

    private static final long serialVersionUID = -1477609349345966116L;

    public int code;
    public String msg;
    public int pageNum;
    public int pageSize;
    public int pages;
    public Object data;
    public LzyResponse toLzyResponse() {
        LzyResponse lzyResponse = new LzyResponse();
        lzyResponse.code = code;
        lzyResponse.msg = msg;
        lzyResponse.pageNum = pageNum;
        lzyResponse.pageSize = pageSize;
        lzyResponse.pages = pages;
        return lzyResponse;
    }
}