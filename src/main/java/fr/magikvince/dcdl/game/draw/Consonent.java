package fr.magikvince.dcdl.game.draw;

import java.util.Set;

public class Consonent extends Letter {
	
	private Set<String> consonents = Set.of("b", "c", "d", "f", "g", "h", "j", "k", "l", "m", "n", "p", "q", "r", "s", "t", "v", "w", "x", "z");
	private static final int numberOfConsonents = 20;
	
	
	public Consonent()
	{
		
	}
	
	public Set<String> getConsonents() {
		return consonents;
	}

	public void setConsonents(Set<String> consonents) {
		this.consonents = consonents;
	}

	
	public static int getNumberofconsonent() {
		return numberOfConsonents;
	}

}
