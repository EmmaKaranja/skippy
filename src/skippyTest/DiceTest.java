package skippyTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import skippy2.Dice;

public class DiceTest {

	private Dice die;

	@BeforeEach
	public void setUp() {
		die = new Dice();
		System.out.println(die.getCounter());
	}

	@AfterEach
	public void tearDown() {
		System.out.println(die.getCounter());
		die = null;
	}

	@Test
	void testRoll() {

		String values = "north south east west";

		String result = die.roll();
		assertTrue(values.contains(result));
	}

	@Test
	void testCounter() {
		System.out.println(die.getCounter());

		die.roll();
		die.roll();
		die.roll();
		die.roll();

		assertEquals(5, die.getCounter());
	}
}
