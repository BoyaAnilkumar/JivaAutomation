package Page;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import util.DriverFactory;
import util.Utilities;

public class Yarn_Quality_Input_Page extends DriverFactory {
	Utilities utilities = new Utilities();
	
	
	By Yarn_store               = By.xpath("//span[text()='Yarn Store '] ");
	By Yarn_Store_Data_Entry    = By.xpath("(//span[text()='Data Entry'] )[13]");
	By Yarn_Quality_Input       = By.xpath("//a[text()=' Yarn Quality Input ']");
	By Yarn_Quality_Input_Screen= By.xpath("//h3[text()='Yarn Quality Input']");
	By Add_Icon                 = By.xpath("//button[@title='Add']");
	By IPO                      = By.xpath("(//p[@class='mb-0 text-primary'])[1]");
	By Date_of_initial_recd     = By.xpath("(//p[@class='mb-0 text-primary'])[2]");
	By PO_Number                = By.xpath("(//p[@class='mb-0 text-primary'])[3]");
	By Net_Weight_Assigned      = By.xpath("(//p[@class='mb-0 text-primary'])[4]");
	By Yarn_name                = By.xpath("(//p[@class='mb-0 text-primary'])[5]");
	By Color                    = By.xpath("(//p[@class='mb-0 text-primary'])[6]");
	By Supplier                 = By.xpath("(//p[@class='mb-0 text-primary'])[7]");
	By Checker_name             = By.xpath("//select[@formcontrolname='checkerId']");
	By Checking_related         = By.xpath("//textarea[@formcontrolname='remarks']");
	By Shrinkage_Section        = By.xpath("//h5[text()='Shrinkage ']");
	By Box_name                 = By.xpath("//select[@formcontrolname='boxId']");
	By L_Shrinkage              = By.xpath("//input[@formcontrolname='l_Shrinkage']");
	By W_Shrinkage              = By.xpath("//input[@formcontrolname='w_Shrinkage']");
	By Shrinkage_Add_button     = By.xpath("//button[text()=' Add']");
	By Save_button              = By.xpath("(//button[text()=' Save'])[1]");
	By Validation               = By.xpath("//h2[text()='Mandatory Fields Are Required With  Valid Data.']");
	By Expansion_Icon           = By.xpath("//i[@class='pi c-pointer pi-chevron-right ng-star-inserted']");
	By Expansion_Grid_name      = By.xpath("//b[text()='Yarn Quality Shrinkage']");
	By Expan_Header_Section     = By.xpath("(//thead[@class='p-datatable-thead'])[2]");
	By Expansion_Grid_Data      = By.xpath("(//tbody[@class='p-element p-datatable-tbody'])[2]");
	
	public void Click_on_the_Yarn_Store_Module() throws Throwable {
		utilities.webDriverWait(driver, Yarn_store);
		driver.findElement(Yarn_store).click();
		utilities.MediumWait(driver);
		
	}

	public void Click_on_the_Yarn_Quality_Input_under_the_Data_Entry_dropdown() throws Throwable {
		utilities.webDriverWait(driver, Yarn_Store_Data_Entry);
		driver.findElement(Yarn_Store_Data_Entry).click();
		utilities.MediumWait(driver);
		driver.findElement(Yarn_Quality_Input).click();
		utilities.MediumWait(driver);
		
	}

	public void The_Yarn_Quality_Input_Screen_is_displayed_or_not() throws Throwable {
		utilities.webDriverWait(driver, Yarn_Quality_Input_Screen);
		String Screen_name  = driver.findElement(Yarn_Quality_Input_Screen).getText();
		System.out.println("Display the Yarn Quality Input Screen:" +Screen_name);
		
	}

	public void Click_on_the_Add_Icon_in_the_Actions_Column() throws Throwable {
		utilities.webDriverWait(driver, Add_Icon);
		driver.findElement(Add_Icon).click();
		utilities.MediumWait(driver);
		
	}

