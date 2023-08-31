package com.mytest.springboot.dto.demo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.util.List;

@Data
public class PostcatUser {

    /**
     * id
     * @required
     */
    @NotNull
    private Integer id;
    /**
     * name
     * @required
     */
    @NotNull
    private String name;
    /**
     * mobile
     * @required
     */
    @NotNull
    private String mobile;
    /**
     * age
     */
    private Integer age;
    /**
     * sex
     */
    private Integer sex;
    /**
     * friends
     */
    private List<PostcatUser> friends;
    /**
     * status
     * @hidden
     */
    @JsonIgnore
    private Integer status;
}
