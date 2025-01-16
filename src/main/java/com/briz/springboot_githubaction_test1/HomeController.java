package com.briz.springboot_githubaction_test1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController
{
@RequestMapping("/test")
public String test()
{
	return "this is jenkins test";
}
}
