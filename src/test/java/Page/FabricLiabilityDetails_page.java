package Page;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

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
	By Color = By.xpath("//ng-select[@formcontrolname='colorId']");
	By Liability_type = By.xpath("//select[@formcontrolname='liabilityTypeId']");
	By Accepted_Qty = By.xpath("//input[@formcontrolname='acceptedQty']");
	By Extra_Accepted_Qty = By.xpath("//input[@formcontrolname='extraAcceptedQTY']");
	By Physical_Liability = By.xpath("//input[@formcontrolname='physicalLiability']");
	By Billing_Rate = By.xpath("//input[@formcontrolname='billRate']");
	
	
	
	
	
	
	

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
		Robot p = new Robot();
		p.keyPress(KeyEvent.VK_DOWN);
		p.keyPress(KeyEvent.VK_ENTER);
		utilities.MinimumWait(driver);
		
		WebElement color_d = driver.findElement(Displayed_color);
		String d_color = color_d.getText();
		System.out.println("Print displaying color: " + d_color);
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		utilities.webDriverWait(driver, Color);
		WebElement colorElement = driver.findElement(Color);
		colorElement.click();
		Thread.sleep(5000);
        colorElement.sendKeys("Azure");
		p.keyPress(KeyEvent.VK_ENTER);
		utilities.MinimumWait(driver);
		
		
	}
	
	public void click_on_Add_liability_details_button() throws Throwable {
		utilities.webDriverWait(driver, Add_libaility_information);
		
	}

	public void click_on_submit_button() {
		// TODO Auto-generated method stub
		
	}

	public void click_on_expansion_icon_to_view_the_data() {
		// TODO Auto-generated method stub
		
	}

	public void verify_that_data_is_displaying_in_expansion_grid_or_not() {
		// TODO Auto-generated method stub
		
	}

	

	
}
