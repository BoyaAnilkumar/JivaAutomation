package Page;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;


import util.DriverFactory;
import util.Utilities;

public class Stylepage extends DriverFactory{
	Date currentDate = new Date();
	SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
	String formattedDate = dateFormat.format(currentDate);

	Utilities utilities = new Utilities();
	//Login Functionality
		By SignIn   = By.xpath("//button[@class='btn btn-block btn-primary btn-lg font-weight-medium auth-form-btn']");
		By username = By.xpath("//input[@id='userName']");
		By password = By.xpath("//input[@id='userpassword']");
		By Woven = By. xpath ("//span[text()='Woven / knit']");
		By PD = By.xpath("//ul[@class='mm-collapse mm-show']/..//span[text()='PD ']");
		By StyleMaster = By.xpath("//a[text()=' Style Master ']");
		//Filter 
		By Filter = By.xpath("//button[@class='btn btn-primary btn-sm mr-3']");
		By Buyer = By.xpath("(//select[@data-toggle='select'])[1]");
		By SelectBuyer =By.xpath("(//option[@class='ng-star-inserted'])[31]");
		By Season1 = By.xpath("(//select[@data-toggle='select'])[2]");
		By Selectseason1 = By.xpath("(//option[@class='ng-star-inserted'])[41]");
		By Status =By.xpath("(//select[@data-toggle='select'])[3]");
		By Selectstatus=By.xpath("(//option[@class='ng-star-inserted'])[48]");
		By Searchbystyle = By.xpath("//input[@placeholder='Search by style #']");
		By Apply =By.xpath("//button[@class='btn btn-md btn-primary']");
		By Reset =By.xpath("//button[@class='btn btn-md btn-danger btn-active-light-primary mr-2']");
		
