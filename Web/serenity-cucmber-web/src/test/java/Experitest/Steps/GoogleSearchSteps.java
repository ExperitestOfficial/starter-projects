package Experitest.Steps;

import Experitest.Pages.GooglePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchSteps {

    GooglePage googlePage;

    @Given("We are on google page")
    public void navigateToGoogle() {
        googlePage.open();
    }

    @When("We search for {string}")
    public void searchForTerm(String term) {
        googlePage.searchFor(term);
    }

    @Then("We should see {string}")
    public void shouldFindInformation(String term) {
        googlePage.lookForResult(term);
    }
}
