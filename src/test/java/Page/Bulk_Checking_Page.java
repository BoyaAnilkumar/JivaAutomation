package Page;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import util.DriverFactory;
import util.Utilities;

public class Bulk_Checking_Page extends DriverFactory {
	Utilities utilities = new Utilities();
	
	By Fabric_Store           = By.xpath("//span[text()='Fabric Store ']");
	By Fabric_Store_Data_Entry= By.xpath("(//span[text()='Data Entry'])[6]");
	By Bulk_Checking          = By.xpath("//a[text()='Bulk Checking']");
	By Bulk_Checking_Screen   = By.xpath("//h3[text()='Bulk Checking ']");
	By Lot_Checking_icon	  = By.xpath("//a[@title='Add Lot Checking Data']");
	By Add_Lot_Checking_form  = By.xpath("//h3[text()='Add Lot Checking Data']");
	By Fabric_description     = By.xpath("(//p[@class='mb-0 text-primary font-weight-bold'])[1]");	
	By PO_Details             = By.xpath("(//p[@class='mb-0 text-primary font-weight-bold'])[2]");
    By Total_Approved_Qty     = By.xpath("(//p[@class='mb-0 text-primary font-weight-bold'])[3]");
	By Quantity_Received      = By.xpath("(//p[@class='mb-0 text-primary font-weight-bold'])[4]");
	By Checker_Name			  = By.xpath("//select[@formcontrolname='checkerId']");
	By Lot_Number			  = By.xpath("//input[@formcontrolname='lotNumber']");
	By Lot_Quantity		 	  = By.xpath("//input[@formcontrolname='lotQuantity']");
	By Lot_Submission_Status  = By.xpath("//select[@formcontrolname='lotSubmissionStatus']");
	By Lot_Submission_Date	  = By.xpath("//input[@formcontrolname='lotSubmissionDate']");
	By Lot_Approval_Status	  = By.xpath("//select[@formcontrolname='lotApprovalStatus']");
	By Lot_Approval_Date      = By.xpath("//input[@formcontrolname='lotApprovalDate']");
	By Delete_Icon  		  = By.xpath("//button[@type='button']//i[@class='ti-trash']");
	By Save_Button            = By.xpath("(//button[text()=' Save'])[1]");
	By Validation             = By.xpath("//h2[text()='Mandatory Fields Are Required With  Valid Data.']");
	By Add_Quality_Check_Icon = By.xpath("//a[@title='Add Quality Checking Data']");
	By Add_Quality_Check_form = By.xpath("//h3[text()='Add Quality Checking Data']");	
	By IPO                    = By.xpath("(//p[@class='mb-0 text-primary'])[1]");
	By Date_of_initial_recd   = By.xpath("(//p[@class='mb-0 text-primary'])[2]");
	By PO_Number              = By.xpath("(//p[@class='mb-0 text-primary'])[3]");
	By Qty_Received           = By.xpath("(//p[@class='mb-0 text-primary'])[4]");
	By Fabric_Name            = By.xpath("(//p[@class='mb-0 text-primary'])[5]");
	By Color                  = By.xpath("(//p[@class='mb-0 text-primary'])[6]");
	By Supplier               = By.xpath("(//p[@class='mb-0 text-primary'])[7]");
	By Thaan_name             = By.xpath("//select[@formcontrolname='thaanId']");
	By Before_Wash            = By.xpath("//input[@formcontrolname='beforeWash']");
	By L_Shrinkage            = By.xpath("//input[@formcontrolname='l_Shrinkage']");
	By W_Shrinkage            = By.xpath("//input[@formcontrolname='w_Shrinkage']");
	By After_Wash             = By.xpath("//input[@formcontrolname='afterWash']");
	By Approve_Reject_Date    = By.xpath("//input[@formcontrolname='approval_Reject_Date']");
	By Qty_field              = By.xpath("//input[@formcontrolname='qty']");
	By Quantity_Checked       = By.xpath("//input[@formcontrolname='checekedQTY']");
	By Can_Cut_Section        = By.xpath("(//h5[text()='Can Cut'])[1]");
	By IPO_name               = By.xpath("(//p[@class='mb-0 text-primary font-weight-bold'])[5]");
	By Approved_Qty_GSM       = By.xpath("//input[@formcontrolname='approvedQTYWithCorrWidth']");
	By Current_Garment_Avg    = By.xpath("//input[@class='form-control']");
    By W_Avg                  = By.xpath("//input[@formcontrolname='weightedAverage']");
    By Final_CanCut_Value     = By.xpath("//div[@class='col']");
    By Garment_Avg            = By.xpath("(//input[@class='form-control'])[2]");
    By Expansion_icon         = By.xpath("//a[@class='p-element']//i[1]");
    By Lot_Checking_Data      = By.xpath("//span[text()='Lot Checking Data']");
    By Quality_Checking_data  = By.xpath("//span[text()='Quality Checking Data']");
    By Bulk_Checking_data     = By.xpath("//span[text()='Bulk Checking Data']");
    By Lot_CheckingEdit_Icon  = By.xpath("//button[@title='Edit']");
    By Update_Lot_Check_data  = By.xpath("//h3[text()='Update Lot Checking Data']");
    By Update_button          = By.xpath("//button[text()=' Update']");
	

