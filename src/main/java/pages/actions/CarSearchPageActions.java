package pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pages.locators.CarSearchPageLocators;
import pages.utlilities.SeleniumDriver;

public class CarSearchPageActions {

	CarSearchPageLocators CarSearchPageLocators = null;

	public CarSearchPageActions() {

		this.CarSearchPageLocators = new CarSearchPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), CarSearchPageLocators);

	}

	public void goToAnyMake(String CarMake) {
		
		Select select=new Select(CarSearchPageLocators.AnyMakeDropDown);
		select.selectByVisibleText(CarMake);

	}

	public void goToAnyModel(String CarModel) {
		Select select=new Select(CarSearchPageLocators.AnyModelDropDown);
		select.selectByVisibleText(CarModel);
	}

	public void goToAnyLocation(String Location) {
		Select select=new Select(CarSearchPageLocators.AnyLocationDropDown);
		select.selectByVisibleText(Location);
	}

	public void goToPricemax(String Pricemax) {
		Select select=new Select(CarSearchPageLocators.PriceMaxDropDown);
		select.selectByVisibleText(Pricemax);
	}

	public void goToFindMyNextCarButton() {
		CarSearchPageLocators.FindMyNextCarButton.click();
		
	}

}
