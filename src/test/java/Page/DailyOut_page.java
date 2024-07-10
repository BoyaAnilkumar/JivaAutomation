package Page;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import util.DriverFactory;
import util.Utilities;
import java.util.Date;
import java.util.List;


public class DailyOut_page extends DriverFactory {
	
	Utilities utilities = new Utilities(); 
	RevisedMUWorkingPages RMUW = new RevisedMUWorkingPages();
	DailyInInputpages DIIP = new DailyInInputpages();
//	public Robot; 
//	Robot R = new Robot();
	Date currentDate = new Date();
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy");
    String formattedDate = dateFormat.format(currentDate);
         
	
	String AddDOform, DOscreen, ManValmsg, InHousedate, supplier, ToLoc, AppIPO, FabName, color;
	String proName, content, CountConst, gsmvalue, cuttWdth, uomunit, ratevalue, FromLoc, nthaan, quantity, savemsg;
	String updateDO, updatemsg, Udate, challno, poNo, deletemsg, approvedmsg, mandatory, Approvedmsg; 
	String DailyOutChallan, SuppAddress, FacAddress, ThaanQty;
	
	By modDailyInOut	= By.xpath("(//span[text()='Daily In & Out'])[1]");
	By scrDailyOut		= By.xpath("//a[text()='Daily Out Data Entry']");
	By navAddDailyOut 	= By.xpath("//h3[text()='Add Daily Out Data Entry']");
	By navDailyOut 		= By.xpath("//h3[text()='Daily Out Data Entry']"); 
	By masgMandatory	= By.xpath("//h2[text()='Mandatory Fields Are Required With  Valid Data.']");
	By buttCancel		= By.xpath("(//button[text()=' Cancel'])[1]");
	By buttSave			= By.xpath("(//button[text()=' Save'])[1]");
	By msgSave			= By.xpath("//h2[text()='Daily Out Input Saved SuccessFully']");
	By Date				= By.xpath("//input[@formcontrolname='date']");
	By Challanno		= By.xpath("//input[@formcontrolname='challanNo']");
	By Partyname		= By.xpath("//select[@formcontrolname='partyName']");
	By POno				= By.xpath("//input[@placeholder='Search PO / Debit Code']");
	By Supplier			= By.xpath("//select[@formcontrolname='supplier']");
	By AppicableIPO		= By.xpath("//p-multiselect[@formcontrolname='applicableIpo']");
	By ApplicableIPO	= By.xpath("```````````````````````````````````");
	By FabricName		= By.xpath("(//ng-select[@bindvalue='fabricId'])[1]");
	By Color			= By.xpath("//ng-select[@formcontrolname='color']");
	By Processname		= By.xpath("//select[@formcontrolname='processName']");
	By secAppliIPO		= By.xpath("//span[text()='IPO8']");
	By Content			= By.xpath("//input[@formcontrolname='content']");
	By CountCons		= By.xpath("//input[@formcontrolname='count']");
	By GSM				= By.xpath("//input[@formcontrolname='gsm']");
	By CuttableWdth		= By.xpath("//input[@formcontrolname='cuttableWidth']");
	By NoThaans			= By.xpath("//input[@formcontrolname='thans']");
	By Qty				= By.xpath("//input[@formcontrolname='quantity']");
	By UOM				= By.xpath("//select[@formcontrolname='uom']");
	By Rate				= By.xpath("//input[@formcontrolname='rate']");
	By FromLocation		= By.xpath("//select[@formcontrolname='fromLocation']");
	By ToLocation		= By.xpath("//select[@formcontrolname='toLocation']");
	By Remarks			= By.xpath("//textarea[@formcontrolname='remarks']");
	By Thaanwise		= By.xpath("(//div[@class='col-xl-12 col-12'])[1]");
	By secCompThaan		= By.xpath("(//input[@formcontrolname='isCompleteThan'])[1]");
	By secCompThaan3	= By.xpath("(//input[@formcontrolname='isCompleteThan'])[3]");
	By buttDOEdit		= By.xpath("(//button[@title='Edit Daily Out'])[1]");
	By navUpdateDailyOut= By.xpath("//h3[text()='Update Daily Out Data Entry']");
	By buttAddThaanInfor= By.xpath("(//button[text()=' Add'])[2]");
	By CustomQty		= By.xpath("(//input[@formcontrolname='qty'])[3]");
	By buttUpdate		= By.xpath("//button[text()=' Update']");
	By msgUpdate		= By.xpath("//h2[text()='Daily Out Input Updated SuccessFully']");
	By buttDeleteThaan	= By.xpath("//button[@title='Delete']");
	By buttDelete		= By.xpath("(//button[@title='Delete'])[1]");
	By msgDelete		= By.xpath("//h2[text()='Daily Out Data Deleted Sucessfully']");
	By buttApprove		= By.xpath("(//a[@title='Daily Out Approved'])[1]");
	By msgApprove		= By.xpath("(//div[@role='dialog'])[2]");
	By NooptionAppmsg	= By.xpath("(//button[text()='No'])[2]");
	By YesoptionAppmsg	= By.xpath("//button[text()='Yes']");
	By winGateEntry		= By.xpath("//div[@id='dailyoutgateEntryNumber']/div[1]/div[1]");
	By GateEntryNo		= By.xpath("//input[@placeholder='Enter Gate Entry Number']");
	By buttGEClose		= By.xpath("//button[text()='Close']");
	By buttGESave		= By.xpath("//button[text()='Save']");
	By msgApproved		= By.xpath("//h2[text()='Daily Out Approved Successfully']");
	By buttPrint		= By.xpath("(//button[@title='Daily Out Challan']//i)[4]");
	By prtForm			= By.xpath("//img[@alt='Logo Icon']");
	By disprthead		= By.xpath("//td[@class='text-right p-2']");
	By disprtSupplier	= By.xpath("//td[@class='ng-star-inserted']");
	By disprtFactory	= By.xpath("//td[@class='text-right']");
	By disprtThaanQty	= By.xpath("//table[@class='p-datatable-table ng-star-inserted']");
	By buttprtCancel 	= By.xpath("//button[text()=' Cancel']");
	By gridThaanwiseInfo= By.xpath("//div[@class='col-12 mx-0']/following-sibling::div[1]");
	

