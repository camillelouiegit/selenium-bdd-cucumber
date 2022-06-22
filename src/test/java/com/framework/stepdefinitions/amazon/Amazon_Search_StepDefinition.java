package com.framework.stepdefinitions.amazon;

import com.framework.core.Browser;
import com.framework.pageobjects.amazon.Amazon_HomePage;
import com.framework.pageobjects.amazon.Amazon_ItemPage;
import com.framework.pageobjects.amazon.Amazon_ResultsPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Amazon_Search_StepDefinition {
    @Given("^user navigates to Amazon India$")
    public void NavigateToAmazonIndia() throws Exception {
        Browser.InitializeTest();
    }

    @When("^user search a specific television brand$")
    public void SearchItem() {
        Amazon_HomePage.HamburgerMenu.searchForTelevisionBrand();
    }

    @And("user sorts the list to Price High to Low")
    public void SortResultPrice() {
        Amazon_ResultsPage.sortResult();
    }

    @And("user selects the second highest priced item")
    public void SelectSecondResult() {
        Amazon_ResultsPage.clickSecondResult();
    }

    @Then("^user successfully verified About this item is displayed$")
    public void VerifyAboutThisItemIsDisplayed() {
        Amazon_ItemPage.verifyItemsPage();
    }

}