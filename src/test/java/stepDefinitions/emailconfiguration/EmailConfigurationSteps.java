package stepDefinitions.emailconfiguration;

import java.io.IOException;

import org.junit.Assert;

import factory.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.EmailConfigurationPage;

public class EmailConfigurationSteps {

	EmailConfigurationPage emailConfigurationPage = new EmailConfigurationPage(BaseClass.getDriver());
	
	@Then("user is on the Email Configuration page")
	public void user_is_on_the_Email_Configuration_page() {

		boolean emailConfigurationPageStatus = emailConfigurationPage.emailConfigurationPageConfirmation();
		Assert.assertTrue(emailConfigurationPageStatus);
	}
	
	@When("user updates email configuration details")
	public void user_updates_email_configuration_details() throws IOException {
	    
		emailConfigurationPage.enterSMTPHost();
		emailConfigurationPage.enterSMTPPort();
		emailConfigurationPage.enterSMTPUsername();
		emailConfigurationPage.enterSMTPPassword();
		emailConfigurationPage.enterFromEmail();
		emailConfigurationPage.enterFromName();
		emailConfigurationPage.selectEncryption();
	}

	@When("user clicks on update email configuration button")
	public void user_clicks_on_update_email_configuration_button() throws IOException, InterruptedException {
	    
//		emailConfigurationPage.clickOnSaveButton();
		emailConfigurationPage.clickOnUpdateButton();
		Thread.sleep(1000);
		
		String actualMessageForEmailConfig = emailConfigurationPage.waitAndGetSuccessMessageForEmailConfigurationUpdate();
		String expectedMessageForEmailConfig = BaseClass.getProperties().getProperty("EmailConfigPopupMessage");
		Assert.assertEquals(actualMessageForEmailConfig, expectedMessageForEmailConfig);
		
//		emailConfigurationPage.waitForSuccessPopupOfEmailConfigurationDisappear();
	}
}
