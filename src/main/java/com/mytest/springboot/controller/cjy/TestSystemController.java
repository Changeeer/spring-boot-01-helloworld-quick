package com.mytest.springboot.controller.cjy;

import javax.validation.constraints.NotNull;

import com.eolinker.platform.api.response.PlainResult;
import com.mytest.springboot.dto.UserDto;
import lombok.Data;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.math.BigDecimal;
import java.util.*;


/**
 * @eo.api-type http
 * @eo.group-name system
 * @eo.path /system
 */
@RestController
@RequestMapping("system")
@Validated
public class TestSystemController {

    /**
     * 123
     * @param tagId
     * @eo.name 123
     * @url /default/getUser/{tagId}
     * @eo.method post
     * @eo.request-type json
     */
    @PostMapping({"default/getUser/{tagId}"})
    public PlainResult<Car> testPath(@PathVariable("tagId") long tagId) {
        return null;
    }

    /**
     * @return Car
     * @eo.name testPath
     * @url /mono
     * @eo.method post
     * @eo.request-type formdata
     */
    @PostMapping({"/mono"})
    public Mono<Car> testPath() {
        return null;
    }

    @Data
    class Car {
        /**
         * 车名~！@#￥%……&*（）——+｛｝｝|：“”《》》？·【】、；‘’，。、
         */
        @NotNull
        private String name;
        /**
         * 车牌`~!@#$%^&*()_+{}|:"<>?</>[]\;',./
         */
        private Long id;

        private int intId;

        private boolean flag;

        private double d;

        private BigDecimal bigDecimal;

        private byte aByte;

        private Date date;

        private Collection<UserDto> lists;

//        /**
//         * a*b*c* * 1
//         */
//        private boolean flag;
//
//
//        /**
//         * 生产日期* *
//         */
//        private boolean createTime;
    }

}
