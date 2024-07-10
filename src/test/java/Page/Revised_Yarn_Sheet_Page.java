package Page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import util.DriverFactory;
import util.Utilities;

public class Revised_Yarn_Sheet_Page extends DriverFactory{
	
	Utilities utilities = new Utilities();
	
	By Revised_Yarn_Sheet         = By.xpath("//a[text()='Revised Yarn Sheet']");
	By Mer_Data_Entry             = By.xpath("(//span[text()='Data Entry'])[11]");
	By Generate_yarnsheet         = By.xpath("//span[text()='Generate Yarn Sheet']");
	By Status_field               = By.xpath("//select[@formcontrolname='staticStatusId']");
	By Filter_Slash               = By.xpath("(//button[@type='reset'])[1]");
	By IPO_List                   = By.xpath("(//div[@class='card-body'])[1]");
	By Save_Button                = By.xpath("//button[text()=' Save ']");

	public void Click_on_the_Revised_Yarn_Sheet_Screen() throws Throwable {
		utilities.webDriverWait(driver, Revised_Yarn_Sheet);
		driver.findElement(Revised_Yarn_Sheet).click();
		utilities.MinimumWait(driver);		
	}

	public void Select_the_in_the_Filter_option_page(String Status) throws Throwable {
		utilities.webDriverWait(driver, Status_field);
		driver.findElement(Status_field).click();
	    Thread.sleep(1000);    
	    WebElement status = driver.findElement(Status_field);
	    Select Status_fil = new Select(status);

	    boolean statusExists = false;
	    for (WebElement option : Status_fil.getOptions()) {
	        if (option.getText().equals(Status)) {
	        	statusExists = true;
	            break;
	        }
	    }

	    if (statusExists) {
	    	Status_fil.selectByVisibleText(Status);
	    } else {
	        System.out.println("Status is not displayed in the dropdown list");
	    }

	    utilities.MediumWait(driver);

		
	}

	public void Click_on_the_Filter_Slash() throws Throwable {
		utilities.webDriverWait(driver, Filter_Slash);
		driver.findElement(Filter_Slash).click();
		utilities.MinimumWait(driver);		
		
	}
	public void Validate_whether_the_Selected_IPO_is_displayed_in_the_IPO_list_or_not(String StyleIPO) {
		 List<WebElement> ipoElements = driver.findElements(IPO_List); // Change to appropriate locator
		    if (ipoElements.size() > 0) {
		        WebElement dataElement = ipoElements.get(0); // Assuming you want the first element
		        String actualData = dataElement.getText(); 		      
		        if (StyleIPO.equals(actualData)) {
		            System.out.println("Selected IPO is displayed in the IPO List: " + actualData);
		        } else {
		            System.out.println("Selected IPO is not displayed in the IPO List. Expected: " + StyleIPO + ", but found: " + actualData);
		        }
		    } else {
		        System.out.println("The IPO list is empty.");
		    }
		}
	public void Click_on_the_Revised_Yarn_Sheet_Screen_under_the_Generate_Yarn_Sheet_dropdown() throws Throwable {
		utilities.webDriverWait(driver, Mer_Data_Entry);
		driver.findElement(Mer_Data_Entry).click();
		utilities.MinimumWait(driver);
		utilities.webDriverWait(driver, Generate_yarnsheet);
		driver.findElement(Generate_yarnsheet).click();
		utilities.MinimumWait(driver);
		utilities.webDriverWait(driver, Revised_Yarn_Sheet);
		driver.findElement(Revised_Yarn_Sheet).click();
		utilities.MinimumWait(driver);
		
	}

	public void Click_on_the_Save_button_in_the_Revised_Yarn_Sheet() throws Throwable {
		try {
			utilities.webDriverWait(driver, Save_Button);	
			driver.findElement(Save_Button).click();
			utilities.MinimumWait(driver);
			}
			catch(Exception e) {
				System.out.println("Save button is not displayed");
			}
		
	}

}
