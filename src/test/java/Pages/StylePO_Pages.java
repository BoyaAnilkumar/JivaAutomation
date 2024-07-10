package Pages;


import java.text.SimpleDateFormat;
import java.util.Date;

import org.joda.time.DateTime;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import util.DriverFactory;
import util.Utilities;

public class StylePO_Pages extends DriverFactory{
	Date currentDate = new Date();
	SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
	String formattedDate = dateFormat.format(currentDate);
	String Pastdate = DateTime.now().plusDays(-1).toString("dd-MM-yyyy");
	String tomorrow = DateTime.now().plusDays(1).toString("dd-MM-yyyy");
	Utilities utilities = new Utilities();
	

		By Woven = By. xpath ("//span[text()='Woven / knit']");
		By Merchandising = By.xpath("(//span[text()='Merchandising '])[1]");
		By Style_PO_Details = By.xpath("//a[@routerlink='style-po-details']");
		By Style_PO_details_Screen = By.xpath("//div[@class='row align-items-center justify-content-center ng-star-inserted']");
		By Styles = By.xpath("//a[@id='sidebarCollapse']");

	//Verifying the filter functionality
		By FilterIcon = By.xpath("//button[@id='navbarDropdown3']");
	    By BuyerField1 = By.xpath("//p-multiselect[@filterby='buyerName']");
	    By EnterBuyer = By.xpath("//input[@role='textbox']");
	    By SelectBuyer = By.xpath("//div[@class='p-checkbox-box']");
	    By SeasonField = By.xpath("//select[@formcontrolname='seasonId']");
	    By Select_Season = By.xpath("//option[text()=' Holiday 2022']");
	    By SearchIPO = By.xpath("//input[@placeholder='Enter Buyer style # or IPO #']");
	    By Apply = By.xpath("//button[@class='btn btn-md btn-primary']");
	    By Reset = By.xpath("//button[@class='btn btn-md btn-light btn-active-light-primary mr-2']");
	    By Select_IPO = By.xpath("//div[@class='nav flex-column nav-pills ng-star-inserted']");
    //IPO details
	    By IPO_Data = By.xpath("(//p[@class='mb-0 text-primary font-weight-bold'])[1]");
	    By Style_Name = By.xpath("(//p[@class='mb-0 text-primary font-weight-bold'])[2]");
	    By Buyer_Name = By.xpath("(//p[@class='mb-0 text-primary font-weight-bold'])[3]");
	    By Season = By.xpath("(//p[@class='mb-0 text-primary font-weight-bold'])[4]");
	    By POQty = By.xpath("(//p[@class='mb-0 text-primary font-weight-bold'])[5]");
	    By Combinations = By.xpath("(//div[@class='card-body'])[4]");
	    By GarmentSizeTypes = By.xpath("(//div[@class='card-body'])[5]");
	    
	//Add Form PO details
	    By Add_New_PO = By.xpath("//a[@class='btn btn-primary btn-sm ng-star-inserted']");
	    By PO_Filed = By.xpath("//input[@placeholder='Enter PO#']");
	    By PO_Details = By.xpath("//select[@formcontrolname='poDetailId']");
	    By Select_POdetails =By.xpath("(//option[@class='ng-star-inserted'])[1]");
	    By Po_Qty = By.xpath("//input[@placeholder='Enter PO Qty']");
	    By Shortage_Allowed = By.xpath("//input[@placeholder='Enter Shortage % allowed']");
	    By Addl_ShortageAllowed = By.xpath("//input[@placeholder='Enter Addl shipment % allowed']");
	    By Shipment_Priority = By.xpath("//input[@placeholder='Enter Shipment Priority']");
	    
