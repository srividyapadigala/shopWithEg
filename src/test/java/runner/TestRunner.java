package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features={"D:\\Automation\\ShopWithEg\\src\\test\\resources\\features"},
		glue= {"stepDefination"},
		plugin= {"pretty","html:target/cucumberReport.html"}
		)
		
		public class TestRunner {

}
