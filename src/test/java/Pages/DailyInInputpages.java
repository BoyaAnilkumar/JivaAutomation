package Pages;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.an.E;
import util.DriverFactory;
import util.Utilities;

public class DailyInInputpages extends DriverFactory {
	Date currentDate = new Date();
	SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
	String formattedDate = dateFormat.format(currentDate);
	
	
	Utilities utilities = new Utilities();
	
	public By Fabric_Store							=	By.xpath("//span[text()='Fabric Store ']");
	public By Data_Entry					= 	By.xpath("(//span[text()='Data Entry'])[2]");
	By Daily_IN_and_Out						=	By.xpath("(//a[@aria-expanded='false']/.//span[text()='Daily In & Out'])[2]");
	By Daily_In_Data_Entry					=	By.xpath("//a[text()='Daily in Data Entry']");
	By Screen_Name							=	By.xpath("//h3[text()='Daily In Data Entry']");
	By Add_Data_Entry_Button				=	By.xpath("//button[text()=' Add Data Entry']");
	By Screen_Name_Data_Entry				=	By.xpath("//h3[text()='Add Daily In Data Entry']");
	By Select_Date							=	By.xpath("//input[@formcontrolname='date']");
	By Challan_No							=	By.xpath("//input[@formcontrolname='challanNo']");
	By Bill_No								= 	By.xpath("//input[@formcontrolname='billNo']");
	By Gate_Entry_No						=	By.xpath("//input[@formcontrolname='gateEntryNumber']");
	By Party_Name							=	By.xpath("//select[@formcontrolname='partyName']");
	By Select_Party_Name					=	By.xpath("//option[text()=' Supplier']");
	By PO_Number							=	By.xpath("//input[@placeholder='Search PO Number']");
	By Select_PO_Number						=	By.xpath("//span[text()='J-102']");
	By Supplier_Name						=	By.xpath("//select[@formcontrolname='supplier']");
	By From_Location						=	By.xpath("//select[@formcontrolname='fromLocation']");
	By Process_Name							=	By.xpath("//select[@formcontrolname='processName']");
	By Fabric_Name							=	By.xpath("//ng-select[@formcontrolname='fabric']");
	By Color								=	By.xpath("//ng-select[@formcontrolname='color']");
	By Applicable_IPO						=	By.xpath("//p-multiselect[@formcontrolname='applicableIpo']");
	By Content								=	By.xpath("//input[@formcontrolname='content']");
	By Count								=	By.xpath("//input[@formcontrolname='count']");
	By GSM 									=	By.xpath("//input[@formcontrolname='gsm']");
	By Cuttable_Width						=	By.xpath("//input[@formcontrolname='cuttableWidth']");
	By UOM									=	By.xpath("//select[@formcontrolname='uom']");
	By No_of_Thaans							=	By.xpath("//input[@formcontrolname='thans']");
	By Quantity								=	By.xpath("//input[@formcontrolname='quantity']");
	By Rate									=	By.xpath("//input[@formcontrolname='rate']");
	By To_Location							=	By.xpath("//select[@formcontrolname='toLocation']");
	By Select_To_Location					=	By.xpath("//select[@formcontrolname='toLocation']/..//option[text()=' JIVA DESIGNS PVT. LTD.']");
	By Remarks								=	By.xpath("//textarea[@formcontrolname='remarks']");
	By Save_Daily_In_Input					=	By.xpath("(//button[text()=' Save'])[1]");
	By Toaster_Message						=	By.xpath("//h2[@id='swal2-title']");
	
	
	
	
	
	
	
	public void click_on_Fabric_Store_module() throws Throwable {
		utilities.webDriverWait(driver, Fabric_Store);
		driver.findElement(Fabric_Store).click();
		System.out.println("click on fabric store module");
		utilities.MinimumWait(driver);
		
	}


	public void Click_on_Data_Entry_in_Fabric_Store() throws Throwable {
		utilities.webDriverWait(driver, Data_Entry);
		driver.findElement(Data_Entry).click();
		utilities.MinimumWait(driver);
		
	}


	public void click_on_Daily_In_and_Out_menu() throws Throwable {
		utilities.webDriverWait(driver, Daily_IN_and_Out);
		driver.findElement(Daily_IN_and_Out).click();
		utilities.MaximumWait(driver);
		
	}


	public void Click_on_Daily_In_Data_Entry() throws Throwable {
		utilities.webDriverWait(driver, Daily_In_Data_Entry);
		driver.findElement(Daily_In_Data_Entry).click();
		utilities.MinimumWait(driver);
		
		
	}


	public void Verify_that_Daily_In_Data_Entry_screen_is_displaying_or_not() throws Throwable {
		utilities.webDriverWait(driver, Screen_Name);
		String ScreenName = driver.findElement(Screen_Name).getText();
		System.out.println("Displaying the screen name as:  " + ScreenName);
		utilities.MinimumWait(driver);
		
	}


