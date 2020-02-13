package com.nelkinda.training.tdd

import io.cucumber.java.en.Given
import io.cucumber.java.en.Then
import io.cucumber.java.en.When
import org.junit.jupiter.api.Assertions

class CalculatorStepDefs {
    private val calculator: Calculator = Calculator()

    @Given("^the calculator is reset$")
    fun theCalculatorIsReset() {
        calculator.reset()
    }

    @When("entering {string}")
    fun entering(input: String) {
        calculator.enter(input)
    }

    @Then("the display shows {string}")
    fun theDisplayShows(expectedDisplay: String) {
        Assertions.assertEquals(expectedDisplay, calculator.display)
    }
}