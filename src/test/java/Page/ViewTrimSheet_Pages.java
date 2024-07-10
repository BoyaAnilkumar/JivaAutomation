package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import util.DriverFactory;
import util.Utilities;

public class ViewTrimSheet_Pages extends DriverFactory{
	
	Utilities utilities = new Utilities();
	
	By View_trim_Sheet = By.xpath("//a[text()=' View Trim Sheet ']");
	By f_buyer = By.xpath("//p-multiselect[@placeholder='Select Buyer']");
	By f_enterBuyer = By.xpath("//input[@role='textbox']");
	By f_selectBuyer = By.xpath("//div[@class='p-checkbox-box']");
	By f_season = By.xpath("//select[@formcontrolname='seasonId']");
	By f_selectSeason = By.xpath("//option[@value='232']");
	By f_SearchByIPO = By.xpath("//input[@formcontrolname='searchText']");
	By f_Apply = By.xpath("//button[@class='btn btn-md btn-primary']");
	By ShowHide = By.xpath("//a[@id='sidebarCollapse']");
	By buttFilter = By.xpath("//i[@class=\"pi pi-filter\"]");
	By f_Reset = By.xpath("//button[@type='reset']");
	By ML_selectIPO = By.xpath("//div[@id='v-pills-tab']");
	By IPO_Details = By.xpath("//ul[@class='row view-details']");
	By Merchant_Team_Responsibility = By.xpath("//u[text()='Merchant Team Responsibility']");
	By Trim_Team_Responsibility = By.xpath("//u[text()='Trim Team Responsibility']");
	By Merchant_Data = By.xpath("(//p-table[@styleclass='p-datatable card mt-0'])[1]");
	By Trim_Data = By.xpath("(//p-table[@styleclass='p-datatable card mt-0'])[2]");
	By View_for_Print_By_Item = By.xpath("//button[text()=' View for Print by Item ']");
	By View_for_Print_By_Trim_Sheet = By.xpath("//button[text()=' View for Print by Trim Sheet ']");
	By Cancel_Print = By.xpath("//button[@id='closepagebutton']");
	By History = By.xpath("//i[@class='fa fa-history']");
	By No_Data = By.xpath("//td[text()='No Data Found.']");
	By Back_button = By.xpath("//button[text()=' Back ']");
	
	

	public void Click_on_View_Trim_Sheet() throws Throwable {
		utilities.webDriverWait(driver, View_trim_Sheet);
		driver.findElement(View_trim_Sheet).click();
		utilities.MinimumWait(driver);
		
		
	}


	public void Select_the_Buyer_from_dropdown_list() throws Throwable {
		utilities.webDriverWait(driver, f_buyer);
		driver.findElement(f_buyer).click();
		Thread.sleep(1000);
		driver.findElement(f_enterBuyer).sendKeys("Amazon (core)");
		Thread.sleep(1000);
		driver.findElement(f_selectBuyer).click();
		Thread.sleep(1000);
		
	}


	public void Enter_IPO_number_in_Search_By_IPO_field() throws Throwable {
		utilities.webDriverWait(driver, f_SearchByIPO);
		driver.findElement(f_SearchByIPO).click();
		Thread.sleep(1000);
		driver.findElement(f_SearchByIPO).sendKeys("1306");
		Thread.sleep(1000);

	}


	public void Reset_the_applied_filter_and_click_on_Apply_button() throws Throwable {
		utilities.webDriverWait(driver, ShowHide);
		driver.findElement(ShowHide).click();
		Thread.sleep(1000);
		driver.findElement(buttFilter).click();
		Thread.sleep(1000);
		utilities.webDriverWait(driver, f_Reset);
		driver.findElement(f_Reset).click();
		
		
	}


	public void Click_on_the_IPO_in_view_trim_sheet() throws Throwable {
		driver.findElement(ShowHide).click();
		Thread.sleep(1000);
		utilities.webDriverWait(driver, ML_selectIPO);
		driver.findElement(ML_selectIPO).click();
		utilities.MinimumWait(driver);
		
		
		
	}


	public void IPO_details_are_displaying_for_Trim_Sheet() throws Throwable {
		utilities.webDriverWait(driver, IPO_Details);
		WebElement ipo = driver.findElement(IPO_Details);
		String ipodetails = ipo.getText();System.out.println();
		System.out.println("Displaying these data on screen" + ipodetails);
		Thread.sleep(1000);System.out.println();
		
	}


	public void verify_the_Merchant_data_and_Trim_data() throws Throwable {
		utilities.webDriverWait(driver, Merchant_Team_Responsibility);
		WebElement Merchant = driver.findElement(Merchant_Team_Responsibility);
		String MerchantTeam = Merchant.getText();System.out.println();
		System.out.println("Displaying Merchant Team" + MerchantTeam);System.out.println();
		Thread.sleep(1000);
		driver.findElement(Merchant_Team_Responsibility).click(); //clickable function for the accordian
		Thread.sleep(7000);
		driver.findElement(Merchant_Team_Responsibility).click();
		Thread.sleep(1000);
		
		utilities.webDriverWait(driver, Merchant_Data);
		WebElement Mer_data = driver.findElement(Merchant_Data);
		String Merchantdata = Mer_data.getText(); System.out.println();
		System.out.println("Displaying Merchant Team Responsibility data in grid" + Merchantdata);
		System.out.println();
		
		utilities.webDriverWait(driver, Trim_Team_Responsibility);
		WebElement Trim = driver.findElement(Trim_Team_Responsibility);
		String Trimteam = Trim.getText();System.out.println();
		System.out.println("Displaying Trim Team" + Trimteam);
		System.out.println();
		Thread.sleep(1000);
		driver.findElement(Trim_Team_Responsibility).click(); //clickable function for the accordian
		Thread.sleep(7000);
		
		
		utilities.webDriverWait(driver, Trim_Data);
		WebElement Trim_data = driver.findElement(Trim_Data);
		String trimteamdata = Trim_data.getText();
		System.out.println();
		System.out.println("Displaying Trim Data" + trimteamdata);
		System.out.println();
		
	}


	public void click_on_View_for_Print_by_Item_button() throws Throwable {
		utilities.webDriverWait(driver, View_for_Print_By_Item);
		driver.findElement(View_for_Print_By_Item).click();
		Thread.sleep(5000);
		
		utilities.webDriverWait(driver, Cancel_Print);
		driver.findElement(Cancel_Print).click();
		Thread.sleep(5000);
		
		utilities.webDriverWait(driver, View_for_Print_By_Trim_Sheet);
		driver.findElement(View_for_Print_By_Trim_Sheet).click();
		Thread.sleep(5000);
		
		utilities.webDriverWait(driver, Cancel_Print);
		driver.findElement(Cancel_Print).click();
		Thread.sleep(5000);
		
	}


	public void Click_on_History_button_to_view_history_of_the_IPO() throws Throwable {
		utilities.webDriverWait(driver, History);
		driver.findElement(History).click();
		utilities.MinimumWait(driver);
		
		WebElement grid_data = driver.findElement(No_Data);
		String data = grid_data.getText();
		String expecteddata = "No Data Found.";
		
		if(expecteddata.equals(data)) {
			driver.findElement(Back_button);
			System.out.println("data is not displayed on grid " + data);
		}else {
			System.out.println("Data is displayed on grid ");
		}
	}

	
	
}
