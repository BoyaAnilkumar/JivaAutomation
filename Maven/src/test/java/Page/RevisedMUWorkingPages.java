package Page;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import util.DriverFactory;
import util.Utilities;

public class RevisedMUWorkingPages extends DriverFactory{

	Utilities utilities = new Utilities();
	
	By txtUN = By.xpath("//input[@id='userName']");
	By txtPwd = By.xpath("//input[@id='userpassword']");
	By modWoven = By.xpath("//span[text()='Woven / knit']");
	By modFabricSourcing =By.xpath("//span[text()='Fabric Sourcing ']");
	By modGenerateFabMUworking = By.xpath("//span[text()='Generate Fabric Sheet Working']");
	By modRevisedFabMUworking = By.xpath("//a[text()=' Revised Fabric Sheet Working ']");
	By buttSHOStyle = By.xpath("//a[@id='sidebarCollapse']");
	By iconClear = By.xpath("//button[@class='btn btn-outline-secondary btn-sm mr-2 mb-2 float-right ng-star-inserted']");
	By iconFilter = By.xpath("//button[@class='btn btn-primary btn-sm mb-2 float-right']");
	By Buyer = By.xpath("//div[text()='Select Buyer']");
	By IPOname = By.xpath("//a[@id='v-pills-tabIPO32']");
	By QtyReqgrid = By.xpath("//p-table[@class='p-element ng-star-inserted']");
	By buttExpansion = By.xpath("//span[@class='p-button-icon pi pi-chevron-right']");
	By Usegrid = By.xpath("(//table[@class='p-datatable-table ng-star-inserted'])[2]");
	By MUWorkinggrid = By.xpath("(//table[@class='p-datatable-table ng-star-inserted'])[5]");
	By navRevFabMUSheet = By.xpath("//h3[text()='Revised Fabric Sheet Working']");
	By buttEdit	  					= By.xpath("//button[@class='btn btn-sm btn-info mr-1']");
	
