package com.mytest.springboot.dto;

import lombok.Data;

@Data
public class SupermanDto extends UserDto{


    /**
     * 技能 12:00-13:00
     * @eo.required
     */
    private String superSkill;

    public SupermanDto() {
    }
    

}