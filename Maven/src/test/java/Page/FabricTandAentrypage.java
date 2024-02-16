package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import util.DriverFactory;
import util.Utilities;

public class FabricTandAentrypage extends DriverFactory {

	Utilities utilities = new Utilities();
	
	By T_and_A_Data_Entry   	=   By.xpath("(//a[text()='T&A Data Entry'])[1]");
	By Vendor					=	By.xpath("//div[text()='Select Vender']");
	By Search_keyword			= 	By.xpath("//div[text()='Select Process']");
	By Select_labdip			=	By.xpath("//span[text()='Labdip']");
	By Search_IPO				=	By.xpath("//input[@placeholder='Enter IPO #']");
	By IPO_details				=   By.xpath("//div[@id='Buy234']");
	By Add_button				=	By.xpath("//button[text()=' Add']");
	By Quality_Submission		=	By.xpath("(//input[@class='p-inputtext p-component p-element p-inputmask'])[1]");
	By Quality_Submission_2		=	By.xpath("(//input[@class='p-inputtext p-component p-element p-inputmask'])[3]");
	By Quality_Approval			=	By.xpath("(//input[@placeholder='dd-mm'])[2]");
	By Quality_Approval_2		=	By.xpath("(//input[@placeholder='dd-mm'])[4]");
	By Quality_Remarks			=	By.xpath("(//input[@formcontrolname='remarks'])[1]");
	By Quality_Remarks_2		=	By.xpath("(//input[@formcontrolname='remarks'])[2]");
	By Quality_Delete_2			=	By.xpath("(//button[@class='btn btn-outline-danger btn-sm mt-1'])[2]");
	By Quality_Delete_2_Yes		=	By.xpath("//button[text()='Yes']");
	By Quality_Add_Button		=	By.xpath("(//button[@class='btn btn-primary btn-sm'])[1]");
	By Initialbulk_submission	=	By.xpath("(//input[@placeholder='dd-mm'])[3]");
	By Initialbulk_submission_2	=	By.xpath("(//input[@placeholder='dd-mm'])[7]");
	By Initialbulk_Approval		=	By.xpath("(//input[@placeholder='dd-mm'])[4]");
	By Initialbulk_Approval_2	=	By.xpath("(//input[@placeholder='dd-mm'])[8]");
	By Initialbulk_Remarks		=	By.xpath("(//input[@formcontrolname='remarks'])[2]");
	By Initialbulk_Remarks_2	=	By.xpath("(//input[@formcontrolname='remarks'])[4]");
	By Initialbulk_Add_Button	=	By.xpath("(//button[@class='btn btn-primary btn-sm'])[2]");
	By Initialbulk_Delete_2		=	By.xpath("(//button[@class='btn btn-outline-danger btn-sm mt-1'])[4]");
	By Initialbulk_Delete_2_Yes	=	By.xpath("//button[text()='Yes']");
	By Bulk_Status				=	By.xpath("//select[@formcontrolname='bulkStatusId']");
	By Bulk_Status_2			=	By.xpath("(//select[@formcontrolname='bulkStatusId'])[2]");
	By Bulk_Quantity			=	By.xpath("//input[@formcontrolname='quantity']");
	By Bulk_Quantity_2			=	By.xpath("(//input[@formcontrolname='quantity'])[2]");
	By Bulk_Exmill_date			=	By.xpath("(//input[@placeholder='dd-mm'])[5]");
	By Bulk_Exmill_date_2		=	By.xpath("(//p-inputmask[@formcontrolname='exMillDate'])[2]");
	By Bulk_In_House_date		=	By.xpath("(//input[@placeholder='dd-mm'])[6]");
	By Bulk_In_House_date_2		=	By.xpath("(//p-inputmask[@formcontrolname='bulkInHouseDate'])[2]");
	By Bulk_Remarks				=	By.xpath("(//input[@formcontrolname='remarks'])[3]");
	By Bulk_Remarks_2			=	By.xpath("(//input[@formcontrolname='remarks'])[6]");
	By Bulk_Add_Button			=	By.xpath("(//button[@class='btn btn-primary btn-sm'])[3]");
	By Bulk_Delete_2			=	By.xpath("(//button[@class='btn btn-outline-danger btn-sm mt-1'])[6]");
	By Bulk_Delete_2_Yes		=	By.xpath("//button[text()='Yes']");
	By Save						=	By.xpath("//button[@type='submit']");
	
	
	
	
	
	
	public void Click_on_the_T_and_A_Data_Entry_Screen() throws Throwable {
		utilities.webDriverWait(driver, T_and_A_Data_Entry);
		driver.findElement(T_and_A_Data_Entry).click();
		utilities.MinimumWait(driver);
	}


