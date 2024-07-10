
package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import util.DriverFactory;
import util.Utilities;

public class Country_Page extends DriverFactory{
	Actions actions;
	Utilities utilities = new Utilities();
	
	
	By Master = By. xpath ("//span[text()='Masters ']");
	By Country = By.xpath("//a[text()='Country']");

	By C_Add = By.xpath("//button[@class='btn btn-primary btn-sm shadow-sm float-right ng-star-inserted']");
	By C_Name = By.xpath("//input[@placeholder='Enter Country Name']");
	By C_Code = By.xpath("//input[@placeholder='Enter Country Code']");
	By Currency_Type = By.xpath("//select[@formcontrolname='currencyType']");
	By Select_Currency = By.xpath("//option[@value='34']");
	By Coversion_Rate = By.xpath("//input[@placeholder='Enter Conversion Rate']");
	By Active = By.xpath("//input[@formcontrolname='isActive']");
	By Uncheck = By.xpath("//div[@class='form-check mt-3']");
	By Save = By.xpath("//button[@class='btn btn-md btn-primary px-5 ng-star-inserted']");
	By Cancel = By.xpath("//button[@class='btn btn-md btn-danger btn-active-light-primary mr-2']");
	By OnSave = By.xpath("//h2[text()='Country Added Successfully']");
	By Alert = By.xpath("//h2[text()='Mandatory Fields Are Required With  Valid Data.']");
	By Edit = By.xpath("(//i[@class='ti-pencil-alt'])[7]");
	By U_Countryname = By.xpath("//input[@formcontrolname='countryName']");
	By U_countrycode = By.xpath("//input[@formcontrolname='countryCode']");
	By ClickCurrency = By.xpath("//select[@formcontrolname='currencyType']");
	By Ucurrency = By.xpath("//option[@value='37']");
	By Uconversionrate = By.xpath("//input[@formcontrolname='conversionRate']");
	By update = By.xpath("//button[@class='btn btn-md btn-primary px-5 ng-star-inserted']");
	By UMsg = By.xpath("//h2[text()='Country Updated Successfully']");
	By Ucancel = By.xpath("//button[@class='btn btn-md btn-danger btn-active-light-primary mr-2']");
	By Delete = By.xpath("(//button[@class='btn btn-sm btn-danger ng-star-inserted'])[6]");
	By Yes = By.xpath("//button[@class='swal2-confirm swal2-styled']");
	By No = By.xpath("//button[@class='swal2-cancel swal2-styled']");
	By D_S = By.xpath("//h2[@class='swal2-title']");

	By Country_Name_Validation = By.xpath("//div[@data-validate='Country Name is required']");
	By Country_Code_Validation = By.xpath("//div[@data-validate='Country Code is required']");
	By Curreny_Type_Validation = By.xpath("//div[@data-validate='Currency Type is required']");
	By Conversion_Rate_Validation = By.xpath("//div[@data-validate='Conversion Rate is required']");

	By Search = By.xpath("//input[@placeholder='Search keyword']");
	By Edit_1 =By.xpath("//i[@class='ti-pencil-alt']");
	By Delete_1 = By.xpath("//i[@class='ti-trash']");

	 	   
	
	public void Click_on_the_Master_Module() throws Throwable{
			utilities.webDriverWait(driver, Master );
			driver.findElement(Master).click();
		  	}

			public void click_on_the_Country_screen() throws Throwable{
			   utilities.webDriverWait(driver, Country );
			   driver.findElement(Country).click();


          }
			public void Click_on_the_Country_Add_button() throws Throwable {
				utilities.webDriverWait(driver, C_Add );
				   driver.findElement(C_Add).click();
				   utilities.MediumWait(driver);
			}
			
			public void Enter_the_data_in_Country_name_field() throws Throwable {
				utilities.webDriverWait(driver, C_Name);
		        driver.findElement(C_Name).sendKeys("C73");
		        utilities.MinimumWait(driver);
			}

			public void Enter_the_data_in_Country_code_field() throws Throwable {
				utilities.webDriverWait(driver, C_Code);
				 driver.findElement(C_Code).sendKeys("SD@46");
				 utilities.MinimumWait(driver);
			}
			
