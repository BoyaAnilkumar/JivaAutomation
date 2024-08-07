package Page;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import util.DriverFactory;
import util.Utilities;

public class CreatePOForStockPage extends DriverFactory{
	
//	private static final WebElement dropdown = null;

	Utilities utilities = new Utilities();
	RevisedMUWorkingPages RMUW = new RevisedMUWorkingPages();
	
//	public By modWoven = By.xpath("//span[text()='Woven / knit']");
//	public By modFabricSourcing =By.xpath("//span[text()='Fabric Sourcing ']");
//	public By DataEntry = By.xpath("(//a[@aria-expanded='false']/..//span[text()='Data Entry'])[1]");
	public By modGeneratePO = By.xpath("(//span[text()='Generate PO'])[1]");
	By modCreatePOStk = By.xpath("(//a[text()=' Create PO for Stock '])[1]");
	By Ordertype = By.xpath("//select[@formcontrolname='typeofPo']");
	By sec_Order = By.xpath("//option[text()=' Job Work Order']");
	By PODate = By.xpath("//input[@formcontrolname='poDate']");
	By POnum = By.xpath("//input[@formcontrolname='poNumber']");
	By Buyer = By.xpath("(//label[text()='Buyer']/following::input)[1]");
	By sec_Buyer= By.xpath("//span[text()='Amazon US']");
	By Style = By.xpath("//input[@formcontrolname='styleName']");
	By Delivery = By.xpath("//input[@placeholder='Search By Deliver To']");
	By sec_Delivery = By.xpath("(//li[@role='option'])[1]");
	By Dev_Address = By.xpath("//input[@formcontrolname='deliverAddress']");
	By Dev_GST = By.xpath("//input[@formcontrolname='deliverGstNumber']");
	By Supplier = By.xpath("//input[@placeholder='Search By Supplier']");
	By sec_Supplier = By.xpath("//span[text()='Soujanya']");
	By Sup_Address = By.xpath("//input[@formcontrolname='supplierAddress']");
	By Sup_GST = By.xpath("//input[@formcontrolname='gstNumber']");
	By PaymentTerm= By.xpath("//input[@formcontrolname='paymentTypeId']");
	By DeliveryTerm = By.xpath("//select[@formcontrolname='deliveryTypeId']");
	By sec_DeliveryTerm = By.xpath("//option[text()=' Through Air']");
	By LeadTime = By.xpath("//input[@formcontrolname='leadtime']");
	By Process = By.xpath("//select[@formcontrolname='processTypeId']");
	By sec_Process = By.xpath("//option[text()=' Dyeing']");
	By FabricType = By.xpath("//select[@formcontrolname='fabricType']");
	By sec_FabricType = By.xpath("//option[text()=' Woven']");
	By FabricName = By.cssSelector("//ng-select[@bindlabel='fabricName']");//by.xpath("//ng-select[@bindlabel='fabricName']");
	By sec_FabricName = By.xpath("//span[text()='Raw silk']");
	By Content = By.xpath("//select[@formcontrolname='content']");
	By sec_Content = By.xpath("//option[text()=' 80%']");
	By Count = By.xpath("//select[@formcontrolname='countOfConstruction']");
	By sec_Count = By.xpath("//option[text()=' 43']");
	By GSM = By.xpath("//select[@formcontrolname='gsm']");
	By sec_GSM = By.xpath("//option[text()=' 6']");
	By CuttableWdt = By.xpath("//select[@formcontrolname='cuttableWidth']");
	By sec_CuttableWdt = By.xpath("//option[text()=' 8']");
	By Color = By.xpath("//ng-select[@formcontrolname='poColorId']");
	By sec_Color = By.xpath("//span[text()='Alabaster']");
	By QtyReq = By.xpath("//input[@formcontrolname='totalqtyRequired']");
	By AvailableStkQty = By.xpath("//input[@formcontrolname='totalqtystock']");
	public By Residual = By.xpath("//input[@formcontrolname='residualShrinkage']");
	By ProcessLoss = By.xpath("//input[@formcontrolname='processLoss']");
	By QtyAllowed = By.xpath("//input[@formcontrolname='qtyAllowd']");
	By Currency = By.xpath("//select[@formcontrolname='currencyType']");
	By sec_Currency = By.xpath("//option[text()=' United Kingdom(GBP)']");
	By Rate = By.xpath("//input[@formcontrolname='totalqtyRate']");
	By UOM = By.xpath("//select[@formcontrolname='uom']");
	By sec_UOM = By.xpath("//option[text()=' Meters']");
	By LShort = By.xpath("//textarea[@formcontrolname='laddtionalInfo']");
	By AddlInfo1 = By.xpath("//textarea[@formcontrolname='addtionalInfo1']");
	By AddInfo2 = By.xpath("//textarea[@formcontrolname='addtionalInfo2']");
//	By butt_AddIPO = By.xpath("//button[@class='btn btn-md btn-primary float-right ng-star-inserted']");
	By Stockgrid = By.xpath("//thead[@class='p-datatable-thead']");
	public By DueOn = By.xpath("//input[@formcontrolname='dueDate']");
	public By Qty = By.xpath("//input[@formcontrolname='qtyrequired']");
	public By Sampling = By.xpath("//input[@formcontrolname='isSampling']");
	public By Total 	= By.xpath("//td[text()='Total']");
	public By SaveToaster = By.xpath("//h2[text()='Create PO For Fabric Saved Successfully']");
	public By butt_Reset = By.xpath("//button[text()=' Reset']");
	public By butt_Save = By.xpath("(//button[@type='submit'])[1]");
	public By MandatoryToaster = By.xpath("//h2[text()='Mandatory Fields Are Required With  Valid Data.']");
	By inf_OrderType = By.xpath("//div[@data-validate='Type of Order is required']");
	By inf_DevliverTo = By.xpath("//div[@data-validate='Deliver To is required']");
	By inf_Supplier = By.xpath("//div[@data-validate='Supplier is required']");
	By inf_PaymentTerms = By.xpath("//div[@data-validate='Payment Terms is required']");
	By inf_DeliveryTerms = By.xpath("//div[@data-validate='Delivery Terms is required']");
	By inf_LeadTime = By.xpath("//div[@data-validate='Lead time (days) is required']");
	By inf_Process = By.xpath("//div[@data-validate='Process is required']");
	By inf_FabricType = By.xpath("//div[@data-validate='Fabric Type is required']");
	By inf_FabricName = By.xpath("//div[@data-validate='Fabric Name is required']");
	By inf_Content = By.xpath("//div[@data-validate='Content is required']");
	By inf_Count = By.xpath("//div[@data-validate='Count/Construction is required']");
	By inf_GSM = By.xpath("//div[@data-validate='GSM is required']");
	By inf_CuttableWdt = By.xpath("//div[@data-validate='Cuttable width is required']");
	By inf_Color = By.xpath("//div[@data-validate='Color is required']");
	By inf_Rresidual = By.xpath("//div[@data-validate='ResidualShrinkage  is required']");
	By inf_ProLoss = By.xpath("");
	By inf_QtyAllowed = By.xpath("//div[@data-validate='Qty Allowed  is required']");
	By inf_Rate = By.xpath("Rate is required");
	By inf_UOM = By.xpath("//div[@data-validate='UOM is required']");
	By inf_Qty = By.xpath("//div[@data-validate='Qty is required']");
	
		
	
