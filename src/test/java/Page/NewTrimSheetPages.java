package Page;



import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.NoSuchElementException;

import org.apache.poi.ddf.EscherColorRef.SysIndexSource;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import util.DriverFactory;
import util.Utilities;

public class NewTrimSheetPages extends DriverFactory {
	
	Utilities utilities 		= new Utilities();
	RevisedMUWorkingPages RMUW 	= new RevisedMUWorkingPages();
	ViewFabricSheetPages VFS	= new ViewFabricSheetPages();
	
	
	By merDataEntry 		= By.xpath("(//span[text()='Data Entry'])[3]");
	By GenTrimSheet			= By.xpath("//span[text()='Generate Trim Sheet']");
	By scrNewTrimSheet		= By.xpath("//a[text()='New Trim Sheet']");
	By Buyer				= By.xpath("//p-multiselect[@optionlabel='buyerName']");
	By Buyername			= By.xpath("//input[@role='textbox']");
	By secBuyer				= By.xpath("(//li[contains(@class,'p-ripple p-element')])[1]");
	By Season				= By.xpath("//select[@formcontrolname='seasonId']");
	By IPO					= By.xpath("//input[@formcontrolname='searchText']");
	By secIPOML				= By.xpath("//a[@role='tab']");
	By buttAddTrimItem		= By.xpath("//a[contains(.,'Add New Trim Item')]");
	By navAddform			= By.xpath("//h3[text()='Add New Trim Sheet']");
	By dptrimowner			= By.xpath("//select[@formcontrolname='trimOwnerId']");
	By secTrimOwner			= By.xpath("//option[@class='ng-star-inserted']");
	By dpCategory			= By.xpath("//select[@formcontrolname='categoryId']");
	By secCategory			= By.xpath("//select[@formcontrolname='categoryId']/..//option[@class='ng-star-inserted']");
	By dpItem				= By.xpath("//select[@formcontrolname='itemId']");
	By secItem				= By.xpath("//select[@formcontrolname='itemId']/..//option[@class='ng-star-inserted']");
	By dpColor				= By.xpath("//select[@formcontrolname='colorId']");
	By secColor				= By.xpath("//select[@formcontrolname='colorId']/..//option[@class='ng-star-inserted']");
	By dpCombo				= By.xpath("//span[@class='ng-value-label ng-star-inserted']");
	By dp_Combo				= By.xpath("//ng-select[@formcontrolname='ipoTrimCombos']");
	By secCombo				= By.xpath("(//div[@role='option'])[1]");
	By selectCombo			= By.xpath("(//div[@class='ng-placeholder'])[1]");
	By dpTrimType			= By.xpath("//select[@formcontrolname='trimTypeId']");
	By Average				= By.xpath("//input[@formcontrolname='trimAverage']");
	By TltRequired			= By.xpath("//input[@formcontrolname='totalRequired']");
	By Waste				= By.xpath("//input[@formcontrolname='wastage']");
	By Total				= By.xpath("//input[@formcontrolname='total']");
	By navNewTrimSheet		= By.xpath("//h3[text()='New Trim Sheet']");
	By buttPartSave			= By.xpath("(//i[@class='ti-check'])[1]");
	By valmsgPartSave		= By.xpath("//h2[text()='New Trim Sheet Partially Updated Successfully']");
	By BulkDeadline			= By.xpath("//input[@formcontrolname='bulkTrimDeadline']");
	By TrimManager			= By.xpath("//select[@formcontrolname='trimManagerId']");
	By secTrimMgr			= By.xpath("//option[text()=' Pandurang D']");
	By ComSelectCombo		= By.xpath("//div[text()='Select Combo']");
	By Check_ComboDropdown 	= By.xpath("//div[@class='ng-select-container ng-has-value']//div[@class='ng-value-container']");
	By TotPOQty				= By.xpath("//span[text()='Total PO Quantity']");
	By Mandvalmsg			= By.xpath("//h2[text()='Mandatory Fields Are Required With  Valid Data.']");
	By buttSubmitTrimTeam	= By.xpath("//button[text()=' Submit to Trim Team']");
	By valmsgSuccessSubmit	= By.xpath("//h2[text()='New Trim Sheet Submited Successfully']");
	By infoIPO				= By.xpath("//small[text()='IPO #']/following-sibling::p");
	By infoBuyer			= By.xpath("//small[text()='Buyer']/following-sibling::p");
	By infoBuyerStyle		= By.xpath("//small[text()='Buyer Style #']/following-sibling::p");
	By infoPOQty			= By.xpath("//small[text()='PO QTY']/following-sibling::p");
	By infoIPOQty			= By.xpath("//small[text()='IPO QTY']/following-sibling::p");
	By infoDateSubmitted	= By.xpath("//small[text()='Date Submited']/following-sibling::p");
	By buttDelete1			= By.xpath("//button[@class='btn btn-sm btn-danger']");
	By buttDelete			= By.xpath("(//i[@class='ti-trash'])[1]");
	By DeletePopup			= By.xpath("//h2[text()='Are You Sure You Want To Delete?']");
	By optionNo				= By.xpath("(//button[text()='No'])[2]"); 
	By optionYes			= By.xpath("//button[text()='Yes']");
	By buttEdit				= By.xpath("//a[@title='Edit']");
	By navUpdateTrimform	= By.xpath("//h3[contains(@class,'f_s_25 f_w_700')]");
	By buttTrimCancel		= By.xpath("//a[text()=' Cancel']");
			
			
	public void Navigate_to_New_Trim_Sheet_screen() throws Throwable {
		utilities.webDriverWait(driver, RMUW.modWoven);
		driver.findElement(RMUW.modWoven).click();
		utilities.webDriverWait(driver, VFS.Merchandising);
		driver.findElement(VFS.Merchandising).click();
		utilities.webDriverWait(driver,merDataEntry);
		driver.findElement(merDataEntry).click();
		utilities.webDriverWait(driver,GenTrimSheet);
		driver.findElement(GenTrimSheet).click();
		utilities.webDriverWait(driver,scrNewTrimSheet);
		driver.findElement(scrNewTrimSheet).click();
	}
	
