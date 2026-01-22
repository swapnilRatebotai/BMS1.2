package pageObjects;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import factory.BaseClass;

public class DiscountsPage extends BasePage {

	WebDriver driver;

	public DiscountsPage(WebDriver driver) {
		super(driver);
	}

	// Elements
	@FindBy(xpath = "//div[text()='Discounts'][@class='form-header']")
	WebElement discountsPageConf;
	
	@FindBy(xpath="//button[normalize-space()='Create Discount']")
	WebElement createDiscountButton;
	
	@FindBy(css="#Name")
	WebElement discountNameInput;
	
	@FindBy(css="#Description")
	WebElement discountDescriptionInput;
	
	@FindBy(xpath="//input[@id='Start Date']")
	WebElement startDateInput;
	
	@FindBy(xpath="//input[@id='End Date']")
	WebElement endDateInput;
	
	@FindBy(css="#Percentage")
	WebElement discountPercentageInput;
	
	@FindBy(css="#true")
	WebElement loginRequiredRadioButton;
	
	@FindBy(css="#false")
	WebElement loginNotRequiredRadioButton;
	
	@FindBy(xpath="//button[normalize-space()='Cancel']")
	WebElement cancelButton;
	
	@FindBy(xpath="//button[normalize-space()='Submit']")
	WebElement submitButton;
	
	@FindBy(xpath="//*[name()='path' and contains(@d,'M 14.98437')]")
	WebElement deleteDiscountButton;

	// Actions
	public boolean discountsPageConfirmation() {
		
		return discountsPageConf.isDisplayed();
	}
	
	public void clickOnCreateDiscountButton() {
		
		createDiscountButton.click();
	}
	
	public void enterDiscountName() throws IOException {
		
		String discountname = BaseClass.getProperties().getProperty("DiscountName");
		discountNameInput.sendKeys(discountname);
	}
	
	public void enterDiscountDescription() throws IOException {
		
		String discountdescription = BaseClass.getProperties().getProperty("DiscountDescription");
		discountDescriptionInput.sendKeys(discountdescription);
	}
	
	public void selectStartDate() {
		
		LocalDate today = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		String todayDate = today.format(formatter);
		startDateInput.sendKeys(todayDate);
	}
	
	public void selectEndDate() throws IOException {
		
		String enddate = BaseClass.getProperties().getProperty("EndDateOfDiscountPolicy");
		endDateInput.sendKeys(enddate);
	}
	
	public void enterDiscountPercentage() throws IOException {
		
		String discountpercentage = BaseClass.getProperties().getProperty("DiscountPercentage");
		discountPercentageInput.sendKeys(discountpercentage);
	}
	
	public void selectLoginRequired() throws IOException {
		
		String loginrequired = BaseClass.getProperties().getProperty("LoginRequired");
		
		if(loginrequired.equalsIgnoreCase("yes")) {
			
			loginRequiredRadioButton.click();
		}
		else {
			loginNotRequiredRadioButton.click();
		}
	}
	
	public void clickOnCancelButton() {
		
		cancelButton.click();
	}
	
	public void clickOnSubmitButton() {
		
		submitButton.click();
	}
	
	public void clickOndeleteButton() {
		
		deleteDiscountButton.click();
	}
}
