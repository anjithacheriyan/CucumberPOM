package pages.actions;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import pages.locators.CarsGuideHomePageLocators;
import pages.utlilities.SeleniumDriver;

public class CarsGuideHomePageActions {

	CarsGuideHomePageLocators CarsGuideHomePageLocators = null;

	public CarsGuideHomePageActions() {

		this.CarsGuideHomePageLocators = new CarsGuideHomePageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), CarsGuideHomePageLocators);

	}

	public void goToBuySellMenu() {
		
		
		Actions actions = new Actions(SeleniumDriver.getDriver());
		actions.moveToElement(CarsGuideHomePageLocators.buyselllink).perform();

	}

	public void goToSearchCars() {
		//goToBuySellMenu
		CarsGuideHomePageLocators.buysell_SearchCarslink.click();

	}
	
	public void goToUsedCarsSearch() {
		//goToBuySellMenu
		CarsGuideHomePageLocators.buysell_UsedCarsSearchlink.click();

	}
	

	public void goToReviewsMenu() {

	}

	public void goToNewsMenu() {

	}

	public void goToAdviceMenu() {

	}

	public void goToPricingSpecsMenu() {

	}

	public void goToGuidesMenu() {

	}

}