	public void Navigate_to_the_Daily_Out_Data_Entry_screen() throws Throwable {
		utilities.webDriverWait(driver, RMUW.modWoven);
		driver.findElement(RMUW.modWoven).click();
		utilities.webDriverWait(driver, DIIP.Fabric_Store);
		driver.findElement(DIIP.Fabric_Store).click();
		utilities.webDriverWait(driver, DIIP.Data_Entry);
		driver.findElement(DIIP.Data_Entry).click();
		utilities.webDriverWait(driver, modDailyInOut);
		driver.findElement(modDailyInOut).click();
		utilities.webDriverWait(driver, scrDailyOut);
		driver.findElement(scrDailyOut).click();

	}

	public void Verify_whether_the_page_is_navigated_to_the_Add_Daily_Out_Data_Entry_form() throws Throwable {
		utilities.webDriverWait(driver, navAddDailyOut);
		WebElement Add = driver.findElement(navAddDailyOut);
		AddDOform = Add.getText();
		System.out.println("Display the form name :" +AddDOform);
	}

	public void Verify_whether_the_page_is_navigated_to_the_Daily_Out_Data_Entry_screen() throws Throwable {
		utilities.webDriverWait(driver, navDailyOut);
		WebElement Daily = driver.findElement(navDailyOut);
		DOscreen = Daily.getText();
		System.out.println("Display the screen name :" +DOscreen);

	}

	public void Verify_and_print_the_mandatory_validation_msg() throws Throwable {
//		utilities.webDriverWait(driver, masgMandatory);
		WebElement mandatory = driver.findElement(masgMandatory);
		ManValmsg = mandatory.getText();
		System.out.println("Display the Mandatory msg :" + ManValmsg);
	}

	public void Click_on_Cancel_button_in_Add_form() throws Throwable {
		utilities.webDriverWait(driver, buttCancel);
		driver.findElement(buttCancel).click();
	}

	public void Click_on_the_Save_button_in_the_Add_form() throws Throwable {
		utilities.webDriverWait(driver, buttSave);
		driver.findElement(buttSave).click();
	}

	public void Enter_the_data_in_all_the_field_in_the_Add_Daily_Out_form() throws Throwable {
				
		
		
		utilities.webDriverWait(driver, Partyname);
		driver.findElement(Partyname).click();
		Robot R = new Robot();
		R.keyPress(KeyEvent.VK_4);
		Thread.sleep(5000);
		
		utilities.webDriverWait(driver, POno);
		driver.findElement(POno).sendKeys("J-");
//		Robot R = new Robot();
		R.keyPress(KeyEvent.VK_4);
		Thread.sleep(5000);
		
		utilities.webDriverWait(driver, Supplier);
		WebElement Supp = driver.findElement(Supplier);
		supplier = Supp.getAttribute("value");
		System.out.println("Print the Supplier Name :" +supplier);
		
		utilities.webDriverWait(driver, ToLocation);
		WebElement To = driver.findElement(ToLocation);
		ToLoc = To.getAttribute("value");
		System.out.println("Print the To Location :" +ToLoc);
		
		utilities.webDriverWait(driver, AppicableIPO);
		WebElement IPO = driver.findElement(AppicableIPO);
		AppIPO = IPO.getAttribute("value");
		System.out.println("Print the displayed ApplicableIPO :" +AppIPO);
		
		utilities.webDriverWait(driver, FabricName);
		WebElement Fab = driver.findElement(FabricName);
		FabName = Fab.getAttribute("value");
		System.out.println("Print the displayed Fabric Name :" +FabName);
		
		utilities.webDriverWait(driver, Color);
		WebElement colour = driver.findElement(Color);
		color = colour.getAttribute("value");
		System.out.println("Print the displayed Color :" +color);
		
		utilities.webDriverWait(driver, Processname);
		WebElement Proname = driver.findElement(Processname);
		proName = Proname.getAttribute("value");
		System.out.println("Print the displayed Process Name :" +proName);
		
		utilities.webDriverWait(driver, Content);
		WebElement cont = driver.findElement(Content);
		content = cont.getAttribute("value");
		System.out.println("Print the displayed Content value :" +content);
		
		utilities.webDriverWait(driver, CountCons);
		WebElement cnt = driver.findElement(CountCons);
		CountConst = cnt.getAttribute("value");
		System.out.println("Print the displayed Count Construction value :" +CountConst);
		
		utilities.webDriverWait(driver, GSM);
		WebElement gsm = driver.findElement(GSM);
		gsmvalue = gsm.getAttribute("value");
		System.out.println("Print the displayed GSM value :" +gsmvalue);
		
		utilities.webDriverWait(driver, CuttableWdth);
		WebElement CW = driver.findElement(CuttableWdth);
		cuttWdth = CW.getAttribute("value");
		System.out.println("Print the displayed Cuttable Width value :" +cuttWdth);
		
		utilities.webDriverWait(driver, UOM);
		WebElement uom = driver.findElement(UOM);
		uomunit = uom.getAttribute("value");
		System.out.println("Print the displayed UOM unit value :" +uomunit);
		
		utilities.webDriverWait(driver, Rate);
		WebElement rate = driver.findElement(Rate);
		ratevalue = rate.getAttribute("value");
		System.out.println("Print the displayed Rate value :" +ratevalue);
		
		utilities.webDriverWait(driver, UOM);
		WebElement uomval = driver.findElement(UOM);
		uomunit = uomval.getAttribute("value");
		System.out.println("Print the displayed UOM unit value :" +uomunit);
		
		
	}

