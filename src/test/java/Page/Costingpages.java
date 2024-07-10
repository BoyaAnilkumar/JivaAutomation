package Page;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import util.DriverFactory;
import util.Utilities;
//import your.package.ToggleButton;

public class Costingpages extends DriverFactory {
	Pdfds_page pdfds = new Pdfds_page();
	Stylepage Stp = new Stylepage();
	Utilities utilities = new Utilities();
	
	
//	r.selectByVisibleText("Option 2");
	By txtUN = By.xpath("//input[@id='userName']");
	By txtPwd = By.xpath("//input[@id='userpassword']");
	By btnSignIn = By.xpath("//button[@class='btn btn-block btn-primary btn-lg font-weight-medium auth-form-btn']");
	By Woven = By.xpath("//span[text()='Woven / knit']");
	By PD = By.xpath("//span[text()='PD ']");
	By Costing = By.xpath("//a[@routerlink='/costing']");
	By Sty1 = By.xpath("//a[@id='sidebarCollapse']");
	By Search_By_Style = By.xpath("//input[@placeholder='Search By Style #']");
	By Select_Stlye = By.xpath("//div[@id='v-pills-tab']");
	By Sty2 = By.xpath("//a[@id='sidebarCollapse']");
	By VerName = By.xpath("//input[@formcontrolname='versionName']");
	By Remarks = By.xpath("//input[@formcontrolname='remarks']");
	By AddCombo = By.xpath("(//button[text()=' Add a Combo'])");
	By ComName = By.xpath("//input[@formcontrolname='comboName']");
	By ComQty = By.xpath("(//input[@formcontrolname='comboQTY'])[1]");
	By ComQtyTotal = By.xpath("(//td[@class='text-right'])[1]");
	// Fabric & lining fields xpath
	By FL1 = By.xpath("(//select[@formcontrolname='fabricId'])[1]");
	By AppCom1 = By.xpath("//div[text()='Select Combo']");
	By SecCom1 = By.xpath("//div[@class='ng-option ng-option-marked ng-star-inserted']");
//	By SecCom1 = By.xpath("//span[@class='ng-option-label ng-star-inserted']");
	By GarAvg1 = By.xpath("//input[@formcontrolname='garmentAvg']");
	By Waste1 = By.xpath("(//input[@formcontrolname='wastage'])[1]");
	By Rate1 = By.xpath("(//input[@formcontrolname='rate'])[1]");
	By ConRate1 = By.xpath("(//input[@formcontrolname='conversionRate'])[1]");
	
