package fr.magikvince.dcdl.social.room;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import fr.magikvince.dcdl.game.play.Player;
import fr.magikvince.dcdl.security.user.User;

@Entity
@Table(name = "T_ROOM")
public class Room {
	
	@Id
	private int idRoom;
	
	private String name;
	private int maxPlayers;
	private String description;
	
	@Transient
	private Collection<Player> players;
	
	public Room()
	{
		
	}
	
	public Room ( String name)
	{
		this.name = name;
		this.players = new ArrayList<Player>();
	}

	public int getIdRoom() {
		return idRoom;
	}

	public void setIdRoom(int idRoom) {
		this.idRoom = idRoom;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMaxPlayers() {
		return maxPlayers;
	}

	public void setMaxPlayers(int maxPlayers) {
		this.maxPlayers = maxPlayers;
	}

	public Collection<Player> getPlayers() {
		return players;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}
