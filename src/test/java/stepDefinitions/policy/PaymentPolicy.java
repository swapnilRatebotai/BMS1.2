package stepDefinitions.policy;

import java.io.IOException;

import org.junit.Assert;

import factory.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.PaymentPolicyPage;

public class PaymentPolicy {

	PaymentPolicyPage paymentPolicyPage = new PaymentPolicyPage(BaseClass.getDriver());
	
	@Then("user is on the Payment Policy page")
	public void user_is_on_the_Payment_Policy_page() {

		boolean paymentPolicyPageStatus = paymentPolicyPage.PaymentPolicyPageConfirmation();
		Assert.assertTrue(paymentPolicyPageStatus);
	}
	
	@When("user creates payment policy")
	public void user_creates_payment_policy() throws IOException {
	    
		paymentPolicyPage.clickOnCreatePaymentPolicyButton();
		paymentPolicyPage.selectStartDate();
		paymentPolicyPage.selectEndDate();
		paymentPolicyPage.enterPaymentPercentage();
		paymentPolicyPage.clickOnSaveButton();
	}

	@Then("user deletes payment policy")
	public void user_deletes_payment_policy() {
	    
		paymentPolicyPage.clickOnDeleteButton();
	}
}