	By FL2 = By.xpath("(//select[@formcontrolname='fabricId'])[2]");
	By ComName2 = By.xpath("(//input[@formcontrolname='comboName'])[2]");
	By ComQty2 = By.xpath("(//input[@formcontrolname='comboQTY'])[2]");
	By AppCom2 = By.xpath("(//div[@class='ng-placeholder'])[2]");
	By SecCom2 = By.xpath("(//span[@class='ng-option-label ng-star-inserted'])[2]");
	By GarAvg2 = By.xpath("(//input[@formcontrolname='garmentAvg'])[2]");
	By Waste2 = By.xpath("(//input[@formcontrolname='wastage'])[2]");
	By Rate2 = By.xpath("(//input[@formcontrolname='rate'])[2]");
	By ConRate2 = By.xpath("(//input[@formcontrolname='conversionRate'])[2]");
	By AddSamCost = By.xpath("//input[@formcontrolname='additionalSamplingCost']");
	By FrieghtCost = By.xpath("//input[@formcontrolname='freightCost']");
	//Adding the Accessories1
	By AddTrims = By.xpath("//button[text()=' Add Trims']");
	By Acc1_Category1 = By.xpath("//select[@formcontrolname='descriptionTypeId']");
	By Acc1_select_Cate1 = By.xpath("//option[text()='Job Work ']");
	By Acc1_Item1 = By.xpath("//select[@formcontrolname='itemId']");
	By Acc1_select_Item1 = By.xpath("//option[text()=' Tassel Making']");
	By Acc1_Avg1 = By.xpath("//input[@placeholder='Enter Avg/Garment']");
	By Acc1_Wastage1 = By.xpath("(//input[@formcontrolname='wastage'])[2]");
	By Acc1_Rate1 = By.xpath("(//input[@formcontrolname='rate'])[2]");
	//Adding the Accessories2
	By AddAccessories = By.xpath("(//button[@class='btn btn-primary btn-sm shadow-sm float-right ng-star-inserted'])[4]");
	By Acc2_Category2 = By.xpath("(//select[@formcontrolname='descriptionTypeId'])[2]");
	By Acc2_select_cate2 = By.xpath("(//option[text()='Labels '])[2]");
	By Acc2_Item2 = By.xpath("(//select[@formcontrolname='itemId'])[2]");
	By Acc2_select_Item2 = By.xpath("//option[text()=' Bulk ID']");
	By Acc2_Cost = By.xpath("(//input[@class='form-control form-control-sm text-right ng-untouched ng-pristine ng-valid'])[4]");
//	Cutting grid
	By Cut_Check_OverheadCost = By.xpath("//input[@formcontrolname='overHeadCost']");
	By Cut_Enter_Overheadcost = By.xpath("//input[@formcontrolname='overHeadCost']");
	By Cut_check_GarCutCost = By.xpath("//input[@formcontrolname='garmentCuttingCost']");
	By Cut_enter_GarCutCost = By.xpath("//input[@formcontrolname='garmentCuttingCost']");
//	Computer Embriodiery
	By ComEmb_NoOfStiched = By.xpath("(//input[@formcontrolname='noofStitchesorHours'])[1]");
	By ComEmb_Rate = By.xpath("(//input[@formcontrolname='rate'])[2]");
	By ComEmb_Overhead = By.xpath("(//input[@formcontrolname='overheadCost'])[1]");
	By ComEmb_AddlCharges = By.xpath("//input[@formcontrolname='additionalCharges']");
//	Adda Work
	By Adda_Hours = By.xpath("(//input[@formcontrolname='noofStitchesorHours'])[2]");
	By Adda_Rate = By.xpath("(//input[@formcontrolname='rate'])[3]");
	By Adda_Overhead = By.xpath("(//input[@formcontrolname='overheadCost'])[2]");
//	Manual Embroidery
	By ManEmb_Hours = By.xpath("(//input[@formcontrolname='noofStitchesorHours'])[3]");
	By ManEmb_Rate = By.xpath("(//input[@formcontrolname='rate'])[4]");
	By ManEmb_Overhead = By.xpath("(//input[@formcontrolname='overheadCost'])[3]");
//	Stitching
	By Sti_AddProcess = By.xpath("(//button[@class='btn btn-primary btn-sm shadow-sm float-right ng-star-inserted'])[5]");
	By Sti_OB1 = By.xpath("//input[@formcontrolname='firstOBPercentage']");
	By Sti_OB2 = By.xpath("//input[@formcontrolname='secondOBPercentage']");
	By Sti_OB3 = By.xpath("//input[@formcontrolname='thirdOBPercentage']");
	By Sti_cost1 = By.xpath("//input[@formcontrolname='firstOBCost']");
	By Sti_cost2 = By.xpath("//input[@formcontrolname='secondOBCost']");
	By Sti_cost3 = By.xpath("//input[@formcontrolname='thirdOBCost']");
	By Sti_Booked = By.xpath("//select[@formcontrolname='bookedPercentage']");
	By Sti_smocking = By.xpath("//input[@formcontrolname='smokingNoOfLines']");
	By Sti_Rate = By.xpath("//input[@formcontrolname='smokingCost']");
	By Sti_Describe1 = By.xpath("(//select[@formcontrolname='processId'])[1]");
	By Sti_Select1 = By.xpath("//option[text()=' Overhead']");
	By Sti_Cost1 = By.xpath("(//input[@formcontrolname='cost'])[5]");
//	Finishing and Packing
	By FP_AddProcess = By.xpath("//h3[text()='Finishing And Packing']/..//button[text()=' Add a Process']");
	By FP_Process1 = By.xpath("(//select[@formcontrolname='processId'])[2]");
	By FP_SelectProcess = By.xpath("//option[@value='244']");
//	(//tr[@class='ng-pristine ng-valid ng-star-inserted ng-touched']//select[@formcontrolname='processId'])[1]
	By FP_Cost1 = By.xpath("(//input[@formcontrolname='cost'])[3]");
	//p-table[@class='p-element ng-pristine ng-valid ng-touched']//input[@formcontrolname='cost']
//	Washing / GArment process
	By Wash_Yes_No = By.xpath("(//label[@class='custom-control-label font-weight-bold'])[4]");
	By Wash_AddProcessBut = By.xpath("(//button[@class='btn btn-primary btn-sm shadow-sm float-right ng-star-inserted'])[7]");
	By Wash_AddProcess1dp = By.xpath("(//select[@formcontrolname='processId'])[3]");
	By Wash_SelProcess = By.xpath("//option[text()=' Enzyme wash']");
	By Wash_Cost1 = By.xpath("(//input[@formcontrolname='cost'])[7]");
	//testing and inspection
	By TI_TotCost_FTPGTP = By.xpath("//input[@formcontrolname='fptgptPcCost']");
	By TI_Cost_FTPGTP = By.xpath("//input[@formcontrolname='fptgptCost']");
	By TI_TotCost_AddlTest = By.xpath("//input[@formcontrolname='additionalTestPcCost']");
	By TI_Cost_AddlTest = By.xpath("//input[@formcontrolname='additionalTestCost']");
	By TI_TotCost_InspCharges = By.xpath("//input[@formcontrolname='inspectionPcCost']");
	By TI_Cost_InspCharges = By.xpath("//input[@formcontrolname='inspectionCost']");
	
	By FC_NoSeas = By.xpath("//input[@formcontrolname='numberofPOsbySea']");
	By FC_NoAir = By.xpath("//input[@formcontrolname='numberofPOsbyAir']");
	By FC__TotCost_CustClearence = By.xpath("//input[@formcontrolname='customClearencePcCost']");
	By FC__Cost_CustClearence = By.xpath("//input[@formcontrolname='customClearenceCost']");
	By FC_TotCost_Cartage = By.xpath("//input[@formcontrolname='cartagePcCost']");
	By FC_Cost_Cartage = By.xpath("//input[@formcontrolname='cartageCost']");
	By FC_AdditionalBuffer = By.xpath("//input[@formcontrolname='additionalBuffer']");
	
	By TDE_Rejection = By.xpath("//input[@formcontrolname='rejectionPrecentage']");
	By TDE_Overhead = By.xpath("//input[@formcontrolname='overHeadPercentage']");
	By TDE_Profit_Markup = By.xpath("//input[@formcontrolname='profitMarkUpPercentage']");
	By TDE_Commission = By.xpath("//input[@formcontrolname='commissionPercentage']");
	By Commission_Type= By.xpath("//select[@formcontrolname='commissionTypeId']/.//option[text()=' None']");
	By Currency = By.xpath("//input[@placeholder='Conversion Rate']");
	By PriceQuotedToBuyer = By.xpath("//input[@formcontrolname='buyerPrice']");
	By Save = By.xpath("//button[@class='btn btn-md btn-primary btn-active-light-primary mr-2 ng-star-inserted']/..//i[@class='ti-save']");
	By Submit = By.xpath("//button[text()=' Submit ']");
	By ViewForPrint = By.xpath("//button[text()=' View for Print']");
	By PrintStylename = By.xpath("(//h3[@class='mb-1 font-weight-bold header'])[2]");
	By DownLoadAsExcel = By.xpath("//button[text()=' Download As Excel']");
	By Man_Valid_msg = By.xpath("//h2[text()='Mandatory Fields Are Required With  Valid Data.']");
	By Cancel = By.xpath("//button[@id='closepagebutton']");
	By Import = By.xpath("//button[@data-target='#importCostingDetails']");
	By Imp_popup = By.xpath("//h5[text()='Import Version Details']");
	By Imp_ver = By.xpath("//select[@formcontrolname='verstionId']");
	By Imp_closeButton = By.xpath("//button[@class='btn btn-danger']");
	By Imp_ImportButton = By.xpath("//button[@class='btn btn-primary']");
	By Imp_Close1 = By.xpath("(//button[@data-dismiss='modal'])[1]");
	

