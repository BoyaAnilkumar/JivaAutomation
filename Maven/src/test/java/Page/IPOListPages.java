package Page;


import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

//import java.text.SimpleDateFormat;
//import java.util.Date;
//import org.joda.time.DateTime;
import util.DriverFactory;
import util.Utilities;

public class IPOListPages extends DriverFactory {
	Date currentDate = new Date();
	SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
	String TodayDate = dateFormat.format(currentDate);

	Utilities utilities = new Utilities();
	
//	Filters functionality
	By txtUN = By.xpath("//input[@id='userName']");
	By txtPwd = By.xpath("//input[@id='userpassword']");
	By btnSignIn = By.xpath("//button[@class='btn btn-block btn-primary btn-lg font-weight-medium auth-form-btn']");
	By Woven = By.xpath("//span[text()='Woven / knit']");
	By Audit = By.xpath("(//span[text()='Audit '])");
	By Dataentry = By.xpath("(//a[@aria-expanded='false']/..//span[text()='Data Entry'])[2]");
	By IPOList = By.xpath("//a[@href='/JivaDesign_Test/Web/ipo-list']");
	By Filter_but = By.xpath("//button[@id='navbarDropdown3']");
	
	By IPOFromDate = By.xpath("//input[@formcontrolname='ipoFromDate']");
	By IPOToDate = By.xpath("//input[@formcontrolname='ipoToDate']");
	By Buyer = By.xpath("//div[text()='Select Buyer']");
	By Select_Buyer = By.xpath("//li[@aria-label='8 Seconds']");
	By PDMerchant = By.xpath("//input[@class='ng-tns-c93-10 p-autocomplete-input p-inputtext p-component ng-star-inserted']");
	By Select_PDMerchant = By.xpath("//span[text()='Phani L']");
	By Merchant = By.xpath("//div[@class='p-element p-multiselect-label-container ng-tns-c92-65']");
	By Select_Merchant = By.xpath("//li[@aria-label='Lavanya K']");
	By AssMthYear = By.xpath("//input[@class='ng-tns-c81-22 p-inputtext p-component ng-star-inserted']");
	By Select_AssMthYear = By.xpath("//span[text()=' Sep ']");
	By IPOSearch = By.xpath("//input[@formcontrolname='searchText']");
	By Apply = By.xpath("//button[text()='Apply']");
	By Reset = By.xpath("//button[@type='reset']");
	
	By GenerateExcelSheet = By.xpath("//a[@class='btn btn-primary btn-sm mr-2 mt-sm-1 ng-star-inserted']");
	By AddIPO = By.xpath("//button[@class='btn btn-primary btn-sm shadow-sm float-right mt-1 ng-star-inserted']");







	By navAddIPOscr = By.xpath("//h3[text()='Add IPO ']");
	

	//By navAddIPOscr = By.xpath("//h3[text()='Create IPO ']");

	By IPODate = By.xpath("//input[@formcontrolname='ipoDate']");
	By BuyerStyle = By.xpath("//input[@placeholder='Enter Buyer Style #']");
//	By SelectBuyerStyle = By.xpath("//span[text()='TestStyle (555) version-1']");
	By SelectBuyerStyle = By.xpath("(//li[@role='option'])[1]");
	By IPOName = By.xpath("//input[@formcontrolname='ipoNumber']");
	By ProductionMerchant = By.xpath("//input[@placeholder='Search Name']");
	By SelectPDMerchant = By.xpath("//span[text()='Lavanya K']");
	By POQty = By.xpath("//input[@formcontrolname='poqty']");
	By IPOpercen = By.xpath("//input[@formcontrolname='ipoqtyPercentage']");
	By AssMthYear2 = By.xpath("//input[@placeholder='Select Month']");
	By SelectMth = By.xpath("//span[text()=' Sep ']");
	By Exfactory = By.xpath("//input[@formcontrolname='exFactoryDate']");
	By Active = By.xpath("//label[@class='form-check-label']");
	By Save = By.xpath("//button[@class='btn btn-md btn-primary px-5 ng-star-inserted']");
	By Cancel = By.xpath("//button[@class='btn btn-md btn-danger mr-2']");
	By navIPOList = By.xpath("//h3[text()='IPO List']");
	By IGBuyerStyle = By.xpath("//div[@data-validate='Buyer Style # is required']");
	By IGIPOname = By.xpath("//div[@data-validate='IPO # is required']");
	By IGProductionMerchant = By.xpath("//div[@data-validate='Marchant is required']");
	By IGIPOprcentage = By.xpath("//div[@data-validate='IPO % is required']");
	By IGAssignedMthYear = By.xpath("//div[@data-validate='Assigned Month is required']");
	By IGExfactoryDate = By.xpath("//div[@data-validate='Exfactory Date is required']");
	By IPOtable = By.xpath("//table[@class='p-datatable-table ng-star-inserted']");
	By IPOGridHeader = By.xpath("//thead[@class='p-datatable-thead']");
	By buttExpansion = By.xpath("(//span[@class='p-button-icon pi pi-chevron-right'])[1]");
	By buttEdit = By.xpath("(//a[@class=\"btn btn-sm btn-info mr-1 ng-star-inserted\"])[1]");
	By navUpdateIPO = By.xpath("//h3[text()='Update IPO ']");
	By buttUpdate = By.xpath("//i[@class='ti-pencil-alt']");
	By MandatoryValdMSg = By.xpath("//h2[text()='Mandatory Fields Are Required With  Valid Data.']");
	By UpdateIPOname = By.xpath("//input[@formcontrolname='ipoNumber']");
	By UpdateCancel = By.partialLinkText("//button[text()=' Cancel']");
	By buttDelete = By.xpath("//button[@class='btn btn-sm btn-danger mr-1 ng-star-inserted']");
	By DeleteValiMsg = By.xpath("//h2[text()='Are you sure you want to Deactivate?']");
	By buttNo = By.xpath("(//button[text()='No'])[2]");
	By buttYes = By.xpath("//button[text()='Yes']");

//	public void Navigates_to_the_Login_page() {
//		driver.get(prop.getProperty("url"));
//	}


