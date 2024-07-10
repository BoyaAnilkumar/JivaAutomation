package Page;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import util.DriverFactory;
import util.Utilities;


public class Newfabricsheet_Pages extends DriverFactory{
	


	Utilities utilities = new Utilities();
	
	By Woven = By. xpath ("//span[text()='Woven / knit']");
	By Merchandising = By.xpath("(//span[text()='Merchandising '])[1]");
	By Data_Entry = By.xpath("(//ul/li/a/div/span[text()='Data Entry'])[3]");
	By Generate_Fabric = By.xpath("//span[text()='Generate Fabric Sheet']");
	By New_FabricSheet = By.xpath("//a[text()='New Fabric Sheet ']");
	By NewFabricSheet_Screen = By.xpath("//h3[@class='f_s_25 f_w_700 dark_text mr_30']");
	By StylesExpansion = By.xpath("//a[@type='button']");

//Verifiying the filter functionality
//	By FilterIcon = By.xpath("//button[@id='navbarDropdown3']");
//    By BuyerField1 = By.xpath("//p-multiselect[@filterby='buyerName']");
//    By EnterBuyer = By.xpath("//input[@role='textbox']");
//    By SelectBuyer = By.xpath("//div[@class='p-checkbox-box']");
//    By SeasonField = By.xpath("//select[@formcontrolname='seasonId']");
//    By Select_Season = By.xpath("//option[text()=' Holiday 2022']");
//    By SearchIPO = By.xpath("//input[@placeholder='Enter Buyer style # or IPO #']");
//    By Apply = By.xpath("//button[@class='btn btn-md btn-primary']");
//    By Reset = By.xpath("//button[@class='btn btn-md btn-light btn-active-light-primary mr-2']");
    By Select_IPO = By.xpath("//div[@class='nav flex-column nav-pills ng-star-inserted']");

//Add New Fabric Sheet
	By Bulk_Fabric = By.xpath("//input[@formcontrolname='bulkFabricDeadline']");
	By Fabric_Manager = By.xpath("//select[@formcontrolname='fabricManagerId']");
	By Select_Manager = By.xpath("//option[@value='3f62f42c-88db-4e3a-8296-a0dd2b5e38ee']");
	By Fabric_Manager_Assistants = By.xpath("//div[text()='Select Asst Name']");
	By Select_Manager_Assistants = By.xpath("(//div[@class='country-item ng-star-inserted'])[1]");
	By Assistants_Close = By.xpath("(//button[@type='button'])[3]");
	By AddNew_Fabricbutton = By.xpath("//a[@class='btn btn-primary btn-sm ng-star-inserted']");
	By Is_Nominated = By.xpath("//input[@formcontrolname='isNominated']");
	By Supplier_Name = By.xpath("//select[@formcontrolname='supplierId']");
	By Select_Supplier = By.xpath("//select[@formcontrolname='supplierId']/.//option[text()=' Ramya']");
	By Fabric_Quality = By.xpath("(//ng-select[@bindlabel='fabricName'])[1]");
	By Select_Fabric = By.xpath("(//span[@class='ng-option-label ng-star-inserted'])[1]");
	By Content =  By.xpath("//select[@formcontrolname='content']");
	By Construction = By.xpath("//select[@formcontrolname='construction']");
	By Select_Construction = By.xpath("//select[@formcontrolname='construction']//option[@class='ng-star-inserted']");
	By Required_GSM = By.xpath("//select[@formcontrolname='gsm']");
	By Select_GSM = By.xpath("//select[@formcontrolname='gsm']//option[@class='ng-star-inserted']");
	By Cuttable_Width = By.xpath("//select[@formcontrolname='cuttableWidth']");
	By Select_Width = By.xpath("//select[@formcontrolname='cuttableWidth']//option[@class='ng-star-inserted']");
	By Fabric_Use = By.xpath("//select[@formcontrolname='use']");
	By Select_Use = By.xpath("//option[@value='193']");
	By Colour = By.xpath("//ng-select[@formcontrolname='colorId']");
	By Select_Colour = By.xpath("(//span[@class='ng-option-label ng-star-inserted'])[1]");
	By Applicable_Combos = By.xpath("//select[@formcontrolname='comboId']");
	By Select_Combos = By.xpath("(//select[@formcontrolname='comboId']//option[@class='ng-star-inserted'])[1]");
	By Addl_Inf = By.xpath("//textarea[@placeholder='Enter Addl Information']");
	By Additional_per = By.xpath("//input[@placeholder='Enter Addl. Rejection']");
	By Gar_Avg1 = By.xpath("(//input[@placeholder='Enter Garment Avg.'])[1]");
	By Gar_Avg2 = By.xpath("(//input[@placeholder='Enter Garment Avg.'])[2]");
	By GarmentAvg_Uom = By.xpath("//select[@formcontrolname='garmentAvgUOM']");
	By Required_Uom = By.xpath("//select[@formcontrolname='uom']");
	By Cutting_wastage = By.xpath("//input[@placeholder='Enter Cutting Wastage (%)']");
	By Fabric_RequiredforSampling = By.xpath("//input[@placeholder='Enter Fabric Required For Sampling']");
	By select_content = By.xpath("//select[@formcontrolname='content']//option[@class='ng-star-inserted']");
	By Fabric_Cutting = By.xpath("//input[@formcontrolname='fabricRequredforCutting']");
	By Total_Fabric = By.xpath("//input[@formcontrolname='totalFabric']");
	By A_Cancel =By.xpath("//a[@class='btn btn-md btn-danger mr-2']");
	By A_Submit = By.xpath("//button[@class='btn btn-primary btn-md']");
	By P_Save = By.xpath("//button[@class='btn btn-md btn-primary btn-active-light-primary ng-star-inserted']");
	By GoToTop = By.xpath("//a[@title='Go to Top']");
	By Delete = By.xpath("(//button[@class='btn btn-sm btn-danger ng-star-inserted'])[2]");
	By Yes = By.xpath("//button[@class='swal2-confirm swal2-styled']");
	By No = By.xpath("//button[@class='swal2-cancel swal2-styled']");
	By Submit_FabricTeam = By.xpath("//button[text()=' Submit to Fabric Team']");
	By Submit_FabricTeam_Yes = By.xpath("//button[@class='swal2-confirm swal2-styled']");
	By Submit_FabricTeam_No = By.xpath("//button[@class='swal2-cancel swal2-styled']");
	By Submit_Validationmsg = By.xpath("//h2[text()='New Fabric Sheet Submitted Successfully']");
	
//Verifying the import functionality
	By Import = By.xpath("//button[@class='btn btn-primary btn-sm']");
	By Import_Fabric = By.xpath("//input[@autocomplete='ad1fbdb45256']");
	By OtherIPO = By.xpath("//input[@id='isotherIPO']");
	By Import_Other_IPO = By.xpath("//ng-select[@formcontrolname='imIpoId']");
	By Import_Other_SelectIPO = By.xpath("(//span[@class='ng-option-label ng-star-inserted'])[1]");
	By Import_Other_Fabric = By.xpath("(//ng-select[@bindvalue='fabricId'])[2]");
	By Import_SelectFabric = By.xpath("//span[@class='ng-option-label ng-star-inserted']");
	By PDFDS = By.xpath("//input[@id='PdFds']");
	By Import_PDFDS_Fabric = By.xpath("//input[@autocomplete='af62afbea4fc']");
	By Import_Close = By.xpath("//button[@class='btn btn-danger']");
	By Import_button = By.xpath("//button[@class='btn btn-primary']");

