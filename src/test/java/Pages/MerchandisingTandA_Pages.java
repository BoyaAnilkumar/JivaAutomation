package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import util.DriverFactory;
import util.Utilities;

public class MerchandisingTandA_Pages extends DriverFactory{

    
	Utilities utilities = new Utilities();

	By Data_Entry = By.xpath("(//span[text()='Data Entry'])[3]");
	By T_And_A = By.xpath("(//span[text()='T&A'])[1]");
	By Merch_TandA = By.xpath("//a[text()='Merchandising T&A Data Entry']");
	By Month = By.xpath("//select[@formcontrolname='month']");
	By Select_Month = By.xpath("//option[@value='Nov/2023']");
	By Search_IPO = By.xpath("//input[@placeholder='Enter Buyer style # or IPO #']");
	By Buying_House = By.xpath("(//p[@class='mb-0 text-primary font-weight-bold'])[3]");
	By IPO_Qty = By.xpath("(//p[@class='mb-0 text-primary font-weight-bold'])[5]");
    By Add_Button = By.xpath("(//button[@class='btn btn-primary btn-sm float-right'])[1]");
 //   By Proto_comments = By.xpath("//p-inputmask[@formcontrolname='protoCommentsReceived']//input[@class='p-inputtext p-component p-element p-inputmask']");
    By Proto_comments = By.xpath("(//input[@class='p-inputtext p-component p-element p-inputmask'])[1]");
   
    By Fit_Submission1 = By.xpath("(//input[@placeholder='dd-mm'])[2]");
    By Fit_Approval1 = By.xpath("(//input[@placeholder='dd-mm'])[3]");
    By Fit1_Remarks = By.xpath("(//input[@placeholder='Please Enter Remarks'])[1]");

    By Fit_Submission2 = By.xpath("(//input[@placeholder='dd-mm'])[4]");
    By Fit_Approval2 = By.xpath("(//input[@placeholder='dd-mm'])[5]");
    By Fit2_Remarks = By.xpath("(//input[@placeholder='Please Enter Remarks'])[2]");

    By Fabric_Initialhouse = By.xpath("//input[@placeholder='Fabric Initial In House Date']");
    By View = By.xpath("(//button[@class='btn btn-primary'])[1]");
    By view_Close = By.xpath("(//button[@class='btn btn-danger'])[1]");
    By PP_Submission = By.xpath("(//input[@placeholder='dd-mm'])[6]");
    By PP_Approval = By.xpath("(//input[@placeholder='dd-mm'])[7]");
    By PP_Remarks = By.xpath("(//input[@placeholder='Please Enter Remarks'])[3]");
    
    By GPT1_Submission = By.xpath("(//input[@placeholder='dd-mm'])[8]");
    By GPT1_Approval = By.xpath("(//input[@placeholder='dd-mm'])[9]");
    By GPT1_Remarks = By.xpath("(//input[@placeholder='Please Enter Remarks'])[4]");
    By FPT1_Submission = By.xpath("(//input[@placeholder='dd-mm'])[10]");
    By FPT1_Approval = By.xpath("(//input[@placeholder='dd-mm'])[11]");
    By FPT1_Remarks = By.xpath("(//input[@placeholder='Please Enter Remarks'])[5]");
    
    By Photoshot1_Submssion = By.xpath("(//input[@placeholder='dd-mm'])[12]");
    By Photoshot1_Approval = By.xpath("(//input[@placeholder='dd-mm'])[13]");
    By Photoshot1_Remarks = By.xpath("(//input[@placeholder='Please Enter Remarks'])[6]");
    By Topsample1_Submission = By.xpath("(//input[@placeholder='dd-mm'])[14]");
    By Topsample1_Approval = By.xpath("(//input[@placeholder='dd-mm'])[15]");
    By Topsample1_Remarks = By.xpath("(//input[@placeholder='Please Enter Remarks'])[7]");
   
    By File_Handover = By.xpath("(//input[@placeholder='dd-mm'])[16]");
    By Filehandover_Remarks = By.xpath("(//input[@placeholder='Please Enter Remarks'])[8]");
   
