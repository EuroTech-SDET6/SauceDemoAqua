package com.eurotech.saucedemoaqua.stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SliderStepDef {
    @Given("the user is on the slider page")
    public void theUserIsOnTheSliderPage() {

    }

    @When("the user moves the slider to {int}")
    public void theUserMovesTheSliderTo(int targetSliderRange) {
    }

    @Then("the slider should be ranged at {int}")
    public void theSliderShouldBeRangedAt(int expectedSliderRange) {
    }
}
