package Summer.SpringBoot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import Summer.SpringBoot.beans.Users;
import Summer.SpringBoot.service.UsersService;

@RestController
@RequestMapping("/users")
public class UsersController {
	@Autowired
	private UsersService usersService;

	@RequestMapping(value = "/addUser", method = RequestMethod.POST)
	public boolean addUser(@RequestBody Users user) {
		return usersService.addUser(user);
	}
}