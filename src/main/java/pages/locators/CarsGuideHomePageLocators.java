package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CarsGuideHomePageLocators {
	
	
	@FindBy(how=How.LINK_TEXT,using="buy + sell")
	public WebElement buyselllink;
	
	
	@FindBy(how=How.XPATH,using="//a[contains(text(),'Search Cars')]")
	public  WebElement buysell_SearchCarslink;
	

	@FindBy(how=How.XPATH,using="//div[@class='uhf-child-content']//a[contains(text(),'Used')]")
	public  WebElement buysell_UsedCarsSearchlink;
	
	@FindBy(how=How.LINK_TEXT,using="reviews")
	public  WebElement reviewslink;
	
	@FindBy(how=How.LINK_TEXT,using="news")
	public  WebElement newslink;
	
	@FindBy(how=How.LINK_TEXT,using="advice")
	public  WebElement advicelink;
	
	@FindBy(how=How.LINK_TEXT,using="pricing + specs")
	public  WebElement pricingspecslink;
	
	@FindBy(how=How.LINK_TEXT,using="guides")
	public  WebElement guideslink;
	
}
