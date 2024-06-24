package Page;

import org.openqa.selenium.By;
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
	
}
