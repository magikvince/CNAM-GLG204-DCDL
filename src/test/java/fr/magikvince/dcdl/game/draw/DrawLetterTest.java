package fr.magikvince.dcdl.game.draw;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class DrawLetterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	@Test
	public void getWishedVowels()
	{
		DrawLetter drawletter = new DrawLetter(5);
		assertEquals(5 , drawletter.getWishedVowels());
		
		DrawLetter drawletter2 = new DrawLetter(3);
		assertEquals(3 , drawletter2.getWishedVowels());
		
		DrawLetter drawletter3 = new DrawLetter(6);
		assertEquals(6 , drawletter3.getWishedVowels());
	}
	
	/** testing we are getting 10 letters each time **/
	@Test
	public void getCorrectNumberOfLetters()
	{
		DrawLetter drawletter = new DrawLetter(5);
		DrawLetter drawletter2 = new DrawLetter(3);
		DrawLetter drawletter3 = new DrawLetter(7);
		
		try {
			drawletter.randomDraw();
			drawletter2.randomDraw();
			drawletter3.randomDraw();
		} catch (DrawException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(drawletter.toString());
		System.out.println(drawletter2.toString());
		System.out.println(drawletter3.toString());
		
		assertTrue( drawletter.getLetters().size() == 10);
		assertTrue( drawletter2.getLetters().size() == 10);
		assertTrue( drawletter3.getLetters().size() == 10);
	}

}
