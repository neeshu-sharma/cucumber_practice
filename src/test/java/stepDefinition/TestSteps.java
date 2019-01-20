package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber_practice.Calculator;

public class TestSteps {

	private int a,b;
	@Given("Two integers")
	public void twoIntegers() {
		a=10;
		b=20;
	}
	
	@Then("Return sum of integers")
	public void returnSumOfIntegers(){
		Calculator calculator = new Calculator();
		int c = calculator.add(a, b);
		assert(c == 30);
	}
}
