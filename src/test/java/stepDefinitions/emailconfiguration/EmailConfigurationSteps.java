package stepDefinitions.emailconfiguration;

import org.junit.Assert;

import factory.BaseClass;
import io.cucumber.java.en.Then;
import pageObjects.EmailConfigurationPage;

public class EmailConfigurationSteps {

	EmailConfigurationPage emailConfigurationPage = new EmailConfigurationPage(BaseClass.getDriver());
	
	@Then("user is on the Email Configuration page")
	public void user_is_on_the_Email_Configuration_page() {

		boolean emailConfigurationPageStatus = emailConfigurationPage.emailConfigurationPageConfirmation();
		Assert.assertTrue(emailConfigurationPageStatus);
	}
}
