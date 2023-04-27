package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.DriverFactory;

public class PasswordPage extends DriverFactory {


public PasswordPage(WebDriver driver) {
	PageFactory.initElements(driver,this);
	}

@FindBy(xpath="//input[@name='password']")
public WebElement validpassword;

public void enterpassword() {
	validpassword.sendKeys("Pavani@123");
}

@FindBy(xpath="//p[text()='sign in']")
public WebElement signin;

public void clicksignin() {
	signin.click();
}

@FindBy(xpath="//input[@name='password']")
public WebElement validatepassword;

public void validatecorrectpassword() {
	Boolean correctpassword=validatepassword.isDisplayed();
	System.out.println(correctpassword);
}


@FindBy(xpath="//input[@name='password']")
public WebElement uppercase;

public void enteruppercase() {
	uppercase.clear();
	uppercase.sendKeys("pavani@123");
}


@FindBy(xpath="//p[text()='At least one uppercase character is required']")
public WebElement uppercaseerrormessage;

public void validateuppercaseerror() {
	Boolean uppercaseerror=uppercaseerrormessage.isDisplayed();
	System.out.println(uppercaseerror);
}

@FindBy(xpath="//input[@name='password']")
public WebElement specialcharecter;

public void enterspecialcharecter() {
	specialcharecter.clear();
	specialcharecter.sendKeys("Pavani123");
}

@FindBy(xpath="//p[text()='At least one special character is required']")
public WebElement specialcaseerrormessage;

public void validatespecialcaseerror() {
	Boolean specialcharectererror=specialcaseerrormessage.isDisplayed();
	System.out.println(specialcharectererror);
}

@FindBy(xpath="//input[@name='password']")
public WebElement numerics;

public void enternumerics() {
	numerics.clear();
	numerics.sendKeys("Pavani@padigala");
}


@FindBy(xpath="//p[text()='At least one number is required']")
public WebElement numericserrormessage;

public void validatenumericserror() {
	Boolean numericserror=numericserrormessage.isDisplayed();
	System.out.println(numericserror);
}

@FindBy(xpath="//input[@name='password']")
public WebElement lowercase;

public void enterlowercase() {
	lowercase.clear();
	lowercase.sendKeys("PAVANI@123");
}

@FindBy(xpath="//p[text()='At least one lowercase character is required']")
public WebElement lowercaseerrormessage;

public void validatelowercaseerror() {
	Boolean lowercaseerror=lowercaseerrormessage.isDisplayed();
	System.out.println(lowercaseerror);
}

}