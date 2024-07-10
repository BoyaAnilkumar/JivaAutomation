package Pages;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import util.DriverFactory;
import util.Utilities;

public class NewFabricSheetWorking_page extends DriverFactory {

	Utilities utilities = new Utilities();
	CreatePOforIPO_pages CPFI = new CreatePOforIPO_pages();
	
	By WovenModule 					= By.xpath("//span[text()='Woven / knit']");
	By Fabricsourcing				= By.xpath("//span[text()='Fabric Sourcing ']");
	By GenerateFabricsheet			= By.xpath("//span[text()='Generate Fabric Sheet Working']");
	By NewFabricsheetworking		= By.xpath("//a[text()=' New Fabric Sheet Working ']");
	By Styleexpansion				= By.xpath("//a[@id='sidebarCollapse']");
	By SelectIPO					= By.xpath("//a[text()='Sty070901 / Sty070901']");
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
	By IPOdetails					= By.xpath("//ul[@class='row view-details']");
	By FinalFabricRequired			= By.xpath("//input[@formcontrolname='finalRequredQty']");
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
	By SelectDFMAsst				= By.xpath("//div[@id='a359b4891108-0']");
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
	By Cancelbutton					= By.xpath("//a[@class='btn btn-md btn-danger mr-2']");
	By submitbutton					= By.xpath("//button[@class='btn btn-primary btn-md']");
	
	By SelectShifflyprocess						= By.xpath("//select[@formcontrolname='process1TypeId']/..//option[text()=' Schiffly']");
	By selectNA									= By.xpath("//select[@formcontrolname='process2TypeId']/..//option[text()=' N/A']");
	By EndToEndgreige							= By.xpath("//label[text()=' End To End [Greige Fabric] Thaan Length']/..//input[@formcontrolname='endToEndProcessedThaanLength']");
	By ShifflytoShifflygreige					= By.xpath("//label[text()=' Schiffly To Schiffly [Greige Fabric] Thaan Length']/..//input[@formcontrolname='schifflyToSchifflyProcessedThaanLength']");
	By Numberofpcspermaker						= By.xpath("(//input[@formcontrolname='numberOfPcsPerMarker'])[3]");
	By layerlengthinmarker						= By.xpath("(//input[@formcontrolname='layerLengthInMarker'])[3]");
	By Layerlengthactual						= By.xpath("(//input[@formcontrolname='layerLengthActual'])[3]");
	By NoofPcsinOneThaan						= By.xpath("(//input[@formcontrolname='numberOfPcsInOneThaan'])[3]");
	By FabricUserPerThaan						= By.xpath("(//input[@formcontrolname='fabricUsedPerThaan'])[3]");
	By BalanceFabricPerThaan					= By.xpath("(//input[@formcontrolname='balanceFabricPerThaan'])[3]");
	By NoOfPcsinBalanceFabric					= By.xpath("(//input[@formcontrolname='numberOfPcsToBeMadeInBalanceFabric'])[3]");
	By TotalPcsinOneThaan						= By.xpath("(//input[@formcontrolname='totalNumberOfPcsInOneThaan'])[3]");
	By ThaansRequiredForSchiffly				= By.xpath("(//input[@formcontrolname='numberOfThaansRequiredForSchiffly'])[3]");
	By ThaansRequiredForSchifflyRounded 		= By.xpath("(//input[@formcontrolname='numberOfThaansRequiredForSchifflyRounded'])[3]");
	By numberOfExtraThaans						= By.xpath("(//input[@formcontrolname='numberOfExtraThaans'])[3]");
	By numberOfPcsInExtraThaans					= By.xpath("(//input[@formcontrolname='numberOfPcsInExtraThaans'])[3]");
	By schifflytoschifflyfabricrequired			= By.xpath("(//input[@formcontrolname='schifflytoschifflyfabricrequired'])[3]");
	By greigefabricqtyrequired					= By.xpath("(//input[@formcontrolname='processedfabricqtyrequired'])[3]");
	By addlProcessedtobeorderedduetoendpalla	= By.xpath("(//input[@formcontrolname='addlProcessedtobeorderedduetoendpalla'])[2]");
	By finalprocessedfabricqtyrequired			= By.xpath("(//input[@formcontrolname='finalprocessedfabricqtyrequired'])[2]");
	By Shifflyqty								= By.xpath("(//input[@formcontrolname='schifflyQTY'])[1]");
	By ShifflyRate								= By.xpath("(//input[@formcontrolname='schifflyRate'])[1]");
	By Shifflyconversionrate					= By.xpath("(//input[@formcontrolname='schifflyConversionRate'])[1]");
	By Shifflycost								= By.xpath("(//input[@formcontrolname='schifflyCostInINR'])[1]");
	By ShifflyManager							= By.xpath("//select[@formcontrolname='schifflyFabricManagerId']/..//option[text()=' Lokesh P']");
	By ShifflyAsstManager						= By.xpath("//ng-select[@formcontrolname='schifflyFabricAssistantsId']");
	By Shifflyexecutive							= By.xpath("//select[@formcontrolname='schifflyFabricExecutiveId']");
	

