package skippyTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import skippy2.Dice;
import skippy2.Kangaroo;

public class Kangarootestv2 {
	
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
	public void testMove() {
		
		int initialSum = skippy.getY() + skippy.getX();
		skippy.move(die.roll());
		int newVector = skippy.getY() + skippy.getX();
		
//		assertEquals(initialSum, newVector);
       assertNotEquals(initialSum, newVector);

	}
	
	

}