	By Fabricrequiredqty			= By.xpath("//input[@formcontrolname='finalRequredQty']");
	By Residualshrinkage			= By.xpath("//input[@formcontrolname='residualShrinkage']");
	By Process1						= By.xpath("//select[@formcontrolname='process1TypeId']");
	By Selectprocess1				= By.xpath("//select[@formcontrolname='process1TypeId']/..//option[text()=' Dyeing']");
	By Process2						= By.xpath("//select[@formcontrolname='process2TypeId']");
	By Selectprocess2				= By.xpath("//select[@formcontrolname='process2TypeId']/..//option[text()=' Printing']");
	By Greigeqty					= By.xpath("//input[@placeholder='Enter Griege Qty']");
	By Process1MU					= By.xpath("(//input[@placeholder='Enter Mu%'])[1]");
	By Process1Qty					= By.xpath("(//input[@placeholder='Enter Qty'])[2]");
	By PrintType					= By.xpath("//input[@formcontrolname='printingType']");
	By Process2MU					= By.xpath("(//input[@placeholder='Enter Mu%'])[2]");
	By Process2Qty					= By.xpath("(//input[@placeholder='Enter Qty'])[3]");
	By FBGreige						= By.xpath("//h5[text()='GREIGE / BASE / Knitting ']");
	By FBDyeing						= By.xpath("(//h5[text()='DYEING'])[2]");
	By FBPrinting					= By.xpath("(//h5[text()='PRINTING'])[2]");
	By GFqty						= By.xpath("(//label[text()='Greige Fabric Qty ']/..//input[@class='form-control form-control-sm ng-untouched ng-pristine ng-valid'])[1]");
	By GFRate						= By.xpath("(//div[@class='form-group col-xl-3 col-md-6 col-12']/..//input[@placeholder='Enter Rate'])[2]");
	By GFConversionrate				= By.xpath("(//input[@placeholder='Enter Conversion Rate'])[2]");
	By GFCost						= By.xpath("(//input[@placeholder='Enter Cost'])[2]");
	By GFabricManager				= By.xpath("//select[@formcontrolname='greigeBaseFabricManagerId']");
	By SelectGFmanager				= By.xpath("(//option[text()=' Lokesh P'])[2]");
	By GFabricManagerAsst			= By.xpath("//ng-select[@formcontrolname='greigeBaseFabricAssistantsId']");
	By SelectGFMAsst				= By.xpath("(//span[@class='ng-option-label ng-star-inserted'])[1]");
	By GExecutive					= By.xpath("//select[@formcontrolname='greigeBaseFabricExecutiveId']");
	By SelectGFExecutive			= By.xpath("(//option[text()=' Anil Kumar'])[2]");
	By Dyeingqty					= By.xpath("(//input[@formcontrolname='dyingQty'])[2]");
	By DyeingRate					= By.xpath("(//input[@placeholder='Enter Rate'])[3]");
	By DyeingConversionrate			= By.xpath("(//input[@placeholder='Enter Conversion Rate'])[3]");
	By Dyeingcost					= By.xpath("(//input[@placeholder='Enter Cost'])[3]");
	By DyeingFabricManager			= By.xpath("//select[@formcontrolname='dyingFabricManagerId']");
	By SelectDFM					= By.xpath("(//option[text()=' Anil Singh'])[3]");
	By DyeingFabricManagerAsst		= By.xpath("//ng-select[@formcontrolname='dyingFabricAssistantsId']");
	By SelectDFMAsst				= By.xpath("//span[text()='Sanjeev Kumar']");
	By DyeingFabExecutive			= By.xpath("//select[@formcontrolname='dyingFabricExecutiveId']");
	By SelectDFE					= By.xpath("(//option[text()=' Anil Kumar'])[3]");
	By Printingqty					= By.xpath("(//input[@formcontrolname='printingQty'])[2]");
	By PrintingRate					= By.xpath("//input[@formcontrolname='printingRate']");
	By PrintingConversionrate		= By.xpath("(//input[@formcontrolname='printingConversionRate'])[1]");
	By Printingcost					= By.xpath("(//input[@formcontrolname='printingCostInINR'])[1]");
	By PrintingFabricManager		= By.xpath("//select[@formcontrolname='printingFabricManagerId']");
	By SelectPFM					= By.xpath("//select[@formcontrolname='printingFabricManagerId']/..//option[text()=' Jiten Gupta']");
	By PrintingFabricManagerAsst	= By.xpath("//ng-select[@formcontrolname='printingFabricAssistantsId']");
	By PrintingFabricExecutive		= By.xpath("//select[@formcontrolname='printingFabricExecutiveId']");
	By SelectPFE					= By.xpath("//select[@formcontrolname='printingFabricExecutiveId']/..//option[text()=' Ramya']");
	By FreGreigeRate				= By.xpath("(//input[@formcontrolname='greigeBaseFabricRate'])[2]");
	By FreGreigeConvRate			= By.xpath("(//input[@formcontrolname='greigeBaseFabricConversionRate'])[2]");
	By FreGreCost					= By.xpath("(//input[@formcontrolname='greigeBaseFabricCostInINR'])[2]");
	By FreDyeRate					= By.xpath("//input[@formcontrolname='dyingRateInINR']");
	By FreDyeConvRate				= By.xpath("(//input[@formcontrolname='dyingConversionRate'])[2]");
	By FreDyeCost					= By.xpath("(//input[@formcontrolname='dyingCostInINR'])[2]");
	By FrePrintRate					= By.xpath("//input[@formcontrolname='printingRateInINR']");
	By FrePrintConvRate				= By.xpath("(//input[@formcontrolname='printingConversionRate'])[2]");
	By FrePrintCost					= By.xpath("(//input[@formcontrolname='printingCostInINR'])[2]");
	
	
	By buttCancel					= By.xpath("//a[@class='btn btn-md btn-danger mr-2']");
	By buttsubmit					= By.xpath("//button[@class='btn btn-primary btn-md']");

	
	

