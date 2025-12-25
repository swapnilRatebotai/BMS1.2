package stepDefinitions.policy;

import org.junit.Assert;

import factory.BaseClass;
import io.cucumber.java.en.Then;
import pageObjects.CancellationPolicyPage;

public class CancellationPolicySteps {

	CancellationPolicyPage cancellationPolicyPage = new CancellationPolicyPage(BaseClass.getDriver());
	
	@Then("user is on the Cancellation Policy page")
	public void user_is_on_the_Cancellation_Policy_page() {

		boolean cancellationPolicyPageStatus = cancellationPolicyPage.cancellationPolicyPageConfirmation();
		Assert.assertTrue(cancellationPolicyPageStatus);
	}
}
