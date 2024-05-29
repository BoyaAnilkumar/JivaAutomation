package Page;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import util.DriverFactory;
import util.Utilities;

public class SW_Costing_Pages extends DriverFactory{

	Costingpages cps = new Costingpages();
	Utilities utilities = new Utilities();
	
	By Sweater_Costing = By.xpath("//a[text()='Costing ']");
	By Filter_icon = By.xpath("//div[@class='card-body']/..//button[@id='navbarDropdown3']");
	By Search_By_Style = By.xpath("//input[@placeholder='Search By Style #']");
	By Filter_Apply = By.xpath("//button[text()='Apply']");
	By Select_Style = By.xpath("//div[@class='card-body']/..//a[@role='tab']");
	By Add_Combo_Name = By.xpath("//button[text()=' Add a Combo']");
	By Combo_Name = By.xpath("//input[@formcontrolname='comboName']");
	By Card_Name = By.xpath("//h3[text()='Costing']");
	By Combo_Qty = By.xpath("//input[@formcontrolname='comboQTY']");
	By click_select_Combo = By.xpath("//div[text()='Select Combo']");
	By select_Combo_name = By.xpath("//span[@class='ng-option-label ng-star-inserted']");
	By Garment_Average = By.xpath("//input[@formcontrolname='garmentAvg']");
	By Wastage = By.xpath("//input[@formcontrolname='wastage']");
	By Yarn_Lining_Rate = By.xpath("(//tbody/tr/td//input[@formcontrolname='rate'])[1]");
	By Additional_sampling_cost = By.xpath("//input[@formcontrolname='additionalSamplingCost']");
	By Freight_Cost = By.xpath("//input[@formcontrolname='freightCost']");
	By Knitting_button = By.xpath("//button[text()=' Add Knitting']");
	By Knitting_Structure = By.xpath("//select[@formcontrolname='knittingStructureId']");
	By GG = By.xpath("//input[@formcontrolname='gg']");
	By Number_of_Ends = By.xpath("//input[@formcontrolname='numberOfEnds']");
	By Knitting_Time = By.xpath("//input[@formcontrolname='knittingTime']");
	By Knitting_Buffer = By.xpath("//input[@formcontrolname='knittingBuffer']");
	By Garment_Linking_Cost = By.xpath("//input[@formcontrolname='garmentCuttingCost']");
	By Additional_Process_Cost1 = By.xpath("(//input[@placeholder='Enter Additional Cost'])[1]");
	By Additional_Process_Cost2 = By.xpath("(//input[@placeholder='Enter Additional Cost'])[2]");
	By Additional_Process_Cost3 = By.xpath("(//input[@placeholder='Enter Additional Cost'])[3]");
	By Additional_Process_Cost4 = By.xpath("(//input[@placeholder='Enter Additional Cost'])[4]");
	By Additional_Process_Cost5 = By.xpath("(//input[@placeholder='Enter Additional Cost'])[5]");
	
	By RemoveAdditional_Process = By.xpath("(//button[@title='Remove'])[4]");
	By Delete_Yes = By.xpath("//button[text()='Yes']");
	By Table = By.xpath("(//table)[10]");
	By Finishing_Packing = By.xpath("(//select[@formcontrolname='processId'])[12]");
	By Finishing_Packing_Cost1 = By.xpath("(//input[@placeholder='Enter Cost'])[5]");
	By Finishing_Packing_Cost2 = By.xpath("(//input[@placeholder='Enter Cost'])[6]");
	By Finishing_Packing_Cost3 = By.xpath("(//input[@placeholder='Enter Cost'])[7]");
	By Finishing_Packing_Cost4 = By.xpath("(//input[@placeholder='Enter Cost'])[8]");
	By Finishing_Packing_Cost5 = By.xpath("(//input[@placeholder='Enter Cost'])[9]");
	By Finishing_Packing_Cost6 = By.xpath("(//input[@placeholder='Enter Cost'])[10]");
	By Finishing_Packing_Cost7 = By.xpath("(//input[@placeholder='Enter Cost'])[11]");
	By Washing_Garment_Process_Button = By.xpath("//h3[text()='Washing / Garment Processes']/..//button[text()=' Add a Process']");
	By Washing_Garment_Process = By.xpath("(//select[@formcontrolname='processId'])[13]");
	By Washing_Garment_Process_Cost = By.xpath("(//input[@placeholder='Enter Cost'])[12]");
	
	By Computer_Embroidery = By.xpath("(//input[@formcontrolname='rate'])[3]");
	
	
	
	
	

	public void click_on_Costing_screen_in_sweater_module() throws Throwable {
		utilities.webDriverWait(driver, Sweater_Costing);
		driver.findElement(Sweater_Costing).click();
		utilities.MinimumWait(driver);
		System.out.println("Clicked on Costing in Menu");
	}


