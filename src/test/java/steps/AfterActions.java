package steps;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import pages.utlilities.SeleniumDriver;

public class AfterActions {
	
	@After
	public static void tearDowm(Scenario scenario) {
if(scenario.isFailed()) {
			
			WebDriver driver=SeleniumDriver.getDriver();
			byte[] screenshotbytes= ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			scenario.embed(screenshotbytes, "image/png");
		}
		SeleniumDriver.tearDown();;
		
	}

}
