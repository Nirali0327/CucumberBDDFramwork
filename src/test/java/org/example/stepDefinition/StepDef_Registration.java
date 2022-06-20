package org.example.stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.HomePage;
import org.example.RegistrationPage;

public class StepDef_Registration {
    HomePage homePage = new HomePage();
    RegistrationPage registrationPage = new RegistrationPage();


    @Given("I a on the registration page")
    public void i_a_on_the_registration_page() {
      homePage.userClicksOnRegistration();

    }

    @When("I enter required all registration details")
    public void i_enter_required_all_registration_details() {
     registrationPage.UserFillsRegistrationForm();
    }

    @When("I click on register submit button")
    public void i_click_on_register_submit_button() {
     registrationPage.clickRegistration();

    }

    @Then("I should able to registered successfully")
    public void i_should_able_to_registered_successfully() {
        registrationPage.verifyRegistrationCompleted();

    }


}
