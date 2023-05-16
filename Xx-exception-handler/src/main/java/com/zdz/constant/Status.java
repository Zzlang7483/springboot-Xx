package com.zdz.constant;


import lombok.Data;
import lombok.Getter;

/**
 * 封装状态码
 */
@Getter
public enum Status {
    /**
     * 操作成功
     */
    OK(200, "操作成功"),
    /**
     * 未知异常
     */
    UNKNOWN_ERROR(500, "服务器出错啦");
    private Integer code;
    /**
     * 内容
     */
    private String message;


    Status(Integer code ,String message){
        this.code = code;
        this.message = message;
    }


    /**
     * 状态码
     */




}