		//Create Style Master Form
		By Add = By.xpath("//button[@class='btn btn-primary btn-sm shadow-sm float-right ng-star-inserted']");
		By PDMerchant = By.xpath("(//input[@placeholder='Search By Name/Email/Ph.no'])	[1]");
		By selectPDMerchant = By.xpath("//li[text()=' Phani L - [ phani@gmail.com ] - [ 9854785623 ] ']|//li[@Class='p-ripple p-element p-autocomplete-item ng-tns-c93-12 ng-star-inserted']");
		By Buyerstyle = By.xpath("(//input[@placeholder='Enter Buyer Style'])[1]");
		By Buyerfield =By.xpath("(//select[@formcontrolname='buyerId'])[1]");
		By Buyerselect =By.xpath("(//option[text()=' Spin'])[1]");
		By Season= By.xpath("(//select[@formcontrolname='seasonTypeId'])[1]");
		By Selectseason =By.xpath("(//option[text()=' Summer2023'])[1]");
		By GarmentType =By.xpath("(//select[@formcontrolname='garmentTypeId'])[1]");
		By selectgarmenttype =By.xpath("(//option[text()=' Dress'])[1]");
		By garmentprocess=By.xpath("(//select[@formcontrolname='garmentProcessId'])[1]");
		By selectgarmentprocesstype= By.xpath("(//option[text()=' E.C&S (comp)'])[1]");
		By Techpackname= By.xpath("//input[@placeholder='Enter Tech Pack Name']");
		By Techpackdesc= By.xpath("//textarea[@placeholder='Enter Tech Pack Desc']");
		By Teckpackreceiveddate = By.xpath("(//input[@formcontrolname='techPackSampleReceivedDate'])[1]");
		By SamplingType = By.xpath("(//select[@formcontrolname='sampleTypeId'])[1]");
		By Selectsamplingtype = By.xpath("(//option[text()=' Fit'])[1]");
		By ExpectedSubmissionDate = By.xpath("(//input[@placeholder='Select Sample submission date'])[1]");
		By ExpectedorderQty = By.xpath("//input[@formcontrolname='expectedOderQty']");
		By Expectedorderdate = By.xpath("(//input[@placeholder='Select Expected Order Date'])[1]");
		By PDAssistants = By.xpath("(//input[@placeholder='Search By Name/Email/Ph.no'])	[2]");
		By selectPDAssistants = By.xpath("//li[text()=' test test - [ test@jiva-designs.com ] - [ 9999999999 ] ']|//li[@Class='p-ripple p-element p-autocomplete-item ng-tns-c93-115 ng-star-inserted']");
		By save =By.xpath("(//button[@class='btn btn-md btn-primary px-5 ng-star-inserted'])[1]");
		By Cancel = By.xpath("(//button[@class='btn btn-md btn-danger btn-active-light-primary mr-2'])[1]");
        //Add Revise Estimates
		By SelectStyle = By.xpath("(//tr[@class='ng-star-inserted']//a[@class='ng-star-inserted'])[1]");
		By Addreviseestimates = By.xpath("(//button[@class='btn btn-primary btn-sm shadow-sm float-right ng-star-inserted'])[3]");
		By Ordertype = By.xpath("//select[@formcontrolname='orderTypeId']");
		By selectordertype = By.xpath("//option[text()=' Confirmed']");
		By Orderdate = By.xpath("//input[@formcontrolname='orderDate']");
		By Exfactorydate = By.xpath("//input[@formcontrolname='exfactoryDate']");
		By OrderQty =By.xpath("//input[@formcontrolname='orderQuantity']");
		By Costingversions = By.xpath("//div[text()='Select Costing Versions']");
		By Savebutton = By.xpath("(//button[@class='btn btn-md btn-primary px-5 ng-star-inserted'])[3]");
		By cancel = By.xpath("(//button[@class='btn btn-md btn-danger btn-active-light-primary mr-2'])[5]");
		By selectversion = By.xpath("//span[@class='ng-option-label ng-star-inserted']");
		By cancelversion=By.xpath("(//span[text()='×'])[8]");
		By Can = By.xpath("//div[@class='ng-value-container']");
		By Generate = By.xpath("//input[@id='new']");
		By ReviseEstimates =By.xpath("//input[@id='revised']");	
		//Add Tech pack details
		By Addnewtechpack =By.xpath("(//button[@class='btn btn-primary btn-sm shadow-sm float-right ng-star-inserted'])[1]");
		By Techpacknamefield= By.xpath("//input[@formcontrolname='techPackName']");
		By TechPackDesc =By.xpath("//textarea[@formcontrolname='description']");
		By TechPackReceivedDate =By.xpath("//input[@formcontrolname='techPackSampleReceivedDate']");
		By Techpackdetailssave = By.xpath("(//button[@class='btn btn-md btn-primary px-5 ng-star-inserted'])[1]");
		By Techpackdetailscancel = By.xpath("(//button[@class='btn btn-md btn-danger btn-active-light-primary mr-2'])[3]");
		By TechpackcancelIcon = By.xpath("(//span[text()='×'])[4]");
		//Add Sampling details
		By Samplingdetails=By.xpath("(//button[@class='btn btn-primary btn-sm shadow-sm float-right ng-star-inserted'])[2]");
		By Samplingstatus = By.xpath("//select[@formcontrolname='sampleStatusId']");
		By Samplingtype =By.xpath("(//option[text()='-- Select --'])[3]");
		By selectsamplingtype = By.xpath("//option[@value='123']");
		By selectsampling2 = By.xpath("//option[@value='124']");
		By Submissiondate = By.xpath("//input[@formcontrolname='sampleSubmissionDate']");
		By samplingcancel = By.xpath("(//button[@class='btn btn-md btn-danger btn-active-light-primary mr-2'])[4]");
		By Samplingsave = By.xpath("(//button[@class='btn btn-md btn-primary px-5 ng-star-inserted'])[2]");
		By CancelIcon= By.xpath("(//button[@aria-label='Close'])[5]");
		//back buttons
		By Back1 = By.xpath("(//button[@class='btn btn-md btn-danger btn-active-light-primary mr-2'])[1]");
		By Back2 = By.xpath("(//button[@class='btn btn-md btn-danger btn-active-light-primary mr-2'])[2]");
		//Link buttons
		By LinktoFDS = By.xpath("//a[text()='Link to FDS']");
		By Link=By.xpath("(//a[@class='btn btn-light btn-active-light-primary btn-sm'])[2]");
		
		
		By val =By.xpath("//h2[text()='Mandatory Fields Are Required With Valid Data.']");
		
