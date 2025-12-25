package stepDefinitions.policy;

import org.junit.Assert;

import factory.BaseClass;
import io.cucumber.java.en.Then;
import pageObjects.PaymentPolicyPage;

public class PaymentPolicy {

	PaymentPolicyPage paymentPolicyPage = new PaymentPolicyPage(BaseClass.getDriver());
	
	@Then("user is on the Payment Policy page")
	public void user_is_on_the_Payment_Policy_page() {

		boolean paymentPolicyPageStatus = paymentPolicyPage.PaymentPolicyPageConfirmation();
		Assert.assertTrue(paymentPolicyPageStatus);
	}
}