	public void click_on_vendor_field() throws Throwable {
		utilities.webDriverWait(driver, Vendor);
		driver.findElement(Vendor).click();
		utilities.MinimumWait(driver);
		
	}


	public void IPO_details_are_displaying_after_selecting_the_IPO() throws Throwable {
		utilities.webDriverWait(driver, IPO_details);
		String IPODetails = driver.findElement(IPO_details).getText();
		System.out.println("Display IPO Details:   "  +   IPODetails);
		utilities.MinimumWait(driver);
		
	}


	public void Search_and_select_the_IPO() throws Throwable {
		utilities.webDriverWait(driver, Search_IPO);
		driver.findElement(Search_IPO).sendKeys("IPO -Style-001");
		utilities.MinimumWait(driver);
		
	}


	public void verify_the_search_by_process_functionality_is_working_or_not() throws Throwable {
		utilities.webDriverWait(driver, Search_keyword);
		driver.findElement(Search_keyword).click();
		utilities.MinimumWait(driver);
		
		driver.findElement(Select_labdip).click();
		utilities.MinimumWait(driver);
		
	}


	public void click_on_add_button_to_submit_the_T_and_A() throws Throwable {
		utilities.webDriverWait(driver, Add_button);
		driver.findElement(Add_button).click();
		utilities.MinimumWait(driver);
		
	}


