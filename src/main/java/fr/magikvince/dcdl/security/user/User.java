package fr.magikvince.dcdl.security.user;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import fr.magikvince.dcdl.security.role.Role;

@Entity
@Table(name = "T_USER")
public class User {
	
	@Id
	private int idUser;
	
	@Column(name="is_enabled")
	private boolean isEnabled;
	
	@Column(name="creation_datetime")
	private LocalDateTime CreationDateTime;
	private String pseudo;
	private String firstname;
	private String lastname;
	private String email;
	private String password;
	private LocalDate birthdate;
	
	@Transient
	private String birthdateAsText;
	
	private String country;
	private String city;
	
	@Transient
	private boolean isOnline;
	
	
	@ManyToMany
	@JoinTable(name = "T_USER_ROLE",
			   joinColumns = @JoinColumn(name = "id_user_fk"),
			   inverseJoinColumns = @JoinColumn(name = "id_role_fk"))
	private Collection<Role> roles;
	
	public User(String pseudo) {
		this.pseudo = pseudo;
	}

	public User() {

	}

	public int getIdUser() {
		return idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}
	
	public boolean isEnabled() {
		return isEnabled;
	}

	public void setEnabled(boolean isEnabled) {
		this.isEnabled = isEnabled;
	}

	public LocalDateTime getCreationDateTime() {
		return CreationDateTime;
	}

	public void setCreationDateTime(LocalDateTime creationDateTime) {
		CreationDateTime = creationDateTime;
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

	public LocalDate getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(LocalDate birthdate) {
		this.birthdate = birthdate;
	}
	
	public void setBirthdate(String birthdate) {
		this.birthdate = LocalDate.parse(birthdate);
	}

	public String getBirthdateAsText() {
		return birthdateAsText;
	}

	public void setBirthdateAsText(String birthdateAsText) {
		this.birthdateAsText = birthdateAsText;
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

	public boolean isOnline() {
		return isOnline;
	}

	public void setOnline(boolean isOnline) {
		this.isOnline = isOnline;
	}
	
	public Collection<Role> getRoles() {
		return roles;
	}

	public void setRoles(Collection<Role> roles) {
		this.roles = roles;
	}

	@Override
	public String toString()
	{
		String texte = 	"\n" 
		+ "creationDateTime : " + getCreationDateTime() + "\n"
	    + "pseudo : " + getPseudo() + "\n" 
        + "firstname : " + getFirstname() + "\n"
		+ "lastname : " + getLastname() + "\n"
		+ "email : " + getEmail() + "\n"
		+ "country : " + getCountry() + "\n"
		+ "city : " + getCity() + "\n"
		+ "birthdateAsText : " + getBirthdateAsText() + "\n"
		+ "birthdate : " + getBirthdate().toString() + "\n"; 
		
		return texte;
	}

}
