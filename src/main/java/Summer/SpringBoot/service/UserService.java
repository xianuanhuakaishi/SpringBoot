package Summer.SpringBoot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Summer.SpringBoot.beans.User;
import Summer.SpringBoot.mapper.UserMapper;

@Service
public class UserService {
	@Autowired
	private UserMapper userMapper;

	public User addUserWithBackId(String loginname, String password) {
		User user = new User();
		user.setLoginName(loginname);
		user.setPassword(password);
		userMapper.insertUserWithBackId(user);// 该方法后，主键已经设置到user中了
		return user;
	}
}