package Page;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import util.DriverFactory;
import util.Utilities;

public class SW_PDFDS_page extends DriverFactory {

	Utilities utilities=new Utilities();
	

		
		By username 				= By.xpath("//input[@name='username']");
		By Password					= By.xpath("//input[@name='password']");
		By SignIn 					= By.xpath("//button[text()='Sign In']");
		By Useraccount 				= By.xpath("//a[@Class='nav-link d-flex justify-content-between mb-2']");
		By Dashboard 				= By.xpath("//div[@Class='page_title_left d-flex align-items-center']//h3[text()='Sweater Dashboard']");

// Adding fabric to the style in PD FDS
		
		By Sweater 					= By.xpath("//span[text()='Sweater ']");
		By PDModule 				= By.xpath("//span[text()='PD ']");
		By Data_Entry				= By.xpath("(//span[text()='Data Entry'])[1]");
		By PDFDS 					= By.xpath("//a[text()='PD FDS ']");
		By Stylesexpansion 			= By.xpath("//a[@id='sidebarCollapse']");
 public By FilterIcon				= By.xpath("//i[@class='pi pi-filter']");
 public	By SearchByStyle			= By.xpath("//input[@placeholder='Search by style #']");
 public	By Apply_Filter				= By.xpath("//button[text()='Apply']");
 public By SelecttheStyle			= By.xpath("//a[@class='nav-link lite-yellow']");
		By AddNewFabric 			= By.xpath("//a[@Class='nav-link add-fabric']");
		By ClickonFabricQuality 	= By.xpath("//ng-select[@formcontrolname='fabricQualityId']");
		By Enter_Fabric_Quality		= By.xpath("//ng-select[@formcontrolname='fabricQualityId']/..//input[@type='text']");
		
		By SelectFabricQuality 		= By.xpath("//span[text()='80s cotton poplin']");
		
		By ClickContent 			= By.xpath("//select[@formcontrolname='content']");
		By ClickonContent 			= By.xpath("//option[@value='100% cotton']");
		By Selectcontent 			= By.xpath("//option[text()=' 100% Ecoliva']|//select[@class='form-control ng-pristine ng-invalid ng-touched'][2]");
		By ClickonColor 			= By.xpath("//ng-select[@formcontrolname='colorId']");
		By Selectcolor 				= By.xpath("//span[text()='Autumn memories print']");	
		
		By CountConstruction 		= By.xpath("//select[@formcontrolname='countOfConstruction']");
		
