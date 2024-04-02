package Page;

import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import util.DriverFactory;
import util.Utilities;

public class FabricType_page extends DriverFactory {

	Utilities utilities = new Utilities();

	By username                   =  By.xpath("//input[@id='userName']");
	By password                   =  By.xpath("//input[@id='userpassword']");
	By Signin                     =  By.xpath("//button[text()='Sign In']");
	By Master                     =  By.xpath("//span[text()='Masters ']");
	By Fabrictypescreen           =  By.xpath("//*[@id=\"sidebar_menu\"]/li[4]/ul/li[7]/a");
	By Homescreen                 =  By.xpath("//h3[text()='Fabric Type']");
	By AddButton                  =  By.xpath("//button[text()=' Add']");
	By Alertmsg                   =  By.xpath("//h2[text()='Mandatory Fields Are Required With  Valid Data.']");
	By Title1                     =  By.xpath("//h3[text()='Create Fabric ']");
	By Categoryvalidationmsg      =  By.xpath("(//div[@class='invalid-feedback validation-msg ng-star-inserted'])[1]");
	By Categorydropdownselection  =  By.xpath("//select[@formcontrolname='categoryId']");
	By Category_Select			  =	 By.xpath("//option[text()=' Knit']");
	By FabricNameValidationmsg    =  By.xpath("//div[@data-validate='Fabric Name is required']");
	By FabricnameField            =  By.xpath("//input[@formcontrolname='fabricName']");
	By ContentValidationmsg       =  By.xpath("//div[@data-validate='Content % is required']");
	By ContentField				  =  By.xpath("//input[@formcontrolname='content']");
	By SupplierCode               =  By.xpath("(//input[@type='text'])[3]");
	By Title2             		  =  By.xpath("//h5[text()='Greige Fabric']");
	By GSM1					      =  By.xpath("(//input[@placeholder='Enter GSM'])[1]");
	By CountConstruction1         =  By.xpath("(//input[@placeholder='Enter Count / Construction'])[1]");
	By Width					  =  By.xpath("//input[@placeholder='Enter Width']");
	By Title3					  =  By.xpath("//h5[text()='Processed Fabric (final)']");
	By GSM2						  =  By.xpath("(//input[@placeholder='Enter GSM'])[2]");
	By GSM2validation             =  By.xpath("//div[@data-validate='GSM is required']");
	By CountConstruction2		  =  By.xpath("//input[@formcontrolname='count']");
	By CountConstructionmsg 	  =  By.xpath("//div[@data-validate='Count / Construction is required']");
	By CuttableWidth			  =  By.xpath("//input[@formcontrolname='width']");
	By CuttableWidthmsg 		  =  By.xpath("//div[@data-validate='Cuttable Width (in inches) is required']");
	By ApproxLeadTime             =  By.xpath("//input[@placeholder='Enter Approx. lead time']");
	By Title4                     =  By.xpath("//h5[text()='Nominated Details ']");
	By IsNominated_Checkbox		  =  By.xpath("//input[@formcontrolname='isNominated']");
	By IsNominatedtoggle		  =  By.xpath("//label[text()=' Is Nominated? ']");
	By fabricpricevalidation	  =  By.xpath("//div[@data-validate='Fabric Price is required']");
	By fabricprice				  =  By.xpath("//input[@placeholder='Enter Fabric Price']");
	By CurrencyValidation		  =  By.xpath("//div[@data-validate='Currency is required']");
	By Currency 				  =  By.xpath("//select[@formcontrolname='currencyTypeId']");
	By Select_Currency			  =  By.xpath("//select[@formcontrolname='currencyTypeId']/.//option[text()=' Indian rupee(INR)']");
	By UOMvalidation			  =  By.xpath("//div[@data-validate='UOM is required']");
	By UOM						  =  By.xpath("//select[@formcontrolname='uomId']");
	By Select_UOM				  =  By.xpath("//select[@formcontrolname='uomId']/.//option[text()=' Meters']");
	By Pricelabelname			  =  By.xpath("//label[text()='Price In (Mtr) ']");
	By PriceInMeters			  =  By.xpath("//input[@placeholder='Enter Price In (Mtr)']");
	By UploadFilevalidation		  =  By.xpath("//div[@data-validate='Upload File is required']");
	By UploadFile				  =  By.xpath("//div/div/input[@type='file']");
	By Save						  =  By.xpath("//button[@type='submit']");
	By Cancelbutton				  =  By.xpath("(//button[@type='button'])[2]");
	By newRecordLocator           =  By.xpath("(//tr[@class='ng-star-inserted'])[2]");
	By Searchbox                  =  By.xpath("//input[@placeholder='Search keyword']");
	By EditIcon					  =  By.xpath("(//button[@title='Edit'])[1]");
	By UpdateCategorydropdown     =  By.xpath("//select[@formcontrolname ='categoryId']");
	By DownloadIcon   	 		  =  By.xpath("//a[@class='btn btn-primary btn-md ml-3 ng-star-inserted']");
	By SortingByColumns           =  By.xpath("(//tr[@class='ng-star-inserted'])[1]");
	
	
	public void select_the_category() throws Throwable {
		utilities.webDriverWait(driver, Categorydropdownselection);
		driver.findElement(Categorydropdownselection).click();
		Thread.sleep(2000);
		String category = driver.findElement(Category_Select).getText();
		System.out.println("Category:  " +  category);
		System.out.println();
		driver.findElement(Category_Select).click();
		utilities.MinimumWait(driver);
	}