	public void Select_a_Buyer_in_the_filter_window(String BuyerName) throws Throwable {
		utilities.webDriverWait(driver, Buyer);
		driver.findElement(Buyer).click();
		utilities.webDriverWait(driver, Buyername);
		driver.findElement(Buyername).sendKeys(BuyerName);
		utilities.webDriverWait(driver, secBuyer);
		driver.findElement(secBuyer).click();
		
	}

	public void Select_a_Season_in_the_filter_window() throws Throwable {
		utilities.webDriverWait(driver, Season);
		driver.findElement(Season).click();
		Robot R = new Robot();
		R.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(500);
//		R.keyPress(KeyEvent.VK_DOWN);
//		Thread.sleep(500);
//		R.keyPress(KeyEvent.VK_DOWN);
//		Thread.sleep(500);
//		R.keyPress(KeyEvent.VK_DOWN);
//		Thread.sleep(500);
//		R.keyPress(KeyEvent.VK_DOWN);
//		Thread.sleep(500);
		R.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		
	}

	public void Enter_an_IPO_name_in_the_Search_by_IPO_field(String IPOname) throws Throwable {
		utilities.webDriverWait(driver, IPO);
		driver.findElement(IPO).sendKeys(IPOname);
	}

	public void Select_an_IPO() throws Throwable {
		utilities.webDriverWait(driver, secIPOML);
		driver.findElement(secIPOML).click();
	}

	public void Click_on_the_Add_New_Trim_Item_button() throws Throwable {
		utilities.webDriverWait(driver, buttAddTrimItem);
		driver.findElement(buttAddTrimItem).click();
	}

	public void Verify_whether_navigated_to_the_Add_New_Trim_Sheet_form() throws Throwable {
		utilities.webDriverWait(driver, navAddform);
		WebElement add = driver.findElement(navAddform);
		String Addform = add.getText();
		System.out.println("Navigated to : "+Addform);
		
	}


	public void Select_a_Team(String owner, String trimOwner) throws Throwable {
		utilities.webDriverWait(driver, dptrimowner);
		driver.findElement(dptrimowner).click();
		Thread.sleep(5000);
		List<WebElement> options = driver.findElements(secTrimOwner);
//		System.out.println(options);
		Thread.sleep(5000);
		for (WebElement option : options) {
	        if (option.getText().equals(owner)) {
	            option.click();
	            break;
	        }
	    }

	}

	public void Select_a_Category_in_the_Category_field(String category) throws Throwable {
		utilities.webDriverWait(driver, dpCategory);
		driver.findElement(dpCategory).click();
		Thread.sleep(5000);
		List<WebElement> options = driver.findElements(secCategory);
	    for (WebElement option : options) {
	        if (option.getText().equals(category)) {
	            option.click();
	            break;
	        }
	    }
	}

	public void Select_an_Item_in_the_Item_field(String item) throws Throwable {
		utilities.webDriverWait(driver, dpItem);
		driver.findElement(dpItem).click();
		Thread.sleep(5000);
		List<WebElement> options = driver.findElements(secItem);
	    for (WebElement option : options) {
	        if (option.getText().equals(item)) {
	            option.click();
	            break;
	        }
	    }
	}

	public void Select_a_Color_in_the_Color_field(String color) throws Throwable {
		utilities.webDriverWait(driver, dpColor);
		driver.findElement(dpColor).click();
		Thread.sleep(5000);
		List<WebElement> options = driver.findElements(secColor);
	    for (WebElement option : options) {
	        if (option.getText().equals(color)) {
	            option.click();
	            break;
	        }
	    }
	}

