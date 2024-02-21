package Page;

import org.openqa.selenium.By;

import util.DriverFactory;
import util.Utilities;

public class ViewFabricSheetWorkingpage extends DriverFactory {
	
	Utilities utilities = new Utilities();
	
	By FabricSourcing_Reports				=	By.xpath("(//span[text()='Reports'])[2]");
	By ViewFabricSheetWorking				=	By.xpath("//a[text()='View Fabric Sheet Working ']");
	By Filter_Status						=	By.xpath("//select[@formcontrolname='statusId']");
	By Select_Filter_Status					=	By.xpath("//option[text()=' Fabric Sheet Working Approved']");
	

	public void click_on_Reports_in_fabric_sourcing_module() throws Throwable {
		utilities.webDriverWait(driver, FabricSourcing_Reports);
		driver.findElement(FabricSourcing_Reports).click();
		utilities.MinimumWait(driver);
		
	}

	public void click_on_View_fabric_sheet_working() throws Throwable {
		utilities.webDriverWait(driver, ViewFabricSheetWorking);
		driver.findElement(ViewFabricSheetWorking).click();
		utilities.MinimumWait(driver);
		
		
	}

	public void Click_on_the_Status_field() throws Throwable {
		utilities.webDriverWait(driver, ViewFabricSheetWorking);
		driver.findElement(ViewFabricSheetWorking).click();
		utilities.MinimumWait(driver);
		
	}

	public void User_select_the_Status() {
		// TODO Auto-generated method stub
		
	}

}
