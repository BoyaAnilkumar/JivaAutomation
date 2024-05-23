package Page;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.joda.time.DateTime;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import util.DriverFactory;
import util.Utilities;

public class OutChallans_Page extends DriverFactory{
	Date currentDate = new Date();
	SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
	String formattedDate = dateFormat.format(currentDate);
	String Pastdate = DateTime.now().plusDays(-1).toString("dd-MM-yyyy");
	String tomorrow = DateTime.now().plusDays(1).toString("dd-MM-yyyy");

	Utilities utilities = new Utilities();
	By Challans_Module = By.xpath("//span[text()='Challans']");
	By Out_Challans_Menu = By.xpath("//a[text()=' Out Challan ']");
	By Screen_Title = By.xpath("//h3[text()='Out Challans']");
	By Empty_grid = By.xpath("//td[text()=' No data found. ']");
	By Add_button = By.xpath("//button[text()=' Add']");
	By Add_Form_nam = By.xpath("//h3[text()='Add Out Challan']");
	By Source_dropdown = By.xpath("//select[@formcontrolname='challanSourceTypeId']");
	By Buying_House_Name = By.xpath("//select[@formcontrolname='buyingHouseId']");
	By Supplier_Name = By.xpath("//select[@formcontrolname='supplierId']");
	By Date = By.xpath("//input[@formcontrolname='date']");
	By Challan_Type = By.xpath("//select[@formcontrolname='challanItemTypeId']");
	By IPO = By.xpath("//ng-select[@formcontrolname='ipoId']");
	By Enter_IPO = By.xpath("//ng-select[@formcontrolname='ipoId']/div/div/div/input[@type='text']");
	By Challan_Item = By.xpath("//input[@formcontrolname='challanItemName']");
	By Quantity1 = By.xpath("//input[@formcontrolname='quantity']");
	By Description = By.xpath("//textarea[@formcontrolname='description']");
	By Save_button = By.xpath("//button[text()=' Save']");
	By Cancel_button = By.xpath("//button[@type='reset']");
	By Print_Icon = By.xpath("//button[@title='Print']");
	By Print_Challan_Num = By.xpath("//td[@class='text-right p-2']");
	By Print_Button = By.xpath("//button[@class='btn btn-primary']");
	By Approve_icon = By.xpath("//a[@title='Approve']");
	By Conf_Approve = By.xpath("//h2[text()='Are you sure you want to Approve']");
	By Conf_Yes_Approve = By.xpath("//button[text()='Yes']");
	By Conf_No_Approve = By.xpath("//button[text()='No']");
	
	

	public void Click_on_Challans_sub_module() throws Throwable {
		utilities.webDriverWait(driver, Challans_Module);
		driver.findElement(Challans_Module).click();
		utilities.MinimumWait(driver);
		
	}

	public void Click_on_Out_Challans_in_menu() throws Throwable {
		utilities.webDriverWait(driver, Out_Challans_Menu);
		driver.findElement(Out_Challans_Menu).click();
		utilities.MinimumWait(driver);
		
	}

	public void User_has_navigated_to_Out_Challans_screen() throws Throwable {
		utilities.webDriverWait(driver, Screen_Title);
		WebElement Title = driver.findElement(Screen_Title);
		String screenname = Title.getText();
		String screenTitle = "Out Challans";
		
		if(screenname.equals(screenTitle)) {
			System.out.println("Page Title is displaying as expected");
		}else {
			System.out.println("Page Title is not displaying as expected");
		}
		utilities.MinimumWait(driver);
		
	}

	public void user_clicked_on_Add_button() throws Throwable {
		utilities.webDriverWait(driver, Add_button);
		driver.findElement(Add_button).click();
		utilities.MinimumWait(driver);
		
	}

	public void verify_that_source_is_selected() throws Throwable {
		utilities.webDriverWait(driver, Source_dropdown);
		String source = driver.findElement(Source_dropdown).getText();
		System.out.println(source);
		utilities.MinimumWait(driver);
		
	}

	public void Select_the_Buying_House_Name(String buyinghousename) throws Throwable {
		utilities.webDriverWait(driver, Buying_House_Name);
		driver.findElement(Buying_House_Name).click();
		Thread.sleep(2000);
		WebElement Buying = driver.findElement(Buying_House_Name);
		Select buyinghouse = new Select(Buying);
		buyinghouse.selectByVisibleText(buyinghousename);
		utilities.MinimumWait(driver);
		
	}
	
