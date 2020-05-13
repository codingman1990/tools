package com.codingman.tools.web;

import java.io.Serializable;

/**
 * 错误信息
 *
 * @author ty
 */
public final class Error implements Serializable {
    public static final String NOT_ALLOW_EMPTY = "不能为空";
    public static final String ILLEGAL_DATA = "数据非法";
    private String key;
    private String error;

    public Error() {

    }

    public Error(String key, String error) {
        this.key = key;
        this.error = error;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    @Override
    public String toString() {
        return "Error{" +
                "key='" + key + '\'' +
                ", error='" + error + '\'' +
                '}';
    }
}
