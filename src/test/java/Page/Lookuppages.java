package Page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import util.DriverFactory;
import util.Utilities;

public class Lookuppages extends DriverFactory {
	Utilities utilities = new Utilities();
	
	String lookupname;

	By LookUp = By.xpath("//a[text()='Lookup']");
	By Add_Lookup = By.xpath("//button[text()=' Add']");
	By Category = By.xpath("//select[@formcontrolname='lookUpTypeId']");
	By Select_Category_1 = By.xpath("//option[text()=' AdditionalProcesses']");
	By Lookup_Name = By.xpath("//input[@formcontrolname='name']");
	By Save_button = By.xpath("//button[@type='submit']");
	By Create_Lookup = By.xpath("//h3[text()='Create Lookup ']");
	By Remarks_Lookup = By.xpath("//textarea[@formcontrolname='remarks']");
	By Grid_column_Name = By.xpath("//table//tbody[@class='p-element p-datatable-tbody']/tr[@class='ng-star-inserted']/td[2]");
	By Grid_Column_Type = By.xpath("//table//tbody[@class='p-element p-datatable-tbody']/tr[@class='ng-star-inserted']/td[1]");
	By Column_Name_Filter = By.xpath("(//tr/th/div/p-columnfilter)[2]");
	By Column_Name_Filter_Element = By.xpath("//p-columnfilterformelement/input[@class='p-inputtext p-component p-element ng-star-inserted']");
	By Column_Name_Filter_Apply = By.xpath("//div/button/span[text()='Apply']");
	By Column_Name_Filter_Clear = By.xpath("//div/button/span[text()='Clear']");
	By No_Data_Found = By.xpath("//td[text()='No Data Found.']");
	By SortingByColumns = By.xpath("//thead/tr/th/div/p-sorticon");
	By cateogry_validate = By.xpath("//div[@data-validate='Please Select Category']");
	By Next_Page = By.xpath("//span[@class='p-paginator-icon pi pi-angle-right']");
	By Previous_Page = By.xpath("//span[@class='p-paginator-icon pi pi-angle-left']");
	
	
	
	
	public void Click_on_Lookup_Screen() throws Throwable {
		utilities.webDriverWait(driver, LookUp);
		driver.findElement(LookUp).click();
		utilities.MinimumWait(driver);
		
		
	}

	public void Click_on_Add_button_in_Lookup_Screen() throws Throwable {
//		utilities.webDriverWait(driver, Add_Lookup);
//		driver.findElement(Add_Lookup).click();
//		utilities.MinimumWait(driver);
		
		String Select_Categories[] = {"AdditionalProcesses","Buying House","Delivery Term","Emb. Vendor","Expense Type","Fabric Checker","Fabric Color","Fabric Executives","Fabric Process","Fabric Use","Factory","Finishing Process",
										"Garment Process","Garment Type","Knitting Structure","Payment Term","Season","Stitching Daily Input Line Number","Stitching Process","Sweater Garment Process","Trim Category",
										"Trims & Accessories (II)","Washing / Garment Process","Washing Type","Yarn Use"};
		String Enter_Name[] = {"AdditPro2","BuyHou2","Air Ways","Manual Emb","Variable Expenses1","Arun G","Grey Black","Rajeshwari","Floral Printing","Printed Shirt","Chowman Textile Industry","Moist","Miecal","Orange Orgami","Knitting 13",
								"UPI Payments","Summer 2024","C12","Structure cutting fabric","Sweater Linking","Zipper","Recco","Hydro extractor machine","Bleach Wash","Yarn use 11"};
		
//        for (String category : Select_Categories) {
//        	WebElement dropdown = driver.findElement(Category);
//        	dropdown.click();
//        	utilities.MediumWait(driver);
//  
//        	 Select select = new Select(dropdown);
//             select.selectByVisibleText(category);
//             
//             
//            	 WebElement Input = driver.findElement(name);
//            	 Input.click();
//            	 utilities.MinimumWait(driver);
//            	 
//            	 Input.sendKeys(Enter_Name);
//            	 
//            	 utilities.webDriverWait(driver, Save_button);
//            	 driver.findElement(Save_button).click();
//            	 utilities.MinimumWait(driver);
//             
//            	driver.findElement(Add_Lookup).click();
//            	utilities.MinimumWait(driver);
//			
//		}
		
		for (int i = 0; i < Select_Categories.length; i++) {
			driver.findElement(Add_Lookup).click();
		    utilities.MinimumWait(driver);
		    
		    String category = Select_Categories[i];
		    String name = Enter_Name[i];

		    WebElement dropdown = driver.findElement(Category);
		    dropdown.click();
		    utilities.MediumWait(driver);

		    Select select = new Select(dropdown);
		    select.selectByVisibleText(category);

		    WebElement Input = driver.findElement(Lookup_Name);
		    Input.click();
		    utilities.MinimumWait(driver);

		    Input.sendKeys(name);

		    utilities.webDriverWait(driver, Save_button);
		    driver.findElement(Save_button).click();
		    utilities.MinimumWait(driver);

		    
		}
		
	}

