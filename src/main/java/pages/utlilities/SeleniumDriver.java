package pages.utlilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumDriver {

	private static SeleniumDriver seleniumDriver;

	private static WebDriver driver;
	private static WebDriverWait wait;
	public static final int TIMESOUT = 30;
	public static final int PAGE_LOAD_TIMEOUT = 50;

	private SeleniumDriver() {

		System.setProperty("webdriver.chrome.driver","/Users/anji/Documents/Selenium/Executables/chromedriver");
		driver=new ChromeDriver();
		wait = new WebDriverWait(driver, TIMESOUT);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(TIMESOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
	}

	public static void openPage(String url) {

		driver.get(url);
	}

	public static WebDriver getDriver() {

		return driver;
	}

	public static void setUpDriver() {
	       if (seleniumDriver == null)
	    	   seleniumDriver = new SeleniumDriver();
	      
	    }

		

	public static void tearDown() {

		if (driver != null) {
			driver.close();
			driver.quit();
			
		}
		seleniumDriver = null;
	}

}
