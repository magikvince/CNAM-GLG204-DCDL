package fr.magikvince.dcdl.game.solution;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import fr.magikvince.dcdl.game.draw.Draw;
import fr.magikvince.dcdl.game.play.Player;

@Entity
@Table(name = "T_SOLUTION")
public class Solution {

	@Id
	private int solutionId;
	
	private Draw draw;
	private Player player;
	
	private Collection<SolutionDetail> solutionDetails;
	
	private String result;
	
	
	public Solution()
	{
		
	}

	public int getSolutionId() {
		return solutionId;
	}

	public void setSolutionId(int solutionId) {
		this.solutionId = solutionId;
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