	//Combo & Garment Size Details
	    By Combo = By.xpath("//ng-select[@placeholder='Select Combo']");
	    By Select_Combo = By.xpath("(//span[@class='ng-option-label ng-star-inserted'])[1]");
	    By Select_Combo1 = By.xpath("(//span[@class='ng-option-label ng-star-inserted'])[2]");
	    By Garment_Size = By.xpath("//ng-select[@placeholder='Select Garment Size']");
	    By Select_GramentSize = By.xpath("(//span[@class='ng-option-label ng-star-inserted'])[1]");
	    By Select_GramentSize1 = By.xpath("(//span[@class='ng-option-label ng-star-inserted'])[2]");

	    
	//EX factory Details 
	    By Exfactory = By.xpath("//input[@placeholder='Enter Ex Factory']");
	    By Days_Kept_In_Hand = By.xpath("//input[@placeholder='Enter Days Kept in Hand']");
	    By Ex_Factory_For_Production = By.xpath("//input[@placeholder='Enter Ex Factory For Production']");
	    By Requested_Exfactory = By.xpath("//input[@placeholder='Enter Requested Ex Factory']");
	    
	 //HandOver Details
	    By HandOver = By.xpath("//input[@placeholder='Enter Handover']");
	    By Mode = By.xpath("//select[@formcontrolname='mode']");
	    By Select_Mode = By.xpath("(//option[@class='ng-star-inserted'])[2]");
	    By Comment = By.xpath("//textarea[@placeholder='Enter Comments']");
	//Size wise details
	    By Size1 = By.xpath("(//div[@name='repeat-size']//div[@class='form-group col-xl-2 col-md-4 col-sm-6 col-12 ng-star-inserted']//input)[1]");
	    By Size2 = By.xpath("(//div[@name='repeat-size']//div[@class='form-group col-xl-2 col-md-4 col-sm-6 col-12 ng-star-inserted']//input)[2]");
	    By Size3 = By.xpath("(//div[@name='repeat-size']//div[@class='form-group col-xl-2 col-md-4 col-sm-6 col-12 ng-star-inserted']//input)[3]"); 
	    By Size4 = By.xpath("(//div[@name='repeat-size']//div[@class='form-group col-xl-2 col-md-4 col-sm-6 col-12 ng-star-inserted']//input)[4]");
	    By Size5 = By.xpath("(//div[@name='repeat-size']//div[@class='form-group col-xl-2 col-md-4 col-sm-6 col-12 ng-star-inserted']//input)[5]");
	    By Size6 = By.xpath("(//div[@name='repeat-size']//div[@class='form-group col-xl-2 col-md-4 col-sm-6 col-12 ng-star-inserted']//input)[6]"); 
	    By Size7 = By.xpath("(//div[@name='repeat-size']//div[@class='form-group col-xl-2 col-md-4 col-sm-6 col-12 ng-star-inserted']//input)[7]"); 
	    By S = By.xpath("//label[text()='S ']/..//input[@class='form-control ng-pristine ng-valid ng-touched']");
	    By Cancel = By.xpath("//a[@class='btn btn-md btn-danger mr-2']");
	    By Submit = By.xpath("//button[@class='btn btn-primary btn-md']");
	    By Validation = By.xpath("//h2[text()='PO Style Details Added Successfully']");
	//Update Style PO details 
	    By Edit = By.xpath("(//button[@class='btn btn-sm btn-info mr-1'])[1]");
	    By Update_Cancel = By.xpath("//a[@class='btn btn-md btn-danger mr-2']");
	    By Update_Submit = By.xpath("//button[@class='btn btn-primary btn-md']");
	    By Update_Validation = By.xpath("//h2[text()='PO Style Details Updated Successfully']");
	    By UpdatePO_form = By.xpath("//h3[text()=' Update PO ']");
	    By Delete = By.xpath("(//button[@class='btn btn-sm btn-danger'])[1]");
	    By Yes = By.xpath("//button[@class='swal2-confirm swal2-styled']");
	    By No = By.xpath("//button[@class='swal2-cancel swal2-styled']");
	    By View_Comments = By.xpath("(//button[@class='btn btn-sm btn-primary mr-1 ng-star-inserted'])[1]");
	    By Comments_Data = By.xpath("//p[text()='Style PO Details ']");
	    By Comments_Close = By.xpath("//button[@class='btn btn-danger']");
		By PO_Summary = By.xpath("//h3[text()='PO Summary']");
		By header = By.xpath("(//tr[@class='ng-star-inserted'])[1]");
        By PO_Sizegrid = By.xpath("//h3[text()='PO Size Wise Detail']");
	    
	

