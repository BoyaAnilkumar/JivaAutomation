package Page;

import org.openqa.selenium.By;

import util.DriverFactory;
import util.Utilities;

public class TrimSheetAudit_pages extends DriverFactory {

	Utilities util = new Utilities();
	
	By Audit = By.xpath("(//span[text()='Audit '])[1]");
	By Data_Entry = By.xpath("(//span[text()='Data Entry'])[2]");
	By Trim_Sheet_Audit = By.xpath("//a[text()='Trim Sheet Audit']");
	By Styles_Expansion = By.xpath("//a[@id='sidebarCollapse']");
	By IPO_selection = By.xpath("//div[@id='v-pills-tab']");
	By IPO_details = By.xpath("//ul[@class='row view-details mb-3']");
	By Costing_Budget = By.xpath("(//td//button[@type='button'])[1]");
	By Costing_Budget_expansion_details = By.xpath("//td//div[@id='pr_id_27']");
	By Production_Budget = By.xpath("(//td//button[@type='button'])[2]");
	By Production_Budget_expansion_details = By.xpath("//td//div[@id='pr_id_28']");
	By Approve_Button = By.xpath("//button[text()=' Approve']");
	By Reject_Button = By.xpath("//button[text()=' Reject']");
	
	
	public void click_on_Trim_sheet_audit_under_audit_module() throws Throwable {
		util.webDriverWait(driver, Audit);
		driver.findElement(Audit).click();
		util.MinimumWait(driver);
		
		util.webDriverWait(driver, Data_Entry);
		driver.findElement(Data_Entry).click();
		util.MinimumWait(driver);
		
		util.webDriverWait(driver, Trim_Sheet_Audit);
		driver.findElement(Trim_Sheet_Audit).click();
		util.MinimumWait(driver);
		
	}

	public void click_on_Style_expansion() throws Throwable {
		util.webDriverWait(driver, Styles_Expansion);
		driver.findElement(Styles_Expansion).click();
		util.MinimumWait(driver);
		
		
	}

	public void Select_the_IPO_in_styles_expansion() throws Throwable {
		util.webDriverWait(driver, IPO_selection);
		driver.findElement(IPO_selection).click();
		Thread.sleep(2000);
		boolean details = driver.findElement(IPO_details).isDisplayed();
		System.out.println(details);
	}

	public void Click_on_Expansion_icon_for_costing_budget() {
		// TODO Auto-generated method stub
		
	}

	public void Click_on_Expansion_icon_for_production_budget() {
		// TODO Auto-generated method stub
		
	}

	public void Click_on_Approve_button_for_that_ipo() {
		// TODO Auto-generated method stub
		
	}
	
	
}