	public void Click_on_the_Woven_Modules() throws Throwable {
		utilities.webDriverWait(driver, Woven);
		driver.findElement(Woven).click();
		utilities.MinimumWait(driver);
		
	}

	public void Click_on_Audit_module() throws Throwable {
		utilities.webDriverWait(driver, Audit);
		driver.findElement(Audit).click();
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Dataentry);
		driver.findElement(Dataentry).click();
		utilities.MinimumWait(driver);
	}
	
	public void Click_on_IPO_List_module() throws Throwable {
		utilities.webDriverWait(driver, IPOList);                                                                              
		driver.findElement(IPOList).click();
		utilities.MinimumWait(driver);
	}

	public void Click_on_the_Filter_button() throws Throwable {
		utilities.webDriverWait(driver, Filter_but);
		driver.findElement(Filter_but).click();
		utilities.MinimumWait(driver);
	}

	public void Click_in_the_IPO_From_Date_field() throws Throwable {
		utilities.webDriverWait(driver, IPOFromDate);
		driver.findElement(IPOFromDate).click();
		driver.findElement(IPOFromDate).sendKeys(TodayDate);
		utilities.MediumWait(driver);
		System.out.println("Current date: " + TodayDate);
		
	}

	public void Click_in_the_IPO_To_Date_field() throws Throwable {
		utilities.webDriverWait(driver, IPOToDate);
		driver.findElement(IPOToDate).click();
		driver.findElement(IPOToDate).sendKeys(TodayDate);
		utilities.MediumWait(driver);
		System.out.println("Current date: " + TodayDate);
	}

	public void Click_in_the_Buyer_field() throws Throwable {
		utilities.webDriverWait(driver, Buyer);
		driver.findElement(Buyer).click();
		utilities.MinimumWait(driver);
	}

	public void Select_a_Buyer_from_the_dropdown_list() throws Throwable {
		utilities.webDriverWait(driver, Select_Buyer);
		driver.findElement(Select_Buyer).click();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		
	}

	public void Click_in_the_PD_Merchant_field() {
		driver.findElement(PDMerchant).click();
		
	}

	public void Enter_a_first_two_letters_of_a_PD_Merchant_name() throws Throwable {
//		driver.findElement(PDMerchant).click();
		driver.findElement(PDMerchant).sendKeys("ph");
		System.out.println("first 2 letter are entered ");
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
//		Thread.sleep(5000);
//		WebElement PDMer = driver.findElement(Select_PDMerchant);
//		String DisplayPDmer = PDMer.getText();
//		System.out.println("PD Merchant selected in the field is " + DisplayPDmer);
	}
	public void Select_the_PD_Merchant_from_the_dropdown() throws Throwable {
		utilities.webDriverWait(driver, Select_PDMerchant);
		driver.findElement(Select_PDMerchant).click();
		
		System.out.println("CLicked on the PD merchant");
		WebElement PDMer = driver.findElement(Select_PDMerchant);
		String DisplayPDmer = PDMer.getText();
		System.out.println("PD Merchant selected in the field is " + DisplayPDmer);
		
	}


	public void Click_in_the_Merchant_field() throws Throwable {
		utilities.webDriverWait(driver, Merchant);
		driver.findElement(Merchant).click();
		
	}

	public void Select_a_Merchant_from_the_dropdown_list() {
		driver.findElement(Select_Merchant).click();
		
	}

	public void Click_in_the_Assigned_Month_and_year_field() {
		driver.findElement(AssMthYear).click();
		
	}

	public void Select_a_Month_or_Year_from_the_dropdown_list() throws Throwable {
		utilities.webDriverWait(driver, Select_AssMthYear);
		driver.findElement(Select_AssMthYear).click();
		WebElement Mthyear = driver.findElement(Select_AssMthYear);
		String DisMthYear = Mthyear.getText();
		System.out.println("Displaying the selected month/year value " + DisMthYear);
	}

	public void Click_in_the_Search_IPO_and_Enter_an_IPO() {
		driver.findElement(IPOSearch).click();
		
	}
	
	public void Enter_IPO_Name_in_the_Search_IPO_field() throws Throwable {
		utilities.webDriverWait(driver, IPOSearch);
		driver.findElement(IPOSearch).sendKeys("IPO12");
		Thread.sleep(5000);
		WebElement IPOname = driver.findElement(IPOSearch);
		String ipon = IPOname.getAttribute("value");
		System.out.println("Display the entered IPO Name " + ipon);
	}


	public void Click_on_the_Reset_button() throws Throwable {
		utilities.webDriverWait(driver, Reset);
		driver.findElement(Reset).click();
		System.out.println("Clicked on Reset button");
	}

	public void Click_on_the_Apply_button() throws Throwable {
		utilities.webDriverWait(driver, IPOSearch);
		driver.findElement(IPOSearch).sendKeys("IPO12");
		utilities.webDriverWait(driver, Apply);
		driver.findElement(Apply).click();
		System.out.println("Clicked on Apply button");
		Thread.sleep(5000);
	}



	public void Click_on_Generate_Excel_Sheet_button() throws Throwable {
		utilities.webDriverWait(driver, GenerateExcelSheet);
		driver.findElement(GenerateExcelSheet).click();		

	}


	public void Clicked_on_Add_IPO_button() throws Throwable {
		utilities.webDriverWait(driver, AddIPO);
		driver.findElement(AddIPO).click();		
		
	}
	public void Verify_whether_the_page_is_navigating_to_the_Add_IPO_screen_or_not() {
		WebElement IPOlistscreen = driver.findElement(navAddIPOscr);
		String IPOscreen = IPOlistscreen.getText();
		if(IPOlistscreen.isDisplayed()){
			System.out.println("The screen is navigated to " + IPOscreen + " screen");
		} else {
			System.out.println("The screen is not navigated to " + IPOscreen);
		}
		
	}


	//public void Clicked_on_Add_IPO_button() {
		// TODO Auto-generated method stub



	public void Click_on_the_save_button() throws Throwable {
		driver.findElement(Save).click();
        utilities.MaximumLongWait(driver);

	}

	public void Select_an_IPO_Date() throws Throwable {
		utilities.webDriverWait(driver, IPODate);
		driver.findElement(IPODate).click();
		

	}
	
	public void Verify_whether_current_date_is_displayed_or_not_bydefault() throws Throwable {
		utilities.webDriverWait(driver, IPODate);
		WebElement ipodate = driver.findElement(IPODate);
		String currentDate = ipodate.getAttribute("value");
		if(ipodate.isDisplayed()) {
			System.out.println("Displaying Current Date: "+ currentDate);
		}else {
			System.out.println("Not Displaying current Date" + currentDate);
		}
	}

	public void Enter_first_two_letters_of_a_Buyer_Style() throws Throwable {
		utilities.webDriverWait(driver, BuyerStyle);
		driver.findElement(BuyerStyle).sendKeys("Te");

	}

	public void Select_a_Buyer_Style_from_the_dropdown() throws Throwable {
		utilities.webDriverWait(driver, SelectBuyerStyle);
		driver.findElement(SelectBuyerStyle).click();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_1);
		Thread.sleep(1000);
	}


	public void Enter_the_IPO_name() throws Throwable {
		utilities.webDriverWait(driver, IPOName);
		driver.findElement(IPOName).sendKeys("IPO125");
		
	}

	public void Enter_first_two_letters_of_Production_Merchant() throws Throwable {
		utilities.webDriverWait(driver, ProductionMerchant);
		driver.findElement(ProductionMerchant).sendKeys("la");
		
	}

	public void Select_a_Production_Merchant_fron_the_dropdown() throws Throwable {
		utilities.webDriverWait(driver, SelectPDMerchant);
		driver.findElement(SelectPDMerchant).click();
		
	}

	public void Enter_the_PO_Qty() throws Throwable {
		utilities.webDriverWait(driver, POQty);
		driver.findElement(POQty).clear();
		driver.findElement(POQty).sendKeys("2050");
		
	}

	public void Enter_IPO_percentage() throws Throwable {
		utilities.webDriverWait(driver, IPOpercen);
		driver.findElement(IPOpercen).sendKeys("2");
		
	}
	public void Click_in_the_Assigned_Month_and_Year_field() {
			driver.findElement(AssMthYear2).click();
			
		}

	public void Select_the_Month_from_the_month_picker() throws Throwable {
		utilities.webDriverWait(driver, SelectMth);
		driver.findElement(SelectMth).click();
		WebElement Mthyear = driver.findElement(SelectMth);
		String DisMthYear = Mthyear.getText();
		System.out.println("Displaying the selected month/year value " + DisMthYear);
	}

	public void Select_Exfactory_Date() throws Throwable {
		utilities.webDriverWait(driver, Exfactory);
		driver.findElement(Exfactory).click();
		
	}

	public void Check_the_Active_field_status() throws Throwable {
		utilities.webDriverWait(driver, Active);
		driver.findElement(Active).click();
		
	}


	
	public void Click_on_Cancel_button_in_the_Add_IPO() {
		driver.findElement(Cancel).click();
		System.out.println("Clicked on Cancel button");
		
	}
	public void Verify_whether_the_page_is_navigated_to_IPO_List_page_or_not() {
		WebElement IPOlistscreen = driver.findElement(navIPOList);
		String IPOscreen = IPOlistscreen.getText();
		if(IPOlistscreen.isDisplayed()){
			System.out.println("The screen is navigated to " + IPOscreen + " screen");
		} else {
			System.out.println("The screen is not navigated to " + IPOscreen);
		}

	}

	public void Verify_the_information_tags_data_on_mouse_hover() throws Throwable {
		
		WebElement IGBSelement = driver.findElement(IGBuyerStyle);
		
//		Actions actions = new Actions(driver);
//        actions.moveToElement(IGBSelement).perform();
        
        driver.findElement(IGBuyerStyle).click();
//        utilities.MaximumLongWait(driver);
        String displayBuyerStyle = IGBSelement.getTagName(); 
		System.out.println("Buyer Style tags name : " + displayBuyerStyle);
        
        WebElement IGIPONelement = driver.findElement(IGIPOname);
		Actions IGIPONactions = new Actions(driver);
		IGIPONactions.moveToElement(IGIPONelement).perform();
//        utilities.MaximumLongWait(driver);
        
        WebElement IGPMelement = driver.findElement(IGProductionMerchant);
		Actions IGPMactions = new Actions(driver);
        IGPMactions.moveToElement(IGPMelement).perform();
//        utilities.MaximumLongWait(driver);
        
        WebElement IGIPOPgelement = driver.findElement(IGIPOprcentage);
		Actions IGIPOPgactions = new Actions(driver);
		IGIPOPgactions.moveToElement(IGIPOPgelement).perform();
//        utilities.MaximumLongWait(driver);
        
        WebElement IGAMYelement = driver.findElement(IGAssignedMthYear);
		Actions IGAMYactions = new Actions(driver);
		IGAMYactions.moveToElement(IGAMYelement).perform();
//        utilities.MaximumLongWait(driver);
        
        WebElement IGEFDelement = driver.findElement(IGExfactoryDate);
		Actions IGEFDactions = new Actions(driver);
		IGEFDactions.moveToElement(IGEFDelement).perform();
//        utilities.MaximumLongWait(driver);
	}


	public void Verifying_the_IPO_List_grid_headers_and_Sorting() throws Throwable {


        WebElement grid = driver.findElement(IPOtable);
        WebElement tableHeaderRow = grid.findElement(By.tagName("thead"));
        List<WebElement> tableHeaders = tableHeaderRow.findElements(By.tagName("th"));
        // Define expected header values
        String[] expectedHeaders = {"", "IPO Details", "Buyer Details", "Merchant "};
        // Verify table headers
        for (int i = 0; i < expectedHeaders.length;) {
          for (WebElement columnHeader : tableHeaders) {
        	String columnName = columnHeader.getText(); 
        	Assert.assertEquals(columnHeader.getAttribute("value"), expectedHeaders[i]);
            System.out.println(columnName);
          // Click on the header twice
			columnHeader.click();
			utilities.MaximumWait(driver);
			columnHeader.click();
			utilities.MinimumWait(driver);
          }
        
          break;
        }
		
	}


	public void Verify_whether_the_Expansion_button_is_clickable_or_not_for_an_IPO() throws Throwable {
		utilities.webDriverWait(driver, buttExpansion);
		driver.findElement(buttExpansion).click();
	}

	public void Verify_whether_the_Edit_button_is_clickable() throws Throwable {
		utilities.webDriverWait(driver, buttEdit);
		driver.findElement(buttEdit).click();
		
	}

	public void Verify_whether_page_is_navigating_to_Update_IPO_screen() {
		WebElement UpdateIPOscreen = driver.findElement(navUpdateIPO);
		String UIPOscreen = UpdateIPOscreen.getText();
		if(UpdateIPOscreen.isDisplayed()){
			System.out.println("The screen is navigated to " + UIPOscreen + " screen");
		} else {
			System.out.println("The screen is not navigated to " + UIPOscreen);
		}
		
	}

	public void Verify_whether_the_previously_added_data_is_displayed_correctly_in_all_the_fields() {
		// Need to verify how to compare the field values through test scripts
		
	}

	public void Clear_all_the_data_in_any_one_of_the_field() throws Throwable {
		utilities.webDriverWait(driver, BuyerStyle);
		driver.findElement(BuyerStyle).clear();
		WebElement BuySty = driver.findElement(BuyerStyle);
		String Buystyname = BuySty.getText();
		System.out.println("Buyer Style name " + Buystyname );
		driver.findElement(UpdateIPOname).clear();
		WebElement IPOn = driver.findElement(UpdateIPOname);
		String IPOname = IPOn.getText();
		System.out.println("IPO Name" + IPOname );
		driver.findElement(UpdateIPOname).sendKeys("UpdateIPO");
	}

	public void Click_on_the_update_button_in_UpdateIPO_form() throws Throwable {
		utilities.webDriverWait(driver, buttUpdate);
		driver.findElement(buttUpdate).click();
		WebElement buttupdate = driver.findElement(buttUpdate);
		String updatename = buttupdate.getText();
		System.out.println("Click on " + updatename );
		System.out.println("Clicked on Update button");
		
//		 WebElement AlertMsg = driver.findElement(MandatoryValdMSg);
//         String actualMessage = AlertMsg.getText();
//         System.out.println("checking for the validation msg");
//
//         String expectedMessage = "Mandatory Fields Are Required With Valid Data.";
//
//      if (expectedMessage.equals(actualMessage)) {
//	          System.out.println("Alert message is correct." + actualMessage);
//     } else {
//	         System.out.println("Alert message is incorrect."+ actualMessage);
//            }
//      utilities.MinimumWait(driver);
	}

	public void Check_whether_the_mandatory_validation_msg_is_displayed_or_not() throws Throwable {
		
		 WebElement AlertMsg = driver.findElement(MandatoryValdMSg);
         String actualMessage = AlertMsg.getText();
         System.out.println("checking for the validation msg");

         String expectedMessage = "Mandatory Fields Are Required With Valid Data.";

      if (expectedMessage.equals(actualMessage)) {
	          System.out.println("Alert message is correct." + actualMessage);
     } else {
	         System.out.println("Alert message is incorrect."+ actualMessage);
            }
      utilities.MinimumWait(driver);
	}

	public void To_verify_whether_the_Delete_button_is_clickable_or_not() throws Throwable {
		utilities.webDriverWait(driver, buttDelete);
		driver.findElement(buttDelete).click();
	}

	public void Verifying_the_Delete_toaster_msg() throws Throwable {
		utilities.webDriverWait(driver, DeleteValiMsg);
		WebElement AlertMsg = driver.findElement(DeleteValiMsg);
        String actualMessage = AlertMsg.getText();
        System.out.println("checking for the validation msg");

        String expectedMessage = "Mandatory Fields Are Required With Valid Data.";

     if (expectedMessage.equals(actualMessage)) {
	          System.out.println("Alert message is correct." + actualMessage);
    } else {
	         System.out.println("Alert message is incorrect."+ actualMessage);
           }
//		driver.findElement(DeleteValiMsg).click();
	}

	public void Clicked_on_No_button_in_the_toaster_msg() throws Throwable {
		utilities.webDriverWait(driver, buttNo);
		driver.findElement(buttNo).click();
	}

	public void Clicked_on_Yes_button_in_the_toaster_msg() throws Throwable {
		utilities.webDriverWait(driver, buttDelete);
		driver.findElement(buttDelete).click();
		driver.findElement(buttYes).click();
		Thread.sleep(5000);
	}

	
	
	

}	


	
	

