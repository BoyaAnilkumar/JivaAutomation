package Page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import util.DriverFactory;
import util.Utilities;

public class SW_Trim_Sheet_Audit_Page extends DriverFactory{

	Utilities utilities = new Utilities();

	By SW_Trim_Sheet_Audit     = By.xpath("(//a[text()='Trim Sheet Audit'])[2]");
	By Costing_budget_grid     = By.xpath("(//tr[@class='ng-star-inserted'])[5]");
	By Three_Percent           = By.xpath("(//td[@class='text-right'])[7]");
	By Costing_Budget_Exp      = By.xpath("(//button[@type='button'])[3]");
	By Costing_Budget_data     = By.xpath("(//td[@class='text-right'])[1]");
	By Description             = By.xpath("//th[text()='Description']");
	By Trim_Avg                = By.xpath("(//th[text()='Trim Avg'])[1]");
	By Wastage                 = By.xpath("(//th[text()='Wastage%'])[1]");
	By Rate                    = By.xpath("(//th[text()='Rate'])[1]");
	By Cost_InInR              = By.xpath("(//th[text()='Cost In INR'])[1]");
	By Trim_Details            = By.xpath("//th[text()='Trim Details']");
	By qty                     = By.xpath("//th[text()='Qty']");
	By Pro_Avg                 = By.xpath("(//th[text()='Trim Avg'])[2]");
	By Pro_Wastage             = By.xpath("(//th[text()='Wastage%'])[2]");
	By Pro_Rate                = By.xpath("(//th[text()='Rate'])[2]");
	By Conversion_Rate         = By.xpath("//th[text()='Conversion Rate']");
	By Pro_Cost                = By.xpath("(//th[text()='Cost In INR'])[2]");
	By Production_Exp          = By.xpath("(//button[@type='button'])[4]");
	
	By IPO_data              = By.xpath("(//p[@class='mb-0 text-primary font-weight-bold'])[1]");
	By Style_Data            = By.xpath("(//p[@class='mb-0 text-primary font-weight-bold'])[2]");
	By Buyer_name            = By.xpath("(//p[@class='mb-0 text-primary font-weight-bold'])[3]");
	By Season_name           = By.xpath("(//p[@class='mb-0 text-primary font-weight-bold'])[4]");
	By Last_Edited           = By.xpath("(//p[@class='mb-0 text-primary font-weight-bold'])[5]");
	By Approved_Date         = By.xpath("(//p[@class='mb-0 text-primary font-weight-bold'])[6]");
	By Trim_Production_grid  = By.xpath("(//tbody[@class='p-element p-datatable-tbody'])[3]");
	By Production_bud_data   = By.xpath("(//td[@class='text-right'])[9]");
	
	
	public void Click_on_the_Trim_Sheet_Audit_Screen() throws Throwable {
		utilities.webDriverWait(driver, SW_Trim_Sheet_Audit);
		driver.findElement(SW_Trim_Sheet_Audit).click();
		utilities.MinimumWait(driver);
		
	}


