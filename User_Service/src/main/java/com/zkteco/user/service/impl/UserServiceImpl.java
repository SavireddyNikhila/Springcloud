package com.zkteco.user.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.zkteco.user.VO.Department;
import com.zkteco.user.VO.ResponseTemplateVO;
import com.zkteco.user.entity.User;
import com.zkteco.user.repository.UserRepository;
import com.zkteco.user.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepo;

	@Autowired
	private RestTemplate restTemplate;

	@Override
	public User create(User usr) {
		return userRepo.save(usr);
	}

	@Override
	public ResponseTemplateVO getUserWithDepartment(Long usrId) {
		ResponseTemplateVO vo = new ResponseTemplateVO();
		User usr = userRepo.findById(usrId).get();
		Department dept = restTemplate.getForObject("http://DEPARTMENT-SERVICE/department/" + usr.getDeptId(),
				Department.class);
		vo.setUser(usr);
		vo.setDepartment(dept);
		return vo;
	}

}
