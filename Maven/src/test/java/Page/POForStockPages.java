package Page;

import org.openqa.selenium.By;

import util.DriverFactory;
import util.Utilities;

public class POForStockPages extends DriverFactory {
	
	Utilities utilities = new Utilities();
	RevisedMUWorkingPages RMUW = new RevisedMUWorkingPages();
	CreatePOForStockPage CPOS = new CreatePOForStockPage();
	
	By modPOStk = By.xpath("//a[text()='PO For Stock']");
	By Fil_Textbox = By.xpath("//input[@role='textbox']");
	By FilterSH = By.xpath("//a[@id='sidebarCollapse']");
	By Fil_Supplier = By.xpath("//p-multiselect[@filterby='supplierName']");
	By Fil_Supp = By.xpath("//div[@class='p-multiselect-filter-container ng-tns-c92-418 ng-star-inserted']//input[@type='text']");
	By Fil_sel_Supplier = By.xpath("//div[text()='Soujanya']");
	By Fil_FabQty = By.xpath("//p-multiselect[@optionlabel='fabricName']");
	By Fil_ent_FabQty = By.xpath("//input[@role='textbox']");
	By Fil_sel_FabQty = By.xpath("//div[text()='Raw silk']");
	
	

	public void Navigate_to_PO_For_Stock_screen() throws Throwable {
		utilities.webDriverWait(driver, RMUW.modWoven);
		driver.findElement(RMUW.modWoven).click();
		utilities.MinimumWait(driver);
		utilities.webDriverWait(driver, RMUW.modFabricSourcing);
		driver.findElement(RMUW.modFabricSourcing).click();
		utilities.MinimumWait(driver);
		utilities.webDriverWait(driver, RMUW.DataEntry);
		driver.findElement(RMUW.DataEntry).click();
		utilities.webDriverWait(driver, CPOS.modGeneratePO);
		driver.findElement(CPOS.modGeneratePO).click();
		utilities.webDriverWait(driver, modPOStk);
		driver.findElement(modPOStk).click();
		utilities.MinimumWait(driver);
	}

	public void Click_on_the_Filter_showhide_button() throws Throwable {
		utilities.webDriverWait(driver, FilterSH);
		driver.findElement(FilterSH).click();	
	}

	public void Select_a_Supplier_from_dropdown_list() throws Throwable {
		utilities.webDriverWait(driver, Fil_Supplier);
		driver.findElement(Fil_Supplier).click();
		utilities.webDriverWait(driver, Fil_Textbox);
		driver.findElement(Fil_Textbox).sendKeys("sou");
		utilities.webDriverWait(driver, Fil_sel_Supplier);
		driver.findElement(Fil_sel_Supplier).click();
		utilities.MinimumWait(driver);
		
	}

	public void Select_a_Fabric_Quality_from_dropdown_list() throws Throwable {
		utilities.webDriverWait(driver, Fil_FabQty);
		driver.findElement(Fil_FabQty).click();
		utilities.webDriverWait(driver, Fil_Textbox);
		driver.findElement(Fil_Textbox).sendKeys("raw");
		utilities.webDriverWait(driver, Fil_sel_FabQty);
		driver.findElement(Fil_sel_FabQty).click();
		
	}

}
