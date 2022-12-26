package com.mytest.springboot.controller.dw.bug0622.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.io.Serializable;

@Data
public class ItemRequst implements Serializable {

    private static final long serialVersionUID = -4290286546045174640L;

    private Long id;

    @NotNull(message = "类目序号不能为空")
    @Pattern(regexp = "\\d+(\\.\\d+)*",message = "质检序列号格式错误")
    private String orderNo;

    @NotNull(message = "类目id不能为空")
    private Long categoryId;
}
