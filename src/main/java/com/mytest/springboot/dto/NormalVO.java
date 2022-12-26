package com.mytest.springboot.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.szbank.dto.Carda;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 */

@Data
public class NormalVO {

    /**
     * 预约天 2021-05-01
     * @eo.remark
     * @eo.required
     */
    @NotNull
    private String name;

    /**
     * 预约时间段 "12:00-13:00"
     * @eo.remark
     */
    private int sex;


    /**
     * 1241241
     * @eo.remark
     * @eo.hidden
     */
    @JsonIgnore
    private String mobile;


    /**
     * addrs
     * @eo.remark
     */
    private List<String> addrs;


    /**
     * 集合
     * @eo.remark
     */
    private Set set;


    /**
     * 图
     * @eo.remark
     */
    private Map<String, Carda> map;

    /**
     * 库存量类型：ON_HAND_QTY-现存量；AVAIL_QTY-可用量；
     * @eo.remark
     */
    private String testStr;

    /**
     * 邮箱，账号，手机，或者任，意帐号，密码，都可，以登，陆只，要你，喜欢，就好了知道吗
     * @eo.remark
     * @eo.required
     */
    @NotNull
    private String loginName;
}
