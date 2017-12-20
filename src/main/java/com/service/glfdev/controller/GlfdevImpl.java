package com.service.glfdev.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2017-12-20T10:46:57.689Z")

@RestSchema(schemaId = "glfdev")
@RequestMapping(path = "/glfdev", produces = MediaType.APPLICATION_JSON)
public class GlfdevImpl {

    @Autowired
    private GlfdevDelegate userGlfdevDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userGlfdevDelegate.helloworld(name);
    }

}
