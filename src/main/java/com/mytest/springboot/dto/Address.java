package com.mytest.springboot.dto;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;
import com.squareup.moshi.Json;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
public class Address {


    /**
     * 房门号
     * @required
     * @remark 123123123123
     * @eo.required
     */
    @NotNull
    @JsonProperty("ROOM_CODE")
    private String roomCode;

    /**
     * 城市
     * @remark
     * @eo.required
     */
    @SerializedName("CITY")
    @NotBlank
    private String city;

    /**
     * 街道
     * @remark
     * @eo.required
     */
    @NotEmpty
    @JSONField(name = "STREET")
    private String street;

    /**
     * 街道编码
     * @remark
     * @eo.required
     */
    @org.hibernate.validator.constraints.NotEmpty
    @Json(name = "STREET_CODE")
    private Integer streetCode;

    /**
     * 房号
     * @eo.required
     */
    @org.hibernate.validator.constraints.NotBlank
    private List<List<String>> roomNum;
}
