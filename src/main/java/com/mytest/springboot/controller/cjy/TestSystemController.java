package com.mytest.springboot.controller.cjy;

import javax.annotation.Resource;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import cn.hutool.core.lang.RegexPool;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.eolinker.platform.api.response.BaseResult;
import com.eolinker.platform.api.response.PaginatorResult;
import com.eolinker.platform.api.response.PlainResult;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.mytest.springboot.common.ResponseParams;
import com.mytest.springboot.dto.NormalVO;
import com.mytest.springboot.dto.UserDto;
import com.szbank.dto.Carda;
import lombok.Data;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.List;


/**
 * @eo.api-type http
 * @eo.group-name 默认分组
 * @eo.path /system
 */
@RestController
@RequestMapping("system")
@Validated
public class TestSystemController {

    /**
     * 123
     * @param tagId {@eo.hidden}
     * @param car {@eo.required}
     * @eo.name 123
     * @eo.url /default/getUser/{tagId}
     * @eo.method post
     * @eo.request-type json
     */
    @PostMapping({"default/getUser/{tagId}"})
    public PaginatorResult<Page<Car>> testPath(@PathVariable("tagId") long tagId, @RequestBody PlainResult<List<UserDto>> car) {
        return null;
    }

    /**
     * @return Car
     * @eo.name testPath
     * @eo.url /mono
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
        @JsonIgnore
        private Long id;

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
