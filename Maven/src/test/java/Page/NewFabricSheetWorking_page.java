package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import util.DriverFactory;
import util.Utilities;

public class NewFabricSheetWorking_page extends DriverFactory {

	Utilities utilities = new Utilities();
	
	By WovenModule 					= By.xpath("//span[text()='Woven / knit']");
	By Fabricsourcing				= By.xpath("//span[text()='Fabric Sourcing ']");
	By GenerateFabricsheet			= By.xpath("//span[text()='Generate Fabric Sheet Working']");
	By NewFabricsheetworking		= By.xpath("//a[text()=' New Fabric Sheet Working ']");
	By Styleexpansion				= By.xpath("//a[@id='sidebarCollapse']");
	By SelectIPO					= By.xpath("//a[@id='v-pills-tabVelIPO']");
	By Filtericon					= By.xpath("//button[@class='btn btn-primary btn-sm mb-2 float-right']");
	By Buyer						= By.xpath("//div[text()='Select Buyer']");
	By EnterBuyername				= By.xpath("//div[@class='p-multiselect-filter-container ng-tns-c92-1 ng-star-inserted']/..//input[@class='p-multiselect-filter p-inputtext p-component ng-tns-c92-1']");
	By selectbuyer					= By.xpath("//li[@aria-label='Amazon US']");
	By Season						= By.xpath("//select[@class='form-control ng-pristine ng-valid ng-touched']");
	By Selectseason					= By.xpath("//select[@class='form-control ng-pristine ng-valid ng-touched']/.//option[text()=' Season1']");
	By Status 						= By.xpath("//label[text()='Status']/..//select[@class='form-control ng-pristine ng-valid ng-touched']");
	By Selectstatus					= By.xpath("//select[@class='form-control ng-pristine ng-valid ng-touched']/..//option[text()=' Submitted To Fabric Team']");
	By Applybutton					= By.xpath("//button[@class='btn btn-md btn-primary']");
	By Resetbutton					= By.xpath("//button[@class='btn btn-md btn-light btn-active-light-primary mr-2']");
	By Editicon						= By.xpath("//button[@class='btn btn-sm btn-info mr-1']");
	By Fabricrequiredqty			= By.xpath("//input[@formcontrolname='finalRequredQty']");
	By Residualshrinkage			= By.xpath("//label[text()='Residual Shrinkage']/..//input[@class='form-control form-control-sm ng-untouched ng-pristine ng-valid']");
	By Process1						= By.xpath("//select[@formcontrolname='process1TypeId']");
	By Selectprocess1				= By.xpath("//select[@formcontrolname='process1TypeId']/..//option[text()=' Dyeing']");
	By Process2						= By.xpath("//select[@formcontrolname='process2TypeId']");
	By Selectprocess2				= By.xpath("//select[@formcontrolname='process2TypeId']/..//option[text()=' Printing']");
	By Greigeqty					= By.xpath("//input[@placeholder='Enter Griege Qty']");
	By Process1MU					= By.xpath("(//input[@placeholder='Enter Mu%'])[1]");
	By Process1Qty					= By.xpath("(//input[@placeholder='Enter Qty'])[2]");
	By PrintType					= By.xpath("//input[@placeholder='Enter Print Type']");
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
	By GFabricManagerAsst			= By.xpath("(//div[@class='ng-select-container'])[2]");
	By SelectGFMAsst				= By.xpath("//div[@id='a96155b3ece0-0']");
	By GExecutive					= By.xpath("//select[@formcontrolname='greigeBaseFabricExecutiveId']");
	By SelectGFExecutive			= By.xpath("(//option[text()=' Nikhil'])[2]");
	By Dyeingqty					= By.xpath("(//input[@formcontrolname='dyingQty'])[2]");
	By DyeingRate					= By.xpath("(//input[@placeholder='Enter Rate'])[3]");
	By DyeingConversionrate			= By.xpath("(//input[@placeholder='Enter Conversion Rate'])[3]");
	By Dyeingcost					= By.xpath("(//input[@placeholder='Enter Cost'])[3]");
	By DyeingFabricManager			= By.xpath("//select[@formcontrolname='dyingFabricManagerId']");
	By SelectDFM					= By.xpath("(//option[text()=' Anil Singh'])[3]");
	By DyeingFabricManagerAsst		= By.xpath("(//div[@class='ng-select-container'])[3]");
	By SelectDFMAsst				= By.xpath("//div[@id='a359b4891108-0']");
	By DyeingFabExecutive			= By.xpath("//select[@formcontrolname='dyingFabricExecutiveId']");
	By SelectDFE					= By.xpath("(//option[text()=' Ramya'])[3]");
	By Printingqty					= By.xpath("(//input[@formcontrolname='printingQty'])[2]");
	By PrintingRate					= By.xpath("//input[@formcontrolname='printingRate']");
	By PrintingConversionrate		= By.xpath("(//input[@formcontrolname='printingConversionRate'])[1]");
	By Printingcost					= By.xpath("(//input[@formcontrolname='printingCostInINR'])[1]");
	By PrintingFabricManager		= By.xpath("//select[@formcontrolname='printingFabricManagerId']");
	By PrintingFabricManagerAsst	= By.xpath("//ng-select[@formcontrolname='printingFabricAssistantsId']");
	By PrintingFabricExecutive		= By.xpath("//select[@formcontrolname='printingFabricExecutiveId']");
	By Cancelbutton					= By.xpath("//a[@class='btn btn-md btn-danger mr-2']");
	By submitbutton					= By.xpath("//button[@class='btn btn-primary btn-md']");



	
	
	
	
	
	
	
	public void navigate_to_New_Fabric_Sheet_working_screen() throws Throwable {
		
		 utilities.webDriverWait(driver, WovenModule);
		 driver.findElement(WovenModule).click();
		 utilities.MinimumWait(driver);
		 
		 utilities.webDriverWait(driver, Fabricsourcing);
		 driver.findElement(Fabricsourcing).click();
		 utilities.MinimumWait(driver);
		 
		 utilities.webDriverWait(driver, GenerateFabricsheet);
		 driver.findElement(GenerateFabricsheet).click();
		 utilities.MinimumWait(driver);
		 
		 utilities.webDriverWait(driver, NewFabricsheetworking);
		 driver.findElement(NewFabricsheetworking).click();
		 utilities.MinimumWait(driver);
		
	}

