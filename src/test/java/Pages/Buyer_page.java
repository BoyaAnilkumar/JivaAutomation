package Pages;

import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import util.DriverFactory;
import util.Utilities;

public class Buyer_page extends DriverFactory {

	Utilities utilities = new Utilities();

	By username                 =  By.xpath("//input[@id='userName']");
	By password                 =  By.xpath("//input[@id='userpassword']");
	By Signin                   =  By.xpath("//button[text()='Sign In']");

	By Master                   =  By.xpath("//span[text()='Masters ']");
	By Buyer                    =  By.xpath("//a[text()='Buyer']");

	By Addbutton                =  By.xpath("//button[@class='btn btn-primary btn-sm shadow-sm float-right ng-star-inserted']");
	By Savebutton               =  By.xpath("//button[text()=' Save']");
	By Alertmsg                 =  By.xpath("//h2[text()='Mandatory Fields Are Required With  Valid Data.']");
	By Buyernamevalidation      =  By.xpath("(//div[@class='invalid-feedback validation-msg ng-star-inserted'])[1]");
	By Buyername                =  By.xpath("(//input[@type='text'])[1]");

	By Countryname              =  By.xpath("//select[@formcontrolname='countryid']");
	By Countryvalidation        =  By.xpath("//div[@data-validate='Country Name is required']");
	By Selectcountryname        =  By.xpath("//option[text()=' Bharat']");
	By SelectBuyinghousename    =  By.xpath("//select[@formcontrolname='buyingHouseId']");
	By SelectCommissiontype     =  By.xpath("//select[@formcontrolname='commissionTypeId']");
	By Commission               =  By.xpath("(//input[@type='text'])[2]");

	By Cancelbutton             =  By.xpath("//button[text()=' Cancel']");

	By EditiconTest01           =  By.xpath("(//i[@class='ti-pencil-alt'])[9]");
	By Updatebutton             =  By.xpath("//button[@class='btn btn-md btn-primary px-5 ng-star-inserted']");
	By alertmsgupdate           =  By.xpath("//h2[text()='Record saved successfully']");
	By Searchbox                =  By.xpath("//input[@placeholder='Search keyword']");
	By NoDataFound              =  By.xpath("//td[text()='No Data Found.']");

	By SortingByColumns         =  By.xpath("(//tr[@class='ng-star-inserted'])[1]");

	By BuyerNameFilter          =  By.xpath("(//button[@type='button'])[2]");
	By Firstdropdown            =  By.xpath("//span[@id='pr_id_3_label']");
	By SelectMatchAny           =  By.xpath("//li[@aria-label='Match Any']");
	By Seconddropdown           =  By.xpath("//span[@id='pr_id_4_label']");
	By Selectcontains           =  By.xpath("//span[text()='Contains']");
	By Searchtextbox            =  By.xpath("//input[@class='p-inputtext p-component p-element ng-star-inserted']");
	By applybutton              =  By.xpath("//span[text()='Apply']");
	By clearbutton              =  By.xpath("//span[text()='Clear']");

	By BuyingHouseNameFilter    =  By.xpath("(//button[@type='button'])[3]");
	By CountryFilter            =  By.xpath("(//button[@type='button'])[4]");
	By CommissionTypeFilter     =  By.xpath("(//button[@type='button'])[5]");

	public void User_navigates_to_Login_page() {
		driver.get(prop.getProperty("url"));
	}

	
	public void Click_on_the_master_module() throws Throwable {

		utilities.webDriverWait(driver, Master);
		driver.findElement(Master).click();
		utilities.MinimumWait(driver);

	}

	public void Click_on_the_buyer_screen() throws Throwable {

		utilities.webDriverWait(driver, Buyer);
		driver.findElement(Buyer).click();
		String ScreenName = driver.findElement(Buyer).getAttribute("value");
		System.out.println("Navigated to the " + ScreenName  +  "Screen");
		utilities.MinimumWait(driver);

		
	}

	public void Click_on_the_Add_button_above_the_grid() throws Throwable {

		utilities.webDriverWait(driver, Addbutton);
		driver.findElement(Addbutton).click();
		utilities.MinimumWait(driver);
	}