	By WithIn_IPO = By.xpath("//input[@name='withinIPO']");
	By WithIn_Fabric = By.xpath("(//ng-select[@bindvalue='fabricId'])[1]");
	By PD_FDS = By.xpath("//input[@name='PdFds']");
	By Close = By.xpath("//button[@aria-label='Close']");
	By PDFds_Fabric = By.xpath("(//ng-select[@bindvalue='fabricId'])[3]");
	By Val_Save = By.xpath("//h2[text()='New Fabric Sheet Partially Updated Successfully']");
	By Toaster_msg = By.xpath("//div[@aria-labelledby='swal2-title']/..//h2[text()='Mandatory Fields Are Required With  Valid Data.']");
	
//update the new fabric sheet by clicking on edit icon 
	By Edit = By.xpath("(//button[@class='btn btn-sm btn-info mr-1 ng-star-inserted'])[1]");
	By Update_Is_Nominated = By.xpath("//input[@formcontrolname='isNominated']");
	By Update_Supplier_Name = By.xpath("//select[@formcontrolname='supplierId']");
	By Update_Select_Supplier = By.xpath("//option[@value='3']");
	By Update_Fabric_Quality = By.xpath("(//ng-select[@bindlabel='fabricName'])[1]");
	By Update_Select_Fabric = By.xpath("(//span[@class='ng-option-label ng-star-inserted'])[2]");
	By Update_Content =  By.xpath("//select[@formcontrolname='content']");
	By Update_Construction = By.xpath("//select[@formcontrolname='construction']");
	By Update_Select_Construction = By.xpath("//select[@formcontrolname='construction']//option[@class='ng-star-inserted']");
	By Update_Required_GSM = By.xpath("//select[@formcontrolname='gsm']");
	By Update_Select_GSM = By.xpath("//select[@formcontrolname='gsm']//option[@class='ng-star-inserted']");
	By Update_Cuttable_Width = By.xpath("//select[@formcontrolname='cuttableWidth']");
	By Update_Select_Width = By.xpath("//select[@formcontrolname='cuttableWidth']//option[@class='ng-star-inserted']");
	By Update_Fabric_Use = By.xpath("//select[@formcontrolname='use']");
	By Update_Select_Use = By.xpath("//option[@value='192']");
	By Update_Colour = By.xpath("//ng-select[@formcontrolname='colorId']");
	By Update_Select_Colour = By.xpath("(//span[@class='ng-option-label ng-star-inserted'])[1]");
	By Update_Applicable_Combos = By.xpath("//select[@formcontrolname='comboId']");
	By Update_Select_Combos = By.xpath("(//select[@formcontrolname='comboId']//option[@class='ng-star-inserted'])[2]");
	By Update_Addl_Inf = By.xpath("//textarea[@placeholder='Enter Addl Information']");
	By Update_Additional_per = By.xpath("//input[@placeholder='Enter Addl. Rejection']");
	By Update_Gar_Avg1 = By.xpath("(//input[@placeholder='Enter Garment Avg.'])[1]");
	By Update_Gar_Avg2 = By.xpath("(//input[@placeholder='Enter Garment Avg.'])[2]");
	By Update_GarmentAvg_Uom = By.xpath("//select[@formcontrolname='garmentAvgUOM']//option[@value='Kgs']");
	By Update_Required_Uom = By.xpath("//select[@formcontrolname='uom']//option[@value='Kgs']");
	By Update_Cutting_wastage = By.xpath("//input[@placeholder='Enter Cutting Wastage (%)']");
	By Update_Fabric_RequiredforSampling = By.xpath("//input[@placeholder='Enter Fabric Required For Sampling']");
	By Update_select_content = By.xpath("//select[@formcontrolname='content']//option[@class='ng-star-inserted']");
	By Update_Fabric_Cutting = By.xpath("//input[@formcontrolname='fabricRequredforCutting']");
	By Update_Total_Fabric = By.xpath("//input[@formcontrolname='totalFabric']");
	By Update_A_Cancel =By.xpath("//a[@class='btn btn-md btn-danger mr-2']");
	By Update_A_Submit = By.xpath("//button[@class='btn btn-primary btn-md']");
	
	
	
	
	

