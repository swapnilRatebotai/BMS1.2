package stepDefinitions.channelmanager;

import java.io.IOException;

import org.junit.Assert;

import factory.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.ChannelManagerPage;

public class ChannelManagerSteps {
	
	ChannelManagerPage channelManagerPage = new ChannelManagerPage(BaseClass.getDriver());

	@Then("user is on the Channel Manager page")
	public void user_is_on_the_Channel_Manager_page() {

		boolean channelManagerPageStatus = channelManagerPage.channelManagerPageConfirmation();
		Assert.assertTrue(channelManagerPageStatus);
	}
	
	@When("user disconnects the channel manager")
	public void user_disconnects_the_channel_manager() throws IOException {
	    
		channelManagerPage.clickOnDisconnectButton();
		
		String actualMessageForDisconnectChannelManager = channelManagerPage.waitAndGetSuccessMessageForChannelManager();
		String expectedMessageForDisconnectChannelManager = BaseClass.getProperties().getProperty("DisconnectChannelManagerPopup");
		Assert.assertEquals(actualMessageForDisconnectChannelManager, expectedMessageForDisconnectChannelManager);
		
		channelManagerPage.waitForSuccessPopupOfChannelManagerToDisappear();
	}

	@When("user connects the channel manager")
	public void user_connects_the_channel_manager() throws IOException {
	    
		channelManagerPage.selectChannelManager();
		channelManagerPage.clickOnConnectButton();
		
		String actualMessageForConnectChannelManager = channelManagerPage.waitAndGetSuccessMessageForChannelManager();
		String expectedMessageForConnectChannelManager = BaseClass.getProperties().getProperty("ConnectChannelManagerPopup");
		Assert.assertEquals(actualMessageForConnectChannelManager, expectedMessageForConnectChannelManager);
		
		channelManagerPage.waitForSuccessPopupOfChannelManagerToDisappear();
	}

	@Then("user clicks on reveal secret code")
	public void user_clicks_on_reveal_secret_code() {
	    
		channelManagerPage.showSecretCode();
	}
}
