package fr.magikvince.dcdl.game.solution;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import fr.magikvince.dcdl.game.draw.Draw;
import fr.magikvince.dcdl.game.play.Player;

@Entity
@Table(name = "T_SOLUTION")
public class Solution {

	@Id
	private int idSolution;
	
	@ManyToOne
	@JoinColumn(name="id_draw_fk")
	private Draw draw;
	
	@ManyToOne
	@JoinColumn(name="id_player_fk")
	private Player player;
	
	@OneToMany
	@JoinColumn(name="id_solution_fk")
	private Collection<SolutionDetail> solutionDetails;
	
	private String result;
	
	
	public Solution()
	{
		
	}


	public int getIdSolution() {
		return idSolution;
	}

	public void setIdSolution(int idSolution) {
		this.idSolution = idSolution;
	}

	public Draw getDraw() {
		return draw;
	}

	public void setDraw(Draw draw) {
		this.draw = draw;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public Collection<SolutionDetail> getSolutionDetails() {
		return solutionDetails;
	}

	public void setSolutionDetails(Collection<SolutionDetail> solutionDetails) {
		this.solutionDetails = solutionDetails;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}
	
	
	
}