	public void Click_on_styles_expansion() throws Throwable {
		
		utilities.webDriverWait(driver, Styleexpansion);
		driver.findElement(Styleexpansion).click();
		utilities.MinimumWait(driver);
		
	}

	public void click_on_IPO_in_the_styles_expansion() throws Throwable {
		
		utilities.webDriverWait(driver, SelectIPO);
		driver.findElement(SelectIPO).click();
		utilities.MinimumWait(driver);
		
		
	}

	public void Close_the_styles_expansion() throws Throwable {
		
		utilities.webDriverWait(driver, Styleexpansion);
		driver.findElement(Styleexpansion).click();
		utilities.MinimumWait(driver);
		
	}

	public void click_on_filter_icon() throws Throwable {
		
		utilities.webDriverWait(driver, Filtericon);
		driver.findElement(Filtericon).click();
		utilities.MinimumWait(driver);
		
	}

	public void click_on_buyer_dropdown() throws Throwable {
		
		utilities.webDriverWait(driver, Buyer);
		driver.findElement(Buyer).click();
		utilities.MinimumWait(driver);
		
	}

	public void Enter_the_buyer_and_select_buyer() throws Throwable {
		
		utilities.webDriverWait(driver, EnterBuyername);
		driver.findElement(EnterBuyername).sendKeys("Amazon");
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, selectbuyer);
		driver.findElement(selectbuyer).click();
		utilities.MinimumWait(driver);
		
		
	}

	public void Click_on_Season_dropdown_and_select_form_dropdown_list() throws Throwable {
		
		utilities.webDriverWait(driver, Season);
		driver.findElement(Season).click();
		utilities.MinimumWait(driver);
		driver.findElement(Selectseason).click();
		utilities.MinimumWait(driver);
		
	}

	public void Click_on_Status_dropdown_and_select_the_status_from_dropdown_list() throws Throwable {
		
		utilities.webDriverWait(driver, Status);
		driver.findElement(Status).click();
		utilities.MinimumWait(driver);
		driver.findElement(Selectstatus).click();
		utilities.MinimumWait(driver);
		
	}

	public void Enter_the_IPO_no_in_search_By_IPO_entry_field() throws Throwable {
		 
		utilities.webDriverWait(driver, SelectIPO);
		driver.findElement(SelectIPO).click();
		utilities.MinimumWait(driver);
		
	}

	public void click_on_Apply_button_and_Reset_button() throws Throwable {
		 
		utilities.webDriverWait(driver, Applybutton);
		driver.findElement(Applybutton).click();
		utilities.MinimumWait(driver);
		
	}

	public void Verify_that_data_is_displaying_in_grids_after_selecting_the_IPO() throws Throwable {
		 
		utilities.webDriverWait(driver, SelectIPO);
		driver.findElement(SelectIPO).click();
		utilities.MinimumWait(driver);
		driver.findElement(SelectIPO).click();	
	}

	public void Click_on_Edit_icon_in_MU_Working_grid() throws Throwable {
		 
		utilities.webDriverWait(driver, Editicon);
		driver.findElement(Editicon).click();
		utilities.MinimumWait(driver);
		
	}

	public void Verify_the_Fabric_Required_is_displaying_the_value_or_not() throws Throwable {
		 
		utilities.webDriverWait(driver, Fabricrequiredqty);
		driver.findElement(Fabricrequiredqty);
		
		utilities.MinimumWait(driver);
		
	}

	public void Enter_the_value_in_Residual_shrinkage() throws Throwable {
		 
		utilities.webDriverWait(driver, Residualshrinkage);
		WebElement Resdualshr = driver.findElement(Residualshrinkage);
		
		if(Resdualshr.isDisplayed()){
			
			Resdualshr.clear();
			Resdualshr.sendKeys("2.5");
		} else {
			driver.findElement(Residualshrinkage).sendKeys("3.32");
			
		}
	}

	public void select_the_process1_by_clicking_on_process1_dropdown_list() throws Throwable {
		
		utilities.webDriverWait(driver, Process1);
		driver.findElement(Process1).click();
		utilities.MinimumWait(driver);
		driver.findElement(Selectprocess1).click();
		utilities.MinimumWait(driver);
		
	}

	public void select_the_process2_by_clicking_on_process2_dropdown_list() throws Throwable {
		 
		utilities.webDriverWait(driver, Process2);
		driver.findElement(Process2).click();
		utilities.MinimumWait(driver);
		driver.findElement(Selectprocess2).click();
		utilities.MinimumWait(driver);
		
	}

	public void verify_the_qty_in_greige_field_whether_value_is_displaying_or_not() throws Throwable {
		 
		utilities.webDriverWait(driver, Greigeqty);
		WebElement GreigeQty = driver.findElement(Greigeqty);
		String qty = GreigeQty.getAttribute("value");
		if(GreigeQty.isDisplayed()) {
			System.out.println("Greige Qty is Displayed:" + qty);
		}else {
			System.out.println("Greige Qty is not displaying");
		}
		
		utilities.MinimumWait(driver);
		
	}

	public void Enter_value_in_MU_for_Process1_entry_field() throws Throwable {
		
		utilities.webDriverWait(driver, Process1MU);
		driver.findElement(Process1MU).clear();
		utilities.MinimumWait(driver);
		
		driver.findElement(Process1MU).sendKeys("2.32");
		utilities.MinimumWait(driver);

	}

	public void Verify_the_process1_value_in_qty_field() throws Throwable {
		 
		utilities.webDriverWait(driver, Process1Qty);
		driver.findElement(Process1Qty);
		WebElement Dqty = driver.findElement(Process1Qty);
		String qty = Dqty.getText();
		if(Dqty.isDisplayed()) {
			System.out.println("Displaying Dyeing process qty" + qty);
		}else {
			System.out.println("Dyeing process qty is not displaying");
		}
		utilities.MinimumWait(driver);
	}

	public void Enter_the_text_in_Print_Type_entry_field() throws Throwable {
		 
		utilities.webDriverWait(driver, PrintType);
		driver.findElement(PrintType).sendKeys("Puma white");
		utilities.MinimumWait(driver);
		
	}

	public void Enter_value_in_MU_for_process2_entry_field() throws Throwable {
		 
		utilities.webDriverWait(driver, Process2MU);
		driver.findElement(Process2MU).clear();
		utilities.MinimumWait(driver);
		
		driver.findElement(Process2MU).sendKeys("3.25");
		utilities.MinimumWait(driver);
		
		
	}

	public void verify_the_process2_value_in_qty_field() throws Throwable {
		 
		utilities.webDriverWait(driver, Process2Qty);
		WebElement Qty = driver.findElement(Process2Qty);
		Qty.getText();
		if(Qty.isDisplayed()) {
			System.out.print("Qty is displaying for Print" + Qty);
		}else {
			System.out.println("Qty is not displaying");
		}
		utilities.MinimumWait(driver);
		
	}

	public void Verify_the_Fabric_Budget_section_is_displaying_the_budget_details_of_Greige_Dyeing_and_Printing_processes_or_not() throws Throwable {
		 
		utilities.webDriverWait(driver, FBGreige);
		WebElement GreigeSec = driver.findElement(FBGreige);
		GreigeSec.getText();
		if(GreigeSec.isDisplayed()) {
			System.out.println("Greige Budget section is displaying");
		}else {
			System.out.println("Greige Budget section is not displaying");
		}
		
		utilities.webDriverWait(driver, FBDyeing);
		WebElement DyeingSec = driver.findElement(FBDyeing);
		DyeingSec.getText();
		if(DyeingSec.isDisplayed()) {
			System.out.println("Dyeing Budget section is displaying");
		}else {
			System.out.println("Dyeing Budget section is not displaying");
		}
		
		utilities.webDriverWait(driver, FBPrinting);
		WebElement PrintingSec = driver.findElement(FBPrinting);
		PrintingSec.getText();
		if(PrintingSec.isDisplayed()) {
			System.out.println("Printing Budget section is displaying");
		}else {
			System.out.println("Printing Budget section is not displaying");
		}
		
	}

	public void Verify_the_quantity_is_displaying_for_Greige_Base_Knitting_qty_field() throws Throwable {
		 
		utilities.webDriverWait(driver, GFqty);
		WebElement GFQty = driver.findElement(GFqty);
		GFQty.getAttribute("value");
		if(GFQty.isDisplayed()) {
			System.out.print("Qty is displaying for Print" + GFQty);
		}else {
			System.out.println("Qty is not displaying");
		}
		utilities.MinimumWait(driver);
		
	}

	public void Enter_the_Rate_for_griege_process() throws Throwable {
		 
		utilities.webDriverWait(driver, GFRate);
		driver.findElement(GFRate).clear();
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, GFRate);
		driver.findElement(GFRate).sendKeys("15.236");
		utilities.MinimumWait(driver);
		
	}

	public void verify_the_conversion_rate_is_autopopulate_and_allows_to_change_the_value_or_not_for_griege_process() throws Throwable {
		 
		utilities.webDriverWait(driver, GFConversionrate);
		driver.findElement(GFConversionrate).clear();
		utilities.MinimumWait(driver);
		
		driver.findElement(GFConversionrate).sendKeys("1.25");
		utilities.MinimumWait(driver);
		
	}

	public void Verify_the_cost_is_displaying_or_not_for_griege_process() throws Throwable {
		 
		utilities.webDriverWait(driver, GFCost);
		driver.findElement(GFCost).getAttribute("value");
		utilities.MinimumWait(driver);
		
	}

	public void Select_the_Fabric_Manager_from_the_dropdown_list_of_Fabric_Manager_field_for_griege_process() throws Throwable {
		 
		utilities.webDriverWait(driver, GFabricManager);
		driver.findElement(GFabricManager).click();
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, SelectGFmanager);
		driver.findElement(SelectGFmanager).click();
		utilities.MinimumWait(driver);
		
		
		
		
		
	}

	public void Fabric_manager_assistants_should_display_based_on_the_selection_of_Fabric_Manager_for_griege_process() throws Throwable {
		 
		utilities.webDriverWait(driver, GFabricManagerAsst);
		driver.findElement(GFabricManagerAsst).click();
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, SelectGFMAsst);
		driver.findElement(SelectGFMAsst).click();
		utilities.MinimumWait(driver);
		
		
	}

	public void Select_Fabric_Executive_from_the_dropdown_list_for_griege_process() throws Throwable {
		 
		utilities.webDriverWait(driver, GExecutive);
		driver.findElement(GExecutive).click();
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, SelectGFExecutive);
		driver.findElement(SelectGFExecutive).click();
		utilities.MinimumWait(driver);
		
	}

	public void Verify_the_quantity_is_displaying_for_Dyeing_qty() throws Throwable {
		 
		utilities.webDriverWait(driver, Dyeingqty);
		WebElement DQty = driver.findElement(Dyeingqty);
		DQty.getAttribute("value");
		if(DQty.isDisplayed()) {
			System.out.print("Qty is displaying for Print" + Dyeingqty);
		}else {
			System.out.println("Qty is not displaying");
		}
		utilities.MinimumWait(driver);
		
	}

	public void Enter_the_Rate_for_Dyeing_process() throws Throwable {
		
		utilities.webDriverWait(driver, DyeingRate);
		driver.findElement(DyeingRate).clear();
		utilities.MinimumWait(driver);
		
		driver.findElement(DyeingRate).sendKeys("5");
		utilities.MinimumWait(driver);
		
	}

	public void verify_the_conversion_rate_is_autopopulate_and_allows_to_change_the_value_or_not_for_Dyeing_process() throws Throwable {
		 
		utilities.webDriverWait(driver, DyeingConversionrate);
		driver.findElement(DyeingConversionrate).clear();
		utilities.MinimumWait(driver);
		
		driver.findElement(DyeingConversionrate).sendKeys("1.2");
		utilities.MinimumWait(driver);
		
		
	}

	public void Verify_the_cost_is_displaying_or_not_for_Dyeing_process() throws Throwable {
		 
		utilities.webDriverWait(driver, Dyeingcost);
		WebElement cost = driver.findElement(Dyeingcost);
		cost.getAttribute("value");
		if(cost.isDisplayed()) {
			System.out.println("Dyeing cost is displaying" + cost);
		}else {
			System.out.println("Dyeing cost is not displaying");
		}
		
	}

	public void Select_the_Fabric_Manager_from_the_dropdown_list_of_Fabric_Manager_field_for_Dyeing_process() throws Throwable {
		 
		utilities.webDriverWait(driver, DyeingFabricManager);
		driver.findElement(DyeingFabricManager).click();
		utilities.MinimumWait(driver);
		
		driver.findElement(SelectDFM).click();
		utilities.MinimumWait(driver);
	}

	public void Fabric_manager_assistants_should_display_based_on_the_selection_of_Fabric_Manager_for_Dyeing_process() throws Throwable {
		
		utilities.webDriverWait(driver, DyeingFabricManagerAsst);
		driver.findElement(DyeingFabricManagerAsst).click();
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, SelectDFMAsst);
		driver.findElement(SelectDFMAsst).click();
		utilities.MinimumWait(driver);
		
	}

	public void Select_Fabric_Executive_from_the_dropdown_list_for_Dyeing_process() throws Throwable {
		 
		utilities.webDriverWait(driver, DyeingFabExecutive);
		driver.findElement(DyeingFabExecutive).click();
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, SelectDFE);
		driver.findElement(SelectDFE).click();
		utilities.MinimumWait(driver);
		
	}

	public void Verify_the_quantity_is_displaying_for_printing_qty() throws Throwable {
		 
		utilities.webDriverWait(driver, Printingqty);
		WebElement print = driver.findElement(Printingqty);
		String qty = print.getAttribute("value");
		if(print.isDisplayed()) {
			System.out.println("Printing Qty is displaying" + print);
		}else {
			System.out.println("Printing Qty is not displaying");
		}
	}

	public void Enter_the_Rate_for_printing_process() throws Throwable {
		 
		utilities.webDriverWait(driver, PrintingRate);
		driver.findElement(PrintingRate).clear();
		utilities.MinimumWait(driver);
		
		driver.findElement(PrintingRate).sendKeys("6");
		utilities.MinimumWait(driver);
		
	}

	public void verify_the_conversion_rate_is_autopopulate_and_allows_to_change_the_value_or_not_for_printing_process() throws Throwable {
		 
		utilities.webDriverWait(driver, PrintingConversionrate);
		driver.findElement(PrintingConversionrate).clear();
		utilities.MinimumWait(driver);
		
		driver.findElement(PrintingConversionrate).sendKeys("1.3");
		utilities.MinimumWait(driver);
		
	}

	public void Verify_the_cost_is_displaying_or_not_for_printing_process() throws Throwable {
		 
		utilities.webDriverWait(driver, Printingcost);
		WebElement cost = driver.findElement(Printingcost);
		cost.getAttribute("value");
		if(cost.isDisplayed()) {
			System.out.println("Printing cost is displaying" + cost);
		}else {
			System.out.println("Printing cost is not displaying");
		}
		
	}

	public void Select_the_Fabric_Manager_from_the_dropdown_list_of_Fabric_Manager_field_for_printing_process() {
		 
		
	}

	public void Fabric_manager_assistants_should_display_based_on_the_selection_of_Fabric_Manager_for_printing_process() {
		 
		
	}

	public void Select_Fabric_Executive_from_the_dropdown_list_for_printing_process() {
		 
		
	}

	public void Verify_the_Freight_budget_details_section_is_displaying_or_not() {
		 
		
	}

	public void Verify_the_quantity_is_displaying_for_greige_dyeing_and_printing_process_or_not() {
		 
		
	}

	public void verify_the_rate_is_displaying_as_zero_for_greige_dyeing_and_printing_process_or_not() {
		 
		
	}

	public void verify_the_conversion_rate_is_displaying_as_zero_for_greige_dyeing_and_printing_process_or_not() {
		 
		
	}

	public void verify_the_cost_is_displaying_as_zero_for_greige_dyeing_and_printing_process_or_not() {
		 
		
	}

	public void Click_on_submit_button_to_save_the_mu_working() {
		 
		
	}

}
