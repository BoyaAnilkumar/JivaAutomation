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
		

		js.executeScript("window.scrollBy(0,250)");
		
		utilities.webDriverWait(driver, Dyeing_Rate);
		driver.findElement(Dyeing_Rate).click();
		Thread.sleep(1000);
		driver.findElement(Dyeing_Rate).clear();
		Thread.sleep(1000);
		driver.findElement(Dyeing_Rate).sendKeys("8.25");
		Thread.sleep(1000);
		
		
		
		
		
	}

}
