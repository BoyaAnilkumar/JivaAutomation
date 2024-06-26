package Page;

import org.openqa.selenium.By;
<<<<<<< HEAD
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import util.DriverFactory;
import util.Utilities;

public class GarmentProcess_Pages extends DriverFactory{
	Utilities utilities = new Utilities();
	By Production_Module = By.xpath("//span[text()=' Production ']");
	By Data_Entry = By.xpath("(//span[text()='Data Entry'])[7]");
	By Garment_Process = By.xpath("(//a[text()='Garment Process'])[1]");
	By Select_IPO_Text = By.xpath("//h3[text()='Select a IPO']");
	By Style_expansion = By.xpath("//a[@id='sidebarCollapse']");
	By Filter_Icon = By.xpath("//button[@id='navbarDropdown3']");
	By Merchant_filter = By.xpath("//div[text()='Select Merchant']");
	By Enter_Merchant = By.xpath("//input[@role='textbox']");
	By Select_Merchant = By.xpath("//div[@class='p-checkbox-box']");
	By Merchant_Card = By.xpath("//label[text()='Merchant']");
	By Search_IPO_Style = By.xpath("//input[@formcontrolname='searchText']");
	By Select_IPO = By.xpath("//div[@id='pills-tab']");
	By Apply = By.xpath("(//button[@type='submit'])[1]");
	By IPO_details = By.xpath("//ul[@class='row view-details mb-3']");
	By Block_Cutting = By.xpath("//label[text()='Block cutting']");
	By Half_Stitch = By.xpath("//label[text()='Half Stitch']");
	By Smocking_Stitch = By.xpath("//label[text()='Smocking']");
	By Pintuck_Stitch = By.xpath("//label[text()='Pintuck']");
	By Washing = By.xpath("//label[text()='Washing ']");
	By Washing_dropdown_field = By.xpath("//select[@formcontrolname='washingTypeId']");
	By Select_Washing = By.xpath("//select[@formcontrolname='washingTypeId']/.//option[text()=' Cold pigment']");
	By Embroidery = By.xpath("//label[@for='customSwitch-7']");
	By Running_Computer = By.xpath("//input[@id='embInGrmtStg+0']");
	By Manual_Embd = By.xpath("//input[@id='embInGrmtStg+1']");
	By Adda_Embd = By.xpath("//input[@id='embInGrmtStg+2']");
	By Hand_Embd = By.xpath("//input[@id='embInGrmtStg+3']");
	By Logo_Embd = By.xpath("//input[@id='embInGrmtStg+4']");      
	By Printing = By.xpath("//input[@formcontrolname='isPrinting']");
	By KajButton_Finishing = By.xpath("//input[@id='finshng+0']");
	By Submit_button = By.xpath("//button[text()=' Submit']");
	
	
	
	public void Click_on_Production_module() throws Throwable {
		utilities.webDriverWait(driver, Production_Module);
		driver.findElement(Production_Module).click();
		utilities.MinimumWait(driver);
		
	}


	public void click_on_Data_Entry_in_production() throws Throwable {
		utilities.webDriverWait(driver, Data_Entry);
		driver.findElement(Data_Entry).click();
		utilities.MinimumWait(driver);
		
	}


	public void Click_on_Garment_Process() throws Throwable {
		utilities.webDriverWait(driver, Garment_Process);
		driver.findElement(Garment_Process).click();
		utilities.MinimumWait(driver);
		
	}


	public void Verify_the_Select_IPO_text_is_displaying_in_garment_process_screen() throws Throwable {
		utilities.webDriverWait(driver, Select_IPO_Text);
		WebElement Text = driver.findElement(Select_IPO_Text);
		String Screentext = Text.getText();
		String GP_Text = "Select a IPO";
		if(Screentext.equals(GP_Text)) {
			System.out.println("User navigated to Garment Process " + Screentext);
		}else {
			System.out.println("User Not Navigated to Garment Process ");
		}
		
	}


