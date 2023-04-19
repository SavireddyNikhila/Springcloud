package com.zkteco.user.service;

import com.zkteco.user.VO.ResponseTemplateVO;
import com.zkteco.user.entity.User;

public interface UserService {

	User create(User usr);

	ResponseTemplateVO getUserWithDepartment(Long usrId);

}