	public void Login_with_the_Production_Manager() {
		driver.findElement(txtUN).clear();
		driver.findElement(txtUN).sendKeys("Lokesh");
//		utilities.MinimumWait(driver);
		driver.findElement(txtPwd).clear();
		driver.findElement(txtPwd).sendKeys("Abcd@123");
		
	}
	
	
	
	
	
	public void Navigate_to_Revised_Fabric_Sheet_Working_screen() throws Throwable {
		utilities.webDriverWait(driver, modWoven);
		driver.findElement(modWoven).click();
		utilities.webDriverWait(driver, modFabricSourcing);
		driver.findElement(modFabricSourcing).click();
		utilities.webDriverWait(driver, modGenerateFabMUworking);
		driver.findElement(modGenerateFabMUworking).click();
		utilities.webDriverWait(driver, modRevisedFabMUworking);
		driver.findElement(modRevisedFabMUworking).click();
	}

	public void Click_on_the_Styles_expansion() throws Throwable {
		utilities.webDriverWait(driver, buttSHOStyle);
		driver.findElement(buttSHOStyle).click();
	}

		public void Click_on_Clear_Filter_icon() throws Throwable {
			utilities.webDriverWait(driver, iconClear);
			driver.findElement(iconClear).click();
	}

	public void Click_on_Filter_icon() throws Throwable {
		utilities.webDriverWait(driver, iconFilter);
		driver.findElement(iconFilter).click();
	}

	public void Click_on_Buyer_dropdown() throws Throwable {
		utilities.webDriverWait(driver, Buyer);
		driver.findElement(Buyer).click();
	}

	public void Verify_the_count_of_the_Fabric_records_under_the_Quantity_Requirment_grid() throws Throwable {
		utilities.webDriverWait(driver,QtyReqgrid);
		WebElement table = driver.findElement(QtyReqgrid);
        java.util.List<WebElement> rows = table.findElements(By.tagName("tr"));
        int Count = rows.size();
        int rowCount = Count -1;
        System.out.println("No. of Fabrics displayed in the Quantity Requirment grid - " +rowCount);
	}

	public void Verify_whether_the_Use_Details_are_displayed_in_the_expansion() throws Throwable {
		utilities.webDriverWait(driver, buttExpansion);
		driver.findElement(buttExpansion).click();
	}

	public void Verify_the_count_of_the_Use_records_under_the_Use_Details_expansion_grid() throws Throwable {
		utilities.webDriverWait(driver,Usegrid);
		WebElement table = driver.findElement(Usegrid);
        java.util.List<WebElement> rows = table.findElements(By.tagName("tr"));
        int Count = rows.size();
        int rowCount = Count -1;
        System.out.println("No. of Use displayed in the Use Details grid - " +rowCount);
	}

	public void Verify_the_count_of_the_Fabric_records_under_the_MU_Working_grid() throws Throwable {
		utilities.webDriverWait(driver,MUWorkinggrid);
		WebElement table = driver.findElement(MUWorkinggrid);
        java.util.List<WebElement> rows = table.findElements(By.tagName("tr"));
        int Count = rows.size();
        int rowCount = Count -3;
        System.out.println("No. of Fabrics displayed in the MU Working grid - " +rowCount);
	}

	public void Verify_whether_Revised_Fabric_Sheet_working_screen_is_displayed() throws Throwable {
		utilities.webDriverWait(driver,navRevFabMUSheet);
		WebElement RevMU = driver.findElement(navRevFabMUSheet);
		String RevMUWork = RevMU.getText();
		System.out.println("Display the screen name - " + RevMUWork);
	}

