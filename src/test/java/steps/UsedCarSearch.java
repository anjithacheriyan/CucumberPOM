package steps;

import java.util.List;

import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.When;
import pages.actions.CarsGuideHomePageActions;
import pages.actions.UsedCarSearchPageActions;
import pages.locators.CarSearchPageLocators;
import pages.utlilities.SeleniumDriver;

public class UsedCarSearch {

	UsedCarSearchPageActions usedCarSearchPageActions = new UsedCarSearchPageActions();
	CarsGuideHomePageActions carsGuideHomePageActions = new CarsGuideHomePageActions();

	@When("^I click on \"([^\"]*)\" link for used cars page$")
	public void i_click_on_link_for_used_cars_page(String arg1) throws Throwable {
		carsGuideHomePageActions.goToUsedCarsSearch();
		;
		Thread.sleep(SeleniumDriver.TIMESOUT);
	}

	@When("^I select Any Make as \"([^\"]*)\" from used cars page$")
	public void i_select_Any_Make_as_from_used_cars_page(String make) throws Throwable {
		usedCarSearchPageActions.goToAnyMake(make);
		Thread.sleep(SeleniumDriver.TIMESOUT);

	}

	@When("^I select Any Model from used cars page as$")
	public void i_select_Any_Model_from_used_cars_page_as(List<String> list) throws Throwable {
		String carmodel = list.get(3);
		usedCarSearchPageActions.goToAnyModel(carmodel);
	}

	@When("^I select Any Location from used cars page as \"([^\"]*)\"$")
	public void i_select_Any_Location_from_used_cars_page_as(String locatn) throws Throwable {
		usedCarSearchPageActions.goToAnyLocation(locatn);
		Thread.sleep(SeleniumDriver.TIMESOUT);
	}

	@When("^I select Price\\(max\\) from used cars page as \"([^\"]*)\"$")
	public void i_select_Price_max_from_used_cars_page_as(String maxprice) throws Throwable {
		usedCarSearchPageActions.goToPricemax(maxprice);
		Thread.sleep(SeleniumDriver.TIMESOUT);
	}

	@When("^I click on from used cars page \"([^\"]*)\"$")
	public void i_click_on_from_used_cars_page(String arg1) throws Throwable {
		CarSearchPageLocators.FindMyNextCarButton.click();
	}
}