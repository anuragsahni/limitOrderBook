package com.capone.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class LOBResource {


	@GetMapping("/getStudent")
	public @ResponseBody String getStudents() throws Exception {
		
		return "Sample Student";

	}

	
}