	public void Select_a_Combination_in_the_Combination_field() throws Throwable {
//		utilities.webDriverWait(driver, dpCombo);
		driver.findElement(dp_Combo).click();
//		WebElement com = driver.findElement(dpCombo);
		String combo = driver.findElement(dp_Combo).getText();
		System.out.println("Print the displayed combo name : "+combo);
//		utilities.webDriverWait(driver, secCombo);
//		driver.findElement(secCombo).click();
		utilities.webDriverWait(driver, selectCombo);
		String scombo = driver.findElement(selectCombo).getText();
		System.out.println(scombo);
		
//		driver.findElement(dpCombo).click();
//		Thread.sleep(1000);
		
		if (combo.equals(scombo))
		{
			System.out.println("Entered into if");
			driver.findElement(dp_Combo).click();
			utilities.webDriverWait(driver, secCombo);
			driver.findElement(secCombo).click();
			
//			
			Thread.sleep(1000);
//			utilities.webDriverWait(driver, dpCombo);
//			driver.findElement(dpCombo).isDisplayed();
//			String combo1 = driver.findElement(dpCombo).getText();
//			System.out.println("Print the combo name after selecting : "+combo1);
			
			
		}
		else {
			
//			String dpCombo = driver.findElement(By.xpath("//span[@class='ng-option-label ng-star-inserted']")).getText();
			System.out.println("Print the displayed combo name (else): "+combo);
		}
			
			
//			System.out.println("Entered into else ");
//			driver.findElement(dp_Combo).click();
//			utilities.webDriverWait(driver, secCombo);
//			driver.findElement(secCombo).click();
//			Thread.sleep(1000);
//			utilities.webDriverWait(driver, dpCombo);
//			driver.findElement(dpCombo).isDisplayed();
//			String combo1 = driver.findElement(dpCombo).getText();
//			System.out.println("Print the combo name after selecting : "+combo1);
//
//		}
//		
	}

	public void Select_Trim_Type() throws Throwable {
		utilities.webDriverWait(driver, dpTrimType);
		driver.findElement(dpTrimType).click();
		Robot R = new Robot();
		R.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(500);
		R.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		
	}

	public void Enter_Average(String avg) throws Throwable {
		utilities.webDriverWait(driver, Average);
		driver.findElement(Average).clear();
		driver.findElement(Average).sendKeys(avg);
	}

	public void Enter_Wastage(String wastage) throws Throwable {
		utilities.webDriverWait(driver, Waste);
		driver.findElement(Waste).clear();
		driver.findElement(Waste).sendKeys(wastage);
	}

	public void Print_the_Total_Required_value() throws Throwable {
//		utilities.webDriverWait(driver, TltRequired);
		WebElement TotReq = driver.findElement(TltRequired);
		String TotalReq = TotReq.getAttribute("value");
		System.out.println("Display the Total Required value : "+TotalReq);
	}

	public void Print_the_Total_value() throws Throwable {
//		utilities.webDriverWait(driver, Total);
		WebElement Tlt = driver.findElement(Total);
		String Total = Tlt.getAttribute("value");
		System.out.println("Display the Total value after adding wastage : "+Total);
	}

	

	public void Verify_whether_the_page_is_navigated_to_the_New_Trim_Sheet() throws Throwable {
		utilities.webDriverWait(driver, navNewTrimSheet);
		WebElement Trim = driver.findElement(navNewTrimSheet);
		String NewTrim = Trim.getText();
		System.out.println("Navigated to : "+NewTrim);
	}

	public void Click_on_the_Partial_Save_button() throws Throwable {
		utilities.webDriverWait(driver, buttPartSave);
		driver.findElement(buttPartSave).click();
	}

	public void Verify_the_partial_save_msg() throws Throwable {
//		utilities.webDriverWait(driver, valmsgPartSave);
		WebElement partial = driver.findElement(valmsgPartSave);
		String partialmsg = partial.getText();
		System.out.println("Display the Partial Save msg  : "+partialmsg);
	}

	public void Enter_Bulk_Trim_Deadline(String bulkTrimDeadline) throws Throwable {
		utilities.webDriverWait(driver, BulkDeadline);
		driver.findElement(BulkDeadline).clear();
		driver.findElement(BulkDeadline).sendKeys(bulkTrimDeadline);
	}

	public void Select_Trim_Manager() throws Throwable {
		utilities.webDriverWait(driver, TrimManager);
		WebElement TM = driver.findElement(TrimManager);
		utilities.webDriverWait(driver, secTrimMgr);
		driver.findElement(secTrimMgr).click();
	}

