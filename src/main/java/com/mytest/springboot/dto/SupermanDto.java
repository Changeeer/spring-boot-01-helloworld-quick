package com.mytest.springboot.dto;

import lombok.Data;

@Data
public class SupermanDto extends UserDto{


    /**
     * 技能
     * @eo.required
     */
    private String superSkill;

    public SupermanDto() {
    }
    

}