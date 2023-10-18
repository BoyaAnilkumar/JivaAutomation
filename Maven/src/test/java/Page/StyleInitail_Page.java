package Page;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import util.DriverFactory;
import util.Utilities;

public class StyleInitail_Page extends DriverFactory{
	
	Date currentDate = new Date();
	SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
	String formattedDate = dateFormat.format(currentDate);

		Utilities utilities = new Utilities();
		
		By SignIn   = By.xpath("//button[@class='btn btn-block btn-primary btn-lg font-weight-medium auth-form-btn']");
		By username = By.xpath("//input[@id='userName']");
		By password = By.xpath("//input[@id='userpassword']");
		By Woven = By. xpath ("//span[text()='Woven / knit']");
		By Merchandising = By.xpath("(//span[text()='Merchandising '])[1]");
		By Style_Initial = By.xpath("(//a[text()='Style Initial Details'])[1]");

		By Style_Ex = By.xpath("//a[@id='sidebarCollapse']");
		//Filter
	    By FilterIcon = By.xpath("//button[@class='btn btn-primary btn-sm mb-2 float-right']");
	    By BuyerField = By.xpath("//div[@class='p-multiselect-label ng-tns-c92-10 p-placeholder']");
	    By EnterButer = By.xpath("//input[@class='p-multiselect-filter p-inputtext p-component ng-tns-c92-10']");
	    By SelectBuyer = By.xpath("//span[@class='p-checkbox-icon pi pi-check']");
	    
	    By SeasonField = By.xpath("//select[@class='form-control ng-pristine ng-valid ng-touched']");
	    By Select_Season = By.xpath("//option[@value='116']");
	    By Status = By.xpath("//select[@formcontrolname='staticStatusId']");
	    By SelectStatus_Com = By.xpath("//option[text()=' Completed']");
	    By SelectStatus_NotCom = By.xpath("//option[text()=' Not Submitted']");
	    By SearchIPO = By.xpath("//input[@placeholder='Enter Buyer style # or IPO #']");
	    By Apply = By.xpath("//button[@class='btn btn-md btn-primary']");
	    By Reset = By.xpath("//button[@class='btn btn-md btn-light btn-active-light-primary mr-2']");
	    
		
		By SelectIPO = By.xpath("//a[text()='IPO16/10 / Retro style']");
		By IPO = By.xpath("//b[text()='IPO16/10']");
		By Style =By.xpath("//b[text()='Retro style']");
		By Buyer = By.xpath("//b[text()='Spin ']");
		By Season = By.xpath("//b[text()='Holiday 2022']");
		By FileHandover = By.xpath("//input[@formcontrolname='handoverDate']");
		By Add1 = By.xpath("(//button[@title='Add Combo'])[1]");
		By Add2 = By.xpath("(//button[@title='Add Combo'])[2]");
		By Combo1 = By.xpath("(//input[@placeholder='Enter Combo Name'])[1]");
		By Combo2 =By.xpath("(//input[@placeholder='Enter Combo Name'])[2]");
		By Garment2 = By.xpath("(//select[@formcontrolname='garmentSizeTypeId'])[2]");
		By Deletec1 = By.xpath("(//span[@class='input-group-text bg-danger ng-star-inserted pointer'])[1]");
		By DeleteG1 = By.xpath("(//span[@class='input-group-text bg-danger ng-star-inserted pointer'])[2]");
		By DeleteC2 = By.xpath("(//span[@class='input-group-text bg-danger pointer ng-star-inserted'])[1]");
		By DeleteG2 = By.xpath("(//span[@class='input-group-text bg-danger pointer ng-star-inserted'])[1]");
		By SubmitOrderdetails = By.xpath("//button[@class='btn btn-md btn-primary btn-active-light-primary ng-star-inserted']");
		