		By SelectCountcons 			= By.xpath("//option[text()=' 80s x 80s /16 x 120']");
		By EnterFinish 				= By.xpath("//input[@placeholder='Enter Finish']");
		By specificrequirements 	= By.xpath("//input[@placeholder='Enter Specific Requirements']");
		By EnterFabricQuantity 		= By.xpath("//input[@placeholder='Enter Fabric Quantity']");
		By EnterFullwidth 			= By.xpath("//input[@placeholder='Enter Width']");
		By ClickonUse 				= By.xpath("//select[@formcontrolname='use']");
		By SelectUse 				= By.xpath("//option[@value='193']");
		By ClickonResetbutton 		= By.xpath("//button[@class='btn btn-md btn-danger btn-active-light-primary mr-2 ng-star-inserted']");
		By ClickonSavebutton 		= By.xpath("(//i[text()=' SAVE ']|//button[@type='submit'])[2]");
		By Submit_ToFabric_Team		= By.xpath("//button[text()=' Submit to Fabric Team ']");
		By Submit_Toaster			= By.xpath("//h2[text()='Submit to Fabric Team Successfully']");
		By ToasterMessage 			= By.xpath("//h2[text()='Sweater Fabric Specification added successfully']");
		By Fabric_Manager	 		= By.xpath("//select[@formcontrolname='fabricManagerId']");
		By Select_Fabric_Manager	= By.xpath("//select[@formcontrolname='fabricManagerId']/.//option[text()=' Ravi Teja']");
		By Uaccount 				= By.xpath("//div[@class='profile_info dropdown']");
		By Logout 					= By.xpath("//a[text()='Log Out ']");
		
// Mouse hover on Tool tip for validation Text		
		By ValidationFabricQuality 	= By.xpath("(//div[@class='invalid-feedback validation-msg ng-star-inserted'])[1]");
		By Validaitonmsg 			= By.xpath("//div[text()='Fabric Quality is required']");
		By ValidationContent 		= By.xpath("(//div[@class='invalid-feedback validation-msg ng-star-inserted'])[2]");
		By ValidationColor 			= By.xpath("(//div[@class='invalid-feedback validation-msg ng-star-inserted'])[3]");
		By VCountConst				= By.xpath("(//div[@class='invalid-feedback validation-msg ng-star-inserted'])[4]");
		By VGSM 					= By.xpath("(//div[@class='invalid-feedback validation-msg ng-star-inserted'])[5]");
		By VFabricQuantity 			= By.xpath("(//div[@class='invalid-feedback validation-msg ng-star-inserted'])[6]");
		By VCuttablewidth 			= By.xpath("(//div[@class='invalid-feedback validation-msg ng-star-inserted'])[7]");
		By VUse 					= By.xpath("//div[@class='invalid-feedback count validation-msg ng-star-inserted']");
		By VFabricmanager			= By.xpath("//div[@class='invalid-feedback validation-msg ng-star-inserted']");
		
// Navigated to PD Fabric pricing with user: Ravi[Sourcing Manager]
		By PDFabricPricing 			= By.xpath("//a[text()='PD Fabric Pricing ']");
		By Yarn_Sourcing			= By.xpath("//span[text()='Yarn Sourcing ']");
		By Process_dropdown			= By.xpath("//select[@formcontrolname='processId']");
		By Price					= By.xpath("//input[@formcontrolname='price']");
		By Fabric_Supplier			= By.xpath("//select[@formcontrolname='fabricSupplierId']");
		By Remarks					= By.xpath("//input[@formcontrolname='remarks']");
		By Total_Price				= By.xpath("//input[@formcontrolname='totalPrice']");
		By Total_Fabric_Lead_Time	= By.xpath("//input[@formcontrolname='totalFabricLeadTime']");
		By Price_valid_for_days		= By.xpath("//input[@formcontrolname='priceValidforDays']");
		By Residual_Shrinkage		= By.xpath("//input[@formcontrolname='residualShrinkage']");
		By Boing					= By.xpath("//input[@formcontrolname='boing']");
		By CS						= By.xpath("//input[@formcontrolname='cs']");
		By Color_Fastness			= By.xpath("//input[@formcontrolname='colorFastness']");
		By GSM_Variation			= By.xpath("//input[@formcontrolname='gsMvariation']");
		By Crinkle_Variation		= By.xpath("//input[@formcontrolname='crinkleVariation']");
		By Other_Remarks			= By.xpath("//input[@formcontrolname='otherRemarks']");
		By Save_Button				= By.xpath("//button[text()=' SAVE ']");
		By update_Toaster			= By.xpath("//h2[text()='Sweater Fabric Pricing CallOut Updated Successfully']");
		By Submit_To_PO_Merchant_Team=By.xpath("//button[text()=' Submit to Po Merchant Team ']");
		By Toaster_submit			= By.xpath("//h2[text()='Sweater Fabric Status Changed Successfully']");
		
					
		
		public void Navigated_to_Dashboard_screen() throws Throwable {
			utilities.webDriverWait(driver, Dashboard);
			WebElement dashboardElement =driver.findElement(Dashboard);
			String Screen = dashboardElement.getText();
			if (dashboardElement.isDisplayed()) {
			   System.out.println("Screen Navigated to: " + Screen);
			} else {
			    System.out.println("Screen should navigate to Dashboard:"+Screen);
			}
		
	}
		
		
		public void Click_on_Sweater_module() throws Throwable {
			utilities.webDriverWait(driver, Sweater);
			driver.findElement(Sweater).click();
			
		}

		public void Click_on_PD_module_in_sw_module() throws Throwable {
			utilities.webDriverWait(driver, PDModule);
			driver.findElement(PDModule).click();
			
		}

		public void click_on_PDFDS_in_sweater() throws Throwable {
			utilities.webDriverWait(driver, PDFDS);
			driver.findElement(PDFDS).click();
		}
		

		public void Click_on_Style_expansion_in_sweater() throws Throwable {
			utilities.webDriverWait(driver, Stylesexpansion);
			driver.findElement(Stylesexpansion).click();
			
			utilities.webDriverWait(driver, FilterIcon);
			driver.findElement(FilterIcon).click();
			utilities.MinimumWait(driver);
			
			utilities.webDriverWait(driver, SearchByStyle);
			driver.findElement(SearchByStyle).click();
			driver.findElement(SearchByStyle).sendKeys("Style3");
			utilities.MinimumWait(driver);
			
			utilities.webDriverWait(driver, Apply_Filter);
			driver.findElement(Apply_Filter).click();
			utilities.MinimumWait(driver);
		}

