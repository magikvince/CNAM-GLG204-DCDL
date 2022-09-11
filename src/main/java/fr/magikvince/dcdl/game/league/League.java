package fr.magikvince.dcdl.game.league;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "T_LEAGUE")
public class League {
	
	@Id
	private int LeagueId;
	private String leagueName;
	private int timeCount;
	private int timeLetter;
	private String description;

	public League()
	{
		
	}

	public int getLeagueId() {
		return LeagueId;
	}


	public void setLeagueId(int leagueId) {
		LeagueId = leagueId;
	}

	public String getLeagueName() {
		return leagueName;
	}

	public void setLeagueName(String leagueName) {
		this.leagueName = leagueName;
	}

	public int getTimeCount() {
		return timeCount;
	}


	public void setTimeCount(int timeCount) {
		this.timeCount = timeCount;
	}


	public int getTimeLetter() {
		return timeLetter;
	}


	public void setTimeLetter(int timeLetter) {
		this.timeLetter = timeLetter;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}
		
}
