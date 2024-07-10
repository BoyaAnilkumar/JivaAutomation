package Page;

import org.openqa.selenium.By;

import util.DriverFactory;
import util.Utilities;

public class Emaillist extends DriverFactory{

	Utilities utilities = new Utilities();
	
	By Email_List = By.xpath("//a[text()='Email List']");
	By Add_Button = By.xpath("//button[text()=' Add ']");
	By po_type = By.xpath("//select[@formcontrolname='typeofPO']");
	By Select_Fabric_PO = By.xpath("//select[@formcontrolname='typeofPO']/.//option[text()=' Fabric PO Creation']");
	By Select_Trim_PO = By.xpath("//select[@formcontrolname='typeofPO']/.//option[text()=' Trims PO Creation']");
	By Email_Address = By.xpath("//input[@formcontrolname='email']");
	By Save_Button = By.xpath("//button[@type='submit']");
	By column_filter_email = By.xpath("(//tr/th/div/p-columnfilter)[2]");
	By Column_Filter_Element_email = By.xpath("//p-columnfilterformelement/input[@class='p-inputtext p-component p-element ng-star-inserted']");
	By Column_Filter_Apply = By.xpath("//div/button/span[text()='Apply']");
	By Edit_Icon = By.xpath("//tbody/tr/td/a[@title='Edit']");
	By Edit_checkbox = By.xpath("//input[@formcontrolname='isActive']");
	By Update_Button = By.xpath("//button[@type='submit']");
	
	
	
	
	public void Click_on_Email_list_screen() throws Throwable {
		utilities.webDriverWait(driver, Email_List);
		driver.findElement(Email_List).click();
		utilities.MinimumWait(driver);
		
	}

	public void Click_on_Add_button_in_Email_list() throws Throwable {
		utilities.webDriverWait(driver, Add_Button);
		driver.findElement(Add_Button).click();
		utilities.MinimumWait(driver);
		
	}

	public void Select_the_Type_of_PO() throws Throwable {
		utilities.webDriverWait(driver, po_type);
		driver.findElement(po_type).click();
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Select_Fabric_PO);
		driver.findElement(Select_Fabric_PO).click();
		utilities.MinimumWait(driver);
		
	}

	public void Enter_the_Email_address() throws Throwable {
		utilities.webDriverWait(driver, Email_Address);
		driver.findElement(Email_Address).sendKeys("anilkumar1@calibrage.in");
		utilities.MinimumWait(driver);
		
	}

	public void click_on_save_button_in_email_list() throws Throwable {
		utilities.webDriverWait(driver, Save_Button);
		driver.findElement(Save_Button).click();
		utilities.MinimumWait(driver);
		
		
	}

	public void Click_on_Filter_icon_for_Email() throws Throwable {
		utilities.webDriverWait(driver, column_filter_email);
		driver.findElement(column_filter_email).click();
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Column_Filter_Element_email);
		driver.findElement(Column_Filter_Element_email).click();
		Thread.sleep(2000);
		driver.findElement(Column_Filter_Element_email).sendKeys("anilkumar1");
		Thread.sleep(3000);
		utilities.webDriverWait(driver, Column_Filter_Apply);
		driver.findElement(Column_Filter_Apply).click();
		utilities.MinimumWait(driver);
		
	}
	
	public void Click_on_Edit_email_list_icon() throws Throwable {
		utilities.webDriverWait(driver, Edit_Icon);
		driver.findElement(Edit_Icon).click();
		utilities.MinimumWait(driver);
		
	}

	public void click_on_Type_of_po_and_select_another_po() throws Throwable {
		utilities.webDriverWait(driver, po_type);
		driver.findElement(po_type).click();
		Thread.sleep(2000);
		driver.findElement(Select_Trim_PO).click();
		utilities.MinimumWait(driver);
		
	}

	public void unselect_the_active_checkbox() throws Throwable {
		utilities.webDriverWait(driver, Edit_checkbox);
		driver.findElement(Edit_checkbox).click();
		utilities.MinimumWait(driver);
		
	}

	public void click_on_update_button() throws Throwable {
		utilities.webDriverWait(driver, Save_Button);
		driver.findElement(Save_Button).click();
		utilities.MaximumLongWait(driver);
		
		utilities.webDriverWait(driver, column_filter_email);
		driver.findElement(column_filter_email).click();
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Column_Filter_Element_email);
		driver.findElement(Column_Filter_Element_email).click();
		Thread.sleep(2000);
		driver.findElement(Column_Filter_Element_email).sendKeys("anilkumar1");
		Thread.sleep(3000);
		utilities.webDriverWait(driver, Column_Filter_Apply);
		driver.findElement(Column_Filter_Apply).click();
		utilities.MinimumWait(driver);
		
	}


}