		public void Select_the_IPO_in_the_list() throws Throwable {
			utilities.webDriverWait(driver, SelecttheStyle);
			driver.findElement(SelecttheStyle).click();
			utilities.MinimumWait(driver);
			
			utilities.webDriverWait(driver, Stylesexpansion);
			driver.findElement(Stylesexpansion).click();
			utilities.MinimumWait(driver);
		}
		
		
		
// Verifying the Tooltips for Mandatory fields by mousehover on them  .---------		
		
			public void I_mouse_hover_on_tool_tip_in_sweater() throws Throwable{
				
			utilities.webDriverWait(driver, Save_Button);
			driver.findElement(Save_Button).click();
			utilities.MinimumWait(driver);
			
			}
			public void Verify_the_Toaster_text_is_displaying_in_sweater() throws Throwable {
//				utilities.webDriverWait(driver, ToasterMessage);
//				driver.findElement(ToasterMessage).click();
//				System.out.print("Mandatory Fields Are Required With  Valid Data.");
//				utilities.MinimumWait(driver);
				
				WebElement elementToHover = driver.findElement(ValidationFabricQuality);
				Actions actions = new Actions(driver);
		        actions.moveToElement(elementToHover).perform();
		        utilities.MaximumLongWait(driver);
		        
		        WebElement elementToHover1 = driver.findElement(ValidationContent);
				Actions actions1 = new Actions(driver);
		        actions1.moveToElement(elementToHover1).perform();
		        utilities.MaximumLongWait(driver);
		        
		        WebElement elementToHover11 = driver.findElement(ValidationColor);
				Actions actions11 = new Actions(driver);
		        actions11.moveToElement(elementToHover11).perform();
		        utilities.MaximumLongWait(driver);
			}
			

		public void Click_on_Add_New_Fabric_button_in_sweater() throws Throwable {
			utilities.webDriverWait(driver, AddNewFabric);
			driver.findElement(AddNewFabric).click();
			utilities.MinimumWait(driver);

		}

		public void Click_on_Fabric_Quality_in_sweater() throws Throwable {
			utilities.webDriverWait(driver, ClickonFabricQuality);
			driver.findElement(ClickonFabricQuality).click();
			utilities.MediumWait(driver);
			
			utilities.webDriverWait(driver, Enter_Fabric_Quality);
			driver.findElement(Enter_Fabric_Quality).sendKeys("80s Cotton poplin");
			utilities.MinimumWait(driver);
			
		}

		public void Select_Fabric_Quality_in_sweater() throws Throwable {
			utilities.webDriverWait(driver, SelectFabricQuality);
			driver.findElement(SelectFabricQuality).click();
			utilities.MinimumWait(driver);
		}

		public void Click_on_Content_in_sweater() throws Throwable {
			
			boolean isElementPresent = false;

			try {
			    driver.findElement(ClickContent);
			    isElementPresent = true;
			} catch (NoSuchElementException e) {
			    // Element is not present
			    System.out.println("Content is not present");
			}

			if (isElementPresent) {
			    utilities.webDriverWait(driver, ClickContent);
			    System.out.println("Content is present");
			 String Content =    driver.findElement(ClickonContent).getAttribute("value");
			 System.out.println();
			 System.out.println(Content);
			 utilities.MediumWait(driver);
			}
			
		}

		public void Click_on_Color_in_sweater() throws Throwable {
			utilities.webDriverWait(driver, ClickonColor);
			driver.findElement(ClickonColor).click();
			Robot R = new Robot();
			R.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(5000);
			driver.findElement(Selectcolor).click();

		}
	
		public void Select_CountConstruction_in_sweater() throws Throwable {
			utilities.webDriverWait(driver, CountConstruction );
			driver.findElement(CountConstruction).click();
			Robot R = new Robot();
			R.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(5000);
			utilities.MinimumWait(driver);
			driver.findElement(SelectCountcons).isSelected();
			utilities.MinimumWait(driver);
			
		}
		
		public void Enter_Finish_value_in_sweater() throws Throwable {
			utilities.webDriverWait(driver, EnterFinish);
			driver.findElement(EnterFinish).sendKeys("250");
			utilities.MinimumWait(driver);
		}

