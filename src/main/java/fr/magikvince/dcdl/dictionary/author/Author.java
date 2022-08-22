package fr.magikvince.dcdl.dictionary.author;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "T_AUTHOR")
public class Author {
	
	@Id
	private int idAuthor;
	private String pseudo;
	private String firstname;
	private String lastname;
	
	public Author(String pseudo, String firstname, String lastname)
	{
		this.pseudo = pseudo;
		this.firstname = firstname;
		this.lastname = lastname;
	}

	public Author() {
	}

	public int getIdAuthor() {
		return idAuthor;
	}

	public void setIdAuthor(int idAuthor) {
		this.idAuthor = idAuthor;
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

	
	
}