	public void Click_on_Add_Data_Entry_button() throws Throwable {
		utilities.webDriverWait(driver, Add_Data_Entry_Button);
		String ButtonName = driver.findElement(Add_Data_Entry_Button).getText();
		System.out.println("displaying the button name as:  " + ButtonName);
		utilities.MinimumWait(driver);
		driver.findElement(Add_Data_Entry_Button).click();
		utilities.MinimumWait(driver);
		
		
	}


	public void Verify_that_user_navigated_to_daily_in_data_entry_screen_or_not() throws Throwable {
		utilities.webDriverWait(driver, Screen_Name_Data_Entry);
		String ScreenName = driver.findElement(Screen_Name_Data_Entry).getText();
		System.out.println("Navigated to: " +ScreenName );
		utilities.MinimumWait(driver);
		
		
	}


	public void Select_the_Date_if_you_need_to_change_the_date() throws Throwable {
		utilities.webDriverWait(driver, Select_Date);
		driver.findElement(Select_Date).click();
		driver.findElement(Select_Date).clear();
		driver.findElement(Select_Date).sendKeys("29022024");
		utilities.MinimumWait(driver);
		
		
	}


	public void verify_that_current_date_is_displaying_or_not() throws Throwable {
		utilities.webDriverWait(driver, Select_Date );
		driver.findElement(Select_Date).click();
		utilities.MediumWait(driver);
		System.out.println("Current date: " + formattedDate);
		
	}


	public void Enter_the_Challan_No() throws Throwable {
		utilities.webDriverWait(driver, Challan_No);
		driver.findElement(Challan_No).click();
		utilities.MinimumWait(driver);
		driver.findElement(Challan_No).sendKeys("FA120");
		utilities.MinimumWait(driver);
		
	}


	public void Enter_the_Bill_No() throws Throwable {
		utilities.webDriverWait(driver, Bill_No);
		driver.findElement(Bill_No).click();
		Thread.sleep(5000);
		driver.findElement(Bill_No).sendKeys("AS001");
		utilities.MinimumWait(driver);
		
		
	}


	public void Enter_the_Gate_Entry_No() throws Throwable {
		utilities.webDriverWait(driver, Gate_Entry_No);
		driver.findElement(Gate_Entry_No).click();
		Thread.sleep(5000);
		driver.findElement(Gate_Entry_No).sendKeys("Gate No 01");
		utilities.MinimumWait(driver);
		
	}


	public void Select_Party_Name() throws Throwable {
		utilities.webDriverWait(driver, Party_Name);
		driver.findElement(Party_Name).click();
		Thread.sleep(5000);
		driver.findElement(Select_Party_Name).click();
		utilities.MinimumWait(driver);
		
		
	}


	public void Enter_PO_Number() throws Throwable {
		utilities.webDriverWait(driver, PO_Number);
		driver.findElement(PO_Number).click();
		Thread.sleep(5000);
		driver.findElement(PO_Number).sendKeys("J-10");
		utilities.MediumWait(driver);
		Robot R = new Robot();
		R.keyPress(KeyEvent.VK_2);
		Thread.sleep(5000);
		driver.findElement(Select_PO_Number).click();
		utilities.MinimumWait(driver);
	}