	By Isyarn   								= By.xpath("//input[@formcontrolname='isYarn']");
	By Isknitting  								= By.xpath("//input[@formcontrolname='isKnitting']");
	By Yarntype									= By.xpath("//select[@formcontrolname='yarnTypeId']");
	By selectyarntype 							= By.xpath("//option[text()=' Dyed Yarn']");
	By knitSpinMU								= By.xpath("//input[@formcontrolname='knittingMUPercentage']");
	By Yarnqty									= By.xpath("//input[@formcontrolname='yarnQty']");
	By yarncolor								= By.xpath("//select[@formcontrolname='yarnColorId']");
	By selectyarncolor							= By.xpath("//select[@formcontrolname='yarnColorId']/..//option[text()=' Lilac']");
	By selectotherprocess 						= By.xpath("//select[@formcontrolname='process1TypeId']/..//option[text()=' Other']");
	By EnterOtherProcessName 					= By.xpath("//input[@formcontrolname='otherProcessName']");
	By OtherMuperc								= By.xpath("//input[@formcontrolname='otherMUPercentage']");
	By OtherQty									= By.xpath("//input[@formcontrolname='otherQty']");
	By ProcessName								= By.xpath("//input[@formcontrolname='otherProcessName']");
	By OtherMU 									= By.xpath("//input[@formcontrolname='otherMUPercentage']");
	By Otherprocessqty							= By.xpath("//div[@class='row align-items-end']/..//input[@formcontrolname='otherQty']");
	By OtherFbqty								= By.xpath("//div[@class='card ng-pristine ng-invalid ng-touched']//input[@formcontrolname='otherQty']");
	
	public By DataEntry							= By.xpath("(//span[text()='Data Entry'])[1]");
	By SaleSelectprocess1						= By.xpath("//select[@formcontrolname='process1TypeId']/..//option[text()=' N/A']");
	By salefabricqty							= By.xpath("//label[text()=' Sale Fabric Qty']/..//input[@formcontrolname='saleFabricQTY']");
	By Fabricbudgetqty							= By.xpath("//label[text()='Qty ']/..//input[@formcontrolname='saleFabricQTY']");
	By Salefabricrate							= By.xpath("//label[text()='Rate ']/..//input[@formcontrolname='saleFabricRate']");
	By Saleconversionrate						= By.xpath("//label[text()='Conversion Rate ']/..//input[@formcontrolname='saleFabricConversionRate']");
	By SaleFabricbudgetCost						= By.xpath("(//input[@formcontrolname='saleFabricCostInINR'])[1]");
	By SaleFabricfreightcost					= By.xpath("(//input[@formcontrolname='saleFabricCostInINR'])[2]");
	By SaleFabricManager						= By.xpath("//select[@formcontrolname='saleFabricManagerId']");
	By Select_SaleFabricManager					= By.xpath("//select[@formcontrolname='saleFabricManagerId']/..//option[text()=' Lokesh P']");
	By SaleFabricManagerassistant				= By.xpath("//ng-select[@formcontrolname='saleFabricAssistantsId']");
	By Select_SaleFabricmanagerasst				= By.xpath("//span[text()='Anil Kumar']");
	By Fabricexecutive							= By.xpath("//select[@formcontrolname='saleFabricExecutiveId']");
	By Select_FabricExecutive					= By.xpath("//select[@formcontrolname='saleFabricExecutiveId']/..//option[text()=' Nikhil']");
	By SaleFreightqty							= By.xpath("//label[text()='Qty']/..//input[@formcontrolname='saleFabricQTY']");
	By SaleFreigthRate							= By.xpath("//label[text()='Rate']/..//input[@formcontrolname='saleFabricRate']");
	By SaleFreigthConvRate						= By.xpath("//label[text()='Conversion Rate ']/..//input[@formcontrolname='saleFabricCurrency']");
	By SaleFreigthCost							= By.xpath("(//label[text()='Cost']/..//input[@formcontrolname='saleFabricCostInINR'])[2]");
	By toastermessage							= By.xpath("//h2[text()='Fabric Order Sheet Saved Successfully']");
	
	By Basefabriccheckbox						= By.xpath("//input[@formcontrolname='isBaseFabric']");
	By Basecolor								= By.xpath("//select[@formcontrolname='baseFabricColorId']");
	By SelectBaseColor							= By.xpath("//select[@formcontrolname='baseFabricColorId']/..//option[text()=' Green']");
	By BaseFabricQty							= By.xpath("//label[text()='Base Fabric Qty']/..//input[@formcontrolname='greigeBaseFabricReq']");
	By BaseFabricbudgetqty						= By.xpath("//label[text()='Base Fabric Qty']/..//input[@formcontrolname='greigeBaseQTY']");
	By BaseFabricrate							= By.xpath("//label[text()='Rate ']/..//input[@formcontrolname='greigeBaseFabricRate']");
	By BaseFabricConversionrate					= By.xpath("//label[text()='Conversion Rate ']/..//input[@formcontrolname='greigeBaseFabricConversionRate']");
	By BaseFabriccost							= By.xpath("//label[text()='Cost ']/..//input[@formcontrolname='greigeBaseFabricCostInINR']");
	By BaseFabricManager						= By.xpath("//select[@formcontrolname='greigeBaseFabricManagerId']");
	By Select_BaseFabricManager					= By.xpath("//select[@formcontrolname='greigeBaseFabricManagerId']/.//option[text()=' Anil Singh']");
	By BaseFabricManagerAssist					= By.xpath("//ng-select[@formcontrolname='greigeBaseFabricAssistantsId']");
	By Select_BaseFabricManagerAssist			= By.xpath("//span[text()='Sanjeev Kumar']");
	By BaseFabricExecutive						= By.xpath("//select[@formcontrolname='greigeBaseFabricExecutiveId']");
	By Select_BaseFabricExecutive				= By.xpath("//select[@formcontrolname='greigeBaseFabricExecutiveId']/..//option[text()=' Anil Kumar']");
	
	
	
	
	
	
	
