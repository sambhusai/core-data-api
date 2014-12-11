package com.vroozi.api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mangofactory.swagger.annotations.ApiIgnore;

@ApiIgnore
@Controller
public class TestController {

	
	@RequestMapping(value="/test", produces="application/json")
	@ResponseBody
	public String getTest(){
		return "test success";
	}
}
