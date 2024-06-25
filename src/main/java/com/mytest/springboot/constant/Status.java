package com.mytest.springboot.constant;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

public enum Status {
//    ACTIVE,
//    INACTIVE;

    /**
     * 活跃
     */
    ACTIVE(0,"active"),
    /**
     * 非活跃
     */
    INACTIVE(1,"inactive");

    private final int code;
    private final String desc;

    Status(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public int getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
