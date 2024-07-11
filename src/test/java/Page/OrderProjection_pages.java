package Page;

import util.Utilities;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import util.DriverFactory;

public class OrderProjection_pages extends DriverFactory {
	
	Utilities utilities = new Utilities(); 
	RevisedMUWorkingPages RMUW = new RevisedMUWorkingPages();
	Stylepage SM = new Stylepage();
	
	String TotCosCurr;
	String TotCosINR;
	String UpdatedexpOrderQty;
	String expOrderQty;
	
	By modPD = By.xpath("//span[text()='PD ']");
	By pdDataEntry = By.xpath("(//span[text()='Data Entry'])[1]");
	By scrOrderProjection = By.xpath("(//a[contains(text(),'Order Projection')])[1]");
	By buttAdd = By.xpath("//button[@class='btn btn-primary btn-sm shadow-sm float-right ng-star-inserted']");
	By navCreateOP = By.xpath("//h3[text()='Create Order Projection ']");
	By buttCancel = By.xpath("(//button[text()=' Cancel'])[1]");
	By buttSave = By.xpath("(//button[text()=' Save'])[1]");
	By navOP = By.xpath("//h3[text()='Order Projection']");
	By valmsgMandatory = By.xpath("//h2[text()='Mandatory Fields Are Required With  Valid Data.']");
	By PDname = By.xpath("//input[@placeholder='Search By Name/Email/Ph.no']");
	By secPDname = By.name("//ul[@role='listbox']//li[1]");
	By Buyer = By.xpath("//select[@formcontrolname='buyerId']");
	By secBuyer = By.xpath("//option[@value='2']");
	By MthYear = By.xpath("//input[@placeholder='Select Month']");
	By  secMthYear = By.xpath("(//span[contains(@class,'p-ripple p-element')])[1]");
	By ExpOrderQty = By.xpath("//input[@formcontrolname='expectedOrderQty']");
	By tdExpOrderQty = By.xpath("(//td[@class='ng-star-inserted']/following-sibling::td)[3]");
	By Cost = By.xpath("//input[@formcontrolname='perPcValue']");
	By ExchangeRate = By.xpath("//input[@formcontrolname='exchangeRate']");
	By TotalCostINR = By.xpath("//input[@formcontrolname='totalCost']");
	By TotalCostCurrency = By.xpath("//input[@formcontrolname='totalCostInCurrency']");
	By valmsgSuccess = By.xpath("//h2[text()='Order Targets Info Saved Successfully']");
	By buttEdit = By.xpath("(//a[@title='Edit'])[1]");
	By navUpdateOP = By.xpath("//h3[text()='Update Order Projection ']");
	By buttUpdate = By.xpath("//button[@type='submit']//i[1]");
	By valmsgUpdatesuccess = By.xpath("//h2[text()='Order Targets Info Updated Successfully']");
	By buttDelete = By.xpath("(//button[@title='Delete'])[2]");
	By msgDelete = By.xpath("//h2[text()='Are You Sure You Want To Delete?']");
	By msgDelNo = By.xpath("(//button[text()='No'])[2]");
	By msgDelYes = By.xpath("//button[text()='Yes']");
//	By valmsgDeletemsg = By.xpath("//h2[text()='PD Order Deleted Successfully']");
	By valmsgDeletemsg = By.xpath("//div[contains(@class,'swal2-popup swal2-toast')]//h2[1]");
	
	
	

	public void Login_with_the_Senior_PD_Merchant() throws Throwable {
		driver.findElement(RMUW.txtUN).clear();
		driver.findElement(RMUW.txtUN).sendKeys("Phanindra");
		driver.findElement(RMUW.txtPwd).clear();
		driver.findElement(RMUW.txtPwd).sendKeys("Abcd@123");
	}



	public void Navigate_to_the_Order_Projection_screen() throws Throwable {
		utilities.webDriverWait(driver, RMUW.modWoven);
		driver.findElement(RMUW.modWoven).click();
		utilities.webDriverWait(driver, modPD);
		driver.findElement(modPD).click();
		utilities.webDriverWait(driver, pdDataEntry);
		driver.findElement(pdDataEntry).click();
		utilities.webDriverWait(driver, scrOrderProjection);
		driver.findElement(scrOrderProjection).click();
	}

	public void Click_on_the_Add_button_in_the_Order_Projection_screen() throws Throwable {
		utilities.webDriverWait(driver, buttAdd);
		driver.findElement(buttAdd).click();
	}

	public void Verify_whether_page_is_navigated_to_the_Create_Order_Projection_form() throws Throwable {
		utilities.webDriverWait(driver, navCreateOP);
		driver.findElement(navCreateOP).isDisplayed();
		WebElement Create = driver.findElement(navCreateOP);
		String CreateOP = Create.getText();
		System.out.println("Page is navigated to : " + CreateOP);
	}



	public void Click_on_the_Cancel_button_in_the_Create_Order_Projection_form() throws Throwable {
		utilities.webDriverWait(driver, buttCancel);
		driver.findElement(buttCancel).click();
	}