	public void Click_on_Edit_icon_in_MU_Working_grid_for_a_Fabric() throws Throwable {
		try {
            Robot robot = new Robot();
		
            robot.delay(2000);
		
            int scrollAmount = 5;
            for (int i = 0; i < scrollAmount; i++) {
                robot.keyPress(KeyEvent.VK_UP);
                robot.keyRelease(KeyEvent.VK_UP);
                robot.delay(500);
            }

        } catch (AWTException e) {
            e.printStackTrace();
        }
		utilities.webDriverWait(driver,buttEdit);
		driver.findElement(buttEdit).click();
	}

	public void Enter_the_value_in_the_Residual_Shrinkage_field() throws Throwable {
		utilities.webDriverWait(driver,Residualshrinkage);
		driver.findElement(Residualshrinkage).clear();
		driver.findElement(Residualshrinkage).sendKeys("5");;
	}

	public void Select_a_process_in_the_Process1_field() throws Throwable {
		utilities.webDriverWait(driver,Process1);
		driver.findElement(Process1).click();
		utilities.webDriverWait(driver,Selectprocess1);
		driver.findElement(Selectprocess1).click();
	}

	public void Select_another_process_in_the_Process2_field() throws Throwable {
		utilities.webDriverWait(driver,Process2);
		driver.findElement(Process1).click();
		utilities.webDriverWait(driver,Selectprocess2);
		driver.findElement(Selectprocess2).click();
	}

	public void Verify_the_Greige_Qty_value() throws Throwable {
		utilities.webDriverWait(driver,Greigeqty);
		WebElement GQty = driver.findElement(Greigeqty);
		String  GreigeQty = GQty.getAttribute("value");
		System.out.println("Display the Greige Qty value - " + GreigeQty);
	}

	public void Enter_Dyeing_MU_value_in_the_MU_field() throws Throwable {
		utilities.webDriverWait(driver,Process1MU);
		driver.findElement(Process1MU).clear();
		driver.findElement(Process1MU).sendKeys("7");
	}

	public void Verify_the_Dyeing_qty_value_in_the_Qty_field() throws Throwable {
		utilities.webDriverWait(driver,Process1Qty);
		WebElement DQty = driver.findElement(Process1Qty);
		String  DyeQty = DQty.getAttribute("value");
		System.out.println("Display the Dyeing Qty value " + DyeQty);
	}

	public void Enter_the_text_in_the_Print_Type_field() throws Throwable {
		utilities.webDriverWait(driver,PrintType);
		driver.findElement(PrintType).clear();
		driver.findElement(PrintType).sendKeys("Print1");
	}

	public void Enter_Printing_MU_value_in_the_MU_field() throws Throwable {
		utilities.webDriverWait(driver,Process2MU);
		driver.findElement(Process2MU).clear();
		driver.findElement(Process2MU).sendKeys("7");
	}

	public void Verify_the_Printing_qty_value_in_the_Qty_field() throws Throwable {
		utilities.webDriverWait(driver,Process2Qty);
		WebElement DQty = driver.findElement(Process2Qty);
		String  DyeQty = DQty.getAttribute("value");
		System.out.println("Display the Dyeing Qty value " + DyeQty);
	}

	public void Verify_the_Greige_Qty_value_in_the_Greige_Fabric_Qty_field() throws Throwable {
		utilities.webDriverWait(driver,GFqty);
		WebElement Gqty = driver.findElement(GFqty);
		String Greqty = Gqty.getAttribute("value");
		System.out.println("Display the Greige Fabric Qty under Fabric Budget - " +Greqty);
	}

	public void Enter_the_Rate_for_Griege_Fabric_Qty() throws Throwable {
		utilities.webDriverWait(driver,GFRate);
		driver.findElement(GFRate).clear();
		driver.findElement(GFRate).sendKeys("34");
	}

	public void Verify_the_Conversion_Rate_is_autopopulate_and_is_an_editable_field_for_Greige_process() throws Throwable {
		utilities.webDriverWait(driver,GFConversionrate);
		driver.findElement(GFConversionrate).clear();
		driver.findElement(GFConversionrate).sendKeys("1.56");
	}