	public void Click_on_the_Save_button_in_the_Add_Daily_Out_form() throws Throwable {
		utilities.webDriverWait(driver, buttSave);
		driver.findElement(buttSave).click();
		
	}

	public void Verify_the_successful_save_msg() throws Throwable {
//		utilities.webDriverWait(driver, msgSave);
		WebElement Save = driver.findElement(msgSave);
		savemsg = Save.getText();
		System.out.println("Print the displayed Save toaster msg : " +savemsg);
	}

	public void Verify_whether_the_Date_field_is_holding_previous_date_bydefault() throws Throwable {
		utilities.webDriverWait(driver, Date);
		WebElement date = driver.findElement(Date);
		InHousedate = date.getAttribute("value");
		System.out.println("Display the In House Date :" + InHousedate);
		LocalDate date1 = LocalDate.parse(InHousedate);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		String InHouseFormateddate = date1.format(formatter);
		System.out.println("Print the formatted InHouse Date : "+InHouseFormateddate);
		
		
		LocalDate currentDate = LocalDate.now();
		System.out.println("Print the Current Date : " +currentDate);
        LocalDate previousDate = currentDate.minusDays(1);
        String formattedDate = previousDate.format(formatter);
        System.out.println("Previous Date: " + formattedDate);
        
        if(InHouseFormateddate.equals(formattedDate))
        {
        	System.out.println("Displaying Previous Date in the Date field bydefault : "+InHouseFormateddate);
        }else {
        	System.out.println("Not displaying Previous Date in the Date field bydefault : "+InHouseFormateddate);
        }


	}

	public void Enter_the_Challan_no() throws Throwable {
		utilities.webDriverWait(driver, Challanno);
		driver.findElement(Challanno).sendKeys("chsuppJ-4");
	}

	public void Select_the_Supplier_Party_name() throws Throwable {
		utilities.webDriverWait(driver, Partyname);
		driver.findElement(Partyname).click();
		Robot R = new Robot();
		R.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		R.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		R.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		R.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		R.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
	}

	public void Verify_whether_the_fields_enabled_status() throws Throwable {

//		utilities.webDriverWait(driver, POno);
		WebElement PO = driver.findElement(POno);
		if (PO.isEnabled()) {
            System.out.println("PO number field is in enabled state.");
        } else {
            System.out.println("PO number field is in disabled state.");
        }
				
		//		utilities.webDriverWait(driver, Supplier);
		WebElement Supp = driver.findElement(Supplier);
		if (Supp.isEnabled()) {
            System.out.println("Supplier field is in enabled state.");
        } else {
            System.out.println("Supplier field is in disabled state.");
        }
		
		utilities.webDriverWait(driver, ApplicableIPO);
		WebElement IPO = driver.findElement(ApplicableIPO);
		if (IPO.isEnabled()) {
            System.out.println("Applicable IPO field is in enabled state.");
        } else {
            System.out.println("Applicable IPO field is in disabled state.");
        }
				
//		utilities.webDriverWait(driver, FabricName);
		WebElement Fab = driver.findElement(FabricName);
		if (Fab.isEnabled()) {
            System.out.println("Fabric Name field is in enabled state.");
        } else {
            System.out.println("Fabric Name field is in disabled state.");
        }
				
//		utilities.webDriverWait(driver, Color);
		WebElement colour = driver.findElement(Color);
		if (colour.isEnabled()) {
            System.out.println("Color field is in enabled state.");
        } else {
            System.out.println("Color field is in disabled state.");
        }
		
//		utilities.webDriverWait(driver, Processname);
		WebElement Proname = driver.findElement(Processname);
		if (Proname.isEnabled()) {
            System.out.println("Process Name field is in enabled state.");
        } else {
            System.out.println("Process Name field is in disabled state.");
        }
		
		
//		utilities.webDriverWait(driver, Content);
		WebElement cont = driver.findElement(Content);
		if (cont.isEnabled()) {
            System.out.println("Content field is in enabled state.");
        } else {
            System.out.println("Content field is in disabled state.");
        }
				
//		utilities.webDriverWait(driver, CountCons);
		WebElement cnt = driver.findElement(CountCons);
		if (cnt.isEnabled()) {
            System.out.println("Count/ Construction field is in enabled state.");
        } else {
            System.out.println("Count/ Construction field is in disabled state.");
        }
				
//		utilities.webDriverWait(driver, GSM);
		WebElement gsm = driver.findElement(GSM);
		if (gsm.isEnabled()) {
            System.out.println("GSM field is in enabled state.");
        } else {
            System.out.println("GSM field is in disabled state.");
        }
				
//		utilities.webDriverWait(driver, CuttableWdth);
		WebElement CW = driver.findElement(CuttableWdth);
		if (CW.isEnabled()) {
            System.out.println("Cuttable Width field is in enabled state.");
        } else {
            System.out.println("Cuttable Width field is in disabled state.");
        }
		
//		utilities.webDriverWait(driver, NoThaans);
		WebElement Thaan = driver.findElement(NoThaans);
		if (!Thaan.isEnabled()) {
            System.out.println("No. of Thaans field is in enabled state.");
        } else {
            System.out.println("No. of Thaans field is in disabled state.");
        }
		
		
//		utilities.webDriverWait(driver, Qty);
		WebElement qty = driver.findElement(Qty);
		if (!qty.isEnabled()) {
            System.out.println("Qty field is in enabled state.");
        } else {
            System.out.println("Qty field is in disabled state.");
        }		
				
//		utilities.webDriverWait(driver, UOM);
		WebElement uom = driver.findElement(UOM);
		if (uom.isEnabled()) {
            System.out.println("UOM field is in enabled state.");
        } else {
            System.out.println("UOM field is in disabled state.");
        }
				
//		utilities.webDriverWait(driver, Rate);
		WebElement rate = driver.findElement(Rate);
		if (rate.isEnabled()) {
            System.out.println("Rate field is in enabled state.");
        } else {
            System.out.println("Rate field is in disabled state.");
        }
				
//		utilities.webDriverWait(driver, FromLocation);
		WebElement FLoc = driver.findElement(FromLocation);
		if (FLoc.isEnabled()) {
            System.out.println("From Location field is in enabled state.");
        } else {
            System.out.println("From Location field is in disabled state.");
        }
				
//		utilities.webDriverWait(driver, ToLocation);
		WebElement TLoc = driver.findElement(ToLocation);
		if (TLoc.isEnabled()) {
            System.out.println("To Location field is in enabled state.");
        } else {
            System.out.println("To LOcation field is in disabled state.");
        }

		
	}

