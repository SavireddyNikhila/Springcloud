package com.zkteco.department.service;

import com.zkteco.department.entity.Department;

public interface DepartmentService {

	Department create(Department dept);

	Department fetch(Long deptId);

}
