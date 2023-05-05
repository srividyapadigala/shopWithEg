package pages;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.DriverFactory;

public class ShopWomen extends DriverFactory {

	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
	JavascriptExecutor js=(JavascriptExecutor)driver;
	public ShopWomen(WebDriver driver) {
			PageFactory.initElements(driver,this);
			}
		
		@FindBy(xpath="(//div[@type='white'])[1]")
			
		public WebElement shopwomens;
		
		public void clickshopwomens() {
			wait.until(ExpectedConditions.elementToBeClickable(shopwomens));
			js.executeScript("arguments[0].click();",shopwomens);
			}
		
		@FindBy(xpath="//p[text()='Sorted by:']")
		public WebElement sortedby;
		
		public void clicksortedby() {
			wait.until(ExpectedConditions.elementToBeClickable(sortedby));
			sortedby.click();
		}
		
		@FindBy(xpath="(//p[text()='Price High to Low'])[1]")
		public WebElement pricehightolow;
		
		public void clickpricehightolow() {
			wait.until(ExpectedConditions.elementToBeClickable(pricehightolow));
			
			pricehightolow.click();
		}
		
		
		@FindBy(xpath="//p[text()='Done']")
		public WebElement donebuttondisplay;
		
		public void donebuttondisplayed() {
			wait.until(ExpectedConditions.elementToBeClickable(donebuttondisplay));
			Boolean buttondisplay=donebuttondisplay.isDisplayed();
			System.out.println(buttondisplay);
		}
		
		@FindBy(xpath="//p[text()='Done']")
		public WebElement donebuttongreencolor;
		
		public void greencolor() {
			wait.until(ExpectedConditions.elementToBeClickable(donebuttongreencolor));
			String button=donebuttongreencolor.getCssValue("color");
			System.out.println(button);
		}
		
		@FindBy(xpath="//p[text()='Done']")
		public WebElement donebuttonclick;
		
		public void buttonclick() {
			wait.until(ExpectedConditions.elementToBeClickable(donebuttonclick));
			
			donebuttonclick.click();
	}
}


