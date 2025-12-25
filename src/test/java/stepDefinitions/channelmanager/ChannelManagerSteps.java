package stepDefinitions.channelmanager;

import org.junit.Assert;

import factory.BaseClass;
import io.cucumber.java.en.Then;
import pageObjects.ChannelManagerPage;

public class ChannelManagerSteps {
	
	ChannelManagerPage channelManagerPage = new ChannelManagerPage(BaseClass.getDriver());

	@Then("user is on the Channel Manager page")
	public void user_is_on_the_Channel_Manager_page() {

		boolean channelManagerPageStatus = channelManagerPage.channelManagerPageConfirmation();
		Assert.assertTrue(channelManagerPageStatus);
	}
}
