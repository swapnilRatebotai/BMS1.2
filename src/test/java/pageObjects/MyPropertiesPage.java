package pageObjects;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import factory.BaseClass;

public class MyPropertiesPage extends BasePage{
	
	WebDriver driver;
	WebDriverWait wait;
	
	public MyPropertiesPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}
	
	//Elements
	@FindBy(xpath="//h1[normalize-space()='My Properties']")
	WebElement myPropertyPageConfirmation;
	
	@FindBy(xpath="//button[@class='full-page-button ']")
	WebElement createPropertyButton;
	
	@FindBy(xpath="//div[contains(text(),'Hilton Stays')]")
	WebElement propertyHiltonStays;
	
	@FindBy(xpath="//div[text()='Silver Salt']")
	WebElement propertySilverSalt;
	
	@FindBy(xpath="//div[text()='Ocean Pearl']")
	WebElement propertyOceanPearl;
	
	@FindBy(xpath="//div[text()='Mannat Farmstay']")
	WebElement propertyMannatFarmstay;
	
	@FindBy(xpath="//div[contains(text(),'Test Property')]")
	WebElement propertyTestProperty;
	
	
	//Actions
	public boolean myPropertiesPageConfirmation() {
		
		wait.until(ExpectedConditions.visibilityOf(myPropertyPageConfirmation));
		return(myPropertyPageConfirmation.isDisplayed());
	}
	
	public void clickOnCreateProperty() {
		
		wait.until(ExpectedConditions.elementToBeClickable(createPropertyButton));
		createPropertyButton.click();
	}
	
	public void clickOnProperty() throws IOException {
		
		String propertyName = BaseClass.getProperties().getProperty("PropertyName");
		
		if(propertyName.equalsIgnoreCase("Hilton Stays")) {
			wait.until(ExpectedConditions.elementToBeClickable(propertyHiltonStays));
			propertyHiltonStays.click();
		}
		else {
			wait.until(ExpectedConditions.elementToBeClickable(propertyTestProperty));
			propertyTestProperty.click();
		}
	}
	
//	public void clickOnPropertyHiltonStays() {
//		propertyHiltonStays.click();
//	}
//	
//	public void clickOnPropertySilverSalt() {
//		propertySilverSalt.click();
//	}
//	
//	public void clickOnPropertyOceanPearl() {
//		propertyOceanPearl.click();
//	}
//	
//	public void clickOnPropertyMannatFarm() {
//		propertyMannatFarmstay.click();
//	}
//	
//	public void clickOnPropertyTestProperty() {
//		propertyTestProperty.click();
//	}
}