	public void Navigates_to_the_Login_pages() {
		driver.get(prop.getProperty("url"));
	}




	public void Click_on_the_Woven_Modules() throws Throwable {
		utilities.webDriverWait(driver, Woven);
		driver.findElement(Woven).click();
		utilities.MinimumWait(driver);
		
		
	}

	public void Click_on_the_PD_Module() throws Throwable {
		utilities.webDriverWait(driver, PD);
		driver.findElement(PD).click();
    	utilities.WaitUntilPageIsLoaded(driver);
    	
    	utilities.webDriverWait(driver, Stp.DataEntry);
		driver.findElement(Stp.DataEntry).click();
		utilities.MinimumWait(driver);
		
	}

	public void Click_on_the_Costing_Module() throws Throwable {
		utilities.webDriverWait(driver,Costing);
		driver.findElement(Costing).click();
    	utilities.WaitUntilPageIsLoaded(driver);
		
	}

	public void Click_on_the_Style_button() throws Throwable {
		utilities.webDriverWait(driver, Sty1);
		driver.findElement(Sty1).click();
		utilities.WaitUntilPageIsLoaded(driver);
		
		utilities.webDriverWait(driver, pdfds.FilterIcon);
		driver.findElement(pdfds.FilterIcon).click();
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Search_By_Style);
		driver.findElement(Search_By_Style).sendKeys("Style516");
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, pdfds.Apply_Filter);
		driver.findElement(pdfds.Apply_Filter).click();
		utilities.MinimumWait(driver);
		
	}

	public void Select_an_Style_in_the_Menu_List() throws Throwable {
		utilities.webDriverWait(driver, Select_Stlye);
		driver.findElement(Select_Stlye).click();
		utilities.WaitUntilPageIsLoaded(driver);
		
	}
	

	public void Click_on_Style_button() throws Throwable {
		utilities.webDriverWait(driver, Sty2);
		driver.findElement(Sty2).click();
		utilities.WaitUntilPageIsLoaded(driver);
		utilities.MinimumWait(driver);
		
	}

	public void Enter_Version_Name() throws Throwable {
		utilities.webDriverWait(driver,VerName);
		driver.findElement(VerName).clear();
		driver.findElement(VerName).sendKeys("Ver 1");
		utilities.MinimumWait(driver);
		
	}

	public void Enter_Remarks() throws Throwable {
		utilities.webDriverWait(driver,Remarks);
		driver.findElement(Remarks).clear();
		driver.findElement(Remarks).sendKeys("Entering Remarks for Testing");
		utilities.MinimumWait(driver);
		
	}

	public void Click_on_Add_Combo_button() throws Throwable {
		utilities.webDriverWait(driver,AddCombo);
		driver.findElement(AddCombo).click();
		utilities.WaitUntilPageIsLoaded(driver);
	}

	public void Enter_Combo_Name() throws Throwable {
		utilities.webDriverWait(driver,ComName);
		driver.findElement(ComName).sendKeys("C1");
		utilities.MinimumWait(driver);
	}

	public void Enter_Combo_Qty() throws Throwable {
		utilities.webDriverWait(driver,ComQty);
		driver.findElement(ComQty).clear();
		driver.findElement(ComQty).sendKeys("2000");
		utilities.MinimumWait(driver);
		driver.findElement(ComQtyTotal).click();
		utilities.MinimumWait(driver);
	}

	public void Click_in_the_App_Combo1() throws Throwable {
		utilities.webDriverWait(driver,AppCom1);
		driver.findElement(AppCom1).click();
		utilities.MinimumWait(driver);
		
	}
	public void Select_an_App_combo1() throws Throwable {
		utilities.webDriverWait(driver,SecCom1);
		driver.findElement(SecCom1).click();
		utilities.MinimumWait(driver);
	}

	public void Enter_Garment_Average1() throws Throwable {
		utilities.webDriverWait(driver,GarAvg1);
		driver.findElement(GarAvg1).sendKeys("2");
		utilities.MinimumWait(driver);
	}

	public void Enter_Wastage1() throws Throwable {
		utilities.webDriverWait(driver,Waste1);
		driver.findElement(Waste1).sendKeys("1");	
		utilities.MinimumWait(driver);
	}

	public void Enter_Rate1() throws Throwable {
		utilities.webDriverWait(driver,Rate1);
		driver.findElement(Rate1).sendKeys("5");
		utilities.MinimumWait(driver);
	}

	public void Conversion_Rate1() throws Throwable {
		utilities.webDriverWait(driver,ConRate1);
		driver.findElement(ConRate1).clear();
		driver.findElement(ConRate1).sendKeys("2");
		utilities.MinimumWait(driver);
	}

	public void Click_in_the_App_Combo2() throws Throwable {
		utilities.webDriverWait(driver,AppCom1);
		driver.findElement(AddCombo).click();
		utilities.MinimumWait(driver);
		driver.findElement(ComName2).sendKeys("C2");
		utilities.MinimumWait(driver);
		driver.findElement(ComQty2).click();
		driver.findElement(ComQty2).clear();
		driver.findElement(ComQty2).sendKeys("1500");
		utilities.MinimumWait(driver);
		driver.findElement(AppCom1).click();
		utilities.MinimumWait(driver);
	}

	public void Select_an_App_combo2() throws Throwable {
		utilities.webDriverWait(driver,SecCom2);
		driver.findElement(SecCom2).click();
		utilities.MinimumWait(driver);
		
	}

	public void Enter_Garment_Average2() throws Throwable {
		utilities.webDriverWait(driver,GarAvg2);
		driver.findElement(GarAvg2).sendKeys("3");
		utilities.MinimumWait(driver);
		
	}

	public void Enter_Wastage2() throws Throwable {
		utilities.webDriverWait(driver,Waste2);
		driver.findElement(Waste2).sendKeys("3");	
		utilities.MinimumWait(driver);
		
	}

	public void Enter_Rate2() throws Throwable {
		utilities.webDriverWait(driver,Rate2);
		driver.findElement(Rate2).sendKeys("4");
		utilities.MinimumWait(driver);
		
	}

	public void Conversion_Rate2() throws Throwable {
		utilities.webDriverWait(driver,ConRate2);
		driver.findElement(ConRate2).clear();
		utilities.MinimumWait(driver);
		driver.findElement(ConRate2).sendKeys("5");
		utilities.MinimumWait(driver);
		
	}

	public void Enter_Additional_Sampling_Cost() throws Throwable {
		utilities.webDriverWait(driver,AddSamCost);
		driver.findElement(AddSamCost).clear();
		utilities.MinimumWait(driver);
		driver.findElement(AddSamCost).sendKeys("13");
		utilities.MinimumWait(driver);
	}

	public void Enter_Per_pc_Freight_Cost() throws Throwable {
		utilities.webDriverWait(driver,FrieghtCost);
		driver.findElement(FrieghtCost).clear();
		utilities.MinimumWait(driver);
		driver.findElement(FrieghtCost).sendKeys("12");
		utilities.MinimumWait(driver);
	}

	public void Click_on_Add_Trims_button() throws Throwable {
		utilities.webDriverWait(driver,AddTrims);
		driver.findElement(AddTrims).click();
		utilities.MinimumWait(driver);
		
	}

	public void Click_on_the_Category1_dropdown_field() throws Throwable {
		utilities.webDriverWait(driver, Acc1_Category1);
		driver.findElement(Acc1_Category1).click();
		utilities.MinimumWait(driver);
	}

	public void Select_a_Category1_from_the_dropdown() throws Throwable {
		utilities.webDriverWait(driver, Acc1_select_Cate1);
		driver.findElement(Acc1_select_Cate1).click();
		utilities.MinimumWait(driver);
	}

	public void Click_on_the_Item1_dropdown_field() throws Throwable {
		utilities.webDriverWait(driver, Acc1_Item1);
		driver.findElement(Acc1_Item1).click();
		utilities.MinimumWait(driver);
	}

	public void Select_an_Item1_from_the_dropdown() throws Throwable {
		utilities.webDriverWait(driver, Acc1_select_Item1);
		driver.findElement(Acc1_select_Item1).click();
		utilities.MinimumWait(driver);
	}

	public void Enter_Avg_of_an_Item1_value() throws Throwable {
		utilities.webDriverWait(driver, Acc1_Avg1);
		driver.findElement(Acc1_Avg1).sendKeys("2");
		utilities.MinimumWait(driver);
	}

	public void Enter_Wastage_of_the_selected_Trim_Accessories1() throws Throwable {
		utilities.webDriverWait(driver, Acc1_Wastage1);
		driver.findElement(Acc1_Wastage1).sendKeys("3");
		System.out.println("Entered Accessory1 wastage value");
		utilities.MinimumWait(driver);
		
		
	}

	public void Enter_Rate_of_the_selected_Trim_Accessories1() throws Throwable {
		utilities.webDriverWait(driver, Acc1_Rate1);
		driver.findElement(Acc1_Rate1).sendKeys("4");
		utilities.MinimumWait(driver);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)");
	}

	public void Click_on_the_Add_Accessories_button() throws Throwable {
		utilities.webDriverWait(driver, AddAccessories);
		driver.findElement(AddAccessories).click();
		utilities.MinimumWait(driver);
	}

	public void Click_on_the_Category_dropdown_field_under_the_TrimAccessoriesII_grid() throws Throwable {
		utilities.webDriverWait(driver, Acc2_Category2);
		driver.findElement(Acc2_Category2).click();
		utilities.MinimumWait(driver);
	}
	public void Select_a_Category_from_the_dropdown_under_the_TrimAccessoriesII_grid() throws Throwable {
		utilities.webDriverWait(driver, Acc2_select_cate2);
		driver.findElement(Acc2_select_cate2).click();
		utilities.MinimumWait(driver);
	}

	public void Click_on_the_Item_dropdown_field_under_the_TrimAccessoriesII_grid() throws Throwable {
		utilities.webDriverWait(driver, Acc2_Item2);
		driver.findElement(Acc2_Item2).click();
		utilities.MinimumWait(driver);
		
	}

	public void Select_a_Item_from_the_dropdown_under_the_TrimAccessoriesII_grid() throws Throwable {
		utilities.webDriverWait(driver, Acc2_select_Item2);
		driver.findElement(Acc2_select_Item2).click();
		utilities.MinimumWait(driver);
	}

	public void Enter_the_Cost() throws Throwable {
		utilities.webDriverWait(driver, Acc2_Cost);
		
//		Object data = getPrepopulatedData(); // Replace with your data retrieval method
//		System.out.println(data);
		driver.findElement(Acc2_Cost).click();
		driver.findElement(Acc2_Cost).clear();
		driver.findElement(Acc2_Cost).sendKeys("56");
		utilities.MinimumWait(driver);
//		WebElement costElement = driver.findElement(Acc2_Cost);
//		costElement.sendKeys("14");
//		int cost = Integer.parseInt(costElement.getAttribute("value"));
//		System.out.println("Entered Accessory2 Cost value" + cost);
	}

	public void To_check_whether_the_Overhead_Cost_is_displaying_a_value_or_not() throws Throwable {
		utilities.webDriverWait(driver, Cut_Check_OverheadCost);
		driver.findElement(Cut_Check_OverheadCost).isDisplayed();
		utilities.MinimumWait(driver);
	}

	public void Enter_Overhead_Cost_value() throws Throwable {
		utilities.webDriverWait(driver, Cut_Enter_Overheadcost);
		WebElement pre_data = driver.findElement(Cut_Check_OverheadCost);
		String data1 = pre_data.getAttribute("value");
		System.out.println("Printing the Cutting Overhead Cost value = " + data1);
		driver.findElement(Cut_Check_OverheadCost).isDisplayed();
		driver.findElement(Cut_Enter_Overheadcost).clear();
		driver.findElement(Cut_Enter_Overheadcost).sendKeys("25");
		System.out.println("This is a test print in over head costing ");
		utilities.MinimumWait(driver);
	}

	public void To_check_whether_the_Garment_Cutting_Cost_is_displaying_a_value_or_not() throws Throwable {
		utilities.webDriverWait(driver,Cut_check_GarCutCost);
		driver.findElement(Cut_check_GarCutCost).isDisplayed();
		utilities.MinimumWait(driver);
	}

	public void Enter_Garment_Cutting_Cost_value() throws Throwable {
		utilities.webDriverWait(driver, Cut_enter_GarCutCost);
		driver.findElement(Cut_check_GarCutCost).isDisplayed();
		driver.findElement(Cut_enter_GarCutCost).clear();
		driver.findElement(Cut_enter_GarCutCost).sendKeys("20");
		utilities.MinimumWait(driver);
	}

	public void Enter_No_of_Stiches() throws Throwable {
		utilities.webDriverWait(driver,ComEmb_NoOfStiched );
		driver.findElement(ComEmb_NoOfStiched).sendKeys("4");
		utilities.MinimumWait(driver);
	}

	public void Enter_Rate() throws Throwable {
		utilities.webDriverWait(driver,ComEmb_Rate );
		driver.findElement(ComEmb_Rate).clear();
		driver.findElement(ComEmb_Rate).sendKeys("4");
		utilities.MinimumWait(driver);
		
	}

	public void Enter_Overhead() throws Throwable {
		utilities.webDriverWait(driver,ComEmb_Overhead);
		driver.findElement(ComEmb_Overhead).isDisplayed();
		driver.findElement(ComEmb_Overhead).clear();
		driver.findElement(ComEmb_Overhead).sendKeys("4");
		utilities.MinimumWait(driver);
	}

	public void Enter_Addl_Charges() throws Throwable {
		utilities.webDriverWait(driver,ComEmb_AddlCharges);
		driver.findElement(ComEmb_AddlCharges).clear();
		driver.findElement(ComEmb_AddlCharges).sendKeys("4");
		utilities.MinimumWait(driver);
		
	}

	public void Enter_Adda_Hours() throws Throwable {
		utilities.webDriverWait(driver,Adda_Hours);
		driver.findElement(Adda_Hours).sendKeys("4");
		utilities.MinimumWait(driver);
		
	}

	public void Enter_Adda_Rate() throws Throwable {
		utilities.webDriverWait(driver,Adda_Rate);
		driver.findElement(Adda_Rate).isDisplayed();
		driver.findElement(Adda_Rate).clear();
		driver.findElement(Adda_Rate).sendKeys("4");
		utilities.MinimumWait(driver);
	}

	public void Enter_Adda_Overhead() throws Throwable {
		utilities.webDriverWait(driver,Adda_Overhead);
		driver.findElement(Adda_Overhead).isDisplayed();
		driver.findElement(Adda_Overhead).clear();
		driver.findElement(Adda_Overhead).sendKeys("4");
		utilities.MinimumWait(driver);
		
	}

	public void Enter_Manual_Hours() throws Throwable {
		utilities.webDriverWait(driver,ManEmb_Hours);
		driver.findElement(ManEmb_Hours).sendKeys("4");
		utilities.MinimumWait(driver);
	}

	public void Enter_Manual_Rate() throws Throwable {
		utilities.webDriverWait(driver,ManEmb_Rate);
		driver.findElement(ManEmb_Rate).isDisplayed();
		driver.findElement(ManEmb_Rate).clear();
		driver.findElement(ManEmb_Rate).sendKeys("4");
		utilities.MinimumWait(driver);
		
	}

	public void Enter_Manual_Overhead() throws Throwable {
		utilities.webDriverWait(driver,ManEmb_Overhead);
		driver.findElement(ManEmb_Overhead).isDisplayed();
		driver.findElement(ManEmb_Overhead).clear();
		driver.findElement(ManEmb_Overhead).sendKeys("4");
		utilities.MinimumWait(driver);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)");
	}
	
	public void To_verify_on_clicking_the_Add_Process_button_under_Stitching() throws Throwable {
		utilities.webDriverWait(driver,Sti_AddProcess);
//		WebElement stitchingprocess = driver.findElement(Sti_AddProcess);
		
		if(Sti_AddProcess.equals(Sti_Describe1))
			{ 
			driver.findElement(Sti_AddProcess).click();
			System.out.println("Stitching process add button is enabled");
			}else {
				driver.findElement(Sti_OB1).click();
				System.out.println("Stitching process add button is not enabled");
			}
		utilities.MinimumWait(driver);
	}
	public void Enter_a_value_in_OB1() throws Throwable {
		utilities.webDriverWait(driver,Sti_OB1);
		driver.findElement(Sti_OB1).clear();
		driver.findElement(Sti_OB1).sendKeys("1");
		utilities.MinimumWait(driver);
	}

	public void Enter_a_value_in_OB2() throws Throwable {
		utilities.webDriverWait(driver,Sti_OB2);
		driver.findElement(Sti_OB2).clear();
		driver.findElement(Sti_OB2).sendKeys("2");
		utilities.MinimumWait(driver);
	}

	public void Enter_a_value_in_OB3() throws Throwable {
		utilities.webDriverWait(driver,Sti_OB3);
		driver.findElement(Sti_OB3).clear();
		driver.findElement(Sti_OB3).sendKeys("3");
		utilities.MinimumWait(driver);
		
	}

	public void Enter_a_value_in_Cost1() throws Throwable {
		utilities.webDriverWait(driver,Sti_cost1);
		driver.findElement(Sti_cost1).clear();
		driver.findElement(Sti_cost1).sendKeys("13");
		utilities.MinimumWait(driver);
		
	}

	public void Enter_a_value_in_Cost2() throws Throwable {
		utilities.webDriverWait(driver,Sti_cost2);
		driver.findElement(Sti_cost2).clear();
		driver.findElement(Sti_cost2).sendKeys("14");
		utilities.MinimumWait(driver);
		
	}

	public void Enter_a_value_in_Cost3() throws Throwable {
		utilities.webDriverWait(driver,Sti_cost3);
		driver.findElement(Sti_cost3).clear();
		driver.findElement(Sti_cost3).sendKeys("15");
		utilities.MinimumWait(driver);
		
	}

	public void Select_an_option_in_Booked_field() throws Throwable {
		utilities.webDriverWait(driver,Sti_Booked);
		driver.findElement(Sti_Booked).click();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_2);
		utilities.MinimumWait(driver);
	}

	public void Enter_a_value_in_Smocking() throws Throwable {
		utilities.webDriverWait(driver,Sti_smocking);
		driver.findElement(Sti_smocking).clear();
		driver.findElement(Sti_smocking).sendKeys("55");
		utilities.MinimumWait(driver);
		
	}

	public void Enter_a_value_in_Rate() throws Throwable {
		utilities.webDriverWait(driver,Sti_Rate);
		driver.findElement(Sti_Rate).clear();
		driver.findElement(Sti_Rate).sendKeys("10");
		utilities.MinimumWait(driver);
		
	}
	public void To_verify_whether_the_user_is_able_to_click_the_Description_dropdown_field_or_not() throws Throwable {
		utilities.webDriverWait(driver,Sti_Describe1);
		driver.findElement(Sti_Describe1).click();
		utilities.MinimumWait(driver);
	}
	public void Select_a_value_from_the_dropdown_field() throws Throwable {
		utilities.webDriverWait(driver,Sti_Rate);
		driver.findElement(Sti_Select1).click();
		utilities.MinimumWait(driver);
	}
	public void Enter_the_Stitching_Cost_value() throws Throwable {
		utilities.webDriverWait(driver,Sti_Rate);
		driver.findElement(Sti_Cost1).sendKeys("34");
		utilities.MinimumWait(driver);
	}

	public void Click_on_the_Add_Process_button_under_Finising_and_Packing_grid() throws Throwable {
		utilities.webDriverWait(driver,FP_AddProcess);
		
//		driver.findElement(FP_AddProcess).click();
//		System.out.println("Button is Clicked");
		WebElement buttonElement = driver.findElement(FP_AddProcess);
		if (buttonElement.isDisplayed()) {
			System.out.println("Button is enabled.");
			driver.findElement(FP_AddProcess).click();
		} else {
			System.out.println("Button is disabled.");
		}
		utilities.MinimumWait(driver);
	}

	public void Select_a_Finishing_and_Packing_process1() throws Throwable {
		utilities.webDriverWait(driver,FP_Process1);
		driver.findElement(FP_Process1).click();
		utilities.MinimumWait(driver);
		Robot selectprocess1 = new Robot();
		selectprocess1.keyPress(KeyEvent.VK_DOWN);
		selectprocess1.keyPress(KeyEvent.VK_ENTER);
		utilities.MinimumWait(driver);
//		utilities.MinimumWait(driver);
//		Robot a = new Robot();
//		r.keyPress(KeyEvent.VK_KP_DOWN);
//		a.keyPress(KeyEvent.VK_CLEAR);
//		System.out.println("cleqaring the value in the dropdown");
//		a.keyPress(KeyEvent.VK_2);
//		System.out.println("Select the first option in the dropdown");
		
	}

	public void Enter_the_Finishing_and_Packing_cost1() throws Throwable {
		utilities.webDriverWait(driver,FP_Cost1);
		driver.findElement(FP_Cost1).clear();
		utilities.MinimumWait(driver);
		driver.findElement(FP_Cost1).sendKeys("10");
		utilities.MinimumWait(driver);
	}

	public void Check_the_Yes_or_No_toggle_button_status() throws Throwable {
		utilities.webDriverWait(driver,Wash_Yes_No);
		driver.findElement(Wash_Yes_No).click();
		utilities.MinimumWait(driver);
		
	}

	public void Select_a_Washing_Process1() throws Throwable {
		utilities.webDriverWait(driver,Wash_AddProcess1dp);
		
		driver.findElement(Wash_AddProcess1dp).click();
		
//		Robot r = new Robot();
//		r.keyPress(KeyEvent.VK_2);
		utilities.webDriverWait(driver,Wash_SelProcess);
		driver.findElement(Wash_SelProcess).click();
		utilities.MinimumWait(driver);
		
	}

	public void Enter_the_Washing_Cost1() throws Throwable {
		utilities.webDriverWait(driver,Wash_Cost1);
		driver.findElement(Wash_Cost1).sendKeys("72");
//		WebElement WC = driver.findElement(Wash_Cost1);
//		WC.sendKeys("22");
//		int Wash_cost = Integer.parseInt(WC.getAttribute("value"));
//		System.out.println("Enter the washing cost = " + Wash_cost);
//		WebElement costElement = driver.findElement(Acc2_Cost);
//		costElement.sendKeys("14");
//		int cost = Integer.parseInt(costElement.getAttribute("value"));
		utilities.MinimumWait(driver);
	}

	public void Enter_the_value_in_the_FPT_GPT_Total_Cost_field() throws Throwable {
		utilities.webDriverWait(driver,TI_TotCost_FTPGTP);
		driver.findElement(TI_TotCost_FTPGTP).clear();
		driver.findElement(TI_TotCost_FTPGTP).sendKeys("234");
		utilities.MinimumWait(driver);
	}

	public void Enter_the_value_in_the_FPT_GPT_Cost_field() throws Throwable {
		utilities.webDriverWait(driver,TI_Cost_FTPGTP);
//		driver.findElement(TI_Cost_FTPGTP).clear();
		driver.findElement(TI_Cost_FTPGTP).sendKeys("2");
		utilities.MinimumWait(driver);
		
	}

	public void Enter_the_value_in_the_Addl_Tests_Total_Cost_field() throws Throwable {
		utilities.webDriverWait(driver,TI_TotCost_AddlTest);
		driver.findElement(TI_TotCost_AddlTest).clear();
		driver.findElement(TI_TotCost_AddlTest).sendKeys("345");
		utilities.MinimumWait(driver);
	
	}

	public void Enter_the_value_in_the_Addl_Tests_Cost_field() throws Throwable {
		utilities.webDriverWait(driver,TI_Cost_AddlTest);
//		driver.findElement(TI_Cost_AddlTest).clear();
		driver.findElement(TI_Cost_AddlTest).sendKeys("3");
		utilities.MinimumWait(driver);
		}

	public void Enter_the_value_in_the_Inspection_Charges_Total_Cost_field() throws Throwable {
		utilities.webDriverWait(driver,TI_TotCost_InspCharges);
		driver.findElement(TI_TotCost_InspCharges).clear();
		driver.findElement(TI_TotCost_InspCharges).sendKeys("567");
		utilities.MinimumWait(driver);
		}

	public void Enter_the_value_in_the_Inspection_Charges_Cost_field() throws Throwable {
		utilities.webDriverWait(driver,TI_Cost_InspCharges);
//		driver.findElement(TI_Cost_InspCharges).clear();
		driver.findElement(TI_Cost_InspCharges).sendKeys("6");
		utilities.MinimumWait(driver);
		
	}

	public void Enter_the_value_in_the_NO_of_PO_by_Sea_field() throws Throwable {
		utilities.webDriverWait(driver,FC_NoSeas);
		driver.findElement(FC_NoSeas).clear();
		driver.findElement(FC_NoSeas).sendKeys("345");
		utilities.MinimumWait(driver);
	}

	public void Enter_the_value_in_the_NO_of_PO_by_Air_field() throws Throwable {
		utilities.webDriverWait(driver,FC_NoAir);
		driver.findElement(FC_NoAir).clear();
		driver.findElement(FC_NoAir).sendKeys("33");
		utilities.MinimumWait(driver);
	}

	public void Enter_the_value_in_the_Custom_Clearance_Total_Cost_field() throws Throwable {
		utilities.webDriverWait(driver,FC__TotCost_CustClearence);
		driver.findElement(FC__TotCost_CustClearence).clear();
		driver.findElement(FC__TotCost_CustClearence).sendKeys("222");
		utilities.MinimumWait(driver);
	}

	public void Enter_the_value_in_the_Custom_Clearance_Cost_field() throws Throwable {
		utilities.webDriverWait(driver,FC__Cost_CustClearence);
		driver.findElement(FC__Cost_CustClearence).clear();
		driver.findElement(FC__Cost_CustClearence).sendKeys("44");
		utilities.MinimumWait(driver);
	}

	public void Enter_the_value_in_the_Cartage_Total_Cost_field() throws Throwable {
		utilities.webDriverWait(driver,FC_TotCost_Cartage);
		driver.findElement(FC_TotCost_Cartage).clear();
		driver.findElement(FC_TotCost_Cartage).sendKeys("675");
		utilities.MinimumWait(driver);
	}

	public void Enter_the_value_in_the_Cartage_Cost_field() throws Throwable {
		utilities.webDriverWait(driver,FC_Cost_Cartage);
		driver.findElement(FC_Cost_Cartage).clear();
		driver.findElement(FC_Cost_Cartage).sendKeys("67");
		utilities.MinimumWait(driver);
		
	}

	
	public void Enter_the_value_in_the_Additional_Buffer_field() throws Throwable {
		utilities.webDriverWait(driver,FC_AdditionalBuffer);
		driver.findElement(FC_AdditionalBuffer).clear();
		driver.findElement(FC_AdditionalBuffer).sendKeys("33");
		utilities.MinimumWait(driver);
	}

	public void Enter_the_value_in_the_Rejection_field() throws Throwable {
		utilities.webDriverWait(driver,TDE_Rejection);
		driver.findElement(TDE_Rejection).sendKeys("45");
		utilities.MinimumWait(driver);
	}

	public void Enter_the_value_in_the_OverHead_field() throws Throwable {
		utilities.webDriverWait(driver,TDE_Overhead);
		driver.findElement(TDE_Overhead).clear();
		driver.findElement(TDE_Overhead).sendKeys("33");
		utilities.MinimumWait(driver);
	}

	public void Enter_the_value_in_the_Profit_MarkUp_field() throws Throwable {
		utilities.webDriverWait(driver,TDE_Profit_Markup);
		driver.findElement(TDE_Profit_Markup).clear();
		driver.findElement(TDE_Profit_Markup).sendKeys("4");
		utilities.MinimumWait(driver);
		
	}

	public void Enter_the_value_in_the_Commission_field() throws Throwable {
		utilities.webDriverWait(driver,TDE_Commission);
//		WebElement commission = driver.findElement(TDE_Commission);
		if(TDE_Commission.equals(Commission_Type)) {
			driver.findElement(TDE_Commission).click();
			Thread.sleep(1000);
			driver.findElement(TDE_Commission).clear();
			Thread.sleep(1000);
			driver.findElement(TDE_Commission).sendKeys("3");
			Thread.sleep(1000);
		}
		else {
			
			System.out.println("Commission Percentage is disabled");
			driver.findElement(Currency).click();
			Thread.sleep(1000);
			
		}
		
		
	}

	public void Enter_the_value_in_the_Currency_field() throws Throwable {
		utilities.webDriverWait(driver,Currency);
		driver.findElement(Currency).clear();
		driver.findElement(Currency).sendKeys("65");
		System.out.println("Enter currency value");
		utilities.MediumWait(driver);
	}

	public void Enter_the_value_in_the_Price_Quoted_To_Buyer_field() throws Throwable {
		utilities.webDriverWait(driver,PriceQuotedToBuyer);
		driver.findElement(PriceQuotedToBuyer).sendKeys("567");
		System.out.println("Entered Quoted Price value");
		utilities.MediumWait(driver);
	}

	public void Click_on_the_PSave_button() throws Throwable {
		utilities.webDriverWait(driver,Save);
		driver.findElement(Save).click();
		utilities.MediumWait(driver);
	}

	public void Click_on_the_Submit_button() throws Throwable {
		utilities.webDriverWait(driver,Submit);
		driver.findElement(Submit).click();
		utilities.MediumWait(driver);
	}

	public void Click_on_the_View_For_Print_button() throws Throwable {
		utilities.webDriverWait(driver,ViewForPrint);
		driver.findElement(ViewForPrint).click();
		utilities.MinimumWait(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-750)", "");
		utilities.MediumWait(driver);
		String StyleName = driver.findElement(PrintStylename).getText();
		System.out.println("Printing style name:  "+ StyleName);
		utilities.MinimumWait(driver);
	}
	
	public void Click_on_the_Cancel_in_the_Print_form() throws Throwable {
		utilities.webDriverWait(driver,Cancel);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,750)", "");
		utilities.MinimumWait(driver);

		driver.findElement(Cancel).click();
		utilities.MinimumWait(driver);
		
	}

	public void Click_on_the_Download_As_Excel_button() throws Throwable {
		utilities.webDriverWait(driver,DownLoadAsExcel);
		driver.findElement(DownLoadAsExcel).click();
		
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,-550)", "");
	}	

	public void Click_on_the_Submit1_button() throws Throwable {
		utilities.webDriverWait(driver,Submit);
		System.out.println("Submit button didnot clicked");
		driver.findElement(Submit).click();
		System.out.println("Submit button clicked");
//		WebElement ManMsg = driver.findElement(Man_Valid_msg);
//		String Validation_msg = ManMsg.getAttribute("value");
//		System.out.println("VAlidation msg = " + Validation_msg );
		WebElement ValMsg = driver.findElement(Man_Valid_msg);
		String actualMessage = ValMsg.getText();

		String expectedMessage = "Mandatory Fields Are Required With Valid Data.";

		if (expectedMessage.equals(actualMessage)) {
			System.out.println("Validation message is correct." + actualMessage);
		} else {
			System.out.println("Validation message is incorrect."+ actualMessage);
		}
	}



	public void Click_on_Import_button() throws Throwable {
		utilities.webDriverWait(driver, Import);
		driver.findElement(Import).click();
	}

	public void Check_wether_the_Import_Version_Details_Version_popup_window_opened_or_not() throws Throwable {
		utilities.webDriverWait(driver, Imp_popup);
		driver.findElement(Imp_popup).isDisplayed();
	}

	public void Click_Versions_dropdown_field() throws Throwable {
		utilities.webDriverWait(driver, Imp_ver);
		driver.findElement(Imp_ver).click();
		utilities.MinimumWait(driver);
	}

	public void Select_a_value_from_the_dropdown() throws Throwable {
		Robot V = new Robot();
		V.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		V.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		
	}

	public void Click_on_the_Close_button_in_costing_import() throws Throwable {
		utilities.webDriverWait(driver, Imp_closeButton);
		driver.findElement(Imp_closeButton).click();
	}

	public void Click_on_the_Import_buttton() throws Throwable {
		utilities.webDriverWait(driver, Import);
		driver.findElement(Import).click();
		Thread.sleep(1000);
		driver.findElement(Imp_ver).click();
		Thread.sleep(1000);
		Robot V = new Robot();
		V.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		V.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		utilities.webDriverWait(driver, Imp_ImportButton);
		driver.findElement(Imp_ImportButton).click();
		Thread.sleep(1000);
	}

	public void Click_on_Close_icon_in_costing_import() throws Throwable {
		utilities.webDriverWait(driver, Import);
		driver.findElement(Import).click();
		Thread.sleep(1000);
		utilities.webDriverWait(driver, Imp_Close1);
		driver.findElement(Imp_Close1);
	}





	



	

	

	
	
	


}