	public void Verify_whether_the_page_is_navigated_to_the_Order_Projection_screen() throws Throwable {
		utilities.webDriverWait(driver, navOP);
		driver.findElement(navOP).isDisplayed();
		WebElement Order = driver.findElement(navOP);
		String OrderProjection = Order.getText();
		System.out.println("Page is navigated to : " + OrderProjection);
	}



	public void Click_on_Save_button_in_the_Create_Order_Projection_form() throws Throwable {
		utilities.webDriverWait(driver, buttSave);
		driver.findElement(buttSave).click();
	}

	public void Verify_the_Mandatory_validation_msg() throws Throwable {
//		utilities.webDriverWait(driver, valmsgMandatory);
		driver.findElement(valmsgMandatory).isDisplayed();
		WebElement manda = driver.findElement(valmsgMandatory);
		String mandatory = manda.getText();
		System.out.println("Display the prompted Mandatory msg : " + mandatory);
	}

	public void Enter_the_first_2_letters_of_the_Senior_PD_Merchant_name() throws Throwable {
		utilities.webDriverWait(driver, PDname);
		driver.findElement(PDname).sendKeys("ra");
		utilities.MinimumWait(driver);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
	}

//	public void Select_the_PD_merchant_from_the_dropdown_list() throws Throwable {
//		utilities.webDriverWait(driver, secPDname);
//		driver.findElement(secPDname).click();
//	}



	public void Click_in_the_Buyer_field() throws Throwable {
		utilities.webDriverWait(driver, Buyer);
		driver.findElement(Buyer).click();
	}



	public void Select_a_value_from_the_dropdown_list() throws Throwable {
		utilities.webDriverWait(driver, secBuyer);
		driver.findElement(secBuyer).click();
	}



	public void Click_in_the_Month_Year_field() throws Throwable {
		utilities.webDriverWait(driver, MthYear);
		driver.findElement(MthYear).click();
	}



	public void Select_a_value_from_the_calendar() throws Throwable {
		utilities.webDriverWait(driver, secMthYear);
		driver.findElement(secMthYear).click();
	}



	public void Enter_Expected_Order_Qty_value() throws Throwable {
		utilities.webDriverWait(driver, ExpOrderQty);
		driver.findElement(ExpOrderQty).sendKeys("3500");
	}



	public void Enter_Appr_Per_Pcs_Cost_value() throws Throwable {
		utilities.webDriverWait(driver, Cost);
		driver.findElement(Cost).sendKeys("35");
	}



	public void Enter_Exchange_Rate_value() throws Throwable {
		utilities.webDriverWait(driver, ExchangeRate);
		driver.findElement(ExchangeRate).sendKeys("53");
	}



	public void Print_Total_Cost_In_INR_field_value() throws Throwable {
//		utilities.webDriverWait(driver, TotalCostINR);
		driver.findElement(TotalCostINR).isDisplayed();
		WebElement TotCos = driver.findElement(TotalCostINR);
		TotCosINR = TotCos.getAttribute("value");
		System.out.println("Display the Total Cost In INR calculated value : " + TotCosINR);

	}



	public void Print_Total_Cost_In_Currency_value() throws Throwable {
//		utilities.webDriverWait(driver, TotalCostCurrency);
		driver.findElement(TotalCostCurrency).isDisplayed();
		WebElement TotCos = driver.findElement(TotalCostCurrency);
		TotCosCurr = TotCos.getAttribute("value");
		System.out.println("Display the Total Cost In Currency calculated value : " + TotCosCurr);
	}



	public void Click_on_the_Save_button_in_the_Create_Order_Projection_form() throws Throwable {
		utilities.webDriverWait(driver, buttSave);
		driver.findElement(buttSave).click();
	}



	public void Verify_the_Successful_toaster_msg_and_print() throws Throwable {
//		utilities.webDriverWait(driver, valmsgSuccess);
		driver.findElement(valmsgSuccess).isDisplayed();
		WebElement Success = driver.findElement(valmsgSuccess);
		String Successmsg = Success.getText();
		System.out.println("Display the Sucessful msg: " + Successmsg);
	}



	public void Click_on_the_Edit_button_for_a_record_in_the_Order_Projection_screen() throws Throwable {
		utilities.webDriverWait(driver, buttEdit);
		driver.findElement(buttEdit).click();
	}



	public void Verify_whether_page_is_navigated_to_the_Update_Order_Projection_form() throws Throwable {
		utilities.webDriverWait(driver, navUpdateOP);
		driver.findElement(navUpdateOP).isDisplayed();
		WebElement Update = driver.findElement(navUpdateOP);
		String UpdateOP = Update.getText();
		System.out.println("Page is navigated to : " + UpdateOP);
	}



