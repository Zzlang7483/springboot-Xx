package com.zdz.exception;

import com.zdz.constant.Status;

public class PageException extends BaseException{
    public PageException(Status status) {
        super(status);
    }


    public PageException(Integer code, String message) {
        super(code, message);
    }


}
