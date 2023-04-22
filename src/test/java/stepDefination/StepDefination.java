package stepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.DriverFactory;
import pages.CreateAccount;
import pages.LoginPage;
import pages.PasswordPage;

public class StepDefination {
	
	LoginPage loginPage=new LoginPage(DriverFactory.driver);
	CreateAccount createaccount=new CreateAccount(DriverFactory.driver);
	PasswordPage passwordPage=new PasswordPage(DriverFactory.driver);
	
	@Given("user launches shopwithEg")
	public void user_launches_shopwith_eg() {
		
	    DriverFactory.driver.get("https://stg.shopwitheg.com/");
	    			}

	@When("user clicks on login button")
	public void user_clicks_on_login_button() {
		loginPage.clickloginbutton();
	    
	}

	@And("user enters valid credentials")
	public void user_enters_valid_credentials() throws InterruptedException {
		
		loginPage.enteremail();
		loginPage.enterpassword();
		
	    
	}

	@Then("user is succesfully loggedin")
	public void user_is_succesfully_loggedin() {
		
		
	}
	
	
	@When("user clicks on create account button")
	public void user_clicks_on_create_account_button() {
		createaccount.clickcreateaccount();
	}
		
	
	   
	@When("user enters firstname and lastname with less than {int} charecters")
	public void user_enters_firstname_and_lastname_with_less_than_charecters(Integer int1) {
		createaccount.enterfirstname();
		createaccount.enterlastname();
	}
	    
	

	@When("user clicks another create account button")
	public void user_clicks_another_create_account_button() {
		createaccount.clickcreateaccount1();
	}
	    

	@Then("validate the error message")
	public void validate_the_error_message() {
	    createaccount.displayfirstnameerror();
	    createaccount.displaylastnameerror();
	}


	@Given("user launches the url shopwithEg")
	public void user_launches_the_url_shopwith_eg() {
		DriverFactory.driver.get("https://stg.shopwitheg.com/");
	}
	@When("user click on login button")
	public void user_click_on_login_button() {
		loginPage.clickloginbutton();
	}

	@When("user not enters valid password")
	public void user_not_enters_valid_password() {
	    passwordPage.clickpassword();
	}

@When("user click on sign in button")
public void user_click_on_sign_in_button() {
		passwordPage.clicksignin();
    
}

@Then("shows error message")
public void shows_error_message1() {
   passwordPage.enterinvalidpassword();
}

@When("user not enter special charecters,numeric values,uppercase and lower case letters")
public void user_not_enter_special_charecters_numeric_values_uppercase_and_lower_case_letters() {
 
}

@Then("validate error message")
public void validate_error_message() {
    
}
}
		