	public void Navigate_to_Create_PO_For_Stock_screen() throws Throwable {
		utilities.webDriverWait(driver, RMUW.modWoven);
		driver.findElement(RMUW.modWoven).click();
		utilities.MinimumWait(driver);
		utilities.webDriverWait(driver, RMUW.modFabricSourcing);
		driver.findElement(RMUW.modFabricSourcing).click();
		utilities.MinimumWait(driver);
		utilities.webDriverWait(driver, RMUW.DataEntry);
		driver.findElement(RMUW.DataEntry).click();
		utilities.webDriverWait(driver, modGeneratePO);
		driver.findElement(modGeneratePO).click();
		utilities.webDriverWait(driver, modCreatePOStk);
		driver.findElement(modCreatePOStk).click();
		utilities.MinimumWait(driver);
		
	}


	public void Click_and_Select_Order_Type() throws Throwable {
		utilities.webDriverWait(driver, Ordertype);
		driver.findElement(Ordertype).click();
		utilities.webDriverWait(driver, sec_Order);
		driver.findElement(sec_Order).click();
		utilities.MinimumWait(driver);
	}


	public void Verify_whether_current_PO_Date_is_displayed_or_not() throws Throwable {
		utilities.webDriverWait(driver, PODate);
		driver.findElement(PODate).isDisplayed();
		WebElement PO = driver.findElement(PODate);
		String POdate = PO.getAttribute("value");
		SimpleDateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd");
		java.util.Date date;
		date = inputFormat.parse(POdate);
		SimpleDateFormat outputFormat = new SimpleDateFormat("dd-MM-yyyy");
		String formattedDate = outputFormat.format(date);

		System.out.println("Print the PO Date - " + formattedDate);
		utilities.MinimumWait(driver);
		
	}