	public void Click_on_the_Woven_Module() throws Throwable {
		utilities.webDriverWait(driver, Woven );
		driver.findElement(Woven).click();
		utilities.MinimumWait(driver);
		
	}

	public void click_on_the_Merchandising_Module() throws Throwable {
		utilities.webDriverWait(driver, Merchandising );
		driver.findElement(Merchandising).click();
		utilities.MinimumWait(driver);
	}
	
	public void Click_on_data_entry_in_merchandising_module() throws Throwable {
		utilities.webDriverWait(driver, Data_Entry);
		driver.findElement(Data_Entry).click();
		utilities.MinimumWait(driver);
		
	}


	public void Click_on_the_Generate_Fabric_Sheet_Module() throws Throwable {
		 utilities.webDriverWait(driver, Generate_Fabric );
		   driver.findElement(Generate_Fabric).click();
		   utilities.MinimumWait(driver);
	}

	public void Click_on_the_New_Fabric_Sheet_Screen() throws Throwable {
		 utilities.webDriverWait(driver, New_FabricSheet );
		   driver.findElement(New_FabricSheet).click();
		   utilities.MinimumWait(driver);
		
	}

	public void Verify_whether_the_New_fabric_sheet_screen_is_displaying_or_not() throws Throwable {

			boolean ElementPresent = driver.findElements(NewFabricSheet_Screen).size()>0;
			   if(ElementPresent) {
				utilities.webDriverWait(driver,NewFabricSheet_Screen);
	            utilities.MinimumWait(driver);	
	            System.out.println("The Page is navigated to " + " New Fabric Sheet Screen");
			   }
			   else {
				   utilities.webDriverWait(driver,StylesExpansion);
				   driver.findElement(StylesExpansion).click();
				   utilities.MinimumWait(driver);	
				   System.out.println("Click on the Styles Expansion");
	}
		
}

	
		
//		public void Click_on_the_Season_Field() throws Throwable {
//		   utilities.webDriverWait(driver, SeasonField);
//			driver.findElement(SeasonField).click();
//		}
//
//		public void Search_the_IPO() throws Throwable {
//			utilities.webDriverWait(driver, SearchIPO);
//			driver.findElement(SearchIPO).sendKeys("New1234");
//			Thread.sleep(5000);
//			WebElement IPOname = driver.findElement(SearchIPO);
//			String ipon = IPOname.getAttribute("value");
//			System.out.println("Display the entered IPO Name " + ipon);
//			
//
//		}
//		public void Click_on_the_Apply_button() throws Throwable {
//			utilities.webDriverWait(driver, Apply);
//			driver.findElement(Apply).click();
//
//		}
//		public void Click_on_the_Reset_button() throws Throwable {
//			utilities.webDriverWait(driver, Reset);
//			driver.findElement(Reset).click();
//
//		}
		public void Select_the_IPO_and_Style() throws Throwable {
			utilities.webDriverWait(driver, Select_IPO);
			driver.findElement(Select_IPO).click();
			utilities.MinimumWait(driver);
			
			utilities.webDriverWait(driver,StylesExpansion);
			   driver.findElement(StylesExpansion).click();
			   utilities.MinimumWait(driver);	
			   System.out.println("Click on the Styles Expansion");
			
		}

