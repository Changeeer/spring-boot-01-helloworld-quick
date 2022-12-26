package com.mytest.springboot.dto.bug1028;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
public class CostExportRequest implements Serializable {

    private static final long serialVersionUID = -20962315364819571L;
    /**
     * 开始毫秒时间戳
     */
    @NotNull(message = "不能为空！")
    private Long startTime ;
    /**
     * 结束毫秒时间戳
     */
    @NotNull(message = "不能为空！")
    private Long endTime ;
    /**
     * 供应商id
     */
    private Long supplierId ;
    /**
     * 检索词
     */
    private String keyword ;
    /**
     * 排序字段
     * @eo.remark {call_count:计费调用次数、cost:成本单价、cost_total:成本总价、online_time:上线时间}
     */
    @NotBlank(message = "不能为空！")
    private String orderBy ;
    /**
     * 是否升序
     */
    @NotNull(message = "不能为空！")
    private Boolean asc ;
}
