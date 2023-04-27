package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverFactory {
	
	public static WebDriver driver;
	
	public void init() {
		ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\chromedriver\\chromedriver.exe");	
		driver=new ChromeDriver(option);
	}

}
