package com.mytest.springboot.oth.dto;

import com.mytest.springboot.dto.NormalVO;
import com.mytest.springboot.dto.UserDto;
import com.szbank.dto.Carda;
import com.szbank.dto.Cardb;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class DWRequest {


    /**
     * 用户信息
     * @eo.required
     */
    private UserDto user;


    /**
     * 默认A类卡
     * @eo.required
     */
    private Carda carda;

    /**
     * u1
     * @eo.required
     */
    private List<UserDto> normalVOList;

//    /**
//     * u2
//     * @eo.required
//     */
//    private List<UserDto> othList;
//
//    /**
//     * A类卡
//     * @eo.required
//     */
//    private List<Carda> cardas;
//
//    /**
//     * B类卡
//     * @eo.required
//     */
//    private List<Cardb> cardbs;
}
