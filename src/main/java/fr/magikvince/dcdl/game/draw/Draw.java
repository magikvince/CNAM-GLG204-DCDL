package fr.magikvince.dcdl.game.draw;

import java.util.Date;

public abstract class Draw {

	private int idDraw;
	private Date date;
	private String draw;
	
	public abstract void randomDraw() throws DrawException;
	
	public Draw()
	{
		this.date = new Date();
	}
	
	public int getIdDraw() {
		return idDraw;
	}

	public void setIdDraw(int idDraw) {
		this.idDraw = idDraw;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getDraw() {
		return draw;
	}

	public void setDraw(String draw) {
		this.draw = draw;
	}
	
	
	
	
}
