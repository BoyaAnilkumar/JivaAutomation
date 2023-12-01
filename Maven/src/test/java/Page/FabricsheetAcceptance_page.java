package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import util.DriverFactory;
import util.Utilities;

public class FabricsheetAcceptance_page extends DriverFactory {
	
Utilities utilities = new Utilities();
	
	//Login Details and Select PD Orders
		By username 		= By.xpath("//input[@id='userName']");
		By password 		= By.xpath("//input[@id='userpassword']");
		By SignIn   		= By.xpath("//button[@class='btn btn-block btn-primary btn-lg font-weight-medium auth-form-btn']");
		By Dashboard 		= By.xpath("//li[text()='Home']");
	
	//Navigating to Fabric Sheet Acceptance	
		By Woven 			= By.xpath ("//div[@class='nav_title']//span[text()='Woven / knit']");
		By Fabricsourcing 	= By.xpath("//span[text()='Fabric Sourcing ']");
		By Fabshtacceptance	= By.xpath("//a[text()='Fabric Sheet Acceptance']");
		
	//Verifying the filter	
		By stylesexpansion	= By.xpath("//a[@id='sidebarCollapse']");
		By Closeexpansion	= By.xpath("//a[@id='sidebarCollapse']");
		By IPOcardbody		= By.xpath("(//div[@class='card-body'])[1]");
		By Filtericon		= By.xpath("//button[@class='btn btn-primary btn-sm mb-2 float-right']");
		By Clearfilter		= By.xpath("//button[@class='btn btn-outline-secondary btn-sm mr-2 mb-2 float-right ng-star-inserted']");
		By Buyerdrp			= By.xpath("//p-multiselect[@filterby='buyerName']");
	    By EnterBuyer 		= By.xpath("//input[@role='textbox']");
	    By SelectBuyer 		= By.xpath("//div[@class='p-checkbox-box']");
	    By clickonbuyer		= By.xpath("//p-multiselect[@filterby='buyerName']");
	    By SeasonField 		= By.xpath("//select[@formcontrolname='seasonId']");
	    By Select_Season 	= By.xpath("//option[text()=' Holiday 2022']");
	    By SearchIPO 		= By.xpath("//input[@placeholder='Enter IPO #']");
	    By Apply 			= By.xpath("//button[@class='btn btn-md btn-primary']");
	    By Reset 			= By.xpath("//button[@class='btn btn-md btn-light btn-active-light-primary mr-2']");
	    