	public void Click_on_the_Style_Po_Details_Screen() throws Throwable {
		 utilities.webDriverWait(driver, Style_PO_Details );
		   driver.findElement(Style_PO_Details).click();
		
	}

	public void Verify_whether_the_Style_Po_details_screen_is_displaying_or_not() throws Throwable {
		boolean ElementPresent = driver.findElements(Style_PO_details_Screen).size()>0;
		   if(ElementPresent) {
			utilities.webDriverWait(driver,Style_PO_details_Screen);
         utilities.MediumWait(driver);	
         System.out.println("The Page is navigated to " + "Style PO Details Screen");
		   }
		   else {
			   utilities.webDriverWait(driver,Styles);
			   driver.findElement(Styles).click();
			   utilities.MediumWait(driver);	
			   System.out.println("Click on the Styles Expansion");
}
		
	}

			public void Verify_the_IPO_name_is_displaying_or_not() {
			WebElement Data = driver.findElement(IPO_Data);
			String IPO = Data.getText();
			String expectedData = "IPO16/10";
			if (expectedData.equals(IPO)) {
				System.out.println("Display IPO name is correct." + IPO);
			} else {
				System.out.println("Display IPO name is incorrect."+ IPO);
			}
			
		} 
		public void Verify_the_Style_name_is_displaying_or_not() {
			WebElement Data = driver.findElement(Style_Name);
			String Style = Data.getText();
			String expectedData = "Retro style";
			if (expectedData.equals(Style)) {
				System.out.println("Display Style name is correct." + Style);
			} else {
				System.out.println("Display Style name is incorrect."+ Style);
			}	
			
		}
		public void Verify_the_Buyer_name_is_displaying_or_not() {
			WebElement Data = driver.findElement(Buyer_Name);
			String Buyer = Data.getText();
			String expectedData = "Spin";
			if (expectedData.equals(Buyer)) {
				System.out.println("Display Buyer name is correct." + Buyer);
			} else {
				System.out.println("Display Buyer name is incorrect."+ Buyer);
			}	
			
		}
        public void Verify_the_Season_name_is_displaying_or_not() {
        	WebElement Data = driver.findElement(Season);
			String Season = Data.getText();
			String expectedData = "Holiday 2022";
			if (expectedData.equals(Season)) {
				System.out.println("Display Season is correct." + Season);
			} else {
				System.out.println("Display Season is incorrect."+ Season);
			}	
			
		}
        public void Verify_the_PO_Qty_Value_is_displaying_or_not() {
        	WebElement Data = driver.findElement(POQty);
			String Qty = Data.getText();
			String expectedData = "12000";
			if (expectedData.equals(Qty)) {
				System.out.println("Display PO Qty is correct." + Qty);
			} else {
				System.out.println("Display PO Qty is incorrect."+ Qty);
			}
			
        }
			public void Verify_the_Combination_names_are_displaying_or_not() {
				WebElement Data = driver.findElement(Combinations);
				String Combinations = Data.getText();
				String expectedData = "CM2CM1";
				if (expectedData.equals(Combinations)) {
					System.out.println("Display Combinations are correct." + Combinations);
				} else {
					System.out.println("Display Combinations are incorrect."+ Combinations);
				}
			}

			public void Verify_the_Garment_Size_Type_names_are_displaying_or_not() {
				WebElement Data = driver.findElement(GarmentSizeTypes);
				String Garments = Data.getText();
				String expectedData = "PetiteMissy";
				if (expectedData.equals(Garments)) {
					System.out.println("Display GarmentSizeTypes are correct." + Garments);
				} else {
					System.out.println("Display GarmentSizeTypes are incorrect."+ Garments);
				}
				
			}
			
		public void Click_on_the_Add_New_PO_button() throws Throwable {
			utilities.webDriverWait(driver,Add_New_PO );
			driver.findElement(Add_New_PO).click();
			
		}

