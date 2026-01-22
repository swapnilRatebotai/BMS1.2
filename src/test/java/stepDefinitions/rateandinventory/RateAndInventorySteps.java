package stepDefinitions.rateandinventory;

import java.io.IOException;

import org.junit.Assert;

import factory.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.RateAndInventoryPage;

public class RateAndInventorySteps {

	RateAndInventoryPage rateAndInventoryPage = new RateAndInventoryPage(BaseClass.getDriver());
	
	@Then("user is on the Rate and Inventory page")
	public void user_is_on_the_Rate_and_Inventory_page() {

		boolean rateAndInventoryPageStatus = rateAndInventoryPage.rateAndInventoryPageConfirmation();
		Assert.assertTrue(rateAndInventoryPageStatus);
	}
	
	@When("user opens all rooms rate plans")
	public void user_opens_all_rooms_rate_plans() {
	    
		rateAndInventoryPage.clickOnShowAllRateplans();
	}

	@When("user closes a single room rate plan")
	public void user_closes_a_single_room_rate_plan() {
	    
		rateAndInventoryPage.clickOnCollapseRoomButton();
	}

	@When("user opens the single room rate plan")
	public void user_opens_the_single_room_rate_plan() {
	    
		rateAndInventoryPage.clickOnExpandRoomButton();
	}

	@When("user clicks on bulk update")
	public void user_clicks_on_bulk_update() {
	    
		rateAndInventoryPage.clickOnBulkUpdateButton();
	}

	@When("user updates inventory details")
	public void user_updates_inventory_details() throws IOException, InterruptedException {
	    
		rateAndInventoryPage.clickOnInventoryButton();
//		Thread.sleep(1500);
		rateAndInventoryPage.selectFromDateAsToday();
//		Thread.sleep(1500);
		rateAndInventoryPage.selectToDate();
//		Thread.sleep(1500);
		rateAndInventoryPage.selectRoomTypeAsTestRoom();
//		Thread.sleep(1500);
		rateAndInventoryPage.selectDays();
//		Thread.sleep(1500);
		rateAndInventoryPage.enterNumberOfRoomsToSell();
//		Thread.sleep(1500);
		rateAndInventoryPage.clickOnSubmitButton();
//		Thread.sleep(1500);
	}

	@When("user updates rate details")
	public void user_updates_rate_details() throws IOException, InterruptedException {
	    
		rateAndInventoryPage.clickOnRateButton();
//		Thread.sleep(1500);
		rateAndInventoryPage.selectFromDateAsToday();
//		Thread.sleep(1500);
		rateAndInventoryPage.selectToDate();
//		Thread.sleep(1500);
		rateAndInventoryPage.selectRoomTypeAsTestRoom();
//		Thread.sleep(1500);
		rateAndInventoryPage.selectRatePlanType();
//		Thread.sleep(1500);
		rateAndInventoryPage.selectDays();
//		Thread.sleep(1500);
		rateAndInventoryPage.enterRateForFirstOccupancy();
//		Thread.sleep(1500);
		rateAndInventoryPage.enterRateForSecondOccupancy();
//		Thread.sleep(1500);
		rateAndInventoryPage.enterExtraAdultRate();
//		Thread.sleep(1500);
		rateAndInventoryPage.enterExtraChildRate();
//		Thread.sleep(1500);
		rateAndInventoryPage.clickOnSubmitButton();
//		Thread.sleep(1500);
	}

	@When("user selects a date from the calendar")
	public void user_selects_a_date_from_the_calendar() throws IOException, InterruptedException {
	    
		rateAndInventoryPage.selectDateOfCalenderChart();
//		Thread.sleep(1500);
	}

	@When("user navigates to previous calender chart")
	public void user_navigates_to_previous_calender_chart() throws InterruptedException {
	    
		rateAndInventoryPage.clickOnBackButtonOfCalenderChart();
//		Thread.sleep(1500);
	}

	@When("user navigates to next calender chart")
	public void user_navigates_to_next_calender_chart() throws InterruptedException {
	    
		rateAndInventoryPage.clickOnNextButtonOfCalenderChart();
//		Thread.sleep(1500);
	}
	
	@When("user close all rooms rate plans")
	public void user_close_all_rooms_rate_plans() {
	    
		rateAndInventoryPage.clickOnHideAllRateplans();
		
	}
}
