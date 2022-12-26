package com.mytest.springboot.dto.base;

import com.mytest.springboot.dto.BaseResultDto;
import lombok.Data;

import java.util.List;

@Data
public class SpecialResult<A,B> {

    private BaseResultDto baseMsg;

    private A data;

    private List<B> dataList;
}