    By Size_Set = By.xpath("(//input[@placeholder='dd-mm'])[17]");
    By Sizeset_Remarks = By.xpath("(//input[@placeholder='Please Enter Remarks'])[9]");
   
    By PPM_Date = By.xpath("(//input[@placeholder='dd-mm'])[18]");
    By PPM_Remarks = By.xpath("(//input[@placeholder='Please Enter Remarks'])[10]");
   
    By Bulk_Fabric = By.xpath("//input[@placeholder='Bulk Fabric']");
    By Bulk_View = By.xpath("(//button[@class='btn btn-primary'])[2]");
    By Bulk_Close = By.xpath("(//button[@class='btn btn-danger'])[2]");
    By PCD = By.xpath("(//input[@placeholder='dd-mm'])[20]");
    By Exfactory = By.xpath("//input[@class='p-inputtext p-component p-element p-inputmask form-control p-filled']");
    By DTP = By.xpath("//input[@formcontrolname='dtp']");
    By Cancel = By.xpath("(//button[text()=' Cancel'])[1]");
    By Save = By.xpath("(//button[@class='btn btn-md btn-primary px-5'])[1]");
    
    By Fit_Add = By.xpath("(//button[@class='btn btn-primary btn-sm'])[1]");
    By PP_Add = By.xpath("(//button[@class='btn btn-primary btn-sm'])[2]");    
    

