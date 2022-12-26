package com.mytest.springboot.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class Address {


    /**
     * roomCode
     * @eo.required
     * @eo.remark 123123123123
     */
    @NotNull
    private String roomCode;

    /**
     * city
     * @eo.remark
     */
    private String city;

    /**
     * street
     * @eo.remark
     */
    private String street;

    /**
     * streetCode
     * @eo.remark
     */
    private Integer streetCode;
}
