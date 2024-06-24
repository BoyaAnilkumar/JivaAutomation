package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import util.DriverFactory;
import util.Utilities;

public class SW_YarnSheetAcceptance_Pages extends DriverFactory{
	Utilities utilities = new Utilities();
	
	By Yarn_Sourcing = By.xpath("//span[text()='Yarn Sourcing ']");
	By Data_Entry = By.xpath("(//span[text()='Data Entry'])[1]");
	By Yarn_Sheet_Acceptance = By.xpath("//a[text()='Yarn Sheet Acceptance ']");
	By Style_expansion = By.xpath("//a[@id='sidebarCollapse']");
	By Clear_Filter = By.xpath("//i[@class='pi pi-filter-slash']");
	By Search_By_IPO = By.xpath("//input[@placeholder='Enter IPO #']");
	By row_details = By.xpath("//ul[@class='row view-details m-auto']");
	By Yarn_details = By.xpath("(//p-table[@styleclass='p-datatable card mt-0'])[1]");
	By Quantity_Requirements = By.xpath("(//p-table[@styleclass='p-datatable card mt-0'])[2]");
	By Garment_Average = By.xpath("//p-table[@styleclass='p-datatable-sm card mt-0']");
	By View_For_Print = By.xpath("//button[text()=' View for Print ']");
	By Print_view_Header = By.xpath("(//h3[@class='mb-1 font-weight-bold header'])[1]");
	By Cancel_Button = By.xpath("//button[text()='Cancel']");
	
	
	

	public void Click_on_the_Yarn_Sourcing_Module() throws Throwable {
		utilities.webDriverWait(driver, Yarn_Sourcing);
		driver.findElement(Yarn_Sourcing).click();
		utilities.MinimumWait(driver);
		
	}

	public void Click_on_Data_Entry_in_yarn_sourcing() throws Throwable {
		utilities.webDriverWait(driver, Data_Entry);
		driver.findElement(Data_Entry).click();
		utilities.MinimumWait(driver);
		
	}

	public void Click_on_the_Yarn_Sheet_Acceptance() throws Throwable {
		utilities.webDriverWait(driver, Yarn_Sheet_Acceptance);
		driver.findElement(Yarn_Sheet_Acceptance).click();
		utilities.MinimumWait(driver);
		
	}

	public void Click_on_style_expansion_in_yarn_sheet_acceptance() throws Throwable {
		utilities.webDriverWait(driver, Style_expansion);
		driver.findElement(Style_expansion).click();
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Clear_Filter);
		driver.findElement(Clear_Filter).click();
		utilities.MinimumWait(driver);
		
	}

	public void Enter_the_IPO_in_Search_By_IPO(String searchbyipo) throws Throwable {
		utilities.webDriverWait(driver, Search_By_IPO);
		driver.findElement(Search_By_IPO).click();
		Thread.sleep(1000);
		driver.findElement(Search_By_IPO).sendKeys(searchbyipo);
		Thread.sleep(1000);
		
		System.out.println("");
	}
		public void Verify_the_grid_details_in_page() throws Throwable {
		utilities.webDriverWait(driver, Yarn_details);

		WebElement Yarndetails = driver.findElement(Yarn_details);
		String Yarn = Yarndetails.getText();
		System.out.println("Displaying Yarn Details " +  Yarn);
		System.out.println("");
		
		String garmentaverage = driver.findElement(Garment_Average).getText();
		System.out.println("Displaying garmentaverage " + garmentaverage);
		System.out.println();
		
		String Quantityrequirements = driver.findElement(Quantity_Requirements).getText();
		System.out.println("Displaying Quantity Requirements " + Quantityrequirements);
		System.out.println();
		
		
	}

	public void Click_on_View_for_Print_button() throws Throwable {
		utilities.webDriverWait(driver, View_For_Print);
		driver.findElement(View_For_Print).click();
		utilities.MinimumWait(driver);
		
		System.out.println("Navigated to Print view screen");
		
		utilities.webDriverWait(driver, Print_view_Header);
		String Printviewheader = driver.findElement(Print_view_Header).getText();
		System.out.println();
		System.out.println("Displaying the header " + Printviewheader);
		System.out.println();
		
		
	}

	public void click_on_cancel_button_in_print_view() throws Throwable {
		utilities.webDriverWait(driver, Cancel_Button);
		driver.findElement(Cancel_Button).click();
		utilities.MinimumWait(driver);
		
	}

	
	
	
	
}
