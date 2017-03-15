package com.dzy.hj.entity;


import java.io.Serializable;

/**
 * 返回消息 封装
 * @param <T>
 */
public class BaseGenericResponse<T extends Serializable> extends BaseResponse {

    /**
     * 处理结果
     */
    private boolean success;

    /**
     * 响应数据
     */
    private T data;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
