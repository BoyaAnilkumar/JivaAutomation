package Page;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import util.DriverFactory;
import util.Utilities;

public class SW_StyleMaster_page extends DriverFactory {

	Utilities utilities = new Utilities();
	
	By Sweater_Style_Master = By.xpath("//a[text()='Style Master ']");
	By page_title = By.xpath("//h3[text()='Style Master']");
	By Add_New_Style = By.xpath("//button[text()=' Add New Style ']");
	By PD_Merchant_Name = By.xpath("(//input[@placeholder='Search By Name/Email/Ph.no'])[1]");
	By Buyer_Style = By.xpath("(//input[@formcontrolname='buyerStyleNumber'])[1]");
	By Buyer = By.xpath("(//select[@formcontrolname='buyerId'])[1]");
	By Season = By.xpath("(//select[@formcontrolname='seasonTypeId'])[1]");
	By Garment_Type = By.xpath("(//select[@formcontrolname='garmentTypeId'])[1]");
	By Garment_Process = By.xpath("(//select[@formcontrolname='garmentProcessId'])[1]");
	By Garment_Gauge = By.xpath("(//input[@formcontrolname='garmentGuage'])[1]");
	By Expected_Order_Qty = By.xpath("(//input[@formcontrolname='expectedOderQty'])[1]");
	By Expected_Order_Date = By.xpath("(//input[@formcontrolname='expectedOrderDate'])[1]");
	By Save_Button = By.xpath("(//button[text()=' Save'])[1]");
	By Filter_button = By.xpath("//button[@id='navbarDropdown3']");
	By Filter_Search = By.xpath("(//input[@formcontrolname='buyerStyleNumber'])[1]");
	By Filter_Apply = By.xpath("//button[text()='Apply']");
	By Style_Name = By.xpath("//span[text()='Buyer Style: ']/.//a[@href='javascript:void();']");
	By Alert_AlreadyExist = By.xpath("//h2[text()='Buyer Style already exist']");
	By Alert_SavedSuccessfully = By.xpath("//h2[text()='Style Master Added Successfully']");
	By Update_button = By.xpath("(//button[text()=' Updated'])[1]");
	By Edit_Icon = By.xpath("//button[@title='Edit Style Master']");
	By Edit_Buyer = By.xpath("(//select[@formcontrolname='buyerId'])[2]");
	By Add_Tech_Pack				= By.xpath("//button[text()=' Add New Tech Pack ']");
	By Tech_Pack_Name				= By.xpath("//input[@formcontrolname='techPackName']");
	By Tech_Pack_File				= By.xpath("(//input[@class='custom-file-input'])[1]");
	By Tech_Pack_Desc				= By.xpath("//textarea[@formcontrolname='description']");
	By Tech_Pack_Received_Date		= By.xpath("//input[@formcontrolname='techPackSampleReceivedDate']");
	By Tech_Pack_Save_button		= By.xpath("//button[text()=' Save']");
	By Add_Sampling_details			= By.xpath("//button[text()=' Add Sampling Details']");
	By Sample_Status				= By.xpath("(//select[@formcontrolname='sampleStatusId'])[1]");
	By Sampling_Type				= By.xpath("(//select[@formcontrolname='sampleTypeId'])[1]");
	By Sampling_submission_date		= By.xpath("(//input[@formcontrolname='sampleSubmissionDate'])[1]");
	By Sampling_details_save		= By.xpath("(//button[text()=' Save'])[3]");
	By SortingByColumns				= By.xpath("(//tr[@class='ng-star-inserted'])[1]");
	
	

	public void click_on_Style_master_screen_in_sweater_module() throws Throwable {
		utilities.webDriverWait(driver, Sweater_Style_Master);
		driver.findElement(Sweater_Style_Master).click();
		utilities.MinimumWait(driver);
	
		
		utilities.webDriverWait(driver, page_title);
		WebElement PageTitle = driver.findElement(page_title);
		String Title = PageTitle.getText();
		System.out.println("Page Title is: " + Title);
		
		String ExpectedTitle = "Style Master";
		String ActualTitle = Title;
		
		if(ExpectedTitle.equals(ActualTitle)) {
			System.out.println("Paget Titles are equal to Expected and Actual");
		}else {
			System.out.println("Page Title is different");
		}
		utilities.MinimumWait(driver);
		
	}


	public void Click_on_Add_Style_button() throws Throwable {
		utilities.webDriverWait(driver, Add_New_Style);
		driver.findElement(Add_New_Style).click();
		utilities.MinimumWait(driver);
		
	}