	public void Click_on_the_Fabric_Store_Module() throws Throwable {
		utilities.webDriverWait(driver, Fabric_Store);
		driver.findElement(Fabric_Store).click();
		utilities.MediumWait(driver);
		
	}

	public void Click_on_the_Fabric_Bulk_Checking_under_the_Data_Entry_dropdown() throws Throwable {
		utilities.webDriverWait(driver, Fabric_Store_Data_Entry);
		driver.findElement(Fabric_Store_Data_Entry).click();
		utilities.MediumWait(driver);
		driver.findElement(Bulk_Checking).click();
		utilities.MediumWait(driver);				
		
	}

	public void The_Bulk_Checking_Screen_is_displayed_or_not() throws Throwable {
		utilities.webDriverWait(driver, Bulk_Checking_Screen);
		String Screen_name  = driver.findElement(Bulk_Checking_Screen).getText();
		System.out.println("Display the Bulk Checking Screen:" +Screen_name);		
		
	}

	public void Click_on_the_Add_Lot_Checking_Icon_and_enter_the_data_in_all_fields() throws Throwable {
		
	 utilities.webDriverWait(driver, Lot_Checking_icon);
		Boolean isPresent = driver.findElements(Lot_Checking_icon).size()>0;
		if (isPresent) {
		 driver.findElement(Lot_Checking_icon).click();
		 Thread.sleep(1000);
		 
		 String isPresent1  = driver.findElement(Add_Lot_Checking_form).getText();
		 System.out.println("Display the Add Lot Checking form:" +isPresent1);
		 
		   utilities.webDriverWait(driver, Fabric_description);
			String Page_name  = driver.findElement(Fabric_description).getText();
			System.out.println("Display the Fabic Description details:" +Page_name);
			
			utilities.webDriverWait(driver, PO_Details);
			String Page_name1  = driver.findElement(PO_Details).getText();
			System.out.println("Display the PO details:" +Page_name1);
			
			utilities.webDriverWait(driver, Total_Approved_Qty);
			String Page_name2  = driver.findElement(Total_Approved_Qty).getText();
			System.out.println("Display the Total Approved Qty value:" +Page_name2);	
			
			utilities.webDriverWait(driver, Quantity_Received);
			String Page_name3  = driver.findElement(Quantity_Received).getText();
			System.out.println("Display the Quantity Received:" +Page_name3);	
			
			utilities.webDriverWait(driver, Save_Button);
			driver.findElement(Save_Button).click();
			utilities.MinimumWait(driver);	
			
			Boolean isPresent2 = driver.findElements(Validation).size()>0;
			if (isPresent2) {
			WebElement Data = driver.findElement(Validation);
			String test = Data.getText(); 
			String expectedData = "Mandatory Fields Are Required With Valid Data.";
			if (expectedData.equals(test)) {
				System.out.println("Display validation msg is correct." + test);
			} else {
				System.out.println("Display validation msg is incorrect."+ test);
			}
		}
			
			 driver.findElement(Checker_Name).click();
			 Robot r = new Robot();
			 r.keyPress(KeyEvent.VK_DOWN);
			 Thread.sleep(1000);
			 r.keyPress(KeyEvent.VK_ENTER);
			 Thread.sleep(1000);		
			 
			 WebElement QtyElement = driver.findElement(Lot_Number);
				String Lot = QtyElement.getAttribute("value");
				if (Lot.length() > 15) {		    
				    System.out.println("Error: The length of the Lot Number exceeds the maximum length of 15 characters.");
				} else {		   
				    System.out.println("The length of Lot Number is within the allowed limit.");
				}
				
				QtyElement.sendKeys("4");
		  
				WebElement QtyElement1 = driver.findElement(Lot_Quantity);
				String Lot1 = QtyElement1.getAttribute("value");
				if (Lot1.length() > 10) {		    
				    System.out.println("Error: The length of the Lot Quantity exceeds the maximum length of 10 characters.");
				} else {		   
				    System.out.println("The length of Lot Quantity is within the allowed limit.");
				}
				QtyElement1.sendKeys("8");
				
				driver.findElement(Lot_Submission_Status).click();
				 Robot D = new Robot();
				 D.keyPress(KeyEvent.VK_DOWN);
				 Thread.sleep(1000);
				 D.keyPress(KeyEvent.VK_ENTER);
				 Thread.sleep(1000);	
			
				 WebElement dateField = driver.findElement(Lot_Submission_Date);

			        // Check if the field is enabled and then enter the data
			        if (dateField.isEnabled()) {
			            dateField.sendKeys("06072024");
			            System.out.println("Data entered successfully.");
			        } else {
			            System.out.println("The LOT Submission Date field is not enabled.");
			        }
				 
				 driver.findElement(Lot_Approval_Status).click();
				 Robot P = new Robot();
				 P.keyPress(KeyEvent.VK_DOWN);
				 Thread.sleep(1000);
				 P.keyPress(KeyEvent.VK_ENTER);
				 Thread.sleep(1000);	
				 
				 WebElement dateField1 = driver.findElement(Lot_Approval_Date);

			        // Check if the field is enabled and then enter the data
			        if (dateField1.isEnabled()) {
			            dateField1.sendKeys("06092024");
			            System.out.println("Data entered successfully.");
			        } else {
			            System.out.println("The LOT Approval Date field is not enabled.");
			        }
		}
		else {
			System.out.println("Selected PO is Purchase Order");
		}
	
	}

