package fr.magikvince.dcdl.security;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import fr.magikvince.dcdl.security.user.User;

@Entity
@Table(name = "T_CONNECTION")
public class Connection {
	
	@Id
	int idConnection;
	
	LocalDateTime dtLogon;
	LocalDateTime dtLogout;
	
	@ManyToOne
	@JoinColumn(name="id_user_fk")
	User user;
	
	public Connection()
	{
		
	}
	
	
	public int getIdConnection() {
		return idConnection;
	}
	public void setIdConnection(int idConnection) {
		this.idConnection = idConnection;
	}
	public LocalDateTime getDtLogon() {
		return dtLogon;
	}
	public void setDtLogon(LocalDateTime dtLogon) {
		this.dtLogon = dtLogon;
	}
	public LocalDateTime getDtLogout() {
		return dtLogout;
	}
	public void setDtLogout(LocalDateTime dtLogout) {
		this.dtLogout = dtLogout;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	
}
