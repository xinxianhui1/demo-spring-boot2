package com.offcn.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @RequestMapping(value = {"/demo/{id}"},method = RequestMethod.GET)
    public String demo(@PathVariable Integer id){
        System.out.println("进入控制层，接受参数:"+id);
        return  "SUCCESS";
    }
}
