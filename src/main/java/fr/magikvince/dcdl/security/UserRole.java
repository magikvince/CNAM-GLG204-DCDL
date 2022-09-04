package fr.magikvince.dcdl.security;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

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
	private Collection<Role> roles;
	
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

	public Collection<Role> getRoles() {
		return roles;
	}

	public void setRoles(Collection<Role> roles) {
		this.roles = roles;
	}

}

