package fr.magikvince.dcdl.security.userrole;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import fr.magikvince.dcdl.security.role.Role;
import fr.magikvince.dcdl.security.user.User;

@Entity
@Table(name = "T_USER_ROLE")
public class UserRole {
	
	@Id
	private int idUserRole;
	
	@OneToOne
	@JoinColumn(name="id_user_fk")
	private User user;
	
	@OneToOne
	@JoinColumn(name="id_role_fk")
	private Role role;
	
	public UserRole()
	{
		
	}

	public int getIdUserRole() {
		return idUserRole;
	}

	public void setIdUserRole(int idUserRole) {
		this.idUserRole = idUserRole;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}
	
	public String getPseudo()
	{
		return getUser().getPseudo();
	}
	
	public String getRoleName()
	{
		return getRole().getRole();
	}

}

