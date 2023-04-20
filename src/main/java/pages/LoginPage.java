package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.DriverFactory;

public class LoginPage extends DriverFactory {

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		}
	
	
	@FindBy(xpath="//p[text()='login']/parent::button")
	public WebElement loginbutton;
		
		public void clickloginbutton()
		{
			loginbutton.click();
		}
		
		
		@FindBy(xpath="//input[@name='email']")
		public WebElement email;
		
		
		public void enteremail() {
			email.sendKeys("pavani");
		}
		
		@FindBy(xpath="//input[@name='password']")
		public WebElement password;
		
		
		public void enterpassword() {
			password.sendKeys("padigala");
		}
		
		
		
		
		
}
