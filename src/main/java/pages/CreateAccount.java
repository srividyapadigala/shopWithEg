package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.DriverFactory;

public class CreateAccount extends DriverFactory{
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));

public CreateAccount(WebDriver driver) {
	PageFactory.initElements(driver,this);
	}


@FindBy(xpath="//button[text()='Create Account']")

public WebElement createaccount;

public void clickcreateaccount() {
	createaccount.click();
}

@FindBy(xpath="//input[@name='firstName']")

public WebElement firstname;

public void enterfirstname()
{
	 wait.until(ExpectedConditions.visibilityOf(firstname));
	firstname.sendKeys("p");
	
	
}


@FindBy(xpath="//input[@name='lastName']")

public WebElement lastname;

public void enterlastname()  {
wait.until(ExpectedConditions.visibilityOf(lastname));
	lastname.sendKeys("a");
		
}

@FindBy(xpath="//p[text()='create account']")

public WebElement createaccount1;

public void clickcreateaccount1() {
	 createaccount1.click();
}


@FindBy(xpath="//p[text()='First name must be 2 to 30 characters']")

public WebElement firstnameerrormessage;

public void displayfirstnameerror()  {
	Boolean firstnameerror= firstnameerrormessage.isDisplayed();
	System.out.println(firstnameerror);
	
}

@FindBy(xpath="//p[text()='First name must be 2 to 30 characters']")

public WebElement lastnameerrormessage;

public void displaylastnameerror()  {
	Boolean lastnameerror =lastnameerrormessage.isDisplayed();
	System.out.println(lastnameerror);
	
}
}

























































































































