		By View_Icon = By.xpath("(//i[@class='pi pi-eye'])[1]");
		By View_Cancel = By.xpath("(//span[text()='×'])[1]");
		By View_close = By.xpath("(//button[@class='btn btn-danger'])[1]");
		By Manage_Icon = By.xpath("(//tr[@class='ng-star-inserted']//button[@title='Manage Images'])[1]");
		By Manage_save = By.xpath("(//i[@class='ti-save'])[1]");
		By Manage_images_cancel = By.xpath("(//button[@class='btn btn-md btn-primary ng-star-inserted'])[1]");
		By Manage_Images_close = By.xpath("(//button[@class='btn btn-danger mr-1'])[1]");
		By Edit_Icon =By.xpath("(//button[@title='Edit Style Master'])[1]");
		By Edit_Close_icon = By.xpath("(//span[text()='×'])[3]");
		By Edit_Close_button = By.xpath("(//button[@class='btn btn-danger'])[2]");
		By Update = By.xpath("(//button[@class='btn btn-primary ml-2'])[1]");
		
		By stylemasterview= By.xpath("(//h5[text()='Style Master View'])[1]");
		
		
		
		
		
		
		
		
		
		public void User_navigates_to_Login_page() throws Throwable {
			driver.get(prop.getProperty("url"));
			
			}
			public void User_enters_the_username_and_password() throws Throwable {
//			utilities.webDriverWait(driver, username);
			driver.findElement(username).sendKeys("Admin");
			driver.findElement(password).sendKeys("Abcd@123");
//			utilities.MediumWait(driver);
//				
			}
				
			public void User_click_on_the_signIn() throws Throwable {
//			utilities.webDriverWait(driver, password);		
			driver.findElement(SignIn).click();
//			utilities.MaximumWait(driver);
					
			}
			public void Click_on_the_Woven_Module() throws Throwable{
			utilities.webDriverWait(driver, Woven );
			driver.findElement(Woven).click();	
		    utilities.MediumWait(driver);	
			}
			public void click_on_the_PD_Module() throws Throwable{
			utilities.webDriverWait(driver, PD );
			driver.findElement(PD).click();	
//					utilities.MediumWait(driver);	

				}
				public void click_on_the_Style_Master_screen() throws Throwable{
					utilities.webDriverWait(driver, StyleMaster );
					driver.findElement(StyleMaster).click();	
//					utilities.MediumWait(driver);	
					
				}
				public void click_on_the_Filter_Icon() throws Throwable{
					utilities.webDriverWait(driver, Filter );
					driver.findElement(Filter).click();	
					utilities.MediumWait(driver);	
					
				}


