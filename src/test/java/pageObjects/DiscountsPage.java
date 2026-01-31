package pageObjects;

import java.io.IOException;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import factory.BaseClass;

public class DiscountsPage extends BasePage {

	WebDriver driver;
	WebDriverWait wait;

	public DiscountsPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	// Elements
	@FindBy(xpath = "//div[text()='Discounts'][@class='form-header']")
	WebElement discountsPageConfirmation;
	
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
		
		wait.until(ExpectedConditions.visibilityOf(discountsPageConfirmation));
		return discountsPageConfirmation.isDisplayed();
	}
	
	public void clickOnCreateDiscountButton() {
		
		wait.until(ExpectedConditions.elementToBeClickable(createDiscountButton));
		createDiscountButton.click();
	}
	
	public void enterDiscountName() throws IOException {
		
		wait.until(ExpectedConditions.visibilityOf(discountNameInput));
		String discountname = BaseClass.getProperties().getProperty("DiscountName");
		discountNameInput.sendKeys(discountname);
	}
	
	public void enterDiscountDescription() throws IOException {
		
		wait.until(ExpectedConditions.visibilityOf(discountDescriptionInput));
		String discountdescription = BaseClass.getProperties().getProperty("DiscountDescription");
		discountDescriptionInput.sendKeys(discountdescription);
	}
	
	public void selectStartDate() {
		
		wait.until(ExpectedConditions.visibilityOf(startDateInput));
		LocalDate today = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		String todayDate = today.format(formatter);
		startDateInput.sendKeys(todayDate);
	}
	
	public void selectEndDate() throws IOException {
		
		wait.until(ExpectedConditions.visibilityOf(endDateInput));
		String enddate = BaseClass.getProperties().getProperty("EndDateOfDiscountPolicy");
		endDateInput.sendKeys(enddate);
	}
	
	public void enterDiscountPercentage() throws IOException {
		
		wait.until(ExpectedConditions.visibilityOf(discountPercentageInput));
		String discountpercentage = BaseClass.getProperties().getProperty("DiscountPercentage");
		discountPercentageInput.sendKeys(discountpercentage);
	}
	
	public void selectLoginRequired() throws IOException {
		
		wait.until(ExpectedConditions.elementToBeClickable(loginRequiredRadioButton));
		wait.until(ExpectedConditions.elementToBeClickable(loginNotRequiredRadioButton));
		
		String loginrequired = BaseClass.getProperties().getProperty("LoginRequired");
		
		if(loginrequired.equalsIgnoreCase("yes")) {
			
			loginRequiredRadioButton.click();
		}
		else {
			loginNotRequiredRadioButton.click();
		}
	}
	
	public void clickOnCancelButton() {
		
		wait.until(ExpectedConditions.elementToBeClickable(cancelButton));
		cancelButton.click();
	}
	
	public void clickOnSubmitButton() {
		
		wait.until(ExpectedConditions.elementToBeClickable(submitButton));
		submitButton.click();
	}
	
	public void clickOndeleteButton() {
		
		wait.until(ExpectedConditions.elementToBeClickable(deleteDiscountButton));
		deleteDiscountButton.click();
	}
}