	public void Verify_that_Supplier_FromLocation_ProcessName_FabricName_Color_ApplicableIPO_Content_Count_GSM_CuttableWidth_UOM_has_prepopulated_data_after_selecting_the_PO_number() throws Throwable {
		
		utilities.webDriverWait(driver, From_Location);
		driver.findElement(From_Location).click();
		WebElement FromLocation	=	driver.findElement(From_Location);
		String Location	=	FromLocation.getText();
		if(FromLocation.isDisplayed()) {
		System.out.println("Not Displaying the From Location");
		}else {
			System.out.println("Displaying the From Location Value");
		}
		utilities.MinimumWait(driver);
		
		
		utilities.webDriverWait(driver, Process_Name);
//		driver.findElement(Process_Name).click();
		WebElement ProcessName	=	driver.findElement(Process_Name);
		String Process =	ProcessName.getText();
		if(ProcessName.isDisplayed()) {
		System.out.println("Process name is displaying as: " + Process);
		}else {
			System.out.println("Process name is not displaying as: " +  Process);
		}
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Fabric_Name);
		driver.findElement(Fabric_Name).click();
		WebElement FabricName =		driver.findElement(Fabric_Name);
		String Fabric =		FabricName.getText();
		if(FabricName.isDisplayed()) {
		System.out.println("Fabric Name is displaying as: " + Fabric);
		}else {
			System.out.println("Fabric Name is not displaying as: " + Fabric);
		}
		utilities.MinimumWait(driver);
		
		
		utilities.webDriverWait(driver, Color);
		driver.findElement(Color).click();
		WebElement color =		driver.findElement(Color);
		String COLOR	=	color.getText();
		if(color.isDisplayed()) {
			System.out.println("Fabric color is displaying as: " + COLOR);
		}else {
			System.out.println("Fabric color is not displaying as: " + COLOR);
		}
		utilities.MinimumWait(driver);
		
		
		utilities.webDriverWait(driver, Applicable_IPO);
		driver.findElement(Applicable_IPO).click();
		WebElement IPO = 	driver.findElement(Applicable_IPO);
		String ApplicableIPO =		IPO.getText();
		if(IPO.isDisplayed()) {
			System.out.println("Applicable IPO is displaying as: " + ApplicableIPO);
		}else {
			System.out.println("Applicable IPO is not displaying as: " + ApplicableIPO);
		}
		utilities.MinimumWait(driver);
		
		
		utilities.webDriverWait(driver, Content);
		driver.findElement(Content).click();
		WebElement CONTENT =	driver.findElement(Content);
		String Acontent	=		CONTENT.getText();
		if(CONTENT.isDisplayed()) {
			System.out.println("Content is displaying as: " + CONTENT);
		}else {
			System.out.println("Content is not displaying as: " + CONTENT);
		}
		utilities.MinimumWait(driver);
		
		
		utilities.webDriverWait(driver, Count);
		driver.findElement(Count).click();
		WebElement COUNT =	driver.findElement(Count);
		String ACOUNT	=		COUNT.getText();
		if(COUNT.isDisplayed()) {
			System.out.println("Count is displaying as: " + ACOUNT);
		}else {
			System.out.println("Count is not displaying as: " + ACOUNT);
		}
		utilities.MinimumWait(driver);
		
		
		utilities.webDriverWait(driver, GSM);
		driver.findElement(GSM).click();
		WebElement gsm 	=		driver.findElement(GSM);
		String Gsm =	gsm.getText();
		if(gsm.isDisplayed()) {
			System.out.println("Gsm is displaying as: " + Gsm);
		}else {
			System.out.println("Gsm is not displaying as: " + Gsm);
		}
		utilities.MinimumWait(driver);
		
		
		utilities.webDriverWait(driver, Cuttable_Width);
		driver.findElement(Cuttable_Width).click();
		WebElement cuttable = 	driver.findElement(Cuttable_Width);
		String width	=	cuttable.getText();
		if(cuttable.isDisplayed()) {
			System.out.println("cuttable width is displaying as: " + width);
		}else {
			System.out.println("cuttable width is not displaying as:  " + width);
		}
		utilities.MinimumWait(driver);
		
		
		utilities.webDriverWait(driver, UOM);
		driver.findElement(UOM).click();
		WebElement uom  =  driver.findElement(UOM);
		String Uom = uom.getText();
		if(uom.isDisplayed()) {
			System.out.println("UOM is displaying as: "+ uom);
		}else {
			System.out.println("UOM is not displayed as: " + uom);
		}utilities.MinimumWait(driver);
	}


	public void Enter_No_of_Thaans() throws Throwable {
		utilities.webDriverWait(driver, No_of_Thaans);
		driver.findElement(No_of_Thaans).click();
		driver.findElement(No_of_Thaans).clear();
		driver.findElement(No_of_Thaans).sendKeys("10");
		utilities.MinimumWait(driver);
		
	}


	public void Enter_No_of_Qty() throws Throwable {
		utilities.webDriverWait(driver, Quantity);
		driver.findElement(Quantity).click();
		driver.findElement(Quantity).sendKeys("500");
		utilities.MinimumWait(driver);
	}


	public void Enter_the_Rate_for_the_Qty() {
		// TODO Auto-generated method stub
		
	}


	public void Select_To_Location_from_dropdown() {
		// TODO Auto-generated method stub
		
	}


	public void Enter_Remarks_for_the_Daily_In_Input() {
		// TODO Auto-generated method stub
		
	}


	public void click_on_save_button_to_create_the_Daily_In_Input() throws Throwable {
		utilities.webDriverWait(driver, Save_Daily_In_Input);
		driver.findElement(Save_Daily_In_Input).click();
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Toaster_Message);
		Actions actions = new Actions(driver);
//		driver.findElement(Toaster_Message).click();
//		WebElement elementToHoverOver = driver.findElement(Toaster_Message);
//		actions.moveToElement(elementToHoverOver).perform();
//		String Toaster = driver.findElement(Toaster_Message).getText();
//		System.out.println("Displaying the Toaster Message as: " + Toaster);
//		utilities.MinimumWait(driver);
		
	}


	
	
	
	

}
