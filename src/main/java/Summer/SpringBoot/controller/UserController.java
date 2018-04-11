package Summer.SpringBoot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import Summer.SpringBoot.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;


	@RequestMapping(value = "/addUserWithBackId", method = RequestMethod.GET)
	public String addUserWithBackId() {
		userService.addUserWithBackId("123", "456");
		return "hello";
	}

}