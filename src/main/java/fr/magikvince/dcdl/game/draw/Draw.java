package fr.magikvince.dcdl.game.draw;

import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="DrawType")
public abstract class Draw {

	@Id
	private int idDraw;
	private LocalDateTime date;
	//private DrawType drawType;
	private String draw;
	
	public abstract void randomDraw() throws DrawException;
	
	public Draw()
	{
		
	}
	
	public int getIdDraw() {
		return idDraw;
	}

	public void setIdDraw(int idDraw) {
		this.idDraw = idDraw;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	public String getDraw() {
		return draw;
	}

	public void setDraw(String draw) {
		this.draw = draw;
	}
	
	
	
	
}