	public void Click_on_Add_button_to_create_the_Lookup() throws Throwable {
		utilities.webDriverWait(driver, Add_Lookup);
		driver.findElement(Add_Lookup).click();
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Create_Lookup);
		String ScreenName = driver.findElement(Create_Lookup).getText();
		if(ScreenName.matches("Create Lookup")) {
			System.out.println("Displaying the screen name as:    " + ScreenName);
		}else {
			System.out.println("Screen Name is not matching with:  " + ScreenName);
		}
	}

	public void Select_the_category_from_dropdown_list() throws Throwable {
		utilities.webDriverWait(driver, Category);
		driver.findElement(Category).click();
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Select_Category_1);
		driver.findElement(Select_Category_1).click();
		utilities.MinimumWait(driver);
		
		
		
	}

	public void Enter_the_Name_and_Remarks() throws Throwable {
		utilities.webDriverWait(driver, Lookup_Name);
		driver.findElement(Lookup_Name).sendKeys("Process Sunny4");
		lookupname = driver.findElement(Lookup_Name).getAttribute("value");
		System.out.println("Inserted the Lookup_Name:  " + lookupname);
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Remarks_Lookup);
		driver.findElement(Remarks_Lookup).sendKeys("Warn No appenders could be found for logger (freemarker.cache)");
		utilities.MinimumWait(driver);
		
	}

	public void verify_the_active_checkbox_is_displaying_as_true_bydefault() {
		
		
	}

	public void Search_with_keyword_in_search_field_to_validate_the_created_lookup() throws Throwable {
		utilities.webDriverWait(driver, Grid_column_Name);
		String Name = driver.findElement(Grid_column_Name).getText();
		driver.findElement(Column_Name_Filter).click();
		utilities.MinimumWait(driver);
		
		driver.findElement(Column_Name_Filter_Element).sendKeys("CIS");
		utilities.MinimumWait(driver);
		
		driver.findElement(Column_Name_Filter_Apply).click();
		utilities.MinimumWait(driver);
		
		
		String NoDataFound = driver.findElement(No_Data_Found).getText();
		System.out.println("dislpaying the lookup name in the grid: " + Name);
		if(Name.equals(lookupname)) {
			System.out.println("displaying the lookup name as the user filtered:  " + Name);
		}else {
			System.out.println("Search data is not available in the :  " + NoDataFound);
		}
		
		utilities.MediumWait(driver);
		utilities.webDriverWait(driver, Grid_column_Name);
		
		driver.findElement(Column_Name_Filter).click();
		utilities.MinimumWait(driver);
		
		driver.findElement(Column_Name_Filter_Clear).click();
		utilities.MediumWait(driver);
		
		driver.findElement(Column_Name_Filter_Element).sendKeys("Process Sunny4");
		utilities.MinimumWait(driver);
		
		driver.findElement(Column_Name_Filter_Apply).click();
		utilities.MinimumWait(driver);
		
		String LookUpName = driver.findElement(Grid_column_Name).getText();
		
		System.out.println("dislpaying the lookup name in the grid: " + LookUpName);
		if(lookupname.equals(LookUpName)) {
			System.out.println("displaying the lookup name as the user filtered:  " + LookUpName);
		}else {
			System.out.println("Search data is not available in the :  " + NoDataFound);
		}
	}

	public void verify_the_validation_text_for_the_mandatory_fields() throws Throwable {
		utilities.webDriverWait(driver, cateogry_validate);
		WebElement Category_Message = driver.findElement(cateogry_validate);
		String validationmsg = Category_Message.getAttribute("data-validate");
		System.out.println();
		System.out.println("Validation msg is: " + validationmsg);
		utilities.MinimumWait(driver);
		
		WebElement Name_Message = driver.findElement(By.xpath("//div[@data-validate='Name is required']"));
		String Namevalidation = Name_Message.getAttribute("data-validate");
		System.out.println();
		System.out.println("Validation msg is: " + Namevalidation);
		utilities.MinimumWait(driver);
	}
	
	
	

	
	
	
	
	
	
	
public void click_on_sorting_icon_for_each_column() throws Throwable {
	WebElement table = driver.findElement(SortingByColumns);
	List<WebElement> columnheader = table.findElements(By.xpath("//thead/tr/th/div/p-sorticon"));

	for (WebElement header : columnheader) { 

		header.click();
		utilities.MinimumWait(driver);
		header.click();
		utilities.MinimumWait(driver);
	
}
		
	}

public void click_on_pagination_to_view_remaining_pages() throws Throwable {
	
	utilities.webDriverWait(driver, Next_Page);
	driver.findElement(Next_Page).click();
	utilities.MinimumWait(driver);
	
	driver.findElement(Next_Page).click();
	utilities.MinimumWait(driver);
	
	driver.findElement(Next_Page).click();
	utilities.MinimumWait(driver);
	
	driver.findElement(Previous_Page).click();
	utilities.MinimumWait(driver);
	
	driver.findElement(Previous_Page).click();
	utilities.MinimumWait(driver);
	
}


	
}