	public void Enter_Submission_date_for_quality_Test() throws Throwable {
		utilities.webDriverWait(driver, Quality_Submission);
		driver.findElement(Quality_Submission).sendKeys("1402");
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Quality_Approval);
		driver.findElement(Quality_Approval).sendKeys("1502");
		utilities.MinimumWait(driver);
		
	}
	
	public void Remarks_for_Quality_Test() throws Throwable {
		utilities.webDriverWait(driver, Quality_Remarks);
		driver.findElement(Quality_Remarks).click();
		driver.findElement(Quality_Remarks).sendKeys("Logs inTech");
		utilities.MinimumWait(driver);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
		
	}


	public void Enter_Initial_Bulk_Submission_and_Approval_dates() throws Throwable {
		
		utilities.webDriverWait(driver, Initialbulk_submission);
		driver.findElement(Initialbulk_submission).sendKeys("1402");
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Initialbulk_Approval);
		driver.findElement(Initialbulk_Approval).sendKeys("1502");
		utilities.MinimumWait(driver);
		
	}
	
	public void Remarks_for_Initial_Bulk_Test() throws Throwable {
		utilities.webDriverWait(driver, Initialbulk_Remarks);
		driver.findElement(Initialbulk_Remarks).click();
		driver.findElement(Initialbulk_Remarks).sendKeys("Logs inTech");
		utilities.MinimumWait(driver);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
	}


	public void Enter_Bulk_Lot_In_House_dates() throws Throwable {
		utilities.webDriverWait(driver, Bulk_Quantity);
		driver.findElement(Bulk_Quantity).click();
		driver.findElement(Bulk_Quantity).sendKeys("300");
		utilities.MinimumWait(driver);
		
		
		
	}


	public void Remarks_for_Bulk_Test() throws Throwable {
		utilities.webDriverWait(driver, Bulk_Remarks);
		driver.findElement(Bulk_Remarks).click();
		driver.findElement(Bulk_Remarks).sendKeys("Logs inTech");
		utilities.MinimumWait(driver);
		
	}


	public void click_on_the_save_button() throws Throwable {
		utilities.webDriverWait(driver, Save);
		driver.findElement(Save).click();
		utilities.MinimumWait(driver);
		
	}


	public void click_on_add_button_for_griege_process() throws Throwable {
		utilities.webDriverWait(driver, Add_button);
		driver.findElement(Add_button).click();
		System.out.println("Clicked on Add Button for Griege process");
		utilities.MinimumWait(driver);
		
		
	}


	public void Click_on_Add_button_to_insert_the_another_test_for_quality() throws Throwable {
		utilities.webDriverWait(driver, Quality_Add_Button);
		driver.findElement(Quality_Add_Button).click();
		System.out.println("clicked on add button for quality test");
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Quality_Delete_2);
		driver.findElement(Quality_Delete_2).click();
		System.out.println("Clicked on Delete icon for 2nd Quality Test");
		System.out.println("");
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Quality_Delete_2_Yes);
		driver.findElement(Quality_Delete_2_Yes).click();
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Quality_Add_Button);
		driver.findElement(Quality_Add_Button).click();
		System.out.println("clicked on add button for quality test");
		utilities.MaximumWait(driver);
		
	}


	public void Enter_dates_for_second_test_and_change_the_first_test() throws Throwable {
		
		utilities.webDriverWait(driver, Quality_Submission_2);
		driver.findElement(Quality_Submission_2).click();
		utilities.MinimumWait(driver);
		driver.findElement(Quality_Submission_2).sendKeys("1502");
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Quality_Approval_2);
		driver.findElement(Quality_Approval_2).click();
		utilities.MinimumWait(driver);
		driver.findElement(Quality_Approval_2).sendKeys("1602");
		utilities.MinimumWait(driver);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
		
	}


	public void Click_on_Add_button_to_insert_the_second_test_for_Initial_Bulk() throws Throwable {
		utilities.webDriverWait(driver, Initialbulk_Add_Button);
		driver.findElement(Initialbulk_Add_Button).click();
		System.out.println("clicked on add button for Initial Bulk test");
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Initialbulk_Delete_2);
		driver.findElement(Initialbulk_Delete_2).click();
		System.out.println("Clicked on Delete icon for 2nd Initial Bulk Test");
		System.out.println("");
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Initialbulk_Delete_2_Yes);
		driver.findElement(Initialbulk_Delete_2_Yes).click();
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Initialbulk_Add_Button);
		driver.findElement(Initialbulk_Add_Button).click();
		System.out.println("clicked on add button for Initial Bulk test");
		utilities.MaximumWait(driver);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
	}


	public void Enter_dates_for_Initial_Bulk_second_test_and_change_the_first_test() throws Throwable {
		utilities.webDriverWait(driver, Initialbulk_submission_2);
		driver.findElement(Initialbulk_submission_2).click();
		utilities.MinimumWait(driver);
		driver.findElement(Initialbulk_submission_2).sendKeys("1802");
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Initialbulk_Approval_2);
		driver.findElement(Initialbulk_Approval_2).click();
		utilities.MinimumWait(driver);
		driver.findElement(Initialbulk_Approval_2).sendKeys("1902");
		utilities.MinimumWait(driver);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
		
	}


	public void Click_on_Add_button_to_insert_the_second_test_for_bulk() throws Throwable {
		utilities.webDriverWait(driver, Bulk_Add_Button);
		driver.findElement(Bulk_Add_Button).click();
		System.out.println("Clicked on Delete icon for 2nd Bulk Test");
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Bulk_Delete_2);
		driver.findElement(Bulk_Delete_2).click();
		System.out.println("Clicked on Delete icon for 2nd Bulk Test");
		System.out.println("");
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Bulk_Delete_2_Yes);
		driver.findElement(Bulk_Delete_2_Yes).click();
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Bulk_Add_Button);
		driver.findElement(Bulk_Add_Button).click();
		System.out.println("clicked on add button for Bulk test");
		utilities.MaximumWait(driver);
		
	}


	public void Enter_dates_and_change_the_first_tests_data() {
		// TODO Auto-generated method stub
		
	}


	


	

}
