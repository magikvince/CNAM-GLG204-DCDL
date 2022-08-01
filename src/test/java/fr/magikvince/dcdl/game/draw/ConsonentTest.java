package fr.magikvince.dcdl.game.draw;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

public class ConsonentTest {
	
	@Test
	public void generateRandomLetter()
	{
		String consonent1 = Consonent.generateRandomLetter();
		assertNotNull(consonent1);
		
		Consonent.displayConsonents();
		Consonent.displaylastRandomLetter();
		
		String consonent2 = Consonent.generateRandomLetter();
		assertNotNull(consonent2);
		
		Consonent.displayConsonents();
		Consonent.displaylastRandomLetter();
		
		String consonent3 = Consonent.generateRandomLetter();
		assertNotNull(consonent3);
		
		Consonent.displayConsonents();
		Consonent.displaylastRandomLetter();
	}

}