	public void Verify_whether_all_the_values_are_displayed_in_the_respective_fields() throws Throwable {
		utilities.webDriverWait(driver, PDname);
		driver.findElement(PDname).isDisplayed();
		WebElement pd = driver.findElement(PDname);
		String pdname = pd.getAttribute("value");
		System.out.println("Print the selected PD Merchant Name : " + pdname );
		
		utilities.webDriverWait(driver, Buyer);
		driver.findElement(Buyer).isDisplayed();
		WebElement buyer = driver.findElement(Buyer);
		String pbuyername = buyer.getAttribute("buyer");
		System.out.println("Print the selected Buyer Name : " + pbuyername );
		
		utilities.webDriverWait(driver, MthYear);
		driver.findElement(MthYear).isDisplayed();
		WebElement mth = driver.findElement(MthYear);
		String mthyear = mth.getAttribute("value");
		System.out.println("Print the selected Month & Year : " + mthyear );
		
		utilities.webDriverWait(driver, ExpOrderQty);
		driver.findElement(ExpOrderQty).isDisplayed();
		WebElement expQty = driver.findElement(ExpOrderQty);
		expOrderQty = expQty.getAttribute("value");
		System.out.println("Print the Expected Order Qty value : " + expOrderQty  );
		
		utilities.webDriverWait(driver, Cost);
		driver.findElement(Cost).isDisplayed();
		WebElement perpcs = driver.findElement(Cost);
		String perpcsCost = perpcs.getAttribute("value");
		System.out.println("Print the entered Per Pcs Cost value : " + perpcsCost );
		
		utilities.webDriverWait(driver, ExchangeRate);
		driver.findElement(ExchangeRate).isDisplayed();
		WebElement exchange = driver.findElement(ExchangeRate);
		String exchangeRate = exchange.getAttribute("value");
		System.out.println("Print the entered Exchange Rate value : " + exchangeRate );
		
		System.out.println("Display the Total Cost In INR calculated value : " + TotCosINR);
		System.out.println("Display the Total Cost In Currency calculated value : " + TotCosCurr);
	}
	



	public void Update_the_Expected_Order_Qty_value() throws Throwable {
		utilities.webDriverWait(driver, ExpOrderQty);
		driver.findElement(ExpOrderQty).clear();
		driver.findElement(ExpOrderQty).sendKeys("5000");
		WebElement updatexp = driver.findElement(ExpOrderQty);
		UpdatedexpOrderQty = updatexp.getAttribute("value");
		System.out.println("Print the updated Expected Order Qty value : " +UpdatedexpOrderQty);

	}



	public void Click_on_the_Save_button_in_the_Update_Order_Projection_form() throws Throwable {
		utilities.webDriverWait(driver, buttUpdate);
		driver.findElement(buttUpdate).click();
	}



	public void Verify_the_Update_Successful_toaster_msg() throws Throwable {
		utilities.webDriverWait(driver, valmsgUpdatesuccess);
		driver.findElement(valmsgUpdatesuccess).isDisplayed();
		WebElement update = driver.findElement(valmsgUpdatesuccess);
		String updatemsg = update.getText();
		System.out.println("Display the Updated Sucessful msg: " + updatemsg );
	}



	public void Click_on_the_Delete_button_for_a_record_in_the_Order_Projection_screen() throws Throwable {
		utilities.webDriverWait(driver, buttDelete);
		driver.findElement(buttDelete).click();
	}



	public void Verify_whether_the_Delete_popup_window_is_displayed() throws Throwable {
		utilities.webDriverWait(driver, msgDelete);
		driver.findElement(msgDelete).isDisplayed();
		WebElement delete = driver.findElement(msgDelete);
		String updatemsg = delete.getText();
		System.out.println("Print the Delete msg: " + updatemsg );
	}



	public void Verify_whether_the_Delete_button_status() throws Throwable {
		utilities.MinimumWait(driver);
		utilities.webDriverWait(driver,buttDelete);
		WebElement Delete = driver.findElement(buttDelete); 
		if (Delete.isEnabled()) {
            System.out.println("The Delete button is in enabled state.");
        } else {
            System.out.println("The Delete button is in disabled state.");
        }
	}



	public void Print_the_Succesful_Delete_message() throws Throwable {
		utilities.webDriverWait(driver, valmsgDeletemsg);
		driver.findElement(valmsgDeletemsg).isDisplayed();
		WebElement delete = driver.findElement(valmsgDeletemsg);
		String updatemsg = delete.getText();
		System.out.println("Display the Delete Sucessful msg: " + updatemsg );
	}



	public void Click_on_the_Yes_option_in_the_Delete_msg() throws Throwable {
		utilities.webDriverWait(driver, msgDelYes);
		driver.findElement(msgDelYes).click();
	}



	public void Verify_whether_the_Exp_Order_Qty_value_is_updated_in_the_grid_for_the_respective_record() {
		if(!expOrderQty.equals(UpdatedexpOrderQty)) {
			System.out.println("Qty has been updated to : " +UpdatedexpOrderQty);
		}else {
			System.out.println("Qty has not updated : " +UpdatedexpOrderQty);
		}
			
	}
	


	
	
	

}
