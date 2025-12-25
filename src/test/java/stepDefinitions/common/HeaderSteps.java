package stepDefinitions.common;

import factory.BaseClass;
import io.cucumber.java.en.When;
import pageObjects.HeaderPage;

public class HeaderSteps {

HeaderPage headerPage = new HeaderPage(BaseClass.getDriver());
	
	@When("user logs out from the BMS application")
	public void user_logs_out_from_the_bms_application() {

		headerPage.clickOnProfileOption();
		headerPage.clickOnLogout();
	}
}
