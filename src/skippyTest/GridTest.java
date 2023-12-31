package skippyTest;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import skippy2.Grid;

public class GridTest {

	public Grid grid;

	@BeforeEach
	public void setUp() {
		grid = new Grid();
	}

	@AfterEach
	public void tearDown() {
		grid = null;
	}

	@Test
	public void testliesOutsideTrue() {
		grid.setSize(7);
		assertTrue(grid.liesOutside(8, 7));
	}

	@Test
	public void testliesOutsideFalse() {
		grid.setSize(7);
		assertFalse(grid.liesOutside(7, 7));
	}

	@Test
	public void testAtHomeTrue() {
		grid.setSize(7);
		assertTrue(grid.atHome(7, 7));
	}

	@Test
	public void testAtHomeFalse() {
		grid.setSize(7);
		assertFalse(grid.atHome(8, 7));
	}
}
