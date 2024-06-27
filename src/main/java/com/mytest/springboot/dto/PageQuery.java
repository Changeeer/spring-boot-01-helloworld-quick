package com.mytest.springboot.dto;

import com.mytest.springboot.constant.Status;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class PageQuery {

    @ApiModelProperty(value = "页数", allowableValues = "1,2,3")
    private int page;
    /**
     * 页大
     * @eo.enums 7=第七页,8=第八页,9=第九页
     */
    private int pageSize;

    /**
     * 状态
     */
    private Status status;

    /**
     * 总数
     */
    private long total;
}
