package org.zerock.controller.lecture.normal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.zerock.controller.lecture.domain.User;

import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/ex07/*")
@Log4j
public class Ex07Controller {
	
	@RequestMapping("/sub01")
	public @ResponseBody String method01() {
		log.info("ex07, sub01 method");
		
		return "my responer!";
	}
	
	@RequestMapping("/sub02")
	public @ResponseBody String method02() {
		log.info("ex07, sub02 method");
		
		User user = new User();
		user.setId("edward");
		user.setAge(99);
		
		return user.toString();
	}
	
	@RequestMapping("/sub03")
	public @ResponseBody String method03() {
		log.info("ex07, sub03 method");
		
		User user = new User();
		user.setId("donald");
		user.setAge(99);
		
		return "{\"id\":" + "\"" + user.getId() + "\", " + "\"age\":" + user.getAge() + "}";
	}
	
	@RequestMapping("/sub04")
	public @ResponseBody User method04() {
		log.info("ex07, sub04 method");
		
		User user = new User();
		user.setId("edward");
		user.setAge(99);
	
		return user;
}
}