	public void Verify_and_print_the_Mandatory_validation_msg() throws Throwable {
//		utilities.webDriverWait(driver, Mandvalmsg);
		String Mandatory = driver.findElement(Mandvalmsg).getText();
		System.out.println("Print the Mandatory validation msg : '"+Mandatory+"'");
		
	}

	public void Click_on_the_Submit_to_Trim_Team_button() throws Throwable {
		utilities.webDriverWait(driver, buttSubmitTrimTeam);
		driver.findElement(buttSubmitTrimTeam).click();
	}

	public void Verify_and_print_the_Successful_submit_msg() {
		String SucccessSubmit = driver.findElement(valmsgSuccessSubmit).getText();
		System.out.println("Print the Successful Submitted msg : '"+SucccessSubmit+"'");
	}

	public void Verify_and_Print_the_IPO_name() throws Throwable {
		utilities.webDriverWait(driver, infoIPO);
		String IPOname = driver.findElement(infoIPO).getText();
		System.out.println("Print the IPO Name : '"+IPOname+"'");
	}

	public void Verify_and_Print_the_Buyer_name() throws Throwable {
		utilities.webDriverWait(driver, infoBuyer);
		String Buyer = driver.findElement(infoBuyer).getText();
		System.out.println("Print the Buyer Name : '"+Buyer+"'");
	}

	public void Verify_and_Print_the_Buyer_Style_name() throws Throwable {
		utilities.webDriverWait(driver, infoBuyerStyle);
		String BuyerStyle = driver.findElement(infoBuyerStyle).getText();
		System.out.println("Print the Buyer Style Name : '"+BuyerStyle+"'");
	}

	public void Verify_and_Print_the_PO_Qty() throws Throwable {
		utilities.webDriverWait(driver, infoPOQty);
		String POQty = driver.findElement(infoPOQty).getText();
		System.out.println("Print the PO Qty value : '"+POQty+"'");
	}

	public void Verify_and_Print_the_IPO_Qty() throws Throwable {
		utilities.webDriverWait(driver, infoIPOQty);
		String IPOQty = driver.findElement(infoIPOQty).getText();
		System.out.println("Print the IPO Qty value  : '"+IPOQty+"'");
	}

	public void Verify_and_Print_the_Date_Submitted() throws Throwable {
		utilities.webDriverWait(driver, infoDateSubmitted);
		String DateSubmitted = driver.findElement(infoDateSubmitted).getText();
		System.out.println("Print the Date Submitted date : '"+DateSubmitted+"'");
	}

	public void Click_on_the_Delete_button_for_an_added_record() throws Throwable {
		utilities.webDriverWait(driver, buttDelete);
		driver.findElement(buttDelete).click();
	}

	public void Verify_the_delete_popup_window_and_print() throws Throwable {
		utilities.webDriverWait(driver, DeletePopup);
		String popupmsg = driver.findElement(DeletePopup).getText();
		System.out.println("Display the pop-up msg: '"+popupmsg+"'");
	}

	public void Click_on_No_option() throws Throwable {
		utilities.webDriverWait(driver, optionNo);
		driver.findElement(optionNo).click();
		System.out.println("Click on No option in the delete pop-up window");
		System.out.println("The respective record has not been deleted");
	}

	public void Click_on_Yes_option() throws Throwable {
		utilities.webDriverWait(driver, optionYes);
		driver.findElement(optionYes).click();
		System.out.println("Click on Yes option in the delete pop-up window");
		System.out.println("Sucessfully deleted the added Trim record");
	}

	public void Click_on_the_Edit_button_for_the_added_trim_record() throws Throwable {
		utilities.webDriverWait(driver, buttEdit);
		driver.findElement(buttEdit).click();
	}

	public void Verify_whether_navigated_to_Update_Trim_Sheet_form() throws Throwable {
		utilities.webDriverWait(driver, navUpdateTrimform);
		String updateform = driver.findElement(navUpdateTrimform).getText();
		System.out.println("On editing Navigated to : '"+updateform+"'");
		String Expectedformname = "Update New Trim Sheet";
		if (updateform.equals(Expectedformname))
		{
			System.out.println("Displayed the correct form name : '"+Expectedformname+"'");
		}else {
			System.out.println("Displayed the incorrect form name and should display : '"+Expectedformname+"'");
		}
	}

	public void Edit_the_Color_field(String ecolor) throws Throwable {
		utilities.webDriverWait(driver, dpColor);
		driver.findElement(dpColor).click();
		Thread.sleep(5000);
		List<WebElement> options = driver.findElements(secColor);
	    for (WebElement option : options) {
	        if (option.getText().equals(ecolor)) {
	            option.click();
	            break;
	        }
	    }
	}

	public void Click_on_Cancel_button_in_Trim_Sheet() throws Throwable {
		utilities.webDriverWait(driver, buttTrimCancel);
		driver.findElement(buttTrimCancel).click();
	}
	

}
