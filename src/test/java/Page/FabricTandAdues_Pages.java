package Page;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import util.DriverFactory;
import util.Utilities;

public class FabricTandAdues_Pages extends DriverFactory{

	Utilities util = new Utilities();
	
	By TandA = By.xpath("//div/span[text()='T&A']");
	By FabricTandDdues = By.xpath("//li/a[text()='T&A Dues']");
	By Fabricdues = By.xpath("//div/h3[text()='Fabric T&A Dues']");
	By Overdue = By.xpath("//a/u[text()='Overdue']");
	By Today = By.xpath("//a/u[text()='Today']");
	By Upcoming = By.xpath("//a/u[text()='Upcoming']");
	By Overdue_Submission = By.xpath("(//li/a[text()='Submissions Due From Fabric Team'])[1]");
	By Overdue_Approval = By.xpath("(//li/a[text()='Approvals Due From Merchant'])[1]");
	By Overdue_Submission_Grid_Data = By.xpath("(//table)[1]");
	By Overdue_Approval_GridData = By.xpath("(//table)[2]");
	By Today_submission = By.xpath("(//li/a[text()='Submissions Due From Fabric Team'])[2]");
	By Today_Approval = By.xpath("(//li/a[text()='Approvals Due From Merchant'])[2]");
	By Today_Submission_Grid_Data = By.xpath("(//table)[3]");
	By Today_Approval_Grid_Data = By.xpath("(//table)[4]");
	By Upcoming_Submission = By.xpath("(//li/a[text()='Submissions Due From Fabric Team'])[3]");
	By Upcoming_Approval = By.xpath("(//li/a[text()='Approvals Due From Merchant'])[3]");
	By Upcoming_Submission_Grid_Data = By.xpath("(//table)[5]");
	By Upcoming_Approval_Grid_Data = By.xpath("(//table)[6]");
	By SortingByColumns_Overdue_submission = By.xpath("//table/thead//p-sorticon");
	By SortingByColumns_Overdue_Approval = By.xpath("//thead/tr/th/div/p-sorticon");
	
	

	public void Click_on_Fabric_T_and_A_dues_screen() throws Throwable {
		
		util.webDriverWait(driver, TandA);
		driver.findElement(TandA).click();
		util.MinimumWait(driver);
		
		util.webDriverWait(driver, FabricTandDdues);
		driver.findElement(FabricTandDdues).click();
		util.MinimumWait(driver);
		
		util.webDriverWait(driver, Fabricdues);
		driver.findElement(Fabricdues).click();
		util.MinimumWait(driver);
		
		String Pagetitle = driver.getTitle();
		System.out.println("Page Title:  " + Pagetitle);
		
		
		
	}

	public void Verify_that_overdue_today_upcoming_sections_are_displaying_or_not() throws Throwable {
		util.webDriverWait(driver, Overdue);
		WebElement overdue = driver.findElement(Overdue);
		boolean isdisplayed = overdue.isDisplayed();
		if(isdisplayed) {
			System.out.println("Element is Displayed.");
		}else {
            System.out.println("Element is not displayed.");
        }
		util.MinimumWait(driver);
		
		
		util.webDriverWait(driver, Today);
		WebElement today = driver.findElement(Today);
		boolean todayisdisplayed = today.isDisplayed();
		if(todayisdisplayed) {
			System.out.println("Element is Displayed.");
		}else {
            System.out.println("Element is not displayed.");
        }
		
		util.webDriverWait(driver, Upcoming);
		WebElement upcoming = driver.findElement(Upcoming);
		boolean upcomingisdisplayed = upcoming.isDisplayed();
		if(upcomingisdisplayed) {
			System.out.println("Element is Displayed.");
		}else {
			System.out.println("Element is not displayed.");
		}
		
	}

	public void Verify_that_overdue_is_opened_bydefault() throws Throwable {
		util.webDriverWait(driver, Overdue_Submission_Grid_Data);
		WebElement overdueData = driver.findElement(Overdue_Submission_Grid_Data);
		boolean isdefaultdisplayed = overdueData.isDisplayed();
		if(isdefaultdisplayed) {
			System.out.println("Default Overdue is opened and displaying grid. ");
		}else {
			System.out.println("Default Overdue is not displaying. ");
		}
		
	}

