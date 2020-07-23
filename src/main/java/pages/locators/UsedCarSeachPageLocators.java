package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UsedCarSeachPageLocators {

	

	@FindBy(xpath="//select[@id='makes']")
	public static  WebElement AnyMakeDropDown;
	

	@FindBy(xpath="//select[@id='models']")
	public static  WebElement AnyModelDropDown;
	
	
	@FindBy(xpath="//select[@id='locations']")
	public static WebElement AnyLocationDropDown;
	
	
	
	@FindBy(xpath="//select[@id='priceTo']")
	public static WebElement PriceMaxDropDown;

	
	@FindBy(xpath="//input[@id='search-submit']")
	public static  WebElement FindMyNextCarButton;
	
	
	
}