	public void Enter_the_Fabric_name() throws Throwable {
		utilities.webDriverWait(driver, FabricnameField);
		driver.findElement(FabricnameField).click();
		Thread.sleep(2000);
		driver.findElement(FabricnameField).sendKeys("Fabric Name");
		Thread.sleep(2000);
		String fabric = driver.findElement(FabricnameField).getAttribute("value");
		System.out.println("Fabric:  " +  fabric);
		utilities.MediumWait(driver);
		
	}

	public void Enter_the_content() throws Throwable {
		utilities.webDriverWait(driver, ContentField);
		driver.findElement(ContentField).click();
		Thread.sleep(2000);
		driver.findElement(ContentField).sendKeys("A180");
		Thread.sleep(2000);
		String content = driver.findElement(ContentField).getAttribute("value");
		System.out.println("Content:  " +  content);
		utilities.MediumWait(driver);
		
	}

	public void Enter_the_GSM() throws Throwable {
		utilities.webDriverWait(driver, GSM2);
		driver.findElement(GSM2).click();
		Thread.sleep(2000);
		driver.findElement(GSM2).sendKeys("230");
		Thread.sleep(2000);
		String gsm = driver.findElement(GSM2).getAttribute("value");
		System.out.println("GSM:  " +  gsm);
		utilities.MediumWait(driver);
		
	}

	public void Enter_the_Count_or_Construction() throws Throwable {
		utilities.webDriverWait(driver, CountConstruction2);
		driver.findElement(CountConstruction2).click();
		Thread.sleep(2000);
		driver.findElement(CountConstruction2).sendKeys("20*30");
		Thread.sleep(2000);
		String countconstruction = driver.findElement(CountConstruction2).getAttribute("value");
		System.out.println("CountConstruction:  " +  countconstruction);
		utilities.MediumWait(driver);
		
	}

	public void Enter_the_Cuttable_Width() throws Throwable {
		utilities.webDriverWait(driver, CuttableWidth);
		driver.findElement(CuttableWidth).click();
		Thread.sleep(2000);
		driver.findElement(CuttableWidth).sendKeys("50");
		Thread.sleep(2000);
		String cuttablewidth = driver.findElement(CuttableWidth).getAttribute("value");
		System.out.println("CuttableWidth:  " +  cuttablewidth);
		utilities.MediumWait(driver);
		
	}

	public void click_on_save_button_in_create_fabric() throws Throwable {
		utilities.webDriverWait(driver, Save);
		driver.findElement(Save).click();
		utilities.MinimumWait(driver);
		
	}
	
