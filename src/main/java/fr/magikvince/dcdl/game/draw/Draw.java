package fr.magikvince.dcdl.game.draw;

import java.util.Date;

public abstract class Draw {

	private int id;
	private Date date;
	private String draw;
	
	public abstract void randomDraw();
	
	public Draw()
	{
		this.date = new Date();
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