			public void CLick_on_the_Currency_type_field() throws Throwable {
				utilities.webDriverWait(driver, Currency_Type );
				   driver.findElement(Currency_Type).click();
				   utilities.MinimumWait(driver);
			}
			
			public void Select_the_Currency_type() throws Throwable {
				utilities.webDriverWait(driver, Select_Currency );
				   driver.findElement(Select_Currency).click();
				   utilities.MinimumWait(driver);

			}
			
			public void Enter_the_data_in_Conversion_Rate_field() throws Throwable {
				utilities.webDriverWait(driver, Coversion_Rate );
				 driver.findElement(Coversion_Rate).sendKeys("50");
				 utilities.MinimumWait(driver);

			}
			
			public void Select_the_Active_Check_box() throws Throwable {
				utilities.webDriverWait(driver, Active );
				driver.findElement(Active).click();
			}
			
			public void CLick_on_the_Save_button() throws Throwable {
				utilities.webDriverWait(driver, Save );
				driver.findElement(Save).click();

			}
			
			public void Verify_the_successfull_msg() {

				WebElement AlertMsg = driver.findElement(OnSave);
				String actualMessage = AlertMsg.getText();

				String expectedMessage = "Country Added Successfully";

				if (expectedMessage.equals(actualMessage)) {
					System.out.println("Alert message is correct." + actualMessage);
				} else {
					System.out.println("Alert message is incorrect."+ actualMessage);
				}

			}
			
			public void Click_on_the_Cancel_button() throws Throwable {
				
				utilities.webDriverWait(driver, Cancel );
				driver.findElement(Cancel).click();
				utilities.MinimumWait(driver);
			}
			
			public void Verify_the_Alert_msg() throws Throwable {
				utilities.webDriverWait(driver, C_Add);
				driver.findElement(C_Add).click();
				Thread.sleep(2000);
				driver.findElement(Save).click();
				Thread.sleep(2000);
				actions = new Actions(driver);
				
				   WebElement AlertMsg = driver.findElement(Alert);
				   
				   actions.moveToElement(AlertMsg).perform();
				   
					String actualMessage = driver.switchTo().alert().getText();
					
					String expectedMessage = "Mandatory Fields Are Required With Valid Data.";
					
			        assert actualMessage.equals(expectedMessage) : "Expected message is Correct";

					
//					String expectedMessage = "Mandatory Fields Are Required With Valid Data.";

//					if (actualMessage.equals(expectedMessage)) {
//						System.out.println("Alert message is correct." + actualMessage);
//					} else {
//						System.out.println("Alert message is incorrect."+ actualMessage);
//					}
			}
			
			public void Click_on_the_Edit_Icon_in_country_table_grid() throws Throwable {
				utilities.webDriverWait(driver, Edit );
				driver.findElement(Edit).click();
				utilities.MinimumWait(driver);

			}
			
			public void Update_the_Country_name() throws Throwable {
				utilities.webDriverWait(driver, U_Countryname );
				driver.findElement(U_Countryname).clear();
				utilities.MediumWait(driver);
//				driver.findElement(update).click();

	//			driver.findElement(U_Countryname).sendKeys("C7367");

			}
			
			public void Update_the_Country_code() throws Throwable {
     			utilities.webDriverWait(driver, U_countrycode );
				driver.findElement(U_countrycode).clear();
				utilities.MediumWait(driver);
//				driver.findElement(update).click();
				//driver.findElement(U_countrycode).sendKeys("AHSGE");

			}
			
			public void Update_the_Select_Country() throws Throwable {
				utilities.webDriverWait(driver, ClickCurrency );
				driver.findElement(ClickCurrency).click();
				utilities.MinimumWait(driver);
			
			//	driver.findElement(Ucurrency).click();


			}
			
			public void Update_the_Conversion_Rate() throws Throwable {
				utilities.webDriverWait(driver, Uconversionrate );
				driver.findElement(Uconversionrate).clear();
				utilities.MediumWait(driver);
//				driver.findElement(update).click();
//				driver.findElement(Uconversionrate).sendKeys("60");

			}
			