	public void Click_on_nominated_checkbox() throws Throwable {
		utilities.webDriverWait(driver,IsNominated_Checkbox);
		driver.findElement(IsNominated_Checkbox).click();
		utilities.MinimumWait(driver);
		
	}
	
	public void Enter_the_Fabric_Price() throws Throwable {
		utilities.webDriverWait(driver, fabricprice);
		driver.findElement(fabricprice).click();
		Thread.sleep(2000);
		driver.findElement(fabricprice).sendKeys("5000");
		Thread.sleep(2000);
		String price = driver.findElement(fabricprice).getAttribute("value");
		System.out.println("fabricprice:  " +  price);
		utilities.MediumWait(driver);
		
	}

	public void Select_the_currency() throws Throwable {
		utilities.webDriverWait(driver, Currency);
		driver.findElement(Currency).click();
		Thread.sleep(2000);
		driver.findElement(Select_Currency).click();
		Thread.sleep(2000);
		String currency = driver.findElement(Select_Currency).getText();
		System.out.println("Currency:  " + currency);
		
	}

	public void Select_the_UOM() throws Throwable {
		utilities.webDriverWait(driver, UOM);
		driver.findElement(UOM).click();
		Thread.sleep(2000);
		driver.findElement(Select_UOM).click();
		Thread.sleep(2000);
		String uom = driver.findElement(Select_UOM).getText();
		System.out.println("UOM:  " + uom);
	}

	public void Verify_that_price_in_meters_are_displaying_or_not() throws Throwable {
		utilities.webDriverWait(driver, PriceInMeters);
		String price_in_meters = driver.findElement(PriceInMeters).getAttribute("value");
		System.out.println("Price In Meters:  " + price_in_meters);
		utilities.MinimumWait(driver);
		
	}
	
	public void click_on_upload_file() throws Throwable {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		
		utilities.webDriverWait(driver, UploadFile);
		driver.findElement(UploadFile).click();
		utilities.MinimumWait(driver);
		
	}

	
	
	public void Select_the_Fabric_type_screen() throws Throwable {

		utilities.MinimumWait(driver);
		utilities.webDriverWait(driver, Fabrictypescreen);
		driver.findElement(Fabrictypescreen).click();
		utilities.MinimumWait(driver);

		WebElement redirectedscreen = driver.findElement(Homescreen);
		if (redirectedscreen.isDisplayed()) {
			System.out.println("Screen name::" + "Yes page redirected to the Fabric type screen");
		} else {
			System.out.println("Screen name::" + "We are not redirected as expected");
		}

	}

	public void click_on_the_fabric_type_add_button() throws Throwable {

		utilities.webDriverWait(driver, AddButton);
		driver.findElement(AddButton).click();
		System.out.println("Page is redirected to the add fabric type form");
		utilities.MinimumWait(driver);

	}

	public void click_on_save_button_to_submit_the_Fabric_Type() throws Throwable {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scrollBy(0, 500)");
		utilities.MaximumWait(driver);

		utilities.webDriverWait(driver, Save);
		driver.findElement(Save).click();

		WebElement message = driver.findElement(Alertmsg);
		String actualMessage = message.getText();

		String expectedMessage = "Mandatory Fields Are Required With Valid Data.";

		if (expectedMessage.equals(actualMessage)) {
			System.out.println("Alert message is correct:: " + actualMessage);
		} else {
			System.out.println("Alert message is incorrect::" + actualMessage);
		}
		utilities.MaximumWait(driver);
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("scrollTo(0, 0)");
		utilities.MaximumWait(driver);
	}

