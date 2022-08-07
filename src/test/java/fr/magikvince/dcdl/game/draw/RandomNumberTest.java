package fr.magikvince.dcdl.game.draw;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class RandomNumberTest {


	@Test
	public void testGenerateRandomNumber()
	{
		RandomNumber.generateRandomNumber();
		RandomNumber.displayAuthorizedNumbers();
		RandomNumber.displaylastRandomNumber();
		
		RandomNumber.generateRandomNumber();
		RandomNumber.displayAuthorizedNumbers();
		RandomNumber.displaylastRandomNumber();
		
		RandomNumber.generateRandomNumber();
		RandomNumber.displayAuthorizedNumbers();
		RandomNumber.displaylastRandomNumber();
	}
	
	@Test
	/** test if generated number value is correct and is one of element of authorized numbers **/
	public void GeneratedRandomNumberCorrectValue()
	{
		
	}

}