	public void Click_on_the_Save_Button_in_the_Bulk_Checking_screen() throws Throwable {
		utilities.webDriverWait(driver, Save_Button);
		Boolean isPresent = driver.findElements(Save_Button).size()>0;
		if (isPresent) {
		driver.findElement(Save_Button).click();
		utilities.MinimumWait(driver);	
		}
		else {
			System.out.println("Save button is not displayed");
		}		
	}

	public void Click_on_the_Add_Quality_Checking_Icon() throws Throwable {
		utilities.webDriverWait(driver, Add_Quality_Check_Icon);
		driver.findElement(Add_Quality_Check_Icon).click();
		utilities.MediumWait(driver);				
	}

	public void the_Add_Quality_Checking_data_form_is_displayed_or_not() throws Throwable {
		utilities.webDriverWait(driver, Add_Quality_Check_form);
		String Page_name  = driver.findElement(Add_Quality_Check_form).getText();
		System.out.println("Display the Add Quality Checking form:" +Page_name);
		
		utilities.webDriverWait(driver, Save_Button);
		driver.findElement(Save_Button).click();
		utilities.MinimumWait(driver);	
		
		Boolean isPresent2 = driver.findElements(Validation).size()>0;
		if (isPresent2) {
		WebElement Data = driver.findElement(Validation);
		String test = Data.getText(); 
		String expectedData = "Mandatory Fields Are Required With Valid Data.";
		if (expectedData.equals(test)) {
			System.out.println("Display validation msg is correct." + test);
		} else {
			System.out.println("Display validation msg is incorrect."+ test);
		}
		}
		
	}