	public void Select_category_dropdown() throws Throwable {

		WebElement Titlemsg =  driver.findElement(Title1);
		String titlemessage = Titlemsg.getText();
		if(Titlemsg.isDisplayed()) {
			System.out.println("We are testing the correct title fields:"+titlemessage);
		}
		else {
			System.out.println("We are not on the exact title");
		}
		
		WebElement validationmessage = driver.findElement(Categoryvalidationmsg);
		String validationmsg = validationmessage.getAttribute("data-validate");
		System.out.println("Validation msg is:" + validationmsg);
		utilities.MinimumWait(driver);

		WebElement placeholdername = driver.findElement(Categorydropdownselection);
		String placeholderv = placeholdername.getAttribute("data-toggle");
		System.out.println("Placeholder value:" + placeholderv);
		utilities.MinimumWait(driver);

		WebElement categorydrp = driver.findElement(Categorydropdownselection);
		Select categoryvalue = new Select(categorydrp);
		categoryvalue.selectByVisibleText("Woven");

		utilities.MinimumWait(driver);
	}

	public void user_enter_the_Fabric_Name() throws Throwable {

		WebElement validationmessage = driver.findElement(FabricNameValidationmsg);
		String validationmsg = validationmessage.getAttribute("data-validate");
		System.out.println("Validation msg is:" + validationmsg);
		utilities.MinimumWait(driver);

		WebElement placeholdername = driver.findElement(FabricnameField);
		String placeholderv = placeholdername.getAttribute("placeholder");
		System.out.println("Placeholder value:" + placeholderv);
		utilities.MinimumWait(driver);

		utilities.webDriverWait(driver, FabricnameField);
		driver.findElement(FabricnameField).sendKeys("Test0101");

		utilities.MinimumWait(driver);

	}

	public void User_enter_the_content() throws Throwable {
		
		WebElement validationmessage = driver.findElement(ContentValidationmsg);
		String validationmsg = validationmessage.getAttribute("data-validate");
		System.out.println("Validation msg is:" + validationmsg);
		utilities.MinimumWait(driver);

		WebElement placeholdername = driver.findElement(ContentField);
		String placeholderv = placeholdername.getAttribute("placeholder");
		System.out.println("Placeholder value:" + placeholderv);
		utilities.MinimumWait(driver);

		utilities.webDriverWait(driver, ContentField);
		driver.findElement(ContentField).sendKeys("Test0121");

		utilities.MinimumWait(driver);
		
	}

	public void User_enter_the_supplier_or_internal_code() throws Throwable {
			
		WebElement placeholder = driver.findElement(SupplierCode);
		String placeholdername = placeholder.getAttribute("placeholder");
		System.out.println("Placeholder value::"+ placeholdername);
		
		utilities.webDriverWait(driver, SupplierCode);
		driver.findElement(SupplierCode).click();
		driver.findElement(SupplierCode).sendKeys("TestAB");
		utilities.MinimumWait(driver);
	}

	public void User_enter_the_GSM1() throws Throwable {
		
		WebElement Titlemsg =  driver.findElement(Title2);
		String titlemessage = Titlemsg.getText();
		if(Titlemsg.isDisplayed()) {
			System.out.println("We are testing the correct title fields:"+titlemessage);
		}
		else {
			System.out.println("We are not on the exact title");
		}
		
		WebElement placeholdername = driver.findElement(GSM1);
		String placeholderv = placeholdername.getAttribute("placeholder");
		System.out.println("Placeholder value:" + placeholderv);
		utilities.MinimumWait(driver);

		utilities.webDriverWait(driver, GSM1);
//		driver.findElement(GSM1).click();
		driver.findElement(GSM1).sendKeys("110");

		utilities.MinimumWait(driver);
	}

	public void User_enter_the_Count_and_construction1() throws Throwable {
			
		WebElement placehodlermsg = driver.findElement(CountConstruction1);
		String placehodlermessage = placehodlermsg.getAttribute("placeholder");
		System.out.println("Placeholder values::" +placehodlermessage);
		
		utilities.webDriverWait(driver, CountConstruction1);
		driver.findElement(CountConstruction1).sendKeys("12");
		utilities.MinimumWait(driver);
	}

