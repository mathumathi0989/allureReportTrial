package hooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.DriverManager;

public class Hooks {

	
	 @Before
	    public void setUp() {
	        DriverManager.getDriver().manage().window().maximize();
	    }
	    
	    @After
	    public void tearDown(Scenario scenario) {
	        if (scenario.isFailed()) {
	            byte[] screenshot = ((TakesScreenshot) DriverManager.getDriver()).getScreenshotAs(OutputType.BYTES);
	            scenario.attach(screenshot, "image/png", "Failed Screenshot");
	        }
	        DriverManager.quitDriver();
	    }
	    
	
	
}
