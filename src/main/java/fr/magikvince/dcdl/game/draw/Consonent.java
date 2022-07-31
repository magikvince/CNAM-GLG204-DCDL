package fr.magikvince.dcdl.game.draw;

import java.util.Random;
import java.util.List;

public class Consonent {
	
	private static final List<String> consonents = List.of("b", "c", "d", "f", "g", "h", "j", "k", "l", "m", "n", "p", "q", "r", "s", "t", "v", "w", "x", "z");
	private static final int numberOfConsonents = 20;
	
	private static Random random;
	
	public Consonent()
	{
		this.random = new Random();
	}
	
	public static String generateRandomLetter()
	{
		int position = random.nextInt(numberOfConsonents);
		
		return consonents.get(position);
	}

}
