package fr.magikvince.dcdl.security;

public class Player extends Person {
	
	
	private String firstname;
	private String lastname;

	public Player(String pseudo) {
		super(pseudo);
		// TODO Auto-generated constructor stub
	}

	public Player() {
		// TODO Auto-generated constructor stub
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

	
}
