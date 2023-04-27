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

	@Given("user launches shopwitheg site")
	public void user_launches_shopwitheg_site() {
		  
		DriverFactory.driver.get("https://stg.shopwitheg.com/");
	}

	@When("user clicks login button")
	public void user_clicks_login_button() {
	    
		loginPage.loginbutton();
	}

	@When("user enters invalid credentials")
	public void user_enters_invalid_credentials() {
	    loginPage.enteremail();
	    loginPage.enterpassword();
	}

	@When("user clicks on signin button in login page")
	public void user_clicks_on_signin_button_in_login_page() {
	    loginPage.Clicksigninbutton();
	}

	@Then("user will be displayed with error message for invalid credentials")
	public void user_will_be_displayed_with_error_message_for_invalid_credentials() {
	    loginPage.invalidemailcredentials();
	    loginPage.invalidpasswordcredentials();
	}

	@When("user enters blank username and password")
	public void user_enters_blank_username_and_password() {
	    loginPage.enterblankemail();
	    loginPage.enterblankpassword();
	}

	@Then("user will be displayed with error message for blank username and password")
	public void user_will_be_displayed_with_error_message_for_blank_username_and_password() {
	    loginPage.blankemailerror();
	    loginPage.blankpassworderror();
	}
	
	@When("user clicks on login button")
	public void user_clicks_on_login_button() {
	   createaccount.loginbutton();
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
	
	
	
	@Given("user launches shopwitheg")
	public void user_launches_shopwitheg() {
	   DriverFactory.driver.get("https://stg.shopwitheg.com/");
	}

	@When("user enters valid password")
	public void user_enters_valid_password() {
	    passwordPage.enterpassword();
	}

	@When("user click on signin")
	public void user_click_on_signin() {
	    passwordPage.clicksignin();
	}

	@Then("validate password")
	public void validate_password() {
	    passwordPage.validatecorrectpassword();
	}

	@When("user not enters uppercase")
	public void user_not_enters_uppercase() {
	    passwordPage.enteruppercase();
	}

	@Then("validate uppercase error message")
	public void validate_uppercase_error_message() {
	    passwordPage.validateuppercaseerror();
	}

	@When("user not enters special charecter")
	public void user_not_enters_special_charecter() {
	   passwordPage.enterspecialcharecter();
	}

	@Then("validate special charecter error message")
	public void validate_special_charecter_error_message() {
	   passwordPage.validatespecialcaseerror();
	}

	@When("user not enters numerics")
	public void user_not_enters_numerics() {
	    passwordPage.enternumerics();
	}

	@Then("validate numerics error message")
	public void validate_numerics_error_message() {
	    passwordPage.validatenumericserror();
	}

	@When("user not enter lowercase")
	public void user_not_enter_lowercase() {
	    passwordPage.enterlowercase();
	}

	@Then("validate lowercase error message")
	public void validate_lowercase_error_message() {
	    passwordPage.validatelowercaseerror();
	}


}

		