		public void Enter_the_data_in_PO_field() throws Throwable {
			utilities.webDriverWait(driver,PO_Filed );
			driver.findElement(PO_Filed).sendKeys("PO1");
			
	    }
	
		public void Select_the_PO_details() throws Throwable {
			utilities.webDriverWait(driver,PO_Details );
			driver.findElement(PO_Details).click();
			utilities.MediumWait(driver);
			driver.findElement(Select_POdetails).click();
			
		}

		public void Enter_the_data_in_PO_Qty_field() throws Throwable {
			utilities.webDriverWait(driver,Po_Qty );
			driver.findElement(Po_Qty).sendKeys("500");
			
		}

		public void Enter_the_data_in_Shortage_Allowed() throws Throwable {
			utilities.webDriverWait(driver,Shortage_Allowed );
			driver.findElement(Shortage_Allowed).sendKeys("5");
			
		}

		public void Enter_the_data_in_Addl_Shipment_Allowed_field() throws Throwable {
			utilities.webDriverWait(driver,Addl_ShortageAllowed );
			driver.findElement(Addl_ShortageAllowed).sendKeys("8");
			
			
		}

		public void The_User_enter_the_data_in_Shipment_Priority_field() throws Throwable {
			utilities.webDriverWait(driver,Shipment_Priority );
			driver.findElement(Shipment_Priority).sendKeys("4");
			
		}

		public void Select_the_Combination() throws Throwable {
			utilities.webDriverWait(driver,Combo);
			driver.findElement(Combo).click();
			utilities.MediumWait(driver);
			driver.findElement(Select_Combo).click();
			
		}

		public void Select_the_Garment_size_type() throws Throwable {
			utilities.webDriverWait(driver,Garment_Size );
			driver.findElement(Garment_Size).click();
			utilities.MediumWait(driver);
			driver.findElement(Select_GramentSize).click();
		}

		public void Select_the_Ex_factory_date() throws Throwable {
			utilities.webDriverWait(driver, Exfactory );
			driver.findElement(Exfactory).sendKeys(formattedDate);
			utilities.MediumWait(driver);
			System.out.println("Current date: " + formattedDate);
			
		}

		public void Verify_the_data_is_displaying_in_the_Days_Kept_In_Hand_field_or_not() throws Throwable {
			 utilities.webDriverWait(driver,Days_Kept_In_Hand);
			    WebElement Data = driver.findElement(Days_Kept_In_Hand);
				String DisData = Data.getAttribute("value");
				System.out.println("Displaying the Value: " + DisData);
			
		}

		public void Verify_the_data_is_prepopulated_in_the_Ex_Factory_For_Production_field_or_not() throws Throwable {
			 utilities.webDriverWait(driver,Ex_Factory_For_Production);
			    WebElement Date = driver.findElement(Ex_Factory_For_Production);
				String DisDate = Date.getAttribute("value");
				System.out.println("Displaying the Date: " + DisDate);
			
		}

		public void Select_the_Requested_Ex_Factory_field() throws Throwable {
			utilities.webDriverWait(driver, Requested_Exfactory );
			driver.findElement(Requested_Exfactory).sendKeys(formattedDate);
			utilities.MediumWait(driver);
			System.out.println("tomorrow: " + formattedDate);
			
		}
		public void Select_the_Handover_Date() throws Throwable {
			utilities.webDriverWait(driver, HandOver);
			driver.findElement(HandOver).sendKeys(formattedDate);
			utilities.MediumWait(driver);
			System.out.println("Current date: " + formattedDate);
				
			
		}

		public void Select_the_Mode_Data() throws Throwable {
			utilities.webDriverWait(driver,Mode );
			driver.findElement(Mode).click();
			utilities.MediumWait(driver);
			driver.findElement(Select_Mode).click();
			
		}
		public void User_Enter_the_data_in_data_in_Comments_field() throws Throwable {
			utilities.webDriverWait(driver,Comment);
			driver.findElement(Comment).sendKeys("Style PO Details");
			System.out.println("Entered the comment");
		}
		public void Enter_Size_breakups_Qty() throws Throwable {
			utilities.webDriverWait(driver, Size1);
			driver.findElement(Size1).sendKeys("50");
			utilities.MediumWait(driver);
			driver.findElement(Size2).sendKeys("150");
			utilities.MediumWait(driver);
			driver.findElement(Size3).sendKeys("100");
		}

