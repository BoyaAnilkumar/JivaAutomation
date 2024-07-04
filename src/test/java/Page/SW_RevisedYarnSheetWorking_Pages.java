package Page;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import util.DriverFactory;
import util.Utilities;

public class SW_RevisedYarnSheetWorking_Pages extends DriverFactory{
	
	Utilities utilities = new Utilities();
	
	By Generate_YarnSheet_Working = By.xpath("//span[text()='Generate Yarn Sheet Working']");
	By Revised_yarn_sheet_working = By.xpath("//a[text()=' Revised Yarn Sheet Working ']");
	By Style_Expansion = By.xpath("//a[@id='sidebarCollapse']");
	By Clear_Filter = By.xpath("(//button[@type='reset'])[1]");
	By MU_working_grid = By.xpath("(//tbody[@class='p-element p-datatable-tbody'])[4]");
	By EditIcon = By.xpath("(//button[@title='Edit'])[2]");
	By Editicon1 = By.xpath("(//button[@title='Edit'])[1]");
	
	By Residual_Shrinkage = By.xpath("//input[@formcontrolname='residualShrinkage']");
	By Process = By.xpath("//select[@formcontrolname='processTypeId']");
	By GreigeQty = By.xpath("//input[@formcontrolname='greigeBaseYarnReq']");
	By Greige_Sale_Base__MOQ = By.xpath("(//input[@formcontrolname='greigeBaseSaleYarnMOQ'])[2]");
	By Dyeing_MU = By.xpath("//input[@formcontrolname='dyingMUPercentage']");
	By Dyeing_Qty = By.xpath("(//input[@formcontrolname='dyingQty'])[1]");
	By Dyeing_MOQ = By.xpath("(//input[@formcontrolname='dyeingYarnMOQ'])[1]");
	By Greige_Rate = By.xpath("(//input[@formcontrolname='greigeBaseYarnRate'])[1]");
	By Greige_Cost = By.xpath("(//input[@formcontrolname='greigeBaseYarnCostInINR'])[1]");
	By Greige_Sourcing_Manager = By.xpath("(//select[@formcontrolname='greigeBaseSaleYarnManagerId'])[1]");
	By Greige_Yarn_Executive = By.xpath("(//select[@formcontrolname='greigeBaseSaleYarnExecutiveId'])[1]");
	By Dyeing_Rate = By.xpath("(//input[@formcontrolname='dyingRate'])[1]");
	By Dyeing_cost = By.xpath("(//input[@formcontrolname='dyingCostInINR'])[1]");
	By Dyeing_Sourcing_Manager = By.xpath("(//select[@formcontrolname='dyingYarnManagerId'])[1]");
	By Dyeing_Yarn_Executive = By.xpath("(//select[@formcontrolname='dyingYarnExecutiveId'])[1]");
	By Submit_Working = By.xpath("//button[text()=' Submit']");
	
	By SaleQty = By.xpath("(//input[@formcontrolname='saleYarnQTY'])[1]");
	By SaleMOQqty = By.xpath("(//input[@formcontrolname='greigeBaseSaleYarnMOQ'])[3]");
	By SaleRate = By.xpath("(//input[@formcontrolname='saleYarnRate'])[1]");
	By SaleCost = By.xpath("(//input[@formcontrolname='saleYarnCostInINR'])[1]");
	By SaleSourcingManager = By.xpath("(//select[@formcontrolname='greigeBaseSaleYarnManagerId'])[2]");
	By SaleExecutive = By.xpath("(//select[@formcontrolname='greigeBaseSaleYarnExecutiveId'])[2]");
	By submit_successmsg = By.xpath("//h2[text()='Revised Yarn Order Sheet Saved Successfully']");
	

	public void Click_on_the_Revised_yarn_sheet_working() throws Throwable {
		utilities.webDriverWait(driver, Generate_YarnSheet_Working);
		driver.findElement(Generate_YarnSheet_Working).click();
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Revised_yarn_sheet_working);
		driver.findElement(Revised_yarn_sheet_working).click();
		utilities.MinimumWait(driver);
		
	}

	public void Click_on_style_expansion_in_Revised_yarn_sheet_working() throws Throwable {
		utilities.webDriverWait(driver, Style_Expansion);
		driver.findElement(Style_Expansion).click();
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Clear_Filter);
		driver.findElement(Clear_Filter).click();
		utilities.MinimumWait(driver);
		
	}

	public void Verify_the_MU_Working_details_are_available_for_the_selected_IPO() throws Throwable {
		utilities.webDriverWait(driver, MU_working_grid);
		WebElement muworking_grid = driver.findElement(MU_working_grid);
		String gridMuworking = muworking_grid.getText();
		System.out.println("Displaying the MU Working Details: " +  gridMuworking);
		
	}

	public void Click_on_Edit_icon_for_another_yarn() throws Throwable {
		try {
			utilities.webDriverWait(driver, EditIcon);
			driver.findElement(EditIcon).click();
			utilities.MinimumWait(driver);
		}
		catch(Exception e){
			System.out.println("Edit icon is not displayed");
		}
		
	}

	public void Click_on_Edit_icon_and_change_values_then_submit_the_form() throws Throwable {
		utilities.webDriverWait(driver, Editicon1);
		driver.findElement(Editicon1).click();
		Thread.sleep(1000);
		
		driver.findElement(Residual_Shrinkage).click();
		driver.findElement(Residual_Shrinkage).clear();
		driver.findElement(Residual_Shrinkage).sendKeys("5.35");
		Thread.sleep(1000);
		
		utilities.webDriverWait(driver, Process);
		driver.findElement(Process).click();
		Robot process = new Robot();
		process.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		process.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		process.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		
		utilities.webDriverWait(driver, SaleQty);
		WebElement Saleqty = driver.findElement(SaleQty);
		String S_Qty = Saleqty.getText();
		System.out.println("Displaying the Sale Qty " + S_Qty);
		
		utilities.webDriverWait(driver, SaleMOQqty);
		driver.findElement(SaleMOQqty).click();
		Thread.sleep(1000);
		driver.findElement(SaleMOQqty).clear();
		Thread.sleep(1000);
		driver.findElement(SaleMOQqty).sendKeys("2500");
		Thread.sleep(1000);
		
		driver.findElement(SaleRate).click();
		Thread.sleep(1000);
		driver.findElement(SaleRate).clear();
		Thread.sleep(1000);
		driver.findElement(SaleRate).sendKeys("5.2");
		Thread.sleep(1000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)");
		
		driver.findElement(SaleSourcingManager).click();
		Thread.sleep(1000);
		Robot S_Manager = new Robot();
		S_Manager.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		S_Manager.keyPress(KeyEvent.VK_DOWN);
		S_Manager.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		
		driver.findElement(SaleExecutive).click();
		Robot Yarn_Executive = new Robot();
		Yarn_Executive.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		Yarn_Executive.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		
		driver.findElement(Submit_Working).click();
		utilities.MinimumWait(driver);
		System.out.println("Submitted Sale Process ");
		
		utilities.webDriverWait(driver, submit_successmsg);
		driver.findElement(submit_successmsg).click();
		String SuccessMsg = driver.findElement(submit_successmsg).getText();
		System.out.println(SuccessMsg);
		utilities.MinimumWait(driver);
		
	}
	
	

}