				public void Verify_the_Filter_option_page() throws Throwable{
					utilities.webDriverWait(driver, Filter );
					boolean ElementPresent = driver.findElements(Filter).size()>0;
				   if(ElementPresent) {
					utilities.webDriverWait(driver, Filter );
					driver.findElement(Filter).click();	
					utilities.MediumWait(driver);	
					
				   }
				}
				public void Click_on_the_Buyer_filed() throws Throwable{
					  driver.findElement(Buyer).click();		
					  utilities.MediumWait(driver);
				}
				public void User_select_the_Buyer_in_buyer_dropdown_field() throws Throwable{ 
				driver.findElement(SelectBuyer).click();		
				  utilities.MediumWait(driver);
					
				
				}
				public void Click_on_the_season_field() throws Throwable{ 
					driver.findElement(Season1).click();		
					  utilities.MediumWait(driver);
						
					
				}
				public void User_select_the_Season_in_buyer_dropdown_field() throws Throwable{ 
					driver.findElement(Selectseason1).click();		
					  utilities.MediumWait(driver);
				}
				public void Click_on_the_Status_field() throws Throwable{ 
					driver.findElement(Status).click();		
					  utilities.MediumWait(driver);
						
					
				}
				public void User_select_the_Status() throws Throwable{ 
					driver.findElement(Selectstatus).click();		
					  utilities.MediumWait(driver);
				}
				public void Enter_the_data_in_Search_By_Style_field() throws Throwable{ 
					driver.findElement(Searchbystyle).sendKeys("srtGFDRW1");		
					  utilities.MediumWait(driver);
				}
				public void Click_on_the_Filter_Apply_button() throws Throwable{ 
					driver.findElement(Apply).click();		
					  utilities.MediumWait(driver);
				}
					
				
				public void Click_on_the_Filter_Reset_button() throws Throwable{ 
					driver.findElement(Reset).click();		
					  utilities.MediumWait(driver);
				}
					
					    
				    
				public void Click_on_the_Add_New_style_button() throws Throwable{
					utilities.webDriverWait(driver, Add );
					driver.findElement(Add).click();
				    driver.findElement(save).click();
					utilities.webDriverWait(driver, val);
//					utilities.MediumWait(driver);	 
//					
					
				}
				public void Click_on_the_PD_Merchant_name_field() throws Throwable{
//					utilities.webDriverWait(driver, PDMerchant );
					driver.findElement(PDMerchant).sendKeys("ph");
					Robot r = new Robot();
					r.keyPress(KeyEvent.VK_DOWN);
					Thread.sleep(2000);
					
					
				}
				public void User_select_the_PD_merchant_name() throws Throwable{
					utilities.webDriverWait(driver, selectPDMerchant );
					driver.findElement(selectPDMerchant).click();	
					utilities.MediumWait(driver);	 
					
					
			}
				public void Enter_the_data_in_BuyerStyle_field() throws Throwable{
				utilities.webDriverWait(driver, Buyerstyle );
				driver.findElement(Buyerstyle).sendKeys("srtGFDRW1");
				utilities.MediumWait(driver);
			}
				public void Click_on_the_Buyer_field() throws Throwable{
					utilities.webDriverWait(driver, Buyerfield );
					driver.findElement(Buyerfield).click();;
					utilities.MediumWait(driver); 
				}
				public void User_select_the_Buyer() throws Throwable{
				utilities.webDriverWait(driver, Buyerselect );
				utilities.MediumWait(driver);
				driver.findElement(Buyerselect).click();	
				
				
					
				}
				public void Click_on_the_Season_field() throws Throwable{
					utilities.webDriverWait(driver, Season );
					driver.findElement(Season).click();	
					utilities.MediumWait(driver);  
				
				}
				public void User_select_the_Season() throws Throwable{
					utilities.webDriverWait(driver, Selectseason );
					driver.findElement(Selectseason).click();	
					utilities.MediumWait(driver);  
				
				}
				public void Click_on_the_Garment_Type_field() throws Throwable{
					utilities.webDriverWait(driver, GarmentType );
					driver.findElement(GarmentType).click();	
					utilities.MediumWait(driver);  
				
				}
				public void Select_the_Garment_type() throws Throwable{
				utilities.webDriverWait(driver, selectgarmenttype );
				driver.findElement(selectgarmenttype).click();	
				utilities.MediumWait(driver);  
			
			}
				public void Click_on_the_Garment_process_field() throws Throwable{
					utilities.webDriverWait(driver, garmentprocess );
					driver.findElement(garmentprocess).click();	
					utilities.MediumWait(driver);  
					
					
		 }
				public void The_user_select_the_Garment_Process() throws Throwable{
					utilities.webDriverWait(driver, selectgarmentprocesstype );
					driver.findElement(selectgarmentprocesstype).click();	
					utilities.MediumWait(driver);  
				
				}
				