	public void Click_on_Style_Expansion() throws Throwable {
		utilities.webDriverWait(driver, Style_expansion);
		driver.findElement(Style_expansion).click();
		utilities.MinimumWait(driver);
		
	}


	public void Clicked_on_Filter_icon_and_apply_filters() throws Throwable {
		utilities.webDriverWait(driver, Filter_Icon);
		driver.findElement(Filter_Icon).click();
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Merchant_filter);
		driver.findElement(Merchant_filter).click();
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Enter_Merchant);
		driver.findElement(Enter_Merchant).sendKeys("Lavanya");
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Select_Merchant);
		driver.findElement(Select_Merchant).click();
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Merchant_Card);
		driver.findElement(Merchant_Card).click();
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Search_IPO_Style);
		driver.findElement(Search_IPO_Style).click();
		utilities.MinimumWait(driver);
		driver.findElement(Search_IPO_Style).sendKeys("IPO1706");
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Apply);
		driver.findElement(Apply).click();
		utilities.MinimumWait(driver);
	}


	public void Click_on_the_IPO_in_expansion() throws Throwable {
		utilities.webDriverWait(driver, Select_IPO);
		driver.findElement(Select_IPO).click();
		utilities.MinimumWait(driver);
		
	}


	public void verify_the_IPO_details_after_selecting_the_IPO() throws Throwable {
		utilities.webDriverWait(driver, IPO_details);
		WebElement ipodetails = driver.findElement(IPO_details);
		String details = ipodetails.getText();
		System.out.println("Displaying the IPO details " + details);
		utilities.MinimumWait(driver);
		
	}


	public void click_on_Block_department_to_enable_the_toggle_button() throws Throwable {
		utilities.webDriverWait(driver, Block_Cutting);
		driver.findElement(Block_Cutting).click();
		utilities.MinimumWait(driver);
		
	}


	public void click_on_Half_Stitch_to_enable_the_toggle_button() throws Throwable {
		utilities.webDriverWait(driver, Half_Stitch);
		driver.findElement(Half_Stitch).click();
		utilities.MinimumWait(driver);
		
	}


	public void click_on_Washing_department_and_select_the_washing_process() throws Throwable {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)");
		
		utilities.webDriverWait(driver, Washing);
		driver.findElement(Washing).click();
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Washing_dropdown_field);
		driver.findElement(Washing_dropdown_field).click();
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Select_Washing);
		driver.findElement(Select_Washing).click();
		utilities.MinimumWait(driver);
		
		
	}


	public void click_on_the_Embroidery_department_and_select_the_process() throws Throwable {
		utilities.webDriverWait(driver, Embroidery);
		driver.findElement(Embroidery).click();
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Adda_Embd);
		driver.findElement(Adda_Embd).click();
		utilities.MinimumWait(driver);
		
	}


	public void Click_on_Submit_button_to_save_the_Garment_Process() throws Throwable {
		utilities.webDriverWait(driver, Submit_button);
		driver.findElement(Submit_button).click();
		utilities.MinimumWait(driver);
		
	}
	
=======
import org.openqa.selenium.WebElement;

import util.DriverFactory;
import util.Utilities;