			public void click_on_the_Update_button() throws Throwable {
				utilities.webDriverWait(driver, update );
				driver.findElement(update).click();
				utilities.MinimumWait(driver);

			}
			
			public void Verify_the_Update_msg() throws Throwable {
				utilities.MediumWait(driver);
				 WebElement AlertMsg = driver.findElement(UMsg);

					String actualMessage = AlertMsg.getText();

					String expectedMessage = "Country Updated Successfully";

					if (expectedMessage.equals(actualMessage)) {
						System.out.println("Alert message is correct." + actualMessage);
					} else {
						System.out.println("Alert message is incorrect."+ actualMessage);
					}

			}
			
			public void Click_on_the_update_form_Cancel_button() throws Throwable {
				utilities.webDriverWait(driver, Ucancel );
				driver.findElement(Ucancel).click();

			}
			
			public void Click_on_the_Delete_Icon_in_country() throws Throwable {
				//utilities.webDriverWait(driver, Delete );
				WebElement buttonElement = driver.findElement(Delete);
				if (buttonElement.isEnabled()) {
					System.out.println("Button is enabled.");
					driver.findElement(Delete).click();
					utilities.MediumWait(driver);
					driver.findElement(Yes).click();
			//		driver.findElement(No).click();

				} else {
					driver.findElement(Edit).click();
					utilities.MinimumWait(driver);
					driver.findElement(Uncheck).click();
					System.out.println("Button is disabled.");
					driver.findElement(update).click();
				}

			}
			
			public void Verify_the_Delete_msg() {
				WebElement AlertMsg = driver.findElement(D_S);
				String actualMessage = AlertMsg.getText();

				String expectedMessage = "Country Deleted Successfully";

				if (expectedMessage.equals(actualMessage)) {
					System.out.println("Alert message is correct." + actualMessage);
				} else {
					System.out.println("Alert message is incorrect."+ actualMessage);
				}


			}
			

			public void Search_the_Country_name() throws Throwable {
			utilities.webDriverWait(driver, Search );
			driver.findElement(Search).sendKeys("C7367");
			utilities.MaximumWait(driver);
			driver.findElement(Edit_1).click();

			}

			public void click_on_save_button_in_country_add_form() throws Throwable {
				// TODO Auto-generated method stub
				

				utilities.webDriverWait(driver, Save);
				   driver.findElement(Save).click();
				   utilities.MinimumWait(driver);
			}
			
			public void verify_the_validation_msgs_are_displaying_for_the_mandatory_fields() throws Throwable {
				// TODO Auto-generated method stub
				
				utilities.webDriverWait(driver, Country_Name_Validation);
					driver.findElement(Country_Name_Validation).click();
					String countryname = driver.findElement(Country_Name_Validation).getAttribute("data-validate");
					System.out.println("Country Name validation is:  " + countryname);
			        utilities.MediumWait(driver);
			        
			        utilities.webDriverWait(driver, Country_Code_Validation );
					 driver.findElement(Country_Code_Validation).click();
					 String countrycode = driver.findElement(Country_Code_Validation).getAttribute("data-validate");
					 System.out.println("country code validation is:  " + countrycode);
					 utilities.MediumWait(driver);
					 
					 utilities.webDriverWait(driver, Curreny_Type_Validation);
					 driver.findElement(Curreny_Type_Validation).click();
					 String currencytype = driver.findElement(Curreny_Type_Validation).getAttribute("data-validate");
					 System.out.println("currency type validation is:  " + currencytype);
					 utilities.MediumWait(driver);
					 
					 utilities.webDriverWait(driver, Conversion_Rate_Validation);
					 driver.findElement(Conversion_Rate_Validation).click();
					 String conversionrate = driver.findElement(Conversion_Rate_Validation).getAttribute("data-validate");
					 System.out.println("conversion rate validation is:  " + conversionrate);
					 utilities.MediumWait(driver);
					 
					 utilities.webDriverWait(driver, Cancel);
					 driver.findElement(Cancel).click();
					 utilities.MinimumWait(driver);
				
			}

			



			}	