	public void Verify_the_IPO_Date_of_initial_recd_PO_Number_and_Qty_Received_data_is_displayed_or_not() throws Throwable {
		utilities.webDriverWait(driver, IPO);
		String IPO_data  = driver.findElement(IPO).getText();
		System.out.println("Display the IPO name:" +IPO_data);
		
		utilities.webDriverWait(driver, Date_of_initial_recd);
		String Date  = driver.findElement(Date_of_initial_recd).getText();
		System.out.println("Display the Date of initial recd:" +Date);
		
		utilities.webDriverWait(driver, PO_Number);
		String PO_number  = driver.findElement(PO_Number).getText();
		System.out.println("Display the PO number :" +PO_number);
		
		utilities.webDriverWait(driver, Qty_Received);
		String Net  = driver.findElement(Qty_Received).getText();
		System.out.println("Display the Qty Received:" +Net);
		
		
	}

	public void The_Fabric_Details_are_displayed_or_not() throws Throwable {
		utilities.webDriverWait(driver, Fabric_Name);
		String fabricname  = driver.findElement(Fabric_Name).getText();
		System.out.println("Display the Fabric name:" +fabricname);
		
		utilities.webDriverWait(driver, Color);
		String color  = driver.findElement(Color).getText();
		System.out.println("Display the Color:" +color);
		
		utilities.webDriverWait(driver, Supplier);
		String supplier  = driver.findElement(Supplier).getText();
		System.out.println("Display the Supplier:" +supplier);
		
		
	}

	public void Select_the_Thaan_name() throws Throwable {
		List<WebElement> ThaanElements = driver.findElements(Thaan_name);  
        for (WebElement ThaanElement : ThaanElements) {
            if (ThaanElement.isEnabled()) {           
                System.out.println("Element is enabled.");
                ThaanElement.click();
                Robot r = new Robot();
   			 r.keyPress(KeyEvent.VK_DOWN);
   			 Thread.sleep(1000);
   			 r.keyPress(KeyEvent.VK_ENTER);
   			 Thread.sleep(1000);		              
             utilities.MinimumWait(driver); 
            }
        }
		
	}

	public void Enter_the_data_in_Before_Wash_field() throws Throwable {
		 List<WebElement> BeforeElements = driver.findElements(Before_Wash);
	        for (WebElement BeforeWashElement : BeforeElements) {
	            if (BeforeWashElement.isEnabled()) {
	                System.out.println("Element is enabled.");
	                BeforeWashElement.clear(); 
	                BeforeWashElement.sendKeys("5");
	                utilities.MinimumWait(driver); 
	            }
	        }
		
	}

	public void Enter_the_data_in_After_Wash_field() throws Throwable {
		 List<WebElement> afterwashElements = driver.findElements(After_Wash);
	        for (WebElement AfterWashElement : afterwashElements) {
	            if (AfterWashElement.isEnabled()) {	
	                System.out.println("Element is enabled.");
	                AfterWashElement.clear(); 
	                AfterWashElement.sendKeys("2");
	                utilities.MinimumWait(driver); 
	            }
	        }
	}

	public void Enter_the_data_in_the_Approve_or_Reject_Date_field() throws Throwable {
		 List<WebElement> afterwashElements = driver.findElements(Approve_Reject_Date);	       
	        for (WebElement AfterWashElement : afterwashElements) {
	            if (AfterWashElement.isEnabled()) {	               
	                System.out.println("Element is enabled.");
	                AfterWashElement.clear(); 
	                AfterWashElement.sendKeys("06072024");
	                utilities.MinimumWait(driver); 
	            }
	        }
		
	}

	public void Enter_the_data_in_the_Qty_field() throws Throwable {
		 List<WebElement> QtyElements = driver.findElements(Qty_field);	        
	        for (WebElement QtyElement : QtyElements) {
	            if (QtyElement.isEnabled()) {	              
	                System.out.println("Element is enabled.");
	                QtyElement.clear(); 
	                QtyElement.sendKeys("10");
	                utilities.MinimumWait(driver);
	            }
	        }
		
	}

