package fr.magikvince.dcdl.security.admin;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import fr.magikvince.dcdl.security.role.*;
import fr.magikvince.dcdl.security.user.*;

@Controller
public class AdminPageController {
	
	@Autowired
	UserService userservice;
	
	@Autowired
	RoleService roleservice;

	@GetMapping("/admin")
	public String adminPage()
	{
		return "security/admin.html";
	}
	
	@GetMapping("/users")
	public String showUsers(Model model)
	{
		Collection<User> users = userservice.findAllUsers();
		model.addAttribute("users", users);
		return "security/users.html";
	}
	
	@GetMapping("/roles")
	public String showRoles(Model model)
	{
		Collection<Role> roles = roleservice.findAllRoles();
		model.addAttribute("roles", roles);
		return "security/roles.html";
	}
}
