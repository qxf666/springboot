package com.jxufe.springboot.util;

public class ResultEntity<T> {
    private Integer code;
    private String msg;
    private T data;

    public ResultEntity() {
        super();
    }
    public ResultEntity(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public ResultEntity(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ResultEntity{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}