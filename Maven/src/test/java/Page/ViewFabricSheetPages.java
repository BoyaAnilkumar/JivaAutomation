package Page;

import java.util.Iterator;
import java.util.Set;

//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import com.mongodb.MapReduceCommand.OutputType;

import io.cucumber.messages.com.google.protobuf.compiler.PluginProtos.CodeGeneratorResponse.File;
import util.DriverFactory;
import util.Utilities;

public class ViewFabricSheetPages extends DriverFactory{
	Utilities utilities = new Utilities();
	
	By txtUN = By.xpath("//input[@id='userName']");
	By txtPwd = By.xpath("//input[@id='userpassword']");
	By btnSignIn = By.xpath("//button[@class='btn btn-block btn-primary btn-lg font-weight-medium auth-form-btn']");
	By Woven = By.xpath("//span[text()='Woven / knit']");
	By Merchandising = By.xpath("(//span[text()='Merchandising '])[1]");
	By ViewFabricSheet = By.xpath("//a[text()='View Fabric Sheet']");
	By ShowHide = By.xpath("//a[@id='sidebarCollapse']");
	By buttFilter = By.xpath("//i[@class=\"pi pi-filter\"]");
	By f_buyer = By.xpath("//p-multiselect[@placeholder='Select Buyer']");
	By f_enterBuyer = By.xpath("//input[@role='textbox']");
	By f_selectBuyer = By.xpath("//div[@class='p-checkbox-box']");
	By f_season = By.xpath("//select[@formcontrolname='seasonId']");
	By f_selectSeason = By.xpath("//option[@value='232']");
	By f_IPOBuyersearch = By.xpath("//input[@formcontrolname='searchText']");
	By f_Apply = By.xpath("//button[@class='btn btn-md btn-primary']");
	By ML_selectIPO = By.xpath("//a[@id='v-pills-tabIPO0210']");
	By GoToTop = By.xpath("//a[@title='Go to Top']");
	By StyleShowHide_collapse = By.xpath("//div[@id='content']/..//a[@id='sidebarCollapse']");
			//i[@class='pi pi-angle-up']");
	By navViewFabricSheet = By.xpath("//h3[text()='View Fabric Sheet']");
	By buttHistory = By.xpath("//button[@class='btn btn-primary btn-sm shadow-sm']");
	By navHistoryPage = By.xpath("//thead[@class='p-datatable-thead']");
	By HisRecord = By.xpath("(//tr[@class='ng-star-inserted'])[2]");
	By buttOpen = By.xpath("(//tr[@class='ng-star-inserted'])[2]/..//a[@class='btn btn-light btn-active-light-primary btn-sm']");
	By buttBack = By.xpath("//button[@class='btn btn-primary btn-sm shadow-sm float-right']");
	By FabricDetails = By.xpath("//u[text()='Fabric Details']");
	By GarmentAvg = By.xpath("//u[text()='Garment Average']");
	By QtyRequirments = By.xpath("//u[text()='Quantity Requirements']");
	By buttViewComboName = By.xpath("//button[text()=' View for Print by Combo Name']");
	By buttViewFabricQuality = By.xpath("//button[text()=' View for Print by Fabric Quality']");
	By buttViewFabricSheet = By.xpath("//button[text()=' View for Print by Fabric Sheet']");
	By PrintForm = By.xpath("//h3[text()='Fabric Sheet | TestIPO']");
	By PF_buttPrint = By.xpath("//button[@id='printpagebutton']");
	By PF_buttCancle = By.xpath("//button[@id='closepagebutton']");
	By PrintScreen = By.xpath("//div[@id=\"sizer\"]");
	By PS_Cancel = By.xpath("");
	
	

	public void Navigate_to_the_Login_page() {
		driver.get(prop.getProperty("url"));		
	}

	public void Enter_valid_Username_and_Password() {
		driver.findElement(txtUN).clear();
		driver.findElement(txtUN).sendKeys(prop.getProperty("username"));
//		utilities.MinimumWait(driver);
		driver.findElement(txtPwd).clear();
		driver.findElement(txtPwd).sendKeys(prop.getProperty("password"));
	}

	public void Click_on_SignIn_in_the_login_page() {
		driver.findElement(btnSignIn).click();
	}

	public void Click_on_Woven_Module() throws Throwable {
		utilities.webDriverWait(driver, Woven);
		driver.findElement(Woven).click();
		
	}

	public void Click_on_Merchandising_module() throws Throwable {
		utilities.webDriverWait(driver, Merchandising);
		driver.findElement(Merchandising).click();
	}