		public void Enter_the_data_in_Bulk_Fabric_Deadline_field() throws Throwable {
			utilities.webDriverWait(driver, Bulk_Fabric);
			driver.findElement(Bulk_Fabric).sendKeys("4");
			utilities.MinimumWait(driver);
			
		}

		public void Click_on_the_Fabric_Manager_Field() throws Throwable {
			utilities.webDriverWait(driver, Fabric_Manager);
			driver.findElement(Fabric_Manager).click();	
			utilities.MinimumWait(driver);
			driver.findElement(Select_Manager).click();	
		}
        public void Select_the_Fabric_Manager_Assistants() throws Throwable {
        	utilities.webDriverWait(driver, Fabric_Manager_Assistants);
			driver.findElement(Fabric_Manager_Assistants).click();	
			utilities.MinimumWait(driver);
			driver.findElement(Select_Manager_Assistants).click();
			utilities.MinimumWait(driver);
			driver.findElement(Assistants_Close).click();
			
		}

		public void Click_on_the_Add_New_Fabric_button() throws Throwable {
			utilities.webDriverWait(driver, AddNew_Fabricbutton);
			driver.findElement(AddNew_Fabricbutton).click();
			utilities.MinimumWait(driver);
			
			try {
	            Robot robot = new Robot();
			
	            robot.delay(2000);
			
	            int scrollAmount = 10;
	            for (int i = 0; i < scrollAmount; i++) {
	                robot.keyPress(KeyEvent.VK_DOWN);
	                robot.keyRelease(KeyEvent.VK_DOWN);
	                robot.delay(500);
	            }

	        } catch (AWTException e) {
	            e.printStackTrace();
	        }
			
			
			driver.findElement(A_Submit).click();	
			driver.findElement(Toaster_msg).click();
			WebElement AlertMsg = driver.findElement(Toaster_msg);
			String SVM = AlertMsg.getText();
			String expectedMessage = "Mandatory Fields Are Required With Valid Data.";
			if (expectedMessage.equals(SVM)) {
				System.out.println("Alert message is correct." + SVM);
			} else {
				System.out.println("Alert message is incorrect."+ SVM);
			}
			utilities.MinimumWait(driver);
			driver.findElement(GoToTop).click();
		}

		public void Select_the_Is_Nominated_Check_box() throws Throwable {
			utilities.webDriverWait(driver, Is_Nominated);
			driver.findElement(Is_Nominated).click();	
		}

		public void User_select_the_Supplier_name() throws Throwable {
			utilities.webDriverWait(driver, Supplier_Name);
			driver.findElement(Supplier_Name).click();	
			utilities.MinimumWait(driver);
			Robot selectsupplier = new Robot();
			selectsupplier.keyPress(KeyEvent.VK_DOWN);
			selectsupplier.keyPress(KeyEvent.VK_DOWN);selectsupplier.keyPress(KeyEvent.VK_DOWN);
			selectsupplier.keyPress(KeyEvent.VK_ENTER);
			utilities.MinimumWait(driver);
			
		}

		public void Click_on_the_Fabric_Quality_field() throws Throwable {
			utilities.webDriverWait(driver, Fabric_Quality);
			driver.findElement(Fabric_Quality).click();	
			utilities.MinimumWait(driver);
			
			
		}

