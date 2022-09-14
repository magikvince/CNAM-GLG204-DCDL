package fr.magikvince.dcdl.security.admin;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import fr.magikvince.dcdl.game.league.League;
import fr.magikvince.dcdl.game.league.LeagueService;
import fr.magikvince.dcdl.security.role.*;
import fr.magikvince.dcdl.security.user.*;
import fr.magikvince.dcdl.security.userrole.UserRole;
import fr.magikvince.dcdl.security.userrole.UserRoleService;
import fr.magikvince.dcdl.social.room.Room;
import fr.magikvince.dcdl.social.room.RoomService;

@Controller
public class AdminPageController {
	
	@Autowired
	UserService userservice;
	
	@Autowired
	RoleService roleservice;
	
	@Autowired
	UserRoleService userRoleService;
	
	@Autowired
	RoomService roomService;
	
	@Autowired
	LeagueService leagueService;

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
	
	@GetMapping("/authorizations")
	public String showAuthorizations(Model model)
	{
		Collection<UserRole> userRoles = userRoleService.findAllUserRole();
		model.addAttribute("authorizations", userRoles);
		return "security/authorizations.html";
	}
	
	@GetMapping("/rooms")
	public String showRooms(Model model)
	{
		Collection<Room> rooms = roomService.findAllRooms();
		model.addAttribute("rooms", rooms);
		return "social/rooms.html";
	}
	
	@GetMapping("/leagues")
	public String showLeagues(Model model)
	{
		Collection<League> leagues = leagueService.findAllLeagues();
		model.addAttribute("leagues", leagues);
		return "game/leagues.html";
	}
	
	
}
