package Page;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import util.DriverFactory;
import util.Utilities;

	public class StyleInitial_Page  extends DriverFactory{

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
			By Filterslash = By.xpath("//i[@class='pi pi-filter-slash']");
		    By FilterIcon = By.xpath("//button[@class='btn btn-primary btn-sm mb-2 float-right']");
		    By BuyerField = By.xpath("//div[text()='Select Buyer']");
		    By EnterButer = By.xpath("//input[@role='textbox']");
		    By SelectBuyer = By.xpath("//div[@class='p-checkbox-box']");
		    By CL = By.xpath("//span[@class='p-multiselect-close-icon pi pi-times ng-tns-c92-10']");

		    By SeasonField = By.xpath("//select[@formcontrolname='seasonId']");
		    By Select_Season = By.xpath("//option[@value='116']");
		    By Status = By.xpath("//select[@formcontrolname='staticStatusId']");
		    By SelectStatus_Com = By.xpath("//option[text()=' Completed']");
		    By SelectStatus_NotCom = By.xpath("//option[text()=' Not Submitted']");
		    By SearchIPO = By.xpath("//input[@placeholder='Enter Buyer style # or IPO #']");
		    By Apply = By.xpath("//button[@class='btn btn-md btn-primary']");
		    By Reset = By.xpath("//button[@class='btn btn-md btn-light btn-active-light-primary mr-2']");


			By SelectIPO = By.xpath("//div[@class='nav flex-column nav-pills ng-star-inserted']");
			By IPO = By.xpath("//b[text()='New0987']");
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
			By SubmitOrderdetails = By.xpath("(//button[@class='btn btn-md btn-primary btn-active-light-primary ng-star-inserted'])[1]");

			By Garmenttypefield2 = By.xpath("(//select[@formcontrolname='garmentSizeTypeId'])[2]");
			By SelectGarment2 = By.xpath("(//option[@value='73'])[2]");
			By Alertmsg = By.xpath("//h2[text()='Mandatory Fields Are Required With  Valid Data.']");
            By Savemsg = By.xpath("//h2[@class='swal2-title']");
            By Yes = By.xpath("//button[@class='swal2-confirm swal2-styled']");
            By No = By.xpath("//button[@class='swal2-cancel swal2-styled']");
            By C1 = By.xpath("//option[text()=' CM2']");
            By petite1 = By.xpath("//option[text()=' Petite']");
            By POQty1 = By.xpath("(//input[@placeholder='Enter PO Qty'])[1]");
            By POQty2 = By.xpath("(//input[@placeholder='Enter PO Qty'])[2]");
            By POQty3 = By.xpath("(//input[@placeholder='Enter PO Qty'])[3]");
            By POQty4 = By.xpath("(//input[@placeholder='Enter PO Qty'])[4]");
            By IPO1 = By.xpath("(//input[@formcontrolname='ipoPercentage'])[1]");
            By IPO2 = By.xpath("(//input[@formcontrolname='ipoPercentage'])[2]");
            By IPO3 = By.xpath("(//input[@formcontrolname='ipoPercentage'])[3]");
            By IPO4 = By.xpath("(//input[@formcontrolname='ipoPercentage'])[4]");
            
            By Submit = By.xpath("(//button[@class='btn btn-md btn-primary btn-active-light-primary ng-star-inserted'])[2]");
            By Yes_button = By.xpath("//button[@class='swal2-confirm swal2-styled']");
            By No_button = By.xpath("//button[@class='swal2-cancel swal2-styled']");
            By A_S = By.xpath("//h2[text()='IPO Order Quantity Details Saved Successfully']");	
            By Expected = By.xpath("//p[@class='text-center']");

			public void User_navigates_to_Login_page() throws Throwable {
				driver.get(prop.getProperty("url"));

				}
				public void User_enters_the_username_and_password() throws Throwable {
				utilities.webDriverWait(driver, username);
				driver.findElement(username).sendKeys("Admin");
				driver.findElement(password).sendKeys("Abcd@123");

				}

				public void User_click_on_the_signIn() throws Throwable {
//				utilities.webDriverWait(driver, password);
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
					utilities.MediumWait(driver);
					driver.findElement(Filterslash).click();

				}
	             public void Click_on_the_Filter_Icon() throws Throwable {
				utilities.webDriverWait(driver, FilterIcon);
				driver.findElement(FilterIcon).click();
				}
				public void Click_on_the_Buyer_Field() throws Throwable {
				utilities.webDriverWait(driver, BuyerField);
				driver.findElement(BuyerField).click();
				utilities.MediumWait(driver);
     			driver.findElement(EnterButer).sendKeys("Spin");


				}
				public void Select_the_Buyer() throws Throwable {
					utilities.webDriverWait(driver, SelectBuyer);
					driver.findElement(SelectBuyer).click();
					
					
				}
				public void Click_on_the_Cancel_Icon() throws Throwable  {
					 utilities.webDriverWait(driver, CL);
						driver.findElement(CL).click();
					
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
					//driver.findElement(SelectStatus_Com).click();
					driver.findElement(SelectStatus_NotCom).click();
				}
				public void Search_the_IPO() throws Throwable {
					utilities.webDriverWait(driver, SearchIPO);
					driver.findElement(SearchIPO).sendKeys("New0987");
					Thread.sleep(5000);
					WebElement IPOname = driver.findElement(SearchIPO);
					String ipon = IPOname.getAttribute("value");
					System.out.println("Display the entered IPO Name " + ipon);
					

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
				    driver.findElement(SubmitOrderdetails).click();

				}
				public void Verify_IPO_data() {
	                WebElement AlertMsg = driver.findElement(IPO);
					String IPO = AlertMsg.getText();
					String expectedMessage = "SWe212y3";
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
					driver.findElement(Combo1).sendKeys("CM1");
					Thread.sleep(5000);
					WebElement IPOname = driver.findElement(Combo1);
					String ipon = IPOname.getAttribute("value");
					System.out.println("Display the entered combo Name " + ipon);
				
				}
				public void Click_on_the_Delete_Icon1() throws Throwable {
				utilities.webDriverWait(driver, Deletec1);
				driver.findElement(Deletec1).click();
				}
				public void Enter_the_data_in_Combo2() throws Throwable {
				utilities.webDriverWait(driver, Combo2);
				driver.findElement(Combo2).sendKeys("CM3");
				Thread.sleep(5000);
				WebElement IPOname = driver.findElement(Combo2);
				String ipon = IPOname.getAttribute("value");
				System.out.println("Display the entered combo Name " + ipon);
				
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
//					driver.findElement(Yes).click();
//					utilities.MediumWait(driver);
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
				public void Verify_the_Saved_msg() {
					WebElement AlertMsg = driver.findElement(Savemsg);
					String SVM = AlertMsg.getText();
					String expectedMessage = "IPO Order Details Saved Successfully";
					if (expectedMessage.equals(SVM)) {
						System.out.println("Alert message is correct." + SVM);
					} else {
						System.out.println("Alert message is incorrect."+ SVM);
					}

				}
				public void Verify_whether_the_Combo_field_is_prepopulated_with_data_or_not() throws Throwable {
					 utilities.MediumWait(driver);
					WebElement AlertMsg = driver.findElement(C1);
					String Combo = AlertMsg.getText();
					String expectedMessage = "CM2";
					if (expectedMessage.equals(Combo)) {
						System.out.println("Combo field data is displaying correct." + Combo);
					} else {
						System.out.println("Combo field data is displaying correct."+ Combo);
					}

					
				}
				public void Verify_whether_the_Garment_Size_type_field_data_is_displayed_or_not() {
					WebElement AlertMsg = driver.findElement(petite1);
					String GST = AlertMsg.getText();
					String expectedMessage = "Petite42";
					if (expectedMessage.equals(GST)) {
						System.out.println("Garment Size type field data is displaying correct." + GST);
					} else {
						System.out.println("Garment Size type field data is displaying incorrect."+ GST);
					}

					
				}
				public void User_enter_the_data_in_PO_Qty_field() throws Throwable {
					utilities.webDriverWait(driver, POQty1);
					driver.findElement(POQty1).clear();
					driver.findElement(POQty1).sendKeys("2000");
					utilities.MediumWait(driver);
					
					driver.findElement(POQty2).clear();
					driver.findElement(POQty2).sendKeys("3000");
					utilities.MediumWait(driver);
					
					driver.findElement(POQty3).clear();
				    driver.findElement(POQty3).sendKeys("6000");
				    utilities.MediumWait(driver);
				    
				    driver.findElement(POQty4).clear();
				    driver.findElement(POQty4).sendKeys("4000");
				    utilities.MediumWait(driver);	
				    
				    WebElement DisplayValue = driver.findElement(Expected);
					String AF = DisplayValue.getText();
					String expectedMessage = "Expected Order Qty = 14000";
					if (expectedMessage.equals(AF)) {
						System.out.println("Display Expected Order Qty is displaying correct." + AF);
					} else {
						System.out.println("Display Expected Order Qty os displaying incorrect."+ AF);
					}
					
					
				}

				public void Enter_the_data_in_IPO_field() throws Throwable {
					utilities.webDriverWait(driver, POQty1);
					driver.findElement(IPO1).clear();
					driver.findElement(IPO1).sendKeys("4");
					utilities.MediumWait(driver);
					
					driver.findElement(IPO2).clear();
					driver.findElement(IPO2).sendKeys("5");
					utilities.MediumWait(driver);
					
					driver.findElement(IPO3).clear();
				    driver.findElement(IPO3).sendKeys("6");
				    utilities.MediumWait(driver);
				    
				    driver.findElement(IPO4).clear();
				    driver.findElement(IPO4).sendKeys("2");
				    utilities.MediumWait(driver);	
					
				}
				public void Click_on_the_submit_button() throws Throwable {
					utilities.webDriverWait(driver, Submit);
					driver.findElement(Submit).click();
					utilities.MediumWait(driver);
					driver.findElement(Yes_button).click();
					utilities.MediumWait(driver);
//					driver.findElement(No_button).click();
//					 WebElement DisplayValue = driver.findElement(Expected);
//					 String AF = DisplayValue.getText();
//					 String expectedMessage = "Expected Order Qty = 20000";
//						if (expectedMessage.equals(AF)) {
//							System.out.println("Display Expected Order Qty is displaying correct." + AF);
//						} else {
//							System.out.println("Display Expected Order Qty is displaying incorrect."+ AF);
//						}
				}
				public void Verify_the_validation_msg_is_displaying_or_not() {
					WebElement AlertMsg = driver.findElement(A_S);
					String SVM = AlertMsg.getText();
					String expectedMessage = "IPO Order Quantity Details Saved Successfully";
					if (expectedMessage.equals(SVM)) {
						System.out.println("Alert message is correct." + SVM);
					} else {
						System.out.println("Alert message is incorrect."+ SVM);
					}
					
				}
				
				

	}



	