	public void Verify_the_IPO_Date_of_initial_recd_PO_Number_and_Net_Weight_Assigned_data_is_displayed_or_not() throws Throwable {
		utilities.webDriverWait(driver, IPO);
		String IPO_data  = driver.findElement(IPO).getText();
		System.out.println("Display the IPO name:" +IPO_data);
		
		utilities.webDriverWait(driver, Date_of_initial_recd);
		String Date  = driver.findElement(Date_of_initial_recd).getText();
		System.out.println("Display the Date of initial recd:" +Date);
		
		utilities.webDriverWait(driver, PO_Number);
		String PO_number  = driver.findElement(PO_Number).getText();
		System.out.println("Display the PO number :" +PO_number);
		
		utilities.webDriverWait(driver, Net_Weight_Assigned);
		String Net  = driver.findElement(Net_Weight_Assigned).getText();
		System.out.println("Display the Net Weight Assigned:" +Net);
		
		
	}

	public void The_Yarn_Details_are_displayed_or_not() throws Throwable {
		utilities.webDriverWait(driver, Yarn_name);
		String yarnname  = driver.findElement(Yarn_name).getText();
		System.out.println("Display the Yarn name:" +yarnname);
		
		utilities.webDriverWait(driver, Color);
		String color  = driver.findElement(Color).getText();
		System.out.println("Display the Color:" +color);
		
		utilities.webDriverWait(driver, Supplier);
		String supplier  = driver.findElement(Supplier).getText();
		System.out.println("Display the Supplier:" +supplier);
		
	}

