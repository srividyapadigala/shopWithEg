package stepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ShopWomen;
import utilities.DriverFactory;

public class ShopWomens {

	ShopWomen shopWomen=new ShopWomen(DriverFactory.driver);
	
	
	@Given("user launches shopwitheg site")
	public void user_launches_shopwitheg_site() {
	    DriverFactory.driver.get("https://stg.shopwitheg.com/");;
	}
	
	@When("user clicks on shopwomens")
	public void user_clicks_on_shopwomens() {
	   shopWomen.clickshopwomens();
	}

	
	@When("user click on SortedBy")
	public void user_click_on_sorted_by() {
	   shopWomen.clicksortedby();
	}

	@Then("user select price high to low")
	public void user_select_price_high_to_low() {
	    shopWomen.clickpricehightolow();
	}

	@Then("user verify done button is displayed")
	public void user_verify_done_button_is_displayed() {
	    shopWomen.donebuttondisplayed();
	}

	@Then("user verify when mousehover on done button it change to green colour")
	public void user_verify_when_mousehover_on_done_button_it_change_to_green_colour() {
	    shopWomen.donebuttondisplayed();
	}

	@Then("User click on done button")
	public void user_click_on_done_button() {
	    shopWomen.buttonclick();
	}
}
