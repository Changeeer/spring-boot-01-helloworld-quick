package com.mytest.springboot.controller;

import com.mytest.springboot.dto.swagger.*;
import io.swagger.annotations.Api;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

import javax.ws.rs.*;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

@Path("/main")
public class SwaggerController {


    /** 555
     * @eo.url /user
     * @param user 1
     * @param name 2
     * @param code 3
     * @return 4
     */
    @POST
    @Path("/user")
    @Operation(summary = "Create user",
            description = "This can only be done by the logged in user.")
    public Response methodWithRequestBodyAndTwoParameters(
            @RequestBody(description = "Created user object", required = true,
                    content = @Content(
                            schema = @Schema(implementation = User.class))) User user,
            @QueryParam("name") String name, @QueryParam("code") String code) {
        return Response.ok().entity("").build();
    }

    @PUT
    @Path("/user")
    @Operation(summary = "Modify user",
            description = "Modifying user.")
    public Response methodWithRequestBodyWithoutAnnotation(
            User user) {
        return Response.ok().entity("").build();
    }

    @DELETE
    @Path("/user")
    @Operation(summary = "Delete user",
            description = "This can only be done by the logged in user.")
    public Response methodWithoutRequestBodyAndTwoParameters(
            @QueryParam("name") String name, @QueryParam("code") String code) {
        return Response.ok().entity("").build();
    }

    @PUT
    @Path("/pet")
    @Operation(summary = "Modify pet",
            description = "Modifying pet.")
    @Consumes({"application/json", "application/xml"})
    public Response methodWithRequestBodyWithoutAnnotationAndTwoConsumes(
            User user) {
        int a = 0;
        a = a >0?1:-1;
        return Response.ok().entity("").build();
    }

    @POST
    @Path("/pet")
    @Operation(summary = "Create pet",
            description = "Creating pet.")
    @Consumes({"application/json", "application/xml"})
    @Parameters(
            {
                    @Parameter(name = "pet", description = "宠物", in = ParameterIn.QUERY),
                    @Parameter(name = "user", description = "宠物主人",  in = ParameterIn.QUERY)
            }
    )

    public Response methodWithTwoRequestBodyWithoutAnnotationAndTwoConsumes(
             Pet pet,User user) {
        return Response.ok().entity("").build();
    }

    @DELETE
    @Path("/pet")
    @Operation(summary = "Delete pet",
            description = "Deleting pet.")
    @Parameters({
            @Parameter(name = "id", description = "用户id" , in = ParameterIn.QUERY)
    })
    @Consumes({"application/json", "application/xml"})
    public Response methodWithOneSimpleRequestBody(int id) {
        return Response.ok().entity("").build();
    }
}
