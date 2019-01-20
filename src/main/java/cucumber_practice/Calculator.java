package cucumber_practice;

import java.math.BigDecimal;

public class Calculator {

	public int add(int a, int b) {
		return a+b;
	}

	public double add(double a, double b, int scale) {
		return new BigDecimal(a+b).setScale(scale, BigDecimal.ROUND_HALF_UP).doubleValue();
	}

}