	public void Enter_the_PO_no_and_select_a_PO() throws Throwable {
		utilities.webDriverWait(driver, POno);
		driver.findElement(POno).clear();
		driver.findElement(POno).sendKeys("J-");
		Robot R = new Robot();
		R.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		R.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		R.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		R.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		R.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		R.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
	}

	public void Verify_whether_the_data_is_prepoulating_in_the_fields() throws Throwable {

//		utilities.webDriverWait(driver, Supplier);
		WebElement Supp = driver.findElement(Supplier);
		supplier = Supp.getAttribute("value");
		System.out.println("Print the Supplier Name :" +supplier);
		
//		utilities.webDriverWait(driver, AppicableIPO);
		WebElement IPO = driver.findElement(AppicableIPO);
		AppIPO = IPO.getAttribute("value");
		System.out.println("Print the displayed ApplicableIPO :" +AppIPO);
		
//		utilities.webDriverWait(driver, FabricName);
		WebElement Fab = driver.findElement(FabricName);
		FabName = Fab.getAttribute("value");
		System.out.println("Print the displayed Fabric Name :" +FabName);
		
//		utilities.webDriverWait(driver, Color);
		WebElement colour = driver.findElement(Color);
		color = colour.getAttribute("value");
		System.out.println("Print the displayed Color :" +color);
		
//		utilities.webDriverWait(driver, Processname);
		WebElement Proname = driver.findElement(Processname);
		proName = Proname.getAttribute("value");
		System.out.println("Print the displayed Process Name :" +proName);
		
//		utilities.webDriverWait(driver, Content);
		WebElement cont = driver.findElement(Content);
		content = cont.getAttribute("value");
		System.out.println("Print the displayed Content value :" +content);
		
//		utilities.webDriverWait(driver, CountCons);
		WebElement cnt = driver.findElement(CountCons);
		CountConst = cnt.getAttribute("value");
		System.out.println("Print the displayed Count Construction value :" +CountConst);
		
//		utilities.webDriverWait(driver, GSM);
		WebElement gsm = driver.findElement(GSM);
		gsmvalue = gsm.getAttribute("value");
		System.out.println("Print the displayed GSM value :" +gsmvalue);
		
//		utilities.webDriverWait(driver, CuttableWdth);
		WebElement CW = driver.findElement(CuttableWdth);
		cuttWdth = CW.getAttribute("value");
		System.out.println("Print the displayed Cuttable Width value :" +cuttWdth);
		
//		utilities.webDriverWait(driver, UOM);
		WebElement uom = driver.findElement(UOM);
		uomunit = uom.getAttribute("value");
		System.out.println("Print the displayed UOM unit value :" +uomunit);
		
//		utilities.webDriverWait(driver, Rate);
		WebElement rate = driver.findElement(Rate);
		ratevalue = rate.getAttribute("value");
		System.out.println("Print the displayed Rate value :" +ratevalue);
		
			}

	public void Select_a_Factory_in_the_From_Location_and_verify_Thaan_Wise_Information_data_is_displayed() throws Throwable {
		utilities.webDriverWait(driver, FromLocation);
		WebElement From = driver.findElement(FromLocation);
		FromLoc = From.getAttribute("value");
		if(FromLoc.equals(null))
		{
			utilities.webDriverWait(driver, FromLocation);
			driver.findElement(FromLocation).click();
			Robot R = new Robot();
			R.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(2000);
			R.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(2000);
			
			System.out.println("Print the selected From Location value : " +FromLoc );
		}else {
			
			System.out.println("Print the From Location :" +FromLoc );
						
		}
	}
	