				public void User_enter_the_the_Tech_Pack_Name() throws Throwable{
					utilities.webDriverWait(driver, Techpackname );
					driver.findElement(Techpackname).sendKeys("StyleNew");
					utilities.MediumWait(driver);
				}
					
				public void Enter_the_data_in_Teck_pack_desc_field() throws Throwable{
					utilities.webDriverWait(driver, Techpackdesc );
					driver.findElement(Techpackdesc).sendKeys("Teckpack");
					utilities.MediumWait(driver);
				}
					
				public void User_select_the_data_in_Teck_received_date_field() throws Throwable{
					utilities.webDriverWait(driver, Teckpackreceiveddate );
					driver.findElement(Teckpackreceiveddate).sendKeys(formattedDate);
					utilities.MediumWait(driver);
					System.out.println("Current date: " + formattedDate );
				}	
				
				public void User_click_on_the_sampling_type_field() throws Throwable{
					utilities.webDriverWait(driver, SamplingType );
					driver.findElement(SamplingType).click();
					utilities.MediumWait(driver);
				}	
				public void The_user_select_the_sampling_type_in_dropdown_list() throws Throwable{
					utilities.webDriverWait(driver, Selectsamplingtype );
					driver.findElement(Selectsamplingtype).click();
					utilities.MediumWait(driver);
				}
				public void User_select_the_Expected_Submission_Date() throws Throwable{
					utilities.webDriverWait(driver, ExpectedSubmissionDate );
					driver.findElement(ExpectedSubmissionDate).sendKeys(formattedDate);
					utilities.MediumWait(driver);
					System.out.println("Current date: " + formattedDate );
				}	
					
					
				
				public void Enter_the_data_in_expected_order_qty_field() throws Throwable{
					utilities.webDriverWait(driver, ExpectedorderQty );
					driver.findElement(ExpectedorderQty).sendKeys("9000");
					utilities.MediumWait(driver);
				}	
					
				public void User_select_the_expected_order_date_field() throws Throwable{
					utilities.webDriverWait(driver, Expectedorderdate );
					driver.findElement(Expectedorderdate).sendKeys(formattedDate);
					utilities.MediumWait(driver);
					System.out.println("Current date: " + formattedDate);
				}
				
				public void The_user_select_the_PD_Assistants() throws Throwable{
					utilities.webDriverWait(driver, save );
					driver.findElement(PDAssistants).sendKeys("Te");
					Robot r = new Robot();
					r.keyPress(KeyEvent.VK_DOWN);
					Thread.sleep(2000);
				
				}
				public void select_PD_Assistants() throws Throwable {
					driver.findElement(selectPDAssistants).click();	
					utilities.MediumWait(driver);  
					
				}
				
				public void Click_on_the_Save_button() throws Throwable{
					utilities.webDriverWait(driver, save );
					driver.findElement(save).click();	
					utilities.MediumWait(driver);  
				
				}
					
