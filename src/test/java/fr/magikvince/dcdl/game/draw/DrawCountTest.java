package fr.magikvince.dcdl.game.draw;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class DrawCountTest {

	@Test
	public void checkCountWithCorrectRange()
	{
		DrawCount drawcount = new DrawCount();
		drawcount.randomDraw();
		
		assertTrue(drawcount.getCount() <= 999);
		assertTrue(drawcount.getCount() > 0);
		
		DrawCount drawcount2 = new DrawCount();
		drawcount2.randomDraw();
		assertTrue(drawcount2.getCount() <= 999);
		assertTrue(drawcount2.getCount() > 0);
		
		DrawCount drawcount3 = new DrawCount();
		drawcount3.randomDraw();
		assertTrue(drawcount3.getCount() <= 999);
		assertTrue(drawcount3.getCount() > 0);
	}
	
	@Test
	public void checkCountWithIncorrectRange()
	{
		DrawCount drawcount = new DrawCount();
		drawcount.setCount(1230);
		
		assertFalse(drawcount.getCount() <= 999);
				
		DrawCount drawcount2 = new DrawCount();
		drawcount2.randomDraw();
		
		assertTrue(drawcount2.getCount() <= 999);
		assertTrue(drawcount2.getCount() > 0);
	}
	
	/** testing we are getting 6 numbers in list each time **/
	@Test
	public void getCorrectListSize()
	{
		DrawCount drawcount1 = new DrawCount();
		DrawCount drawcount2 = new DrawCount();
		DrawCount drawcount3 = new DrawCount();
		
		drawcount1.randomDraw();
		drawcount2.randomDraw();
		drawcount3.randomDraw();
			
		System.out.println(drawcount1.toString());
		System.out.println(drawcount2.toString());
		System.out.println(drawcount3.toString());
		
		assertTrue( drawcount1.getNumbers().size() == 6);
		assertTrue( drawcount2.getNumbers().size() == 6);
		assertTrue( drawcount3.getNumbers().size() == 6);
	}

	
	@Test
	public void checkNumberOfOccurrencesEqualsTwo()
	{
		DrawCount drawcount1 = new DrawCount();
		
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(5);
		list1.add(10);
		list1.add(5);
		
		drawcount1.setNumbers(list1);
		assertEquals(2, drawcount1.getNumberOfOccurrencesInList(5));
	}
	
	@Test
	public void checkNumberOfOccurrencesEqualsOne()
	{
		DrawCount drawcount2 = new DrawCount();

		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(5);
		list2.add(10);
		list2.add(3);
		list2.add(25);
		list2.add(50);
		
		drawcount2.setNumbers(list2);
		assertEquals(1, drawcount2.getNumberOfOccurrencesInList(50));
	}
	
	@Test
	public void checkNumberOfOccurrencesEqualsZero()
	{
		DrawCount drawcount3 = new DrawCount();

		List<Integer> list3 = new ArrayList<Integer>();
		list3.add(5);
		list3.add(10);
		list3.add(3);
		list3.add(25);
		
		drawcount3.setNumbers(list3);
		assertEquals(0, drawcount3.getNumberOfOccurrencesInList(100));
		
	}
}