	public void Select_the_Thaans_and_Qty_in_the_Thaan_Wise_Information_grid() throws Throwable {
		
		utilities.webDriverWait(driver, secCompThaan);
		driver.findElement(secCompThaan).click();

	}

	public void Check_the_No_of_Thaans_and_Qty_field_values() {
		
		WebElement nth = driver.findElement(NoThaans);
		nthaan = nth.getAttribute("value");
		System.out.println("Print No. of Thaans selected : " +nthaan);
		
		WebElement Quan = driver.findElement(Qty);
		quantity = Quan.getAttribute("value");
		System.out.println("Print Quantity value assigned : " +quantity);
	}

	public void Click_on_Edit_Data_Entry_button() throws Throwable {
		utilities.webDriverWait(driver, buttDOEdit);
		driver.findElement(buttDOEdit).click();
	}

	public void Verify_whether_the_page_is_navigated_to_the_Updated_Daily_Out_form() throws Throwable {
		utilities.webDriverWait(driver, navUpdateDailyOut);
		WebElement update = driver.findElement(navUpdateDailyOut);
		updateDO = update.getText();
		System.out.println("Display the screen name : " +updateDO);
	}

	public void Verify_whether_the_data_is_displaying_correctly_in_all_the_fields() throws Throwable {
		
		utilities.webDriverWait(driver, Date);
		WebElement date = driver.findElement(Date);
		Udate = date.getAttribute("value");
		System.out.println("Print the date in the Update Daily Out form :" +Udate);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		String formattedDate = Udate.formatted(formatter);
		System.out.println("Display the Formated date in the update form : " +formattedDate);
		
		utilities.webDriverWait(driver, Challanno);
		WebElement chall = driver.findElement(Challanno);
		challno = chall.getAttribute("value");
		System.out.println("Display the entered Challan No. : " +challno);
	
		utilities.webDriverWait(driver, Supplier);
		WebElement Supp = driver.findElement(Supplier);
		supplier = Supp.getAttribute("value");
		System.out.println("Print the Supplier Name :" +supplier);
		
		utilities.webDriverWait(driver, POno);
		WebElement po = driver.findElement(POno);
		poNo = po.getAttribute("value");
		System.out.println("Display the selected PO number : "+poNo);
		
//		utilities.webDriverWait(driver, AppicableIPO);
		WebElement IPO = driver.findElement(AppicableIPO);
		AppIPO = IPO.getAttribute("value");
		System.out.println("Print the displayed ApplicableIPO :" +AppIPO);
		
//		utilities.webDriverWait(driver, FabricName);
		WebElement Fab = driver.findElement(FabricName);
		FabName = Fab.getAttribute("value");
		System.out.println("Print the displayed Fabric Name :" +FabName);
		
//		utilities.webDriverWait(driver, Color);
		WebElement colour = driver.findElement(Color);
		color = colour.getAttribute("value");
		System.out.println("Print the displayed Color :" +color);
		
//		utilities.webDriverWait(driver, Processname);
		WebElement Proname = driver.findElement(Processname);
		proName = Proname.getAttribute("value");
		System.out.println("Print the displayed Process Name :" +proName);
		
//		utilities.webDriverWait(driver, Content);
		WebElement cont = driver.findElement(Content);
		content = cont.getAttribute("value");
		System.out.println("Print the displayed Content value :" +content);
		
//		utilities.webDriverWait(driver, CountCons);
		WebElement cnt = driver.findElement(CountCons);
		CountConst = cnt.getAttribute("value");
		System.out.println("Print the displayed Count Construction value :" +CountConst);
		
//		utilities.webDriverWait(driver, GSM);
		WebElement gsm = driver.findElement(GSM);
		gsmvalue = gsm.getAttribute("value");
		System.out.println("Print the displayed GSM value :" +gsmvalue);
		
//		utilities.webDriverWait(driver, CuttableWdth);
		WebElement CW = driver.findElement(CuttableWdth);
		cuttWdth = CW.getAttribute("value");
		System.out.println("Print the displayed Cuttable Width value :" +cuttWdth);
		
		WebElement nth = driver.findElement(NoThaans);
		nthaan = nth.getAttribute("value");
		System.out.println("Print No. of Thaans selected : " +nthaan);
		
		WebElement Quan = driver.findElement(Qty);
		quantity = Quan.getAttribute("value");
		System.out.println("Print Quantity value assigned : " +quantity);
		
//		utilities.webDriverWait(driver, UOM);
		WebElement uom = driver.findElement(UOM);
		uomunit = uom.getAttribute("value");
		System.out.println("Print the displayed UOM unit value :" +uomunit);
		
//		utilities.webDriverWait(driver, Rate);
		WebElement rate = driver.findElement(Rate);
		ratevalue = rate.getAttribute("value");
		System.out.println("Print the displayed Rate value :" +ratevalue);

	
	}

	public void Click_on_the_Add_button_in_the_Thaan_Wise_Information_grid() throws Throwable {
		utilities.webDriverWait(driver, buttAddThaanInfor);
		driver.findElement(buttAddThaanInfor).click();
	}

	public void Enter_the_Custom_Qty_value() throws Throwable {
		
		utilities.webDriverWait(driver, CustomQty);
		driver.findElement(CustomQty).sendKeys("20");
	}

