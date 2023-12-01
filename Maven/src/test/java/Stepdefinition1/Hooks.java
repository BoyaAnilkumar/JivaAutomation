package Stepdefinition1;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import util.DriverFactory;
import util.Utilities;



public class Hooks extends DriverFactory{
	
	@Before
	public void setUp(Scenario scenario) throws Throwable {
		//Driver initialization
		initialization();
		Utilities.scenario = scenario;
	}
	@After
    public void captureScreenshot(Scenario scenario) {
        if (scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "screenshot");
        }
	}



	@AfterStep
	public void as(Scenario scenario) throws IOException {
		scenario.attach(Utilities.getByteScreenshot(driver), "image/png", "");
	}

	
	@After
	public void CloseBrowser() throws Throwable {
		Thread.sleep(1000);
		driver.close();
		driver.quit();
		
	}
	
}