	public void Enter_the_data_in_L_Shrinkage_field() throws Throwable {
		utilities.webDriverWait(driver, L_Shrinkage);
		driver.findElement(L_Shrinkage).sendKeys("6");
		utilities.MediumWait(driver);
		
	}

	public void Enter_the_data_in_W_Shrinkage_field() throws Throwable {
		utilities.webDriverWait(driver, W_Shrinkage);
		driver.findElement(W_Shrinkage).sendKeys("4");
		utilities.MediumWait(driver);
		
	}

	public void Verify_the_Fabric_description_PO_details_Total_Approved_Qty_and_Quantity_Received_data_is_displayed_or_not() throws Throwable {
		   utilities.webDriverWait(driver, Fabric_description);
			String Page_name  = driver.findElement(Fabric_description).getText();
			System.out.println("Display the Fabic Description details:" +Page_name);
			
			utilities.webDriverWait(driver, PO_Details);
			String Page_name1  = driver.findElement(PO_Details).getText();
			System.out.println("Display the PO details:" +Page_name1);
			
			utilities.webDriverWait(driver, Total_Approved_Qty);
			String Page_name2  = driver.findElement(Total_Approved_Qty).getText();
			System.out.println("Display the Total Approved Qty value:" +Page_name2);	
			
			utilities.webDriverWait(driver, Quantity_Received);
			String Page_name3  = driver.findElement(Quantity_Received).getText();
			System.out.println("Display the Quantity Received:" +Page_name3);	
			
		
	}

	public void Enter_the_data_in_the_Qty_Checked_field() throws Throwable {
		utilities.webDriverWait(driver, Quantity_Checked);
		driver.findElement(Quantity_Checked).sendKeys("6");
		utilities.MediumWait(driver);
		
	}

	public void the_Can_Cut_Section_is_displayed_and_Enter_the_Can_Cut_data() throws Throwable {
		utilities.webDriverWait(driver, Can_Cut_Section);
		Boolean isPresent = driver.findElements(Can_Cut_Section).size()>0;
		if (isPresent) {
		String isPresent1  = driver.findElement(Can_Cut_Section).getText();
		System.out.println("Display the Can Cut Section:" +isPresent1);
		 
		String Text  = driver.findElement(IPO_name).getText();
		System.out.println("Display the IPO:" +Text);
		
		WebElement QtyElement = driver.findElement(Approved_Qty_GSM);
		String Qty = QtyElement.getAttribute("value");
		if (Qty.length() > 10) {		    
		    System.out.println("Error: The length of the Approved Qty GSM exceeds the maximum length of 10 characters.");
		} else {		   
		    System.out.println("The length of Approved Qty GSM is within the allowed limit.");
		}
		utilities.webDriverWait(driver, Approved_Qty_GSM);
		driver.findElement(Approved_Qty_GSM).sendKeys("4");
		utilities.MediumWait(driver);
		
                    
             List<WebElement> Garment1 = driver.findElements(Current_Garment_Avg);
        	    for (WebElement BeforeWashElement : Garment1) {
        	        if (BeforeWashElement.isEnabled()) {
        	            String readonlyAttribute = BeforeWashElement.getAttribute("readonly");
        	               if (readonlyAttribute != null) {
        	                  String dataText1 = BeforeWashElement.getAttribute("value");	  		                		
        	                  System.out.println("Current Garment Avg As Per Fabric Sheet field is read-only. Displaying data: " + dataText1);
        	               }
        	        }
        	    }
        	    WebElement weight = driver.findElement(W_Avg);
          		String readonlyAttribute1 = weight.getAttribute("readonly");
                    if (readonlyAttribute1 != null) {
                        String dataText1 = weight.getAttribute("value");	  		                		
                        System.out.println("Current Garment Avg As Per Yarn Sheet field is read-only. Displaying data: " + dataText1);
                    }
                    
            String value  = driver.findElement(Final_CanCut_Value).getText();
            System.out.println("Display the Final can Cut:" +value);  
            		
                }                
		
		else {
			System.out.println("Can Net section is not displayed");
		}
	}

