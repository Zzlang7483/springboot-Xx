package com.zdz.dao;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@Data
@TableName("log")
public class Log {
    @TableId(type = IdType.AUTO)
    private Long id;
    private Date visitTime;
    private String username;
    private String ip;
    private String uri;
    private String method;
    private Long executionTime;
    private String exceptionName;
    private String exceptionMessage;

}
