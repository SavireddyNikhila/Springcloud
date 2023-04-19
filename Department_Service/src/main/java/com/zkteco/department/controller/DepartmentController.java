package com.zkteco.department.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zkteco.department.entity.Department;
import com.zkteco.department.service.DepartmentService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/department")
@Slf4j
public class DepartmentController {

	@Autowired
	private DepartmentService deptService;
	// private final Logger logger =
	// LoggerFactory.getLogger(DepartmentController.class);

	@PostMapping("/")
	public Department create(@RequestBody Department dept) {
		log.info("Inside create method of Department controller");
		return deptService.create(dept);
	}

	@GetMapping("/{id}")
	public Department fetch(@PathVariable("id") Long deptId) {
		log.info("Inside getById method of Department Controller");
		return deptService.fetch(deptId);
	}
}