	public void Verify_the_successful_Update_msg() throws Throwable {
		utilities.webDriverWait(driver, msgUpdate);
		WebElement mupdate = driver.findElement(msgUpdate);
		updatemsg = mupdate.getAttribute("value");
		System.out.println("Print the : " +updatemsg);
	}

	public void Click_on_the_Update_button_in_the_Update_Daily_Out_form() throws Throwable {
		utilities.webDriverWait(driver, buttUpdate);
		driver.findElement(buttUpdate).click();
	}

	public void Check_the_date_in_the_Date_field() throws Throwable {
		utilities.webDriverWait(driver, Date);
		WebElement date = driver.findElement(Date);
		InHousedate = date.getAttribute("value");
		System.out.println("Display the In House Date :" + InHousedate);
		LocalDate date1 = LocalDate.parse(InHousedate);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		String InHouseFormateddate = date1.format(formatter);
		System.out.println("Print the formatted InHouse Date : "+InHouseFormateddate);
		
		
		
//		utilities.webDriverWait(driver, Date);
//		WebElement date = driver.findElement(Date);
//		InHousedate = date.getAttribute("value");
//		System.out.println("Display the In House Date :" + InHousedate);
	}

	public void Click_on_the_Delete_button_in_the_Thaan_Wise_Info_grid() throws Throwable {
		utilities.webDriverWait(driver, buttDeleteThaan);
		driver.findElement(buttDeleteThaan).click();
	}

	public void Print_a_msg_on_deleting_the_Added_sub_thaan() {
		System.out.println("The added sub thaan has been deleted successfully");
		
	}

	public void Click_on_the_Delete_button_in_the_Daily_Out_screen() throws Throwable {
		utilities.webDriverWait(driver, buttDelete);
		driver.findElement(buttDelete).click();
	}

	public void Print_the_Succesful_Delete_message_in_Daily_Out() throws Throwable {
//		utilities.webDriverWait(driver, msgDelete);
		WebElement del = driver.findElement(msgDelete);
		deletemsg = del.getText();
		System.out.println("Print the Delete Toaster msg :" + deletemsg);
	}

	public void Click_on_the_Approve_button_for_a_record() throws Throwable {
		utilities.webDriverWait(driver, buttApprove);
		driver.findElement(buttApprove).click();
	}

	public void Verify_whether_the_Approved_popup_window_is_displayed() throws Throwable {
		utilities.webDriverWait(driver, msgApprove);
		WebElement msgApp = driver.findElement(msgApprove);
		approvedmsg = msgApp.getText();
		System.out.println("Print the Approved msg displayed : "+approvedmsg);
	}

	public void Click_on_the_No_option_in_the_Approved_msg() throws Throwable {
		utilities.webDriverWait(driver, NooptionAppmsg);
		driver.findElement(NooptionAppmsg).click();
		System.out.println("The Gate Entry window is Closed");
	}

	public void Click_on_the_Yes_option_in_the_Approved_msg() throws Throwable {
		utilities.webDriverWait(driver, YesoptionAppmsg);
		driver.findElement(YesoptionAppmsg).click();
	}

	public void Verify_the_Gate_Entry_Number_popup_msg() {
		// TODO Auto-generated method stub
		
	}

	public void Click_on_the_Save_button_in_the_Gate_Entry_Number_popup_msg() throws Throwable {
		utilities.webDriverWait(driver, buttGESave);
		driver.findElement(buttGESave).click();
	}

	public void Verify_the_mandatory_validation_msg() throws Throwable {
//		utilities.webDriverWait(driver, masgMandatory);
		WebElement mandat = driver.findElement(masgMandatory);
		mandatory = mandat.getText();
		System.out.println("Print the Mandatory validation msg displayed : "+mandatory);
	}

	public void Enter_the_Gate_Entry_Number() throws Throwable {
		utilities.webDriverWait(driver, GateEntryNo);
		driver.findElement(GateEntryNo).sendKeys("GateEntry1");
	}

	public void Print_the_Succesful_Approve_msg() throws Throwable {
//		utilities.webDriverWait(driver, msgApproved);
		WebElement appro = driver.findElement(msgApproved);
		Approvedmsg = appro.getText();
		System.out.println("Print the Approved msg displayed : " +Approvedmsg);
	}

	public void Click_on_the_Close_button_in_the_Gate_entry_window() throws Throwable {
		utilities.webDriverWait(driver, buttGEClose);
		driver.findElement(buttGEClose).click();
		System.out.println("Gate Entry window has Closed");
	}

	public void Click_on_Print_button() throws Throwable {
		utilities.webDriverWait(driver, buttPrint);
		driver.findElement(buttPrint).click();
	}

	public void Verify_whether_the_page_is_navigated_to_the_Print_form() throws Throwable {
		utilities.webDriverWait(driver, prtForm);
		driver.findElement(prtForm).isDisplayed();
		System.out.println("Navigated to the Daily Out Print form");
	}

	public void Verify_and_print_the_data_displayed_in_the_Print_form() throws Throwable {
		utilities.webDriverWait(driver, disprthead);
		WebElement DailyOut = driver.findElement(disprthead);
		DailyOutChallan = DailyOut.getText();
		System.out.println("Print the DailyOutChallan heading value : " +DailyOutChallan);
		System.out.println();
		
		utilities.webDriverWait(driver, disprtSupplier);
		WebElement supp = driver.findElement(disprtSupplier);
		SuppAddress = supp.getText();
		System.out.println("Print the Supplier Addresss : " +SuppAddress);
		System.out.println();
		
		utilities.webDriverWait(driver, disprtFactory);
		WebElement fac = driver.findElement(disprtFactory);
		FacAddress = fac.getText();
		System.out.println("Print the Factory Address : " +FacAddress);
		System.out.println();
		
		utilities.webDriverWait(driver, disprtThaanQty);
		WebElement Thaan = driver.findElement(disprtThaanQty);
		ThaanQty = Thaan.getText();
		System.out.println("Print the Thaan Name and Qtys : " +ThaanQty);
	}

