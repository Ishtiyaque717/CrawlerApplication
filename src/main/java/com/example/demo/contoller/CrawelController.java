package com.example.demo.contoller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/crawling")
public class CrawelController {

	@GetMapping("/pdp")
	public String importcralwedApi() {
		return "success";
	}

}