		public void Select_the_Fabric_Quality() throws Throwable {
			utilities.webDriverWait(driver, Select_Fabric);
			driver.findElement(Select_Fabric).click();
			
		}
		public void Click_on_the_Content() throws Throwable {
			
			if(Content.equals(select_content)) {
				System.out.println("Content is prepopulated");
				
			}
			else {
			driver.findElement(Content).click();
		    driver.findElement(select_content).click();
		    WebElement Content = driver.findElement(select_content);
			String DisContent = Content.getText();
			System.out.println("Displaying the selected Content value: " + DisContent);
			}
           
		}
		public void Click_on_the_Count_Construction() throws Throwable {
			
			if(Construction.equals(Select_Construction)) {
				System.out.println("Contruction is prepopulated");
			}else {
				driver.findElement(Construction).click();
				utilities.MinimumWait(driver);
				driver.findElement(Select_Construction).click();
				WebElement Contruction = driver.findElement(Select_Construction);
				String DisConstruction = Contruction.getText();
				System.out.println("Displaying the selected Count Construction value: " + DisConstruction);
			}
				
	   }
		

		public void Click_on_the_Required_GSM() throws Throwable {
				driver.findElement(Required_GSM).click();
				utilities.MinimumWait(driver);
				driver.findElement(Select_GSM).click();
				WebElement GSM = driver.findElement(Select_GSM);
				String DisGSM = GSM.getText();
				System.out.println("Displaying the selected Required GSM value: " + DisGSM);
	   }	
	

		public void Click_on_the_Cuttable_Width() throws Throwable {
				driver.findElement(Cuttable_Width).click();
				utilities.MinimumWait(driver);
				driver.findElement(Select_Width).click();
				WebElement Width = driver.findElement(Select_Width);
				String Diswidth = Width.getText();
				System.out.println("Displaying the selected Cuttable width value: " + Diswidth);
		}

		public void Select_the_Fabric_Use() throws Throwable {
			utilities.webDriverWait(driver, Fabric_Use);
			driver.findElement(Fabric_Use).click();	
			utilities.MinimumWait(driver);
			driver.findElement(Select_Use).click();	
			WebElement Use = driver.findElement(Select_Use);
			String DisUse = Use.getText();
			System.out.println("Displaying the selected Content value: " + DisUse);
			
		}
		public void Select_the_Colour() throws Throwable {
			utilities.webDriverWait(driver, Colour);
			driver.findElement(Colour).click();	
			utilities.MinimumWait(driver);
			driver.findElement(Select_Colour).click();		
			
		}

		public void Select_the_Applicable_Combos() throws Throwable {
			utilities.webDriverWait(driver, Applicable_Combos);
			driver.findElement(Applicable_Combos).click();	
			utilities.MinimumWait(driver);
			driver.findElement(Select_Combos).click();		
			
		}

		public void Enter_the_data_in_Addl_Information_field() throws Throwable {
			utilities.webDriverWait(driver, Addl_Inf);
			driver.findElement(Addl_Inf).sendKeys("New Fabric Sheet");
			
		}

		public void Enter_the_data_in_Additional_field() throws Throwable {
			utilities.webDriverWait(driver, Additional_per);
			driver.findElement(Additional_per).clear();
			driver.findElement(Additional_per).sendKeys("20");
			
		}

		public void Enter_the_data_in_garment_average_field() throws Throwable {
			utilities.webDriverWait(driver, Gar_Avg1);
			driver.findElement(Gar_Avg1).clear();
			driver.findElement(Gar_Avg1).sendKeys("40");
			utilities.MinimumWait(driver);
//			utilities.webDriverWait(driver, Gar_Avg2);
//			driver.findElement(Gar_Avg2).clear();
//			driver.findElement(Gar_Avg2).sendKeys("50");
			
		}

		public void Select_the_Garment_Average_UOM() throws Throwable {
			utilities.webDriverWait(driver, GarmentAvg_Uom);
			String uom = driver.findElement(GarmentAvg_Uom).getAttribute("value");
			System.out.println("Print the displaying UOM: " + uom);
			utilities.MinimumWait(driver);
		}

		public void Select_the_Required_UOM() throws Throwable {
			utilities.webDriverWait(driver, Required_Uom);
			String requireduom = driver.findElement(Required_Uom).getAttribute("value");
			System.out.println("Print the displaying UOM: " + requireduom);
			utilities.MinimumWait(driver);
			
		}

		public void Enter_the_data_in_Cutting_wastage_field() throws Throwable {
			utilities.webDriverWait(driver, Cutting_wastage);
			driver.findElement(Cutting_wastage).clear();
			driver.findElement(Cutting_wastage).sendKeys("3");
			
		}

