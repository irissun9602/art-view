package skhu.artview.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import skhu.artview.dto.User;
import skhu.artview.service.UserService;

@RestController
@CrossOrigin
@RequestMapping("guest")
public class GuestController {

	@Autowired
	UserService userService;

	// 회원 아이디 조회
	@RequestMapping(value = "user/{login_id}")
	public User user(@PathVariable("login_id") String login_id) {
		return userService.findOne(login_id);
	}

	// 전체 회원 조회
	@RequestMapping(value = "users")
	public List<User> user() {
		return userService.findAll();
	}

	// 일반 회원 회원가입
	@RequestMapping(value = "user", method = RequestMethod.POST)
	public String basicRegister(@RequestBody User user) {
		userService.register(user); // 가입 정보 저장
		return "저장성공";
	}

}