	public void Verify_whether_the_PO_Number_field_value() throws Throwable {
		utilities.webDriverWait(driver, POnum);
		driver.findElement(POnum).isDisplayed();
		WebElement PO = driver.findElement(POnum);
		String POno = PO.getAttribute("value");
		System.out.println("Print the PO number - " +POno);
		utilities.MinimumWait(driver);
	}


	public void Select_a_Buyer() throws Throwable {
		utilities.webDriverWait(driver, Buyer);
		driver.findElement(Buyer).click();
		utilities.webDriverWait(driver, sec_Buyer);
		Thread.sleep(5000);
		driver.findElement(sec_Buyer).click();
		utilities.MinimumWait(driver);
	}


	public void Enter_the_Style() throws Throwable {
		utilities.webDriverWait(driver, Style);
		driver.findElement(Style).sendKeys("Style1");
		utilities.MinimumWait(driver);
	}


	public void Select_a_Delivery_To_factory_name() throws Throwable {

		utilities.webDriverWait(driver, Delivery);
		driver.findElement(Delivery).click();
		driver.findElement(Delivery).clear();
		driver.findElement(Delivery).sendKeys("Jiv");
		utilities.webDriverWait(driver, sec_Delivery);
		driver.findElement(sec_Delivery).click();
		utilities.MinimumWait(driver);
		
	}


	public void Verify_whether_the_Delivery_Factory_Address_is_displayed_or_not() throws Throwable {
		utilities.webDriverWait(driver,Dev_Address);
		driver.findElement(Dev_Address).isDisplayed();
		WebElement add = driver.findElement(Dev_Address);
		String DeliverAdd = add.getAttribute("value");
		System.out.println("Address of the selected factory - "+DeliverAdd);
		utilities.MinimumWait(driver);
		
		
	}


	public void Verify_whether_the_Delivery_Factory_GST_number_is_displayed_or_not() throws Throwable {
		utilities.webDriverWait(driver,Dev_GST);
		driver.findElement(Dev_GST).isDisplayed();
		WebElement GST = driver.findElement(Dev_GST);
		String DeliverGST = GST.getAttribute("value");
		System.out.println("GST number of the selected factory - "+DeliverGST);
		utilities.MinimumWait(driver);

	}


	public void Select_a_Supplier_name() throws Throwable {
		utilities.webDriverWait(driver, Supplier);
		driver.findElement(Supplier).click();
		driver.findElement(Supplier).sendKeys("Sou");
		utilities.webDriverWait(driver, sec_Supplier);
		driver.findElement(sec_Supplier).click();
		utilities.MinimumWait(driver);

	}


	public void Verify_whether_the_Supplier_Address_is_displayed_or_not() throws Throwable {
		utilities.webDriverWait(driver,Sup_Address);
		driver.findElement(Sup_Address).isDisplayed();
		WebElement add = driver.findElement(Sup_Address);
		String SuppAdd = add.getAttribute("value");
		System.out.println("Address of the selected Supplier - "+SuppAdd);
		utilities.MinimumWait(driver);
	}


	public void Verify_whether_the_Supplier_GST_number_is_displayed_or_not() throws Throwable {
		utilities.webDriverWait(driver,Sup_GST);
		driver.findElement(Sup_GST).isDisplayed();
		WebElement GST = driver.findElement(Sup_GST);
		String SuppGST = GST.getAttribute("value");
		System.out.println("GST number of the selected Supplier - "+SuppGST);
		utilities.MinimumWait(driver);
	}


	public void Verify_whether_the_Supplier_Payment_Terms_are_prepopulated_or_not() throws Throwable {
		utilities.webDriverWait(driver,PaymentTerm);
		driver.findElement(PaymentTerm).isDisplayed();
		WebElement PT = driver.findElement(PaymentTerm);
		String PtyTerms = PT.getAttribute("value");
		System.out.println("Selected Supplier Payment Terms pre-populated value - "+PtyTerms);
		utilities.MinimumWait(driver);
	}
	
	public void Verify_whether_the_user_is_able_to_edit_the_Payment_Terms() throws Throwable {
		utilities.webDriverWait(driver,PaymentTerm);
		driver.findElement(PaymentTerm).clear();
		driver.findElement(PaymentTerm).sendKeys("updated to 56%");
		utilities.MinimumWait(driver);
	}