	public void Click_on_the_save_button() throws Throwable {

		utilities.webDriverWait(driver, Savebutton);
		driver.findElement(Savebutton).click();

		WebElement message = driver.findElement(Alertmsg);
		String actualMessage = message.getText();

		String expectedMessage = "Mandatory Fields Are Required With Valid Data.";

		if (expectedMessage.equals(actualMessage)) {
			System.out.println("Alert message is correct:: " + actualMessage);
		} else {
			System.out.println("Alert message is incorrect::" + actualMessage);
		}

	}

	public void Check_validation_msg_Placeholder_and_enter_Buyer_name() throws Throwable {

		WebElement message = driver.findElement(Buyernamevalidation);
		String validationmsg = message.getAttribute("data-validate");
		System.out.println("Validation msg is: " + validationmsg);
		utilities.MinimumWait(driver);

		WebElement placeholdername = driver.findElement(Buyername);
		String placeholderv = placeholdername.getAttribute("placeholder");
		System.out.println("Placeholder value: " + placeholderv);
		utilities.MinimumWait(driver);

		utilities.webDriverWait(driver, Buyername);
		driver.findElement(Buyername).sendKeys("Test04");
		utilities.MinimumWait(driver);

	}

	public void Check_validation_message_placeholder_and_select_the_country_name() throws Throwable {

		WebElement hoverElement = driver.findElement(Countryname);
		Actions actions = new Actions(driver);
		actions.moveToElement(hoverElement).perform();
		actions.click();

		utilities.MinimumWait(driver);

		WebElement message = driver.findElement(Countryvalidation);
		String validationmsg = message.getAttribute("data-validate");
		System.out.println("Validation msg is: " + validationmsg);
		utilities.MinimumWait(driver);

		WebElement placeholdername = driver.findElement(Countryname);
		String placeholderv = placeholdername.getAttribute("data-toggle");
		System.out.println("Placeholder value: " + placeholderv);
		utilities.MinimumWait(driver);

		utilities.webDriverWait(driver, Countryname);
		driver.findElement(Countryname).click();
		utilities.MinimumWait(driver);

		utilities.webDriverWait(driver, Selectcountryname);
		driver.findElement(Selectcountryname).click();
		utilities.MinimumWait(driver);

	}

	public void Select_the_Buying_house_name() throws Throwable {

		WebElement dropdownElement = driver.findElement(SelectBuyinghousename);
		Select dropdown = new Select(dropdownElement);
		dropdown.selectByIndex(5);
		utilities.MaximumWait(driver);
	}

	public void Select_commission_type() throws Throwable {

		WebElement commissiondropdown = driver.findElement(SelectCommissiontype);
		Select dropdown = new Select(commissiondropdown);
		dropdown.selectByIndex(2);
		utilities.MinimumWait(driver);
	}

	public void Enter_the_commission() throws Throwable {

		utilities.webDriverWait(driver, Commission);
		driver.findElement(Commission).sendKeys("11");
		utilities.MinimumWait(driver);

	}

	public void Click_on_the_save() throws Throwable {

//		utilities.webDriverWait(driver, Savebutton);
//		driver.findElement(Savebutton).click();
//		utilities.MaximumWait(driver);	

		utilities.webDriverWait(driver, Cancelbutton);
		driver.findElement(Cancelbutton).click();
		utilities.MaximumWait(driver);

		System.out.println("After clicking the cancel button, you will be redirected to the buyer's home screen.");
		utilities.MinimumWait(driver);

	}

	public void Update_the_buyer_record_by_clicking_on_the_edit_icon() throws Throwable {

		utilities.webDriverWait(driver, EditiconTest01);
		driver.findElement(EditiconTest01).click();
		utilities.MaximumWait(driver);

		utilities.webDriverWait(driver, SelectBuyinghousename);
		WebElement dropdownElement = driver.findElement(SelectBuyinghousename);
		Select dropdown = new Select(dropdownElement);
		dropdown.selectByIndex(8);

		utilities.webDriverWait(driver, Commission);
		driver.findElement(Commission).clear();
		utilities.MinimumWait(driver);
		driver.findElement(Commission).sendKeys("1001");
		utilities.MinimumWait(driver);

		utilities.webDriverWait(driver, Updatebutton);
		driver.findElement(Updatebutton).click();
		utilities.MinimumWait(driver);

		WebElement message = driver.findElement(alertmsgupdate);
		String actualMessage = message.getText();

		String expectedMessage = "Record saved successfully";

		if (expectedMessage.equals(actualMessage)) {
			System.out.println("Update alert message is correct:: " + actualMessage);
		} else {
			System.out.println("Update alert message is incorrect::" + actualMessage);
		}

		System.out.println("Recent record is updated successfully.");
		utilities.MinimumWait(driver);

	}

