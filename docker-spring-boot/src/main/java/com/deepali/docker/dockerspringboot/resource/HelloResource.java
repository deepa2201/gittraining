package com.deepali.docker.dockerspringboot.resource;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController

public class HelloResource {
	@RequestMapping("/rest/docker/hello")
	public String hello() {
		return "Hello Youtube";
	}
}