	 //Verify the ipo data and action button
	    By Select_IPO 		= By.xpath("//a[@id='v-pills-tabIPO16/10']");
	    By Bulkfabric		= By.xpath("//input[@placeholder='Enter Bulk Fabric Deadline']");
	    By Acptfbsheet		= By.xpath("//div[@class='btn btn-md btn-danger btn-active-light-primary mr-2 ng-star-inserted']|//button[text()=' Accept Fabric Sheet']");
	    By Reason			= By.xpath("//textarea[@class='form-control ng-untouched ng-pristine ng-valid']");
	    By Acceptpopup		= By.xpath("//button[text()='Submit']");
	    By Rejectfbsheet	= By.xpath("//button[text()=' Reject Fabric Sheet']");
	    By BacktoTop		= By.xpath("//div[@id='back-top']");
	    By ViewforPrint		= By.xpath("//button[text()=' View for Print ']");
	    By Cancelprint		= By.xpath("//button[@id='closepagebutton']");
	    By History			= By.xpath("//button[text()=' History ']");	
	    By openhistory 		= By.xpath("//a[@class='btn btn-light btn-active-light-primary btn-sm']");
	    By Back				= By.xpath("//button[text()=' Back ']");
	    
	    
	    
	    
	public void Fabric_Manager_should_login_to_accept_the_fabric_sheet() throws Throwable {
		
		driver.get(prop.getProperty("url"));		
		
		utilities.webDriverWait(driver, username);
		driver.findElement(username).sendKeys("Lokesh");
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, password);
		driver.findElement(password).sendKeys("Abcd@123");
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, SignIn);
		driver.findElement(SignIn).click();
		utilities.MinimumWait(driver);
		
	}

	public void navigate_to_dashboard_after_login_the_application_or_not() throws Throwable {
		
		utilities.webDriverWait(driver, Dashboard);
		
		WebElement HomeDashboard = driver.findElement(Dashboard);
		String Dashboard = HomeDashboard.getText();
		if(HomeDashboard.isDisplayed()){
			System.out.println("The screen is navigated to " + Dashboard + " screen");
		} else {
			System.out.println("The screen is not navigated to Dashboard screen");
		}
		utilities.MinimumWait(driver);
	}

	public void user_should_navigate_to_Fabric_sheet_acceptance_screen_by_clicking_on_menu() throws Throwable {
		
		utilities.webDriverWait(driver, Woven);
		driver.findElement(Woven).click();
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Fabricsourcing);
		driver.findElement(Fabricsourcing).click();
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Fabshtacceptance);
		driver.findElement(Fabshtacceptance).click();
		utilities.MinimumWait(driver);
		
		
	}

	public void user_should_click_on_styles_expansion_to_view_the_IPOs() throws Throwable {
		
		utilities.webDriverWait(driver, stylesexpansion);
		driver.findElement(stylesexpansion).click();
		utilities.MinimumWait(driver);
		
		driver.findElement(Closeexpansion).click();
		utilities.MinimumWait(driver);
		
		driver.findElement(stylesexpansion).click();
		utilities.MinimumWait(driver);
		
		
	}

	public void Verify_that_IPOs_are_displaying_in_styles_expansion_view() throws Throwable {
		
		utilities.webDriverWait(driver, IPOcardbody);
		driver.findElement(IPOcardbody).getText();
		System.out.println("IPOs are displaying in the card ");
		utilities.MinimumWait(driver);
		
	}

	public void Click_on_filters_icon_to_apply_the_filter_to_get_the_IPOs() throws Throwable {
	
		utilities.webDriverWait(driver, Clearfilter);
		driver.findElement(Clearfilter).click();
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Filtericon);
		driver.findElement(Filtericon).click();
		utilities.MinimumWait(driver);
		
	}

	public void verify_the_IPOs_are_displaying_based_on_the_selection_of_items_in_filter() throws Throwable {
		
		utilities.webDriverWait(driver,Buyerdrp );
		driver.findElement(Buyerdrp).click();
		System.out.println("Buyer field clicked");
		utilities.MediumWait(driver);
		
		driver.findElement(EnterBuyer).sendKeys("Spin");
		utilities.MediumWait(driver);
		
		driver.findElement(SelectBuyer).click();
		utilities.MediumWait(driver);
		
		utilities.webDriverWait(driver, clickonbuyer);
		driver.findElement(clickonbuyer).click();
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, SeasonField);
		driver.findElement(SeasonField).click();
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Select_Season);
		driver.findElement(Select_Season).click();
		utilities.MinimumWait(driver);
		
		driver.findElement(SeasonField).click();
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, SearchIPO);
		driver.findElement(SearchIPO).sendKeys("IPO16/10");
		Thread.sleep(5000);
		WebElement IPOname = driver.findElement(SearchIPO);
		String ipono = IPOname.getAttribute("value");
		System.out.println("Display the entered IPO Name " + ipono );
		
		utilities.webDriverWait(driver, Apply);
		driver.findElement(Apply).click();
		utilities.MinimumWait(driver);
		
		
		
	}

	public void Click_on_the_IPO_to_approve_or_reject() throws Throwable {
		
		utilities.webDriverWait(driver, Select_IPO);
		driver.findElement(Select_IPO).click();
		utilities.MinimumWait(driver);
		
		driver.findElement(Closeexpansion).click();
		utilities.MinimumWait(driver);
	}

	public void Verify_that_Bulk_fabric_dealine_text_data_is_displaying_or_not() throws Throwable {
		
		utilities.webDriverWait(driver, Bulkfabric);
		WebElement BulkFabricDeadline = driver.findElement(Bulkfabric);
		String BFD = BulkFabricDeadline.getText();
		String expectedtext = "Should display the value in bulk fabric deadline";
		if (expectedtext.equals(BFD)) {
			System.out.println("Displaying Value for Bulk Fabric Deadline");
		}
		else {
				System.out.println("Not displaying value for bulk fabric deadline");
			}
		
		utilities.MinimumWait(driver);
		
	}

	public void Accepting_the_fabric_sheet_by_clicking_Accept_Fabric_Sheet_button() throws Throwable {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    
	
		utilities.webDriverWait(driver, Acptfbsheet);
		WebElement FabSheet = driver.findElement(Acptfbsheet);
		System.out.println(FabSheet);
		if(FabSheet.isDisplayed()){
			System.out.println("Accept button displayed");
			FabSheet.click();
		} else {
			driver.findElement(ViewforPrint).click();
			
			System.out.println("No Need To Accept the IPO and It is already accepted");
		}
		
		
	}
	
	public void Enter_Reason_for_accepting_the_IPO_by_clicking_on_submit_button() throws Throwable {
		
		utilities.webDriverWait(driver, Reason);
		driver.findElement(Reason).sendKeys("Accepting the Fabric Sheet ");
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Acceptpopup);
		WebElement submit = driver.findElement(Acceptpopup);
		if(submit.isDisplayed()) {
			submit.click();
		}
		else {
			WebElement gotop = driver.findElement(BacktoTop);
			if(gotop.isDisplayed()) {
				gotop.click();
			}
			else {
				driver.findElement(ViewforPrint).click();
				utilities.MinimumWait(driver);
				
				driver.findElement(Cancelprint).click();
				utilities.MinimumWait(driver);
			}
		}
		
		
	}
		
	
	public void Click_on_View_for_Print_button_to_view_the_fabric_sheet_in_print_view() throws Throwable {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        
        
		utilities.webDriverWait(driver, ViewforPrint);
		driver.findElement(ViewforPrint).click();
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Cancelprint);
		driver.findElement(Cancelprint).click();
		utilities.MinimumWait(driver);
	}

	public void clicked_on_reject_fabric_sheet_button_IPO_is_getting_rejected_or_not() throws Throwable {
		
		utilities.webDriverWait(driver, Rejectfbsheet);
		WebElement button = driver.findElement(Rejectfbsheet);
		
		if(button.isDisplayed()) {
			button.click();
		}
		else {
			System.out.println("Button is not displayed for this IPO");
			driver.findElement(BacktoTop).click();
		}
		
		utilities.MinimumWait(driver);
		
	}

	public void clicked_on_History_button_should_display_the_transactions_in_history_table() throws Throwable {
		
		utilities.webDriverWait(driver, History);
		driver.findElement(History).click();
		utilities.MinimumWait(driver);
		
	}

	public void User_navigated_to_history_screenshould_click_on_Open_button_to_view_the_History_of_that_record() throws Throwable {
		
		utilities.webDriverWait(driver, openhistory);
		WebElement openbutton = driver.findElement(openhistory);
		if(openbutton.isDisplayed()) {
			openbutton.click();
		}
		else {
			driver.findElement(Back).click();
			
		}
		
		
	}

	
	
	
	
	
 }
