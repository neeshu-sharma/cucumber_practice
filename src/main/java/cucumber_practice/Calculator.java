package cucumber_practice;

import java.math.BigDecimal;

public class Calculator {

	public int add(int a, int b) {
		return a+b;
	}

	public double add(double a, double b) {
		return new BigDecimal(a+b).setScale(1, BigDecimal.ROUND_HALF_UP).doubleValue();
	}

}