	public void navigate_to_New_Fabric_Sheet_working_screen() throws Throwable {
		
		 utilities.webDriverWait(driver, WovenModule);
		 driver.findElement(WovenModule).click();
		 utilities.MinimumWait(driver);
		 
		 utilities.webDriverWait(driver, Fabricsourcing);
		 driver.findElement(Fabricsourcing).click();
		 utilities.MinimumWait(driver);
		 
		 utilities.webDriverWait(driver, DataEntry);
		 driver.findElement(DataEntry).click();
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
		utilities.webDriverWait(driver, Styleexpansion);
		driver.findElement(Styleexpansion).click();
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
		 
		utilities.webDriverWait(driver, IPOdetails);
		WebElement IPO = driver.findElement(IPOdetails);
				String Details	= IPO.getText();
				System.out.println("Display IPO details: " + Details);
				utilities.MinimumWait(driver);

		
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
			System.out.println("Greige Qty is Displayed: " + qty);
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
		String Process1qty = Dqty.getAttribute("value");
		if(Dqty.isDisplayed()) {
			System.out.println("Displaying Dyeing process qty " + Process1qty);
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
		String Quantity = Qty.getAttribute("value");
		if(Qty.isDisplayed()) {
			System.out.print("Qty is displaying for Print " + Quantity);
		}else {
			System.out.println("Qty is not displaying");
		}
		utilities.MinimumWait(driver);
		
	}

	public void Verify_the_Fabric_Budget_section_is_displaying_the_budget_details_of_Greige_Dyeing_and_Printing_processes_or_not() throws Throwable {
		 
		utilities.webDriverWait(driver, FBGreige);
		WebElement GreigeSec = driver.findElement(FBGreige);
		String Greigequantity = GreigeSec.getAttribute("value");
		if(GreigeSec.isDisplayed()) {
			System.out.println("Greige Budget section is displaying " + Greigequantity);
		}else {
			System.out.println("Greige Budget section is not displaying");
		}
		
		
		WebElement GreigeQty = driver.findElement(Greigeqty);
		String qty = GreigeQty.getAttribute("value");
		if(qty.equals(Greigequantity)) {
			 System.out.println("Values of GreigeQty and GreigeSec are the same: " + GreigeQty);
		}else {
            System.out.println("Values of GreigeQty and GreigeSec are different.");
            
        }
		
		
		
		utilities.webDriverWait(driver, FBDyeing);
		WebElement DyeingSec = driver.findElement(FBDyeing);
		DyeingSec.getAttribute("value");
		if(DyeingSec.isDisplayed()) {
			System.out.println("Dyeing Budget section is displaying ");
		}else {
			System.out.println("Dyeing Budget section is not displaying");
		}
		
		utilities.webDriverWait(driver, FBPrinting);
		WebElement PrintingSec = driver.findElement(FBPrinting);
		PrintingSec.getAttribute("value");
		if(PrintingSec.isDisplayed()) {
			System.out.println("Printing Budget section is displaying ");
		}else {
			System.out.println("Printing Budget section is not displaying");
		}
	
	}

	public void Verify_the_quantity_is_displaying_for_Greige_Base_Knitting_qty_field() throws Throwable {
		 
		utilities.webDriverWait(driver, GFqty);
		WebElement GFQty = driver.findElement(GFqty);
		String GreigeFabric = GFQty.getAttribute("value");
		if(GFQty.isDisplayed()) {
			System.out.print("Qty is displaying for Print " + GreigeFabric);
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
		String DyeingQuantity = DQty.getAttribute("value");
		if(DQty.isDisplayed()) {
			System.out.print("Qty is displaying for Print " + DyeingQuantity);
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
		String Dyeingcost = cost.getAttribute("value");
		if(cost.isDisplayed()) {
			System.out.println("Dyeing cost is displaying " + Dyeingcost);
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
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_1);
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
		String Printquantity = 	print.getAttribute("value");
		if(print.isDisplayed()) {
			System.out.println("Printing Qty is displaying " + Printquantity);
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
		
		String Printcost = cost.getAttribute("value");
		if(cost.isDisplayed()) {
			System.out.println("Printing cost is displaying " + Printcost);
		}else {
			System.out.println("Printing cost is not displaying");
		}
		
		
		
	}

	public void Select_the_Fabric_Manager_from_the_dropdown_list_of_Fabric_Manager_field_for_printing_process() throws Throwable {
		 
		utilities.webDriverWait(driver, PrintingFabricManager);
		driver.findElement(PrintingFabricManager).click();
		utilities.MinimumWait(driver);
		
		driver.findElement(SelectPFM).click();
		utilities.MinimumWait(driver);
		
	}

	public void Fabric_manager_assistants_should_display_based_on_the_selection_of_Fabric_Manager_for_printing_process() throws Throwable {
		 
		utilities.webDriverWait(driver, PrintingFabricManagerAsst);
		driver.findElement(PrintingFabricManagerAsst).click();
		utilities.MinimumWait(driver);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_1);
		utilities.MinimumWait(driver);
		
	}

	public void Select_Fabric_Executive_from_the_dropdown_list_for_printing_process() throws Throwable {
		 
		utilities.webDriverWait(driver, PrintingFabricExecutive);
		driver.findElement(PrintingFabricExecutive).click();
		utilities.MinimumWait(driver);
		
		driver.findElement(SelectPFE).click();
		utilities.MinimumWait(driver);
		
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

	public void Click_on_submit_button_to_save_the_mu_working() throws Throwable {
		 
		utilities.webDriverWait(driver, submitbutton);
		driver.findElement(submitbutton).click();
		utilities.MinimumWait(driver);
		
		
		
	}
	
	public void select_the_process1_as_Shiffly_process() throws Throwable {
		utilities.webDriverWait(driver, Process1);
		driver.findElement(Process1).click();
		utilities.MinimumWait(driver);
		driver.findElement(SelectShifflyprocess).click();
		utilities.MinimumWait(driver);
	}	
	public void select_the_process2_as_NA() throws Throwable {
		utilities.webDriverWait(driver, Process2);
		driver.findElement(Process2).click();
		utilities.MinimumWait(driver);
		driver.findElement(selectNA).click();
		utilities.MinimumWait(driver);
		}
		
	

	public void Enter_the_data_in_Shiffly_process_section_fields() throws Throwable {
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 500);");
		
        utilities.webDriverWait(driver, EndToEndgreige);
		driver.findElement(EndToEndgreige).click();
		driver.findElement(EndToEndgreige).clear();
		driver.findElement(EndToEndgreige).sendKeys("68");
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, ShifflytoShifflygreige);
		driver.findElement(ShifflytoShifflygreige).click();
		driver.findElement(ShifflytoShifflygreige).clear();
		driver.findElement(ShifflytoShifflygreige).sendKeys("59");
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Numberofpcspermaker);
		driver.findElement(Numberofpcspermaker).click();
		driver.findElement(Numberofpcspermaker).clear();
		driver.findElement(Numberofpcspermaker).sendKeys("55");
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, layerlengthinmarker);
		driver.findElement(layerlengthinmarker).click();
		driver.findElement(layerlengthinmarker).clear();
		driver.findElement(layerlengthinmarker).sendKeys("50");
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Layerlengthactual);
		driver.findElement(Layerlengthactual).click();
		WebElement LLA = driver.findElement(Layerlengthactual);
		String layerlength = LLA.getAttribute("value");
		System.out.println("Displaying Layerlength actual " + layerlength);
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, NoofPcsinOneThaan);
		driver.findElement(NoofPcsinOneThaan).click();
		WebElement PinOneThaan = driver.findElement(NoofPcsinOneThaan);
		String onethaan = PinOneThaan.getAttribute("value");
		System.out.println("Displaying Pieces in one thaan " + onethaan);
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, FabricUserPerThaan);
		driver.findElement(FabricUserPerThaan).click();
		WebElement Fabricperthaan = driver.findElement(FabricUserPerThaan);
		String fabricthaan = Fabricperthaan.getAttribute("value");
		System.out.println("Displaying Fabric Per Thaan " + fabricthaan);
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, BalanceFabricPerThaan);
		driver.findElement(BalanceFabricPerThaan).click();
		WebElement Balancefabricthaan = driver.findElement(BalanceFabricPerThaan);
		String balancethaan = Balancefabricthaan.getAttribute("value");
		System.out.println("Displaying Balance Fabric Per Thaan " + balancethaan);
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, NoOfPcsinBalanceFabric);
		driver.findElement(NoOfPcsinBalanceFabric).click();
		driver.findElement(NoOfPcsinBalanceFabric).clear();
		driver.findElement(NoOfPcsinBalanceFabric).sendKeys("45");
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, TotalPcsinOneThaan);
		driver.findElement(TotalPcsinOneThaan).click();
		WebElement Totalpcsinthaan = driver.findElement(TotalPcsinOneThaan);
		String ThaanTotal = Totalpcsinthaan.getAttribute("value");
		System.out.println("Displaying Total pcs in one thaan " + ThaanTotal);
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, ThaansRequiredForSchiffly);
		driver.findElement(ThaansRequiredForSchiffly).click();
		WebElement RequiredforShiffly = driver.findElement(ThaansRequiredForSchiffly);
		String Schiffly = RequiredforShiffly.getAttribute("value");
		System.out.println("Displaying Thaans Required for shiffly " + Schiffly);
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, ThaansRequiredForSchifflyRounded);
		driver.findElement(ThaansRequiredForSchifflyRounded).click();
		WebElement RequiredforShifflyrounded = driver.findElement(ThaansRequiredForSchifflyRounded);
		String Schifflyrounded = RequiredforShifflyrounded.getAttribute("value");
		System.out.println("Displaying Thaans Required for Shiffly Rounded " + Schifflyrounded);
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, numberOfExtraThaans);
		driver.findElement(numberOfExtraThaans).click();
		driver.findElement(numberOfExtraThaans).clear();
		driver.findElement(numberOfExtraThaans).sendKeys("35");
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, numberOfPcsInExtraThaans);
		driver.findElement(numberOfPcsInExtraThaans).click();
		WebElement NoOfPcsinextrathaans = driver.findElement(numberOfPcsInExtraThaans);
		String extrathaans = NoOfPcsinextrathaans.getAttribute("value");
		System.out.println("Displaying no of pcs in extra thaans " + extrathaans);
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, schifflytoschifflyfabricrequired);
		driver.findElement(schifflytoschifflyfabricrequired).click();
		WebElement StoSfabricreq = driver.findElement(schifflytoschifflyfabricrequired);
		String StoSfabric = StoSfabricreq.getAttribute("value");
		System.out.println("Displaying shiffly to shiffly fabric required " + StoSfabric);
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver,greigefabricqtyrequired );
		driver.findElement(greigefabricqtyrequired).click();
		WebElement GreigeFabric = driver.findElement(greigefabricqtyrequired);
		String GFabReq = GreigeFabric.getAttribute("value");
		System.out.println("Displaying Griege Fabric Qty Required " + GFabReq);
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, addlProcessedtobeorderedduetoendpalla);
		driver.findElement(addlProcessedtobeorderedduetoendpalla).click();
		driver.findElement(addlProcessedtobeorderedduetoendpalla).sendKeys("5");
		utilities.MinimumWait(driver);
		driver.findElement(addlProcessedtobeorderedduetoendpalla).click();
		WebElement orderdue = driver.findElement(addlProcessedtobeorderedduetoendpalla);
		String orderduetoendpalla = orderdue.getAttribute("value");
		System.out.println("Displaying Addl Processed to be ordered due to end palla " + orderduetoendpalla);
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, finalprocessedfabricqtyrequired);
		driver.findElement(finalprocessedfabricqtyrequired).click();
		WebElement finalqty = driver.findElement(finalprocessedfabricqtyrequired);
		String finalfabricqty = finalqty.getAttribute("value");
		System.out.println("Displaying Final Processes Fabric Qty Requried " + finalfabricqty);
		utilities.MinimumWait(driver);
	}

	



	public void Enter_Fabric_Budget_details_for_greige_process() throws Throwable {
		
		utilities.webDriverWait(driver, GFqty);
		driver.findElement(GFqty).click();
		WebElement greigefabricqty = driver.findElement(GFqty);
		String GfabricQ = greigefabricqty.getAttribute("value");
		System.out.println("Displaying Greige Fabric Quantity " + GfabricQ);
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, GFRate);
		driver.findElement(GFRate).click();
		driver.findElement(GFRate).clear();
		driver.findElement(GFRate).click();
		driver.findElement(GFRate).sendKeys("10");
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, GFConversionrate);
		driver.findElement(GFConversionrate).click();
		driver.findElement(GFConversionrate).clear();
		driver.findElement(GFConversionrate).click();
		driver.findElement(GFConversionrate).sendKeys("2.5");
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, GFCost);
		driver.findElement(GFCost).click();
		WebElement greigecost = driver.findElement(GFCost);
		String greigefabriccost = greigecost.getAttribute("value");
		System.out.println("Displaying Greige Fabric Cost " + greigefabriccost);
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, GFabricManager);
		driver.findElement(GFabricManager).click();
		driver.findElement(SelectGFmanager).click();
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, GFabricManagerAsst);
		driver.findElement(GFabricManagerAsst).click();
		driver.findElement(SelectGFMAsst).click();
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, GExecutive);
		driver.findElement(GExecutive).click();
		driver.findElement(SelectGFExecutive).click();
		utilities.MinimumWait(driver);
		
	}

	public void Enter_Fabric_Budget_details_for_Shiffly_process() throws Throwable {
		utilities.webDriverWait(driver, Shifflyqty);
		driver.findElement(Shifflyqty).click();
		WebElement shifflyfabricqty = driver.findElement(Shifflyqty);
		String SfabricQ = shifflyfabricqty.getAttribute("value");
		System.out.println("Displaying Shiffly Fabric Quantity " + SfabricQ);
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, ShifflyRate);
		driver.findElement(ShifflyRate).click();
		driver.findElement(ShifflyRate).clear();
		driver.findElement(ShifflyRate).click();
		driver.findElement(ShifflyRate).sendKeys("10");
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Shifflyconversionrate);
		driver.findElement(Shifflyconversionrate).click();
		driver.findElement(Shifflyconversionrate).clear();
		driver.findElement(Shifflyconversionrate).click();
		driver.findElement(Shifflyconversionrate).sendKeys("2.5");
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Shifflycost);
		driver.findElement(Shifflycost).click();
		WebElement shifflycost = driver.findElement(Shifflycost);
		String shifflyfabriccost = shifflycost.getAttribute("value");
		System.out.println("Displaying Greige Fabric Cost " + shifflyfabriccost);
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, ShifflyManager);
		driver.findElement(ShifflyManager).click();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, ShifflyAsstManager);
		driver.findElement(ShifflyAsstManager).click();
		Robot r1 = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Shifflyexecutive);
		driver.findElement(Shifflyexecutive).click();
		Robot r2 = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		utilities.MinimumWait(driver);
		
	}

	public void click_on_yarn_working_checkbox() throws Throwable {

		utilities.webDriverWait(driver, Isyarn);
		driver.findElement(Isyarn).click();
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Isknitting);
		driver.findElement(Isknitting).click();
		utilities.MinimumWait(driver);

		
		utilities.webDriverWait(driver, Residualshrinkage);
		driver.findElement(Residualshrinkage).click();
		driver.findElement(Residualshrinkage).sendKeys("7.25");
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Isyarn);
		driver.findElement(Isyarn).click();
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Isknitting);
		driver.findElement(Isknitting).click();
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Yarntype);
		driver.findElement(Yarntype).click();
		utilities.MinimumWait(driver);
				
	}

	public void Select_Yarn_Type() throws Throwable {

		utilities.webDriverWait(driver,Yarntype );
		driver.findElement(selectyarntype).click();
		utilities.MinimumWait(driver);
		

		utilities.webDriverWait(driver, selectyarntype);
		driver.findElement(selectyarntype).click();
		utilities.MinimumWait(driver);
		
	}

	public void Enter_value_in_knitting_and_Spinning_MU() throws Throwable {

		utilities.webDriverWait(driver, knitSpinMU );
		driver.findElement(knitSpinMU).sendKeys("5.23");
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver,Yarnqty );
		driver.findElement(Yarnqty).click();
		WebElement YarnQty = driver.findElement(Yarnqty);
		String Yarnworkingqty = YarnQty.getAttribute("value");
		System.out.println("Displaying Yarn Qty :" + Yarnworkingqty);
		
		utilities.webDriverWait(driver,yarncolor);
		driver.findElement(yarncolor).click();
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, selectyarncolor);
		driver.findElement(selectyarncolor).click();
		utilities.MinimumWait(driver);
		
		
		utilities.webDriverWait(driver, knitSpinMU);
		driver.findElement(knitSpinMU).click();
		driver.findElement(knitSpinMU).clear();
		driver.findElement(knitSpinMU).sendKeys("5");
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Yarnqty);
		driver.findElement(Yarnqty).click();
		WebElement YarnqQty = driver.findElement(Yarnqty);
		String YarnQuantity = YarnQty.getAttribute("Value");
		System.out.println("Yarn Quantity is displaying:  " +  YarnQuantity);
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, yarncolor);
		driver.findElement(yarncolor).click();
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, selectyarncolor);
		driver.findElement(selectyarncolor).click();
		utilities.MinimumWait(driver);
		
	}

	public void verify_the_text_in_Other_Process_name_text_field() throws Throwable {
		
		utilities.webDriverWait(driver,Process1);
		driver.findElement(Process1).click();
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver,selectotherprocess);
		driver.findElement(selectotherprocess).click();
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Process2);
		driver.findElement(Process2).click();
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Selectprocess2);
		driver.findElement(Selectprocess2).click();
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Greigeqty);
		driver.findElement(Greigeqty).click();
		WebElement GRQty = driver.findElement(Greigeqty);
		String Greigequantity = GRQty.getAttribute("value");
		System.out.println("Displaying greige qty :" + Greigequantity);
		utilities.MinimumWait(driver);
		utilities.webDriverWait(driver, Process1);
		driver.findElement(Process1).click();
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, selectotherprocess);
		driver.findElement(selectotherprocess).click();
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Process2);
		driver.findElement(Process2).click();
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, selectNA);
		driver.findElement(selectNA).click();
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Greigeqty);
		driver.findElement(Greigeqty).click();
		WebElement GreigeQty = driver.findElement(Greigeqty);
		String GQuantity = GreigeQty.getAttribute("value");
		System.out.println("Greige Quantity is displaying:  " +  GQuantity);
		utilities.MinimumWait(driver);
				
	}

	public void Enter_the_value_in_MU_percentage_field() throws Throwable {
		
		utilities.webDriverWait(driver, EnterOtherProcessName);
		driver.findElement(EnterOtherProcessName).clear();
		utilities.MinimumWait(driver);
		driver.findElement(EnterOtherProcessName).sendKeys("Special Design");
		
		utilities.webDriverWait(driver, OtherMuperc);
		driver.findElement(OtherMuperc).click();
		driver.findElement(OtherMuperc).clear();
		driver.findElement(OtherMuperc).sendKeys("6.32");
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, OtherQty);
		driver.findElement(OtherQty).click();
		WebElement OtherQuantity = driver.findElement(OtherQty);
		String OtherQuantityP	= OtherQuantity.getAttribute("value");
		System.out.println("Displaying Other Process Qty :" + OtherQuantityP);
	}

	public void Enter_Fabric_Budget_details_for_Yarn_process() {
		

		
	}

	public void Enter_Fabric_Budget_details_for_knitting_and_spinning_process() {
		
		
	}

	public void Enter_Fabric_Budget_details_for_Other_process() {
		
		
	}

	public void select_the_process1_as_NA() throws Throwable {
		utilities.webDriverWait(driver, Process1);
		driver.findElement(Process1).click();
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, SaleSelectprocess1);
		driver.findElement(SaleSelectprocess1).click();
		utilities.MinimumWait(driver);
		
		
	}

	public void verify_the_qty_in_sale_fabric_qty_field_whether_value_is_displaying_or_not() throws Throwable {
		utilities.webDriverWait(driver, salefabricqty);
		driver.findElement(salefabricqty).click();
		WebElement FabricQTY = driver.findElement(salefabricqty);
		String saleqty = FabricQTY.getAttribute("value");
		System.out.println("Display the sale fabric qty: " + saleqty);
		utilities.MinimumWait(driver);
		
		driver.findElement(FinalFabricRequired).click();
		WebElement FinalQty = driver.findElement(FinalFabricRequired);
		String finalfabqty = FinalQty.getAttribute("value");
		System.out.println("Display the Final Fabric Required Qty:  " + finalfabqty);
		utilities.MinimumWait(driver);
		
		if(saleqty.equals(finalfabqty)) {
			System.out.println("Final Fabric Qty is same as sale fabric qty::  "  +  finalfabqty);
		}else {
			System.out.println("Final Fabric Qty is not equal to sale fabric qty::  " +  saleqty);
		}
		utilities.MinimumWait(driver);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;  //To scroll the page
		js.executeScript("scrollBy(0, 500)");

	}

	public void Enter_Fabric_Budget_details_for_Sale_process() throws Throwable {
		utilities.webDriverWait(driver, Fabricbudgetqty);
		driver.findElement(Fabricbudgetqty).click();
		WebElement SaleFabric = driver.findElement(Fabricbudgetqty);
		String saleqty = SaleFabric.getAttribute("value");
		System.out.println("Display the sale fabric budget qty: " + saleqty);
		System.out.println("");
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Salefabricrate);
		driver.findElement(Salefabricrate).click();
		utilities.MinimumWait(driver);
		driver.findElement(Salefabricrate).clear();
		utilities.MinimumWait(driver);
		driver.findElement(Salefabricrate).sendKeys("12");
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Saleconversionrate);
		driver.findElement(Saleconversionrate).click();
		utilities.MinimumWait(driver);
		driver.findElement(Saleconversionrate).clear();
		utilities.MinimumWait(driver);
		driver.findElement(Saleconversionrate).sendKeys("2");
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, SaleFabricbudgetCost);
		driver.findElement(SaleFabricbudgetCost).click();
		WebElement Salecost = driver.findElement(SaleFabricbudgetCost);
		String Salefabriccost = Salecost.getAttribute("value");
		System.out.println("Display the sale fabric budget cost: " + Salefabriccost);
		System.out.println("");
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, SaleFabricManager);
		driver.findElement(SaleFabricManager).click();
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Select_SaleFabricManager);
		driver.findElement(Select_SaleFabricManager).click();
		WebElement fabricmanager = driver.findElement(Select_SaleFabricManager);
		String selectmanager = fabricmanager.getText();
		System.out.println("Display selected sale fabric manager: " + selectmanager);
		System.out.println("");
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, SaleFabricManagerassistant);
		driver.findElement(SaleFabricManagerassistant).click();
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Select_SaleFabricmanagerasst);
		driver.findElement(Select_SaleFabricmanagerasst).click();
		WebElement Fabricmanagerassist = driver.findElement(Select_SaleFabricmanagerasst);
		String Assistant = Fabricmanagerassist.getText();
		System.out.println("Display selected sale fabric manager assistant:  " + Assistant);
		System.out.println("");
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Fabricexecutive);
		driver.findElement(Fabricexecutive).click();
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Select_FabricExecutive);
		driver.findElement(Select_FabricExecutive).click();
		WebElement FabricExecutive = driver.findElement(Select_FabricExecutive);
		String Executive = FabricExecutive.getText();
		System.out.println("Display selected fabric executive: " + Executive);
		System.out.println("");
		utilities.MinimumWait(driver);
		
	}

	public void Enter_Freight_Budget_details_for_Sale_process() throws Throwable {
		utilities.webDriverWait(driver, SaleFreightqty);
		driver.findElement(SaleFreightqty).click();
		WebElement freightqty = driver.findElement(SaleFreightqty);
		String qty = freightqty.getAttribute("value");
		System.out.println("Display sale Frieght qty: " + qty);
		System.out.println("");
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, SaleFreigthRate);
		driver.findElement(SaleFreigthRate).click();
		utilities.MinimumWait(driver);
		driver.findElement(SaleFreigthRate).clear();
		utilities.MinimumWait(driver);
		driver.findElement(SaleFreigthRate).sendKeys("3");
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, SaleFreigthConvRate);
		driver.findElement(SaleFreigthConvRate).click();
		utilities.MinimumWait(driver);
		driver.findElement(SaleFreigthConvRate).clear();
		utilities.MinimumWait(driver);
		driver.findElement(SaleFreigthConvRate).sendKeys("1.2");
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, SaleFreigthCost);
		driver.findElement(SaleFreigthCost).click();
		WebElement freightcost = driver.findElement(SaleFreigthCost);
		String cost = freightcost.getAttribute("value");
		System.out.println("Display sale Frieght cost: " + cost);
		System.out.println("");
		utilities.MinimumWait(driver);
		
		
		
	}

	public void click_on_Base_Fabric_process_checkbox() throws Throwable {
		utilities.webDriverWait(driver, Basefabriccheckbox);
		driver.findElement(Basefabriccheckbox).click();
		utilities.MinimumWait(driver);
		
		
	}

	public void select_the_color_for_base_fabric() throws Throwable {
		utilities.webDriverWait(driver, Basecolor);
		driver.findElement(Basecolor).click();
		utilities.MinimumWait(driver);
		
		driver.findElement(SelectBaseColor).click();
		utilities.MinimumWait(driver);
		
	}

	public void verify_the_base_fabric_qty_is_displaying_as_same_as_the_final_fabric_req_or_not() throws Throwable {
		utilities.webDriverWait(driver, BaseFabricQty);
		driver.findElement(BaseFabricQty).click();
		WebElement fabricqty = driver.findElement(BaseFabricQty);
		String BaseFabric	= fabricqty.getAttribute("value");
		System.out.println("display base fabric qty: "  + BaseFabric);
		System.out.println("");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,500)");
	
	}

	

	public void Enter_mu_percentage_for_dyeing_process() throws Throwable {
		utilities.webDriverWait(driver, Process1MU);
		driver.findElement(Process1MU).click();
		utilities.MinimumWait(driver);
		driver.findElement(Process1MU).clear();
		utilities.MinimumWait(driver);
		driver.findElement(Process1MU).sendKeys("4");
		utilities.MinimumWait(driver);
		
//		driver.findElement(BaseFabricQty).click();
		WebElement fabricqty = driver.findElement(BaseFabricQty);
		String BaseFabric	= fabricqty.getAttribute("value");
		System.out.println("display base fabric qty: "  + BaseFabric);
		System.out.println("");
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Process1Qty);
		driver.findElement(Process1Qty).click();
		WebElement process1 = driver.findElement(Process1Qty);
		String p1q	= process1.getAttribute("value");
		System.out.println("display Process1 qty: "  + p1q);
		System.out.println("");
		utilities.MinimumWait(driver);
		
	}

	public void Enter_Print_Type_date_for_printing_process() throws Throwable {
		utilities.webDriverWait(driver, PrintType);
		driver.findElement(PrintType).sendKeys("Blue");
		utilities.MinimumWait(driver);
		
		
		
		
	}

	public void Enter_mu_percentage_for_printing_process() throws Throwable {
		utilities.webDriverWait(driver, Process2MU);
		driver.findElement(Process2MU).click();
		driver.findElement(Process2MU).clear();
		driver.findElement(Process2MU).sendKeys("3.25");
		System.out.println("");
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Process2Qty);
		driver.findElement(Process2Qty).click();
		WebElement Process2 = driver.findElement(Process2Qty);
		String P2Q = Process2.getAttribute("value");
		System.out.println("Displaying the Process2:  " + P2Q);
		System.out.println("");
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, BaseFabricQty);
		driver.findElement(BaseFabricQty).click();
		WebElement fabricqty = driver.findElement(BaseFabricQty);
		String BaseFabric	= fabricqty.getAttribute("value");
		System.out.println("display base fabric qty: "  + BaseFabric);
		System.out.println("");
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Process1Qty);
		driver.findElement(Process1Qty).click();
		WebElement process1 = driver.findElement(Process1Qty);
		String p1q	= process1.getAttribute("value");
		System.out.println("display Process1 qty: "  + p1q);
		System.out.println("");
		utilities.MinimumWait(driver);
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,-500)");
		 utilities.MediumWait(driver);
		driver.findElement(FinalFabricRequired).click();
		WebElement FinalQty = driver.findElement(FinalFabricRequired);
		String finalfabqty = FinalQty.getAttribute("value");
		
		//Verifying that Base Fabric qty and Final Fabric qty are equal or not
		if(BaseFabric.equals(finalfabqty)) {
			System.out.println("Base Fabric qty and Final Fabric qty are equal");
			System.out.println("");
			System.out.println("Base Fabric Qty- " + BaseFabric + "  Final Fabric Qty- " + finalfabqty);
			System.out.println("");
		}else {
			System.out.println("Base Fabric qty and Final Fabric qty are not equal");
			System.out.println("");
			System.out.println("Base Fabric Qty- " + BaseFabric + "  Final Fabric Qty- " + finalfabqty);
			System.out.println("");
		}
		
		//Verifying that Dyeing process qty and Final Fabric qty are equal or not
		if(p1q.equals(finalfabqty)) {
			System.out.println("Dyeing process qty and Final Fabric qty are equal");
			System.out.println("");
			System.out.println("Dyeing Process Qty- " + p1q + "  Final Fabric Qty- " + finalfabqty);
			System.out.println("");
		}else {
			System.out.println("Dyeing process qty and Final Fabric qty are not equal");
			System.out.println("");
			System.out.println("Dyeing Process Qty- " + p1q + "  Final Fabric Qty- " + finalfabqty);
			System.out.println("");
		}
		
		//Verifying that Printing process qty and final fabric qty are equal or not
		if(P2Q.equals(finalfabqty)) {
			System.out.println("Printing process qty and Final Fabric qty are equal");
			System.out.println("");
			System.out.println("Printing Process Qty- " + P2Q + "   Final Fabric Qty- " + finalfabqty);
			System.out.println("");
		}else {
			System.out.println("Printing process qty and Final Fabric qty are not equal");
			System.out.println("");
			System.out.println("Printing Process Qty- " + P2Q + "  Final Fabric Qty- " + finalfabqty);
			System.out.println("");
		}
		
		utilities.MediumWait(driver);
		
	}

	public void verify_the_Fabric_Budget_details_for_the_processes() throws Throwable {
		utilities.webDriverWait(driver, BaseFabricbudgetqty);
		driver.findElement(BaseFabricbudgetqty).click();
		WebElement BaseFabric = driver.findElement(BaseFabricbudgetqty);
		String Baseqty = BaseFabric.getAttribute("value");
		System.out.println("print base fabric budget qty- " +  Baseqty);
		System.out.println("");
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, BaseFabricrate);
		driver.findElement(BaseFabricrate).click();
		driver.findElement(BaseFabricrate).clear();
		utilities.MinimumWait(driver);
		
		driver.findElement(BaseFabricrate).sendKeys("8.45");
		utilities.MinimumWait(driver);
		
		driver.findElement(BaseFabricConversionrate).click();
		utilities.MinimumWait(driver);
		driver.findElement(BaseFabricConversionrate).clear();
		utilities.MinimumWait(driver);
		driver.findElement(BaseFabricConversionrate).sendKeys("0.55");
		utilities.MinimumWait(driver);
		
		String elementvalue = driver.findElement(BaseFabriccost).getAttribute("value");
		System.out.println("Print =  " + elementvalue);
		utilities.MinimumWait(driver);
		
		driver.findElement(BaseFabricManager).click();
		utilities.MediumWait(driver);
		driver.findElement(Select_BaseFabricManager).click();
		utilities.MinimumWait(driver);
		
		driver.findElement(BaseFabricManagerAssist).click();
		utilities.MinimumWait(driver);
		driver.findElement(Select_BaseFabricManagerAssist).click();
		utilities.MinimumWait(driver);
		
		driver.findElement(BaseFabricExecutive).click();
		utilities.MinimumWait(driver);
		driver.findElement(Select_BaseFabricExecutive).click();
		utilities.MinimumWait(driver);
		
		
		
		
	}

}
