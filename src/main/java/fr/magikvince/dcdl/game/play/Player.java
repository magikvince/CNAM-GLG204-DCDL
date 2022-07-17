package fr.magikvince.dcdl.game.play;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "T_PLAYER")
public class Player {
	
	@Id
	private int idPlayer;
	public String pseudo;
		
	@Transient
	public boolean isOnline;
	@Transient
	public boolean isRegistered;
	
	public Player(String pseudo) {
		this.pseudo = pseudo;
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
		return pseudo;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
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