public class GarmentProcess_Pages extends DriverFactory{
	Utilities utilities = new Utilities();
	By Production_Module = By.xpath("//span[text()=' Production ']");
	By Data_Entry = By.xpath("(//span[text()='Data Entry'])[7]");
	By Garment_Process = By.xpath("(//a[text()='Garment Process'])[1]");
	By Select_IPO_Text = By.xpath("//h3[text()='Select a IPO']");
	By Style_expansion = By.xpath("//a[@id='sidebarCollapse']");
	By Filter_Icon = By.xpath("//button[@id='navbarDropdown3']");
	By Merchant_filter = By.xpath("//div[text()='Select Merchant']");
	By Enter_Merchant = By.xpath("//input[@role='textbox']");
	By Select_Merchant = By.xpath("//div[@class='p-checkbox-box']");
	By Merchant_Card = By.xpath("//label[text()='Merchant']");
	By Search_IPO_Style = By.xpath("//input[@formcontrolname='searchText']");
	By Select_IPO = By.xpath("//div[@id='pills-tab']");
	By Apply = By.xpath("(//button[@type='submit'])[1]");
	By IPO_details = By.xpath("//ul[@class='row view-details mb-3']");
	By Block_Cutting = By.xpath("//label[text()='Block cutting']");
	By Half_Stitch = By.xpath("//label[text()='Half Stitch']");
	By Smocking_Stitch = By.xpath("//label[text()='Smocking']");
	By Pintuck_Stitch = By.xpath("//label[text()='Pintuck']");
	By Washing = By.xpath("//label[text()='Washing ']");
	By Washing_dropdown_field = By.xpath("//select[@formcontrolname='washingTypeId']");
	By Select_Washing = By.xpath("//select[@formcontrolname='washingTypeId']/.//option[text()=' Cold pigment']");
	By Embroidery = By.xpath("//input[@formcontrolname='isEmbroidery']");
	By Running_Computer = By.xpath("//input[@id='embInGrmtStg+0']");
	By Manual_Embd = By.xpath("//input[@id='embInGrmtStg+1']");
	By Adda_Embd = By.xpath("//input[@id='embInGrmtStg+2']");
	By Hand_Embd = By.xpath("//input[@id='embInGrmtStg+3']");
	By Logo_Embd = By.xpath("//input[@id='embInGrmtStg+4']");      
	By Printing = By.xpath("//input[@formcontrolname='isPrinting']");
	By KajButton_Finishing = By.xpath("//input[@id='finshng+0']");
	
	
	
	public void Click_on_Production_module() throws Throwable {
		utilities.webDriverWait(driver, Production_Module);
		driver.findElement(Production_Module).click();
		utilities.MinimumWait(driver);
		
	}


	public void click_on_Data_Entry_in_production() throws Throwable {
		utilities.webDriverWait(driver, Data_Entry);
		driver.findElement(Data_Entry).click();
		utilities.MinimumWait(driver);
		
	}


	public void Click_on_Garment_Process() throws Throwable {
		utilities.webDriverWait(driver, Garment_Process);
		driver.findElement(Garment_Process).click();
		utilities.MinimumWait(driver);
		
	}


	public void Verify_the_Select_IPO_text_is_displaying_in_garment_process_screen() throws Throwable {
		utilities.webDriverWait(driver, Select_IPO_Text);
		WebElement Text = driver.findElement(Select_IPO_Text);
		String Screentext = Text.getText();
		String GP_Text = "Select a IPO";
		if(Screentext.equals(GP_Text)) {
			System.out.println("User navigated to Garment Process " + Screentext);
		}else {
			System.out.println("User Not Navigated to Garment Process ");
		}
		
	}


	public void Click_on_Style_Expansion() throws Throwable {
		utilities.webDriverWait(driver, Style_expansion);
		driver.findElement(Style_expansion).click();
		utilities.MinimumWait(driver);
		
	}


	public void Clicked_on_Filter_icon_and_apply_filters() throws Throwable {
		utilities.webDriverWait(driver, Filter_Icon);
		driver.findElement(Filter_Icon).click();
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Merchant_filter);
		driver.findElement(Merchant_filter).click();
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Enter_Merchant);
		driver.findElement(Enter_Merchant).sendKeys("Lavanya");
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Select_Merchant);
		driver.findElement(Select_Merchant).click();
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Merchant_Card);
		driver.findElement(Merchant_Card).click();
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Search_IPO_Style);
		driver.findElement(Search_IPO_Style).click();
		utilities.MinimumWait(driver);
		driver.findElement(Search_IPO_Style).sendKeys("IPO1706");
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Apply);
		driver.findElement(Apply).click();
		utilities.MinimumWait(driver);
	}


	public void Click_on_the_IPO_in_expansion() throws Throwable {
		utilities.webDriverWait(driver, Select_IPO);
		driver.findElement(Select_IPO).click();
		utilities.MinimumWait(driver);
		
	}
>>>>>>> branch 'master' of https://github.com/BoyaAnilkumar/JivaAutomation.git
	
}
