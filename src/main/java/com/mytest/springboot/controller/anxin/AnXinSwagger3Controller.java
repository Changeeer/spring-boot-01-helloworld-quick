package com.mytest.springboot.controller.anxin;

import com.mytest.springboot.common.ResponseParams;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@RestController
@RequestMapping("/anxin/swagger3")
@Tag(name = "安信分组s3")
public class AnXinSwagger3Controller {

    @Parameters({
            @Parameter(name = "name", description = "名字"),
            @Parameter(name = "id", description = "唯一字段", required = true),
    })
    @Path("/hello-get")
    @GET
    @Operation(summary = "say hello get", tags = "test group s3")
    public ResponseParams<String> helloGet(String name, Long id) {
        return null;
    }

    @Parameters({
            @Parameter(name = "name", description = "名字"),
            @Parameter(name = "id", description = "唯一字段", required = true),
    })
    @Path("/hello-post")
    @POST
    @Operation(summary = "say hello post")
    public ResponseParams<String> helloPost(String name, Long id) {
        return null;
    }

}
