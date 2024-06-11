package Page;

import org.openqa.selenium.By;

import util.DriverFactory;
import util.Utilities;

public class Bulkchecking_Pages extends DriverFactory{

	Utilities utilities = new Utilities();
	
	By Bulk_Checking = By.xpath("//a[text()='Bulk Checking']");
	By Filter_Expansion = By.xpath("//a[@id='sidebarCollapse']");
	By Select_PO_Number = By.xpath("//div[@id='v-pills-tab']");
	By Lot_Checking_Data = By.xpath("//a[@title='Add Lot Checking Data']");
	By Checker_Name = By.xpath("//select[@formcontrolname='checkerId']");
	By Lot_Number = By.xpath("//input[@formcontrolname='lotNumber']");
	By Lot_Quantity = By.xpath("//input[@formcontrolname='lotQuantity']");
	By Lot_Submission_status = By.xpath("//select[@formcontrolname='lotSubmissionStatus']");
	By Lot_Submission_Date = By.xpath("//input[@formcontrolname='lotSubmissionDate']");
	By Lot_Approval_status = By.xpath("//select[@formcontrolname='lotApprovalStatus']");
	By Lot_Approval_Date = By.xpath("//input[@formcontrolname='lotApprovalDate']");
	
	
	

	public void click_on_Bulk_checking_screen_name() throws Throwable {
		utilities.webDriverWait(driver, Bulk_Checking);
		driver.findElement(Bulk_Checking).click();
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Filter_Expansion);
		driver.findElement(Filter_Expansion).click();
		utilities.MinimumWait(driver);
		
	}

	public void Select_the_po_number_in_filter_expansion() throws Throwable {
		utilities.webDriverWait(driver, Select_PO_Number);
		driver.findElement(Select_PO_Number).click();
		utilities.MinimumWait(driver);
		
	}

	public void clicked_on_Lot_Checking_data_icon() throws Throwable {
		utilities.webDriverWait(driver, Lot_Checking_Data);
		driver.findElement(Lot_Checking_Data).click();
		utilities.MinimumWait(driver);
		
		
	}

	public void Add_data_for_add_lot_checking_data() {
		// TODO Auto-generated method stub
		
	}

	public void clicked_on_save_button() {
		// TODO Auto-generated method stub
		
	}
	
}
