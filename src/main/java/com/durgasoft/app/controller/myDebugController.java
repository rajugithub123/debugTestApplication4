package com.durgasoft.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.durgasoft.app.service.MyTestService;

@RestController
public class myDebugController {
	
	public MyTestService myTestService=new MyTestService();

@GetMapping("/getStrng")
public String hello() {
	
	return myTestService.hi();
	
}

}
