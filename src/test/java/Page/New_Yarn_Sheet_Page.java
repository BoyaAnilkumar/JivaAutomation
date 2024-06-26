package Page;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import util.DriverFactory;
import util.Utilities;

public class New_Yarn_Sheet_Page extends DriverFactory {
	Utilities utilities = new Utilities();
	
	By Sweater 				  = By.xpath("//span[text()='Sweater ']");
	By username_field         = By.xpath("//input[@id='userName']");
	By password_field		  = By.xpath("//input[@id='userpassword']");
	By Merchandising_Module   = By.xpath("(//span[text()='Merchandising '])[2]");
	By Mer_Data_Entry         = By.xpath("(//span[text()='Data Entry'])[11]");
	By Generate_yarnsheet     = By.xpath("//span[text()='Generate Yarn Sheet']");
	By New_Yarn_Sheet         = By.xpath("//a[text()='New Yarn Sheet']");
	//Filter_functionality
	By Style_Expansion        = By.xpath("//a[@id='sidebarCollapse']");
	By Filter_Icon            = By.xpath("//button[@class='btn btn-primary btn-sm mb-2 float-right']");
	By Filter_Buyer           = By.xpath("(//div[contains(@class,'p-element p-multiselect-label-container')]//div)[1]");
	By Buyer_Text_field       = By.xpath("//input[contains(@class,'p-multiselect-filter p-inputtext')]");
	By Buyer_Check_Box        = By.xpath("//div[@class='p-checkbox-box']");
	By Click_field            = By.xpath("//div[text()='Filter Options']");
	By Filter_Season          = By.xpath("//select[@formcontrolname='seasonId']");
	By Style_IPO              = By.xpath("//input[@placeholder='Enter Buyer style # or IPO #']");
	By Apply_button           = By.xpath("//button[@class='btn btn-md btn-primary']");
	By Select_Style           = By.xpath("//div[@class='nav flex-column nav-pills ng-star-inserted']");
	//Information bar
	By IPO_Data               = By.xpath("(//p[@class='mb-0 text-primary font-weight-bold'])[1]");
	By Style                  = By.xpath("(//p[@class='mb-0 text-primary font-weight-bold'])[2]");
	By Buyer_Style            = By.xpath("(//p[@class='mb-0 text-primary font-weight-bold'])[3]");
	By PO_Qty                 = By.xpath("(//p[@class='mb-0 text-primary font-weight-bold'])[4]");
	By IPO_Qty                = By.xpath("(//p[@class='mb-0 text-primary font-weight-bold'])[5]");
	By Date_Submitted         = By.xpath("(//p[@class='mb-0 text-primary font-weight-bold'])[6]");
	//Add New yarn
	By Add_New_Yarn_Button    = By.xpath("//a[@class='btn btn-primary btn-sm ng-star-inserted']");
	By Isnominated_Check_box  = By.xpath("//input[@formcontrolname='isNominated']");
	By Supplier_field         = By.xpath("//select[@formcontrolname='supplierId']");
	By Yarn_Quality_field     = By.xpath("(//div[@class='ng-input']//input)[1]");
	By Content_field          = By.xpath("//select[@formcontrolname='content']");
	By Count_field            = By.xpath("//select[@formcontrolname='construction']");
	By Use_field              = By.xpath("//select[@formcontrolname='use']");
	By Supplier_internalcode  = By.xpath("//select[@formcontrolname='supplierCode']");
	By Finish_field           = By.xpath("//input[@placeholder='Enter Finish / Special Requirements']");
	By Colour_field           = By.xpath("(//div[@role='combobox']//input)[2]");
	By Applicable_Combos      = By.xpath("//select[@formcontrolname='comboId']");
	By Addl_Information       = By.xpath("//textarea[@placeholder='Enter Addl Information']");
	By Additional_field       = By.xpath("//input[@placeholder='Enter Additional (%)']");
	By PO_Type_field          = By.xpath("//select[@formcontrolname='buyerGarmentSizeBreakupId']");
	By Base_Size              = By.xpath("//input[@formcontrolname='baseSizeAverage']");
	By Percentage_field       = By.xpath("//input[@formcontrolname='percentageChanged']");
	By Size_Breakup_field     = By.xpath("//input[@formcontrolname='sizeName']");
	By PO_Qty_field           = By.xpath("//input[@formcontrolname='poQty']");
	By IPO_Qty_field          = By.xpath("//input[@formcontrolname='ipoQty']");
	By Avg_field              = By.xpath("//input[@placeholder='Enter Avg']");
	By Knitting_Avg           = By.xpath("//input[@formcontrolname='garmentAvg']");
	By Linking_Avg            = By.xpath("//input[@placeholder='Enter Linking Avg.']");
	By Size_set_field         = By.xpath("//input[@placeholder='Enter Size Set.']");
	By Testing_field          = By.xpath("//input[@placeholder='Enter Testing']");
	By sealer_field           = By.xpath("//input[@placeholder='Enter Sealer']");
	By TOP_field              = By.xpath("//input[@placeholder='Enter TOP']");
	By Shipment_field         = By.xpath("//input[@placeholder='Enter Shipment/Platform Sample']");
	By Photoshoot_field       = By.xpath("//input[@placeholder='Enter Photoshoot / Meeting']");
	By Garment_UOM            = By.xpath("//select[@formcontrolname='garmentAvgUOMId']");
	By Required_UOM           = By.xpath("//select[@formcontrolname='uomId']");
	By Yarn_Required_Prod     = By.xpath("//input[@formcontrolname='yarnRequredforCutting']");
	By Yarn_Req_Sam           = By.xpath("//input[@formcontrolname='yarnRequredforSampling']");
	By Total_yarn_Req         = By.xpath("//input[@formcontrolname='totalYarn']");
	By Submit_Button          = By.xpath("(//button[contains(@class,'btn btn-primary')])[2]");
	By Validation_msg         = By.xpath("//h2[text()='Mandatory Fields Are Required With  Valid Data.']");
	By Bulk_yarn_deadline     = By.xpath("//input[@formcontrolname='bulkYarnDeadline']");
	By Sourcing_manager       = By.xpath("//select[@formcontrolname='yarnManagerId']");
	By Save_Button            = By.xpath("//button[text()=' Save ']");
	By Submit_yarn_Team       = By.xpath("//button[text()=' Submit to Yarn Team']");
	By Edit_Icon              = By.xpath("(//tr[@class='ng-star-inserted'])[2]//button[@title='Edit']");
	By Partial_Validation_msg = By.xpath("//h2[text()='New Yarn Sheet Partially Updated Successfully']");
	By PO_Qty_fields_valida   = By.xpath("//h2[text()='Sum of Size Break-up PO Qty Should be Equal to Missy Garment Size PO Qty']");
	By Delete_Icon            = By.xpath("(//tr[@class='ng-star-inserted'])[2]//button[@class='btn btn-sm btn-danger ng-star-inserted']");
	By Delete_Yes_button      = By.xpath("//button[text()='Yes']");
    //PO_Qty_fields	
	By Missy_PO_field         = By.xpath("(//div[@class='row'])[4]//input[@formcontrolname='poQty']");
	By Missy_PO_Readonly      = By.xpath("(//input[@type='number'])[1]");
	By Petite_PO_field        = By.xpath("(//div[@class='row'])[5]//input[@formcontrolname='poQty']");
	By Petite_PO_Readonly     = By.xpath("(//input[@type='number'])[3]");
    By Tall_PO_field          = By.xpath("(//div[@class='row'])[6]//input[@formcontrolname='poQty']");
	By Tall_PO_Readonly       = By.xpath("(//input[@type='number'])[3]");
	By Women_PO_field         = By.xpath("(//div[@class='row'])[6]//input[@formcontrolname='poQty']");
	By Women_PO_Readonly      = By.xpath("(//input[@type='number'])[3]");
	//Import functionality
	By Import_yarn_Button     = By.xpath("//button[text()=' Import Yarn Details']");
	By Import_Popup           = By.xpath("//h5[@id='importFabricDetailsLabel']");
	By Within_IPO             = By.xpath("//input[@name='withinIPO']");
	By Select_Yarn            = By.xpath("//ng-select[@bindlabel='yarnQuality']");
	By Import_button          = By.xpath("//button[text()=' Import']");
	By Import_Close           = By.xpath("//button[text()=' Close']");
	By Other_Ipo              = By.xpath("//input[@id='isotherIPO']");
	By Select_IPO_import      = By.xpath("//ng-select[@bindlabel='ipoNumber']");   
	By Select_Other_yarn      = By.xpath("(//ng-select[@bindlabel='yarnName'])[2]");
	By Select_PDYDS           = By.xpath("//input[@name='PdFds']");
	By Select_PDYDS_yarn      = By.xpath("(//ng-select[@bindlabel='yarnName'])[3]");
	