	public void Click_on_View_Fabric_Sheet_module() throws Throwable {
		utilities.webDriverWait(driver, ViewFabricSheet);
		driver.findElement(ViewFabricSheet).click();
	}

	public void Click_on_Style_showhide_button() throws Throwable {
		utilities.webDriverWait(driver, ShowHide);
		driver.findElement(ShowHide).click();
	}

	public void Click_on_Filter_button_in_the_Menu_list() throws Throwable {
		utilities.webDriverWait(driver, buttFilter);
		driver.findElement(buttFilter).click();
	}

	public void Verifying_the_Buyer_field_for_selecting_a_Buyer() throws Throwable {
		utilities.webDriverWait(driver, f_buyer);
		driver.findElement(f_buyer).click();
		System.out.println("Clicked in the buyer field");
		driver.findElement(f_enterBuyer).sendKeys("Ann Taylor Sleep");
		Thread.sleep(3000);
		System.out.println("Entered Buyer name in the Buyer field");
		driver.findElement(f_selectBuyer).click();
		
		driver.findElement(f_buyer).click();
//		WebElement Bname = driver.findElement(f_selectBuyer);
//		String BuyerName = Bname.getText();
//		System.out.println("Print the selected Buyer Name : " + BuyerName);
		
	}

	public void Verify_whether_the_user_is_able_to_select_a_Season_in_the_season_field() throws Throwable {
		utilities.webDriverWait(driver, f_season);
		driver.findElement(f_season).click();
		driver.findElement(f_selectSeason).click();
		WebElement Sec_Season = driver.findElement(f_selectSeason);
		String selectSeason = Sec_Season.getText();
		System.out.println("Display the selected Season : " + selectSeason);
	}

	public void Enter_the_IPO_or_Buyer_in_the_Search_by_Buyer_Style_or_IPO_field() throws Throwable {
		utilities.webDriverWait(driver, f_IPOBuyersearch);
		driver.findElement(f_IPOBuyersearch).sendKeys("IPO0210");
	}

	public void Click_on_Apply_button() throws Throwable {
		utilities.webDriverWait(driver, f_Apply);
		driver.findElement(f_Apply).click();
		
	}

	public void Check_whether_the_respective_IPO_is_displayed_or_not_in_the_Menu_List() throws Throwable {
		utilities.webDriverWait(driver, ML_selectIPO);
		WebElement EnteredIPO = driver.findElement(ML_selectIPO);
		String IPOname = EnteredIPO.getText();
		System.out.println("IPO/Style name : " + IPOname);
	}

	public void Select_the_IPO_in_the_Menu_List() throws Throwable {
		utilities.webDriverWait(driver, ML_selectIPO);
		driver.findElement(ML_selectIPO).click();
		System.out.println("IPO Selected");
		utilities.MediumWait(driver);
		driver.findElement(GoToTop).click();
		utilities.MediumWait(driver);
		//utilities.WaitUntilPageIsLoaded(driver);
		driver.findElement(ShowHide).click();
		utilities.WaitUntilPageIsLoaded(driver);
		System.out.println("Clicked on Show/hide button");
	}

	public void Check_whether_the_page_is_navigated_to_the_View_Fabric_Sheet() throws Throwable {
		utilities.webDriverWait(driver, navViewFabricSheet);
		WebElement VFS = driver.findElement(navViewFabricSheet);
		String ViewFabricSheet = VFS.getText();
		System.out.println("Navigated to : " + ViewFabricSheet);
	}

	public void Click_on_the_History_button() throws Throwable {
		utilities.webDriverWait(driver, buttHistory);
		driver.findElement(buttHistory).click();
	}

	public void Check_whether_page_is_navigated_to_the_History_page_or_not() throws Throwable {
		utilities.webDriverWait(driver, navHistoryPage);
		driver.findElement(navHistoryPage).isDisplayed();
		WebElement VFS = driver.findElement(navHistoryPage);
		String ViewFabricSheet = VFS.getText();
		System.out.println("Navigated to : " + ViewFabricSheet);
	}

	public void Verify_whether_the_history_records_are_there_or_not() throws Throwable {
		utilities.webDriverWait(driver, HisRecord);
		driver.findElement(HisRecord).isDisplayed();
		driver.findElement(buttOpen).click();
//		driver.get("http://182.18.157.215/JivaDesign_Test/JivaDesignFileRepository_Test/FileRepository/2023/10/26/IPOFabricSheetHistory/20231026063101646.pdf");
	}

