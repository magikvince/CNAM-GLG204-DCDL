package fr.magikvince.dcdl.game.play;

import java.util.Date;

public class PlayerDTO  {
	
	private int idPlayer;
	public String pseudo;
	private String firstname;
	private String lastname;
	private String email;
	private String password;
	private Date birthdate;
	private String country;
	private String city;
	

	public PlayerDTO(String pseudo) {
		this.pseudo = pseudo;
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

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
}
