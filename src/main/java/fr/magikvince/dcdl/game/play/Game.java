package fr.magikvince.dcdl.game.play;

import java.time.LocalDate;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import fr.magikvince.dcdl.game.draw.Draw;
import fr.magikvince.dcdl.game.league.League;

@Entity
@Table(name = "T_GAME")
public class Game {

	@Id
	private int gameId;
	private Player creator;
	private LocalDate startTime;
	private LocalDate endTime;
	private String description;
	
	private Collection<Player> players;
	private Collection<Draw> draws;
	
	private Player winner;
	private Player Loser;
	
	private GameStatus status;
	
	private GameType gameType;// ranked or friendly
	
	private GamePrivacy gamePrivacy;// public or private
	
	private League league; 
	
	public Game()
	{
		
	}

	public int getGameId() {
		return gameId;
	}

	public void setGameId(int gameId) {
		this.gameId = gameId;
	}

	public Player getCreator() {
		return creator;
	}

	public void setCreator(Player creator) {
		this.creator = creator;
	}

	public LocalDate getStartTime() {
		return startTime;
	}

	public void setStartTime(LocalDate startTime) {
		this.startTime = startTime;
	}

	public LocalDate getEndTime() {
		return endTime;
	}

	public void setEndTime(LocalDate endTime) {
		this.endTime = endTime;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Collection<Player> getPlayers() {
		return players;
	}

	public void setPlayers(Collection<Player> players) {
		this.players = players;
	}

	public Collection<Draw> getDraws() {
		return draws;
	}

	public void setDraws(Collection<Draw> draws) {
		this.draws = draws;
	}

	public Player getWinner() {
		return winner;
	}

	public void setWinner(Player winner) {
		this.winner = winner;
	}

	public Player getLoser() {
		return Loser;
	}

	public void setLoser(Player loser) {
		Loser = loser;
	}

	public GameStatus getStatus() {
		return status;
	}

	public void setStatus(GameStatus status) {
		this.status = status;
	}

	public GameType getGameType() {
		return gameType;
	}

	public void setGameType(GameType gameType) {
		this.gameType = gameType;
	}

	public GamePrivacy getGamePrivacy() {
		return gamePrivacy;
	}

	public void setGamePrivacy(GamePrivacy gamePrivacy) {
		this.gamePrivacy = gamePrivacy;
	}

	public League getLeague() {
		return league;
	}

	public void setLeague(League league) {
		this.league = league;
	}
	
}