		public void Check_the_Fabric_Required_For_Cutting_field_value_is_calculated_or_not() throws Throwable {
			utilities.webDriverWait(driver,Fabric_Cutting);
		    WebElement FabricRequiredforcutting = driver.findElement(Fabric_Cutting);
			String DisFabricRequiredforcutting = FabricRequiredforcutting.getAttribute("value");
			System.out.println("Displaying the value: " + DisFabricRequiredforcutting);
           
		}

		public void Enter_the_data_in_Fabric_Required_For_Sampling() throws Throwable {
			utilities.webDriverWait(driver, Fabric_RequiredforSampling);
			driver.findElement(Fabric_RequiredforSampling).clear();
			driver.findElement(Fabric_RequiredforSampling).sendKeys("50");
		}

		public void Check_the_Total_Fabric_Required_field_value_is_calculated_or_not() throws Throwable {
			    utilities.webDriverWait(driver,Total_Fabric);
			    WebElement TotalFabric = driver.findElement(Total_Fabric);
				String Distotalfabric = TotalFabric.getAttribute("value");
				System.out.println("Displaying the value: " + Distotalfabric);
			
		}

		public void Click_on_the_cancel_button() throws Throwable {
			utilities.webDriverWait(driver, A_Cancel);
			driver.findElement(A_Cancel).click();
			
			
		}

		public void Click_on_the_Save_button() throws Throwable {
			utilities.webDriverWait(driver, A_Submit);
			driver.findElement(A_Submit).click();
			utilities.MinimumWait(driver);
			driver.findElement(P_Save).click();
			
			
		}

		public void Click_on_the_Delete_Icon() throws Throwable {
			utilities.webDriverWait(driver, Delete);
			utilities.MinimumWait(driver);
			driver.findElement(GoToTop).click();
			utilities.MinimumWait(driver);
			driver.findElement(Delete).click();
			driver.findElement(Yes).click();
		//	driver.findElement(No).click();
			utilities.MinimumWait(driver);
			driver.findElement(P_Save).click();
			utilities.MinimumWait(driver);
		}

		public void Click_on_the_Import_Fabric_details_button() throws Throwable {
			utilities.MinimumWait(driver);
			driver.findElement(Import).click();
			
		}

		public void Select_the_Other_Radio_button() throws Throwable {
			utilities.MinimumWait(driver);
			driver.findElement(OtherIPO).click();
			utilities.MinimumWait(driver);
			driver.findElement(Import_Other_IPO).click();
			utilities.MinimumWait(driver);
			driver.findElement(Import_Other_SelectIPO).click();
			
			
		}

		public void Select_the_Fabric_name() throws Throwable {
			utilities.MinimumWait(driver);
			driver.findElement(Import_Other_Fabric).click();
			utilities.MinimumWait(driver);
			driver.findElement(Import_SelectFabric).click();
		}

		public void Select_the_IPO_name() {
			
			
		}

		public void Click_on_the_Close_button() throws Throwable {
			utilities.MinimumWait(driver);
			driver.findElement(Import_Close).click();
			
		}

		public void Click_on_the_Import_button() throws Throwable {
			utilities.MinimumWait(driver);
			driver.findElement(Import_button).click();
		}
		   public void Enter_the_data_after_import_the_fabric_details() throws Throwable {
			Thread.sleep(5000);
			driver.findElement(Fabric_Use).click();	
			utilities.MinimumWait(driver);
			driver.findElement(Select_Use).click();	
			
			utilities.MinimumWait(driver);
			driver.findElement(Colour).click();	
			utilities.MinimumWait(driver);
			driver.findElement(Select_Colour).click();
			
			utilities.MinimumWait(driver);
			driver.findElement(Applicable_Combos).click();
			utilities.MinimumWait(driver);
			driver.findElement(Select_Combos).click();	
			
			utilities.MinimumWait(driver);
			driver.findElement(Additional_per).clear();
			utilities.MinimumWait(driver);
			driver.findElement(Additional_per).sendKeys("20");
			utilities.MinimumWait(driver);
			driver.findElement(Gar_Avg1).clear();
			driver.findElement(Gar_Avg1).sendKeys("40");
			utilities.MinimumWait(driver);
			driver.findElement(Gar_Avg2).clear();
			driver.findElement(Gar_Avg2).sendKeys("50");
			utilities.MinimumWait(driver);
			driver.findElement(Fabric_RequiredforSampling).clear();
			driver.findElement(Fabric_RequiredforSampling).sendKeys("50");
			utilities.MinimumWait(driver);
			driver.findElement(A_Submit).click();
		}

