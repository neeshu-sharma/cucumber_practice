package cucumber_practice;

import org.junit.Test;

public class CalculatorTest {

	Calculator calculator = new Calculator();

	@Test
	public void testAddIntergers() {
		int a = 10;
		int b = 20;
		int c = calculator.add(a, b);
		assert (c == 30);
	}

	/**
	 * send scale along with numbers. Client is upset. He don't know what scale is.
	 * He won't give you ####scale####. He says give me decimals equals to maximum
	 * decimal in any number.
	 */
	@Test
	public void testAddDouble() {
		double a = 10.3;
		double b = 20.6;
		double c = calculator.add(a, b);
		assert (c == 30.9);
		a = 10.03;
		b = 20.06;
		c = calculator.add(a, b);
		assert (c == 30.09);
	}
}
