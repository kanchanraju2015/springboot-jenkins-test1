package com.briz.springboot_githubaction_test1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


// first create the springboot project then push to the github first 
// now go to actions and see the new workflow with maven 
// yml file must be unique 
//change some code into bottom 


@RestController
public class HomeController
{
@RequestMapping("/test")
public String test()
{
	return "this is jenkins test";
}
@RequestMapping("/git")
public String git()
{
	return "this is git action";
}
}
