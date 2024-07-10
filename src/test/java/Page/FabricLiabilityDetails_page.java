package Page;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import util.DriverFactory;
import util.Utilities;

public class FabricLiabilityDetails_page extends DriverFactory{

	Utilities utilities  = new Utilities();
	
	By Fabric_Liability_Details = By.xpath("//a[text()='Fabric Liability Details']");
	By DataEntry = By.xpath("(//span[text()='Data Entry'])[1]");
	By Page_title = By.xpath("//h3[text()='Fabric Liability Details ']");
	By Styles_Expansion = By.xpath("//a[@id='sidebarCollapse']");
	By select_ipo = By.xpath("//div[@id='v-pills-tab']");
	By IPO_details = By.xpath("(//ul[@class='row view-details'])[1]");
	By Grid_details = By.xpath("(//tr[@class='ng-star-inserted'])[2]");
	By Add_Liability_Details = By.xpath("//button[@title='Add Liability Information']");
	By page2_title = By.xpath("//h3[text()='Add Fabric Liability Details ']");
	By process_details = By.xpath("//ul[@class='row view-details ng-star-inserted']");
	By Displayed_color = By.xpath("//small[text()='Color']/following-sibling::p");
	By Add_libaility_information = By.xpath("//button[text()=' Add']");
	By Process = By.xpath("//select[@formcontrolname='processTypeId']");
	By Process2 = By.xpath("(//select[@formcontrolname='processTypeId'])[2]");
	By Color = By.xpath("//ng-select[@formcontrolname='colorId']");
	By Color2 = By.xpath("(//ng-select[@formcontrolname='colorId'])[2]");
	By Select_color = By.xpath("//span[text()='Azure']");
	By Select_color2 = By.xpath("(//span[text()='Azure'])[2]");
	By Liability_type = By.xpath("//select[@formcontrolname='liabilityTypeId']");
	By Liability_type2 = By.xpath("(//select[@formcontrolname='liabilityTypeId'])[2]");
	By Accepted_Qty = By.xpath("//input[@formcontrolname='acceptedQty']");
	By Accepted_Qty2 = By.xpath("(//input[@formcontrolname='acceptedQty'])[2]");
	By Extra_Accepted_Qty = By.xpath("//input[@formcontrolname='extraAcceptedQTY']");
	By Extra_Accepted_Qty2 = By.xpath("(//input[@formcontrolname='extraAcceptedQTY'])[2]");
	By Physical_Liability = By.xpath("//input[@formcontrolname='physicalLiability']");
	By Physical_Liability2 = By.xpath("(//input[@formcontrolname='physicalLiability'])[2]");
	By Billing_Rate = By.xpath("//input[@formcontrolname='billRate']");
	By Billing_Rate2 = By.xpath("(//input[@formcontrolname='billRate'])[2]");
	By Delete = By.xpath("(//div[@formarrayname='liabilityInfo']//button[@type='button'])[2]");
	By Delete_Yes = By.xpath("//button[text()='Yes']");
	By Save_button = By.xpath("//button[@type='submit']");
	By Toaster_Lessthan_RevisedQty = By.xpath("//h2[text()='Dyed Yarn Accepted Qty should not be Less than the Revised Qty']");
	By Toaster_Morethan_OriginalQty = By.xpath("//h2[text()='Dyed Yarn Accepted Qty should not be More than the Orignal Qty']");
	By SuccessToaster = By.xpath("//h2[text()='Fabric Liability Details Saved Successfully']");
	By Expansion_Icon = By.xpath("//tr/td/button");
	By Edit_Icon = By.xpath("//button[@title='Edit']");
	By Expansion_grid = By.xpath("//tr/td/table");
	By Edit_Details = By.xpath("//div[@class='modal-body']");
	By Edit_Physical_liability = By.xpath("//input[@placeholder='Enter Physical Liability']");
	By Edit_Save = By.xpath("//button[text()='Save']");
	By Logo = By.xpath("//a[@class='large_logo']");
	
	
	
	
	
	
	
	