	public void User_enter_the_width_in_inches() throws Throwable {
		
		WebElement placeholdermsg = driver.findElement(Width);
		String placeholdermessage = placeholdermsg.getAttribute("placeholder");
		System.out.println("Placeholder values::"+placeholdermessage);
		
		utilities.webDriverWait(driver, Width);
		driver.findElement(Width).sendKeys("13");
		utilities.MinimumWait(driver);
		
		
	}

	public void User_enter_the_GSM2() throws Throwable {

		WebElement Titlemsg =  driver.findElement(Title3);
		String titlemessage = Titlemsg.getText();
		if(Titlemsg.isDisplayed()) {
			System.out.println("We are testing the correct title fields:"+titlemessage);
		}
		else {
			System.out.println("We are not on the exact title");
		}
		
		utilities.MinimumWait(driver);
		WebElement validationmessage = driver.findElement(GSM2validation);
		String validationmsg = validationmessage.getAttribute("data-validate");
		System.out.println("Validation msg is:" + validationmsg);
		utilities.MinimumWait(driver);
		
		WebElement placeholdername = driver.findElement(GSM2);
		String placeholderv = placeholdername.getAttribute("placeholder");
		System.out.println("Placeholder value:" + placeholderv);
		utilities.MinimumWait(driver);

		utilities.webDriverWait(driver, GSM2);
		driver.findElement(GSM2).sendKeys("14");

		utilities.MinimumWait(driver);
	
	}

	public void User_enter_the_count_and_construction2() throws Throwable {
		
		utilities.MinimumWait(driver);
		WebElement validationmessage = driver.findElement(CountConstructionmsg);
		String validationmsg = validationmessage.getAttribute("data-validate");
		System.out.println("Validation msg is:" + validationmsg);
		utilities.MinimumWait(driver);
		
		WebElement placehodlermsg = driver.findElement(CountConstruction2);
		String placehodlermessage = placehodlermsg.getAttribute("placeholder");
		System.out.println("Placeholder values::" +placehodlermessage);
		
		utilities.webDriverWait(driver, CountConstruction2);
		driver.findElement(CountConstruction2).sendKeys("15");
		utilities.MinimumWait(driver);
	}


	public void User_enter_the_cuttable_width_in_inches() throws Throwable {

		utilities.MinimumWait(driver);
		
		WebElement validationmessage = driver.findElement(CuttableWidthmsg);
		String validationmsg = validationmessage.getAttribute("data-validate");
		System.out.println("Validation msg is:" + validationmsg);
		utilities.MinimumWait(driver);
		
		WebElement placehodlermsg = driver.findElement(CuttableWidth);
		String placehodlermessage = placehodlermsg.getAttribute("placeholder");
		System.out.println("Placeholder values::" +placehodlermessage);
		
		utilities.webDriverWait(driver, CuttableWidth);
		driver.findElement(CuttableWidth).sendKeys("160");
		utilities.MinimumWait(driver);
	}


	public void User_enter_the_approx_lead_time() throws Throwable {
		
		WebElement placeholdermsg = driver.findElement(ApproxLeadTime);
		String message=placeholdermsg.getAttribute("placeholder");
		System.out.println("The placeholder msg is::"+message);
		
		utilities.webDriverWait(driver, ApproxLeadTime);
		driver.findElement(ApproxLeadTime).sendKeys("12");
		utilities.MinimumWait(driver);
		
	}


	public void User_able_to_select_the_is_nominated() throws Throwable {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scrollBy(0, 500)");
		utilities.MaximumWait(driver);	
				
		WebElement titlemsg4 = driver.findElement(Title4);
		String titlemessage = titlemsg4.getText();
		if (titlemsg4.isDisplayed()) {
			System.out.println("We are testing the correct title fields:" + titlemessage);
		} else {
			System.out.println("We are not on the exact title");
		}
	
		utilities.MinimumWait(driver);
		utilities.webDriverWait(driver, IsNominatedtoggle);
		driver.findElement(IsNominatedtoggle).click();
		utilities.MinimumWait(driver);
	}


