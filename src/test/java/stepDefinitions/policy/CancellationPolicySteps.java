package stepDefinitions.policy;

import java.io.IOException;

import org.junit.Assert;

import factory.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.CancellationPolicyPage;

public class CancellationPolicySteps {

	CancellationPolicyPage cancellationPolicyPage = new CancellationPolicyPage(BaseClass.getDriver());
	
	@Then("user is on the Cancellation Policy page")
	public void user_is_on_the_Cancellation_Policy_page() {

		boolean cancellationPolicyPageStatus = cancellationPolicyPage.cancellationPolicyPageConfirmation();
		Assert.assertTrue(cancellationPolicyPageStatus);
	}
	
	@When("user creates a simple cancellation policy")
	public void user_creates_a_simple_cancellation_policy() throws IOException {
	    
		cancellationPolicyPage.clickOnCreatePolicyButton();
		cancellationPolicyPage.selectStartDate();
		cancellationPolicyPage.selectEndDate();
		cancellationPolicyPage.enterFreeCancellationDays();
		cancellationPolicyPage.selectNoRefundIfCancelledWithinDays();
		cancellationPolicyPage.clickOnSaveButton();
		
	}

	@When("user creates a custom cancellation policy")
	public void user_creates_a_custom_cancellation_policy() throws IOException {
	    
		cancellationPolicyPage.clickOnCreatePolicyButton();
		cancellationPolicyPage.selectStartDate();
		cancellationPolicyPage.selectEndDate();
		cancellationPolicyPage.enterFreeCancellationDays();
		cancellationPolicyPage.selectCreateCancellationCharges();
		cancellationPolicyPage.enterCancellationChargesForNoShow();
		cancellationPolicyPage.enterCancellationCharges();
		cancellationPolicyPage.clickOnSaveButton();
		
	}

	@Then("user deletes simple cancellation policy")
	public void user_deletes_simple_cancellation_policy() {
	    
		cancellationPolicyPage.clickOnDeletePolicyButton();
	}

	@Then("user deletes custom cancellation policy")
	public void user_deletes_custom_cancellation_policy() {
	    
		cancellationPolicyPage.clickOnDeletePolicyButton();
	}
}