	public void Click_on_the_Close_button_in_the_Print_form() throws Throwable {
		utilities.webDriverWait(driver, buttprtCancel);
		driver.findElement(buttprtCancel).click();
	}

	public void Select_the_Assigned_Stock_as_Party_name() throws Throwable {
		utilities.webDriverWait(driver, Partyname);
		driver.findElement(Partyname).click();
		Robot R = new Robot();
		R.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		R.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
	}


	public void Select_an_Applicable_IPO() throws Throwable {
		utilities.MediumWait(driver);

		utilities.webDriverWait(driver, ApplicableIPO);
		
		driver.findElement(ApplicableIPO).click();
//		driver.findElement(ApplicableIPO).sendKeys("IPO8");
		driver.findElement(secAppliIPO).click();
		utilities.MediumWait(driver);
		Robot R = new Robot();
		utilities.MediumWait(driver);
		R.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		utilities.MediumWait(driver);
		R.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
	}

	public void Select_a_Fabric_for_the_selected_IPO() throws Throwable {
		utilities.webDriverWait(driver, FabricName);
		driver.findElement(FabricName).click();
		Robot R = new Robot();
//		R.keyPress(KeyEvent.VK_DOWN);
//		Thread.sleep(2000);
//		R.keyPress(KeyEvent.VK_DOWN);
//		Thread.sleep(2000);
//		R.keyPress(KeyEvent.VK_DOWN);
//		Thread.sleep(2000);
		R.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
	}

	public void Select_a_Color_for_the_selected_IPO() throws Throwable {
		utilities.webDriverWait(driver, Color);
		driver.findElement(Color).click();
		Robot R = new Robot();
//		R.keyPress(KeyEvent.VK_DOWN);
//		Thread.sleep(2000);
		R.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
	}

	public void Select_a_Process_Name_for_the_selected_IPO() throws Throwable {
		utilities.webDriverWait(driver, Processname);
		driver.findElement(Processname).click();
		Robot R = new Robot();
		R.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		R.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
	}

	public void Print_the_Content_for_the_selected_Fabric() throws Throwable {
//		utilities.webDriverWait(driver, Content);
		WebElement cont = driver.findElement(Content);
		content = cont.getAttribute("value");
		System.out.println("Print the displayed Content value :" +content);
	
	}

	public void Print_the_Count_Construction_for_the_selected_Fabric() throws Throwable {
//		utilities.webDriverWait(driver, CountCons);
		WebElement cnt = driver.findElement(CountCons);
		CountConst = cnt.getAttribute("value");
		System.out.println("Print the displayed Count Construction value :" +CountConst);
		
	}

	public void Print_the_GSM_for_the_selected_Fabric() throws Throwable {
//		utilities.webDriverWait(driver, GSM);
		WebElement gsm = driver.findElement(GSM);
		gsmvalue = gsm.getAttribute("value");
		System.out.println("Print the displayed GSM value :" +gsmvalue);
	}

	public void Print_the_Cuttable_Width_for_the_selected_Fabric() throws Throwable {
//		utilities.webDriverWait(driver, CuttableWdth);
		WebElement CW = driver.findElement(CuttableWdth);
		cuttWdth = CW.getAttribute("value");
		System.out.println("Print the displayed Cuttable Width value :" +cuttWdth);
	}

	public void Select_UOM_value_for_the_selected_Fabric() throws Throwable {
		utilities.webDriverWait(driver, UOM);
		driver.findElement(UOM).click();
		Thread.sleep(1000);
		Robot R = new Robot();
		R.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		R.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
	}

	public void Enter_Rate_for_the_selected_Fabric() throws Throwable {
		utilities.webDriverWait(driver, Rate);
		driver.findElement(Rate).sendKeys("56");Thread.sleep(2000);
	}

	public void Select_a_From_Location_and_print_for_the_selected_party() throws Throwable {
		utilities.webDriverWait(driver, FromLocation);
		WebElement From = driver.findElement(FromLocation);
		FromLoc = From.getAttribute("value");
		if(FromLoc.equals(null))
		{
			utilities.webDriverWait(driver, FromLocation);
			driver.findElement(FromLocation).click();
			Robot R = new Robot();
			R.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(2000);
			R.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(2000);
			R.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(2000);
			R.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(2000);
			
			System.out.println("Print the selected From Location value : " +FromLoc );
		}else {
			utilities.webDriverWait(driver, FromLocation);
			driver.findElement(FromLocation).click();
			Robot R = new Robot();
			R.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(2000);
			R.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(2000);
			System.out.println("Print the From Location : " +FromLoc );
						
		}
	}

	public void Select_a_To_Location_and_print_for_the_selected_party() throws Throwable {
		utilities.webDriverWait(driver, ToLocation);
		driver.findElement(ToLocation).click();
		Thread.sleep(1000);
		Robot R = new Robot();
		R.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		R.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		String ToLoc = driver.findElement(ToLocation).getAttribute("value");
		System.out.println("Print To Location name : " +ToLoc );
	}
	

	
	