	public void User_enter_the_Fabric_price() throws Throwable {
		
		utilities.MinimumWait(driver);
		WebElement fabricvalidationmsg = driver.findElement(fabricpricevalidation);
		String fabricmsg = fabricvalidationmsg.getAttribute("data-validate");
		System.out.println("Validation msg::"+fabricmsg);
		
		WebElement fabricpriceplaceholder = driver.findElement(fabricprice);
		String fabricpriceplaceholdermsg = fabricpriceplaceholder.getAttribute("placeholder");
		System.out.println("Placeholder message::"+fabricpriceplaceholdermsg);
		
		utilities.webDriverWait(driver, fabricprice);
		driver.findElement(fabricprice).sendKeys("350");
		utilities.MinimumWait(driver);
	}


	public void User_selects_the_Currency() throws Throwable {
		
		utilities.MinimumWait(driver);
		WebElement currencyvalidationmsg = driver.findElement(CurrencyValidation);
		String currencymsg = currencyvalidationmsg.getAttribute("data-validate");
		System.out.println("Validation msg::"+currencymsg);
		
		WebElement Currencyplaceholder = driver.findElement(Currency);
		String Currencyplaceholdermsg = Currencyplaceholder.getAttribute("data-toggle");
		System.out.println("Placeholder message::"+Currencyplaceholdermsg);

		WebElement currencyfield = driver.findElement(Currency);
		Select Currencydata = new Select(currencyfield);
		Currencydata.selectByIndex(3);
		utilities.MinimumWait(driver);
	}


	public void User_selects_the_UOM() throws Throwable {
		
		utilities.MinimumWait(driver);
		WebElement UOMvalidationmsg = driver.findElement(UOMvalidation);
		String Uommsg = UOMvalidationmsg.getAttribute("data-validate");
		System.out.println("Validation msg::"+Uommsg);
		
		WebElement Uomplaceholder = driver.findElement(UOM);
		String Uomplaceholdermsg = Uomplaceholder.getAttribute("data-toggle");
		System.out.println("Placeholder message::"+Uomplaceholdermsg);

		WebElement Uomfield = driver.findElement(UOM);
		Select Uomdata = new Select(Uomfield);
		Uomdata.selectByVisibleText("Yard");
		utilities.MinimumWait(driver);
		
	}

	public void User_verify_the_Price() throws Throwable {
		
		utilities.webDriverWait(driver, Pricelabelname);
		WebElement labelname =driver.findElement(Pricelabelname);
		String pricelabelname = labelname.getText();
		if(labelname.isDisplayed()) {
			System.out.println("We are verifying:"+pricelabelname);
		}
		utilities.MinimumWait(driver);
		
		 WebElement prepopulatedField = driver.findElement(PriceInMeters);
	        String prepopulatedValue = prepopulatedField.getAttribute("value");
	        System.out.println("Price prepopulated value is:"+prepopulatedValue);
		 
		
	}
	public void User_upload_the_file() throws Throwable {
		
		utilities.MinimumWait(driver);
		
//		WebElement Uploadfilevalidationmsg = driver.findElement(UploadFilevalidation);
//		String Uploadmmsg = Uploadfilevalidationmsg.getAttribute("data-validate");
//		System.out.println("Validation msg::"+Uploadmmsg);
//		
//		WebElement Uploadfileplaceholder = driver.findElement(UploadFile);
//		String Uploadplaceholdermsg = Uploadfileplaceholder.getAttribute("data-validate");
//		System.out.println("Placeholder message::"+Uploadplaceholdermsg);
//		
//		utilities.MaximumWait(driver);
		
//		System.out.println("User is able to upload the file");
//		
//		utilities.webDriverWait(driver, UploadFile);
//		driver.findElement(UploadFile).click();
		
		
		Thread.sleep(10000);
		
	}


