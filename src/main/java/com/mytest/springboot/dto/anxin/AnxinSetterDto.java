package com.mytest.springboot.dto.anxin;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Setter
@Getter
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
