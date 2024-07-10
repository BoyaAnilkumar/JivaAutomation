package Page;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import util.DriverFactory;
import util.Utilities;

public class SW_Create_PO_For_Stock_Page extends DriverFactory{

		Utilities utilities = new Utilities();
		
		By Create_PO_For_Stock_Screen      =  By.xpath("(//a[text()=' Create PO for Stock '])[3]");
		By Create_PO_Stock_Screen_name     =  By.xpath("//h3[text()='Create PO for Stock']");
		By Type_Of_Order                   =  By.xpath("//select[@formcontrolname='poTypeId']");
		By Rate_field                      =  By.xpath("//input[@formcontrolname='rate']");
		By Process_Loss                    = By.xpath("//input[@formcontrolname='processLoss']");
		By Qty_field                       = By.xpath("//input[@formcontrolname='qtyrequired']");
		By Sample_Check_Box                = By.xpath("//input[@type='checkbox']");
		By Residual_Shrinkage              = By.xpath("//input[@formcontrolname='residualShrinkage']");
		By Buyer_field                     = By.xpath("//ng-select[@formcontrolname='buyerId']");
		By Style_field                     = By.xpath("//input[@formcontrolname='styleName']");
		By Color_field                     = By.xpath("//ng-select[@formcontrolname='colorId']");
		By Reset_button                    = By.xpath("//button[text()=' Reset']");
		By Yarn_name                       = By.xpath("(//ng-select[@bindvalue='yarnId']//div)[1]");
		By Save_Validation                 = By.xpath("//h2[text()='Create PO For Stock Saved Successfully']");

		public void Click_on_the_Create_PO_For_Stock_Screen() throws Throwable {
			utilities.webDriverWait(driver, Create_PO_For_Stock_Screen);
			driver.findElement(Create_PO_For_Stock_Screen).click();
			utilities.MinimumWait(driver);	
			
		}

		public void The_Create_PO_For_Stock_Screen_is_displayed_or_not() {
			WebElement data = driver.findElement(Create_PO_Stock_Screen_name);
			String Screen_name = data.getText(); 
			System.out.print("Display the Create Po For Stock Screen:" + Screen_name);	
						
	   }

		public void Select_the_of_Order_in_the_Create_PO_For_Stock_Screen(String Type) throws Throwable {
			driver.findElement(Type_Of_Order).click();
		    Thread.sleep(1000);    
		    WebElement use = driver.findElement(Type_Of_Order);
		    Select Usefield = new Select(use);

		    boolean SeasonExists = false;
		    for (WebElement option : Usefield.getOptions()) {
		        if (option.getText().equals(Type)) {
		        	SeasonExists = true;
		            break;
		        }
		    }

		    if (SeasonExists) {
		    	Usefield.selectByVisibleText(Type);
		    } else {
		        System.out.println("Selected Type of Order is not displayed in the dropdown list");
		    }

		    utilities.MediumWait(driver);		
			
		}

		public void Enter_the_data_in_field_in_the_Create_PO_for_Stock(String Rate) throws Throwable {
			utilities.webDriverWait(driver, Rate_field);
			driver.findElement(Rate_field).sendKeys(Rate);
			utilities.MinimumWait(driver);				
			
		}

		public void Enter_the_data_in_the_Quantity_field() throws Throwable {
			utilities.webDriverWait(driver, Qty_field);
			driver.findElement(Qty_field).sendKeys("60");
			utilities.MinimumWait(driver);				
			
		}

		public void Select_the_Sample_Check_box() throws Throwable {
			utilities.webDriverWait(driver, Sample_Check_Box);
			driver.findElement(Sample_Check_Box).click();
			utilities.MinimumWait(driver);	
			
		}

		public void Enter_the_data_in_the_Process_Loss_field() throws Throwable {
			Boolean isPresent = driver.findElements(Process_Loss).size()>0;
			if (isPresent) {	
				utilities.webDriverWait(driver,Process_Loss);
				driver.findElement(Process_Loss).sendKeys("4");
			} else {
				  System.out.println("Process Loss field is not displayed: " + isPresent);
				
			}
			
		}

		public void Enter_the_data_in_the_Shrinkage_field(String Residual) throws Throwable {
			utilities.webDriverWait(driver, Residual_Shrinkage);
			driver.findElement(Residual_Shrinkage).sendKeys(Residual);
			utilities.MinimumWait(driver);		
			
		}

		public void Select_the_Buyer_in_the_Create_PO_For_Stock_screen() throws Throwable {
			utilities.webDriverWait(driver, Buyer_field);
			driver.findElement(Buyer_field).click();
			utilities.MinimumWait(driver);	
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(2000);
			r.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(2000);		
			
		}

		public void Enter_the_data_in_the_Style_field() throws Throwable {
			utilities.webDriverWait(driver, Style_field);
			driver.findElement(Style_field).sendKeys("Style1209");
			utilities.MinimumWait(driver);		
			
		}
		public void Select_the_color_in_the_Yarn_details_section(String Color) throws Throwable {
			WebElement buttonElement = driver.findElement(Color_field);
			if (buttonElement.isEnabled()) {
				System.out.println("Button is enabled.");
			utilities.webDriverWait(driver, Color_field);
			driver.findElement(Color_field).click();
			utilities.MinimumWait(driver);	
			Robot r = new Robot();
//			r.keyPress(KeyEvent.VK_DOWN);
//			Thread.sleep(2000);
			r.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(2000);		

			} else {
				System.out.println("Color field is displayed disabled state");
			}		
			
		}

		public void Click_on_the_Reset_button_the_entered_data_is_cleared() throws Throwable {
			utilities.webDriverWait(driver, Reset_button);
			driver.findElement(Reset_button).click();
			utilities.MinimumWait(driver);	
			
		}
        By Enter_yarn       = By.xpath("(//div[@role='combobox']//input)[2]");
		public void Select_the_in_the_yarn_section(String YarnQuality) throws Throwable {
			utilities.webDriverWait(driver, Yarn_name);
			Thread.sleep(1000); 
			driver.findElement(Yarn_name).click();
			driver.findElement(Enter_yarn).sendKeys(YarnQuality);
			utilities.MinimumWait(driver);
			Thread.sleep(1000); 
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(2000);
			
		}

		public void The_Save_validation_message_is_displayed_or_not() {
			Boolean isPresent = driver.findElements(Save_Validation).size()>0;
			if (isPresent) {
			WebElement Data = driver.findElement(Save_Validation);
			String test = Data.getText(); 
			String expectedData = "Create PO For Stock Saved Successfully";
			if (expectedData.equals(test)) {
				System.out.println("Display validation msg is correct." + test);
			} else {
				System.out.println("Display validation msg is incorrect."+ test);
			}
		}
			
		}
		
		
		
}
