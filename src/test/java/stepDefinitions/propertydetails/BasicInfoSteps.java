package stepDefinitions.propertydetails;

import org.junit.Assert;

import factory.BaseClass;
import io.cucumber.java.en.Then;
import pageObjects.BasicInfoPage;

public class BasicInfoSteps {

	BasicInfoPage basicInfoPage = new BasicInfoPage(BaseClass.getDriver());
	
	@Then("user is on the Basic Info page")
	public void user_is_on_the_Basic_Info_page() {

		boolean basicInfoPageStatus = basicInfoPage.basicInfoPageConfirmation();
		Assert.assertTrue(basicInfoPageStatus);
	}
}
