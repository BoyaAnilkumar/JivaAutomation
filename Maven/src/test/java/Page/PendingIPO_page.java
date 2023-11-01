package Page;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import util.DriverFactory;
import util.Utilities;

public class PendingIPO_page extends DriverFactory {

	Date currentDate = new Date();
	SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
	String formattedDate = dateFormat.format(currentDate);

	Utilities utilities = new Utilities();

//Login credentials of Audit Manager
	By username = By.xpath("//input[@name='username']");
	By Password = By.xpath("//input[@name='password']");
	By SignIn = By.xpath("//button[text()='Sign In']");

//Navigate to Pending IPO list screen
	By Woven = By.xpath("//span[text()='Woven / knit']");
	By AuditModule = By.xpath("(//span[text()='Audit '])[1]");
	By PendingIPOlist = By.xpath("(//a[text()='Pending IPO List'])[1]");
	By Searchstyle = By.xpath("//input[@class='p-inputtext p-component p-element']");
	By verifyPendingipolistscreen = By.xpath("//h3[text()='Pending IPO List']");
	By griddata = By.xpath("//tbody[@class='p-element p-datatable-tbody']");
	By GenerateIPO = By.xpath("//a[@class='btn btn-sm btn-info mr-1 ng-star-inserted']");
	By GENIPOTXT = By.xpath("//div[@class='card ng-star-inserted']//h3[text()='Generate IPO ']");
	By IPOdate = By.xpath("//label[text()='IPO Date']/..//input[@id='date']");
	By BuyerStyle = By.xpath("//input[@formcontrolname='buyerStyleName']");
	By IPONo = By.xpath("//input[@formcontrolname='ipoNumber']");
	By Buyer = By.xpath("//label[text()='Buyer']/..//input[@class='form-control ng-untouched ng-pristine ng-valid']");







	public void Login_with_Audit_Manager_credentials_in_Login_page() throws Throwable {
		driver.get(prop.getProperty("url"));
		new WebDriverWait(driver, 10);
		utilities.MediumWait(driver);

		driver.findElement(username).sendKeys("Anilkumar05");
		utilities.MinimumWait(driver);
		driver.findElement(Password).sendKeys("Abcd@123");
		utilities.MinimumWait(driver);
		driver.findElement(SignIn).click();
		utilities.MinimumWait(driver);
	}

	public void Click_on_WovenKnit_Module() throws Throwable {

		utilities.webDriverWait(driver, Woven);
		driver.findElement(Woven).click();
		utilities.MinimumWait(driver);

	}

	public void Click_on_Audit_Module() throws Throwable {
		utilities.webDriverWait(driver, AuditModule);
		driver.findElement(AuditModule).click();
		utilities.MinimumWait(driver);

	}

	public void Click_on_Pending_IPO_list_in_menu() throws Throwable {
		utilities.webDriverWait(driver, PendingIPOlist);
		driver.findElement(PendingIPOlist).click();
		utilities.MinimumWait(driver);

	}

	public void Verify_whether_user_navigated_to_Pending_IPO_list_or_not() throws Throwable {

		WebElement verifyPendingipolist = driver.findElement(verifyPendingipolistscreen);
		String Screen = verifyPendingipolist.getText();
		if (verifyPendingipolist.isDisplayed()) {
			System.out.println("Screen Navigated to: " + Screen);
		} else {
			System.out.println("Screen should navigate to Pending IPO List:" + Screen);
		}
		utilities.MediumWait(driver);

	}

	public void Verify_whether_the_data_is_displaying_in_grid_or_not() throws Throwable {

		WebElement GridData = driver.findElement(griddata);
		String Screen = GridData.getText();
		if (GridData.isDisplayed()) {
			System.out.println("Data is Available in Grid: " + Screen);
		} else {
			System.out.println("Data is not Available in Grid: " + Screen);
		}
		utilities.MediumWait(driver);
	}

	public void Click_on_Generate_IPO_button() throws Throwable {

		utilities.webDriverWait(driver, GenerateIPO);
		driver.findElement(GenerateIPO).click();
		utilities.MediumWait(driver);

	}

	public void Verify_whether_Generate_IPO_screen_is_displaying_or_not() {
		WebElement GENIPO = driver.findElement(GENIPOTXT);
		String Screen = GENIPO.getText();
		if(GENIPO.isDisplayed()) {
			System.out.println("Navigated to: " + Screen);
		}else {
			System.out.println("Navigated to Pending IPO list: " + Screen);
		}

	}

	public void Verify_whether_the_current_date_is_displaying_for_IPO_date_field_or_not() {

		WebElement ipodate = driver.findElement(IPOdate);
		String currentDate = ipodate.getAttribute(formattedDate);
		if(ipodate.isDisplayed()) {
			System.out.println("Displaying Current Date: "+ currentDate);
		}else {
			System.out.println("Not Displaying current Date" + currentDate);
		}
	}

	public void verify_whether_the_Buyer_Style_is_prepopulated_or_not() {
		WebElement BStyle = driver.findElement(BuyerStyle);
		String Screen = BStyle.getText();
		if(BStyle.isDisplayed()) {
			System.out.println("Buyer Style name is: " + Screen);
		}else {
			System.out.println("Buyer Style name is not displayed: " + Screen);
		}
	}

	public void Verify_whether_the_IPO_field_is_prepopulated_with_data_or_not() throws Throwable {



		WebElement IPOno = driver.findElement(IPONo);
		String Screen = IPOno.getText();
		if(IPOno.isDisplayed()) {
			System.out.println("Displaying Buyer: " + Screen);
		}else {
			driver.findElement(IPONo).sendKeys("AutoIPO");
		}

	}

	public void Enter_IPO_number_in_IPO_field() throws Throwable {
		utilities.webDriverWait(driver, IPONo);
		 driver.findElement(IPONo).sendKeys("AutoIPOs");
		 utilities.MinimumWait(driver);

	}


	public void Verify_Buyer_is_prepopulated_or_not() {
		WebElement Buyer1 = driver.findElement(Buyer);
		String Screen = Buyer1.getText();
		if(Buyer1.isDisplayed()) {
			System.out.println("Buyer name is displayed: "  +  Screen);
		}else {
			System.out.println("Buyer Name is not displayed: "  +  Screen);
		}

		WebDriverWait wait = new WebDriverWait(driver, 10); // Adjust the timeout as needed

	    WebElement buyerElement = wait.until(ExpectedConditions.visibilityOfElementLocated(Buyer));

	    String buyerName = buyerElement.getText();

	    if (!buyerName.isEmpty()) {
	        System.out.println("Buyer name is displayed: " + buyerName);
	    } else {
	        System.out.println("Buyer Name is not displayed");
	    }
	}

	}

