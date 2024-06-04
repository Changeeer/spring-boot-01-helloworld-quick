package com.mytest.springboot.oth.dto;

import com.mytest.springboot.dto.UserDto;
import com.szbank.dto.Carda;
import lombok.Data;

import java.util.List;

@Data
public class DWRequest {


    /**
     * 用户信息
     * @required
     */
    private UserDto user;


    /**
     * 默认A类卡
     * @required
     */
    private Carda carda;

    /**
     * u1
     * @required
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