				public void Click_on_the_Cancel_button() throws Throwable{
					utilities.webDriverWait(driver, Cancel );
					driver.findElement(Cancel).click();
					
				}
				public void Click_on_the_created_style()throws Throwable{
					utilities.webDriverWait(driver, SelectStyle );
					driver.findElement(SelectStyle).click(); 
					
				}
				public void User_click_on_the_add_revise_estimates_button() throws Throwable{
					utilities.webDriverWait(driver, Addreviseestimates );
					driver.findElement(Addreviseestimates).click();
					
				}
				public void Click_on_the_Generate_new_order_radio_button() throws Throwable{
					utilities.webDriverWait(driver, Generate );
					driver.findElement(Generate).click();
					utilities.MediumWait(driver);
				
						
					}
				public void Select_the_Order_Type() throws Throwable{
					utilities.webDriverWait(driver, Ordertype );
					driver.findElement(Ordertype).click(); 
					driver.findElement(selectordertype).click(); 
					
					
				}
				public void Select_the_Order_date()throws Throwable{
					utilities.webDriverWait(driver, Orderdate );
					driver.findElement(Orderdate).sendKeys(formattedDate);
//					utilities.MediumWait(driver);
					System.out.println("Current date: " + formattedDate);
			
					
				}
				public void Select_the_Exfactory_date() throws Throwable{
					utilities.webDriverWait(driver, Exfactorydate );
					driver.findElement(Exfactorydate).sendKeys(formattedDate);
					utilities.MediumWait(driver);
					System.out.println("Current date: " + formattedDate);
			
					
					
				}
				public void User_enter_the_Order_qty() throws Throwable{
					utilities.webDriverWait(driver, OrderQty );
					driver.findElement(OrderQty).clear();
					driver.findElement(OrderQty).sendKeys("2000");
					utilities.MediumWait(driver);
				}
					
					
				public void Select_the_Costing_Version() throws Throwable{
//					utilities.webDriverWait(driver, cancelversion );
//					driver.findElement(Can).clear();
					driver.findElement(Costingversions).click(); 
					Robot r = new Robot();
					r.keyPress(KeyEvent.VK_DOWN);
					Thread.sleep(2000);
				   driver.findElement(selectversion).click(); 
				}
															
				
				public void click_on_the_Save_button() throws Throwable{
					utilities.webDriverWait(driver, Savebutton );
					driver.findElement(Savebutton).click();
					
					
				}
				public void Click_on_the_cancel_button() throws Throwable{
					utilities.webDriverWait(driver, cancel );
					driver.findElement(cancel).click();
					
				
		
					
				}
//				public void Click_on_the_Generate_new_order_radio_button() throws Throwable{
//				utilities.webDriverWait(driver, Generate );
//				driver.findElement(Generate).click();
//				driver.findElement(ReviseEstimates).click();
//					
//				}
				public void Click_on_the_Add_new_tech_pack_button()  throws Throwable{
				driver.findElement(Addnewtechpack).click();
					
					
				}
				public void The_User_enter_the_data_in_tech_pack_name_field()  throws Throwable{
					driver.findElement(Techpacknamefield).sendKeys("newtechpack");
					
				}
				public void Enter_the_data_in_tech_pack_desc_field() throws Throwable{
					driver.findElement(TechPackDesc).sendKeys("techpackdesc");
					
					
					
				}
				public void User_select_the_Tech_Pack_Received_Date() throws Throwable{
				utilities.webDriverWait(driver, TechPackReceivedDate );
				driver.findElement(TechPackReceivedDate).sendKeys(formattedDate);
				System.out.println("Current date: " + formattedDate );
				utilities.MediumWait(driver);
					}	
	
				public void Click_on_the_tech_pack_details_Save_button() throws Throwable{
				driver.findElement(Techpackdetailssave).click();
				utilities.MediumWait(driver);
					
					
					
				}
				
				
				public void Click_on_the_tech_pack_details_Cancel_button() throws Throwable{
					driver.findElement(Techpackdetailscancel).click();
					utilities.MediumWait(driver);
				
					
				}
				public void Click_on_the_Tech_pack_cancel_Icon() throws Throwable{
					driver.findElement(TechpackcancelIcon).click();
					utilities.MediumWait(driver);
					
					
				}	
				
              public void Click_on_the_Add_sampling_details_button() throws Throwable{
			  driver.findElement(Samplingdetails).click();
			  utilities.MediumWait(driver);
					
					
				
              }  
   
			public void Select_the_sampling_status() throws Throwable{
				  utilities.MediumWait(driver);
				  driver.findElement(Samplingstatus).click();
				
			}
			