	public void Verify_whether_the_Supplier_Delivery_Terms_are_prepopulated_or_not() throws Throwable {
		utilities.webDriverWait(driver,DeliveryTerm);
		
		 WebElement dropdownElement = driver.findElement(DeliveryTerm);
	        Select dropdown = new Select(dropdownElement);

	        WebElement selectedOption = dropdown.getFirstSelectedOption();
	        String defaultSelectedValue = selectedOption.getText();

			System.out.println("By default the Currency displayed in the field is - "+ defaultSelectedValue);
		driver.findElement(DeliveryTerm).isDisplayed();
		
		WebElement DT = driver.findElement(DeliveryTerm);


//		String DelivTerms = DT.getAttribute("value");
//		System.out.println("Selected Supplier Delivery Terms pre-populated value - "+DelivTerms);

//		String DelivTerms = DT.getText();
//		System.out.println("Selected Supplier Delivery Terms pre-populated value - "+ DelivTerms);

		String DelivTerms = DT.getAttribute("value");
		System.out.println("Selected Supplier Delivery Terms pre-populated value - "+DelivTerms);
//		String DelivTerms = DT.getText();
//		System.out.println("Selected Supplier Delivery Terms pre-populated value - "+ DelivTerms);

		utilities.MinimumWait(driver);




	}
	public void Verify_whether_the_user_is_able_to_edit_the_Delivery_Terms() throws Throwable {
		utilities.webDriverWait(driver,sec_DeliveryTerm);
		driver.findElement(sec_DeliveryTerm).click();
		utilities.MinimumWait(driver);
	}

	public void Enter_Lead_Time_value() throws Throwable {
		utilities.webDriverWait(driver,LeadTime);
		driver.findElement(LeadTime).sendKeys("3");	
		utilities.MinimumWait(driver);
	}


	public void Select_a_Process_for_the_selected_Order_Type() throws Throwable {
		utilities.webDriverWait(driver,Process);
		driver.findElement(Process).click();
		utilities.webDriverWait(driver,sec_Process);
		driver.findElement(sec_Process).click();
		utilities.MinimumWait(driver);
	}