	public void verify_the_submission_and_Approval_tabs_are_clickable_or_not() throws Throwable {
		//Approval Overdue from merchant
		util.webDriverWait(driver, Overdue_Approval);
		WebElement approval = driver.findElement(Overdue_Approval);
		boolean isClickable = approval.isEnabled();
		if(isClickable) {
			 driver.findElement(Overdue_Approval).click();
			System.out.println("Approval Overdue is clickable.");
		}else {
			System.out.println("Approval Overdue is not clickable.");
		}
		util.MinimumWait(driver);
		
		util.webDriverWait(driver, Overdue_Approval_GridData);
		WebElement approvaldata = driver.findElement(Overdue_Approval_GridData);
		boolean isDisplayed = approvaldata.isDisplayed();
		if(isDisplayed) {
			System.out.println("Grid Data is displayed for Approvals overdue.");
		}else {
			System.out.println("Grid Data is not displayed for Approvals overdue.");
		}
		util.MinimumWait(driver);
		
		//Submissions Overdue from fabric team
		util.webDriverWait(driver, Overdue_Submission);
		WebElement submission = driver.findElement(Overdue_Submission);
		boolean isClickable1 = submission.isEnabled();
		if(isClickable1) {
			 driver.findElement(Overdue_Submission).click();
			System.out.println("Submission Overdue is clickable.");
		}else {
			System.out.println("Submission Overdue is not clickable.");
		}
		util.MinimumWait(driver);
		
		util.webDriverWait(driver, Overdue_Submission_Grid_Data);
		WebElement submissiondata = driver.findElement(Overdue_Submission_Grid_Data);
		boolean isDisplayed1 = submissiondata.isDisplayed();
		if(isDisplayed1) {
			System.out.println("Grid Data is displayed for Submission overdue.");
		}else {
			System.out.println("Grid Data is not displayed for Submission overdue.");
		}
		util.MinimumWait(driver);
		
		driver.findElement(Overdue).click();
		util.MinimumWait(driver);
		
		
		//Approval dues from merchant
		util.webDriverWait(driver, Today);
		driver.findElement(Today).click();
		util.MinimumWait(driver);
		util.webDriverWait(driver, Today_Approval);
		WebElement todayapproval = driver.findElement(Today_Approval);
		boolean isClickable2 = todayapproval.isEnabled();
		if(isClickable2) {
			 driver.findElement(Today_Approval).click();
			System.out.println("Today Approvals due is clickable.");
		}else {
			System.out.println("Today Approvals due is not clickable.");
		}
		util.MinimumWait(driver);
		
		util.webDriverWait(driver, Today_Approval_Grid_Data);
		WebElement todayapprovaldata = driver.findElement(Today_Approval_Grid_Data);
		boolean isDisplayed2 = todayapprovaldata.isDisplayed();
		if(isDisplayed2) {
			System.out.println("Grid Data is displayed for Today Approvals overdue.");
		}else {
			System.out.println("Grid Data is not displayed for Today Approvals overdue.");
		}
		util.MinimumWait(driver);
		
		//Submission dues from fabric team
		util.webDriverWait(driver, Today_submission);
		WebElement todaysubmission2 = driver.findElement(Today_submission);
		boolean isClickable3 = todaysubmission2.isEnabled();
		if(isClickable3) {
			 driver.findElement(Today_submission).click();
			System.out.println("Today Submissions due is clickable.");
		}else {
			System.out.println("Today Submissions due is not clickable.");
		}
		util.MinimumWait(driver);
		
		util.webDriverWait(driver, Today_Submission_Grid_Data);
		WebElement todaysubmissiondata = driver.findElement(Today_Submission_Grid_Data);
		boolean isDisplayed3 = todaysubmissiondata.isDisplayed();
		if(isDisplayed3) {
			System.out.println("Grid Data is displayed for Today submissions due.");
		}else {
			System.out.println("Grid Data is not displayed for Today submissions due.");
		}
		util.MinimumWait(driver);
		driver.findElement(Today).click();
		util.MinimumWait(driver);
		
		
		//upcoming approval due from merchant
		util.webDriverWait(driver, Upcoming);
		driver.findElement(Upcoming).click();
		util.MinimumWait(driver);
		
		util.webDriverWait(driver, Upcoming_Approval);
		WebElement upApproval = driver.findElement(Upcoming_Approval);
		boolean isclickable3 = upApproval.isEnabled();
		if(isclickable3) {
			driver.findElement(Upcoming_Approval).click();
			System.out.println("Approvals due from merchant is clickable.");
		}else {
			System.out.println("Approvals due from merchant is not clickable.");
		}
		util.MinimumWait(driver);
		
		util.webDriverWait(driver, Upcoming_Approval_Grid_Data);
		WebElement UpApproval_gridData = driver.findElement(Upcoming_Approval_Grid_Data);
		boolean isdisplayed3 = UpApproval_gridData.isDisplayed();
		if(isdisplayed3) {
			driver.findElement(Upcoming_Approval_Grid_Data).isDisplayed();
			System.out.println("Displaying upcoming approval grid data");
		}else {
			System.out.println("Not Displaying upcoming approval grid data");
			
		}
		
		
		
		//upcoming submission due from merchant
				util.webDriverWait(driver, Upcoming_Submission);
				WebElement upsubmission = driver.findElement(Upcoming_Submission);
				boolean isClickable4 = upsubmission.isEnabled();
				if(isClickable4) {
					driver.findElement(Upcoming_Submission).click();
					System.out.println("Submission due from fabric team is clickable.");
				}else {
					System.out.println("Submission due from fabric team is not clickable.");
				}
				util.MinimumWait(driver);
				
				util.webDriverWait(driver, Upcoming_Submission_Grid_Data);
				WebElement upsubmission_grid_data = driver.findElement(Upcoming_Submission_Grid_Data);
				boolean isdisplayed4 = upsubmission_grid_data.isDisplayed();
				if(isdisplayed4) {
					driver.findElement(Upcoming_Submission_Grid_Data).isDisplayed();
					System.out.println("Upcoming Submission data is displaying in grid");
				}else {
					System.out.println("Upcoming Submission data is not displaying in grid");
				}
				util.MinimumWait(driver);
				driver.findElement(Upcoming).click();
				util.MinimumWait(driver);
		
		
	}

	public void verify_the_sorting_functionality_for_all_sections() throws Throwable {
		driver.navigate().refresh();

		WebElement table = driver.findElement(SortingByColumns_Overdue_Approval);
		List<WebElement> columnheader = table.findElements(By.xpath("th"));

		for (WebElement header : columnheader) { 

			header.click();
			util.MinimumWait(driver);
			header.click();
			util.MinimumWait(driver);
		}
		
	}
	
}