	public void Select_the_date_from_datepicker() throws Throwable {
		utilities.webDriverWait(driver, Date);
		driver.findElement(Date).sendKeys(formattedDate);
		Thread.sleep(1000);
		System.out.println("Current Date is:::   " + formattedDate);
		Thread.sleep(1000);
	}

	public void Select_the_Challan_type(String type) throws Throwable {
		utilities.webDriverWait(driver, Challan_Type);
		driver.findElement(Challan_Type).click();
		Thread.sleep(2000);
		WebElement ctype = driver.findElement(Challan_Type);
		Select chalantype = new Select(ctype);
		chalantype.selectByVisibleText(type);
		utilities.MinimumWait(driver);
		
	}

	public void Enter_the_data_in_item_textfield(String item) throws Throwable {
		utilities.webDriverWait(driver, Challan_Item);
		driver.findElement(Challan_Item).click();
		Thread.sleep(1000);
		driver.findElement(Challan_Item).sendKeys(item);
		Thread.sleep(1000);
		
	}

	public void Enter_quantity(String qty) throws Throwable {
		utilities.webDriverWait(driver, Quantity1);
		driver.findElement(Quantity1).click();
		Thread.sleep(1000);
		driver.findElement(Quantity1).sendKeys(qty);
		Thread.sleep(1000);
		
	}

	public void Enter_data_in_Description_textfield(String description2) throws Throwable {
		utilities.webDriverWait(driver, Description);
		driver.findElement(Description).click();
		Thread.sleep(1000);
		driver.findElement(Description).sendKeys(description2);
		Thread.sleep(1000);
		
	}

	public void user_clicked_on_save_button() throws Throwable {
		utilities.webDriverWait(driver, Save_button);
		driver.findElement(Save_button).click();
		utilities.MinimumWait(driver);
		
	}

	public void Select_the_IPO(String ipo) throws Throwable {
		utilities.webDriverWait(driver, IPO);
		driver.findElement(IPO).click();
		Thread.sleep(3000);
		driver.findElement(Enter_IPO).sendKeys("IPO21");
		Thread.sleep(1000);
		Robot select_ipo = new Robot();
		select_ipo.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		
	}

	public void Click_on_Print_icon_in_grid() throws Throwable {
		utilities.webDriverWait(driver, Print_Icon);
		driver.findElement(Print_Icon).click();
		utilities.MinimumWait(driver);
		
	}

	public void verify_that_user_navigated_to_print_screen() throws Throwable {
		utilities.webDriverWait(driver, Print_Challan_Num);
		WebElement ChallanNum = driver.findElement(Print_Challan_Num);
		String ChlNm = ChallanNum.getText();
		System.out.println(ChlNm);
		utilities.MinimumWait(driver);
		
	}

	public void Click_on_print_button_to_view_system_print() throws Throwable {
		utilities.webDriverWait(driver, Print_Button);
		driver.findElement(Print_Button).click();
		Thread.sleep(1000);
		driver.navigate().refresh();
		Thread.sleep(1000);
		
	}

	public void Click_on_Approve_icon_and_approve_the_out_challan() throws Throwable {
		utilities.webDriverWait(driver, Approve_icon);
		driver.findElement(Approve_icon).click();
		Thread.sleep(1000);
		String confirmationText = driver.findElement(Conf_Approve).getText();
		System.out.println(confirmationText);
		Thread.sleep(1000);
		
		driver.findElement(Conf_Yes_Approve).click();
		utilities.MinimumWait(driver);
		
	}

	public void Select_the_source_as_supplier() throws Throwable {
		utilities.webDriverWait(driver, Source_dropdown);
		driver.findElement(Source_dropdown).click();
		Robot select_supplier = new Robot();
		select_supplier.keyPress(KeyEvent.VK_DOWN);
		select_supplier.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
	}

	public void Select_the_Supplier_Name(String suppliername) throws Throwable {
		utilities.webDriverWait(driver, Supplier_Name);
		driver.findElement(Supplier_Name).click();
		WebElement SupplierName = driver.findElement(Supplier_Name);
		Select Supplier = new Select(SupplierName);
		Supplier.selectByVisibleText(suppliername);
		Thread.sleep(1000);
	}

	
	
	
	
}
