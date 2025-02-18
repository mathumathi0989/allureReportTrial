package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utils.DriverManager;

public class GoogleSteps {

	 WebDriver driver = DriverManager.getDriver();

	    
	    @Given("I navigate to {string}")
	    public void i_navigate_to(String url) {
	    	  driver.get(url);
	    }
	    @Then("The page title should be {string}")
	    public void the_page_title_should_be(String expectedTitle) {
	    	 Assert.assertEquals(driver.getTitle(), expectedTitle);
	    }
	    
}
