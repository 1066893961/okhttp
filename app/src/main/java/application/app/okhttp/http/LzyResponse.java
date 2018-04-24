package application.app.okhttp.http;

import java.io.Serializable;

/**
 * 返回有数据类型
 * Created by lwz on 2018/4/24.
 */
public class LzyResponse<T> implements Serializable {

    private static final long serialVersionUID = 5213230387175987834L;

    public int code;        //code 码
    public String msg;       //日志消息
    public int pageNum;      //当前页数
    public int pageSize;    //页面大小
    public int pages;   //总页数
    public T data;          //数据对象结构
}