	public void Select_the_Checker_name() throws Throwable {
		utilities.webDriverWait(driver, Checker_name);
		driver.findElement(Checker_name).click();
		utilities.MinimumWait(driver);	
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);	
	    Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);	
		
	}

	public void Enter_the_Checking_Related_Issues() throws Throwable {	
		 WebElement check = driver.findElement(Checking_related);
         String checkrelated = check.getAttribute("value");       
         if (checkrelated.length() > 500) {
             // Handle error
             System.out.println("Error: The length of the Checking Related Issues exceeds the maximum length of 500 characters.");
         } else {
             // Proceed with form processing
             System.out.println("The length of Checking Related Issues is within the allowed limit.");
         }
		utilities.webDriverWait(driver, Checking_related);
		driver.findElement(Checking_related).sendKeys("Checking related Issues");
		utilities.MediumWait(driver);
		
	}

	public void The_Shrinkage_section_is_displayed_or_not() throws Throwable {
		utilities.webDriverWait(driver, Shrinkage_Section);
		String supplier  = driver.findElement(Shrinkage_Section).getText();
		System.out.println("Display the Shrinkage Section:" +supplier);
		
	}

	public void Select_the_Box_name() throws Throwable {
		utilities.webDriverWait(driver, Box_name);
		driver.findElement(Box_name).click();
		utilities.MinimumWait(driver);	
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);	
	    Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);	
		
		
	}

	public void Enter_the_data_in_the_L_Shrinkage_field() throws Throwable {
		// String Shrinkage = driver.findElement("L_Shrinkage");
		WebElement shrinkageElement = driver.findElement(L_Shrinkage);
		String shrinkage = shrinkageElement.getAttribute("value");

		if (shrinkage.length() > 2) {
		    // Handle error
		    System.out.println("Error: The length of the Shrinkage exceeds the maximum length of 2 characters.");
		} else {
		    // Proceed with form processing
		    System.out.println("The length of shrinkage is within the allowed limit.");
		}
		utilities.webDriverWait(driver, L_Shrinkage);
		driver.findElement(L_Shrinkage).sendKeys("58");
		utilities.MediumWait(driver);

	
}


	public void Enter_the_data_in_the_W_Shrinkage_field() throws Throwable {
		WebElement shrinkageElement = driver.findElement(W_Shrinkage);
		String shrinkage = shrinkageElement.getAttribute("value");

		if (shrinkage.length() > 2) {
		    // Handle error
		    System.out.println("Error: The length of the Shrinkage exceeds the maximum length of 2 characters.");
		} else {
		    // Proceed with form processing
		    System.out.println("The length of shrinkage is within the allowed limit.");
		}
		utilities.webDriverWait(driver, W_Shrinkage);
		driver.findElement(W_Shrinkage).sendKeys("4");
		utilities.MediumWait(driver);
		
	}

	public void Click_on_the_Add_button_in_the_Shrikage_section() throws Throwable {
		WebElement Text = driver.findElement(Shrinkage_Add_button);
		if(Text.isEnabled()) {
		driver.findElement(Shrinkage_Add_button).click();
		utilities.MinimumWait(driver);	
		utilities.webDriverWait(driver, Box_name);
		driver.findElement(Box_name).click();
		utilities.MinimumWait(driver);	
		Robot r = new Robot();
		 r.keyPress(KeyEvent.VK_DOWN);	
	     Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);	
		
		utilities.webDriverWait(driver, L_Shrinkage);
		driver.findElement(L_Shrinkage).sendKeys("4");
		utilities.MediumWait(driver);
		
		utilities.webDriverWait(driver, W_Shrinkage);
		driver.findElement(W_Shrinkage).sendKeys("2");
		utilities.MediumWait(driver);
	}
	else {
		System.out.println("Add button is disabled state");
	}

	}

	public void without_enter_the_data_in_the_all_fieds_and_click_on_the_save_button_validation_msg_is_displayed_or_not() throws Throwable {
		utilities.webDriverWait(driver, Save_button);
		driver.findElement(Save_button).click();
		utilities.MinimumWait(driver);	
		
		Boolean isPresent = driver.findElements(Validation).size()>0;
		if (isPresent) {
		WebElement Data = driver.findElement(Validation);
		String test = Data.getText(); 
		String expectedData = "Mandatory Fields Are Required With Valid Data.";
		if (expectedData.equals(test)) {
			System.out.println("Display validation msg is correct." + test);
		} else {
			System.out.println("Display validation msg is incorrect."+ test);
		}
	}
		
	}

	public void Click_on_the_Save_button_in_the_Shrinkage_section() throws Throwable {
		utilities.webDriverWait(driver, Save_button);
		driver.findElement(Save_button).click();
		utilities.MinimumWait(driver);	
		
		
	}

	public void Click_on_the_Expansion_icon_the_expansion_grid_data_is_displayed_or_not() throws Throwable {
		utilities.webDriverWait(driver, Expansion_Icon);
	
		  List<WebElement> Exp_elements = driver.findElements(Expansion_Icon);
	        // Iterate over each element
	      for (WebElement Exp_element : Exp_elements) {
	      if (Exp_element.isEnabled()) {
		driver.findElement(Expansion_Icon).click();
		utilities.MediumWait(driver);
		
		utilities.webDriverWait(driver, Expansion_Grid_name);
		String Screen_name  = driver.findElement(Expansion_Grid_name).getText();
		System.out.println("Display the Yarn Quality Shrinkage grid name is displayed:" +Screen_name);
		
		WebElement grid = driver.findElement(Expan_Header_Section);

		List<WebElement> tableHeaders = grid.findElements(By.tagName("th"));
		for (int i = 0; i < tableHeaders.size(); i++) {
		    String columnName = tableHeaders.get(i).getText(); // Get the text of the header column		 
		    if (columnName == null) {
		        columnName = "null";
		    } else {
		        columnName = columnName.trim();
		    }

		    System.out.println("Displayed Expansion grid header section column name: " + columnName);
  
	        }	       
		
		 WebElement OrderData = driver.findElement(Expansion_Grid_Data);
		  
		    WebElement Data = driver.findElement(Expansion_Grid_Data);
		    Thread.sleep(1000);
		    List<WebElement> rows1 = Data.findElements(By.tagName("tr"));
		        int Irowcount = rows1.size();
	            int Idatarowcount = Irowcount;
	            System.out.println("No. of data Rows in the grid : " + Idatarowcount);
	         
	        if(driver.findElements(Expansion_Grid_Data).size() > 0) {
	        utilities.MediumWait(driver);            
	        String OrderDataText1 = OrderData.getText();
			utilities.MediumWait(driver);	    
			            
	        String[] rows = OrderDataText1.split("\n");
			for (String row : rows) {
		     System.out.println(row);
		        System.out.println();
		        
		      }		
		   }	    		
	    }   
	  }	
	}
		

}