		public void Select_the_WithIn_IPO_Radio_button() throws Throwable {
			utilities.webDriverWait(driver, WithIn_IPO);
			driver.findElement(WithIn_IPO).click();
			utilities.MinimumWait(driver);
			driver.findElement(WithIn_Fabric).click();
			utilities.MinimumWait(driver);
			driver.findElement(Import_SelectFabric).click();
		}

		public void Select_the_PD_FDS_Radio_button() throws Throwable {
			utilities.webDriverWait(driver, PD_FDS);
			driver.findElement(PD_FDS).click();
			utilities.MinimumWait(driver);
			driver.findElement(PDFds_Fabric).click();
			utilities.MinimumWait(driver);
			driver.findElement(Import_SelectFabric).click();
			
		}

		public void Click_on_the_Close_Icon_in_Import_Fabric_details_page() throws Throwable {
			utilities.webDriverWait(driver, Close);
			driver.findElement(Close).click();
			
		}

		public void Click_on_the_Submit_to_Fabric_Team_button() throws Throwable {
			utilities.webDriverWait(driver, Submit_FabricTeam);
			driver.findElement(Submit_FabricTeam).click();
			utilities.MinimumWait(driver);
			driver.findElement(Submit_FabricTeam_Yes).click();
//			utilities.MinimumWait(driver);
//			driver.findElement(Submit_FabricTeam_No).click();
			utilities.MinimumWait(driver);
			WebElement AlertMsg = driver.findElement(Submit_Validationmsg);
			String Val = AlertMsg.getText();
			String expectedMessage = "New Fabric Sheet Submitted Successfully";
			if (expectedMessage.equals(Val)) {
				System.out.println("Alert message is correct." + Val);
			} else {
				System.out.println("Alert message is incorrect."+ Val);
			}
		}

		public void After_click_on_the_Save_button_the_validation_msg_is_displaying_or_not() throws Throwable {
			utilities.webDriverWait(driver, Val_Save);
			driver.findElement(Val_Save).click();
			WebElement AlertMsg = driver.findElement(Val_Save);
			String SVM = AlertMsg.getText();
			String expectedMessage = "New Fabric Sheet Partially Updated Successfully";
			if (expectedMessage.equals(SVM)) {
				System.out.println("Alert message is correct." + SVM);
			} else {
				System.out.println("Alert message is incorrect."+ SVM);
			}
			
			
		}
		public void Click_on_the_Edit_Icon() throws Throwable {
//			utilities.MinimumWait(driver);
//			driver.findElement(GoToTop).click();
			
			utilities.webDriverWait(driver, Edit);
			driver.findElement(Edit).click();
			utilities.MinimumWait(driver);
//			try {
//	            Robot robot = new Robot();
//			
//	            robot.delay(2000);
//			
//	            int scrollAmount = 10;
//	            for (int i = 0; i < scrollAmount; i++) {
//	                robot.keyPress(KeyEvent.VK_DOWN);
//	                robot.keyRelease(KeyEvent.VK_DOWN);
//	                robot.delay(500);
//	            }
//
//	        } catch (AWTException e) {
//	            e.printStackTrace();
//	        }
//			driver.findElement(A_Submit).click();
//			utilities.MinimumWait(driver);
//			driver.findElement(P_Save).click();
//			utilities.MinimumWait(driver);
//			WebElement AlertMsg = driver.findElement(Val_Save);
//			String SVM = AlertMsg.getText();
//			String expectedMessage = "New Fabric Sheet Partially Updated Successfully";
//			if (expectedMessage.equals(SVM)) {
//				System.out.println("Alert message is correct." + SVM);
//			} else {
//				System.out.println("Alert message is incorrect."+ SVM);
//			}
		}

		public void Update_the_Supplier_Information() throws Throwable {
			utilities.webDriverWait(driver, Update_Is_Nominated);
			utilities.MinimumWait(driver);
			driver.findElement(Update_Is_Nominated).click();
			utilities.webDriverWait(driver, Update_Supplier_Name);
			driver.findElement(Update_Supplier_Name).click();	
			utilities.MinimumWait(driver);
			driver.findElement(Update_Select_Supplier).click();
		}

