package com.mytest.springboot.controller.cjy;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.plugins.pagination.PageDTO;
import com.mytest.springboot.common.ResponseParams;
import com.mytest.springboot.controller.BaseController;
import com.mytest.springboot.dto.NormalVO;
import com.mytest.springboot.dto.SupermanDto;
import com.mytest.springboot.dto.UserDto;
import com.mytest.springboot.dto.bug1028.CostExportRequest;
import com.mytest.springboot.oth.dto.Result;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.math.BigDecimal;
import java.util.List;
/**
 *
 * @eo.api-type http
 * @eo.group-name postcat
 * @eo.path /cjy
 * @eo.groupName 默认分组
 */
@RestController
@RequestMapping(value = "/cjy")
public class SingleTestController{
//public class SingleTestController {
//
//	/**
//	 */
//	private String str;
//
//	/**
//	 * 这是一个测试接口
//	 * @param request
//	 * @param a {@required} 属性就叫aaaa
//	 * @eo.name 这是一个测试接口
//	 * @url /
//	 * @eo.method get
//	 * @eo.request-type formdata
//	 */
	@RequestMapping("qweqwe")
	public PageDTO<Integer> init123(CostExportRequest request, String a) {
		System.out.println("123");
		return null;
	}

	@RequestMapping("qweqwe22")
	public UserDto init(String a) {
		System.out.println("123");
		return null;
	}
//
//	/**
//	 * @return UserDto
//	 * @eo.name flux测试方法
//	 * @url /flux
//	 * @eo.method put
//	 * @eo.request-type formdata
//	 * @eo.group-name postcat.webflux
//	 * @param name {@required}
//	 * @param id {@required}
//	 */
//	@PutMapping({"/flux"})
//	public Flux<NormalVO> testPath(String name, Long id) {
//		return null;
//	}
//
//	/**
//	 * @return UserDto
//	 * @eo.name mono测试方法s
//	 * @url /mono
//	 * @eo.method post
//	 * @eo.request-type json
//	 * @eo.group-name postcat.webflux
//	 * @param supermanDtos
//	 */
//	@PostMapping({"/mono"})
//	public Mono<NormalVO> testPath2(@RequestBody List<SupermanDto> supermanDtos) {
//		return null;
//	}
//
//	/**
//	 * @eo.name 删除方法
//	 * @url /delete
//	 * @eo.method delete
//	 * @eo.request-type formdata
//	 * @param id {@required}
//	 * @return BaseResult
//	 */
//	@DeleteMapping("delete")
//	public PlainResult<Void> delete(Long id, BigDecimal num) {
//		return null;
//	}

//
//	/**
//	 * @eo.name put
//	 * @eo.url /put
//	 * @eo.method put
//	 * @eo.request-type formdata
//	 * @param num {@eo.required}
//	 * @return PlainResult
//	 */
//	@PutMapping("put")
//	public String put(BigDecimal num) {
//		return null;
//	}


//	/**
//	 * @eo.name 分页获取用户信息
//	 * @eo.url /user/page
//	 * @eo.method get
//	 * @eo.request-type formdata
//	 * @return Result
//	 * @param pageSize 页大
//	 * @param normalVO {@eo.hidden}
//	 * @param page 页数
//	 */
//	@ApiOperation(value = "分页获取用户信息", notes = "nottttttt")
//	@GetMapping("/user/page")
//	public Result<Page<UserDto>> getUserPage(NormalVO normalVO,Integer page, Integer pageSize) {
////		Result result = new Result();
////		boolean a = true;
////		if (a) {
////			result.setData(new UserDto());
////		} else {
////			result.setData(null);
////		}
//		return new Result<>();
//	}
}
