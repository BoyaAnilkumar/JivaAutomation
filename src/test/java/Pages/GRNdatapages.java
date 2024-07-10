package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import util.DriverFactory;
import util.Utilities;

public class GRNdatapages extends DriverFactory{

	Utilities utilities = new Utilities();
	
	By Auditmodule = By.xpath("(//span[text()='Audit '])[1]");
	By GrnData = By.xpath("//ul[@class='mm-collapse mm-show']/..//a[text()='GRN Data']");
	By Merchant = By.xpath("//div[text()='Select Merchant']");
	By SelectMerchant = By.xpath("//li[@aria-label='Lavanya K']");
	By sideclick = By.xpath("//hr[@class='mt-2']");
	By Supplier = By.xpath("//div[text()='Select Supplier']");
	By selectsupplier = By.xpath("//li[@aria-label='Ramya']");
	By SearchIpo = By.xpath("//input[@formcontrolname='searchText']");
	By SelectIPO = By.xpath("//a[@id='v-pills-tabJ-58']");
	By IPOdetails = By.xpath("//ul[@class='row view-details mb-3']");
	By griddetails = By.xpath("//div[@class='row ng-star-inserted']/..//div[@class='col-lg-12']");
	By Expansionicon = By.xpath("//a[@class='p-element']");
	By Expansiongrid = By.xpath("//div[@id='tabs']/div[@class='card']/div[@class='card-body']//div[@class='col-lg-12']/p-table[@class='p-element']/div/div[@class='p-datatable-wrapper']/table[@role='table']/tbody/tr[2]/td");
	By Pagenation = By.xpath("//div[@class='ng-tns-c74-30 p-paginator-rpp-options p-dropdown p-component']");
	By Report = By.xpath("//ul[@id='sidebar_menu']/li[5]/ul[@class='mm-collapse mm-show']/li[2]/ul[@class='mm-collapse mm-show']/li[2]/a[@href='#']");
	
	
	
	
	
	
	
	
	
	public void Click_on_the_Audit_module() throws Throwable {
		
		utilities.webDriverWait(driver, Auditmodule);
		driver.findElement(Auditmodule).click();
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Report);
		driver.findElement(Report).click();
		utilities.MinimumWait(driver);
		
		
	}

	
	public void Click_on_GRN_data_screen() throws Throwable {
		utilities.webDriverWait(driver, GrnData);
		driver.findElement(GrnData).click();
		utilities.MinimumWait(driver);	
	}

	public void Select_the_Merchant_and_Supplier() throws Throwable {
		utilities.webDriverWait(driver, Merchant);
		driver.findElement(Merchant).click();
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, SelectMerchant);
		driver.findElement(SelectMerchant).click();
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, sideclick);
		driver.findElement(sideclick).click();
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Supplier);
		driver.findElement(Supplier).click();
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, selectsupplier);
		driver.findElement(selectsupplier).click();
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, sideclick);
		driver.findElement(sideclick).click();
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, SearchIpo);
		driver.findElement(SearchIpo).click();
		utilities.MinimumWait(driver);
		driver.findElement(SearchIpo).sendKeys("Innova");
		utilities.MinimumWait(driver);
	}


	public void Select_the_IPO_in_Style_expansion() throws Throwable {
		utilities.webDriverWait(driver, SelectIPO);
		driver.findElement(SelectIPO).click();
		utilities.MinimumWait(driver);
		
	}

	
	public void user_selects_the_Ipo_verify_the_Ipo_details_which_are_displayed_on_the_screen_or_not() throws Throwable {
		
		utilities.webDriverWait(driver, IPOdetails);
		driver.findElement(IPOdetails).isDisplayed();
		WebElement Details  = driver.findElement(IPOdetails);
		String IPODETAILS = Details.getText();
		utilities.MinimumWait(driver);
		System.out.println("Details: "+ IPODETAILS );
		utilities.MinimumWait(driver);
		
	}

	public void verify_the_grid_is_displaying_or_not() throws Throwable {
		
		utilities.webDriverWait(driver, griddetails);
		WebElement GridDetails = driver.findElement(griddetails);
		String GridDet = GridDetails.getText();
		System.out.println("Displaying Grid Details: " + GridDet);
		utilities.MinimumWait(driver);
		
	}

	public void Verify_the_expansion_icon_is_displaying_or_not() throws Throwable {
		utilities.webDriverWait(driver, Expansionicon);
		WebElement Expaicon = driver.findElement(Expansionicon);
		boolean Expansionicon = Expaicon.isDisplayed();
		System.out.println("Expansion icon is displaying "+ Expansionicon);
		utilities.MinimumWait(driver);
	}

	public void Click_on_expansion_icon() throws Throwable {
		utilities.webDriverWait(driver, Expansionicon);
		driver.findElement(Expansionicon).click();
		utilities.MinimumWait(driver);
		
	}

	public void verify_the_data_is_displaying_in_the_expansion_grid_or_not() throws Throwable {
		utilities.webDriverWait(driver, Expansiongrid);
		WebElement Griddataexp = driver.findElement(Expansiongrid);
		String expansgrid = Griddataexp.getText();
		System.out.println("Displaying data in expansion grid: "+ expansgrid);
		utilities.MinimumWait(driver);
		
	}

	public void validate_the_expansion_grid_data() throws Throwable {
		utilities.webDriverWait(driver, Expansionicon);
		driver.findElement(Expansionicon).click();
		utilities.MinimumWait(driver);
		
		
	}


	
}