	public void Click_on_style_in_costing_expansion(String StyleName) throws Throwable {
		utilities.webDriverWait(driver, cps.Sty1);
		driver.findElement(cps.Sty1).click();
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Filter_icon);
		driver.findElement(Filter_icon).click();
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Search_By_Style);
		driver.findElement(Search_By_Style).click();
		Thread.sleep(1000);
		driver.findElement(Search_By_Style).sendKeys(StyleName);
		Thread.sleep(1000);
		
		utilities.webDriverWait(driver, Filter_Apply);
		driver.findElement(Filter_Apply).click();
		Thread.sleep(1000);
		
		utilities.webDriverWait(driver, Select_Style);
		driver.findElement(Select_Style).click();
		String Style = driver.findElement(Select_Style).getText();
		System.out.println("print the style number" + Style);
		utilities.MinimumWait(driver);
				
		utilities.webDriverWait(driver, cps.Sty1);
		driver.findElement(cps.Sty1).click();
		utilities.MinimumWait(driver);
		
		
	}


	public void Click_on_Add_a_Combo_button() throws Throwable {
		utilities.webDriverWait(driver, Add_Combo_Name);
		driver.findElement(Add_Combo_Name).click();
		Thread.sleep(1000);
		
	}


	public void User_has_entered_(String comboname, String comboqty) throws Throwable {
		utilities.webDriverWait(driver, Combo_Name);
		driver.findElement(Combo_Name).click();
		Thread.sleep(1000);
		driver.findElement(Combo_Name).sendKeys(comboname);
		Thread.sleep(1000);
		driver.findElement(Combo_Qty).click();
		Thread.sleep(1000);
		driver.findElement(Combo_Qty).clear();
		Thread.sleep(1000);
		driver.findElement(Combo_Qty).sendKeys(comboqty);
		Thread.sleep(1000);
		driver.findElement(Card_Name).click();
		Thread.sleep(1000);
		
	}


	public void Enter_Garment_average(String garment) throws Throwable {
		utilities.webDriverWait(driver, click_select_Combo);
		driver.findElement(click_select_Combo).click();
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, select_Combo_name);
		driver.findElement(select_Combo_name).click();
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Garment_Average);
		driver.findElement(Garment_Average).click();
		Thread.sleep(1000);
		driver.findElement(Garment_Average).sendKeys(garment);
		Thread.sleep(1000);
		
		
		
	}


	public void User_has_entered_wastage(String wastage) throws Throwable {
		utilities.webDriverWait(driver, Wastage);
		driver.findElement(Wastage).click();
		Thread.sleep(1000);
		driver.findElement(Wastage).sendKeys(wastage);
		Thread.sleep(1000);
		
		
		
	}


	public void User_has_entered_rate(String rate) throws Throwable {
		utilities.webDriverWait(driver, Yarn_Lining_Rate);
		driver.findElement(Yarn_Lining_Rate).click();
		Thread.sleep(1000);
		driver.findElement(Yarn_Lining_Rate).sendKeys(rate);
		Thread.sleep(1000);
		
	}

	public void Enter_Rate_in_Sweater_costing(String computerEMBrate) throws Throwable {
		utilities.webDriverWait(driver, Computer_Embroidery);
		driver.findElement(Computer_Embroidery).click();
		Thread.sleep(1000);
		driver.findElement(Computer_Embroidery).sendKeys(computerEMBrate);
		Thread.sleep(1000);
		
	}


	public void User_has_entered_additional_sampling_cost(String addlitionalsamplingcost , String PerPcFreightCost) throws Throwable {
		utilities.webDriverWait(driver, Additional_sampling_cost);
		driver.findElement(Additional_sampling_cost).click();
		Thread.sleep(1000);
		driver.findElement(Additional_sampling_cost).clear();
		Thread.sleep(1000);
		driver.findElement(Additional_sampling_cost).sendKeys(addlitionalsamplingcost);
		Thread.sleep(1000);
		
		utilities.webDriverWait(driver, Freight_Cost);
		driver.findElement(Freight_Cost).click();
		Thread.sleep(1000);
		driver.findElement(Freight_Cost).clear();
		Thread.sleep(1000);
		driver.findElement(Freight_Cost).sendKeys(PerPcFreightCost);
		Thread.sleep(1000);
		
	}


	public void click_on_Trims_and_Accessories(String Trimcategory, String TrimItem, String trimAccessoriesAvggarment, String trimsWastage,String trimsRate) throws Throwable {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,750)", "");
		
		utilities.webDriverWait(driver, cps.AddTrims);
		driver.findElement(cps.AddTrims).click();
		Thread.sleep(3000);
		
		utilities.webDriverWait(driver, cps.Acc1_Category1);
		driver.findElement(cps.Acc1_Category1).click();
		Thread.sleep(1000);
		WebElement category = driver.findElement(cps.Acc1_Category1);
		Select TrimCategory = new Select(category);
		TrimCategory.selectByVisibleText(Trimcategory);
		
		utilities.webDriverWait(driver, cps.Acc1_Item1);
		driver.findElement(cps.Acc1_Item1).click();
		Thread.sleep(2000);
		WebElement Item = driver.findElement(cps.Acc1_Item1);
		Select Trimitem = new Select(Item);
		Trimitem.selectByVisibleText(TrimItem);
		
		utilities.webDriverWait(driver, cps.Acc1_Avg1);
		driver.findElement(cps.Acc1_Avg1).click();
		Thread.sleep(1000);
		driver.findElement(cps.Acc1_Avg1).sendKeys(trimAccessoriesAvggarment);
		Thread.sleep(1000);
		
		utilities.webDriverWait(driver, cps.Acc1_Wastage1);
		driver.findElement(cps.Acc1_Wastage1).click();
		Thread.sleep(2000);
		driver.findElement(cps.Acc1_Wastage1).sendKeys(trimsWastage);
		Thread.sleep(1000);
		
		utilities.webDriverWait(driver, cps.Acc1_Rate1);
		driver.findElement(cps.Acc1_Rate1).click();
		Thread.sleep(1000);
		driver.findElement(cps.Acc1_Rate1).sendKeys(trimsRate);
		Thread.sleep(1000);
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,750)", "");
		
	}


	public void Click_on_Add_Knitting_button_and_enter_data_for(String knittingstructure, String gG, String numberofends, String knittingTime, String knittingbuffer) throws Throwable {
		utilities.webDriverWait(driver, Knitting_button);
		driver.findElement(Knitting_button).click();
		Thread.sleep(1000);
		
		utilities.webDriverWait(driver, Knitting_Structure);
		driver.findElement(Knitting_Structure).click();
		Thread.sleep(1000);
		WebElement knittingStruc = driver.findElement(Knitting_Structure);
		Select StruKnitting = new Select(knittingStruc);
		StruKnitting.selectByVisibleText(knittingstructure);
		Thread.sleep(1000);
		
		utilities.webDriverWait(driver, GG);
		driver.findElement(GG).click();
		Thread.sleep(1000);
		driver.findElement(GG).sendKeys(gG);
		Thread.sleep(1000);
		
		utilities.webDriverWait(driver, Number_of_Ends);
		driver.findElement(Number_of_Ends).click();
		Thread.sleep(1000);
		driver.findElement(Number_of_Ends).sendKeys(numberofends);
		Thread.sleep(1000);
		
		utilities.webDriverWait(driver, Knitting_Time);
		driver.findElement(Knitting_Time).click();
		Thread.sleep(1000);
		driver.findElement(Knitting_Time).sendKeys(knittingTime);
		Thread.sleep(1000);
		
		utilities.webDriverWait(driver, Knitting_Buffer);
		driver.findElement(Knitting_Buffer).click();
		Thread.sleep(1000);
		driver.findElement(Knitting_Buffer).sendKeys(knittingbuffer);
		Thread.sleep(1000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,450)", "");
		
	}


	public void Enter_Garment_Linking_rate(String garmentLinking) throws Throwable {
		utilities.webDriverWait(driver, Garment_Linking_Cost);
		driver.findElement(Garment_Linking_Cost).click();
		Thread.sleep(1000);
		driver.findElement(Garment_Linking_Cost).clear();
		Thread.sleep(1000);
		driver.findElement(Garment_Linking_Cost).sendKeys(garmentLinking);
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,150)", "");
	}


	public void Enter_Additional_Process_cost_in_INR() throws Throwable {
		WebElement Data = driver.findElement(Table);
		  List<WebElement> rows1 = Data.findElements(By.tagName("tr"));
	        int Irowcount = rows1.size();
        int Idatarowcount = Irowcount-2;
        System.out.println("No. of data Rows in the grid : " + Idatarowcount);
		
        //Deleting the rows in additional processes
//        List<WebElement> additionalProcesses = driver.findElements(RemoveAdditional_Process);
//        int actionsPerformed = 4;
//        for (WebElement buttonElement : additionalProcesses) {
//            if (actionsPerformed >= 4) {
//                break; // Stop after 4 actions
//            }
//
//            if (buttonElement.isEnabled()) {
                // If the Partial Received button is enabled, click on it and perform actions
//                System.out.println("Button is enabled.");
//                buttonElement.click();
//                Thread.sleep(1000);
//                driver.findElement(Delete_Yes).click();
//                utilities.MediumWait(driver);
//                actionsPerformed++;
                // Perform further actions specific to the current data entry
//            }
//        }
//
//        if (actionsPerformed < 4) {
//            System.out.println("Less than 4 enabled buttons were found and processed.");
//        }
		
        utilities.webDriverWait(driver, Additional_Process_Cost1);
        driver.findElement(Additional_Process_Cost1).click();
        driver.findElement(Additional_Process_Cost1).sendKeys("10");
        Thread.sleep(1000);
        utilities.webDriverWait(driver, Additional_Process_Cost2);
        driver.findElement(Additional_Process_Cost2).click();
        driver.findElement(Additional_Process_Cost2).sendKeys("20");
        Thread.sleep(1000);
        utilities.webDriverWait(driver, Additional_Process_Cost3);
        driver.findElement(Additional_Process_Cost3).click();
        driver.findElement(Additional_Process_Cost3).sendKeys("30");
        Thread.sleep(1000);
        utilities.webDriverWait(driver, Additional_Process_Cost4);
        driver.findElement(Additional_Process_Cost4).click();
        driver.findElement(Additional_Process_Cost4).sendKeys("40");
        Thread.sleep(1000);
        utilities.webDriverWait(driver, Additional_Process_Cost5);
        driver.findElement(Additional_Process_Cost5).click();
        driver.findElement(Additional_Process_Cost5).sendKeys("50");
        Thread.sleep(1000);
        
	}


	public void Click_on_Finishing_process_and_select_value_from_dropdown() throws Throwable {
		utilities.webDriverWait(driver, Finishing_Packing);
		driver.findElement(Finishing_Packing).click();
		Robot R = new Robot();
		R.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		R.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		
		
	}


	public void Enter_cost_for_the_selected_value() throws Throwable {
		utilities.webDriverWait(driver, Finishing_Packing_Cost1);
		driver.findElement(Finishing_Packing_Cost1).click();
		driver.findElement(Finishing_Packing_Cost1).clear();
		Thread.sleep(1000);
		driver.findElement(Finishing_Packing_Cost1).sendKeys("12");
		
		utilities.webDriverWait(driver, Finishing_Packing_Cost2);
		driver.findElement(Finishing_Packing_Cost2).click();
		driver.findElement(Finishing_Packing_Cost2).clear();
		Thread.sleep(1000);
		driver.findElement(Finishing_Packing_Cost2).sendKeys("13");
		
		utilities.webDriverWait(driver, Finishing_Packing_Cost3);
		driver.findElement(Finishing_Packing_Cost3).click();
		driver.findElement(Finishing_Packing_Cost3).clear();
		Thread.sleep(1000);
		driver.findElement(Finishing_Packing_Cost3).sendKeys("14");
		
		utilities.webDriverWait(driver, Finishing_Packing_Cost4);
		driver.findElement(Finishing_Packing_Cost4).click();
		driver.findElement(Finishing_Packing_Cost4).clear();
		Thread.sleep(1000);
		driver.findElement(Finishing_Packing_Cost4).sendKeys("15");
		
		utilities.webDriverWait(driver, Finishing_Packing_Cost5);
		driver.findElement(Finishing_Packing_Cost5).click();
		driver.findElement(Finishing_Packing_Cost5).clear();
		Thread.sleep(1000);
		driver.findElement(Finishing_Packing_Cost5).sendKeys("16");
		
		utilities.webDriverWait(driver, Finishing_Packing_Cost6);
		driver.findElement(Finishing_Packing_Cost6).click();
		driver.findElement(Finishing_Packing_Cost6).clear();
		Thread.sleep(1000);
		driver.findElement(Finishing_Packing_Cost6).sendKeys("17");
		
		utilities.webDriverWait(driver, Finishing_Packing_Cost7);
		driver.findElement(Finishing_Packing_Cost7).click();
		driver.findElement(Finishing_Packing_Cost7).clear();
		Thread.sleep(1000);
		driver.findElement(Finishing_Packing_Cost7).sendKeys("18");
		
	}

	public void Select_a_Washing_Process1_in_sw_osting() throws Throwable {
		utilities.webDriverWait(driver, Washing_Garment_Process);
		driver.findElement(Washing_Garment_Process).click();
		Thread.sleep(1000);
		Robot R = new Robot();
		R.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		R.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		
	}


	public void Enter_the_Washing_Cost1_in_sw_costing() throws Throwable {
		utilities.webDriverWait(driver, Washing_Garment_Process_Cost);
		driver.findElement(Washing_Garment_Process_Cost).click();
		Thread.sleep(1000);
		driver.findElement(Washing_Garment_Process_Cost).sendKeys("25");
		Thread.sleep(1000);
		
	}


	
	
	
}