	public void Verify_the_Greige_Cost_field_value_is_displayed_as_per_formula() throws Throwable {
		utilities.webDriverWait(driver,GFCost);
		WebElement Gcost = driver.findElement(GFCost);
		String Grecost = Gcost.getAttribute("value");
		System.out.println("Display the Greige Fabric Cost as per the Qty, Cost & Conversion Rate - " +Grecost);
	}

	public void Select_the_Fabric_Manager_from_the_dropdown_list_in_the_Fabric_Manager_field_for_Griege_process() throws Throwable {
		utilities.webDriverWait(driver,GFabricManager);
		driver.findElement(GFabricManager).click();
		utilities.webDriverWait(driver,SelectGFmanager);
		driver.findElement(SelectGFmanager).click();
	}

	public void Select_the_Assitant_Fabric_Manager_from_the_dropdown_list_in_the_Assitant_Fabric_Manager_field_for_Griege_process() throws Throwable {
		utilities.webDriverWait(driver,GFabricManagerAsst);
		driver.findElement(GFabricManagerAsst).click();
		utilities.webDriverWait(driver,SelectGFMAsst);
		driver.findElement(SelectGFMAsst).click();
	}

	public void Select_the_Fabric_Executives_from_the_dropdown_list_in_the_Fabric_Executives_field_for_Griege_process() throws Throwable {
		utilities.webDriverWait(driver,GExecutive);
		driver.findElement(GExecutive).click();
		utilities.webDriverWait(driver,SelectGFExecutive);
		driver.findElement(SelectGFExecutive).click();
	}

	public void Verify_the_Dyeing_Qty_value_in_the_Dyeing_Qty_field() throws Throwable {
		utilities.webDriverWait(driver,Dyeingqty);
		WebElement Dqty = driver.findElement(Dyeingqty);
		String Dyeqty = Dqty.getAttribute("value");
		System.out.println("Display the Dyeing Qty value - " +Dyeqty);
	}

	public void Enter_the_Rate_for_Dyeing_Qty() throws Throwable {
		utilities.webDriverWait(driver,DyeingRate);
		driver.findElement(DyeingRate).clear();
		driver.findElement(DyeingRate).sendKeys("35");
	}

	public void Verify_the_Conversion_Rate_is_autopopulate_and_is_an_editable_field_for_Dyeing_process() throws Throwable {
		utilities.webDriverWait(driver,DyeingConversionrate);
		driver.findElement(DyeingConversionrate).clear();
		driver.findElement(DyeingConversionrate).sendKeys("1.32");
	}

	public void Verify_the_Dyeing_Cost_field_value_is_displayed_as_per_formula() throws Throwable {
		utilities.webDriverWait(driver,Dyeingcost);
		WebElement Dcost = driver.findElement(Dyeingcost);
		String Dyeingcost = Dcost.getAttribute("value");
		System.out.println("Display the Dyeing Cost as per the Qty, Cost & Conversion Rate values - " +Dyeingcost);
	}

	public void Select_the_Fabric_Manager_from_the_dropdown_list_in_the_Fabric_Manager_field_for_Dyeing_process() throws Throwable {
		utilities.webDriverWait(driver,DyeingFabricManager);
		driver.findElement(DyeingFabricManager).click();
		utilities.webDriverWait(driver,SelectDFM);
		driver.findElement(SelectDFM).click();
	}

	public void Select_the_Assitant_Fabric_Manager_from_the_dropdown_list_in_the_Assitant_Fabric_Manager_field_for_Dyeing_process() throws Throwable {
		utilities.webDriverWait(driver,DyeingFabricManagerAsst);
		driver.findElement(DyeingFabricManagerAsst).click();
		utilities.webDriverWait(driver,SelectDFMAsst);
		driver.findElement(SelectDFMAsst).click();
	}