	By Yarn_Details_Grid      = By.xpath("(//tbody[@class='p-element p-datatable-tbody'])[1]");
	By Garment_Details_Grid   = By.xpath("(//tbody[@class='p-element p-datatable-tbody'])[2]");
	By Quantity_Details       = By.xpath("(//tbody[@class='p-element p-datatable-tbody'])[3]");
	By View_For_Print         = By.xpath("//button[text()=' View for Print ']");
	By View_IPO_Data          = By.xpath("//td[@class='text-right p-2']");
	By Dropdown_List          = By.xpath("//div[text()='No items found']");

	
   public void User_enters_the(String username, String password) throws Throwable {
	     utilities.webDriverWait(driver, username_field);
	     driver.findElement(username_field).sendKeys(username);
	     driver.findElement(password_field).sendKeys(password);
	     utilities.MediumWait(driver);
		
	}
	public void Click_on_the_Generate_Yarn_Sheet_dropdown() throws Throwable {
		utilities.webDriverWait(driver, Generate_yarnsheet);
		driver.findElement(Generate_yarnsheet).click();
		utilities.MinimumWait(driver);
	}

	public void Click_on_the_New_Yarn_Sheet_Screen() throws Throwable {
		utilities.webDriverWait(driver, New_Yarn_Sheet);
		driver.findElement(New_Yarn_Sheet).click();
		utilities.MinimumWait(driver);
		
	}
	public void Click_on_the_Merchandising_Module() throws Throwable {
		utilities.webDriverWait(driver, Merchandising_Module);
		driver.findElement(Merchandising_Module).click();
		utilities.MinimumWait(driver);
				
	}
	public void Click_on_Data_Entry_dropdown() throws Throwable {
		utilities.webDriverWait(driver, Mer_Data_Entry);
		driver.findElement(Mer_Data_Entry).click();
		utilities.MinimumWait(driver);
	}
	public void User_click_on_the_Style_Expansion() throws Throwable {
		utilities.webDriverWait(driver, Style_Expansion);
		driver.findElement(Style_Expansion).click();
		utilities.MinimumWait(driver);
		
	}
    public void Click_on_the_Filter_Icon_in_Style_Expansion() throws Throwable {
    	utilities.webDriverWait(driver, Filter_Icon);
		driver.findElement(Filter_Icon).click();
		utilities.MinimumWait(driver);
		
	}
	public void Select_the_in_Filter_option_page(String Buyer) throws Throwable {
		driver.findElement(Filter_Buyer).click();
		Thread.sleep(2000);
		driver.findElement(Buyer_Text_field).sendKeys(Buyer);
		utilities.MediumWait(driver);
		driver.findElement(Buyer_Check_Box).click();
		utilities.MediumWait(driver);
		driver.findElement(Filter_Buyer).click();
		utilities.MediumWait(driver);
	}
	public void Select_in_the_Filter_option_page(String Season) throws Throwable {
		utilities.webDriverWait(driver, Filter_Season);
		driver.findElement(Filter_Season).click();
	    Thread.sleep(1000);    
	    WebElement season = driver.findElement(Filter_Season);
	    Select Sea = new Select(season);

	    boolean SeasonExists = false;
	    for (WebElement option : Sea.getOptions()) {
	        if (option.getText().equals(Season)) {
	        	SeasonExists = true;
	            break;
	        }
	    }

	    if (SeasonExists) {
	    	Sea.selectByVisibleText(Season);
	    } else {
	        System.out.println("Selected Season is not displayed in the dropdown list");
	    }

	    utilities.MediumWait(driver);

	}
	By    Box    = By.xpath("(//div[@class='card-body'])[1]");
	public void Enter_the_Buyer_in_Search_By_Buyer_Style_Or_IPO(String StyleOrIPO) throws Throwable {
		utilities.webDriverWait(driver, Style_IPO);
		driver.findElement(Style_IPO).sendKeys(StyleOrIPO);
		utilities.MinimumWait(driver);		

	}
	public void click_on_the_Apply_button() throws Throwable {
		utilities.webDriverWait(driver, Apply_button);
		driver.findElement(Apply_button).click();
		utilities.MinimumWait(driver);
		
	}
	public void Select_the_IPO_in_the_Styles_List() throws Throwable {
		
		utilities.webDriverWait(driver, Select_Style);
		driver.findElement(Select_Style).click();
		utilities.MinimumWait(driver);
		
	}
	public void user_enter_the_Username_and_password() throws Throwable {
		utilities.webDriverWait(driver, username_field);
		driver.findElement(username_field).sendKeys("Admin");
		driver.findElement(password_field).sendKeys("Abcd@123");
		utilities.MinimumWait(driver);
		
	}
	public void Click_on_the_Add_New_Yarn_Sheet_button() throws Throwable {
		utilities.webDriverWait(driver, Add_New_Yarn_Button);
		driver.findElement(Add_New_Yarn_Button).click();
		utilities.MinimumWait(driver);
		
	}
	public void I_click_the_Isnominated_checkbox_labeled(String action, String label) {
		WebElement checkbox = driver.findElement(Isnominated_Check_box);
        if (action.equals("check") && !checkbox.isSelected()) {
            checkbox.click();
        } else if (action.equals("uncheck") && checkbox.isSelected()) {
            checkbox.click();
        }
    	
	}
	public void Select_the_Supplier_name(String Supplier) throws Throwable {
		driver.findElement(Supplier_field).click();
	    Thread.sleep(1000);    
	    WebElement supplier = driver.findElement(Supplier_field);
	    if (supplier.isEnabled()) {
	    Select Supplierfield = new Select(supplier);
	    utilities.MediumWait(driver);
	    Supplierfield.selectByVisibleText(Supplier);
	    
	    }
	 else {
		  System.out.println("Supplier dropdown is disabled or not available.");
	 }
	    utilities.MediumWait(driver);
	
	}
	public void Select_the_(String YarnQuality) throws Throwable {
		utilities.webDriverWait(driver, Yarn_Quality_field);
		Thread.sleep(1000); 
		driver.findElement(Yarn_Quality_field).sendKeys(YarnQuality);
		utilities.MinimumWait(driver);
		Thread.sleep(1000); 
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);

	}
	public void Select_the_content(String Content) throws Throwable {
		driver.findElement(Content_field).click();
	    Thread.sleep(1000);    
	    WebElement season = driver.findElement(Content_field);
	    Select Sea = new Select(season);

	    boolean SeasonExists = false;
	    for (WebElement option : Sea.getOptions()) {
	        if (option.getText().equals(Content)) {
	        	SeasonExists = true;
	            break;
	        }
	    }

	    if (SeasonExists) {
	    	Sea.selectByVisibleText(Content);
	    } else {
	        System.out.println("Selected Season is not displayed in the dropdown list");
	    }

	    utilities.MediumWait(driver);

		
	}
	public void Select_the_Count(String count) throws Throwable {
		utilities.webDriverWait(driver, Count_field);
		driver.findElement(Count_field).click();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
	}
	public void Select_the_yarn_use(String Use) throws Throwable {
		driver.findElement(Use_field).click();
	    Thread.sleep(1000);    
	    WebElement use = driver.findElement(Use_field);
	    Select Usefield = new Select(use);

	    boolean SeasonExists = false;
	    for (WebElement option : Usefield.getOptions()) {
	        if (option.getText().equals(Use)) {
	        	SeasonExists = true;
	            break;
	        }
	    }

	    if (SeasonExists) {
	    	Usefield.selectByVisibleText(Use);
	    } else {
	        System.out.println("Selected Season is not displayed in the dropdown list");
	    }

	    utilities.MediumWait(driver);		
	}
	public void Select_the_Supplier_internal_Code() {
		
		
	}
	public void enter_the_data_in_Finish_Special_Requirements() throws Throwable {		
		utilities.webDriverWait(driver, Finish_field);
		driver.findElement(Finish_field).sendKeys("10");
		utilities.MinimumWait(driver);		
	}
	public void Select_the_Colour(String Color) throws Throwable {		
		utilities.webDriverWait(driver, Colour_field);
		Thread.sleep(1000); 
		driver.findElement(Colour_field).sendKeys(Color);
		utilities.MinimumWait(driver);
		Thread.sleep(1000); 
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);		
	}
	public void Select_the_Combos_in_the_Applicable_Combos_field() throws Throwable {
		utilities.webDriverWait(driver, Applicable_Combos);
		driver.findElement(Applicable_Combos).click();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);		
	}
	public void User_enter_the_data_in_Additional_information_field() throws Throwable {
		utilities.webDriverWait(driver, Addl_Information);
		driver.findElement(Addl_Information).sendKeys("Information");
		utilities.MinimumWait(driver);		
	}
	public void Enter_the_Additional_percentage() throws Throwable {
		utilities.webDriverWait(driver, Additional_field);
		driver.findElement(Additional_field).clear();
		driver.findElement(Additional_field).sendKeys("10");
		utilities.MinimumWait(driver);		
	}
	public void Select_the_PO_Type() throws Throwable {
		 WebDriverWait wait = new WebDriverWait(driver, 10); // Adjust the wait time as needed
	      wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(PO_Type_field));
	      List<WebElement> POtypeElements = driver.findElements(PO_Type_field);
	      for (WebElement POtypeElement : POtypeElements) {
	          if (POtypeElement.isEnabled()) {
	           System.out.println("Element is enabled.");
	           driver.findElement(PO_Type_field).click();
	               Robot r = new Robot();
	        		r.keyPress(KeyEvent.VK_DOWN);
	        		Thread.sleep(2000);
	        		r.keyPress(KeyEvent.VK_ENTER);
	        		Thread.sleep(2000);	
	                utilities.MinimumWait(driver); 
	            }
	        }
	}
	public void User_enter_the_Average(String BaseSize) throws Throwable {
 //       WebDriverWait wait = new WebDriverWait(driver, 10); // Adjust the wait time as needed
//        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Base_Size));
        // Find all elements matching the locator
        List<WebElement> baseSizeElements = driver.findElements(Base_Size);
        // Iterate over each element
        for (WebElement baseSizeElement : baseSizeElements) {
            if (baseSizeElement.isEnabled()) {
                // If the element is enabled, perform actions
                System.out.println("Element is enabled.");
                baseSizeElement.clear(); // Clear the input field if needed
                baseSizeElement.sendKeys(BaseSize);

                utilities.MinimumWait(driver); // Optional wait
            }
        }
	}
	public void Enter_the_data_in_field(String percentage) throws Throwable {
		  WebDriverWait wait = new WebDriverWait(driver, 10); // Adjust the wait time as needed
	        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Percentage_field));
	        List<WebElement> percentageElements = driver.findElements(Percentage_field);
	        for (WebElement percentageElement : percentageElements) {
	            if (percentageElement.isEnabled()) {
	                System.out.println("Element is enabled.");
	                percentageElement.clear(); 
	                percentageElement.sendKeys(percentage);

	                utilities.MinimumWait(driver); 
	            }
	        }
	}
	
	public void Check_the_Size_Breakups_are_prepopulated_or_not() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		  wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Size_Breakup_field));        
          List<WebElement> sizebreakupElements = driver.findElements(Size_Breakup_field);
          for (WebElement sizeElement : sizebreakupElements) {             
              if (sizeElement.isDisplayed()) {                 
                  String dataText = sizeElement.getAttribute("value");
                  System.out.println("Size field value: " + dataText);
              }
          }		
	}
	
  public void Enter_the_Missy_Garment_size_PO_Qty() {
	   try {
			  List<WebElement> POQtyElements = driver.findElements(Missy_PO_field);
			  WebElement POQtyValue = driver.findElement(Missy_PO_Readonly);
	          String value = POQtyValue.getAttribute("value");
	          System.out.println("PO Qty Value " + value);
	          int totalPOQty = Integer.parseInt(value);
	  		  int enabledFieldsCount =0;
	  		  
	          for (WebElement POElement : POQtyElements) {
	  	            // Check if the element is enabled
	  	            if (POElement.isEnabled() && POElement.getAttribute("readonly") == null) {
	  	                    enabledFieldsCount++;
	  	              }
	  	       }
	  		  for (WebElement POElement : POQtyElements) {
	  		        // Check if the element is enabled
	  		        if (POElement.isEnabled()) {
	  		        	String readonlyAttribute = POElement.getAttribute("readonly");
	  		            if (readonlyAttribute != null) {
	  		                String dataText = POElement.getAttribute("value");	  		                		
	  		                System.out.println("Missy PO Qty field is read-only. Displaying data: " + dataText);
	  		            }
	  		            else {
	  		            	int fieldValue = totalPOQty/ enabledFieldsCount;
	  		                POElement.sendKeys(String.valueOf(fieldValue));
	  		                System.out.println("Data is sended to PO Qty field" + fieldValue);
	  		            }         
	  		         }
	  		    }
			}
			catch(Exception e) {
	              System.out.println("Missy garment Size is not displayed");
			}
	}
		

	public void Enter_the_Pettite_garment_size_PO_Qty() {
		 try {		
			  List<WebElement> POQtyElements = driver.findElements(Petite_PO_field);
			  WebElement POQtyValue = driver.findElement(Petite_PO_Readonly);
	          String value = POQtyValue.getAttribute("value");
	          System.out.println("PO Qty Value " + value);
	          int totalPOQty = Integer.parseInt(value);
	  		  int enabledFieldsCount =0;
	  		  
	          for (WebElement POElement : POQtyElements) {
	  	            // Check if the element is enabled
	  	            if (POElement.isEnabled() && POElement.getAttribute("readonly") == null) {
	  	                    enabledFieldsCount++;
	  	              }
	  	       }
	  		  for (WebElement POElement : POQtyElements) {
	  		        // Check if the element is enabled
	  		        if (POElement.isEnabled()) {
	  		        	String readonlyAttribute = POElement.getAttribute("readonly");
	  		            if (readonlyAttribute != null) {
	  		                String dataText =POElement.getAttribute("value");
	  		                		
	  		                System.out.println("Petite PO Qty field is read-only. Displaying data: " + dataText);
	  		            }
	  		            else {
	  		            	int fieldValue = totalPOQty/ enabledFieldsCount;
	  		                POElement.sendKeys(String.valueOf(fieldValue));
	  		                System.out.println("Data is sended to PO Qty field" + fieldValue);
	  		            }         
	  		         }
	  		    }
			}
			catch(Exception e) {
	              System.out.println("Petite garment Size is not displayed");
			}
		
	}

	public void Enter_the_Tall_Garment_size_PO_Qty() {
		try {			     
			  List<WebElement> POQtyElements = driver.findElements(Tall_PO_field);
			  WebElement POQtyValue = driver.findElement(Tall_PO_Readonly);
	          String value = POQtyValue.getAttribute("value");
	          System.out.println("PO Qty Value " + value);
	          int totalPOQty = Integer.parseInt(value);
	  		  int enabledFieldsCount =0;
	  		  
	          for (WebElement POElement : POQtyElements) {
	  	            // Check if the element is enabled
	  	            if (POElement.isEnabled() && POElement.getAttribute("readonly") == null) {
	  	                    enabledFieldsCount++;
	  	              }
	  	       }
	  		  for (WebElement POElement : POQtyElements) {
	  		        // Check if the element is enabled
	  		        if (POElement.isEnabled()) {
	  		        	String readonlyAttribute = POElement.getAttribute("readonly");
	  		            if (readonlyAttribute != null) {
	  		                String dataText =
	  		                		POElement.getAttribute("value");
	  		                System.out.println("Tall PO Qty field is read-only. Displaying data: " + dataText);
	  		            }
	  		            else {
	  		            	int fieldValue = totalPOQty/ enabledFieldsCount;
	  		                POElement.sendKeys(String.valueOf(fieldValue));
	  		                System.out.println("Data is sended to PO Qty field" + fieldValue);
	  		            }         
	  		         }
	  		    }
			}
			catch(Exception e) {
	              System.out.println("Tall garment Size is not displayed");
			}
		
	}

	public void Enter_the_Women_Garment_size_PO_Qty() {
		try {        
			  List<WebElement> POQtyElements = driver.findElements(Women_PO_field);
			  WebElement POQtyValue = driver.findElement(Women_PO_Readonly);
	          String value = POQtyValue.getAttribute("value");
	          System.out.println("PO Qty Value " + value);
	          int totalPOQty = Integer.parseInt(value);
	  		  int enabledFieldsCount =0;
	  		  
	          for (WebElement POElement : POQtyElements) {
	  	            // Check if the element is enabled
	  	            if (POElement.isEnabled() && POElement.getAttribute("readonly") == null) {
	  	                    enabledFieldsCount++;
	  	              }
	  	       }
	  		  for (WebElement POElement : POQtyElements) {
	  		        // Check if the element is enabled
	  		        if (POElement.isEnabled()) {
	  		        	String readonlyAttribute = POElement.getAttribute("readonly");
	  		            if (readonlyAttribute != null) {
	  		                String dataText =POElement.getAttribute("value");	  		                		
	  		                System.out.println("Women PO Qty field is read-only. Displaying data: " + dataText);
	  		            }
	  		            else {
	  		            	int fieldValue = totalPOQty/ enabledFieldsCount;
	  		                POElement.sendKeys(String.valueOf(fieldValue));
	  		                System.out.println("Data is sended to PO Qty field" + fieldValue);
	  		            }         
	  		         }
	  		    }
			}
			catch(Exception e) {
	              System.out.println("Women garment Size is not displayed");
			}
		
	}
	public void Check_the_IPO_Qty_is_prepopulated_or_not() {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		  wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(IPO_Qty_field));        
        List<WebElement> IPOqtyElements = driver.findElements(IPO_Qty_field);
        for (WebElement IPOQTYElement : IPOqtyElements) {             
            if (IPOQTYElement.isDisplayed()) {                 
                String dataText = IPOQTYElement.getAttribute("value");
                System.out.println("Size field value: " + dataText);
            }
        }
		}
        catch(Exception e) {
        	System.out.print("IPO  Qty fields are not displayed");
        }
		
	}
	public void Check_the_Avg_Values_are_prepopulated_or_not() {
	  WebDriverWait wait = new WebDriverWait(driver, 10);
	  wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Avg_field));        
      List<WebElement> AvgElements = driver.findElements(Avg_field);
      for (WebElement AvgElement : AvgElements) {             
          if (AvgElement.isDisplayed()) {                 
              String dataText = AvgElement.getAttribute("value");
              System.out.println("Avg field value: " + dataText);
          }
      }		
		
	}
	public void Verify_the_Based_on_the_Garment_Size_type_PO_Qty_is_prepopulated_in_the_PO_Qty_field_or_not() {
		
		
	}
	public void Verify_the_Based_on_the_Garment_Size_type_IPO_Qty_is_prepopulated_in_the_PO_Qty_field_or_not() {
		
		
	}
	public void The_Knitting_Avg_field_data_is_prepopulated_or_not() {
		 WebDriverWait wait = new WebDriverWait(driver, 10);
		  wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Knitting_Avg));        
	      List<WebElement> KnittingAvgElements = driver.findElements(Knitting_Avg);
	      for (WebElement KnittingAvgElement : KnittingAvgElements) {             
	          if (KnittingAvgElement.isDisplayed()) {                 
	              String dataText = KnittingAvgElement.getAttribute("value");
	              System.out.println("Knitting Avg field value: " + dataText);
	          }
	      }		
		
	}
	public void User_enter_the_Linking_Avg_data(String LinkingAvg) throws Throwable {
		   WebDriverWait wait = new WebDriverWait(driver, 10); 
	        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Linking_Avg));
	      
	        List<WebElement> LinkingAvgElements = driver.findElements(Linking_Avg);
	     
	        for (WebElement LinkingAvgElement : LinkingAvgElements) {
	            if (LinkingAvgElement.isEnabled()) {
	              
	                System.out.println("Element is enabled.");
	                LinkingAvgElement.clear(); 
	                LinkingAvgElement.sendKeys(LinkingAvg);
	                utilities.MinimumWait(driver); 
	            }
	        }
		
	}
	public void Enter_the_data_in_th_Size_set_field(String Sizeset) throws Throwable {
		utilities.webDriverWait(driver, Size_set_field);
		Thread.sleep(1000); 
		driver.findElement(Size_set_field).sendKeys(Sizeset);
		utilities.MinimumWait(driver);
		
	}
	public void User_enter_the_data_in_the_Testing_field(String Testing) throws Throwable {
		utilities.webDriverWait(driver, Testing_field);
		Thread.sleep(1000); 
		driver.findElement(Testing_field).sendKeys(Testing);
		utilities.MinimumWait(driver);
		
	}
	public void User_enter_the_data_in_the_Sealer_field(String Sealer) throws Throwable {
		utilities.webDriverWait(driver, sealer_field);
		Thread.sleep(1000); 
		driver.findElement(sealer_field).sendKeys(Sealer);
		utilities.MinimumWait(driver);
		
	}
	public void User_enter_the_data_in_the_TOP_field(String TOP) throws Throwable {
		utilities.webDriverWait(driver, TOP_field);
		Thread.sleep(1000); 
		driver.findElement(TOP_field).sendKeys(TOP);
		utilities.MinimumWait(driver);
		
	}
	public void User_enter_the_data_in_the_ShipmentPlatform_Sample(String Shipment) throws Throwable {
		utilities.webDriverWait(driver, Shipment_field);
		Thread.sleep(1000); 
		driver.findElement(Shipment_field).sendKeys(Shipment);
		utilities.MinimumWait(driver);
		
	}
	public void User_enter_the_data_in_the_Photoshoot_Meeting_Sample(String Photoshoot) throws Throwable {		
		utilities.webDriverWait(driver, Photoshoot_field);
		Thread.sleep(1000); 
		driver.findElement(Photoshoot_field).sendKeys(Photoshoot);
		utilities.MinimumWait(driver);
	}

	public void The_User_Select_the_Garment_Average_UOM() throws Throwable {
		utilities.webDriverWait(driver, Garment_UOM);
		Thread.sleep(1000); 
		driver.findElement(Garment_UOM).click();
		utilities.MinimumWait(driver);
		Thread.sleep(1000); 
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);		
		
	}
	public void User_Select_the_Required_UOM() throws Throwable {
		utilities.webDriverWait(driver, Required_UOM);
		Thread.sleep(1000); 
		driver.findElement(Required_UOM).click();
		utilities.MinimumWait(driver);
		Thread.sleep(1000); 
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);		
				
	}
	public void Check_the_data_is_prepopulated_in_the_Yarn_Required_For_Production_field_or_not() {
		 WebDriverWait wait = new WebDriverWait(driver, 10);
		  wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Yarn_Required_Prod));        
	      List<WebElement> yarn_reqElements = driver.findElements(Yarn_Required_Prod);
	      for (WebElement Yarn_ReqElement : yarn_reqElements) {             
	          if (Yarn_ReqElement.isDisplayed()) {                 
	              String dataText = Yarn_ReqElement.getAttribute("value");
	              System.out.println("Yarn Required For Production field value: " + dataText);
	          }
	      }		
		
	}
	public void Check_the_data_is_prepopulated_in_the_Yarn_Required_For_Sampling_field_or_not() {
		 WebDriverWait wait = new WebDriverWait(driver, 10);
		  wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Yarn_Req_Sam));        
	      List<WebElement> yarnElements = driver.findElements(Yarn_Req_Sam);
	      for (WebElement yarnElement : yarnElements) {             
	          if (yarnElement.isDisplayed()) {                 
	              String dataText = yarnElement.getAttribute("value");
	              System.out.println("Yarn Required For Sampling field value: " + dataText);
	          }
	      }		
		
	}
	public void Check_the_data_is_prepopulated_in_the_Total_Yarn_Required_field_or_not() {
		 WebDriverWait wait = new WebDriverWait(driver, 10);
		  wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Total_yarn_Req));        
	      List<WebElement> TotalyarnElements = driver.findElements(Total_yarn_Req);
	      for (WebElement TotalyarnElement : TotalyarnElements) {             
	          if (TotalyarnElement.isDisplayed()) {                 
	              String dataText = TotalyarnElement.getAttribute("value");
	              System.out.println("Total Yarn Required field value: " + dataText);
	          }
	      }		
		
	}
	public void The_User_Click_on_the_Submit_button() throws Throwable {
		utilities.webDriverWait(driver, Submit_Button);
		driver.findElement(Submit_Button).click();
		
	}
	public void Validation_message_should_be_displayed() throws Throwable {
		Boolean isPresent = driver.findElements(Validation_msg).size()>0;
		if (isPresent) {
		WebElement Data = driver.findElement(Validation_msg);
		String test = Data.getText(); 
		String expectedData = "Mandatory Fields Are Required With Valid Data.";
		if (expectedData.equals(test)) {
			System.out.println("Display validation msg is correct." + test);
		} else {
			System.out.println("Display validation msg is incorrect."+ test);
		}
	}
	
	}
	public void Click_on_the_Merchandising_Module_in_the_Sweater_module() throws Throwable {
		utilities.webDriverWait(driver, Sweater);
		driver.findElement(Sweater).click();
		utilities.webDriverWait(driver, Merchandising_Module);
		driver.findElement(Merchandising_Module).click();
		utilities.MinimumWait(driver);
		
	}
	public void Click_on_the_New_Yarn_Sheet_Screen_under_the_Generate_Yarn_Sheet_dropdown() throws Throwable {
		utilities.webDriverWait(driver, Mer_Data_Entry);
		driver.findElement(Mer_Data_Entry).click();
		utilities.MinimumWait(driver);
		utilities.webDriverWait(driver, Generate_yarnsheet);
		driver.findElement(Generate_yarnsheet).click();
		utilities.MinimumWait(driver);
		utilities.webDriverWait(driver, New_Yarn_Sheet);
		driver.findElement(New_Yarn_Sheet).click();
		utilities.MinimumWait(driver);
		
	}
	public void Enter_the_data_in_the(String BulkYarnDeadline) throws Throwable {
		utilities.webDriverWait(driver,Bulk_yarn_deadline );
		driver.findElement(Bulk_yarn_deadline).clear();
		driver.findElement(Bulk_yarn_deadline).sendKeys(BulkYarnDeadline);
		utilities.MinimumWait(driver);
		
	}
	public void User_Select_the_Sourcing_Manager(String Sourcingmanager) throws Throwable {
		driver.findElement(Sourcing_manager).click();
	    Thread.sleep(1000);    
	    WebElement Sou_Manager = driver.findElement(Sourcing_manager);
	    if (Sou_Manager.isDisplayed()) {
	    Select Sourcingfield = new Select(Sou_Manager);
	    utilities.MediumWait(driver);
	    Sourcingfield.selectByVisibleText(Sourcingmanager);
	    
	    }
	 else {
		  System.out.println("Sourcing manager dropdown list data is not displayed");
	 }
	    utilities.MediumWait(driver);
		
	}
	public void Click_on_the_Submit_to_yarn_team_button() throws Throwable {
		try {
			utilities.webDriverWait(driver, Submit_yarn_Team);	
			driver.findElement(Submit_yarn_Team).click();
			utilities.MinimumWait(driver);
			}
			catch(Exception e) {
				System.out.println("Submit to yarn team button is not displayed");
			}
		
	}
	public void Click_on_the_Save_button_in_the_New_Yarn_Sheet() throws Throwable {
		try {
			utilities.webDriverWait(driver, Save_Button);	
			driver.findElement(Save_Button).click();
			utilities.MinimumWait(driver);
			}
			catch(Exception e) {
				System.out.println("Save button is not displayed");
			}
		
	}
	public void User_Click_on_the_Edit_Icon() throws Throwable {
		try {
			utilities.webDriverWait(driver, Edit_Icon);	
			driver.findElement(Edit_Icon).click();
			utilities.MinimumWait(driver);
			}
			catch(Exception e) {
				System.out.println("Edit icon is not displayed");
			}
				
	}
	public void The_User_click_on_the_Save_button_the_validation_message_is_displayed_or_not() {
		Boolean isPresent = driver.findElements(Partial_Validation_msg).size()>0;
		if (isPresent) {
		WebElement Data = driver.findElement(Partial_Validation_msg);
		String test = Data.getText(); 
		String expectedData = "New Yarn Sheet Partially Updated Successfully";
		if (expectedData.equals(test)) {
			System.out.println("Display validation msg is correct." + test);
		} else {
			System.out.println("Display validation msg is incorrect."+ test);
		}
	}
	}
	public void Enter_the_PO_qty(String POQty) throws Throwable {
		 WebDriverWait wait = new WebDriverWait(driver, 10);    
		 List<WebElement> POQtyElements = driver.findElements(PO_Qty_field);
        for (WebElement POElement : POQtyElements) {
            // Check if the element is enabled
            if (POElement.isEnabled()) {
                String readonlyAttribute = POElement.getAttribute("readonly");
                if (readonlyAttribute == null) {
                    // Enabled field is not read-only, enter data
                    System.out.println("PO Qty Field is enabled and not read-only.");
                    POElement.clear();
                    POElement.sendKeys(POQty);
                    utilities.MinimumWait(driver);
                } else {
                    // Field is read-only, print its value
                    String dataText = POElement.getAttribute("value");
                    System.out.println("PO Qty field is read-only. Displaying data: " + dataText);
                }
                //Sum of PO Qty should not increase the Total PO qty
            }
         }
	}
	public void Check_the_PO_Qty_validation_is_displayed_or_not() {
		Boolean isPresent = driver.findElements(PO_Qty_fields_valida).size()>0;
		if (isPresent) {
		WebElement Data = driver.findElement(PO_Qty_fields_valida);
		String test = Data.getText(); 
		String expectedData = "Sum of Size Break-up PO Qty Should be Equal to Missy Garment Size PO Qty";
		if (expectedData.equals(test)) {
			System.out.println("Display the PO Qty validation is correct." + test);
		} else {
			System.out.println("Display the PO Qty validation is incorrect."+ test);
		}
	}
		
	}
	public void Click_on_the_Delete_Icon_in_Yarn_details_Column() throws Throwable {
		try {
			utilities.webDriverWait(driver, Delete_Icon);	
			driver.findElement(Delete_Icon).click();
			utilities.MinimumWait(driver);
			driver.findElement(Delete_Yes_button).click();
			utilities.MinimumWait(driver);
			}
			catch(Exception e) {
				System.out.println("Delete icon is not displayed");
			}
				
		
	}
	public void the_selected_style_should_be_displayed() throws Throwable {
		utilities.webDriverWait(driver, IPO_Data);
		WebElement IPO = driver.findElement(IPO_Data);
		String IPO_data = IPO.getText(); 
		System.out.print("Display Selected IPO:" +IPO_data);	
		utilities.MinimumWait(driver);
	}
	public void the_selected_IPO_name_should_be_displayed() throws Throwable {
		utilities.webDriverWait(driver, Style);
		WebElement style = driver.findElement(Style);
		String Style_data = style.getText(); 
		System.out.print("Display Selected Style:" +Style_data);	
		utilities.MinimumWait(driver);
	}
	public void the_buyer_style_should_be_displayed_correctly() throws Throwable {
		utilities.webDriverWait(driver, Buyer_Style);
		WebElement buyer_style = driver.findElement(Buyer_Style);
		String Buyer_Style_data = buyer_style.getText(); 
		System.out.print("Display Selected Buyer Style:" + Buyer_Style_data);
		utilities.MinimumWait(driver);
		
	}
	public void the_PO_quantity_should_be_displayed() throws Throwable {
		utilities.webDriverWait(driver, PO_Qty);
		WebElement PO_qty = driver.findElement(PO_Qty);
		String PO_Qty_Data = PO_qty.getText(); 
		System.out.print("Display the PO Qty:" + PO_Qty_Data);
		utilities.MinimumWait(driver);
		
	}
	public void the_IPO_quantity_should_be_displayed() throws Throwable {
		utilities.webDriverWait(driver, IPO_Qty);
		WebElement IPO_qty = driver.findElement(IPO_Qty);
		String IPO_Qty_Data = IPO_qty.getText(); 
		System.out.print("Display the IPO Qty:" + IPO_Qty_Data);
		utilities.MinimumWait(driver);
		
	}
	public void the_date_submitted_data_should_be_displayed() throws Throwable {
		utilities.webDriverWait(driver, Date_Submitted);
		WebElement Date = driver.findElement(Date_Submitted);
		String Date_submitted = Date.getText(); 
		System.out.print("Display the Submitted Date:" + Date_submitted);	
		utilities.MinimumWait(driver);
	}
	public void Verify_whether_the_Import_popup_window_is_opened_when_clicked_on_the_Import_Yarn_Details_button() throws Throwable {
		utilities.webDriverWait(driver, Import_yarn_Button);
		driver.findElement(Import_yarn_Button).click();
		utilities.MediumWait(driver);
		WebElement Popup = driver.findElement(Import_Popup);
		String Import_popup = Popup.getText(); 
		System.out.print("Display the Import yarn details Popup:" + Import_popup);
					
	}
	public void Select_the_WithIn_IPO_in_Import_Yarn_details_popup() throws Throwable {
		utilities.webDriverWait(driver, Within_IPO);
		driver.findElement(Within_IPO).click();
		utilities.MediumWait(driver);
		
	}
	public void Verify_without_Select_the_Yarn_and_click_on_the_Import_button_the_validation_msg_is_displayed() throws Throwable {
		utilities.webDriverWait(driver, Import_button);
		driver.findElement(Import_button).click();
		utilities.MediumWait(driver);
		Boolean isPresent = driver.findElements(Validation_msg).size()>0;
		if (isPresent) {
		WebElement Data = driver.findElement(Validation_msg);
		String test = Data.getText(); 
		String expectedData = "Mandatory Fields Are Required With Valid Data.";
		if (expectedData.equals(test)) {
			System.out.println("Display validation msg is correct." + test);
		} else {
			System.out.println("Display validation msg is incorrect."+ test);
		}
	}
			
		
	}
	public void Select_the_Yarn_in_the_Import_yarn_details_Popup() throws Throwable {
		utilities.webDriverWait(driver, Select_Yarn);
		driver.findElement(Select_Yarn).click();
		Thread.sleep(1000);
		Boolean isPresent = driver.findElements(Dropdown_List).size()>0;
		if (isPresent) {	
			 System.out.println("Display element: " + isPresent);		   		
			    System.out.print("Selected IPO yarn names are not displayed");
			    driver.findElement(Import_Close).click();
			    utilities.webDriverWait(driver, Yarn_Quality_field);
			    driver.findElement(Yarn_Quality_field).click();
			    Thread.sleep(1000); 
			    Robot r = new Robot();
			    r.keyPress(KeyEvent.VK_DOWN);
			    r.keyPress(KeyEvent.VK_ENTER);
			    Thread.sleep(2000);
		  
		} else {
			  System.out.println("Display element: " + isPresent);
			    utilities.MediumWait(driver);
			    Robot r = new Robot();
			    r.keyPress(KeyEvent.VK_ENTER);
			    Thread.sleep(2000);	
		}

	}
	public void Click_on_the_Import_button_in_the_yarn_details_Popup() throws Throwable {
		try {
		utilities.webDriverWait(driver, Import_button);
		driver.findElement(Import_button).click();
		utilities.MediumWait(driver);
		}
		catch (Exception e) {
		System.out.print("Import button is not displayed");
		
	}
		
	}
	public void Select_the_Other_IPO_in_Import_Yarn_details_popup() throws Throwable {
	
		utilities.webDriverWait(driver, Other_Ipo);
		driver.findElement(Other_Ipo).click();
		utilities.MediumWait(driver);
		
				
	}
	By Import_Close_Icon     = By.xpath("//button[@aria-label='Close']");
	public void Select_the_IPO_in_the_Import_yarn_details_page() throws Throwable {

		utilities.webDriverWait(driver, Select_IPO_import);
		driver.findElement(Select_IPO_import).click();
		utilities.MediumWait(driver);		
		Boolean isPresent = driver.findElements(Dropdown_List).size()>0;
		if (isPresent) {	
			 System.out.println("Display element: " + isPresent);		   		
			    System.out.print("Selected IPO names are not displayed");
			    driver.findElement(Import_Close).click();
			    utilities.webDriverWait(driver, Yarn_Quality_field);
			    driver.findElement(Yarn_Quality_field).click();
			    Thread.sleep(1000); 
			    Robot r = new Robot();
			    r.keyPress(KeyEvent.VK_DOWN);
			    r.keyPress(KeyEvent.VK_ENTER);
			    Thread.sleep(2000);
		  
		} else {
			  System.out.println("Display element: " + isPresent);
			    utilities.MediumWait(driver);
			    Robot r = new Robot();
				r.keyPress(KeyEvent.VK_ENTER);
				Thread.sleep(2000);	
		}
				
	}
	public void Select_the_Other_IPO_Yarn_in_the_Import_yarn_details_Popup() throws Throwable {
		try {
			utilities.webDriverWait(driver, Select_Other_yarn);
			driver.findElement(Select_Other_yarn).click();
			utilities.MediumWait(driver);
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(2000);			
			}
			catch (Exception e) {
			System.out.print("Field is not displayed");
			
		}
			
	
	}
	public void Select_the_PD_YDS_in_Import_Yarn_details_popup() throws Throwable {
		utilities.webDriverWait(driver, Select_PDYDS);
		driver.findElement(Select_PDYDS).click();
		utilities.MediumWait(driver);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);		
		
	}
	public void Select_the_PD_YDS_Yarn_in_the_Import_yarn_details_Popup() throws Throwable {
		utilities.webDriverWait(driver, Select_PDYDS_yarn);
		driver.findElement(Select_PDYDS_yarn).click();
		utilities.MediumWait(driver);	
		Boolean isPresent = driver.findElements(Dropdown_List).size()>0;
		if (isPresent) {	
			 System.out.println("Display element: " + isPresent);		   		
			    System.out.print("Selected PD YDS yarn names are not displayed");
			    driver.findElement(Import_Close).click();
			    utilities.webDriverWait(driver, Yarn_Quality_field);
			    driver.findElement(Yarn_Quality_field).click();
			    Thread.sleep(1000); 
			    Robot r = new Robot();
			    r.keyPress(KeyEvent.VK_DOWN);
			    r.keyPress(KeyEvent.VK_ENTER);
			    Thread.sleep(2000);
		  
		} else {
			  System.out.println("Display element: " + isPresent);
			    utilities.MediumWait(driver);
			    Robot r = new Robot();
			    r.keyPress(KeyEvent.VK_ENTER);
			    Thread.sleep(2000);	
		}
		
	}
	public void Verify_the_Added_Yarn_details_are_displayed_in_the_Yarn_details_grid() throws Throwable {
		  WebElement OrderData = driver.findElement(Yarn_Details_Grid);
		  
		    WebElement Data = driver.findElement(Yarn_Details_Grid);
		    Thread.sleep(1000);
		    List<WebElement> rows1 = Data.findElements(By.tagName("tr"));
		        int Irowcount = rows1.size();
	            int Idatarowcount = Irowcount;
	            System.out.println("No. of data Rows in the grid : " + Idatarowcount);
	         
	        if(driver.findElements(Yarn_Details_Grid).size() > 0) {
	        utilities.MediumWait(driver);            
	        String OrderDataText1 = OrderData.getText();
			utilities.MediumWait(driver);	    
			            
	        String[] rows = OrderDataText1.split("\n");
			for (String row : rows) {
		     System.out.println(row);
		        System.out.println();
		        
		    }
		
		}	    
		
		
	}
	public void Verify_the_Garment_Average_details_are_displayed_in_the_Garment_Average_Grid() throws Throwable {
		 WebElement OrderData = driver.findElement(Garment_Details_Grid);
		  
		    WebElement Data = driver.findElement(Garment_Details_Grid);
		    Thread.sleep(1000);
		    List<WebElement> rows1 = Data.findElements(By.tagName("tr"));
		        int Irowcount = rows1.size();
	            int Idatarowcount = Irowcount;
	            System.out.println("No. of data Rows in the grid : " + Idatarowcount);
	         
	        if(driver.findElements(Garment_Details_Grid).size() > 0) {
	        utilities.MediumWait(driver);            
	        String OrderDataText1 = OrderData.getText();
			utilities.MediumWait(driver);	    
			            
	        String[] rows = OrderDataText1.split("\n");
			for (String row : rows) {
		     System.out.println(row);
		        System.out.println();
		        
		    }		
		}	    		
	}
	public void Verify_the_Quantity_details_are_displayed_in_the_Quantity_Requirements_grid() throws Throwable {
		 WebElement OrderData = driver.findElement(Quantity_Details);
		  
		    WebElement Data = driver.findElement(Quantity_Details);
		    Thread.sleep(1000);
		    List<WebElement> rows1 = Data.findElements(By.tagName("tr"));
		        int Irowcount = rows1.size();
	            int Idatarowcount = Irowcount;
	            System.out.println("No. of data Rows in the grid : " + Idatarowcount);
	         
	        if(driver.findElements(Quantity_Details).size() > 0) {
	        utilities.MediumWait(driver);            
	        String OrderDataText1 = OrderData.getText();
			utilities.MediumWait(driver);	    
			            
	        String[] rows = OrderDataText1.split("\n");
			for (String row : rows) {
		     System.out.println(row);
		        System.out.println();
		        
		    }
		
		}	    				
	}

	public void Click_on_the_View_For_Print_Button() throws Throwable {
		utilities.webDriverWait(driver, View_For_Print);
		driver.findElement(View_For_Print).click();
		utilities.MediumWait(driver);
		
	}
	public void Verify_the_IPO_details_are_displayed_or_not() throws Throwable {
		utilities.webDriverWait(driver, View_IPO_Data);
		WebElement IPO_qty = driver.findElement(View_IPO_Data);
		String View_Data = IPO_qty.getText(); 
		System.out.print("Display the IPO Data:" + View_Data);
		utilities.MinimumWait(driver);
		
	}
}
