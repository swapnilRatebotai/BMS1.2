package stepDefinitions.common;

import java.io.IOException;

import org.junit.Assert;

import factory.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.MyPropertiesPage;
import pageObjects.LoginPage;

public class LoginSteps {
	
	LoginPage loginPage  = new LoginPage(BaseClass.getDriver());
	MyPropertiesPage myPropertiesPage = new MyPropertiesPage(BaseClass.getDriver());
	
	
	@Then("user is on the login page")
	public void user_is_on_the_login_page() {
		loginPage.loginPageConfirmation();
	}
	
	@Given("user logs into the BMS application")
	public void user_logs_into_the_BMS_application() throws IOException {

		BaseClass.getLogger().info("Userr is on Login Page...");
		
		boolean loginPgStatus = loginPage.loginPageConfirmation();
		Assert.assertTrue(loginPgStatus);
		
		BaseClass.getLogger().info("Entering username and password...");

		String username = BaseClass.getProperties().getProperty("username");
		loginPage.enterUsername(username);
		String password = BaseClass.getProperties().getProperty("password");
		loginPage.enterPassword(password);

		BaseClass.getLogger().info("Click on Login Button...");

		loginPage.clickOnLoginButton();
		
		BaseClass.getLogger().info("User is on My Properties Page...");

		boolean myPropPageStatus = myPropertiesPage.myPropertiesPageConfirmation();
		Assert.assertTrue(myPropPageStatus);
	}
}