	public void Select_the_Fabric_Executives_from_the_dropdown_list_in_the_Fabric_Executives_field_for_Dyeing_process() throws Throwable {
		utilities.webDriverWait(driver,DyeingFabExecutive);
		driver.findElement(DyeingFabExecutive).click();
		utilities.webDriverWait(driver,SelectDFE);
		driver.findElement(SelectDFE).click();
	}

	public void Verify_the_Printing_Qty_value_in_the_Printing_Qty_field() throws Throwable {
		utilities.webDriverWait(driver,Printingqty);
		WebElement Pqty = driver.findElement(Printingqty);
		String Printqty = Pqty.getAttribute("value");
		System.out.println("Display the Dyeing Qty value - " +Printqty);
	}

	public void Enter_the_Rate_for_Printing_Qty() throws Throwable {
		utilities.webDriverWait(driver,PrintingRate);
		driver.findElement(PrintingRate).clear();
		driver.findElement(PrintingRate).sendKeys("36");
	}

	public void Verify_the_Conversion_Rate_is_autopopulate_and_is_an_editable_field_for_Printing_process() throws Throwable {
		utilities.webDriverWait(driver,PrintingConversionrate);
		driver.findElement(PrintingConversionrate).clear();
		driver.findElement(PrintingConversionrate).sendKeys("1.23");
	}

	public void Verify_the_Printing_Cost_field_value_is_displayed_as_per_formula() throws Throwable {
		utilities.webDriverWait(driver,Printingcost);
		WebElement Pcost = driver.findElement(Printingcost);
		String Printingcost = Pcost.getAttribute("value");
		System.out.println("Display the Printing Cost as per the Qty, Cost & Conversion Rate values - " +Printingcost);
	}

	public void Select_the_Fabric_Manager_from_the_dropdown_list_in_the_Fabric_Manager_field_for_Printing_process() throws Throwable {
		utilities.webDriverWait(driver,PrintingFabricManager);
		driver.findElement(PrintingFabricManager).click();
		utilities.webDriverWait(driver,SelectPFM);
		driver.findElement(SelectPFM).click();
	}

	public void Select_the_Assitant_Fabric_Manager_from_the_dropdown_list_in_the_Assitant_Fabric_Manager_field_for_Printing_process() throws Throwable {
		utilities.webDriverWait(driver,PrintingFabricManagerAsst);
		driver.findElement(PrintingFabricManagerAsst).click();
//		utilities.webDriverWait(driver,PrintingFabricManagerAsst);
//		driver.findElement(PrintingFabricManagerAsst).click();
	}

	public void Select_the_Fabric_Executives_from_the_dropdown_list_in_the_Fabric_Executives_field_for_Printing_process() throws Throwable {
		utilities.webDriverWait(driver,PrintingFabricExecutive);
		driver.findElement(PrintingFabricExecutive).click();
		utilities.webDriverWait(driver,SelectPFE);
		driver.findElement(SelectPFE).click();
	}

	public void Verify_the_Freight_Greige_Qty_value_in_the_Greige_Fabric_Qty_field() throws Throwable {
		utilities.webDriverWait(driver,GFqty);
		WebElement Gqty = driver.findElement(GFqty);
		String Greqty = Gqty.getAttribute("value");
		System.out.println("Display the Greige Fabric Qty under Freight budget section - " +Greqty);
	}

	public void Enter_the_Rate_for_FreightGriege_Fabric_Qty() throws Throwable {
		utilities.webDriverWait(driver,FreGreigeRate);
		driver.findElement(FreGreigeRate).clear();
		driver.findElement(FreGreigeRate).sendKeys("3");
	}

	public void Verify_the_Freight_Conversion_Rate_is_autopopulate_and_is_an_editable_field_for_Greige_process() throws Throwable {
		utilities.webDriverWait(driver,FreGreigeConvRate);
		driver.findElement(FreGreigeConvRate).clear();
		driver.findElement(FreGreigeConvRate).sendKeys("1.01");
	}		

