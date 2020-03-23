package com.junling.mis.common.result;

import com.google.gson.Gson;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MakeResult<T> implements Serializable {
    private int code = 200;  //返回值状态码
    private String msg = ""; //附加消息
    private int count = 0; // 当前记录条数
    private int total = 0; //总条数
    private int pages = 0; //总页数

    public int getPage_size() {
        return page_size;
    }

    public void setPage_size(int page_size) {
        this.page_size = page_size;
    }

    private int page_size = 0; //每页设定大小
    private int current_page = 0 ; //当前第几页
    private HashMap<String,Object> map = new HashMap<String,Object>(); //其他自定义返回参数
    private List<T> results = new ArrayList<>();

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getCurrent_page() {
        return current_page;
    }

    public void setCurrent_page(int current_page) {
        this.current_page = current_page;
    }

    public HashMap<String, Object> getMap() {
        return map;

    }

    public void setMap(HashMap<String, Object> map) {
        this.map = map;
    }

    public MakeResult<T> addResults(T ret) {
        this.results.add(ret);
        count = results.size();
        return this;
    }

    /**
     * 创建一个指定状态码的返回值
     * @param code
     * @return
     */
    public static MakeResult createResult(int code) {
        MakeResult result = new MakeResult();
        result.setCode(code);
        return result;
    }
    /**
     * 创建一个包含指定状态码和消息的返回值
     * @param code
     * @param msg
     * @return
     */
    public static MakeResult createResult(int code, String msg) {
        MakeResult result = new MakeResult();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }

    /**
     * 创建一个包含状态码、消息和数据的返回值
     * @param code
     * @param msg
     * @param data
     * @return
     */
    public static MakeResult createResult(int code, String msg, List data) {
        MakeResult result = new MakeResult();
        result.setCode(code);
        result.setMsg(msg);

        if ( data != null && data.size() > 0) {
            result.setResults(data);
        }
        return result;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<T> getResults() {
        return results;
    }

    public void setResults(List<T> results) {
        this.results = results;
        count = results.size();
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public int getCount() {
        return count;
    }

    public String toString() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
    ////////////////////////////////////TEST//////////////////////////////////////////
//    public static void main(String [] args) {
//        MakeResult<String> result = MakeResult.createResult(200);
//        List<String> ret = new ArrayList<>();
//        ret.add("1");
//        ret.add("2");
//        result.setResults(ret);
//
//        result.addResults("3");
//        result.addResults("4");
//
//        System.out.println(result.toString());
//    }
}