			public void User_Click_the_Sampling_type() throws Throwable{
				  utilities.MediumWait(driver);
				  driver.findElement(Samplingtype).click();
				 
			}
			public void User_select_the_Sampling_type() throws Throwable{
				  utilities.MediumWait(driver);
//				  driver.findElement(selectsamplingtype).click();
//				  driver.findElement(selectsamplingtype).clear();
				  driver.findElement(selectsampling2).click();
				
			}
				
			
			public void Select_the_Submission_date() throws Throwable{
//				utilities.webDriverWait(driver, Submissiondate );
				driver.findElement(Submissiondate).sendKeys(formattedDate);
				System.out.println("Current date: " + formattedDate );
//				utilities.MediumWait(driver);
//				driver.findElement(samplingcancel).click();
				driver.findElement(Samplingsave).click();
			}
				public void Click_on_the_sampling_Save_button() throws Throwable{
				driver.findElement(Samplingsave).click();
			}
			public void Click_on_the_Cancel_Icon() throws Throwable{
				  utilities.MediumWait(driver);
				  driver.findElement(CancelIcon).click();
				
			
				
				
			}
			public void Click_on_the_Back_button() throws Throwable{
				  utilities.MediumWait(driver);
				  driver.findElement(Back1).click();
//				  driver.findElement(Back2).click();
			
				}
			public void User_Click_on_the_Link_to_PD_FDS_button() throws Throwable{
				  utilities.MediumWait(driver);
				  driver.findElement(LinktoFDS).click();			
				
			}
			public void Click_on_the_Link_button() throws Throwable{
				  utilities.MediumWait(driver);
				  driver.findElement(Link).click();			
				
			
			
			}
			public void Click_on_the_View_Icon() throws Throwable{
				  utilities.MediumWait(driver);
				  driver.findElement(View_Icon).click();	
				
			}
			public void Click_on_the_View_Cancel_Icon() throws Throwable{
				  utilities.MediumWait(driver);
				  driver.findElement(View_Cancel).click();
				
			}
			public void Click_on_the_View_Close_button() throws Throwable{
				  utilities.MediumWait(driver);
				  driver.findElement(View_close).click();	
				
			}
			public void Click_on_the_Manage_Images_Icon() throws Throwable{
				  utilities.MediumWait(driver);
				  driver.findElement(Manage_Icon).click();	
				
			}
			public void Click_on_the_Manage_images_Save_button() throws Throwable{
				  utilities.MediumWait(driver);
				  driver.findElement(Manage_save).click();	
			}
			
			public void Click_on_the_Manage_Close_button() throws Throwable{
				  utilities.MediumWait(driver);
				  driver.findElement(Manage_Images_close).click();	
				
			}
			public void Click_on_the_Manage_Images_cancel_Icon() throws Throwable{
				  utilities.MediumWait(driver);
				  driver.findElement(Manage_images_cancel).click();	
			}
			
			public void Click_on_the_Edit_Icon() throws Throwable{
			utilities.MediumWait(driver);
			driver.findElement(Edit_Icon).click();	
				
			}
			public void CLick_on_the_Edit_Close_icon() throws Throwable{
			utilities.MediumWait(driver);
			driver.findElement(Edit_Close_icon).click();	
				
			}
			public void Click_on_the_Edit_Close_button() throws Throwable{
		    utilities.MediumWait(driver);
		    driver.findElement(Edit_Close_button).click();	
				
			}
			public void Click_on_the_Update_button() throws Throwable{
			utilities.MediumWait(driver);
			driver.findElement(Update).click();	
				
			}
			public void the_user_is_on_the_view_page() throws Throwable {
			utilities.MediumWait(driver);
			driver.findElement(stylemasterview).click();
			System.out.println(stylemasterview);
			}
			public void the_user_navigates_to_the_specific_view() {
				// TODO Auto-generated method stub
				
			}
			public void the_user_should_see_the_expected_content_on_the_page() {
				// TODO Auto-generated method stub
				
			}				
			
				
}            

				
				
				
			
				
		
					
					


		
