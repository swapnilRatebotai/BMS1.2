package stepDefinitions.rateandinventory;

import org.junit.Assert;

import factory.BaseClass;
import io.cucumber.java.en.Then;
import pageObjects.RateAndInventoryPage;

public class RateAndInventorySteps {

	RateAndInventoryPage rateAndInventoryPage = new RateAndInventoryPage(BaseClass.getDriver());
	
	@Then("user is on the Rate and Inventory page")
	public void user_is_on_the_Rate_and_Inventory_page() {

		boolean rateAndInventoryPageStatus = rateAndInventoryPage.rateAndInventoryPageConfirmation();
		Assert.assertTrue(rateAndInventoryPageStatus);
	}
}
