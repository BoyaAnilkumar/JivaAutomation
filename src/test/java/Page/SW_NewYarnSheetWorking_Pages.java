package Page;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import util.DriverFactory;
import util.Utilities;

public class SW_NewYarnSheetWorking_Pages extends DriverFactory{
	Utilities utilities = new Utilities();
	By Generate_YarnSheet_Working = By.xpath("//span[text()='Generate Yarn Sheet Working']");
	By New_Yarn_Sheet_Working = By.xpath("//a[text()=' New Yarn Sheet Working ']");
	By Style_Expansion = By.xpath("//a[@id='sidebarCollapse']");
	By IPO_details = By.xpath("//ul[@class='row view-details']");
	By Edit_Icon = By.xpath("//button[@title='Edit']");
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
	By MU_Working = By.xpath("(//tbody[@class='p-element p-datatable-tbody'])[2]");
	By SaleQty = By.xpath("(//input[@formcontrolname='saleYarnQTY'])[1]");
	By SaleMOQqty = By.xpath("(//input[@formcontrolname='greigeBaseSaleYarnMOQ'])[3]");
	By SaleRate = By.xpath("(//input[@formcontrolname='saleYarnRate'])[1]");
	By SaleCost = By.xpath("(//input[@formcontrolname='saleYarnCostInINR'])[1]");
	By SaleSourcingManager = By.xpath("(//select[@formcontrolname='greigeBaseSaleYarnManagerId'])[2]");
	By SaleExecutive = By.xpath("(//select[@formcontrolname='greigeBaseSaleYarnExecutiveId'])[2]");
	By Submit_to_Audit_Team = By.xpath("//button[text()=' Submit to Audit Team']");
	
	
	
	
	
	
	