		By Garmenttypefield2 = By.xpath("//select[@class='form-control ng-pristine ng-invalid ng-touched']");
		By SelectGarment2 = By.xpath("(//option[@value='73'])[2]");
		By Alertmsg = By.xpath("//h2[text()='Mandatory Fields Are Required With  Valid Data.']");
	    
		
		public void User_navigates_to_Login_page() throws Throwable {
			driver.get(prop.getProperty("url"));
			
			}
			public void User_enters_the_username_and_password() throws Throwable {
			utilities.webDriverWait(driver, username);
			driver.findElement(username).sendKeys("Admin");
			driver.findElement(password).sendKeys("Abcd@123");

			}
				
			public void User_click_on_the_signIn() throws Throwable {
//			utilities.webDriverWait(driver, password);		
			driver.findElement(SignIn).click();
					
			}
			public void Click_on_the_Woven_Module() throws Throwable{
			utilities.webDriverWait(driver, Woven );
			driver.findElement(Woven).click();	
		  	}
			public void click_on_the_Merchandising_Module() throws Throwable{
			utilities.webDriverWait(driver, Merchandising );
			driver.findElement(Merchandising).click();	

			}
			public void click_on_the_Style_Initail_Details_screen() throws Throwable{
			   utilities.webDriverWait(driver, Style_Initial );
			   driver.findElement(Style_Initial).click();	

			}
			public void Click_on_the_Styles_Expansion() throws Throwable {
				utilities.webDriverWait(driver, Style_Ex );
				   driver.findElement(Style_Ex).click();		
				
			}
             public void Click_on_the_Filter_Icon() throws Throwable {
				utilities.webDriverWait(driver, FilterIcon);
				driver.findElement(FilterIcon).click();
			}
			public void Click_on_the_Buyer_Field() throws Throwable {
			utilities.webDriverWait(driver, BuyerField);
			driver.findElement(BuyerField).click();
			driver.findElement(EnterButer).sendKeys("Spin");
			
				
			}
			public void Select_the_Buyer() throws Throwable {
				utilities.webDriverWait(driver, SelectBuyer);
				driver.findElement(SelectBuyer).click();
				
			}
			public void Click_on_the_Season_Field() throws Throwable {
			   utilities.webDriverWait(driver, SeasonField);	
				driver.findElement(SeasonField).click();
			}
			public void Select_the_Season() throws Throwable {
				utilities.webDriverWait(driver, Select_Season);	
				driver.findElement(Select_Season).click();
				
			}
			public void Click_on_the_Status_Field() throws Throwable {
				utilities.webDriverWait(driver, Status);	
				driver.findElement(Status).click();
				
			}
			public void Select_the_status() throws Throwable {
				utilities.webDriverWait(driver, SelectStatus_Com);	
				driver.findElement(SelectStatus_Com).click();	
				driver.findElement(SelectStatus_NotCom).click();
			}
			public void Search_the_IPO() throws Throwable {
				utilities.webDriverWait(driver, SearchIPO);
				driver.findElement(SearchIPO).sendKeys("IPO16/10");
				
			}
			public void Click_on_the_Apply_button() throws Throwable {
				utilities.webDriverWait(driver, Apply);	
				driver.findElement(Apply).click();	
				
			}
			public void Click_on_the_Reset_button() throws Throwable {
				utilities.webDriverWait(driver, Reset);	
				driver.findElement(Reset).click();	
				
			}