	public void Search_result_by_using_search_box_functionality() throws Throwable {

		driver.navigate().refresh();
		String[] searchdata = { "Test01", "28552", "7984", "Asmara", "Bharat", "Deductable", "Invalid Record" };

		utilities.webDriverWait(driver, Searchbox);
		WebElement searchBox = driver.findElement(Searchbox);

		for (int i = 0; i < searchdata.length; i++) {
			try {

				utilities.MinimumWait(driver);

				driver.findElement(Searchbox).click();
				driver.findElement(Searchbox).clear();
				utilities.MinimumWait(driver);

				searchBox.sendKeys(searchdata[i]);

				if (isNameValidInSearchBox(searchdata[i])) {
					System.out.println("Search data is valid: " + searchdata[i]);
				
				} else {
					System.out.println("Search data is NOT valid: " + searchdata[i]);
				}

			} catch (NoSuchElementException e) {
				// Handle the exception if the element is not found
				System.out.println("Search box not found or element not visible. Skipping entry: " + searchdata[i]);
			} catch (InterruptedException e) {
				// Handle the InterruptedException if needed
				e.printStackTrace();

			}
		}
	}

	private boolean isNameValidInSearchBox(String name) {

		return name.length() >= 3;
	}

	
	public void check_the_sorting_functionality_of_the_table_grid() throws Throwable {

		driver.navigate().refresh();

		WebElement table = driver.findElement(SortingByColumns);
		List<WebElement> columnheader = table.findElements(By.xpath("th"));

		for (WebElement header : columnheader) { 

			header.click();
			utilities.MinimumWait(driver);
			header.click();
			utilities.MinimumWait(driver);
		}
	}

	public void Buyer_Name_filter_search() throws Throwable {

		driver.navigate().refresh();
		// Below code with valid data

		utilities.webDriverWait(driver, BuyerNameFilter);
		driver.findElement(BuyerNameFilter).click();
		utilities.MinimumWait(driver);

		utilities.webDriverWait(driver, Firstdropdown);
		driver.findElement(Firstdropdown).click();
		utilities.webDriverWait(driver, SelectMatchAny);
		driver.findElement(SelectMatchAny).click();

		utilities.webDriverWait(driver, Seconddropdown);
		driver.findElement(Seconddropdown).click();
		utilities.webDriverWait(driver, Selectcontains);
		driver.findElement(Selectcontains).click();

		utilities.webDriverWait(driver, Searchtextbox);
		driver.findElement(Searchtextbox).sendKeys("test");

		utilities.webDriverWait(driver, applybutton);
		driver.findElement(applybutton).click();
		utilities.MinimumWait(driver);

		// Invalid data buyer filter search
		utilities.webDriverWait(driver, BuyerNameFilter);
		driver.findElement(BuyerNameFilter).click();
		utilities.MinimumWait(driver);

		driver.findElement(clearbutton).click();
		utilities.MinimumWait(driver);

		utilities.webDriverWait(driver, Searchtextbox);
		driver.findElement(Searchtextbox).sendKeys("Invalid data");

		utilities.webDriverWait(driver, applybutton);
		driver.findElement(applybutton).click();
		utilities.MinimumWait(driver);

		driver.navigate().refresh();

	}

