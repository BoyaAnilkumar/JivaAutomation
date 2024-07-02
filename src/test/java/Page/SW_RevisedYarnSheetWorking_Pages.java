package Page;

import org.openqa.selenium.By;

import util.DriverFactory;
import util.Utilities;

public class SW_RevisedYarnSheetWorking_Pages extends DriverFactory{
	
	Utilities utilities = new Utilities();
	
	By Generate_YarnSheet_Working = By.xpath("//span[text()='Generate Yarn Sheet Working']");
	By Revised_yarn_sheet_working = By.xpath("//a[text()=' Revised Yarn Sheet Working ']");
	By Style_Expansion = By.xpath("//a[@id='sidebarCollapse']");
	By Clear_Filter = By.xpath("(//button[@type='reset'])[1]");
	
	

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
	
	

}
