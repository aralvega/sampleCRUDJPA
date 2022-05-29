package ar.edu.unju.fi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ar.edu.unju.fi.entity.User;
import ar.edu.unju.fi.repository.IRoleRepository;
import ar.edu.unju.fi.service.IUserService;

@Controller
public class UserCRUDController {
	@Autowired
	private IUserService userService;
	@Autowired
	private IRoleRepository roleRepository;
	
	@GetMapping("/users")
	public String getUsersPage(Model model) {
		model.addAttribute("users", userService.getAllUsers());
		model.addAttribute("anUser",new User());
		model.addAttribute("repeatPassword",new String());
		model.addAttribute("roles",roleRepository.findAll());
		return "users";
	}

}
