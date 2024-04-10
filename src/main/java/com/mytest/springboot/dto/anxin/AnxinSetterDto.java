package com.mytest.springboot.dto.anxin;

import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
public class AnxinSetterDto extends AnxinBaseDto {
    @ApiModelProperty(value = "应用id", required = true)
    @NotBlank
    private Integer serviceId;

    @ApiModelProperty(value = "关键字")
    private String keyword = "";

    @Override
    public String toString() {
        return "AnxinSetterDto{" +
                "serviceId=" + serviceId +
                ", keyword='" + keyword + '\'' +
                '}';
    }
}