	public void Verify_the_Freight_Greige_Cost_field_value_is_displayed_as_per_formula() throws Throwable {
		utilities.webDriverWait(driver,FreGreCost);
		WebElement FGcost = driver.findElement(FreGreCost);
		String FreGrecost = FGcost.getAttribute("value");
		System.out.println("Display the Freight Greige Cost as per the Qty, Cost & Conversion Rate values - " +FreGrecost);
	}

	public void Verify_the_Freight_Dyeing_Qty_value_in_the_Dyeing_Fabric_Qty_field() throws Throwable {
		utilities.webDriverWait(driver,Dyeingqty);
		WebElement FDqty = driver.findElement(Dyeingqty);
		String FDyeqty = FDqty.getAttribute("value");
		System.out.println("Display the Freight Dyeing Qty under Freight budget section - " +FDyeqty);
	}

	public void Enter_the_Rate_for_Freight_Dyeing_Qty() throws Throwable {
		utilities.webDriverWait(driver,FreDyeRate);
		driver.findElement(FreDyeRate).clear();
		driver.findElement(FreDyeRate).sendKeys("3");
	}

	public void Verify_the_Freight_Conversion_Rate_is_autopopulate_and_is_an_editable_field_for_Dyeing_process() throws Throwable {
		utilities.webDriverWait(driver,FreDyeConvRate);
		driver.findElement(FreDyeConvRate).clear();
		driver.findElement(FreDyeConvRate).sendKeys("1.34");
	}

	public void Verify_the_Freight_Dyeing_Cost_field_value_is_displayed_as_per_formula() throws Throwable {
		utilities.webDriverWait(driver,FreDyeCost);
		WebElement FDcost = driver.findElement(FreDyeCost);
		String FreDyecost = FDcost.getAttribute("value");
		System.out.println("Display the Freight Dyeing Cost as per the Qty, Cost & Conversion Rate values - " +FreDyecost);
	}

	public void Verify_the_Freight_Printing_Qty_value_in_the_Printing_Fabric_Qty_field() throws Throwable {
		utilities.webDriverWait(driver,Printingqty);
		WebElement FPqty = driver.findElement(Printingqty);
		String FPrtqty = FPqty.getAttribute("value");
		System.out.println("Display the Freight Printing Qty under Freight budget section - " +FPrtqty);
	}

	public void Enter_the_Rate_for_Freight_Printing_Qty() throws Throwable {
		utilities.webDriverWait(driver,FrePrintRate);
		driver.findElement(FrePrintRate).clear();
		driver.findElement(FrePrintRate).sendKeys("3");
	}
	
	public void Verify_the_Freight_Conversion_Rate_is_autopopulate_and_is_an_editable_field_for_Printing_process() throws Throwable {
		utilities.webDriverWait(driver,FrePrintConvRate);
		driver.findElement(FrePrintConvRate).clear();
		driver.findElement(FrePrintConvRate).sendKeys("1.01");
	}

	public void Verify_the_Freight_Printing_Cost_field_value_is_displayed_as_per_formula() throws Throwable {
		utilities.webDriverWait(driver,FrePrintCost);
		WebElement FPcost = driver.findElement(FrePrintCost);
		String FrePrtcost = FPcost.getAttribute("value");
		System.out.println("Display the Freight Printing Cost as per the Qty, Cost & Conversion Rate values - " +FrePrtcost);
	}

	public void Verify_the_Cancel_button_properties() throws Throwable {
		utilities.webDriverWait(driver,buttCancel);
		driver.findElement(buttCancel).click();
	}

	public void Verify_the_Submit_button_properties() throws Throwable {
		utilities.webDriverWait(driver,buttsubmit);
		driver.findElement(buttsubmit).click();
		Thread.sleep(10000);
	}

	public void Select_an_IPO_from_the_Menu_list() throws Throwable {
		utilities.webDriverWait(driver,IPOname);
		driver.findElement(IPOname).click();
	}

	

	
	

}

	

	