	public void Enter_PD_Merchant_Name_and_Select() throws Throwable {
		utilities.webDriverWait(driver, PD_Merchant_Name);
		driver.findElement(PD_Merchant_Name).click();
		Thread.sleep(1000);
		driver.findElement(PD_Merchant_Name).sendKeys("Soujanya");
		Thread.sleep(2000);
		Robot PD = new Robot();
		PD.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		PD.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		
	}


	public void Enter_Buyer_Style_name(String buyerstyle) throws Throwable {
		utilities.webDriverWait(driver, Buyer_Style);
		driver.findElement(Buyer_Style).click();
		Thread.sleep(1000);
		driver.findElement(Buyer_Style).sendKeys(buyerstyle);
		utilities.MinimumWait(driver);
		
	}


	public void Select_Buyer_from_the_dropdown_list(String buyer2) throws Throwable {
		utilities.webDriverWait(driver, Buyer);
		WebElement BuyerField = driver.findElement(Buyer);
		Select BuyerDropdown = new Select(BuyerField);
		BuyerDropdown.selectByVisibleText(buyer2);
		utilities.MinimumWait(driver);
		
	}


	public void Select_Season_from_dropddown_list(String season2) throws Throwable {
		utilities.webDriverWait(driver, Season);
		WebElement season = driver.findElement(Season);
		Select seasonDropdown = new Select(season);
		seasonDropdown.selectByVisibleText(season2);
		utilities.MinimumWait(driver);
		
	}


	public void Select_Garment_Type_from_dropdown_list(String garmenttype) throws Throwable {
		utilities.webDriverWait(driver, Garment_Type);
		WebElement garment_type = driver.findElement(Garment_Type);
		Select garmenttype_dropdown = new Select(garment_type);
		garmenttype_dropdown.selectByVisibleText(garmenttype);
		utilities.MinimumWait(driver);
		
	}


	public void Select_Garment_Process_from_dropdown_list(String garmentprocess) throws Throwable {
		utilities.webDriverWait(driver, Garment_Process);
		WebElement garment_process = driver.findElement(Garment_Process);
		Select process_dropdown = new Select(garment_process);
		process_dropdown.selectByVisibleText(garmentprocess);
		utilities.MinimumWait(driver);
		
	}


	public void Enter_the_Garment_Gauge(String garmentgauge) throws Throwable {
		utilities.webDriverWait(driver, Garment_Gauge);
		driver.findElement(Garment_Gauge).click();
		Thread.sleep(1000);
		driver.findElement(Garment_Gauge).sendKeys(garmentgauge);
		Thread.sleep(1000);
		
		
	}


	public void Click_on_Save_button_to_create_style() throws Throwable {
		utilities.webDriverWait(driver, Save_Button);
		driver.findElement(Save_Button).click();
		
		try {
			utilities.webDriverWait(driver, Alert_AlreadyExist);
			driver.findElement(Alert_AlreadyExist).click();
			WebElement Alert = driver.findElement(Alert_AlreadyExist);
			String ExistAlert = Alert.getText();
			System.out.println("Print the Alert " + ExistAlert);
			utilities.MinimumWait(driver);
			
		}catch(Exception unsaved) {
			utilities.webDriverWait(driver, Alert_SavedSuccessfully);
			driver.findElement(Alert_SavedSuccessfully).click();
			WebElement Alert = driver.findElement(Alert_SavedSuccessfully);
			String SuccessAlert = Alert.getText();
			System.out.println("Print the alert " + SuccessAlert);
		}
	}


	public void Click_on_Filter_button_in_style_master() throws Throwable {
		utilities.webDriverWait(driver, Filter_button);
		driver.findElement(Filter_button).click();
		utilities.MinimumWait(driver);
		
	}
	

	public void Enter_the_Style_name_in_Search_By_Style(String search) throws Throwable {
		utilities.webDriverWait(driver, Filter_Search);
		driver.findElement(Filter_Search).click();
		Thread.sleep(1000);
		driver.findElement(Filter_Search).sendKeys(search);
		Thread.sleep(1000);
		driver.findElement(Filter_Apply).click();
		Thread.sleep(1000);
		
	}

	
	public void Click_on_style_name() throws Throwable {
		utilities.webDriverWait(driver, Style_Name);
		driver.findElement(Style_Name).click();
		utilities.MinimumWait(driver);
		
	}