	public void Select_a_Fabric_Type() throws Throwable {
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("scrollBy(0, 500)");
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver,FabricType);
		driver.findElement(FabricType).click();
		utilities.webDriverWait(driver,sec_FabricType);
		driver.findElement(sec_FabricType).click();
		utilities.MinimumWait(driver);
	}


	public void Select_a_Fabric_Name() throws Throwable {
		utilities.webDriverWait(driver,FabricName);
		driver.findElement(FabricName).click();
//		driver.findElement(FabricName).sendKeys("raw");
		utilities.webDriverWait(driver,sec_FabricName);
		driver.findElement(sec_FabricName).click();
		
	}


	public void Select_a_Content() throws Throwable {
		utilities.webDriverWait(driver,Content);
		driver.findElement(Content).click();
		utilities.webDriverWait(driver,sec_Content);
		driver.findElement(sec_Content).click();
		utilities.MinimumWait(driver);

	}


	public void Select_a_Count_Counstruction() throws Throwable {
		utilities.webDriverWait(driver,Count);
		driver.findElement(Count).click();
		utilities.webDriverWait(driver,sec_Count);
		driver.findElement(sec_Count).click();
		utilities.MinimumWait(driver);
	}


	public void Select_a_GSM() throws Throwable {
		utilities.webDriverWait(driver,GSM);
		driver.findElement(GSM).click();
		utilities.webDriverWait(driver,sec_GSM);
		driver.findElement(sec_GSM).click();
		utilities.MinimumWait(driver);
	}


	public void Select_a_Cuttable_Width() throws Throwable {
		utilities.webDriverWait(driver,CuttableWdt);
		driver.findElement(CuttableWdt).click();
		utilities.webDriverWait(driver,sec_CuttableWdt);
		driver.findElement(sec_CuttableWdt).click();
		utilities.MinimumWait(driver);
	}


	public void Select_a_Color() throws Throwable {
		utilities.webDriverWait(driver,Color);
		driver.findElement(Color).click();
		utilities.webDriverWait(driver,sec_Color);
		driver.findElement(sec_Color).click();
		utilities.MinimumWait(driver);
	}


	public void Verify_whether_the_Qty_Required_field_is_displaying_0_by_default() throws Throwable {
		utilities.webDriverWait(driver,QtyReq);
		WebElement Qreq = driver.findElement(QtyReq);
		String QtyRequired = Qreq.getAttribute("value");
		System.out.println("By default the Qty Required value is - "+QtyRequired);
		utilities.MinimumWait(driver);
	}


	public void Verify_whether_the_Qty_Required_field_is_displaying_the_entered_qty_or_not() throws Throwable {
		try {
            Robot robot = new Robot();
		
            robot.delay(2000);
		
            int scrollAmount = 25;
            for (int i = 0; i < scrollAmount; i++) {
                robot.keyPress(KeyEvent.VK_UP);
                robot.keyRelease(KeyEvent.VK_UP);
                robot.delay(500);
            }

        } catch (AWTException e) {
            e.printStackTrace();
        }
		utilities.webDriverWait(driver,QtyReq);

		System.out.println("came to Qty Required field");
		driver.findElement(QtyReq).click();

		WebElement QReq = driver.findElement(QtyReq);
		String QtyReq1 = QReq.getAttribute("value");
		System.out.println("After entering the Stock Qty, the Qty Required value is - "+QtyReq1);

//		WebElement Qreq1 = driver.findElement(QtyReq);
//		String QtyRequired = Qreq.getAttribute("value");
//		System.out.println("After entering the Stock Tty, the Tty Required value is - "+ QtyRequired);
//		utilities.MinimumWait(driver);


//		WebElement QReq = driver.findElement(QtyReq);
//		String QtyReq = QReq.getText();
//		System.out.println("After entering the Stock Tty, the Tty Required value is - "+QtyReq);
		WebElement Qreq = driver.findElement(QtyReq);
		String QtyRequired = Qreq.getAttribute("value");
		System.out.println("After entering the Stock Qty, the Qty Required value is - "+ QtyRequired);
		utilities.MinimumWait(driver);

	}


	public void Enter_Residual_Shrinkage_value() throws Throwable {
		utilities.webDriverWait(driver,Residual);
		driver.findElement(Residual).sendKeys("4");
		utilities.MinimumWait(driver);
		
	}
	
	public void Enter_Process_Loss_value() throws Throwable {
		utilities.webDriverWait(driver,ProcessLoss);
		driver.findElement(ProcessLoss).sendKeys("5");
		utilities.MinimumWait(driver);
	}

	public void Verify_whether_by_default_3_is_displayed_in_the_Qty_Allowed_field() throws Throwable {
		utilities.webDriverWait(driver,QtyAllowed);
		WebElement Qtyper = driver.findElement(QtyAllowed);
		String QtyAllowper = Qtyper.getAttribute("value");
		System.out.println("By default the +/-Qty Allowed percentage value is - "+QtyAllowper);
		utilities.MinimumWait(driver);

	}


	public void Verify_whether_the_user_is_able_to_change_the_value() throws Throwable {
		utilities.webDriverWait(driver,QtyAllowed);
		driver.findElement(QtyAllowed).clear();
		driver.findElement(QtyAllowed).sendKeys("3.3");
		WebElement Qtyper = driver.findElement(QtyAllowed);
		String QtyAllowper = Qtyper.getAttribute("value");
		System.out.println("Updated +/-Qty Allowed percentage value is - "+QtyAllowper);
		utilities.MinimumWait(driver);
		
	}


	public void Select_a_Currency() throws Throwable {
		utilities.webDriverWait(driver,Currency);


//		WebElement Curr = driver.findElement(Currency);
//		String currency = Curr.getAttribute("value");
//		System.out.println("By default the Currency displayed in the field is - "+currency);
//		utilities.MaximumLongWait(driver);


		WebElement Curr = driver.findElement(Currency);
		String currency = Curr.getAttribute("value");
		System.out.println("By default the Currency displayed in the field is - "+currency);
		utilities.MaximumLongWait(driver);

		
        WebElement dropdownElement = driver.findElement(Currency);
        Select dropdown = new Select(dropdownElement);

        WebElement selectedOption = dropdown.getFirstSelectedOption();
        String defaultSelectedValue = selectedOption.getText();

		System.out.println("By default the Currency displayed in the field is - "+ defaultSelectedValue);
		utilities.MinimumWait(driver);
		
		




		utilities.webDriverWait(driver,sec_Currency);
		driver.findElement(sec_Currency).click();
		WebElement UCurr = driver.findElement(sec_Currency);
		String Ucurrency = UCurr.getText();
		System.out.println("Updated currency type in the Currency field is - "+Ucurrency);
		utilities.MinimumWait(driver);
	}


	public void Enter_Rate_value() throws Throwable {
		utilities.webDriverWait(driver,Rate);
		driver.findElement(Rate).clear();
		driver.findElement(Rate).sendKeys("34");
		utilities.MinimumWait(driver);

	}


	public void Select_an_UOM() throws Throwable {
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("scrollBy(0, 500)");
//		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver,UOM);
		driver.findElement(UOM).click();
		utilities.webDriverWait(driver,sec_UOM);
		driver.findElement(sec_UOM).click();
		utilities.MinimumWait(driver);
	}


	public void Enter_remarks_in_the_L_Short_If_Any_field() throws Throwable {
		utilities.webDriverWait(driver,LShort);
		driver.findElement(LShort).sendKeys("Remarks entered in the L-Short field");
		utilities.MinimumWait(driver);
	}


	public void Enter_remarks_in_the_Addl_Information_1_field() throws Throwable {
		utilities.webDriverWait(driver,AddlInfo1);
		driver.findElement(AddlInfo1).sendKeys("Remarks entered in the Additional Information 1 field");
		utilities.MinimumWait(driver);
	}


	public void Enter_remarks_in_the_Addl_Information_2_field() throws Throwable {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scrollBy(0, 500)");
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver,AddInfo2);
		driver.findElement(AddInfo2).sendKeys("Remarks entered in the Additional Information 2 field");
		utilities.MinimumWait(driver);
	}


	public void Verify_the_DueOn_Date_value() throws Throwable {
		utilities.webDriverWait(driver, DueOn);
		driver.findElement(DueOn).isDisplayed();
		WebElement due = driver.findElement(DueOn);
		String Duedate = due.getAttribute("value");




		SimpleDateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd");
		java.util.Date date;
		date = inputFormat.parse(Duedate);
		SimpleDateFormat outputFormat = new SimpleDateFormat("dd-MM-yyyy");
		String formattedDate = outputFormat.format(date);
		
		
		System.out.println("Displaying the DueOn Date according to the Lead Time days entered - "+formattedDate);


//		System.out.println("Displaying the DueOn Date according to the Lead Time days entered - "+Duedate);

//		System.out.println("Displaying the DueOn Date according to the Lead Time days entered - "+Duedate);

		utilities.MinimumWait(driver);




	}
	

	public void Enter_the_Quantity_of_the_Fabric() throws Throwable {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scrollBy(0, 500)");
		utilities.MinimumWait(driver);
		utilities.webDriverWait(driver,Qty);
		driver.findElement(Qty).clear();
		driver.findElement(Qty).sendKeys("5600");
		utilities.MinimumWait(driver);
		utilities.webDriverWait(driver, Total);
		driver.findElement(Total).click();
		utilities.MinimumWait(driver);
	}


	public void Click_on_Reset_button_in_the_Create_PO_For_Stock_screen() throws Throwable {
		utilities.webDriverWait(driver,butt_Reset);
		driver.findElement(butt_Reset).click();
		utilities.MinimumWait(driver);
	}


	public void Click_on_Save_button_in_the_Create_PO_For_Stock_screen() throws Throwable {
		utilities.webDriverWait(driver,butt_Save);
		driver.findElement(butt_Save).click();
		utilities.MinimumWait(driver);
		
//		utilities.webDriverWait(driver, SaveToaster);
//		utilities.WaitUntilPageIsLoaded(driver);
//		WebElement saveButton = driver.findElement(SaveToaster);
//		
//        Actions actions = new Actions(driver);
//        actions.moveToElement(saveButton).perform();
//	        
//        WebElement successToaster = driver.findElement(SaveToaster);
//        String expectedToasterMessage = "Create PO For Fabric Saved Successfully"; 
//
//        String actualToasterMessage = successToaster.getText();
//
//        if (actualToasterMessage.equals(expectedToasterMessage)) {
//            System.out.println("Toaster message is correct: " + actualToasterMessage);
//        } else {
//            System.out.println("Toaster message is incorrect: " + actualToasterMessage);
//        }
	}


	public void Enter_Quantity_of_the_Fabric() throws Throwable {
		utilities.webDriverWait(driver,Qty);
		driver.findElement(Qty).clear();
		driver.findElement(Qty).sendKeys("890");
		utilities.webDriverWait(driver,Qty);
		driver.findElement(Sampling).click();
		utilities.webDriverWait(driver,QtyAllowed);
		driver.findElement(QtyAllowed).clear();
		utilities.webDriverWait(driver, Rate);
		driver.findElement(Rate).clear();
	}


	public void Verify_the_mandatory_validation_msg_on_saving() throws Throwable {
		utilities.webDriverWait(driver,butt_Save);
		driver.findElement(butt_Save).click();
//		utilities.webDriverWait(driver, MandatoryToaster);
//		WebElement saveButton = driver.findElement(MandatoryToaster);
//		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", saveButton);
//		((JavascriptExecutor) driver).executeScript("arguments[0].onmouseover()", saveButton);
//		Thread.sleep(2000);
//        Actions actions = new Actions(driver);
//        actions.moveToElement(saveButton).perform();
////        utilities.MaximumWait(driver);
//	    String expectedToasterMessage = "Mandatory Fields Are Required With Valid Data."; 
//        String actualToasterMessage = saveButton.getText();
//
//        if (actualToasterMessage.equals(expectedToasterMessage)) {
//            System.out.println("Toaster message is correct: " + actualToasterMessage);
//        } else {
//            System.out.println("Toaster message is incorrect: " + actualToasterMessage);
//        }
//        utilities.MaximumWait(driver);
	}


	public void Verify_the_Type_of_Order_info_tag() throws Throwable {
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("scrollTo(0, 0)");
		utilities.MaximumWait(driver);
//		try {
//            Robot robot = new Robot();
//		
//            robot.delay(2000);
//		
//            int scrollAmount = 30;
//            for (int i = 0; i < scrollAmount; i++) {
//                robot.keyPress(KeyEvent.VK_UP);
//                robot.keyRelease(KeyEvent.VK_UP);
//                robot.delay(500);
//            }
//
//        } catch (AWTException e) {
//            e.printStackTrace();
//        }
		
		Thread.sleep(5000);
		
		WebElement validationmessage = driver.findElement(inf_OrderType);
		String validationmsg = validationmessage.getAttribute("data-validate");
		System.out.println("Type of Order validation msg is :" + validationmsg);
		utilities.MinimumWait(driver);
	
	
	}


	public void Verify_the_Deliver_To_info_tag() throws Throwable {
		utilities.webDriverWait(driver,inf_DevliverTo);
		WebElement validationmessage = driver.findElement(inf_DevliverTo);
		String validationmsg = validationmessage.getAttribute("data-validate");
		System.out.println("Delivery To validation msg is:" + validationmsg);
		utilities.MinimumWait(driver);
	}


	public void Verify_the_Supplier_tag_name() throws Throwable {
		utilities.webDriverWait(driver,inf_Supplier);
		WebElement validationmessage = driver.findElement(inf_Supplier);
		String validationmsg = validationmessage.getAttribute("data-validate");
		System.out.println("Supplier validation msg is:" + validationmsg);
		utilities.MinimumWait(driver);
	}


	public void Verify_the_Payment_Terms_tag_name() throws Throwable {
		utilities.webDriverWait(driver,inf_PaymentTerms);
		WebElement validationmessage = driver.findElement(inf_PaymentTerms);
		String validationmsg = validationmessage.getAttribute("data-validate");
		System.out.println("Payment Terms validation msg is:" + validationmsg);
		utilities.MinimumWait(driver);
	}


	public void Verify_the_Delivery_Terms_tag_name() throws Throwable {
		utilities.webDriverWait(driver,inf_DeliveryTerms);
		WebElement validationmessage = driver.findElement(inf_DeliveryTerms);
		String validationmsg = validationmessage.getAttribute("data-validate");
		System.out.println("Delivery Terms validation msg is:" + validationmsg);
		utilities.MinimumWait(driver);
	}


	public void Verify_the_Lead_Time_tag_name() throws Throwable {
		utilities.webDriverWait(driver,inf_LeadTime);
		WebElement validationmessage = driver.findElement(inf_LeadTime);
		String validationmsg = validationmessage.getAttribute("data-validate");
		System.out.println("Lead Time validation msg is:" + validationmsg);
		utilities.MinimumWait(driver);
	}


	public void Verify_the_Process_tag_name() throws Throwable {
		utilities.webDriverWait(driver,inf_Process);
		WebElement validationmessage = driver.findElement(inf_Process);
		String validationmsg = validationmessage.getAttribute("data-validate");
		System.out.println("Process validation msg is:" + validationmsg);
		utilities.MinimumWait(driver);
	}


	public void Verify_the_Fabric_Type_tag_name() throws Throwable {
		utilities.webDriverWait(driver,inf_FabricType);
		WebElement validationmessage = driver.findElement(inf_FabricType);
		String validationmsg = validationmessage.getAttribute("data-validate");
		System.out.println("Fabric Type validation msg is:" + validationmsg);
		utilities.MinimumWait(driver);
	}


	public void Verify_the_Fabric_Name_tag_name() throws Throwable {
		utilities.webDriverWait(driver,inf_FabricName);
		WebElement validationmessage = driver.findElement(inf_FabricName);
		String validationmsg = validationmessage.getAttribute("data-validate");
		System.out.println("Fabric Name validation msg is:" + validationmsg);
		utilities.MinimumWait(driver);
	}


	public void Verify_the_Content_tag_name() throws Throwable {
		utilities.webDriverWait(driver,inf_Content);
		WebElement validationmessage = driver.findElement(inf_Content);
		String validationmsg = validationmessage.getAttribute("data-validate");
		System.out.println("Content validation msg is:" + validationmsg);
		utilities.MinimumWait(driver);
	}


	public void Verify_the_Count_tag_name() throws Throwable {
		utilities.webDriverWait(driver,inf_Count);
		WebElement validationmessage = driver.findElement(inf_Count);
		String validationmsg = validationmessage.getAttribute("data-validate");
		System.out.println("Count/Counstruction validation msg is:" + validationmsg);
		utilities.MinimumWait(driver);
	}


	public void Verify_the_GSM_tag_name() throws Throwable {
		utilities.webDriverWait(driver,inf_GSM);
		WebElement validationmessage = driver.findElement(inf_GSM);
		String validationmsg = validationmessage.getAttribute("data-validate");
		System.out.println("GSM validation msg is:" + validationmsg);
		utilities.MinimumWait(driver);
	}


	public void Verify_the_Cuttable_Width_tag_name() throws Throwable {
		utilities.webDriverWait(driver,inf_CuttableWdt);
		WebElement validationmessage = driver.findElement(inf_CuttableWdt);
		String validationmsg = validationmessage.getAttribute("data-validate");
		System.out.println("Cuttable Width validation msg is:" + validationmsg);
		utilities.MinimumWait(driver);
	}


	public void Verify_the_Color_tag_name() throws Throwable {
		utilities.webDriverWait(driver,inf_Color);
		WebElement validationmessage = driver.findElement(inf_Color);
		String validationmsg = validationmessage.getAttribute("data-validate");
		System.out.println("Color validation msg is:" + validationmsg);
		utilities.MinimumWait(driver);
	}


	public void Verify_the_Residual_Shrinkage_tag_name() throws Throwable {
		utilities.webDriverWait(driver,inf_Rresidual);
		WebElement validationmessage = driver.findElement(inf_Rresidual);
		String validationmsg = validationmessage.getAttribute("data-validate");
		System.out.println("Residual Shrinkage validation msg is:" + validationmsg);
		utilities.MinimumWait(driver);
	}


	public void Verify_the_Process_Loss_tag_name() throws Throwable {
		utilities.webDriverWait(driver,inf_ProLoss);
		WebElement validationmessage = driver.findElement(inf_ProLoss);
		String validationmsg = validationmessage.getAttribute("data-validate");
		System.out.println("Process Loss validation msg is:" + validationmsg);
		utilities.MinimumWait(driver);
	}


	public void Verify_the_Qty_Allowed_tag_name() throws Throwable {
//		utilities.webDriverWait(driver,QtyAllowed);
//		driver.findElement(QtyAllowed).clear();
//		utilities.webDriverWait(driver,inf_Rresidual);
//		driver.findElement(QtyAllowed).click();
		utilities.webDriverWait(driver,inf_QtyAllowed);
		System.out.println("+/- Qty Allowed field got cleared");
		WebElement validationmessage = driver.findElement(inf_QtyAllowed);
		String validationmsg = validationmessage.getAttribute("data-validate");
		System.out.println("+/- Qty Allowed validation msg is:" + validationmsg);
		utilities.MinimumWait(driver);
	}


	public void Verify_the_Rate_tag_name() throws Throwable {
//		utilities.webDriverWait(driver,Rate);
//		driver.findElement(Rate).clear();
		utilities.webDriverWait(driver,inf_Rate);
		WebElement validationmessage = driver.findElement(inf_Rate);
		String validationmsg = validationmessage.getAttribute("data-validate");
		System.out.println("Rate validation msg is:" + validationmsg);
		utilities.MinimumWait(driver);	
	}


	public void Verify_the_UOM_tag_name() throws Throwable {
		utilities.webDriverWait(driver,inf_UOM);
		WebElement validationmessage = driver.findElement(inf_UOM);
		String validationmsg = validationmessage.getAttribute("data-validate");
		System.out.println("UOM validation msg is:" + validationmsg);
		utilities.MinimumWait(driver);
	}


	public void Verify_the_Quantity_tag_name() throws Throwable {
		utilities.webDriverWait(driver,Qty);
		driver.findElement(Qty).clear();
		utilities.webDriverWait(driver,inf_Qty);
		WebElement validationmessage = driver.findElement(inf_Qty);
		String validationmsg = validationmessage.getAttribute("data-validate");
		System.out.println("Quantity validation msg is:" + validationmsg);
		utilities.MinimumWait(driver);
	}

	

}






