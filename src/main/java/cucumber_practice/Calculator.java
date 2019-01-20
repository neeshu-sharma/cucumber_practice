package cucumber_practice;

import java.math.BigDecimal;

public class Calculator {

	public int add(int a, int b) {
		return a + b;
	}

	public double add(double a, double b, int scale) {
		return new BigDecimal(a + b).setScale(scale, BigDecimal.ROUND_HALF_UP).doubleValue();
	}

	public double add(double a, double b) {
		int scale = getNumberOfDecimal(a) > getNumberOfDecimal(b) ? getNumberOfDecimal(a) : getNumberOfDecimal(b);
		return add(a, b, scale);
	}

	private int getNumberOfDecimal(double a) {
		String text = Double.toString(Math.abs(a));
		int integerPlaces = text.indexOf('.');
		return text.length() - integerPlaces - 1;
	}

}