		public void Enter_specific_requirements_in_sweater() throws Throwable {
			utilities.webDriverWait(driver, specificrequirements);
			driver.findElement(specificrequirements).sendKeys("30*26/35*30");
			utilities.MinimumWait(driver);
			
		}

		public void Enter_Fabric_Quantity_in_sweater() throws Throwable {
			utilities.webDriverWait(driver, EnterFabricQuantity);
			driver.findElement(EnterFabricQuantity).sendKeys("2000");
			utilities.MinimumWait(driver);
		}

		public void Enter_Full_width_in_sweater() throws Throwable {
			utilities.webDriverWait(driver, EnterFullwidth);
			driver.findElement(EnterFullwidth).sendKeys("30");
			utilities.MinimumWait(driver);
		}

		public void Select_use_in_sweater() throws Throwable {
			utilities.webDriverWait(driver, ClickonUse);
			driver.findElement(ClickonUse).click();
			Thread.sleep(4000);
			driver.findElement(SelectUse).click();
			utilities.MinimumWait(driver);
		}

		public void Click_on_Reset_button_in_sweater() throws Throwable {
			utilities.webDriverWait(driver, ClickonResetbutton);
			driver.findElement(ClickonResetbutton).click();
			Thread.sleep(2000);
			
			utilities.webDriverWait(driver, ClickonFabricQuality);
			driver.findElement(ClickonFabricQuality).click();
			utilities.MinimumWait(driver);
			
			utilities.webDriverWait(driver, SelectFabricQuality);
			driver.findElement(SelectFabricQuality).click();
			Robot R = new Robot();
			R.keyPress(KeyEvent.VK_DOWN);
			
			boolean isElementPresent = false;

			try {
			    driver.findElement(ClickContent);
			    isElementPresent = true;
			} catch (NoSuchElementException e) {
			    // Element is not present
			    System.out.println("Content is not present");
			}

			if (isElementPresent) {
			    utilities.webDriverWait(driver, ClickContent);
			    System.out.println("Content is present");
			    driver.findElement(ClickonContent).click();
			    utilities.MediumWait(driver);
			}
			   
			   utilities.webDriverWait(driver, ClickonColor);
				driver.findElement(ClickonColor).click();
				Robot R1 = new Robot();
				R1.keyPress(KeyEvent.VK_DOWN);
				Thread.sleep(5000);
				driver.findElement(Selectcolor).click();
				
			utilities.webDriverWait(driver, CountConstruction );
			driver.findElement(CountConstruction).click();
			Robot R11 = new Robot();
			R11.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(5000);
			utilities.MinimumWait(driver);
			driver.findElement(SelectCountcons).isSelected();
			utilities.MinimumWait(driver);
			
			utilities.webDriverWait(driver, EnterFinish);
			driver.findElement(EnterFinish).clear();
			utilities.MinimumWait(driver);
			driver.findElement(EnterFinish).sendKeys("200");
			utilities.MinimumWait(driver);
			
			utilities.webDriverWait(driver, specificrequirements);
			driver.findElement(specificrequirements).clear();
			utilities.MinimumWait(driver);
			driver.findElement(specificrequirements).sendKeys("20*16/35*30");
			utilities.MinimumWait(driver);
			
			utilities.webDriverWait(driver, EnterFabricQuantity);
			driver.findElement(EnterFabricQuantity).clear();
			utilities.MinimumWait(driver);
			driver.findElement(EnterFabricQuantity).sendKeys("1520");
			utilities.MinimumWait(driver);
			
			utilities.webDriverWait(driver, EnterFullwidth);
			driver.findElement(EnterFullwidth).clear();
			utilities.MinimumWait(driver);
			driver.findElement(EnterFullwidth).sendKeys("40");
			utilities.MinimumWait(driver);
			
			utilities.webDriverWait(driver, ClickonUse);
			driver.findElement(ClickonUse).click();
			Thread.sleep(4000);
			driver.findElement(SelectUse).click();
			utilities.MinimumWait(driver);
		}

