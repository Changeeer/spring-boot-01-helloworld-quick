package com.mytest.springboot.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.util.List;

@Data
public class Address {


    /**
     * 房门号
     * @required
     * @remark 123123123123
     */
    @NotNull
    private String roomCode;

    /**
     * 城市
     * @remark
     */
    private String city;

    /**
     * 街道
     * @remark
     */
    private String street;

    /**
     * 街道编码
     * @remark
     */
    private Integer streetCode;

    /**
     * 房号
     */
    private List<List<String>> roomNum;
}