	public void Click_on_the_New_yarn_sheet_working() throws Throwable {
		utilities.webDriverWait(driver, Generate_YarnSheet_Working);
		driver.findElement(Generate_YarnSheet_Working).click();
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, New_Yarn_Sheet_Working);
		driver.findElement(New_Yarn_Sheet_Working).click();
		utilities.MinimumWait(driver);
		
		
	}

	public void Click_on_style_expansion_in_New_yarn_sheet_working() throws Throwable {
		utilities.webDriverWait(driver, Style_Expansion);
		driver.findElement(Style_Expansion).click();
		utilities.MinimumWait(driver);
		
	}

	public void Verify_the_IPO_details() throws Throwable {
		utilities.webDriverWait(driver, IPO_details);
		driver.findElement(IPO_details).click();
		utilities.MinimumWait(driver);
		
	}

	public void Click_on_Edit_button_in_MU_Working_grid() throws Throwable {
		utilities.webDriverWait(driver, Edit_Icon);
		driver.findElement(Edit_Icon).click();
		utilities.MinimumWait(driver);
		
	}

	public void Add_data_for_the_IPO_MU_Working_details() throws Throwable {
		utilities.webDriverWait(driver, Residual_Shrinkage);
		driver.findElement(Residual_Shrinkage).click();
		Thread.sleep(1000);
		driver.findElement(Residual_Shrinkage).clear();
		Thread.sleep(1000);
		driver.findElement(Residual_Shrinkage).sendKeys("5.5");
		Thread.sleep(1000);
		
		utilities.webDriverWait(driver, Process);
		driver.findElement(Process).click();
		Thread.sleep(1000);
		Robot dyeing = new Robot();
		dyeing.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		dyeing.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		
		utilities.webDriverWait(driver, GreigeQty);
		WebElement greigeqty = driver.findElement(GreigeQty);
		String G_Qty = greigeqty.getAttribute("value");
		System.out.println("Displaying the Greige Qty " + G_Qty);
		Thread.sleep(1000);
		System.out.println();
		
		utilities.webDriverWait(driver, Greige_Sale_Base__MOQ);
		driver.findElement(Greige_Sale_Base__MOQ).click();
		Thread.sleep(1000);
		driver.findElement(Greige_Sale_Base__MOQ).sendKeys("2500");
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)");
		
		utilities.webDriverWait(driver, Dyeing_MU);
		driver.findElement(Dyeing_MU).click();
		Thread.sleep(1000);
		driver.findElement(Dyeing_MU).clear();
		Thread.sleep(1000);
		driver.findElement(Dyeing_MU).sendKeys("3.21");
		Thread.sleep(1000);
		
		utilities.webDriverWait(driver, GreigeQty);
		WebElement greigeqty1 = driver.findElement(GreigeQty);
		String G_Qty1 = greigeqty1.getAttribute("value");
		System.out.println("Displaying the Greige Qty " + G_Qty1);
		Thread.sleep(1000);
		System.out.println();
		
		utilities.webDriverWait(driver, Dyeing_Qty);
		WebElement dyeingqty = driver.findElement(Dyeing_Qty);
		String D_Qty = dyeingqty.getAttribute("value");
		System.out.println("Displaying the Dyeing Qty in textbox " + D_Qty);
		Thread.sleep(1000);
		System.out.println();
		
		utilities.webDriverWait(driver, Dyeing_MOQ);
		driver.findElement(Dyeing_MOQ).click();
		Thread.sleep(1000);
		driver.findElement(Dyeing_MOQ).sendKeys("5230");
		Thread.sleep(1000);
	
		
		js.executeScript("window.scrollBy(0,250)");
		
		utilities.webDriverWait(driver, Greige_Rate);
		driver.findElement(Greige_Rate).click();
		Thread.sleep(1000);
		driver.findElement(Greige_Rate).clear();
		Thread.sleep(1000);
		driver.findElement(Greige_Rate).sendKeys("12");
		Thread.sleep(1000);
		
		utilities.webDriverWait(driver, Greige_Cost);
		driver.findElement(Greige_Cost).click();
		Thread.sleep(1000);
		WebElement greigecost = driver.findElement(Greige_Cost);
		String G_Cost = greigecost.getAttribute("value");
		System.out.println("Displaying the Greige Cost based on the rate entered " + G_Cost);
		
		utilities.webDriverWait(driver, Greige_Sourcing_Manager);
		driver.findElement(Greige_Sourcing_Manager).click();
		Thread.sleep(1000);
		Robot G_Sourcing = new Robot();
		G_Sourcing.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		G_Sourcing.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		G_Sourcing.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		
		utilities.webDriverWait(driver, Greige_Yarn_Executive);
		driver.findElement(Greige_Yarn_Executive).click();
		Thread.sleep(1000);
		Robot G_YarnExecutive = new Robot();
		G_YarnExecutive.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		G_YarnExecutive.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);

		js.executeScript("window.scrollBy(0,250)");
		
		utilities.webDriverWait(driver, Dyeing_Rate);
		driver.findElement(Dyeing_Rate).click();
		Thread.sleep(1000);
		driver.findElement(Dyeing_Rate).clear();
		Thread.sleep(1000);
		driver.findElement(Dyeing_Rate).sendKeys("8.25");
		Thread.sleep(1000);
		
		utilities.webDriverWait(driver, Dyeing_cost);
		driver.findElement(Dyeing_cost).click();
		Thread.sleep(1000);
		WebElement Dyeing = driver.findElement(Dyeing_cost);
		String DyeCost = Dyeing.getAttribute("value");
		System.out.println("Displaying Dyeing Cost " + DyeCost);
		Thread.sleep(1000);
		
		utilities.webDriverWait(driver, Dyeing_Sourcing_Manager);
		driver.findElement(Dyeing_Sourcing_Manager).click();
		Thread.sleep(1000);
		Robot Dye_Sourcing = new Robot();
		Dye_Sourcing.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		Dye_Sourcing.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		Dye_Sourcing.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		
		utilities.webDriverWait(driver, Dyeing_Yarn_Executive);
		driver.findElement(Dyeing_Yarn_Executive).click();
		Thread.sleep(1000);
		Robot Dye_YarnExecutive = new Robot();
		Dye_YarnExecutive.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		Dye_YarnExecutive.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		
	}

	public void click_on_submit_button_in_working_form() throws Throwable {
		utilities.webDriverWait(driver, Submit_Working);
		driver.findElement(Submit_Working).click();
		utilities.MinimumWait(driver);
		
	}

	public void Verify_the_Data_is_displaying_in_MU_Working_grid() throws Throwable {
		utilities.webDriverWait(driver, MU_Working);
		driver.findElement(MU_Working).click();
		WebElement data = driver.findElement(MU_Working);
		String MU_Data = data.getText();
		System.out.println("Displaying the MU Working data in grid " + MU_Data);
		utilities.MinimumWait(driver);
		
	}

	public void Click_on_Edit_icon_and_submit_the_sale_process() throws Throwable {
		utilities.webDriverWait(driver, Edit_Icon);
		driver.findElement(Edit_Icon).click();
		utilities.MinimumWait(driver);
		
		driver.findElement(Residual_Shrinkage).click();
		driver.findElement(Residual_Shrinkage).clear();
		driver.findElement(Residual_Shrinkage).sendKeys("5");
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
		driver.findElement(SaleMOQqty).sendKeys("1520");
		Thread.sleep(1000);
		
		driver.findElement(SaleRate).click();
		Thread.sleep(1000);
		driver.findElement(SaleRate).clear();
		Thread.sleep(1000);
		driver.findElement(SaleRate).sendKeys("5");
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
	
	}

	public void Click_on_Submit_to_Audit_Team_button() throws Throwable {
		utilities.webDriverWait(driver, Submit_to_Audit_Team);
		WebElement MUWorkinggrid = driver.findElement(MU_Working);
		String grid_data = MUWorkinggrid.getText();
		System.out.println("Displaying Grid Data " + grid_data);
		driver.findElement(Submit_to_Audit_Team).click();
		
		
		}
		
		
	}


