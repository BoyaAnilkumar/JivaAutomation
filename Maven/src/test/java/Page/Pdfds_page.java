package Page;


	import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import util.DriverFactory;
import util.Utilities;

	public class Pdfds_page extends DriverFactory {

		Utilities utilities=new Utilities();


			By username = By.xpath("//input[@name='username']");
			By Password = By.xpath("//input[@name='password']");
			By SignIn = By.xpath("//button[text()='Sign In']");
			By Useraccount = By.xpath("//a[@Class='nav-link d-flex justify-content-between mb-2']");
			By Dashboard = By.xpath("//div[@Class='page_title_left d-flex align-items-center']//h3[text()='Dashboard']");

	// Adding fabric to the style in PD FDS

			By WovenKnit = By.xpath("//span[text()='Woven / knit']");
			By PDModule = By.xpath("//span[text()='PD ']");
			By PDFDS = By.xpath("//a[text()=' PD FDS ']");
			By Stylesexpansion = By.xpath("//a[@id='sidebarCollapse']");
			By SelecttheIPO= By.xpath("//a[@Class='nav-link lite-yellow']");
			By ClickonStylesExpansion = By.xpath("//a[@id='sidebarCollapse']");
			By AddNewFabric = By.xpath("//a[@Class='nav-link add-fabric']");
			By ClickonFabricQuality = By.xpath("(//div[@Class='ng-value-container']|//ng-select[@formcontrolname='fabricQualityId'])[1]");

			By SelectFabricQuality = By.xpath("//span[text()='40s viscose plain']");

			By ClickContent = By.xpath("//select[@Class='form-control ng-touched ng-dirty ng-valid']");
			By ClickonContent = By.xpath("//option[@value='100% Ecoliva']|//select[@class='form-control ng-pristine ng-invalid ng-touched'][1]");
			By Selectcontent = By.xpath("//option[text()=' 100% Ecoliva']|//select[@class='form-control ng-pristine ng-invalid ng-touched'][2]");
			By ClickonColor = By.xpath("(//div[@Class='ng-input'])[2]");
			By Selectcolor = By.xpath("//span[text()='Autumn Memories']");

			By CountConstruction = By.xpath("(//div[@class='col-md-4'])[4]");

			By SelectCountcons = By.xpath("//option[@Value='70 x 90 / 104 x 80']");
			By EnterFinish = By.xpath("//input[@placeholder='Enter Finish']");
			By specificrequirements = By.xpath("//input[@placeholder='Enter Specific Requirements']");
			By EnterFabricQuantity = By.xpath("//input[@placeholder='Enter Fabric Quantity']");
			By EnterFullwidth = By.xpath("//input[@placeholder='Enter Width']");
			By ClickonUse = By.xpath("//select[@formcontrolname='use']");
			By SelectUse = By.xpath("//option[@value='193']");
			By ClickonResetbutton = By.xpath("//button[@class='btn btn-md btn-danger btn-active-light-primary mr-2 ng-star-inserted']");
			By ClickonSavebutton = By.xpath("(//i[text()=' SAVE ']|//button[@type='submit'])[2]");
			By ToasterMessage = By.xpath("//h2[@class='swal2-title']");
			By Nominationcheckbox = By.xpath("//input[@id='invalidCheck3']");
			By Uaccount = By.xpath("//div[@class='profile_info dropdown']");
			By Logout = By.xpath("//a[text()='Log Out ']");

	// Mouse hover on Tool tip for validation Text
			By ValidationFabricQuality = By.xpath("(//div[@class='invalid-feedback validation-msg ng-star-inserted'])[1]");
			By Validaitonmsg = By.xpath("//div[text()='Fabric Quality is required']");
			By ValidationContent = By.xpath("(//div[@class='invalid-feedback validation-msg ng-star-inserted'])[2]");
			By ValidationColor = By.xpath("(//div[@class='invalid-feedback validation-msg ng-star-inserted'])[3]");
			By VCountConst	= By.xpath("(//div[@class='invalid-feedback validation-msg ng-star-inserted'])[4]");
			By VGSM = By.xpath("(//div[@class='invalid-feedback validation-msg ng-star-inserted'])[5]");
			By VFabricQuantity = By.xpath("(//div[@class='invalid-feedback validation-msg ng-star-inserted'])[6]");
			By VCuttablewidth = By.xpath("(//div[@class='invalid-feedback validation-msg ng-star-inserted'])[7]");
			By VUse = By.xpath("//div[@class='invalid-feedback count validation-msg ng-star-inserted']");

	// Navigated to PD Fabric pricing with user: Lokesh[Fabric Manager]
			By PDFabricPricing = By.xpath("//a[text()='PD Fabric Pricing']");





			public void Navigate_to_the_Login_Page() throws Throwable {
				driver.get(prop.getProperty("url"));
				new WebDriverWait(driver, 10);
				utilities.MinimumWait(driver);
			}

			public void user_Enter_invalid_username_and_valid_password() throws Throwable {

				utilities.webDriverWait(driver, username);
				driver.findElement(username).sendKeys("Phanindra");
				utilities.MinimumWait(driver);

				utilities.webDriverWait(driver, Password);
				driver.findElement(Password).sendKeys("Abcd@123");
				utilities.MinimumWait(driver);

	}




			public void Click_on_SignIn_button() throws Throwable {
				utilities.webDriverWait(driver, SignIn);
				driver.findElement(SignIn).click();
				utilities.MaximumLongWait(driver);
			}

			public void Navigated_to_Dashboard_screen_or_not() {
				WebElement dashboardElement =driver.findElement(Dashboard);
				String Screen = dashboardElement.getText();
				if (dashboardElement.isDisplayed()) {
				   System.out.println("Screen Navigated to: " + Screen);
				} else {
				    System.out.println("Screen should navigate to Dashboard:"+Screen);
				}
			//testing
		}


			public void Click_on_Wovenknit_module() throws Throwable {
				utilities.webDriverWait(driver, WovenKnit);
				driver.findElement(WovenKnit).click();

			}

			public void Click_on_PD_module() throws Throwable {
				utilities.webDriverWait(driver, PDModule);
				driver.findElement(PDModule).click();

			}

			public void click_on_pd_fds() throws Throwable {
				utilities.webDriverWait(driver, PDFDS);
				driver.findElement(PDFDS).click();
			}


			public void Click_on_Style_expansion() throws Throwable {
				utilities.webDriverWait(driver, Stylesexpansion);
				driver.findElement(Stylesexpansion).click();

			}

			public void Select_the_IPO() throws Throwable {
				utilities.webDriverWait(driver, SelecttheIPO);
				driver.findElement(SelecttheIPO).click();

				utilities.MinimumWait(driver);
				driver.findElement(ClickonStylesExpansion).click();

			}



	// Verifying the Tooltips for Mandatory fields by mousehover on them  .---------

				public void I_mouse_hover_on_tool_tip() throws Throwable{

				WebElement elementToHover = driver.findElement(ValidationFabricQuality);
				Actions actions = new Actions(driver);
		        actions.moveToElement(elementToHover).perform();
		        utilities.MaximumLongWait(driver);

		        WebElement elementToHover1 = driver.findElement(ValidationContent);
				Actions actions1 = new Actions(driver);
		        actions1.moveToElement(elementToHover1).perform();
		        utilities.MaximumLongWait(driver);

		        WebElement elementToHover11 = driver.findElement(ValidationColor);
				Actions actions11 = new Actions(driver);
		        actions11.moveToElement(elementToHover11).perform();
		        utilities.MaximumLongWait(driver);



				}


			public void Click_on_Add_New_Fabric_button() throws Throwable {
				utilities.webDriverWait(driver, AddNewFabric);
				driver.findElement(AddNewFabric).click();

			}

			public void Click_on_Fabric_Quality() throws Throwable {
				utilities.webDriverWait(driver, ClickonFabricQuality);
				driver.findElement(ClickonFabricQuality).click();
				utilities.MinimumWait(driver);
//				Robot R = new Robot();
//				R.keyPress(KeyEvent.VK_DOWN);

			}

			public void Select_Fabric_Quality() throws Throwable {
				utilities.webDriverWait(driver, SelectFabricQuality);
				driver.findElement(SelectFabricQuality).click();
			}

			public void Click_on_Content() throws Throwable {

				boolean ElementPresent = driver.findElements(ClickContent).size()>0;
				   if(ElementPresent) {
					utilities.webDriverWait(driver, ClickContent);
					System.out.println("Content is present");
					driver.findElement(ClickContent).click();
					utilities.MediumWait(driver);
				   }
				//driver.findElement(ClickonContent).click();
//				Robot R = new Robot();
//				R.keyPress(KeyEvent.VK_DOWN);
			}

			public void Click_on_Color() throws Throwable {
				utilities.webDriverWait(driver, ClickonColor);
				driver.findElement(ClickonColor).click();
				Robot R = new Robot();
				R.keyPress(KeyEvent.VK_DOWN);
				Thread.sleep(5000);
				driver.findElement(Selectcolor).click();

			}

			public void Select_CountConstruction() throws Throwable {
				utilities.webDriverWait(driver, CountConstruction );
				driver.findElement(CountConstruction).click();
				Robot R = new Robot();
				R.keyPress(KeyEvent.VK_DOWN);
				Thread.sleep(5000);
				utilities.MinimumWait(driver);
				driver.findElement(SelectCountcons).isSelected();
				utilities.MinimumWait(driver);

			}

			public void Enter_Finish_value() throws Throwable {
				utilities.webDriverWait(driver, EnterFinish);
				driver.findElement(EnterFinish).sendKeys("250");

			}

			public void Enter_specific_requirements() throws Throwable {
				utilities.webDriverWait(driver, specificrequirements);
				driver.findElement(specificrequirements).sendKeys("30*26/35*30");


			}

			public void Enter_Fabric_Quantity() throws Throwable {
				utilities.webDriverWait(driver, EnterFabricQuantity);
				driver.findElement(EnterFabricQuantity).sendKeys("2000");

			}

			public void Enter_Full_width() throws Throwable {
				utilities.webDriverWait(driver, EnterFullwidth);
				driver.findElement(EnterFullwidth).sendKeys("30");

			}

			public void Select_use() throws Throwable {
				utilities.webDriverWait(driver, ClickonUse);
				driver.findElement(ClickonUse).click();
				Thread.sleep(4000);
				driver.findElement(SelectUse).click();

			}

			public void Click_on_Reset_button() throws Throwable {
				utilities.webDriverWait(driver, ClickonResetbutton);
				driver.findElement(ClickonResetbutton).click();
				Thread.sleep(2000);

				utilities.webDriverWait(driver, ClickonFabricQuality);
				driver.findElement(ClickonFabricQuality).click();
				utilities.MinimumWait(driver);

				utilities.webDriverWait(driver, SelectFabricQuality);
				driver.findElement(SelectFabricQuality).click();
				Robot R = new Robot();
				R.keyPress(KeyEvent.VK_DOWN);

				boolean ElementPresent = driver.findElements(ClickContent).size()>0;
				   if(ElementPresent) {
					utilities.webDriverWait(driver, ClickContent);
					System.out.println("Content is present");
					driver.findElement(ClickContent).click();
					utilities.MediumWait(driver);
				   }

				   utilities.webDriverWait(driver, ClickonColor);
					driver.findElement(ClickonColor).click();
					Robot R1 = new Robot();
					R1.keyPress(KeyEvent.VK_DOWN);
					Thread.sleep(5000);
					driver.findElement(Selectcolor).click();

				utilities.webDriverWait(driver, CountConstruction );
				driver.findElement(CountConstruction).click();
				Robot R11 = new Robot();
				R11.keyPress(KeyEvent.VK_DOWN);
				Thread.sleep(5000);
				utilities.MinimumWait(driver);
				driver.findElement(SelectCountcons).isSelected();
				utilities.MinimumWait(driver);

				utilities.webDriverWait(driver, EnterFinish);
				driver.findElement(EnterFinish).sendKeys("200");

				utilities.webDriverWait(driver, specificrequirements);
				driver.findElement(specificrequirements).sendKeys("20*16/35*30");

				utilities.webDriverWait(driver, EnterFabricQuantity);
				driver.findElement(EnterFabricQuantity).sendKeys("1520");

				utilities.webDriverWait(driver, EnterFullwidth);
				driver.findElement(EnterFullwidth).sendKeys("40");

				utilities.webDriverWait(driver, ClickonUse);
				driver.findElement(ClickonUse).click();
				Thread.sleep(4000);
				driver.findElement(SelectUse).click();
			}

			public void Click_on_Save_button() throws Throwable {
				utilities.webDriverWait(driver, ClickonSavebutton);
				driver.findElement(ClickonSavebutton).click();
				Thread.sleep(2000);

			}

			public void Verify_the_Toaster_text_is_displaying_or_not() throws Throwable {
				utilities.webDriverWait(driver, ToasterMessage);
				driver.findElement(ToasterMessage);
				System.out.print("Mandatory Fields Are Required With  Valid Data.");
			}

			public void Click_on_Nomination_Checkbox() throws Throwable {
				utilities.webDriverWait(driver, Nominationcheckbox);
				driver.findElement(Nominationcheckbox).click();
				Thread.sleep(5000);
			}


			public void click_on_User_Account() throws Throwable {
				utilities.webDriverWait(driver, Uaccount);
				driver.findElement(AddNewFabric).click();
				utilities.MinimumWait(driver);
			}

			public void Click_on_Logout_button() throws Throwable {
				utilities.webDriverWait(driver, Logout);
				driver.findElement(Logout).click();
				utilities.MinimumWait(driver);
			}


//Adding the Pricing details for style in PD Fabric Pricing screen-------

			public void Navigate_to_PD_Fabric_Pricing_screen() throws Throwable {
				utilities.webDriverWait(driver, username);
				driver.findElement(username).sendKeys("lokesh");
				utilities.MinimumWait(driver);

				utilities.webDriverWait(driver, Password);
				driver.findElement(Password).sendKeys("Abcd@123");
				utilities.MinimumWait(driver);

				utilities.webDriverWait(driver, WovenKnit);
				driver.findElement(WovenKnit).click();

				utilities.webDriverWait(driver, Stylesexpansion);
				driver.findElement(Stylesexpansion).click();

				utilities.webDriverWait(driver, SelecttheIPO);
				driver.findElement(SelecttheIPO).click();

				utilities.webDriverWait(driver, PDFabricPricing);
				driver.findElement(PDFabricPricing).click();

			}





			}











