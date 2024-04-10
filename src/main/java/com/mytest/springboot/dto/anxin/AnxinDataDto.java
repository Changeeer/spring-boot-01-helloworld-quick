package com.mytest.springboot.dto.anxin;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AnxinDataDto extends AnxinBaseDto {
    @ApiModelProperty(value = "环境id", required = true)
    @NotNull
    private Integer envId;

    @ApiModelProperty(value = "版本号", required = true)
    @NotNull
    private String version;
}
