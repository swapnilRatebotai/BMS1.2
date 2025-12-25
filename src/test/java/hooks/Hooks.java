package hooks;

import java.io.IOException;
import java.util.Properties;

//import org.junit.After;
//import org.junit.Before;
import io.cucumber.java.Before;
import io.cucumber.java.After;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import factory.BaseClass;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;

public class Hooks {
	WebDriver driver;
	Properties p;
	
	@Before
	public void setup() throws IOException{
		
		BaseClass.initilizeDriver();
		
		driver = BaseClass.getDriver();
        System.out.println("HOOKS: Driver = " + driver);
		
		p=BaseClass.getProperties();
		driver.get(p.getProperty("appURL"));
		driver.manage().window().maximize();
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}
	
	@AfterStep
	public void addScreenshot(Scenario scenario) {
		//this is for cucumber junit report
		
		if (scenario.isFailed() && driver != null) {
            byte[] screenshot =
                ((TakesScreenshot) driver)
                    .getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "Failed Screenshot");
        }
		
	}
}