	public void Enter_Remarks_for_the_selected_party() throws Throwable {
//		utilities.webDriverWait(driver, ToLocation);
		driver.findElement(Remarks).sendKeys("Entered Assigned party remarks");
	}

	public void Select_the_Thaans_in_the_Thaan_Wise_Information_grid_for_the_selected_party() throws Throwable {
		utilities.webDriverWait(driver, secCompThaan);
		driver.findElement(secCompThaan).click();
		
		utilities.webDriverWait(driver, secCompThaan3);
		driver.findElement(secCompThaan3).click();
		
	}
	
	public void Verify_whether_the_Thaan_are_displayed_for_the_selected_factory() throws Throwable {
		
		
//		    utilities.webDriverWait(driver, FromLocation);
		    WebElement locF = driver.findElement(FromLocation);
		    List<WebElement> options = locF.findElements(By.tagName("option"));
		    System.out.println("Number of values in the dropdown list: " + options.size());

		    for (WebElement option : options) {
		    			    	
		        option.click(); 
		        String locFrom = option.getAttribute("value");
		        utilities.webDriverWait(driver, gridThaanwiseInfo);
		        WebElement Thaan = driver.findElement(gridThaanwiseInfo);
		        String ThaanData = Thaan.getText();
		        System.out.println("For FromLocation: " + locFrom + "  Thaan wise information :"+ThaanData);
		        System.out.println("Thaan Wise Information: " + ThaanData);
		       
		        if (Thaan.isDisplayed()) {
		            System.out.println("Thaan Wise Information is displayed for FromLocation: " + locFrom);
		            utilities.webDriverWait(driver, secCompThaan);
		            driver.findElement(secCompThaan).click(); 
		            Thread.sleep(1000);
		            
		            break;
		            
		        }
		    }
		    
		}

//		utilities.webDriverWait(driver, FromLocation);
//		WebElement locF = driver.findElement(FromLocation);
//        List<WebElement> options = locF.findElements(By.tagName("option"));
//        int count = options.size();
//        System.out.println("Number of values in the dropdown list: " + count);
//        String Locfrom = locF.getAttribute("value");
//        for(int i = 0; i < count; i++) {
//        	
//        	if (!Locfrom.equals(null)) {	
//        	System.out.println("Print the From Location name : "+Locfrom);
//        	utilities.webDriverWait(driver, gridThaanwiseInfo);
//    		WebElement Thaan = driver.findElement(gridThaanwiseInfo);
//    		String ThaanDelt = Thaan.getAttribute("value");
//    		System.out.println("Display the Thaan Wise Information : "+ThaanDelt);
//    		
//        	if (Thaan.isDisplayed()) {
//        		System.out.println("Display the Thaan Wise Information1 : "+ThaanDelt);
//            	utilities.webDriverWait(driver, secCompThaan);
//        		driver.findElement(secCompThaan).click();
//        	        		
//            }else {
//            	utilities.webDriverWait(driver, FromLocation);
//    			driver.findElement(FromLocation).isDisplayed();
//    			Robot R = new Robot();
//    			R.keyPress(KeyEvent.VK_DOWN);
//    			Thread.sleep(2000);
//    			R.keyPress(KeyEvent.VK_DOWN);
//    			Thread.sleep(2000);
//    			R.keyPress(KeyEvent.VK_ENTER);
//    			Thread.sleep(2000);
//            }
//        	}
//	
//        }
	}
//	public void Verify_whether_the_Thaan_are_displayed_for_the_selected_factory() throws Throwable {
//		utilities.webDriverWait(driver, FromLocation);
//		WebElement locF = driver.findElement(FromLocation);
//		utilities.webDriverWait(driver, gridThaanwiseInfo);
//		WebElement Thaan = driver.findElement(gridThaanwiseInfo);
//		
//		
//		Robot robot = new Robot();
//		robot.delay(2000);
//	
//        int scrollAmount = 5;
//        for (int i = 0; i < scrollAmount; i++) {
//        	if(!FromLoc.equals(null))
//    		{
//    			utilities.webDriverWait(driver, FromLocation);
//    			driver.findElement(FromLocation).isDisplayed();
//    			Robot R = new Robot();
//    			R.keyPress(KeyEvent.VK_DOWN);
//    			Thread.sleep(2000);
//    			R.keyPress(KeyEvent.VK_DOWN);
//    			Thread.sleep(2000);
//    			R.keyPress(KeyEvent.VK_ENTER);
//    			Thread.sleep(2000);
////    			
//    			System.out.println("Print the selected From Location value : " +FromLoc );
////            robot.keyPress(KeyEvent.VK_DOWN);
////            robot.keyRelease(KeyEvent.VK_UP);
//            robot.delay(500);
//            if (Thaan.isDisplayed()) {
//            	utilities.webDriverWait(driver, secCompThaan);
//        		driver.findElement(secCompThaan).click();
//        		
//        		
//            }else {
//            	System.out.println("There is no Thaan informtion for the selected combination");
//            }
//     
//        }else {
////        	utilities.webDriverWait(driver, secCompThaan);
////    		driver.findElement(secCompThaan).click();
////    		WebElement prtsec = driver.findElement(secCompThaan);
////    		String prtsecthaan = prtsec.getAttribute("value");
////    		System.out.println("Print the selected thaan information - "+prtsecthaan);
//        	System.out.println("For the selected factory there is no thaan information");
//        }
//
//		
//	}
//
//	}



	
