package com.credersi.animals;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CatTest {
	@Test
	public void testInitialState() {
		Cat cat = new Cat();
		assertTrue(cat.isAlive());
		assertEquals(cat.howHungry(), 50);
	}
	
	@Test
	public void testCatRuns() {
		Cat cat = new Cat();
		cat.runs();
		assertEquals(cat.howHungry(), 80);
	}
	
	
	
	@Test
	public void testCatWillJump() {
		Cat cat = new Cat();
		cat.willJump();
		assertEquals(cat.howHungry(), 60);
	}
	
	@Test
	public void testCatDead() {
		Cat cat = new Cat();
		cat.runs();
		cat.runs();
		assertTrue(cat.isAlive());
	}
	
	@Test 
	public void testCatFullHealth() {
		Cat cat = new Cat();
		cat.feeds();
		cat.feeds();
		cat.feeds();
		assertEquals(cat.howHungry(), 0);
		}
	
	@Test
	public void testCatDies() {
		Cat cat = new Cat();
		cat.runs();
		cat.runs();
		assertTrue(cat.isAlive());
		}
	
	@Test
	public void testKillCatNineTimes() {
		Cat cat = new Cat();
		for (int i = 0; i <= 8; i++) {
			cat.runs();
			cat.runs();
		}
		assertFalse(cat.isAlive());
	}
	
	@Test
	public void testKillCatEightTimes() {
		Cat cat = new Cat();
		for (int i = 0; i <= 7; i++) {
			cat.runs();
			cat.runs();
		}
		assertTrue(cat.isAlive());
	}
	
}