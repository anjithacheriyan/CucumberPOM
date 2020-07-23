package steps;

import java.util.List;

import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.actions.CarSearchPageActions;
import pages.actions.CarsGuideHomePageActions;
import pages.utlilities.SeleniumDriver;

public class CarSearch {
	
	CarsGuideHomePageActions carsGuideHomePageActions=new CarsGuideHomePageActions();
	CarSearchPageActions carSearchPageActions=new CarSearchPageActions();
	
	@Given("^I am on the home page \"([^\"]*)\"$")
	public void i_am_on_the_home_page(String websiteurl) throws Throwable {
		
		SeleniumDriver.openPage(websiteurl);
	    
	}

	@When("^I move to menu$")
	public void i_move_to_menu(List<String> list) throws Throwable {
	
		list.get(1);
		carsGuideHomePageActions.goToBuySellMenu();
		Thread.sleep(SeleniumDriver.TIMESOUT);
	   
	}

	
	@When("^I click on \"([^\"]*)\" link$")
	public void i_click_on_link(String arg1) throws Throwable {
		carsGuideHomePageActions.goToSearchCars();
		Thread.sleep(SeleniumDriver.TIMESOUT);
	    
	}

	@When("^I select Any Make as \"([^\"]*)\"$")
	public void i_select_Any_Make_as(String make) throws Throwable {
		
		carSearchPageActions.goToAnyMake(make);
		Thread.sleep(SeleniumDriver.TIMESOUT);
	   
	}

	@When("^I select Any Model as \"([^\"]*)\"$")
	public void i_select_Any_Model_as(String model) throws Throwable {
		carSearchPageActions.goToAnyModel(model);
		Thread.sleep(SeleniumDriver.TIMESOUT);
	}

	@When("^I select Any Location as \"([^\"]*)\"$")
	public void i_select_Any_Location_as(String locatn) throws Throwable {
		carSearchPageActions.goToAnyLocation(locatn);
		Thread.sleep(SeleniumDriver.TIMESOUT);
	}

	@When("^I select Price\\(max\\) as \"([^\"]*)\"$")
	public void i_select_Price_max_as(String maxprice) throws Throwable {
		carSearchPageActions.goToPricemax(maxprice);
		Thread.sleep(SeleniumDriver.TIMESOUT);
	}

	@When("^I click on \"([^\"]*)\" button$")
	public void i_click_on_button(String arg1) throws Throwable {
		carSearchPageActions.goToFindMyNextCarButton();
		Thread.sleep(SeleniumDriver.TIMESOUT);
	}

	@Then("^I see a list of searched cars$")
	public void i_see_a_list_of_searched_cars() throws Throwable {
	   
		System.out.println("I see a list of cars");
	}

	@Then("^the page title should be \"([^\"]*)\"$")
	public void the_page_title_should_be(String expectedTitle) throws Throwable {
		
		String actualTitle=SeleniumDriver.getDriver().getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	    
	}



}
