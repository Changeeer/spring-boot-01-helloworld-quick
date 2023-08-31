package com.mytest.springboot.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class Address {


    /**
     * roomCode
     * @required
     * @remark 123123123123
     */
    @NotNull
    private String roomCode;

    /**
     * city
     * @remark
     */
    private String city;

    /**
     * street
     * @remark
     */
    private String street;

    /**
     * streetCode
     * @remark
     */
    private Integer streetCode;
}
