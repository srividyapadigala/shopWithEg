package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PasswordPage {
	public PasswordPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		}
	
	
	@FindBy(xpath="//input[@name='password']")
	public WebElement password;
	public void clickpassword() {
		password.sendKeys("p");
	}
	
	@FindBy(xpath="//p[text()='sign in']")
	public WebElement signin;
	public void clicksignin() {
	
		signin.click();
	}
	
	@FindBy(xpath="//p[text()='Password must be 8 characters or more']")
	public WebElement invalidpassword;
	
	public void enterinvalidpassword() {
		invalidpassword.click();
	}
	
	
}