	public void click_on_Fabric_liability_details_in_menu() throws Throwable {
		utilities.webDriverWait(driver, DataEntry);
		driver.findElement(DataEntry).click();
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Fabric_Liability_Details);
		driver.findElement(Fabric_Liability_Details).click();
		utilities.MinimumWait(driver);
		
		
	}

	public void Verify_that_user_navigated_to_fabric_liability_details_screen() throws Throwable {
		utilities.webDriverWait(driver, Page_title);
		String Page_Title = driver.findElement(Page_title).getText();
		System.out.println("Print page title :" + Page_Title);
		utilities.MinimumWait(driver);
		
	}

	public void Select_the_IPO_in_styles_expansion_in_liability_details() throws Throwable {
		utilities.webDriverWait(driver, select_ipo);
		driver.findElement(select_ipo).click();
		utilities.MinimumWait(driver);
	}

	public void IPO_is_selected_verify_the_IPO_details() throws Throwable {
		utilities.webDriverWait(driver, IPO_details);
		String ipoDetails = driver.findElement(IPO_details).getText();
		System.out.println(ipoDetails);
		utilities.MinimumWait(driver);
		
	}
	
	public void Verify_the_data_is_displaying_in_the_grid_or_not() throws Throwable {
		utilities.webDriverWait(driver, Grid_details);
		String griddata = driver.findElement(Grid_details).getText();
		System.out.println("Print the Grid Details:  " + griddata);
		utilities.MinimumWait(driver);
		
	}
	
	public void click_on_add_liability_information_button_to_navigate_to_the_add_fabric_liability_details() throws Throwable {
		utilities.webDriverWait(driver, Add_Liability_Details);
		driver.findElement(Add_Liability_Details).click();
		Thread.sleep(2000);
		utilities.webDriverWait(driver, page2_title);
		String page2 = driver.findElement(page2_title).getText();
		System.out.println("Print Page Title:  " + page2);
		utilities.MinimumWait(driver);
		
	}

	public void verify_the_Process_details_are_displaying_or_not() throws Throwable {
		utilities.webDriverWait(driver, process_details);
		String processdetails = driver.findElement(process_details).getText();
		System.out.println("Print process details:  " +  processdetails);
		utilities.MinimumWait(driver);
		
	}

	
	public void Enter_the_data_in_mandatory_fields_for_liability() throws Throwable {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		
		utilities.webDriverWait(driver, Process);
		driver.findElement(Process).click();
		Thread.sleep(1000);
		Robot p = new Robot();
		p.keyPress(KeyEvent.VK_DOWN);Thread.sleep(1000);
		p.keyPress(KeyEvent.VK_ENTER);
		utilities.MinimumWait(driver);
		
		WebElement color_d = driver.findElement(Displayed_color);
		String d_color = color_d.getText();
		System.out.println("Print displaying color: " + d_color);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		utilities.webDriverWait(driver, Color);
		driver.findElement(Color).click();
		Thread.sleep(1000);
		driver.findElement(Select_color).click();
		Thread.sleep(1000);
		
		
		utilities.webDriverWait(driver, Liability_type);
		driver.findElement(Liability_type).click();
		p.keyPress(KeyEvent.VK_DOWN);Thread.sleep(1000);
		p.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		
		utilities.webDriverWait(driver, Accepted_Qty);
		driver.findElement(Accepted_Qty).click();Thread.sleep(1000);
		driver.findElement(Accepted_Qty).sendKeys("16000");
		Thread.sleep(2000);
		
		utilities.webDriverWait(driver, Extra_Accepted_Qty);
		driver.findElement(Extra_Accepted_Qty).click();
		String Extraqty = driver.findElement(Extra_Accepted_Qty).getAttribute("Value");
		System.out.println("Qty is displaying as Accepted Qty - Revised Qty  "  +  Extraqty);
		Thread.sleep(2000);
		
		utilities.webDriverWait(driver, Physical_Liability);
		driver.findElement(Physical_Liability).click();
		driver.findElement(Physical_Liability).sendKeys("5000");
		Thread.sleep(2000);
		
		utilities.webDriverWait(driver, Billing_Rate);
		driver.findElement(Billing_Rate).click();
		driver.findElement(Billing_Rate).sendKeys("12.32");
		Thread.sleep(2000);
		
		
		
		
		
	}
	
	public void click_on_Add_liability_details_button() throws Throwable {
		utilities.webDriverWait(driver, Add_libaility_information);
		WebElement buttonElement = driver.findElement(Add_libaility_information);
		Actions actions = new Actions(driver);
        actions.doubleClick(buttonElement).build().perform();
        
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)", "");
		
        utilities.webDriverWait(driver, Delete);
        driver.findElement(Delete).click();
        Thread.sleep(2000);
        driver.findElement(Delete_Yes).click();
        Thread.sleep(2000);
		
        utilities.webDriverWait(driver, Delete);
        driver.findElement(Delete).click();
        Thread.sleep(2000);
        driver.findElement(Delete_Yes).click();
        Thread.sleep(2000);
	}

	public void click_on_submit_button() throws Throwable {
		utilities.webDriverWait(driver, Save_button);
		driver.findElement(Save_button).click();
		Thread.sleep(1000);
		
		driver.findElement(Toaster_Lessthan_RevisedQty).click();
		String L_Toaster = driver.findElement(Toaster_Lessthan_RevisedQty).getText();
		String L = "Dyed Yarn Accepted Qty should not be Less than the Revised Qty";
		System.out.println(L_Toaster);
		Thread.sleep(1000);
		
	if(L_Toaster.equals(L)) {
		driver.findElement(Accepted_Qty).click();
		Thread.sleep(1000);
		driver.findElement(Accepted_Qty).clear();
		Thread.sleep(1000);
		driver.findElement(Accepted_Qty).sendKeys("19850");
		Thread.sleep(1000);
		driver.findElement(Extra_Accepted_Qty).click();
		Thread.sleep(1000);
		driver.findElement(Save_button).click();
		Thread.sleep(1000);
		
		driver.findElement(Toaster_Morethan_OriginalQty).click();
		String M_Toaster = driver.findElement(Toaster_Morethan_OriginalQty).getText();
		String M = "Dyed Yarn Accepted Qty should not be More than the Orignal Qty";
		System.out.println(M_Toaster);
		Thread.sleep(1000);
		
		if(M_Toaster.equals(M)) {
			driver.findElement(Accepted_Qty).click();
			Thread.sleep(1000);
			driver.findElement(Accepted_Qty).clear();
			Thread.sleep(1000);
			driver.findElement(Accepted_Qty).sendKeys("17500");
			Thread.sleep(1000);
			driver.findElement(Extra_Accepted_Qty).click();
			Thread.sleep(1000);
			
			driver.findElement(Save_button).click();
			Thread.sleep(1000);
			
			driver.findElement(SuccessToaster).click();
			String success = driver.findElement(SuccessToaster).getText();
			System.out.println(success);
			Thread.sleep(1000);
			
		}
	}else {
		driver.findElement(Logo).click();
	}
		
		
		
		
	}

	public void click_on_expansion_icon_to_view_the_data() throws Throwable {
		utilities.webDriverWait(driver, Expansion_Icon);
		driver.findElement(Expansion_Icon).click();
		utilities.MinimumWait(driver);
	
	}

	public void verify_that_data_is_displaying_in_expansion_grid_or_not() throws Throwable {
		utilities.webDriverWait(driver, Expansion_grid);
		Boolean IsDisplayed = driver.findElement(Expansion_grid).isDisplayed();
		System.out.println(IsDisplayed);
		Thread.sleep(1000);
		
	}

	public void click_on_edit_icon_in_liability_details() throws Throwable {
		utilities.webDriverWait(driver, Edit_Icon);
		driver.findElement(Edit_Icon).click();
		Thread.sleep(1000);
		
		Boolean IsDisplayed = driver.findElement(Edit_Details).isDisplayed();
		System.out.println(IsDisplayed);
		Thread.sleep(1000);
		
	}

	public void verify_that_details_are_displaying_in_edit_form() throws Throwable {
		utilities.webDriverWait(driver, Edit_Details);
		Boolean IsDisplayed = driver.findElement(Edit_Details).isDisplayed();
		System.out.println(IsDisplayed);
		Thread.sleep(1000);
	}

	public void enter_the_data_in_physical_liability() throws Throwable {
		utilities.webDriverWait(driver, Edit_Physical_liability);
		driver.findElement(Edit_Physical_liability).click();
		Thread.sleep(1000);
		driver.findElement(Edit_Physical_liability).clear();
		Thread.sleep(1000);
		driver.findElement(Edit_Physical_liability).sendKeys("6500");
		Thread.sleep(1000);
		
		
	}

	public void submit_the_edit_form() throws Throwable {
		utilities.webDriverWait(driver, Edit_Save);
		driver.findElement(Edit_Save).click();
		utilities.MinimumWait(driver);
		
	}

	public void user_enter_the_mandatory_fields_with_knitting_and_spinning_process() throws Throwable {
		utilities.webDriverWait(driver, Process);
		driver.findElement(Process).click();
		Robot P = new Robot();
		P.keyPress(KeyEvent.VK_DOWN);Thread.sleep(1000);
		P.keyPress(KeyEvent.VK_DOWN);Thread.sleep(1000);
		P.keyPress(KeyEvent.VK_ENTER);
		
		utilities.webDriverWait(driver, Color);
		Boolean color = driver.findElement(Color).isDisplayed();
		System.out.println(color);
		Thread.sleep(1000);
		
		utilities.webDriverWait(driver, Liability_type);
		driver.findElement(Liability_type).click();
		Thread.sleep(1000);
		P.keyPress(KeyEvent.VK_DOWN);Thread.sleep(1000);
		P.keyPress(KeyEvent.VK_DOWN);Thread.sleep(1000);
		P.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		
		utilities.webDriverWait(driver, Accepted_Qty);
		driver.findElement(Accepted_Qty).click();
		Thread.sleep(1000);
		driver.findElement(Accepted_Qty).sendKeys("16000");
		Thread.sleep(1000);
		
		utilities.webDriverWait(driver, Extra_Accepted_Qty);
		driver.findElement(Extra_Accepted_Qty).click();
		Thread.sleep(1000);
		
		utilities.webDriverWait(driver, Physical_Liability);
		driver.findElement(Physical_Liability).click();
		Thread.sleep(1000);
		driver.findElement(Physical_Liability).sendKeys("2650");
		Thread.sleep(1000);
		driver.findElement(Billing_Rate).click();
		Thread.sleep(1000);
		driver.findElement(Billing_Rate).sendKeys("5.76");
		Thread.sleep(1000);
		
	}

	public void click_on_submit_button_to_save_the_knitting_and_spinning_process_liability_details() throws Throwable {
		utilities.webDriverWait(driver, Save_button);
		driver.findElement(Save_button).click();
		utilities.MinimumWait(driver);
		
	}

	public void user_enter_the_data_for_dyeing_process_and_shiffly_process_in_add_liability() throws Throwable {
		utilities.webDriverWait(driver, Process);
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)", "");
		//Adding the Dyeing process
		driver.findElement(Process).click();
		Robot P = new Robot();
		P.keyPress(KeyEvent.VK_DOWN);Thread.sleep(1000);
		P.keyPress(KeyEvent.VK_DOWN);Thread.sleep(1000);
		P.keyPress(KeyEvent.VK_DOWN);Thread.sleep(1000);
		P.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		
		driver.findElement(Color).click(); Thread.sleep(1000);
		driver.findElement(Select_color).click(); Thread.sleep(1000);
		driver.findElement(Liability_type).click(); Thread.sleep(1000);
		P.keyPress(KeyEvent.VK_DOWN);Thread.sleep(1000);
		P.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		
		driver.findElement(Accepted_Qty).click(); Thread.sleep(1000);
		driver.findElement(Accepted_Qty).sendKeys("15288"); Thread.sleep(1000);
		driver.findElement(Extra_Accepted_Qty).click(); Thread.sleep(1000);
		driver.findElement(Physical_Liability).click(); Thread.sleep(1000);
		driver.findElement(Physical_Liability).sendKeys("9000"); Thread.sleep(1000);
		driver.findElement(Billing_Rate).click(); Thread.sleep(1000);
		driver.findElement(Billing_Rate).sendKeys("3.33"); Thread.sleep(1000);
		
		//Adding the schiffly process
		driver.findElement(Add_libaility_information).click();
		
        js.executeScript("window.scrollBy(0,350)", "");
		driver.findElement(Process2).click();
		P.keyPress(KeyEvent.VK_DOWN);Thread.sleep(1000);
		P.keyPress(KeyEvent.VK_DOWN);Thread.sleep(1000);
		P.keyPress(KeyEvent.VK_DOWN);Thread.sleep(1000);
		P.keyPress(KeyEvent.VK_DOWN);Thread.sleep(1000);
		P.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		
		driver.findElement(Color2).click(); Thread.sleep(1000);
		driver.findElement(Select_color2).click(); Thread.sleep(1000);
		driver.findElement(Liability_type2).click(); Thread.sleep(1000);
		P.keyPress(KeyEvent.VK_DOWN);Thread.sleep(1000);
		P.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		
		driver.findElement(Accepted_Qty2).click(); Thread.sleep(1000);
		driver.findElement(Accepted_Qty2).sendKeys("12152"); Thread.sleep(1000);
		driver.findElement(Extra_Accepted_Qty2).click(); Thread.sleep(1000);
		driver.findElement(Physical_Liability2).click(); Thread.sleep(1000);
		driver.findElement(Physical_Liability2).sendKeys("6520"); Thread.sleep(1000);
		driver.findElement(Billing_Rate2).click(); Thread.sleep(1000);
		driver.findElement(Billing_Rate2).sendKeys("2.68"); Thread.sleep(1000);
		
		
	}

	public void submit_the_data_and_verify_the_process_data_in_expansion_grid() throws Throwable {
		utilities.webDriverWait(driver, Save_button);
		driver.findElement(Save_button).click();
		Thread.sleep(1000);
		driver.findElement(SuccessToaster).click();
		Thread.sleep(1000);
		String success = driver.findElement(SuccessToaster).getText();
		System.out.println(success);
		Thread.sleep(5000);
		
		driver.findElement(Expansion_Icon).click();
		Thread.sleep(1000);
		String IsDisplayed = driver.findElement(Expansion_grid).getText();
		System.out.println(IsDisplayed);
		String process = "Shiffly";
		if(IsDisplayed.contentEquals(process)) {
			System.out.println("Shiffly is displayed");
		}else {
			System.out.println("Shiffly is not displayed");
		}
	}

	

	
}
