package pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pages.locators.UsedCarSeachPageLocators;
import pages.utlilities.SeleniumDriver;

public class UsedCarSearchPageActions {

	UsedCarSeachPageLocators usedCarSeachPageLocators=null;
	
	
	public UsedCarSearchPageActions() {
		
		this.usedCarSeachPageLocators=new UsedCarSeachPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), this.usedCarSeachPageLocators);
		
	}
	
	

	public void goToAnyMake(String CarMake) {
		
		Select select=new Select(UsedCarSeachPageLocators.AnyMakeDropDown);
		select.selectByVisibleText(CarMake);

	}

	public void goToAnyModel(String CarModel) {
		Select select=new Select(UsedCarSeachPageLocators.AnyModelDropDown);
		select.selectByVisibleText(CarModel);
	}

	public void goToAnyLocation(String Location) {
		Select select=new Select(UsedCarSeachPageLocators.AnyLocationDropDown);
		select.selectByVisibleText(Location);
	}

	public void goToPricemax(String Pricemax) {
		Select select=new Select(UsedCarSeachPageLocators.PriceMaxDropDown);
		select.selectByVisibleText(Pricemax);
	}

	public void goToFindMyNextCarButton() {
		UsedCarSeachPageLocators.FindMyNextCarButton.click();
		
	}

	
	
}
