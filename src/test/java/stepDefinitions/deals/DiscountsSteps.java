package stepDefinitions.deals;

import java.io.IOException;

import org.junit.Assert;

import factory.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.DiscountsPage;

public class DiscountsSteps {

	DiscountsPage discountsPage = new DiscountsPage(BaseClass.getDriver());
	
	@Then("user is on the Discounts page")
	public void user_is_on_the_Discounts_page() {

		boolean discountsPageStatus = discountsPage.discountsPageConfirmation();
		Assert.assertTrue(discountsPageStatus);
	}
	
	@When("user creates a discount")
	public void user_creates_a_discount() throws IOException {
	    
		discountsPage.clickOnCreateDiscountButton();
		discountsPage.enterDiscountName();
		discountsPage.enterDiscountDescription();
		discountsPage.selectStartDate();
		discountsPage.selectEndDate();
		discountsPage.enterDiscountPercentage();
		discountsPage.selectLoginRequired();
		discountsPage.clickOnSubmitButton();
	}

	@Then("user deletes the discount")
	public void user_deletes_the_discount() {
	    
		discountsPage.clickOndeleteButton();
	}
}
