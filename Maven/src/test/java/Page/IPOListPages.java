package Page;


import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Date;

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
//	private String ipon;
	Utilities utilities = new Utilities();

//	Filters functionality
	By txtUN = By.xpath("//input[@id='userName']");
	By txtPwd = By.xpath("//input[@id='userpassword']");
	By btnSignIn = By.xpath("//button[@class='btn btn-block btn-primary btn-lg font-weight-medium auth-form-btn']");
	By Woven = By.xpath("//span[text()='Woven / knit']");
	By Audit = By.xpath("(//span[text()='Audit '])[1]");
	By IPOList = By.xpath("//a[@routerlink='/ipo-list']");
	By Filter_but = By.xpath("//button[@id='navbarDropdown3']");

	By IPOFromDate = By.xpath("//input[@formcontrolname='ipoFromDate']");
	By IPOToDate = By.xpath("//input[@formcontrolname='ipoToDate']");
	By Buyer = By.xpath("//div[@class='p-multiselect-label ng-tns-c92-9 p-placeholder']");
	By Select_Buyer = By.xpath("//li[@aria-label='8 Seconds']");
	By PDMerchant = By.xpath("//input[@class='ng-tns-c93-10 p-autocomplete-input p-inputtext p-component ng-star-inserted']");
	By Select_PDMerchant = By.xpath("//span[text()='Phani L']");
	By Merchant = By.xpath("//div[@class='p-element p-multiselect-label-container ng-tns-c92-11']");
	By Select_Merchant = By.xpath("//li[@aria-label='Lavanya K']");
	By AssMthYear = By.xpath("//input[@class='ng-tns-c81-22 p-inputtext p-component ng-star-inserted']");
	By Select_AssMthYear = By.xpath("//span[text()=' Sep ']");
	By IPOSearch = By.xpath("//input[@formcontrolname='searchText']");
	By Apply = By.xpath("//button[text()='Apply']");
	By Reset = By.xpath("//button[@type='reset']");

	By GenerateExcelSheet = By.xpath("//a[@class='btn btn-primary btn-sm mr-2 mt-sm-1 ng-star-inserted']");
	By AddIPO = By.xpath("//button[@class='btn btn-primary btn-sm shadow-sm float-right mt-1 ng-star-inserted']");
<<<<<<< HEAD


=======
	By navAddIPOscr = By.xpath("//h3[text()='Add IPO ']");
	
	By IPODate = By.xpath("//input[@formcontrolname='ipoDate']");
	By BuyerStyle = By.xpath("//input[@placeholder='Enter Buyer Style #']");
	By SelectBuyerStyle = By.xpath("//li[@class='p-ripple p-element p-autocomplete-item ng-tns-c93-20 ng-star-inserted']");
	By IPOName = By.xpath("//input[@formcontrolname='ipoNumber']");
	By ProductionMerchant = By.xpath("//input[@class='ng-tns-c93-21 p-autocomplete-input p-inputtext p-component ng-star-inserted']");
	By SelectPDMerchant = By.xpath("//li[@class='p-ripple p-element p-autocomplete-item ng-tns-c93-21 ng-star-inserted']");
	By POQty = By.xpath("//input[@formcontrolname='poqty']");
	By IPOpercen = By.xpath("//input[@formcontrolname='ipoqtyPercentage']");
	By AssMthYear2 = By.xpath("//input[@class='ng-tns-c81-34 p-inputtext p-component ng-star-inserted']");
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
	
>>>>>>> branch 'main' of https://github.com/BoyaAnilkumar/JivaAutomation.git

	public void Navigates_to_the_Login_page() {
		driver.get(prop.getProperty("url"));

	}

	public void Enter_valid_Username_and_password() throws Throwable {
//		utilities.webDriverWait(driver, txtUN);
		driver.findElement(txtUN).clear();
		driver.findElement(txtUN).sendKeys(prop.getProperty("username"));
		utilities.MinimumWait(driver);
		driver.findElement(txtPwd).clear();
		driver.findElement(txtPwd).sendKeys(prop.getProperty("password"));
	}

	public void Click_on_SignIn() {
		driver.findElement(btnSignIn).click();

	}

	public void Click_on_the_Woven_Modules() throws Throwable {
		utilities.webDriverWait(driver, Woven);
		driver.findElement(Woven).click();

	}

	public void Click_on_Audit_module() throws Throwable {
		utilities.webDriverWait(driver, Audit);
		driver.findElement(Audit).click();

	}

	public void Click_on_IPO_List_module() throws Throwable {
		utilities.webDriverWait(driver, IPOList);
		driver.findElement(IPOList).isDisplayed();
//		IPO.isEnabled();
		driver.findElement(IPOList).click();

	}

	public void Click_on_the_Filter_button() throws Throwable {
//		utilities.webDriverWait(driver, IPOList);
		driver.findElement(Filter_but).click();

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

	public void Click_in_the_Buyer_field() {
		driver.findElement(Buyer).click();

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

<<<<<<< HEAD
	public void Click_on_Generate_Excel_Sheet_button() {
		// TODO Auto-generated method stub

=======
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
		
>>>>>>> branch 'main' of https://github.com/BoyaAnilkumar/JivaAutomation.git
	}

<<<<<<< HEAD
	public void Clicked_on_Add_IPO_button() {
		// TODO Auto-generated method stub

=======
	public void Click_on_the_save_button() throws Throwable {
		driver.findElement(Save).click();
        utilities.MaximumLongWait(driver);

	}

	public void Select_an_IPO_Date() throws Throwable {
		utilities.webDriverWait(driver, IPODate);
		driver.findElement(IPODate).click();
		
>>>>>>> branch 'main' of https://github.com/BoyaAnilkumar/JivaAutomation.git
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
		driver.findElement(BuyerStyle).sendKeys("bo");
		
	}

	public void Select_a_Buyer_Style_from_the_dropdown() throws Throwable {
		utilities.webDriverWait(driver, SelectBuyerStyle);
		driver.findElement(SelectBuyerStyle).click();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_2);
	}

	public void Enter_the_IPO_name() throws Throwable {
		utilities.webDriverWait(driver, IPOName);
		driver.findElement(IPOName).sendKeys("AutoIPO");
		
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
		driver.findElement(POQty).sendKeys("1119");
		
	}

	public void Enter_IPO_percentage() throws Throwable {
		utilities.webDriverWait(driver, IPOpercen);
		driver.findElement(IPOpercen).sendKeys("5");
		
	}

	public void Select_the_Month_from_the_month_picker() throws Throwable {
		utilities.webDriverWait(driver, SelectMth);
		driver.findElement(SelectMth).click();
		
	}

	public void Select_Exfactory_Date() throws Throwable {
		utilities.webDriverWait(driver, Exfactory);
		driver.findElement(Exfactory).click();
		
	}

	public void Check_the_Active_field_status() throws Throwable {
		utilities.webDriverWait(driver, Active);
		driver.findElement(Active).click();
		
	}

	public void Click_on_the_Save_button() throws Throwable {
		utilities.webDriverWait(driver, Save);
		driver.findElement(Save).click();

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

<<<<<<< HEAD


=======
	
>>>>>>> branch 'main' of https://github.com/BoyaAnilkumar/JivaAutomation.git


	
	
}
