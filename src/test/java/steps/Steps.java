package steps;

import calculator.SimpleCalc;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.testng.AbstractTestNGCucumberTests;

import static org.testng.Assert.assertEquals;

/**
 * Created by user on 1/9/2017.
 */
public class Steps extends AbstractTestNGCucumberTests {
    private SimpleCalc calc;

    @Given("^a calculator I just turned on$")
    public void a_calculator_I_just_turned_on() {
        calc = new SimpleCalc();
    }

    @When("^I add (\\d+) and (\\d+)$")
    public void adding(int arg1, int arg2) {
        calc.plus(arg1,arg2);
    }

    @Then("^the result is (\\d+)$")
    public void the_result_is(double expected) {
        assertEquals(expected, calc.getValue());
    }
}
