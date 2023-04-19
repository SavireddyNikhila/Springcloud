package com.zkteco.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zkteco.user.VO.ResponseTemplateVO;
import com.zkteco.user.entity.User;
import com.zkteco.user.service.UserService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping("/")
	public User create(@RequestBody User usr) {
		log.info("Inside create method of user controller");
		return userService.create(usr);
	}

	@GetMapping("/{id}")
	public ResponseTemplateVO getUserWithDepartment(@PathVariable("id") Long usrId) {
		log.info("Inside get method of user controller");
		return userService.getUserWithDepartment(usrId);
	}
}