		public void Update_the_Fabric_Quality() throws Throwable {
			utilities.webDriverWait(driver, Update_Fabric_Quality);
			utilities.MinimumWait(driver);
			driver.findElement(Update_Fabric_Quality).click();	
			utilities.MinimumWait(driver);
			driver.findElement(Update_Select_Fabric).click();
		}
		public void Update_the_Content() throws Throwable {
			utilities.MinimumWait(driver);
			driver.findElement(Update_Content).click();
		    driver.findElement(Update_select_content).click();
		    WebElement Content = driver.findElement(Update_select_content);
			String DisContent = Content.getText();
			System.out.println("Displaying the selected Content value: " + DisContent);
		}
		public void Update_the_Count_construction() throws Throwable {
			utilities.MinimumWait(driver);
           driver.findElement(Update_Construction).click();
		    utilities.MinimumWait(driver);
		   driver.findElement(Update_Select_Construction).click();
			WebElement Contruction = driver.findElement(Update_Select_Construction);
			String DisConstruction = Contruction.getText();
			System.out.println("Displaying the selected Count Construction value: " + DisConstruction);
		}	
		public void Update_the_Required_GSM() throws Throwable {
				utilities.MinimumWait(driver);
				driver.findElement(Update_Required_GSM).click();
				utilities.MinimumWait(driver);
				driver.findElement(Update_Select_GSM).click();
				WebElement GSM = driver.findElement(Update_Select_GSM);
				String DisGSM = GSM.getText();
				System.out.println("Displaying the selected Required GSM value: " + DisGSM);
			}	
			public void Update_the_Cuttable_Width() throws Throwable {
				utilities.MinimumWait(driver);
				driver.findElement(Update_Cuttable_Width).click();
				utilities.MinimumWait(driver);
				driver.findElement(Update_Select_Width).click();
				WebElement Width = driver.findElement(Update_Select_Width);
				String Diswidth = Width.getText();
				System.out.println("Displaying the selected Cuttable width value: " + Diswidth);
			}	
			public void Update_the_Fabric_Use() throws Throwable {
				utilities.MinimumWait(driver);
				utilities.webDriverWait(driver, Fabric_Use);
			   driver.findElement(Update_Fabric_Use).click();	
			   utilities.MinimumWait(driver);
			   driver.findElement(Update_Select_Use).click();	
			   WebElement Use = driver.findElement(Update_Select_Use);
			   String DisUse = Use.getText();
			   System.out.println("Displaying the selected Content value: " + DisUse);
			
		}

		public void Update_the_Colour() throws Throwable {
			utilities.webDriverWait(driver, Update_Colour);
			driver.findElement(Update_Colour).click();	
			utilities.MinimumWait(driver);
			driver.findElement(Update_Select_Colour).click();	
		}
		public void Update_the_Applicable_Combos() throws Throwable {
			utilities.webDriverWait(driver, Update_Applicable_Combos);
			driver.findElement(Update_Applicable_Combos).click();	
			utilities.MinimumWait(driver);
			driver.findElement(Update_Select_Combos).click();	
			
		}

		public void Update_the_Garment_Average_Details() throws Throwable {
			utilities.webDriverWait(driver, Update_Additional_per);
			driver.findElement(Update_Additional_per).clear();
			driver.findElement(Update_Additional_per).sendKeys("10");
			
			utilities.webDriverWait(driver, Update_Gar_Avg1);
			driver.findElement(Update_Gar_Avg1).clear();
			driver.findElement(Update_Gar_Avg1).sendKeys("50");
			
			utilities.webDriverWait(driver, Update_Gar_Avg2);
			driver.findElement(Update_Gar_Avg2).clear();
			driver.findElement(Update_Gar_Avg2).sendKeys("70");
		}

		public void Update_the_Quantity_Requirment_details() throws Throwable {
			utilities.webDriverWait(driver, Update_GarmentAvg_Uom);
			driver.findElement(Update_GarmentAvg_Uom).click();
			
			utilities.webDriverWait(driver, Update_Required_Uom);
			driver.findElement(Update_Required_Uom).click();
			
			utilities.webDriverWait(driver, Update_Cutting_wastage);
			driver.findElement(Update_Cutting_wastage).clear();
			driver.findElement(Update_Cutting_wastage).sendKeys("4");
			
			utilities.webDriverWait(driver, Update_Fabric_RequiredforSampling);
			driver.findElement(Update_Fabric_RequiredforSampling).clear();
			driver.findElement(Update_Fabric_RequiredforSampling).sendKeys("60");
			
		}

		public void Click_on_the_Cancel_button() throws Throwable {
			utilities.webDriverWait(driver, Update_A_Cancel);
			driver.findElement(Update_A_Cancel).click();
		
		}

		public void Click_on_the_Submit_button() throws Throwable {
			utilities.webDriverWait(driver, Update_A_Submit);
			driver.findElement(Update_A_Submit).click();
			utilities.MinimumWait(driver);
			driver.findElement(P_Save).click();
			utilities.MinimumWait(driver);
			
			
		}

		
		

		

		

}