		public void Click_on_Save_button_in_sweater() throws Throwable {
			utilities.webDriverWait(driver, ClickonSavebutton);
			driver.findElement(ClickonSavebutton).click();
			Thread.sleep(1000);
			
//			utilities.webDriverWait(driver, ToasterMessage);
//			driver.findElement(ToasterMessage).click();
//			Thread.sleep(1000);
//			WebElement Save = driver.findElement(ToasterMessage);
//			String SaveToaster = Save.getText();
//			System.out.println();
//			System.out.println(SaveToaster);
//			Thread.sleep(1000);
			
			
//			utilities.webDriverWait(driver, Submit_ToFabric_Team);
//			driver.findElement(Submit_ToFabric_Team).click();
//			utilities.MinimumWait(driver);
//			
//			utilities.webDriverWait(driver, Uaccount);
//			driver.findElement(Uaccount).click();
//			utilities.MinimumWait(driver);
//			
//			utilities.webDriverWait(driver, Logout);
//			driver.findElement(Logout).click();
//			utilities.MinimumWait(driver);
			
			
//			WebElement elementToHover = driver.findElement(VFabricmanager);
//			Actions actions = new Actions(driver);
//	        actions.moveToElement(elementToHover).perform();
//	        utilities.MaximumLongWait(driver);
			
		}

		
		
		public void Click_on_Fabric_Manager_in_sweater() throws Throwable {
			utilities.webDriverWait(driver, Fabric_Manager);
			driver.findElement(Fabric_Manager).click();
			Thread.sleep(5000);
			
			utilities.webDriverWait(driver, Select_Fabric_Manager);
			driver.findElement(Select_Fabric_Manager).click();
			utilities.MinimumWait(driver);
			
			utilities.webDriverWait(driver, Submit_ToFabric_Team);
			driver.findElement(Submit_ToFabric_Team).click();
			utilities.MaximumWait(driver);
			
//			utilities.webDriverWait(driver, Submit_Toaster);
//			driver.findElement(Submit_Toaster).click();
//			Thread.sleep(1000);
//			WebElement SubmitToaster = driver.findElement(Submit_Toaster);
//			String submit = SubmitToaster.getText();
//			System.out.println();
//			System.out.println(submit);
//			Thread.sleep(1000);
			
		}
		
		
		public void click_on_User_Account_in_sweater() throws Throwable {
			utilities.webDriverWait(driver, Uaccount);
			driver.findElement(Uaccount).click();
			utilities.MinimumWait(driver);
		}
		
		public void Click_on_Logout_button() throws Throwable {
			utilities.webDriverWait(driver, Logout);
			driver.findElement(Logout).click();
			utilities.MinimumWait(driver);
		}

		
//Adding the Pricing details for style in PD Fabric Pricing screen-------
		
