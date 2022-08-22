package fr.magikvince.dcdl.game.play;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import fr.magikvince.dcdl.security.User;

@Entity
@Table(name = "T_PLAYER")
public class Player {
	
	@Id
	private int idPlayer;
	
	@OneToOne
	@JoinColumn(name="id_user_fk")
	private User user;
	
	@Transient
	public boolean isOnline;
	@Transient
	public boolean isRegistered;
	
	public Player(User user) {
		this.user = user;
	}

	public Player() {

	}

	public int getIdPlayer() {
		return idPlayer;
	}

	public void setIdPlayer(int idPlayer) {
		this.idPlayer = idPlayer;
	}

	public String getPseudo() {
		return user.getPseudo();
	}

	public boolean isOnline() {
		return isOnline;
	}

	public void setOnline(boolean isOnline) {
		this.isOnline = isOnline;
	}

	public boolean isRegistered() {
		return isRegistered;
	}

	public void setRegistered(boolean isRegistered) {
		this.isRegistered = isRegistered;
	}
	
}
