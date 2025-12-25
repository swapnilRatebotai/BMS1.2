package stepDefinitions.deals;

import org.junit.Assert;

import factory.BaseClass;
import io.cucumber.java.en.Then;
import pageObjects.DiscountsPage;

public class DiscountsSteps {

	DiscountsPage discountsPage = new DiscountsPage(BaseClass.getDriver());
	
	@Then("user is on the Discounts page")
	public void user_is_on_the_Discounts_page() {

		boolean discountsPageStatus = discountsPage.discountsPageConfirmation();
		Assert.assertTrue(discountsPageStatus);
	}
}