		public void Click_on_the_Cancel_Button() throws Throwable {
			utilities.webDriverWait(driver, Cancel);
			driver.findElement(Cancel).click();
		}
        public void Click_on_the_Submit_Button() throws Throwable {
		    utilities.webDriverWait(driver, Submit);
		    driver.findElement(Submit).click();
		    utilities.MediumWait(driver);
		}
        public void Verify_whether_the_Validation_msg_is_displaying_or_not() {
        	WebElement Val_Msg = driver.findElement(Validation);
			String SVM = Val_Msg.getText();
			String expectedMessage = "PO Style Details Added Successfully";
			if (expectedMessage.equals(SVM)) {
				System.out.println("Validation message is correct." + SVM);
			} else {
				System.out.println("Validation message is incorrect."+ SVM);
			}
			
		}
 
		public void Click_on_the_Edit_icon() throws Throwable {
			utilities.webDriverWait(driver, Edit);
		    driver.findElement(Edit).click();
			
		}
		public void Verify_the_Update_PO_Form_is_displaying_or_not() {
			WebElement Data = driver.findElement(UpdatePO_form);
			String UpdateForm = Data.getText();
			String expectedData = "Update PO";
			if (expectedData.equals(UpdateForm)) {
				System.out.println("Display GarmentSizeTypes are correct." + UpdateForm);
			} else {
				System.out.println("Display GarmentSizeTypes are incorrect."+ UpdateForm);
			}
			
		}

		public void Update_the_PO_details() throws Throwable {
			utilities.webDriverWait(driver,PO_Filed );
			driver.findElement(PO_Filed).clear();
			driver.findElement(PO_Filed).sendKeys("SPO1");
			utilities.webDriverWait(driver,PO_Details );
			driver.findElement(PO_Details).click();
			utilities.MediumWait(driver);
			driver.findElement(Select_POdetails).click();
			utilities.webDriverWait(driver,Po_Qty );
			driver.findElement(Po_Qty).clear();
			driver.findElement(Po_Qty).sendKeys("1000");
			driver.findElement(Shortage_Allowed).clear();
			driver.findElement(Shortage_Allowed).sendKeys("4");
			driver.findElement(Addl_ShortageAllowed).clear();
			driver.findElement(Addl_ShortageAllowed).sendKeys("6");
			driver.findElement(Shipment_Priority).clear();
			driver.findElement(Shipment_Priority).sendKeys("5");	
			
		}

		public void Update_the_Combo_and_Garment_Size_details() throws Throwable {
			utilities.webDriverWait(driver,Combo);
			driver.findElement(Combo).click();
			utilities.MediumWait(driver);
//			driver.findElement(Select_Combo).click();
			driver.findElement(Select_Combo1).click();
			utilities.webDriverWait(driver,Garment_Size );
//			driver.findElement(Garment_Size).clear();
			driver.findElement(Garment_Size).click();
			utilities.MediumWait(driver);
//			driver.findElement(Select_GramentSize).click();
			driver.findElement(Select_GramentSize1).click();
		}

		public void Update_the_Exfactory_details() throws Throwable {
			utilities.webDriverWait(driver, Exfactory );
			driver.findElement(Exfactory).sendKeys(formattedDate);
			utilities.MediumWait(driver);
			System.out.println("tomorrow: " + formattedDate);
			
		}

		public void Update_the_Handover_details() throws Throwable {
			utilities.webDriverWait(driver, HandOver);
			driver.findElement(HandOver).sendKeys(formattedDate);
			utilities.MediumWait(driver);
			System.out.println("tomorrow: " + formattedDate);
			
		}

