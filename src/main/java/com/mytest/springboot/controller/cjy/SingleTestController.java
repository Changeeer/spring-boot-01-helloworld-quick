package com.mytest.springboot.controller.cjy;

import com.ExtSpecialResult;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.eolinker.platform.api.response.PlainResult;
import com.mytest.springboot.controller.BaseController;
import com.mytest.springboot.dto.Address;
import com.mytest.springboot.dto.NormalVO;
import com.mytest.springboot.dto.UserDto;
import com.mytest.springboot.dto.base.SpecialResult;
import com.mytest.springboot.dto.bug1028.CostExportRequest;
import com.mytest.springboot.dto.swagger.User;
import com.szbank.dto.Carda;
import com.szbank.dto.Cardb;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.core.publisher.ParallelFlux;

import java.util.List;

/**
 *
 * @eo.api-type http
 * @eo.group-name 默认分组
 * @eo.path
 */
@RestController
//@RequestMapping(value = "/cjy")
public class SingleTestController extends BaseController<List<UserDto>, NormalVO> {

	/**
	 */
	private String str;

	/**
	 * asdasd
	 * @param request
	 * @eo.name asdasd
	 * @eo.url /
	 * @eo.method get
	 * @eo.request-type formdata
	 * @param a {@eo.hidden}
	 */
	@RequestMapping
	public Page<UserDto> init(CostExportRequest request, String a) {
		System.out.println("123");
		return null;
	}

	/**
	 * @return UserDto
	 * @eo.name testPath
	 * @eo.url /mono
	 * @eo.method post
	 * @eo.request-type formdata
	 */
	@PostMapping({"/mono"})
	public Flux<UserDto> testPath() {
		return null;
	}


//	@RequestMapping(value = {"list/lists"},headers= {"test_header=abc"})
//	public Map<List<List<Map<String, Map<String, List<UserDto>>>>>, List<UserDto>> testData() {
////		UserDto userDto = params.getData();
////		return userDto.getAges();
//		return null;
//	}
//
//	@GetMapping("getM")
//	public PlainResult<UserDto> getM(String uuid, String startTime, String endTime) {
//		return null;
//	}

}