	public void Click_on_the_Expansion_icon_the_Lot_Checking_Data_Quality_Checking_Data_and_Bulk_Checking_Data_grids_are_displayed_or_not() throws Throwable {
		utilities.webDriverWait(driver, Expansion_icon);
		driver.findElement(Expansion_icon).click();
		utilities.MinimumWait(driver);	
		
		utilities.webDriverWait(driver, Lot_Checking_Data);
		Boolean isPresent = driver.findElements(Lot_Checking_Data).size()>0;
		if (isPresent) {
			String Page_name  = driver.findElement(Lot_Checking_Data).getText();
			System.out.println("Display the Lot Checking Data grid:" +Page_name);
		}
		else {
			System.out.println("Lot Checking grid is not displayed:");
		}
		
		utilities.webDriverWait(driver, Quality_Checking_data);
		Boolean isPresent1 = driver.findElements(Quality_Checking_data).size()>0;
		if (isPresent1) {
			String Page_name  = driver.findElement(Quality_Checking_data).getText();
			System.out.println("Display the Quality Checking Data grid:" +Page_name);
		}
		else {
			System.out.println("Quality Checking grid is not displayed:");
		}
		
		utilities.webDriverWait(driver, Bulk_Checking_data);
		Boolean isPresent2 = driver.findElements(Bulk_Checking_data).size()>0;
		if (isPresent2) {
			String Page_name  = driver.findElement(Bulk_Checking_data).getText();
			System.out.println("Display the Bulk Checking Data grid:" +Page_name);
		}
		else {
			System.out.println("Bulk Checking grid is not displayed:");
		}
	}

	public void Update_the_Lot_Checking_Data() throws Throwable {
		utilities.webDriverWait(driver, Expansion_icon);
		driver.findElement(Expansion_icon).click();
		utilities.MinimumWait(driver);	
		
		utilities.webDriverWait(driver, Lot_Checking_Data);
		Boolean isPresent = driver.findElements(Lot_Checking_Data).size()>0;
		if (isPresent) {
			String Page_name  = driver.findElement(Lot_Checking_Data).getText();
			System.out.println("Display the Lot Checking Data grid:" +Page_name);
		
		  
		utilities.webDriverWait(driver, Lot_CheckingEdit_Icon);
		driver.findElement(Lot_CheckingEdit_Icon).click();
		utilities.MinimumWait(driver);	
		
		utilities.webDriverWait(driver, Update_Lot_Check_data);
		String Screen_name  = driver.findElement(Update_Lot_Check_data).getText();
		System.out.println("Display the Update Lot Checking data form:" +Screen_name);		
		
		 WebElement QtyElement = driver.findElement(Lot_Number);
			String Lot = QtyElement.getAttribute("value");
			if (Lot.length() > 15) {		    
			    System.out.println("Error: The length of the Lot Number exceeds the maximum length of 15 characters.");
			} else {		   
			    System.out.println("The length of Lot Number is within the allowed limit.");
			}
			QtyElement.clear();
			QtyElement.sendKeys("1");
	  
			WebElement QtyElement1 = driver.findElement(Lot_Quantity);
			String Lot1 = QtyElement1.getAttribute("value");
			if (Lot1.length() > 10) {		    
			    System.out.println("Error: The length of the Lot Quantity exceeds the maximum length of 10 characters.");
			} else {		   
			    System.out.println("The length of Lot Quantity is within the allowed limit.");
			}
			QtyElement1.clear();
			QtyElement1.sendKeys("5");
	

		}
			else {
				System.out.println("Lot Checking update form is not displayed");
			}
	


	}

	public void CLick_on_the_Update_button() throws Throwable {
		utilities.webDriverWait(driver, Update_button);
		Boolean isPresent = driver.findElements(Update_button).size()>0;
		if (isPresent) {
		utilities.webDriverWait(driver, Update_button);
		driver.findElement(Update_button).click();
		utilities.MinimumWait(driver);	
		}
		else {
			System.out.println("Update button is not displayed");
		}
	
		
	}
	
		
		
	
}
