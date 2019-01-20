package cucumber_practice;

import org.junit.Test;

public class CalculatorTest {

	Calculator calculator = new Calculator();
	
	@Test
	public void testAddIntergers() {
		int a = 10;
		int b = 20;
		int c = calculator.add(a, b);
		assert(c == 30);
	}
	/**
	 * New requirement came up.
	 * Add two doubles.
	 */
}

