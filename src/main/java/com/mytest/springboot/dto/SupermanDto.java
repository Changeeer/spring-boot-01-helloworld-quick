package com.mytest.springboot.dto;

import lombok.Data;

@Data
public class SupermanDto extends UserDto{


    /**
     * 技能 12:00-13:00
     * @required
     */
    private String superSkill;

    /**
     * 用户名-super
     * @eo.hidden
     */
    private String userName;

    public SupermanDto() {
    }
    

}