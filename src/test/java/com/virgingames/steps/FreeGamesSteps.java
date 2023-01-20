package com.virgingames.steps;

import com.virgingames.pages.FreeGamesPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class FreeGamesSteps {



    @Given("^I am on homepage$")
    public void iAmOnHomepage() {

    }

    @When("^I click on free games link$")
    public void iClickOnFreeGamesLink() {
        new FreeGamesPage().clickOnFreeGamesLink();
    }

    @Then("^I should navigate to free games page successfully$")
    public void iShouldNavigateToFreeGamesPageSuccessfully() {
        String expectedMessage = "Experience a Selection of Free Games";
        String actualMessage = new FreeGamesPage().getText();
        Assert.assertEquals("Invalid page displayed", expectedMessage, actualMessage);
    }

    @Given("^I click on url$")
    public void iClickOnUrl() {

    }

    @When("^I accepted cookies$")
    public void iAcceptedCookies() {
        new FreeGamesPage().acceptCookie();
    }
}