		public void Navigate_to_PD_Fabric_Pricing_screen_in_sweater() throws Throwable {
			utilities.webDriverWait(driver, username);
			driver.findElement(username).sendKeys("ravi");
			utilities.MinimumWait(driver);
			
			utilities.webDriverWait(driver, Password);
			driver.findElement(Password).sendKeys("Abcd@123");
			utilities.MinimumWait(driver);
			
			utilities.webDriverWait(driver, SignIn);
			driver.findElement(SignIn).click();
			utilities.MaximumLongWait(driver);
			
			utilities.webDriverWait(driver, Sweater);
			driver.findElement(Sweater).click();
			utilities.MinimumWait(driver);
			
			utilities.webDriverWait(driver, Yarn_Sourcing);
			driver.findElement(Yarn_Sourcing).click();
			utilities.MinimumWait(driver);
			
			utilities.webDriverWait(driver, Data_Entry);
			driver.findElement(Data_Entry).click();
			utilities.MinimumWait(driver);
			
			utilities.webDriverWait(driver, PDFabricPricing);
			driver.findElement(PDFabricPricing).click();
			utilities.MinimumWait(driver);
			
			utilities.webDriverWait(driver, Stylesexpansion);
			driver.findElement(Stylesexpansion).click();
			utilities.MinimumWait(driver);
			
			utilities.webDriverWait(driver, FilterIcon);
			driver.findElement(FilterIcon).click();
			utilities.MinimumWait(driver);
			
			utilities.webDriverWait(driver, SearchByStyle);
			driver.findElement(SearchByStyle).click();
			driver.findElement(SearchByStyle).sendKeys("Style2");
			utilities.MinimumWait(driver);
			
			utilities.webDriverWait(driver, Apply_Filter);
			driver.findElement(Apply_Filter).click();
			utilities.MinimumWait(driver);
			
			utilities.webDriverWait(driver, SelecttheStyle);
			driver.findElement(SelecttheStyle).click();
			utilities.MinimumWait(driver);
			
			utilities.webDriverWait(driver, Process_dropdown);
			driver.findElement(Process_dropdown).click();
			Thread.sleep(2000);
			Robot R = new Robot();
			R.keyPress(KeyEvent.VK_DOWN);
			R.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(2000);
			
			utilities.webDriverWait(driver, Price);
			driver.findElement(Price).click();
			Thread.sleep(2000);
			driver.findElement(Price).sendKeys("5230");
			Thread.sleep(2000);
			
			utilities.webDriverWait(driver, Fabric_Supplier);
			driver.findElement(Fabric_Supplier).click();
			Thread.sleep(2000);
			R.keyPress(KeyEvent.VK_DOWN);
			R.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(2000);
			
			utilities.webDriverWait(driver, Remarks);
			driver.findElement(Remarks).click();
			Thread.sleep(2000);
			driver.findElement(Remarks).sendKeys("Test");
			Thread.sleep(2000);
			
			utilities.webDriverWait(driver, Total_Price);
			driver.findElement(Total_Price).click();
			Thread.sleep(1000);
			driver.findElement(Total_Price).sendKeys("520");
			Thread.sleep(1000);
			
			utilities.webDriverWait(driver, Total_Fabric_Lead_Time);
			driver.findElement(Total_Fabric_Lead_Time).click();
			Thread.sleep(1000);
			driver.findElement(Total_Fabric_Lead_Time).sendKeys("192");
			Thread.sleep(1000);
			
			utilities.webDriverWait(driver, Price_valid_for_days);
			driver.findElement(Price_valid_for_days).click();
			Thread.sleep(1000);
			driver.findElement(Price_valid_for_days).sendKeys("24");
			Thread.sleep(1000);
			
			utilities.webDriverWait(driver, Residual_Shrinkage);
			driver.findElement(Residual_Shrinkage).click();
			Thread.sleep(1000);
			driver.findElement(Residual_Shrinkage).sendKeys("3.53");
			Thread.sleep(1000);
			
			utilities.webDriverWait(driver, Boing);
			driver.findElement(Boing).click();
			Thread.sleep(1000);
			driver.findElement(Boing).sendKeys("12");
			Thread.sleep(1000);
			
			utilities.webDriverWait(driver, CS);
			driver.findElement(CS).click();
			Thread.sleep(1000);
			driver.findElement(CS).sendKeys("15");
			Thread.sleep(1000);
			
			utilities.webDriverWait(driver, Color_Fastness );
			driver.findElement(Color_Fastness).click();
			Thread.sleep(1000);
			driver.findElement(Color_Fastness).sendKeys("15");
			Thread.sleep(1000);
			
			utilities.webDriverWait(driver, GSM_Variation);
			driver.findElement(GSM_Variation).click();
			Thread.sleep(1000);
			driver.findElement(GSM_Variation).sendKeys("17");
			Thread.sleep(1000);
			
			utilities.webDriverWait(driver, Crinkle_Variation);
			driver.findElement(Crinkle_Variation).click();
			Thread.sleep(1000);
			driver.findElement(Crinkle_Variation).sendKeys("20");
			Thread.sleep(1000);
			
			utilities.webDriverWait(driver, Other_Remarks);
			driver.findElement(Other_Remarks).click();
			Thread.sleep(1000);
			driver.findElement(Other_Remarks).sendKeys("Test");
			Thread.sleep(1000);
			
			utilities.webDriverWait(driver, Save_Button);
			driver.findElement(Save_Button).click();
			Thread.sleep(1000);
			driver.findElement(update_Toaster).click();
			Thread.sleep(1000);
			WebElement update = driver.findElement(update_Toaster);
			String updateToaster = update.getText();
			System.out.println();
			System.out.println(updateToaster);
			utilities.MinimumWait(driver);
			
			utilities.webDriverWait(driver, Submit_To_PO_Merchant_Team);
			driver.findElement(Submit_To_PO_Merchant_Team).click();
			Thread.sleep(1000);
			driver.findElement(Toaster_submit).click();
			Thread.sleep(1000);
			WebElement submit = driver.findElement(Toaster_submit);
			String submitToaster = submit.getText();
			System.out.println();
			System.out.println(submitToaster);
			Thread.sleep(1000);
			
			
		}

	
		
		




}
