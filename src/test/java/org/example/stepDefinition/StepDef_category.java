package org.example.stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.HomePage;
import org.example.Utils;

public class StepDef_category {
    HomePage homepage = new HomePage();
    @Given("User is on homepage")
    public void user_is_on_homepage() {
        homepage.verifyCurrentUrl("url");
    }
    @When("User click on {string} link from header bar")
    public void user_click_on_link_from_header_bar(String category_name) {
        homepage.categoryList(category_name);

    }
    @Then("User should be able to successfully navigated to related {string} category page")
    public void user_should_be_able_to_successfully_navigated_to_related_category_page(String category_url) {
        Utils.verifyCategoryUrl(category_url);
    }
}
