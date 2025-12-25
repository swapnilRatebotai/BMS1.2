package stepDefinitions.paymentgateway;

import org.junit.Assert;

import factory.BaseClass;
import io.cucumber.java.en.Then;
import pageObjects.PaymentGatewayPage;

public class PaymentGatewaySteps {

	PaymentGatewayPage paymentGatewayPage = new PaymentGatewayPage(BaseClass.getDriver());
	
	@Then("user is on the Payment Gateway page")
	public void user_is_on_the_Payment_Gateway_page() {

		boolean paymentGatewayPageStatus = paymentGatewayPage.paymentGatewayPageConfirmation();
		Assert.assertTrue(paymentGatewayPageStatus);
	}
}