			public void Select_IPO() throws Throwable {
				utilities.webDriverWait(driver, SelectIPO );
			    driver.findElement(SelectIPO).click();	
			    
			}
			public void Verify_IPO_data() {
                WebElement AlertMsg = driver.findElement(IPO);
				String IPO = AlertMsg.getText();
				String expectedMessage = "IPO16";
				if (expectedMessage.equals(IPO)) {
					System.out.println("Alert message is correct." + IPO);
				} else {
					System.out.println("Alert message is incorrect."+ IPO);
				}
				
			}
			public void Verify_Style() {
             WebElement AlertMsg = driver.findElement(Style);
				String IPO = AlertMsg.getText();
				String expectedMessage = "IPO16";
				if (expectedMessage.equals(IPO)) {
					System.out.println("Alert message is correct." + IPO);
				} else {
					System.out.println("Alert message is incorrect."+ IPO);
				}	
			}
			public void Verify_Buyer() {
              WebElement AlertMsg = driver.findElement(Buyer);
				String IPO = AlertMsg.getText();
				String expectedMessage = "Spin";
				if (expectedMessage.equals(IPO)) {
					System.out.println("Alert message is correct." + IPO);
				} else {
					System.out.println("Alert message is incorrect."+ IPO);
				}	
			}
			public void Verify_Season() {
                WebElement AlertMsg = driver.findElement(Season);
				String IPO = AlertMsg.getText();
				String expectedMessage = "Holiday 2022";
				if (expectedMessage.equals(IPO)) {
					System.out.println("Alert message is correct." + IPO);
				} else {
					System.out.println("Alert message is incorrect."+ IPO);
				}
			}
			public void Select_File_handover_date() throws Throwable {
				utilities.webDriverWait(driver, FileHandover );
				driver.findElement(FileHandover).sendKeys(formattedDate);
				utilities.MediumWait(driver);
				System.out.println("Current date: " + formattedDate);
		
			}
			public void Click_on_the_Add_combo_button() throws Throwable {
				utilities.webDriverWait(driver, Add1);
				driver.findElement(Add1).click();
			}
			public void Enter_the_data_in_Combo1() throws Throwable {
				utilities.webDriverWait(driver, Combo1);
				driver.findElement(Combo1).sendKeys("Combo1");
			}
			public void Click_on_the_Delete_Icon1() throws Throwable {
			utilities.webDriverWait(driver, Deletec1);
			driver.findElement(Deletec1).click();
			}
			public void Enter_the_data_in_Combo2() throws Throwable {
			utilities.webDriverWait(driver, Combo2);
			driver.findElement(Combo2).sendKeys("Combo2");
			}
			public void Click_on_the_delete_Icon2() throws Throwable {
				utilities.webDriverWait(driver, DeleteC2);
				driver.findElement(DeleteC2).click();
			}
			public void Click_on_the_Add_Garment_type_button() throws Throwable {
				utilities.webDriverWait(driver, Add2);
				driver.findElement(Add2).click();
			}
			public void Click_on_the_Delete_Garment_Icon1() throws Throwable {
				utilities.webDriverWait(driver, DeleteG1);
				driver.findElement(DeleteG1).click();
				
			}
			public void Click_on_the_Delete_garment_Icon2() throws Throwable {
				utilities.webDriverWait(driver, DeleteG2);
				driver.findElement(DeleteG2).click();
				
			}
           public void Click_on_the_Garment_type_field() throws Throwable {
				utilities.webDriverWait(driver, Garmenttypefield2);
				driver.findElement(Garmenttypefield2).click();
				
				
			}
			public void Select_the_Garment_type() throws Throwable {
				utilities.webDriverWait(driver, SelectGarment2);
				driver.findElement(SelectGarment2).click();
			}
			public void Click_on_the_Submit_Order_details_button() throws Throwable {
				utilities.webDriverWait(driver, SubmitOrderdetails);
				driver.findElement(SubmitOrderdetails).click();
				utilities.MediumWait(driver);
			}
			public void Verify_the_Alert_msg() throws Throwable {
				
				WebElement AlertMsg = driver.findElement(Alertmsg);
			
				String ALM = AlertMsg.getText();
				String expectedMessage = "Mandatory Fields Are Required With Valid Data.";
				if (expectedMessage.equals(ALM)) {
					System.out.println("Alert message is correct." + ALM);
				} else {
					System.out.println("Alert message is incorrect."+ ALM);
				}
				
			}
			
			
				
			
			
							
			

	

}
