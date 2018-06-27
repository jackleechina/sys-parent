package com.lzy.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lzy.domain.User;
import com.lzy.service.IUserService;

@Controller
@EnableAutoConfiguration
public class UserController {

	@Value("${timeout:20}")
	int age;
	
	@Value("${name:2000}")
	String name;
	
	@Autowired
	IUserService userService;
	
    @RequestMapping("/user")
    @ResponseBody
    public User save() {
    	User user=new User();
    	user.setEmail("email");
    	user.setAge(age);
    	user.setName(name);
        return  userService.save(user);
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(UserController.class, args);
    }
}