package Page;

import org.openqa.selenium.By;

import util.DriverFactory;
import util.Utilities;

public class SW_Costing_Pages extends DriverFactory{

	Costingpages cps = new Costingpages();
	Utilities utilities = new Utilities();
	
	By Sweater_Costing = By.xpath("//a[text()='Costing ']");
	By Filter_icon = By.xpath("//div[@class='card-body']/..//button[@id='navbarDropdown3']");
	By Search_By_Style = By.xpath("//input[@placeholder='Search By Style #']");
	By Filter_Apply = By.xpath("//button[text()='Apply']");
	By Select_Style = By.xpath("//div[@class='card-body']/.//a[@id='v-pills-tabStyle3']");
	By Add_Combo_Name = By.xpath("//button[text()=' Add a Combo']");
	By Combo_Name = By.xpath("//input[@formcontrolname='comboName']");
	By Combo_Qty = By.xpath("//input[@formcontrolname='comboQTY']");
	By click_select_Combo = By.xpath("//div[text()='Select Combo']");
	By select_Combo_name = By.xpath("//span[@class='ng-option-label ng-star-inserted']");
	By Garment_Average = By.xpath("//input[@formcontrolname='garmentAvg']");
	By Wastage = By.xpath("//input[@formcontrolname='wastage']");
	By Yarn_Lining_Rate = By.xpath("(//input[@formcontrolname='rate'])[1]");
	By Additional_sampling_cost = By.xpath("//input[@formcontrolname='additionalSamplingCost']");
	By Freight_Cost = By.xpath("//input[@formcontrolname='freightCost']");
	
	

	public void click_on_Costing_screen_in_sweater_module() throws Throwable {
		utilities.webDriverWait(driver, Sweater_Costing);
		driver.findElement(Sweater_Costing).click();
		utilities.MinimumWait(driver);
		System.out.println("Clicked on Costing in Menu");
	}


	public void Click_on_the_style_in_costing_expansion() throws Throwable {
		utilities.webDriverWait(driver, cps.Sty1);
		driver.findElement(cps.Sty1).click();
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Filter_icon);
		driver.findElement(Filter_icon).click();
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Search_By_Style);
		driver.findElement(Search_By_Style).click();
		Thread.sleep(1000);
		driver.findElement(Search_By_Style).sendKeys("Style3");
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
		driver.findElement(Combo_Qty).sendKeys(comboqty);
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


	public void click_on_Trims_and_Accessories(String trimAccessoriesAvggarment, String trimsWastage,String trimsRate) throws Throwable {
		utilities.webDriverWait(driver, cps.AddTrims);
		driver.findElement(cps.AddTrims).click();
		Thread.sleep(1000);
		
		utilities.webDriverWait(driver, cps.Acc1_Category1);
		driver.findElement(cps.Acc1_Category1).click();
		Thread.sleep(1000);
		driver.findElement(cps.Acc1_select_Cate1).click();
		Thread.sleep(1000);
		
		utilities.webDriverWait(driver, cps.Acc1_Item1);
		driver.findElement(cps.Acc1_Item1).click();
		Thread.sleep(1000);
		driver.findElement(cps.Acc1_select_Item1).click();
		Thread.sleep(1000);
		
		utilities.webDriverWait(driver, cps.Acc1_Avg1);
		driver.findElement(cps.Acc1_Avg1).click();
		Thread.sleep(1000);
		driver.findElement(cps.Acc1_Avg1).sendKeys(trimAccessoriesAvggarment);
		Thread.sleep(1000);
		
		utilities.webDriverWait(driver, cps.Acc1_Wastage1);
		driver.findElement(cps.Acc1_Wastage1).click();
		Thread.sleep(1000);
		driver.findElement(cps.Acc1_Wastage1).sendKeys(trimsWastage);
		Thread.sleep(1000);
		
		utilities.webDriverWait(driver, cps.Acc1_Rate1);
		driver.findElement(cps.Acc1_Rate1).click();
		Thread.sleep(1000);
		driver.findElement(cps.Acc1_Rate1).sendKeys(trimsRate);
		Thread.sleep(1000);
		
	}


	
	
}
