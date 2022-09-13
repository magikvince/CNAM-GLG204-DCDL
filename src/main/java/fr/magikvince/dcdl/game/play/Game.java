package fr.magikvince.dcdl.game.play;

import java.time.LocalDate;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import fr.magikvince.dcdl.game.draw.Draw;
import fr.magikvince.dcdl.game.league.League;

@Entity
@Table(name = "T_GAME")
public class Game {

	@Id
	private int idGame;
	
	@OneToOne
	@JoinColumn(name="id_player_fk")
	private Player creator;
	
	private LocalDate startTime;
	private LocalDate endTime;
	private String description;
	
	@OneToMany
	@JoinTable(name="id_player_fk")
	private Collection<Player> players;
	
	@OneToMany
	@JoinTable(name="id_draw_fk")
	private Collection<Draw> draws;
	
	@OneToOne
	@JoinColumn(name="winner")
	private Player winner;
	
	@OneToOne
	@JoinColumn(name="loser")
	private Player Loser;
	
	private GameStatus status;
	
	private GameType type;// ranked or friendly
	
	private GamePrivacy privacy;// public or private
	
	@OneToOne
	@JoinColumn(name="id_league_fk")
	private League league; 
	
	public Game()
	{
		
	}

	public int getIdGame() {
		return idGame;
	}

	public void setIdGame(int idGame) {
		this.idGame = idGame;
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

	public GameType getType() {
		return type;
	}

	public void setType(GameType type) {
		this.type = type;
	}

	public GamePrivacy getPrivacy() {
		return privacy;
	}

	public void setPrivacy(GamePrivacy privacy) {
		this.privacy = privacy;
	}

	public League getLeague() {
		return league;
	}

	public void setLeague(League league) {
		this.league = league;
	}
	
}
