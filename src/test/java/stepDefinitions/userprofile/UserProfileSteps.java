package stepDefinitions.userprofile;

import java.io.IOException;

import org.junit.Assert;

import factory.BaseClass;
//import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HeaderPage;
import pageObjects.LoginPage;
import pageObjects.MyPropertiesPage;
import pageObjects.UserProfilePage;

public class UserProfileSteps {

	HeaderPage headerPage = new HeaderPage(BaseClass.getDriver());
	MyPropertiesPage myPropertiesPage = new MyPropertiesPage(BaseClass.getDriver());
	LoginPage loginPage = new LoginPage(BaseClass.getDriver());
	UserProfilePage userProfilePage = new UserProfilePage(BaseClass.getDriver());
	
	
	@When("user navigates to My Profile page")
	public void user_navigates_to_my_profile_page() throws InterruptedException {
		
		headerPage.clickOnProfileOption();
		headerPage.clickOnMyProfile();
		
		boolean userProfilePageStatus = userProfilePage.userProfilePageConfirmation();
		Assert.assertTrue(userProfilePageStatus);
		
	}

	@When("user clicks on Edit Profile")
	public void user_clicks_on_edit_profile() {
	    
		userProfilePage.clickOnEditProfileButton();
	}

	@When("user updates profile details")
	public void user_updates_profile_details() throws IOException {
	    
		userProfilePage.enterFirstName();
		userProfilePage.enterLastName();
		userProfilePage.enterPrimaryNumber();
		userProfilePage.enterSecondaryNumber();
	}

	@When("user clicks on Save Changes")
	public void user_clicks_on_save_changes() throws IOException {
		
	    userProfilePage.clickOnSaveChangesButton();
	    
	    String actualMessage = userProfilePage.waitAndGetSuccessMessage();
	 	String popupMessage = BaseClass.getProperties().getProperty("UserProfilePopupMessage");
	 	Assert.assertEquals(actualMessage, popupMessage);
	}

	@Then("user navigates back from the profile page")
	public void user_navigates_back_from_the_profile_page() {
		
		BaseClass.getDriver().navigate().back();
	   	myPropertiesPage.myPropertiesPageConfirmation();
	}
}
