package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import util.DriverFactory;
import util.Utilities;

public class SW_PD_Fabric_Pricing_Pages  extends DriverFactory{

	Utilities utilities = new Utilities();
      
	  By PD_Fabric_Pricing         = By.xpath("//a[text()='PD Fabric Pricing ']");
	  By Save_validation           = By.xpath("//h2[text()='Sweater Fabric Pricing CallOut Added Successfully']");
	  By Submit_To_PO_Merchant     = By.xpath("//button[text()=' Submit to Po Merchant Team ']");
	  By Submit_PO_Merchant_Val    = By.xpath("//h2[text()='Sweater Fabric Status Changed Successfully']");
	  By Total_Price               = By.xpath("//input[@formcontrolname='totalPrice']");
	
	public void Click_on_the_PD_Fabric_Pricing_Screen() throws Throwable {
		utilities.webDriverWait(driver, PD_Fabric_Pricing);
		driver.findElement(PD_Fabric_Pricing).click();
		utilities.MinimumWait(driver);
		
	}

	public void Verify_the_On_Saving_validation_is_displayed_or_not() {
		Boolean isPresent = driver.findElements(Save_validation).size()>0;
		if (isPresent) {
		WebElement Data = driver.findElement(Save_validation);
		String test = Data.getText(); 
		String expectedData = "Sweater Fabric Pricing CallOut Added Successfully";
		if (expectedData.equals(test)) {
			System.out.println("Display validation msg is correct." + test);
		} else {
			System.out.println("Display validation msg is incorrect."+ test);
		}
	}
		
		
	}

	public void Click_on_the_Submit_to_Po_Merchant_Team_button_the_validation_msg_is_displayed_or_not() throws Throwable {
		utilities.webDriverWait(driver, Submit_To_PO_Merchant);
		driver.findElement(Submit_To_PO_Merchant).click();
		utilities.MinimumWait(driver);
		Boolean isPresent = driver.findElements(Submit_PO_Merchant_Val).size()>0;
		if (isPresent) {
		WebElement Data = driver.findElement(Submit_PO_Merchant_Val);
		String test = Data.getText(); 
		String expectedData = "Sweater Fabric Status Changed Successfully";
		if (expectedData.equals(test)) {
			System.out.println("Display validation msg is correct." + test);
		} else {
			System.out.println("Display validation msg is incorrect."+ test);
		}
	}
	}

	public void Enter_the_data_in_the_total_fabric_Price_field(String TotalPrice) throws Throwable {
		utilities.webDriverWait(driver, Total_Price);
		driver.findElement(Total_Price).sendKeys(TotalPrice);
		utilities.MinimumWait(driver);
		
	}
	
	
	
}