	public void User_try_to_submit_by_clicks_on_the_save_button() throws Throwable {
		
		utilities.webDriverWait(driver, Save);
		driver.findElement(Save).click();
		utilities.MinimumWait(driver);
		
		System.out.println("User clicks on the save button");
		
        boolean newRecordsPresent = driver.findElements(newRecordLocator).size() > 0;

        if (newRecordsPresent) {
            System.out.println("Newly created records are displaying on the grid.");
        } else {
            System.out.println("Newly created records are not displaying on the grid.");
        }
	}


	public void User_clicks_on_the_cancel_button() throws Throwable {
		
		utilities.webDriverWait(driver, Cancelbutton);
		driver.findElement(Cancelbutton).click();
		utilities.MinimumWait(driver);
		
		System.out.println("Successfully page is navigated to the Fabric Home Screen.");
		
	}


	public void User_able_to_search_the_data_by_using_search_box_funtionality() throws Throwable {
		
		driver.navigate().refresh();
		String[] searchdata = { "test0121", "28552", "Test0101", "silknet", "false",  "Invalid Record" };

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
				
				System.out.println("Search box not found or element not visible. Skipping entry: " + searchdata[i]);
			} catch (InterruptedException e) {
		
				e.printStackTrace();

			}
		}
	}

	private boolean isNameValidInSearchBox(String name) {

		return name.length() >= 3;
	}


	public void User_able_to_update_the_details_by_selecting_edit_icon() throws Throwable {
		
		driver.navigate().refresh();
		
		utilities.webDriverWait(driver, EditIcon);
		driver.findElement(EditIcon).click();
		utilities.MaximumWait(driver);
		
		System.out.println("User navigate to the edit page and you can update the below details");
		
		WebElement categorydrp1 = driver.findElement(UpdateCategorydropdown);
		Select categoryvalue1 = new Select(categorydrp1);
		categoryvalue1.selectByVisibleText("Knit");
		
		utilities.MinimumWait(driver);
		
		WebElement GSMprepopulatedvalue1 = driver.findElement(GSM1);
		String GSMvalue1 = GSMprepopulatedvalue1.getAttribute("value");
		System.out.println("GSM Prepopulated value is :" + GSMvalue1);
		utilities.MinimumWait(driver);
		
		WebElement Countcprepopulated1 = driver.findElement(CountConstruction1);
		String concvalue1 = Countcprepopulated1.getAttribute("value");
		System.out.println("Count / construction prepopulated value is:" +concvalue1);
		utilities.MinimumWait(driver);
		
		WebElement Widthprepopulated = driver.findElement(Width);
		String Widthprepopulatedvalue = Widthprepopulated.getAttribute("value");
		System.out.println("Width prepopulated value is:"+Widthprepopulatedvalue);
		utilities.MinimumWait(driver);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scrollBy(0, 500)");
		utilities.MaximumWait(driver);
		
		utilities.webDriverWait(driver, DownloadIcon);
		driver.findElement(DownloadIcon).click();
		utilities.MaximumWait(driver);
		
		System.out.println("Downloaded the records please review it: ");
		
		utilities.webDriverWait(driver, Save);
		driver.findElement(Save).click();
		utilities.MinimumWait(driver);

//		driver.switchTo().alert().getText();
		
		WebElement redirectedscreen = driver.findElement(Homescreen);
		if (redirectedscreen.isDisplayed()) {
			System.out.println("Screen name::" + "Yes page redirected to the Fabric type screen");
		} else {
			System.out.println("Screen name::" + "We are not redirected as expected");
		}

		utilities.MaximumWait(driver);

	}


	public void Check_the_sorting_functionality() throws Throwable {
		
		driver.navigate().refresh();

		WebElement table = driver.findElement(SortingByColumns);
		List<WebElement> columnheader = table.findElements(By.xpath("th"));

		for (WebElement header : columnheader) {

			header.click();
			utilities.MinimumWait(driver);
			header.click();
			utilities.MinimumWait(driver);
		}
		
		utilities.MaximumWait(driver);
		System.out.println("Successfully Executed Fabric Type Screen:");
		utilities.MinimumWait(driver);
		
//		10 FEb 2024 From My system
	}

	


	

	

}