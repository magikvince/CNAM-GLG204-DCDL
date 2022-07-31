package fr.magikvince.dcdl.game.draw;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
	}

}
