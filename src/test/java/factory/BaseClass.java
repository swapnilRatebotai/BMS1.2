package factory;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	private static WebDriver driver;
	static Properties p;
	static Logger Logger;
	
//	public static WebDriver initilizeBrowser() throws IOException {
		
	public static void initilizeDriver() throws IOException {
		
		p =getProperties();
//		String executionEnv = p.getProperty("execution_env");
		String browser = p.getProperty("browser").toLowerCase();
		
//		if(driver == null) {
//		driver = new ChromeDriver();
		
		if (browser.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        }
		
//		String os = p.getProperty("os").toLowerCase();
		
//		if(executionEnv.equalsIgnoreCase("remote")) {
			
//			DesiredCapabilities capabilities = new DesiredCapabilities();
			
			//os
//			switch (os) {
//			case "windows":
//				capabilities.setPlatform(Platform.WINDOWS);
//				break;
//			case "mac":
//				capabilities.setPlatform(Platform.MAC);
//				break;
//			case "linux":
//				capabilities.setPlatform(Platform.LINUX);
//				break;
//			default:
//				System.out.println("No matching OS");
//				return null;
//			}
//			
//			//browser
//			switch (browser) {
//			case "chrome":
//				capabilities.setBrowserName("chrome");
//				break;
//			case "edge":
//				capabilities.setBrowserName("edge");
//				break;
//			case "firefox":
//				capabilities.setBrowserName("firefox");
//				break;
//			default:
//				System.out.println("No matching browser");
//				return null;
//			}
			
//			driver = new RemoteWebDriver(new URL("https://extranet.be.demo.ratebotai.com/login"),capabilities);
//		}
//		else if (executionEnv.equalsIgnoreCase("local")) {
//			switch(browser.toLowerCase()) {
//			case "chrome":
//				driver = new ChromeDriver();
//				break;
//			case "edge":
//				driver = new EdgeDriver();
//				break;
//			case "firefox":
//				driver = new FirefoxDriver();
//				break;
//			default:
//				System.out.println("No Matching browser");
//				driver = null;
//			}
//		}
			
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
//		}	
//		return driver;
}
	
	public static WebDriver getDriver() {
		return driver;
	}
	
	public static Properties getProperties() throws IOException{
		p=new Properties();
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\config.properties");
		p.load(file);
		return p;
	}
	
	public static Logger getLogger() {
		Logger = LogManager.getLogger(); //Log4j
		return Logger;
	}
	
	public static String randomString() {
		String generatedString = RandomStringUtils.randomAlphabetic(5);
		return generatedString;
	}
	
	public static String randomNumber() {
		String generatedNumber = RandomStringUtils.randomNumeric(10);
		return generatedNumber;
	}
	
	public static String randomAlphaNumeric() {
		String str = RandomStringUtils.randomAlphabetic(5);
		String num = RandomStringUtils.randomNumeric(10);
		return str+num;
	}
}
