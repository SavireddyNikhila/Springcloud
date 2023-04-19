package com.zkteco.department.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zkteco.department.entity.Department;
import com.zkteco.department.repository.DepartmentRepository;
import com.zkteco.department.service.DepartmentService;

@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	private DepartmentRepository deptRepo;

	@Override
	public Department create(Department dept) {
		return deptRepo.save(dept);
	}

	@Override
	public Department fetch(Long deptId) {
		return deptRepo.findById(deptId).get();
	}

}
