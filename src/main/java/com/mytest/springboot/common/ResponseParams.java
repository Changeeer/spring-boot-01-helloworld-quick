package com.mytest.springboot.common;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;

@Data
//@AllArgsConstructor
@NoArgsConstructor
public class ResponseParams<T> implements Serializable {

    private static final long serialVersionUID=1L;
    /**
     * 状态码
     *
     * @required
     */
    private String code;
    /**
     * 返回信息
     *
     * @required
     */
    private String msg;

    /**
     * 属性
     */
    private List<Property> baseProperties = Collections.emptyList();
    /**
     * 返回对象
     */
    private T data;

//    /**
//     * 数组
//     */
//    private Set set;
//
//    /**
//     * 图关系
//     */
//    private Map map;

//    public ResponseParams(String code, String msg) {
//        this.code = code;
//        this.msg = msg;
//    }
//
//    public ResponseParams(T t) {
//        this.data = t;
//        this.code = "000";
//        this.msg = "success";
//    }

    @Data
    public static class Property {
        /**
         * 类型
         */
        private Integer type;
        /**
         * 变量名
         */
        private String key;
        /**
         * 变量值
         */
        private String value;

        /**
         * 环境
         */
        private Env env;

        @Data
        public static class Env{

            private Integer type;
        }

    }
}