	public void Click_on_the_Merchandising_T_and_A_Data_Entry_Screen() throws Throwable {
	
		
		utilities.webDriverWait(driver, Data_Entry);
		driver.findElement(Data_Entry).click();
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Merch_TandA);
		driver.findElement(Merch_TandA).click();		
		utilities.MinimumWait(driver);
		
	}
	
	public void Select_the_Month() throws Throwable {
		utilities.webDriverWait(driver, Month);
		driver.findElement(Month).click();
		utilities.webDriverWait(driver, Select_Month);
		driver.findElement(Select_Month).click();
		
	}
	public void Search_The_IPO_and_Style() throws Throwable {
		utilities.webDriverWait(driver, Search_IPO);
		driver.findElement(Search_IPO).sendKeys("Sty070901");
		Thread.sleep(5000);
		WebElement IPOname = driver.findElement(Search_IPO);
		String ipon = IPOname.getAttribute("value");
		System.out.println("Display the entered IPO Name " + ipon);
		
	}
	public void Verify_the_Buying_house_name_is_displaying_or_not() {
		WebElement Data = driver.findElement(Buying_House);
		String Buying = Data.getText();
		System.out.println("Display Buying house name: " +Buying);
		
	}
	public void Verify_the_IPO_Qty_Value_is_displaying_or_not() {
		WebElement Data = driver.findElement(IPO_Qty);
		String Qty = Data.getText();
		System.out.println("Display IPO Qty: " +Qty);	
		
	}
	public void Click_on_the_Add_button() throws Throwable {
		utilities.webDriverWait(driver, Add_Button);
		driver.findElement(Add_Button).click();
	}
	
	public void Enter_the_data_in_proto_commends_received_field() throws Throwable {
		utilities.webDriverWait(driver, Proto_comments);
//		driver.findElement(Proto_comments).click();
//		utilities.MinimumWait(driver);
		
//		driver.findElement(Proto_comments).clear();
//		utilities.MinimumWait(driver);
		
		driver.findElement(Proto_comments).sendKeys("1206");
		utilities.MinimumWait(driver);
    }

	
	public void Enter_the_data_in_Fit_submittion_field() throws Throwable {
      utilities.webDriverWait(driver, Fit_Submission1);
      driver.findElement(Fit_Submission1).click();
	  utilities.MinimumWait(driver);
      driver.findElement(Fit_Submission1).clear();
      utilities.MinimumWait(driver);
      driver.findElement(Fit_Submission1).sendKeys("1206");
	  utilities.MediumWait(driver);
	  
	  utilities.webDriverWait(driver, Fit_Approval1);
	  driver.findElement(Fit_Approval1).clear();
	  utilities.MinimumWait(driver);
      driver.findElement(Fit_Approval1).click();
	  utilities.MinimumWait(driver);
	  driver.findElement(Fit_Approval1).sendKeys("1312");
	  utilities.MediumWait(driver);

	 


	}
	public void Enter_the_data_in_Fit_submittion_and_Approval_fields() throws Throwable {
		  utilities.webDriverWait(driver, Fit_Submission2);
		  driver.findElement(Fit_Submission2).clear();
		  utilities.MinimumWait(driver);
		  driver.findElement(Fit_Submission2).click();
		  utilities.MinimumWait(driver);
		  driver.findElement(Fit_Submission2).sendKeys("1412");
		  utilities.MediumWait(driver);

		  utilities.webDriverWait(driver, Fit_Approval2);
	      driver.findElement(Fit_Approval2).clear();
	      utilities.MinimumWait(driver);
		  driver.findElement(Fit_Approval2).click();
		  utilities.MinimumWait(driver);
		  driver.findElement(Fit_Approval2).sendKeys("1512");
		  utilities.MediumWait(driver);
		
	}
	
	public void Enter_the_data_in_Fit_Remarks_Field() throws Throwable {
		
		utilities.webDriverWait(driver, Fit1_Remarks);
		driver.findElement(Fit1_Remarks).sendKeys("Submitting the First fit");
		utilities.MinimumWait(driver);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;  
	    js.executeScript("scrollBy(0, 500)");  
	    utilities.MaximumWait(driver);
	}

	public void Verify_whether_the_Fabric_Initial_In_House_date_is_prepopulated_in_the_field_or_not() {
		WebElement Data = driver.findElement(Fabric_Initialhouse);
		String FabricHouse = Data.getAttribute("value");
		System.out.println("Display Fabric Initial In house date : " + FabricHouse);
	}

	public void Click_on_the_Fabric_Initial_In_House_Date_View_button() throws Throwable {
	      utilities.webDriverWait(driver, View);
	      driver.findElement(View).click();

		
	}
	public void Click_on_the_Fabric_Initial_In_House_Date_View_Close_button() throws Throwable {
	      utilities.webDriverWait(driver, view_Close);
	      driver.findElement(view_Close).click();

		
	}
	public void Click_on_the_PP_Add_button() {

		
	}
	public void Enter_the_data_in_PP_Submission_and_Approval() throws Throwable {
		utilities.webDriverWait(driver, PP_Submission);
	      driver.findElement(PP_Submission).click();
		  utilities.MediumWait(driver);
		  driver.findElement(PP_Submission).sendKeys("1206");
		  utilities.MediumWait(driver);
		  utilities.webDriverWait(driver, PP_Approval);
	      driver.findElement(PP_Approval).click();
		  utilities.MinimumWait(driver);
		  driver.findElement(PP_Approval).sendKeys("1312");
		  utilities.MediumWait(driver);
		  driver.findElement(PP_Remarks).sendKeys("PPRemarks");
		  utilities.MediumWait(driver);

		
	}
	public void Click_on_the_Testing_GPT1_Add_button() {
		
		
	}
	public void Enter_the_data_in_Testing_GPT1_submission_and_Approval() throws Throwable {
		utilities.webDriverWait(driver, GPT1_Submission);
	      driver.findElement(GPT1_Submission).click();
		  utilities.MediumWait(driver);
		  driver.findElement(GPT1_Submission).sendKeys("1206");
		  utilities.MediumWait(driver);
		  utilities.webDriverWait(driver, GPT1_Approval);
	      driver.findElement(GPT1_Approval).click();
		  utilities.MinimumWait(driver);
		  driver.findElement(GPT1_Approval).sendKeys("1312");
		
		
	}
	public void Enter_the_data_in_GPT1_Remarks_Field() throws Throwable {
		  utilities.webDriverWait(driver, GPT1_Remarks);
		  driver.findElement(GPT1_Remarks).sendKeys("GPT1 Remarks");

		  JavascriptExecutor js = (JavascriptExecutor)driver;  
		    js.executeScript("scrollBy(0, 500)");  
		    utilities.MaximumWait(driver);
	}
	public void Click_on_the_Testing_GPT1_Delete_Icon() {

		
	}
	public void Enter_the_data_in_FPT1_Remarks_Field() throws Throwable {
		 utilities.webDriverWait(driver, FPT1_Remarks);
		  driver.findElement(FPT1_Remarks).sendKeys("FPT1 Remarks");

		
	}
	public void Click_on_the_Testing_FPT1_Add_button() {

		
	}
	public void Enter_the_data_in_Testing_FPT1_submission_and_Approval() throws Throwable {
		utilities.webDriverWait(driver, FPT1_Submission);
	      driver.findElement(FPT1_Submission).click();
		  utilities.MediumWait(driver);
		  driver.findElement(FPT1_Submission).sendKeys("1206");
		  utilities.MediumWait(driver);
		  utilities.webDriverWait(driver, FPT1_Approval);
	      driver.findElement(FPT1_Approval).click();
		  utilities.MinimumWait(driver);
		  driver.findElement(FPT1_Approval).sendKeys("1312");
		
		
		
	}
	public void Click_on_the_Testing_FPT1_Delete_Icon() {
		
	}
	public void Click_on_the_Testing_Photoshoot1_Add_button() {
		// TODO Auto-generated method stub
		
	}
	public void Enter_the_data_in_Testing_Photoshoot1_submission_and_Approval() throws Throwable {
		utilities.webDriverWait(driver, Photoshot1_Submssion);
	      driver.findElement(Photoshot1_Submssion).click();
		  utilities.MediumWait(driver);
		  driver.findElement(Photoshot1_Submssion).sendKeys("1206");
		  utilities.MediumWait(driver);
		  utilities.webDriverWait(driver, Photoshot1_Approval);
	      driver.findElement(Photoshot1_Approval).click();
		  utilities.MinimumWait(driver);
		  driver.findElement(Photoshot1_Approval).sendKeys("1312");
				
	}
	public void Enter_the_data_in_Photoshoot1_Remarks_Field() throws Throwable {
		 utilities.webDriverWait(driver, Photoshot1_Remarks);
		  driver.findElement(Photoshot1_Remarks).sendKeys("Photoshot1 Remarks");
		
	}
	public void Click_on_the_Testing_Photoshoot1_Delete_Icon() {   
		// TODO Auto-generated method stub
		
	}
	public void Click_on_the_TOP_Sample1_Add_button() {
		// TODO Auto-generated method stub
		
	}
	public void Enter_the_data_in_TOP_Sample1_submission_and_Approval() throws Throwable {
		utilities.webDriverWait(driver, Topsample1_Submission);
	      driver.findElement(Topsample1_Submission).click();
		  utilities.MediumWait(driver);
		  driver.findElement(Topsample1_Submission).sendKeys("1206");
		  utilities.MediumWait(driver);
		  utilities.webDriverWait(driver, Topsample1_Approval);
	      driver.findElement(Topsample1_Approval).click();
		  utilities.MinimumWait(driver);
		  driver.findElement(Topsample1_Approval).sendKeys("1312");
				
	}
	public void Enter_the_data_in_TOP_Sample1_Remarks_Field() throws Throwable {
		 utilities.webDriverWait(driver, Topsample1_Remarks);
		  driver.findElement(Topsample1_Remarks).sendKeys("Topsample1 Remarks");
		
	}
	public void Click_on_the_TOP_Sample1_Delete_Icon() {
		// TODO Auto-generated method stub
		
	}
	public void Select_the_value_in_File_Handover_field() {
		// TODO Auto-generated method stub
		
	}
	public void Enter_the_data_in_File_handover_date_field() throws Throwable {
		utilities.webDriverWait(driver, File_Handover);
	      driver.findElement(File_Handover).click();
		  utilities.MediumWait(driver);
		  driver.findElement(File_Handover).sendKeys("1206");		
	}
	public void Enter_the_data_in_File_handover_Remarks_field() throws Throwable {
		 utilities.webDriverWait(driver, Filehandover_Remarks);
		  driver.findElement(Filehandover_Remarks).sendKeys("Filehandover Remarks");
				
		  JavascriptExecutor js = (JavascriptExecutor)driver;  
		    js.executeScript("scrollBy(0, 500)");  
		    utilities.MaximumWait(driver);
	}
	public void Select_the_value_in_Size_set_field() {
		// TODO Auto-generated method stub
		
	}
	public void Enter_the_data_in_Size_set_date_field() throws Throwable {
		utilities.webDriverWait(driver, Size_Set);
	      driver.findElement(Size_Set).click();
		  utilities.MediumWait(driver);
		  driver.findElement(Size_Set).sendKeys("1206");				
	}
	public void Enter_the_data_in_Size_set_Remarks_field() throws Throwable {
		 utilities.webDriverWait(driver, Sizeset_Remarks);
		  driver.findElement(Sizeset_Remarks).sendKeys("Filehandover Remarks");
		
	}
	public void Select_the_value_in_PPM_field() {
		// TODO Auto-generated method stub
		
	}
	public void Enter_the_data_in_PPM_date_field() throws Throwable {
		utilities.webDriverWait(driver, PPM_Date);
	      driver.findElement(PPM_Date).click();
		  utilities.MediumWait(driver);
		  driver.findElement(PPM_Date).sendKeys("1206");				
		
	}
	public void Enter_the_data_in_PPM_Remarks_field() throws Throwable {
		 utilities.webDriverWait(driver, PPM_Remarks);
		  driver.findElement(PPM_Remarks).sendKeys("Filehandover Remarks");
				
	}
	public void Verify_whether_the_Bulk_Fabric_Flow_date_is_prepopulated_in_the_field_or_not() throws Throwable {
		WebElement Data = driver.findElement(Bulk_Fabric);
		String BulkFabric = Data.getAttribute("value");
		System.out.println("Display BulkFabric : " + BulkFabric);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;  
	    js.executeScript("scrollBy(0, 500)");  
	    utilities.MaximumWait(driver);
	}
	public void Click_on_the_Bulk_Fabric_Flow_View_button() throws Throwable {
	      utilities.webDriverWait(driver, Bulk_View);
	      driver.findElement(Bulk_View).click();
		
	}
	public void Click_on_the_Bulk_Fabric_Flow_View_Close_button() throws Throwable {
	      utilities.webDriverWait(driver, Bulk_Close);
	      driver.findElement(Bulk_Close).click();
		
	}
	public void Select_the_value_in_PCD_Field() {
		// TODO Auto-generated method stub
		
	}
	public void Enter_the_date_in_PCD_Field() throws Throwable {
		utilities.webDriverWait(driver, PCD);
	      driver.findElement(PCD).click();
		  utilities.MediumWait(driver);
		  driver.findElement(PCD).sendKeys("1206");				
		
	}
	public void Verify_the_Ex_factory_field_date_is_prepopulated_or_not() throws Throwable {
		WebElement Data = driver.findElement(Exfactory);
		String Exfactory = Data.getAttribute("value");
		System.out.println("Display Exfactory : " + Exfactory);
		utilities.MediumWait(driver);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;  
	    js.executeScript("scrollBy(0, 500)");  
	    utilities.MaximumWait(driver);
	}
	public void Verify_the_DTP_field_data_is_prepopulated_or_not() throws Throwable {
		WebElement Data = driver.findElement(DTP);
//		 driver.findElement(DTP).click();
		utilities.MediumWait(driver);
		
		String DTP = Data.getAttribute("value");
		utilities.MediumWait(driver);
		System.out.println("Display DTP : " + DTP);
		utilities.MaximumWait(driver);
		

		
	}
	public void Click_on_the_Save_button_in_T_and_A_Input() throws Throwable {
		utilities.MediumWait(driver);
	      utilities.webDriverWait(driver, Save);
	      driver.findElement(Save).click();
	
	}
	public void Click_on_the_Cancel_button_in_T_and_A_Input() throws Throwable {
	      utilities.webDriverWait(driver, Cancel);
	      driver.findElement(Cancel).click();
		
	}
	
	
	
}