	public void Buying_House_Name_filter_search() throws Throwable {

		driver.navigate().refresh();
		// Below code with valid data

		utilities.webDriverWait(driver, BuyingHouseNameFilter);
		driver.findElement(BuyingHouseNameFilter).click();
		utilities.MinimumWait(driver);

		utilities.webDriverWait(driver, Firstdropdown);
		driver.findElement(Firstdropdown).click();
		utilities.webDriverWait(driver, SelectMatchAny);
		driver.findElement(SelectMatchAny).click();

		utilities.webDriverWait(driver, Seconddropdown);
		driver.findElement(Seconddropdown).click();
		utilities.webDriverWait(driver, Selectcontains);
		driver.findElement(Selectcontains).click();

		utilities.webDriverWait(driver, Searchtextbox);
		driver.findElement(Searchtextbox).sendKeys("My Buying House");

		utilities.webDriverWait(driver, applybutton);
		driver.findElement(applybutton).click();
		utilities.MinimumWait(driver);

		// Invalid data buyer filter search
		utilities.webDriverWait(driver, BuyingHouseNameFilter);
		driver.findElement(BuyingHouseNameFilter).click();
		utilities.MinimumWait(driver);

		driver.findElement(clearbutton).click();
		utilities.MinimumWait(driver);

		utilities.webDriverWait(driver, Searchtextbox);
		driver.findElement(Searchtextbox).sendKeys("Invalid data");

		utilities.webDriverWait(driver, applybutton);
		driver.findElement(applybutton).click();
		utilities.MinimumWait(driver);

		driver.navigate().refresh();
	}

	public void Country_filter_search() throws Throwable {

		driver.navigate().refresh();
		// Below code with valid data

		utilities.webDriverWait(driver, CountryFilter);
		driver.findElement(CountryFilter).click();
		utilities.MinimumWait(driver);

		utilities.webDriverWait(driver, Firstdropdown);
		driver.findElement(Firstdropdown).click();
		utilities.webDriverWait(driver, SelectMatchAny);
		driver.findElement(SelectMatchAny).click();

		utilities.webDriverWait(driver, Seconddropdown);
		driver.findElement(Seconddropdown).click();
		utilities.webDriverWait(driver, Selectcontains);
		driver.findElement(Selectcontains).click();

		utilities.webDriverWait(driver, Searchtextbox);
		driver.findElement(Searchtextbox).sendKeys("Bharat");

		utilities.webDriverWait(driver, applybutton);
		driver.findElement(applybutton).click();
		utilities.MinimumWait(driver);

		// Invalid data buyer filter search
		utilities.webDriverWait(driver, CountryFilter);
		driver.findElement(CountryFilter).click();
		utilities.MinimumWait(driver);

		driver.findElement(clearbutton).click();
		utilities.MinimumWait(driver);

		utilities.webDriverWait(driver, Searchtextbox);
		driver.findElement(Searchtextbox).sendKeys("Invalid data");

		utilities.webDriverWait(driver, applybutton);
		driver.findElement(applybutton).click();
		utilities.MinimumWait(driver);

		driver.navigate().refresh();
	}

	public void Commission_Type_filter_search() throws Throwable {

		driver.navigate().refresh();
		// Below code with valid data

		utilities.webDriverWait(driver, CommissionTypeFilter);
		driver.findElement(CommissionTypeFilter).click();
		utilities.MinimumWait(driver);

		utilities.webDriverWait(driver, Firstdropdown);
		driver.findElement(Firstdropdown).click();
		utilities.webDriverWait(driver, SelectMatchAny);
		driver.findElement(SelectMatchAny).click();

		utilities.webDriverWait(driver, Seconddropdown);
		driver.findElement(Seconddropdown).click();
		utilities.webDriverWait(driver, Selectcontains);
		driver.findElement(Selectcontains).click();

		utilities.webDriverWait(driver, Searchtextbox);
		driver.findElement(Searchtextbox).sendKeys("Deductable");

		utilities.webDriverWait(driver, applybutton);
		driver.findElement(applybutton).click();
		utilities.MinimumWait(driver);

		// Invalid data buyer filter search
		utilities.webDriverWait(driver, CommissionTypeFilter);
		driver.findElement(CommissionTypeFilter).click();
		utilities.MinimumWait(driver);

		driver.findElement(clearbutton).click();
		utilities.MinimumWait(driver);

		utilities.webDriverWait(driver, Searchtextbox);
		driver.findElement(Searchtextbox).sendKeys("Invalid data");

		utilities.webDriverWait(driver, applybutton);
		driver.findElement(applybutton).click();
		utilities.MinimumWait(driver);

		driver.navigate().refresh();
	}

}