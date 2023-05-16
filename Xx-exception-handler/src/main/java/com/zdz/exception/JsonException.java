package com.zdz.exception;

import com.zdz.constant.Status;

public class JsonException extends BaseException{
    public JsonException(Status status) {
        super(status);
    }
    public JsonException(Integer code, String message) {
        super(code, message);
    }

}
