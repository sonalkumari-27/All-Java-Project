package com.demo.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class demo {
	@RequestMapping("/")
//	@ResponseBody
	public String show () {
		return "Hello world!";
	}

}
