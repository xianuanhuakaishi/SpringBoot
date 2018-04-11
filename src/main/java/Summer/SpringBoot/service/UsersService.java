package Summer.SpringBoot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Summer.SpringBoot.beans.Users;
import Summer.SpringBoot.mapper.UsersMapper;

@Service
public class UsersService {
	@Autowired
	private UsersMapper usersMapper;

	public boolean addUser(Users users) {
		if(users.getUsertype().equals("0")) {
			users.setUserper("0");
		}else if(users.getUsertype().equals("1")) {
			users.setUserper("1");
		}else if(users.getUsertype().equals("2")) {
			users.setUserper("2");
		}
		int i = usersMapper.insert(users);
		System.out.println(i);
		if (i > 0) {
			return true;
		}
		return false;
	}
}