		public void Update_the_PO_Size_wise_details() throws Throwable {
			utilities.webDriverWait(driver, Size1);
			driver.findElement(Size1).clear();
			driver.findElement(Size1).sendKeys("50");
			driver.findElement(Size2).clear();
			driver.findElement(Size2).sendKeys("120");
			driver.findElement(Size3).clear();
			driver.findElement(Size3).sendKeys("70");
			driver.findElement(Size4).clear();
			driver.findElement(Size4).sendKeys("50");
			driver.findElement(Size5).clear();
			driver.findElement(Size5).sendKeys("60");
			driver.findElement(Size6).clear();
			driver.findElement(Size6).sendKeys("90");
			driver.findElement(Size7).clear();
			driver.findElement(Size7).sendKeys("100");
		}

		public void Click_on_the_Update_form_Cancel_Button() throws Throwable {
			utilities.webDriverWait(driver, Update_Cancel);
		    driver.findElement(Update_Cancel).click();
		}

		public void Click_on_the_Update_form_Submit_button() throws Throwable {
			utilities.webDriverWait(driver, Update_Submit);
		    driver.findElement(Update_Submit).click();
			utilities.MediumWait(driver);
		}
		public void Verify_whether_the_update_Validation_msg_is_displaying_or_not() {
			WebElement Val_Msg = driver.findElement(Update_Validation);
			String SVM = Val_Msg.getText();
			String expectedMessage = "PO Style Details Updated Successfully";
			if (expectedMessage.equals(SVM)) {
				System.out.println("Validation message is correct." + SVM);
			} else {
				System.out.println("Validation message is incorrect."+ SVM);
			}
			
		}
		
		

		public void Click_on_the_Delete_icon() throws Throwable {
			utilities.webDriverWait(driver, Delete);
		    driver.findElement(Delete).click();
			utilities.MediumWait(driver);
			utilities.webDriverWait(driver, Yes);
		    driver.findElement(Yes).click();
		    utilities.MediumWait(driver);
//		    utilities.webDriverWait(driver, No);
//		    driver.findElement(No).click();
		}

		public void Click_on_the_View_Comments_Icon() throws Throwable {
			utilities.webDriverWait(driver, View_Comments);
		    driver.findElement(View_Comments).click();
			
		}

		public void Verify_the_Entered_Comments_are_displaying_or_not() throws Throwable {
			WebElement Data = driver.findElement(Comments_Data);
			String Comments = Data.getText();
			String expectedData = "Style PO Details ";
			if (expectedData.equals(Comments)) {
				System.out.println("Display Commemts are correct." + Comments);
			} else {
				System.out.println("Display Commemts are correct."+ Comments);
			}	
			
		}

		public void Click_on_the_Comments_Close_button() throws Throwable {
			utilities.webDriverWait(driver, Comments_Close);
		    driver.findElement(Comments_Close).click();
			
		}

		public void Check_the_PO_Summary_grid_is_displaying_or_not() {
			WebElement Data = driver.findElement(PO_Summary);
			String Gridname = Data.getText();
			String expectedData = "PO Summary";
			if (expectedData.equals(Gridname)) {
				System.out.println("Display grid name is correct." + Gridname);
			} else {
				System.out.println("Display grid name is incorrect."+ Gridname);
			}	
			
		}
		public void Verify_the_PO_Summary_grid_header_section_columnn_names_are_displaying_or_not() {
			WebElement Data = driver.findElement(header);
			String Gridname = Data.getText();
			String expectedData = "S.No. PO Detail Combos & Garment Size Details Ex Factory Details Handover Details";
			if (expectedData.equals(Gridname)) {
				System.out.println("Display grid name is correct." + Gridname);
			} else {
				System.out.println("Display grid name is incorrect."+ Gridname);
			}		
			
		}

		public void Check_the_PO_Size_wise_details_Grid_is_displaying_or_not() {
			WebElement Data = driver.findElement(PO_Sizegrid);
			String Gridname = Data.getText();
			String expectedData = "PO Size Wise Detail";
			if (expectedData.equals(Gridname)) {
				System.out.println("Display grid name is correct." + Gridname);
			} else {
				System.out.println("Display grid name is incorrect."+ Gridname);
			}		
			
		}
						
	
		
}


		