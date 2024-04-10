package com.mytest.springboot.dto.anxin;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AnxinBaseDto {

    @ApiModelProperty(value = "唯一id", required = true)
    @NotNull
    private String id;

    @ApiModelProperty(value = "名字", required = true)
    @NotNull
    private String name;
}
