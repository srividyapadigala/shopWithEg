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
	@FindBy(xpath="//p[text()='login']")
	public WebElement login;
	public void loginbutton() {
		login.click();
	}
	
	@FindBy(xpath="//input[@name='email']")
	public WebElement email;
	
	public void enteremail() {
		email.sendKeys("srividyathadakaluru");
	}
	
	@FindBy(xpath="//input[@name='password']")
	public WebElement password;
		
		public void enterpassword() {
			password.sendKeys("pavanipadigala");
	}

		@FindBy(xpath="//p[text()='sign in']")
		public WebElement signinbutton;
		
		public void Clicksigninbutton() {
			signinbutton.click();
			
			}
		
		@FindBy(xpath="//p[text()='Not a valid e-mail address']")
		public WebElement emailinvalidcredentials;
		
		public void invalidemailcredentials() {
			Boolean emailcredentials=emailinvalidcredentials.isDisplayed();
			System.out.println(emailcredentials);
		}
	
		@FindBy(xpath="//p[text()='At least one uppercase character is required']")
		public WebElement passwordinvalidcredentials;
		
		public void invalidpasswordcredentials() {
			Boolean passwordcredentials=passwordinvalidcredentials.isDisplayed();
			System.out.println(passwordcredentials);
		}
		
		
		@FindBy(xpath="//input[@name='email']")
		public WebElement blankemail;
		
		public void enterblankemail() {
			blankemail.sendKeys("");
			}
	
		@FindBy(xpath="//input[@name='password']")
		public WebElement blankpassword;
			
			public void enterblankpassword() {
				blankpassword.sendKeys("");
		}

		@FindBy(xpath="//p[text()='Must enter an email address']")
		public WebElement blankinvalidemail;
		
		public void blankemailerror() {
		Boolean	invalidblankemail=blankinvalidemail.isDisplayed();
		System.out.println(invalidblankemail);
		}
		
		@FindBy(xpath="//p[text()='Enter your password']")
		public WebElement blankinvalidpassword;
		
		public void blankpassworderror() {
			Boolean invalidblankpassword=blankinvalidpassword.isDisplayed();
			System.out.println(invalidblankpassword);
		}
	}