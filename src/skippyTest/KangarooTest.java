package skippyTest;

import static org.junit.Assert.assertNotEquals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import skippy2.Dice;
import skippy2.Kangaroo;

public class KangarooTest {

	Kangaroo skippy;
	Dice die = new Dice();

	@BeforeEach
	public void setUp() {
		skippy = new Kangaroo();
		skippy.goToStart();
	}

	@AfterEach
	public void tearDown() {
		skippy = null;
	}
	
	@Test
	public void testAtHomeTrue() {
		int size = 7;
		skippy.setxCoord(7);
        skippy.setyCoord(7);
        assertTrue(skippy.atHome(size));
	}
	
	@Test
	public void testAtHomeFalse() {
		int size = 7;
		skippy.setxCoord(8);
        skippy.setyCoord(7);
        assertFalse(skippy.atHome(size));
	}
	
	@Test
	public void testMove() {

		int initialSum = skippy.getY() + skippy.getX();
		skippy.move(die.roll());
		int newVector = skippy.getY() + skippy.getX();
		assertNotEquals(initialSum, newVector);
	}
}
