package com.dcm.utils;

/**
 * Created by lalala on 2017/7/27.
 */
public class Result<T> {
    private Boolean success;
    private T data;
    private String error;

    /**
     * 成功时用，success 为true
     *
     * @param success 判断是否成功
     * @param data 成功时返回数据
     */
    public Result(Boolean success, T data) {
        this.success = success;
        this.data = data;
    }

    /**
     *
     * 失败时用，success 为false
     *
     * @param success 判断是否成功
     * @param error 错误信息
     */
    public Result(Boolean success, String error) {
        this.success = success;
        this.error = error;
    }

    public Boolean isSuccess() {
        return success;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