	public void Verify_whether_the_Open_button_is_clickable_for_the_history_record() {
		
		
	}

	public void Verify_whether_the_page_is_navigated_to_the_PDF_form_or_not() throws Throwable {
//		driver.get("http://182.18.157.215/JivaDesign_Test/JivaDesignFileRepository_Test/FileRepository/2023/10/26/IPOFabricSheetHistory/20231026063101646.pdf");
		String parent=driver.getWindowHandle();
		Set<String>s=driver.getWindowHandles();
		Iterator<String> I1= s.iterator();
		while(I1.hasNext())
		{
			String child_window=I1.next();
			if(!parent.equals(child_window))
			{
				driver.switchTo().window(child_window);
				utilities.MediumWait(driver);
				driver.switchTo().window(parent);
				utilities.MediumWait(driver);
			}
		}

		}

	public void Verify_whether_the_Back_button_is_clickable() throws Throwable {
		utilities.webDriverWait(driver, buttBack);
		driver.findElement(buttBack).click();
	}

	public void Check_whether_page_is_navigated_to_the_View_Fabric_Sheet_or_not() throws Throwable {
		utilities.webDriverWait(driver, navViewFabricSheet);
		driver.findElement(navViewFabricSheet).click();
		
	}

	public void Verify_whether_the_added_fabrics_are_displayed_or_not_on_clicking_the_Fabric_Details_link() {
//		utilities.webDriverWait(driver, FabricDetails);
		driver.findElement(FabricDetails).click();
	}

	public void Verify_whether_the_added_fabrics_Garment_Average_records_are_displayedornot_on_clicking_the_Garment_Average_link() throws Throwable {
		utilities.webDriverWait(driver, GarmentAvg);
		driver.findElement(GarmentAvg).click();		
	}

	public void Verify_whether_the_added_fabrics_Quantity_Requirment_records_are_displayed_or_not_on_clicking_the_Quantity_Requirment_link() throws Throwable {
		utilities.webDriverWait(driver, QtyRequirments);
		driver.findElement(QtyRequirments).click();
	}

	public void Verify_whether_page_is_navigating_to_the_Print_form_on_clicking_the_View_For_Print_By_Combo_Name_button_with_Print_and_Cancel_buttons() throws Throwable {
		utilities.webDriverWait(driver, buttViewComboName);
		driver.findElement(buttViewComboName).click();
		driver.findElement(PrintForm).isDisplayed();
		utilities.MediumWait(driver);
	}

	public void Verify_whether_the_Print_button_is_clickable() throws Throwable {
		utilities.webDriverWait(driver, PF_buttPrint);
		driver.findElement(PF_buttPrint).click();
		utilities.MediumWait(driver);
	}

	public void Verify_whether_the_page_is_navigating_to_the_Print_screen_with_the_Print_and_Cancel_buttons() throws Throwable {
		driver.findElement(PrintScreen).isDisplayed();
		String parent=driver.getWindowHandle();
		Set<String>s=driver.getWindowHandles();
		Iterator<String> I1= s.iterator();
		while(I1.hasNext())
		{
			String child_window=I1.next();
			if(!parent.equals(child_window))
			{
				driver.switchTo().window(child_window);
				utilities.MediumWait(driver);
				driver.switchTo().window(parent);
				utilities.MediumWait(driver);
			}
		}
		
	}
	public void Verify_whether_the_page_is_navigating_to_the_View_Fabric_Sheet_on_OnClick_the_Cancel_button_in_the_Print_Form() throws Throwable {
		utilities.webDriverWait(driver, PF_buttCancle);
		driver.findElement(PF_buttCancle).click();
		driver.findElement(navViewFabricSheet).isDisplayed();
		driver.findElement(buttViewComboName).click();
		
	}

	public void Verify_whether_page_is_navigating_to_the_Print_form_on_clicking_the_View_For_Print_By_Fabric_Quality_button() throws Throwable {
		utilities.webDriverWait(driver, buttViewFabricQuality);
		driver.findElement(buttViewFabricQuality).click();
		driver.findElement(PrintForm).isDisplayed();
		
	}

	public void Verify_whether_page_is_navigating_to_the_Print_form_on_clicking_the_View_For_Print_By_Fabric_Sheet_button() throws Throwable {
		utilities.webDriverWait(driver, buttViewFabricSheet);
		driver.findElement(buttViewFabricSheet).click();
		driver.findElement(PrintForm).isDisplayed();
		
	}

}
