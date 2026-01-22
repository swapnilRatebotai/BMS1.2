package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyPropertiesPage extends BasePage{
	
	WebDriver driver;
	
	public MyPropertiesPage(WebDriver driver) {
		super(driver);
	}
	
	//Elements
	@FindBy(xpath="//h1[normalize-space()='My Properties']")
	WebElement myPropPageConf;
	
	@FindBy(xpath="//button[@class='full-page-button ']")
	WebElement createPropButton;
	
	@FindBy(xpath="//div[contains(text(),'Hilton Stays')]")
	WebElement propertyHiltonStays;
	
	@FindBy(xpath="//div[text()='Silver Salt']")
	WebElement propertySilverSalt;
	
	@FindBy(xpath="//div[text()='Ocean Pearl']")
	WebElement propertyOceanPearl;
	
	@FindBy(xpath="//div[text()='Mannat Farmstay']")
	WebElement propertyMannatFarmstay;
	
	
	
	
	//Actions
	public boolean myPropertiesPageConfirmation() {
		
		return(myPropPageConf.isDisplayed());
	}
	
	public void clickOnCreateProperty() {
		createPropButton.click();
	}
	
	public void clickOnPropertyHiltonStays() {
		propertyHiltonStays.click();
	}
	
	public void clickOnPropertySilverSalt() {
		propertySilverSalt.click();
	}
	
	public void clickOnPropertyOceanPearl() {
		propertyOceanPearl.click();
	}
	
	public void clickOnPropertyMannatFarm() {
		propertyMannatFarmstay.click();
	}

}
