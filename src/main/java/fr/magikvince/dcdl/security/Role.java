package fr.magikvince.dcdl.security;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "T_ROLES")
public class Role {
	
	@Id
	private int idRole;
	
	private String role;
	
	@ManyToMany
	@JoinColumn(name="id_user_fk")
	private Collection<User> user;

	public Role()
	{
		
	}

	public int getIdRole() {
		return idRole;
	}

	public void setIdRole(int idRole) {
		this.idRole = idRole;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Collection<User> getUser() {
		return user;
	}

	public void setUser(Collection<User> user) {
		this.user = user;
	}
	
	
	
}

