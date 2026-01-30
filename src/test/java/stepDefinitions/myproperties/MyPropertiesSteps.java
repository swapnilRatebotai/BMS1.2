package stepDefinitions.myproperties;

import org.junit.Assert;

import factory.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.ChannelManagerPage;
import pageObjects.HeaderPage;
import pageObjects.MyPropertiesPage;

public class MyPropertiesSteps {
	
	MyPropertiesPage myPropertiesPage = new MyPropertiesPage(BaseClass.getDriver());
	ChannelManagerPage channelManagerPage = new ChannelManagerPage(BaseClass.getDriver());
	HeaderPage headerPage = new HeaderPage(BaseClass.getDriver());
	
	@When("user navigates to My Properties page")
	public void user_navigates_to_my_properties_page() {
	    
		headerPage.clickOnLogo();
	}
	
	@Given("user is on the My Properties page")
	public void user_is_on_the_my_properties_page() {
		
		BaseClass.getLogger().info("User is on My Properties Page...");
		
		boolean myPropertiesPageStatus = myPropertiesPage.myPropertiesPageConfirmation();
		Assert.assertTrue(myPropertiesPageStatus);
	}

	@When("user selects property from the property list")
	public void user_selects_property_from_the_property_list() throws InterruptedException {

		Thread.sleep(1000);
		myPropertiesPage.clickOnPropertyHiltonStays();
	}

	@Then("user should be redirected to the Channel Manager page")
	public void user_should_be_redirected_to_the_channel_manager_page() {
		BaseClass.getLogger().info("User is on Channel Manager Page...");
		
		boolean channelManagerPageStatus = channelManagerPage.channelManagerPageConfirmation();
		Assert.assertTrue(channelManagerPageStatus);
	}
}
