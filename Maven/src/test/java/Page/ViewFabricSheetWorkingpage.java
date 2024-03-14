package Page;

import java.awt.Image;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import util.DriverFactory;
import util.Utilities;

public class ViewFabricSheetWorkingpage extends DriverFactory {
	
	Utilities utilities = new Utilities();
	
	By FabricSourcing_Reports				=	By.xpath("(//span[text()='Reports'])[2]");
	By ViewFabricSheetWorking				=	By.xpath("//a[text()='View Fabric Sheet Working ']");
	By Filter_Status						=	By.xpath("//select[@formcontrolname='statusId']");
	By Select_Filter_Status					=	By.xpath("//option[text()=' Fabric Sheet Working Approved']");
	By Select_IPO							=	By.xpath("//a[@id='v-pills-tabIPO0210']");
	By IPO_Details							=	By.xpath("//ul[@class='row view-details']");
	By Quantity_Requirements				=	By.xpath("//p-table[@class='p-element ng-star-inserted']");
	By MU_Working							=	By.xpath("//table[@id='pr_id_6-table']");
	By View_for_print						=	By.xpath("//i[@class='pi pi-eye']");
	By Print_view_logo						=	By.xpath("//img[@alt='Logo Icon']");
	

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
		utilities.webDriverWait(driver, Filter_Status);
		driver.findElement(Filter_Status).click();
		utilities.MinimumWait(driver);
		
	}

	public void User_select_the_Status() throws Throwable {
		utilities.webDriverWait(driver, Select_Filter_Status);
		driver.findElement(Select_Filter_Status).click();
		utilities.MinimumWait(driver);
		
	}

	public void Click_on_the_IPO_in_side_menu() throws Throwable {
		utilities.webDriverWait(driver, Select_IPO);
		driver.findElement(Select_IPO).click();
		utilities.MinimumWait(driver);
	}

	public void Verify_the_IPO_details_displaying_on_the_screen() throws Throwable {
		utilities.webDriverWait(driver, IPO_Details);
		String IPODetails = driver.findElement(IPO_Details).getText();
		System.out.println("Displaying IPO Detaisl: " + IPODetails);
		utilities.MinimumWait(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)", "");
		
	}

	public void Validate_that_Quantity_Requirement_grid_is_displaying_with_data_or_not() throws Throwable {
		utilities.webDriverWait(driver, Quantity_Requirements);
		String QuantityRequirement = driver.findElement(Quantity_Requirements).getText();
		System.out.println("Displaying Quantity Requirement Details:  "  +  QuantityRequirement);
		utilities.MinimumWait(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
		

	}

	public void Validate_that_MU_Working_grid_is_displaying_with_data_or_not() throws Throwable {
		utilities.webDriverWait(driver, MU_Working);
		String MUWorking = driver.findElement(MU_Working).getText();
		System.out.println("Displaying MU Working Details:  "  +  MUWorking);
		utilities.MinimumWait(driver);
		
	}

	public void verify_the_view_for_print_button_is_displaying_or_not() throws Throwable {
		utilities.webDriverWait(driver, View_for_print);
		String Button = driver.findElement(View_for_print).getText();
		System.out.println("Displaying View for Print Button:  " + Button);
		utilities.MinimumWait(driver);
		
	}

	public void click_on_view_for_print_button() throws Throwable {
	utilities.webDriverWait(driver, View_for_print);
	driver.findElement(View_for_print).click();
	utilities.MinimumWait(driver);
		
	}

	public void Print_screen_is_opened() throws Throwable {
		utilities.webDriverWait(driver, Print_view_logo);
		
		WebElement element = driver.findElement(Print_view_logo);
		// Convert WebElement to a TakesScreenshot
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		// Capture screenshot of the WebElement
		byte[] screenshotBytes = element.getScreenshotAs(OutputType.BYTES);
		
		utilities.MinimumWait(driver);
		
	}
	
	
}