	public void Costing_budget_details_are_displayed_in_the_Costing_budget_Expansion_or_not() throws Throwable {
//		utilities.webDriverWait(driver, Costing_Budget_Exp);
//		driver.findElement(Costing_Budget_Exp).click();
//		utilities.MinimumWait(driver);
		
		WebElement data = driver.findElement(Costing_Budget_data);
		String coastingData = data.getText();
		System.out.print("Display the Costing budget Data:" + coastingData);	
		
		 WebElement OrderData = driver.findElement(Costing_budget_grid);
		  
		    WebElement Data = driver.findElement(Costing_budget_grid);
		    Thread.sleep(1000);
		    List<WebElement> rows1 = Data.findElements(By.tagName("tr"));
		        int Irowcount = rows1.size();
	            int Idatarowcount = Irowcount;
	            System.out.println("No. of data Rows in the grid : " + Idatarowcount);
	         
	        if(driver.findElements(Costing_budget_grid).size() > 0) {
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


	public void The_3_percent_saving_data_is_displayed_in_the_grid() {
		WebElement data = driver.findElement(Three_Percent);
		String saving_data = data.getText();
		System.out.print("Display the Three percent saving Data:" + saving_data);
		
	}


	public void Verify_the_Costing_budget_expansion_grid_header_section_names_are_displayed_or_not() throws Throwable {
		utilities.webDriverWait(driver, Costing_Budget_Exp);
		driver.findElement(Costing_Budget_Exp).click();
		utilities.MinimumWait(driver);
		
		WebElement Description1 = driver.findElement(Description);
		String expectedDescriptionName = "Description";		
		String actualDescriptionName = Description1.getText().trim();
		if (actualDescriptionName.equals(expectedDescriptionName)) {
		    System.out.println("The Description is displayed: " + actualDescriptionName);
		} else {
		    System.out.println("The Description is not displayed.");
		}
		
		WebElement Trim = driver.findElement(Trim_Avg);
		String expectedTrimName = "Trim Avg";		
		String actualTrimName = Trim.getText().trim();
		if (actualTrimName.equals(expectedTrimName)) {
		    System.out.println("The Trim Avg is displayed: " + actualTrimName);
		} else {
		    System.out.println("The Trim Avg is not displayed.");
		}
		
		WebElement Wastage1 = driver.findElement(Wastage);
		String expectedWastageName = "Wastage%";		
		String actualWastageName = Wastage1.getText().trim();
		if (actualWastageName.equals(expectedWastageName)) {
		    System.out.println("The Costing Wastage is displayed: " + actualWastageName);
		} else {
		    System.out.println("The Costing Wastage is not displayed.");
		}
		
		WebElement Rate1 = driver.findElement(Rate);
		String expectedRateName = "Rate";		
		String actualRateName = Rate1.getText().trim();
		if (actualRateName.equals(expectedRateName)) {
		    System.out.println("The Costing Rate is displayed: " + actualRateName);
		} else {
		    System.out.println("The Costing Rate is not displayed.");
		}
		
		WebElement Cost1 = driver.findElement(Cost_InInR);
		String expectedCost1Name = "Cost In INR";		
		String actualCost1Name = Cost1.getText().trim();
		if (actualCost1Name.equals(expectedCost1Name)) {
		    System.out.println("The Costing Cost InInR is displayed: " + actualCost1Name);
		} else {
		    System.out.println("The Costing Cost InInR is not displayed.");
		}
	}


	public void Verify_the_Production_budget_expansion_grid_header_section_names_are_displayed_or_not() throws Throwable {
		utilities.webDriverWait(driver, Production_Exp);
		driver.findElement(Production_Exp).click();
		utilities.MinimumWait(driver);
		
		WebElement Description1 = driver.findElement(Trim_Details);
		String expectedDescriptionName = "Trim Details	";		
		String actualDescriptionName = Description1.getText().trim();
		if (actualDescriptionName.equals(expectedDescriptionName)) {
		    System.out.println("The Trim Details is displayed: " + actualDescriptionName);
		} else {
		    System.out.println("The Trim Details is not displayed.");
		}
		
		WebElement Trim = driver.findElement(qty);
		String expectedTrimName = "Qty";		
		String actualTrimName = Trim.getText().trim();
		if (actualTrimName.equals(expectedTrimName)) {
		    System.out.println("The Trim Qty is displayed: " + actualTrimName);
		} else {
		    System.out.println("The Trim Qty is not displayed.");
		}
		
		WebElement Avg = driver.findElement(Pro_Avg);
		String expectedAvgName = "Trim Avg";		
		String actualWastageName = Avg.getText().trim();
		if (actualWastageName.equals(expectedAvgName)) {
		    System.out.println("The Production Avg is displayed: " + actualWastageName);
		} else {
		    System.out.println("The Production Avg is not displayed.");
		}
		
		WebElement wastage = driver.findElement(Pro_Wastage);
		String expectedRateName = "Wastage%";		
		String actualRateName = wastage.getText().trim();
		if (actualRateName.equals(expectedRateName)) {
		    System.out.println("The wastage is displayed: " + actualRateName);
		} else {
		    System.out.println("The wastage is not displayed.");
		}
		
		WebElement Rate2 = driver.findElement(Pro_Rate);
		String expectedCost1Name = "Rate";		
		String actualCost1Name = Rate2.getText().trim();
		if (actualCost1Name.equals(expectedCost1Name)) {
		    System.out.println("The Productin Rate is displayed: " + actualCost1Name);
		} else {
		    System.out.println("The Productin Rate InInR is not displayed.");
		}
		
		WebElement Rate1 = driver.findElement(Conversion_Rate);
		String expectedRate1Name = "Conversion Rate	";		
		String actualRate1Name = Rate1.getText().trim();
		if (actualRate1Name.equals(expectedRate1Name)) {
		    System.out.println("The Conversion rate is displayed: " + actualRate1Name);
		} else {
		    System.out.println("The Conversion rate is not displayed.");
		}
		
		WebElement Cost1 = driver.findElement(Pro_Cost);
		String expectedCostIn= "Cost In INR";		
		String actualCost1 = Cost1.getText().trim();
		if (actualCost1.equals(expectedCostIn)) {
		    System.out.println("The Production Cost InInR is displayed: " + actualCost1);
		} else {
		    System.out.println("The Production Cost InInR is not displayed.");
		}
	}


	public void Verify_the_Selected_IPO_details_are_displayed_in_the_Information_bar_or_not() {
		WebElement Ipo = driver.findElement(IPO_data);
		String IPO_data = Ipo.getText(); 
		System.out.print("Display the Selected IPO:" + IPO_data);	
		
		WebElement Style = driver.findElement(Style_Data);
		String Style_data = Style.getText(); 
		System.out.print("Display the Selected Style:" + Style_data);	
		
		WebElement Buyer = driver.findElement(Buyer_name);
		String Buyer_data = Buyer.getText(); 
		System.out.print("Display the Selected Buyer:" + Buyer_data);	
		
		WebElement Season = driver.findElement(Season_name);
		String Season_data = Season.getText(); 
		System.out.print("Display the Selected Season:" + Season_data);	
		
		WebElement Last_edited = driver.findElement(Last_Edited);
		String Last_Edited_data = Last_edited.getText(); 
		System.out.print("Display the Last Edited:" + Last_Edited_data);	
		
		WebElement data = driver.findElement(Approved_Date);
		String Approved_data = data.getText(); 
		System.out.print("Display the Approved Data:" + Approved_data);	
		
		
	}


	public void Verify_the_Trim_Production_budget_expansion_grid_data_is_displayed_or_not() throws Throwable {
		WebElement data = driver.findElement(Production_bud_data);
		String Pro_data = data.getText();
		System.out.print("Display the Production budget Data:" + Pro_data);

		 WebElement OrderData = driver.findElement(Trim_Production_grid);
		  
		    WebElement Data = driver.findElement(Trim_Production_grid);
		    Thread.sleep(1000);
		    List<WebElement> rows1 = Data.findElements(By.tagName("tr"));
		        int Irowcount = rows1.size();
	            int Idatarowcount = Irowcount;
	            System.out.println("No. of data Rows in the grid : " + Idatarowcount);
	         
	        if(driver.findElements(Trim_Production_grid).size() > 0) {
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