	public void user_clicked_on_Edit_icon() throws Throwable {
		utilities.webDriverWait(driver, Edit_Icon);
		driver.findElement(Edit_Icon).click();
		utilities.MinimumWait(driver);
		
	}

	
	public void update_the_style_master_data(String buyer2, String season2, String garmentType, String garmentprocess,
			String garmentgauge) throws Throwable {
		utilities.webDriverWait(driver, Edit_Buyer);
		WebElement BuyerField = driver.findElement(Edit_Buyer);
		Select BuyerDropdown = new Select(BuyerField);
		BuyerDropdown.selectByVisibleText(buyer2);
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Season);
		WebElement season = driver.findElement(Season);
		Select seasonDropdown = new Select(season);
		seasonDropdown.selectByVisibleText(season2);
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Garment_Type);
		WebElement garment_type = driver.findElement(Garment_Type);
		Select garmenttype_dropdown = new Select(garment_type);
		garmenttype_dropdown.selectByVisibleText(garmentType);
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Garment_Process);
		WebElement garment_process = driver.findElement(Garment_Process);
		Select process_dropdown = new Select(garment_process);
		process_dropdown.selectByVisibleText(garmentprocess);
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Garment_Gauge);
		driver.findElement(Garment_Gauge).click();
		Thread.sleep(1000);
		driver.findElement(Garment_Gauge).clear();
		Thread.sleep(1000);
		driver.findElement(Garment_Gauge).sendKeys(garmentgauge);
		Thread.sleep(1000);
		
	}


	public void Click_on_update_button_to_save_the_data() throws Throwable {
		utilities.webDriverWait(driver, Update_button);
		driver.findElement(Update_button).click();
		utilities.MinimumWait(driver);
		
	}


	public void Click_on_the_Add_new_tech_pack_button(String techpackname, String techpackdesc, String receiveddate) throws Throwable {
		utilities.webDriverWait(driver, Add_Tech_Pack);
		driver.findElement(Add_Tech_Pack).click();
		utilities.MinimumWait(driver);
		
		driver.findElement(Tech_Pack_Name).click();
		Thread.sleep(1000);
		driver.findElement(Tech_Pack_Name).sendKeys(techpackname);
		utilities.MinimumWait(driver);
		
		   By choose_file_upload = By.xpath("//input[@id='techPack']");
		    utilities.webDriverWait(driver, choose_file_upload);
		    WebElement fileInput = driver.findElement(choose_file_upload);
		    ((JavascriptExecutor) driver).executeScript("arguments[0].style.display = 'block';", fileInput);
		    fileInput.sendKeys("C:/Users/Calibrage26/Downloads/EAPL.pdf");
		    utilities.MaximumWait(driver);
		
	}


	public void Select_the_sampling_status(String samplingstatus) throws Throwable {
		utilities.webDriverWait(driver, Sample_Status);
		driver.findElement(Sample_Status).click();
		Thread.sleep(1000);
		WebElement samplestatus1 = driver.findElement(Sample_Status);
		Select samplestatus_dropdown = new Select(samplestatus1);
		samplestatus_dropdown.selectByVisibleText(samplingstatus);
		utilities.MinimumWait(driver);
		
	}


	public void User_Click_the_Sampling_type(String samplingtype) throws Throwable {
		utilities.webDriverWait(driver, Sampling_Type);
		WebElement samplingtype1 = driver.findElement(Sampling_Type);
		Select samplingtype_dropdown = new Select(samplingtype1);
		samplingtype_dropdown.selectByVisibleText(samplingtype);
		utilities.MinimumWait(driver);
		
	}


	public void Select_the_Submission_date(String submissiondate) throws Throwable {
		utilities.webDriverWait(driver, Sampling_submission_date);
		driver.findElement(Sampling_submission_date).click();
		Thread.sleep(1000);
		driver.findElement(Sampling_submission_date).sendKeys(submissiondate);
		utilities.MinimumWait(driver);
	}


	public void user_clicked_on_Sorting_icon_in_grid_header() throws Throwable {
		utilities.webDriverWait(driver, SortingByColumns);
		
		
		WebElement table = driver.findElement(SortingByColumns);
		
		List<WebElement> columnheader = table.findElements(By.xpath("th//p-sorticon"));

		for (WebElement header : columnheader) {

			header.click();
			utilities.MinimumWait(driver);
			header.click();
			utilities.MinimumWait(driver);
		}
		
		
	}





	
}
