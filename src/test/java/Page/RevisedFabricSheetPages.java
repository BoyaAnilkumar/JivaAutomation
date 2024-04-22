package Page;


import java.awt.AWTException;
//import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

//import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import util.DriverFactory;
import util.Utilities;

public class RevisedFabricSheetPages extends DriverFactory {
	Utilities utilities = new Utilities();
	
	By txtUN = By.xpath("//input[@id='userName']");
	By txtPwd = By.xpath("//input[@id='userpassword']");
	By btnSignIn = By.xpath("//button[@class='btn btn-block btn-primary btn-lg font-weight-medium auth-form-btn']");
	By Woven = By.xpath("//span[text()='Woven / knit']");
	By Merchandising = By.xpath("(//span[text()='Merchandising '])[1]");
	By GenerateFabricSheet = By.xpath("//span[text()='Generate Fabric Sheet']");
	By RevisedFabricSheet = By.xpath("//a[text()='Revised Fabric Sheet']");
	By buttStyleSH = By.xpath("//a[@id='sidebarCollapse']");
	By FabDetgrid = By.xpath("(//table[@class='p-datatable-table ng-star-inserted'])[1]");
	By buttNoFilter = By.xpath("//button[@class='btn btn-outline-secondary btn-sm mr-2 mb-2 float-right ng-star-inserted']");
	By buttonFilter = By.xpath("//i[@class='pi pi-filter']");
	By F_Buyer = By.xpath("//div[@class='p-element p-multiselect-label-container ng-tns-c92-12']");
	By F_EnterBuyer = By.xpath("//input[@class='p-multiselect-filter p-inputtext p-component ng-tns-c92-12']");
	By F_SelectBuyer = By.xpath("//li[@aria-label='Testbuyer']");
	By F_Seasons = By.xpath("//select[@formcontrolname='seasonId']");
	By F_selectSeason = By.xpath("//option[@value='116']");
	By F_Status = By.xpath("//select[@formcontrolname='staticStatusId']");
	By F_selectStatus = By.xpath("//option[@value='1']");
	By F_SearchIPOStyle = By.xpath("//input[@formcontrolname='searchText']");
	By F_Reset = By.xpath("//button[@class='btn btn-md btn-light btn-active-light-primary mr-2']");
	By F_Apply = By.xpath("//button[@class='btn btn-md btn-primary']");
	By IPO = By.xpath("//a[@id='v-pills-tabTrendIPO']");
	By StyleSH = By.xpath("//a[@id='sidebarCollapse']");
	By buttGOTOTOP = By.xpath("//i[@class='ti-angle-up']");
	By buttAdd = By.xpath("//a[text()=' Add New Fabric']");
	By navAddFabricSheet = By.xpath("//h3[text()='Add Fabric To The Fabric Sheet']");
	By IsNominated = By.xpath("//label[@for='nominated']");
	By Supplier = By.xpath("//select[@formcontrolname='supplierId']");
	By Select_Supplier = By.xpath("//option[@value='11']");
	By FabricQuality = By.xpath("//input[@autocomplete='ad15c6b9940d']");
	By SelectFabricQuality = By.xpath("//span[text()='Cotton denim']");
	//div[@id='a5a4c6782d00-1']/..
	By scroll = By.xpath("//div[@class='ng-dropdown-panel-items scroll-host']");
	By Content = By.xpath("//select[@formcontrolname='content']");
	By SelectContent = By.xpath("//option[text()=' 100% cotton']");
	By Count = By.xpath("//select[@formcontrolname='construction']");
	By selectCount = By.xpath("//option[@value='COTTON DENIM 216 GM']");
	By GSM = By.xpath("//select[@formcontrolname='gsm']");
	By SelectGSM = By.xpath("//option[@value='216']");
	By CuttableWdt = By.xpath("//select[@formcontrolname='cuttableWidth']");
	By SelectCuttableWdt = By.xpath("//option[@value='58']");
	By Use = By.xpath("//select[@formcontrolname='use']");
	By SelectUse = By.xpath("//option[@value='192']");
	By SelectUse2 = By.xpath("//option[@value='193']");
	By Code = By.xpath("//select[@formcontrolname='supplierCode']");
	By SelectCode = By.xpath("//option[@value='WTS-006']");
	By Finish = By.xpath("//input[@formcontrolname='finishOrSpecial']");
	By Color = By.xpath("(//div[@class='ng-input'])[2]");
	By SelectColor = By.xpath("//span[text()='Alabaster']");
	By SelectColor2 = By.xpath("//span[text()='Blue']");
	By Combo = By.xpath("//select[@formcontrolname='comboId']");
	By SelectCombo = By.xpath("//option[@value='131']");
	By AddlInfo = By.xpath("//textarea[@formcontrolname='additionalInfo']");
	By Addl = By.xpath("//input[@formcontrolname='rejectionPercentage']");
	By MissyGarmentAvg = By.xpath("//input[@formcontrolname='missy_GarmentAvg']");
	By PetiteGarmentAvg = By.xpath("//input[@formcontrolname='petite_GarmentAvg']");
	By GarAvgUOM = By.xpath("//select[@formcontrolname='garmentAvgUOM']");
	By ReqUOM = By.xpath("//select[@formcontrolname='uom']");
	By CuttingWastage = By.xpath("//input[@formcontrolname='cuttingWastage']");
	By FabReqCut = By.xpath("//input[@formcontrolname='fabricRequredforCutting']");
	By FabReqSam = By.xpath("//input[@formcontrolname='fabricRequredforSampling']");
	By TotFabReq = By.xpath("//input[@formcontrolname='totalFabric']");
	By buttSubmit = By.xpath("//button[@class='btn btn-primary btn-md']");
	By buttCancel = By.xpath("//a[@class='btn btn-md btn-danger mr-2']");
	By navRevFabSheet = By.xpath("//h3[text()='Revised Fabric Sheet']");
	By buttDelete = By.xpath("(//button[@class='btn btn-sm btn-danger ng-star-inserted'])[1]");
	By DeleteValidmsg = By.xpath("//h2[text()='Are You Sure You Want To Delete?']");
	By buttYesmsg = By.xpath("//button[@class='swal2-confirm swal2-styled']");
	By buttNomsg = By.xpath("//button[@class='swal2-cancel swal2-styled']");
	By buttEdit = By.xpath("(//button[@class='btn btn-sm btn-info mr-1 ng-star-inserted'])[1]");
	By navUpdatefabricsheet = By.xpath("//h3[text()='Update Fabric To The Fabric Sheet']");
	By buttSubmitTeam = By.xpath("//button[@class='btn btn-md btn-primary btn-active-light-primary ng-star-inserted']");
	By popupUpchargeAmt = By.xpath("//h5[text()='Upcharge Amount']");
	By Amount = By.xpath("//input[@formcontrolname='upchargeAmount']");
	By Remarks = By.xpath("//textarea[@formcontrolname='upchargeRemarks']");
	By buttUpChrSubmit = By.xpath("(//button[@class='btn btn-primary'])[2]");
	By UpChrgValidationmsg = By.xpath("//h2[text()='Give UpCharge Amount']");
	By Reason = By.xpath("//input[@formcontrolname='revisedReason']");
	
	By buttImportFabDetl = By.xpath("//button[@class='btn btn-primary btn-sm']");
	By popImportWin = By.xpath("//h5[@id='importFabricDetailsLabel']");
	By buttImport = By.xpath("(//button[text()=' Import'])[1]");
	By buttICancel = By.xpath("//button[@class='btn btn-danger']");
	By optionWithinIPO = By.xpath("(//div[@class='form-check form-check-inline'])[1]");
	By optionOtherIPO = By.xpath("(//div[@class='form-check form-check-inline'])[2]");
	By optionPDFDSIPO = By.xpath("(//div[@class='form-check form-check-inline'])[3]");
	By ISectFabric = By.xpath("(//ng-select[@formcontrolname='fabricId'])[1]");
	By SelectSectFabric = By.xpath("(//div[@class='ng-option ng-star-inserted'])[1]");
	By IIPO = By.xpath("(//div[@class='ng-input'])[3]");
	By selectIIPO = By.xpath("//span[text()='TestIPO']");
	By selectIPOFabric = By.xpath("//span[text()='Cotton voile - Alabaster']");
	By selectPDFDSFabric = By.xpath("(//span[text()='Cotton voile'])[2]");
	By MandatoryValdMsg = By.xpath("//h2[text()='Mandatory Fields Are Required With  Valid Data.']");
	
	
	
	public void user_navigates_to_Login_page() {
		driver.get(prop.getProperty("url"));
	}
	public void Login_with_Production_Manager() {
		driver.findElement(txtUN).clear();
		driver.findElement(txtUN).sendKeys(prop.getProperty("username"));
//		utilities.MinimumWait(driver);
		driver.findElement(txtPwd).clear();
		driver.findElement(txtPwd).sendKeys(prop.getProperty("password"));
		
	}
	public void Click_on_the_SignIn_button() throws Throwable {
		driver.findElement(btnSignIn).click();
		Thread.sleep(10000);
	}
	public void user_navigates_to_Revised_Fabric_Sheet() throws Throwable {
		utilities.webDriverWait(driver, Woven);
		driver.findElement(Woven).click();
		utilities.webDriverWait(driver, Merchandising);
		driver.findElement(Merchandising).click();
		utilities.webDriverWait(driver, GenerateFabricSheet);
		driver.findElement(GenerateFabricSheet).click();
		utilities.webDriverWait(driver, RevisedFabricSheet);
		driver.findElement(RevisedFabricSheet).click();
	}
	public void click_on_Styles_expansion() throws Throwable {
		utilities.webDriverWait(driver, buttStyleSH);
		driver.findElement(buttStyleSH).click();
		
	}
	public void Verify_whether_user_is_able_to_Select_an_IPO_from_the_Menu_list() throws Throwable {
		utilities.webDriverWait(driver, IPO);
		driver.findElement(IPO).click();
	}
	public void click_on_clear_filter_icon() throws Throwable {
		utilities.webDriverWait(driver, buttNoFilter);
		driver.findElement(buttNoFilter).click();
	}

	public void Click_on_buyer_dropdown() throws Throwable {
		utilities.webDriverWait(driver, F_Buyer);
		driver.findElement(F_Buyer).click();
		
	}
	public void Enter_Buyer_in_search_box() throws Throwable {
		utilities.webDriverWait(driver, F_EnterBuyer);
		driver.findElement(F_EnterBuyer).sendKeys("te");
	}
	public void Select_Buyer_from_dropdown_lists() throws Throwable {
		utilities.webDriverWait(driver, F_SelectBuyer);
		driver.findElement(F_SelectBuyer).click();
		driver.findElement(F_Buyer).click();
	}
	public void Click_on_the_Seasons_dropdown_field() throws Throwable {
		utilities.webDriverWait(driver, F_Seasons);
		driver.findElement(F_Seasons).click();
	}
	public void Select_a_Season() throws Throwable {
		utilities.webDriverWait(driver, F_selectSeason);
		driver.findElement(F_selectSeason).click();
	}
	public void Click_in_the_Status_dropdown_field() throws Throwable {
		utilities.webDriverWait(driver, F_Status);
		driver.findElement(F_Status).click();
	}
	public void Select_a_Status() throws Throwable {
		utilities.webDriverWait(driver, F_selectStatus);
		driver.findElement(F_selectStatus).click();
	}
	public void Enter_an_IPO_name_in_the_Search_by_Buyer_Style_or_IPO_textbox_field() throws Throwable {
		utilities.webDriverWait(driver, F_SearchIPOStyle);
		driver.findElement(F_SearchIPOStyle).click();
	}
	public void Click_on_the_Filt_Apply_button() throws Throwable {
		utilities.webDriverWait(driver, F_Apply);
		driver.findElement(F_Apply).click();
	}
	public void Click_on_Filter_button() throws Throwable {
		utilities.webDriverWait(driver, buttonFilter);
		driver.findElement(buttonFilter).click();
	}
	public void Verify_whether_data_is_getting_cleared_or_not_on_OnClick_the_Reset_button() throws Throwable {
		utilities.webDriverWait(driver, F_Reset);
		driver.findElement(F_Reset).click();
		driver.findElement(F_Apply).click();
	}
	public void Verify_whether_the_user_is_able_to_Select_an_IPO_from_the_Menu_list() throws Throwable {
		utilities.webDriverWait(driver, IPO);
		driver.findElement(IPO).click();
		Thread.sleep(5000);
		driver.findElement(buttGOTOTOP).click();
	}
	public void Click_on_buyer1_dropdown() throws Throwable {
		utilities.webDriverWait(driver,F_Buyer);
		driver.findElement(F_Buyer).click();
		
	}
	
	public void Click_on_the_Style_ShowHide_button_for_closing_the_menu_list() throws Throwable {
		utilities.webDriverWait(driver,buttStyleSH);
		driver.findElement(buttStyleSH).click();
	}
	public void Verify_the_count_of_the_Fabric_records_under_the_Fabric_Details_grid() throws Throwable {
		utilities.webDriverWait(driver,FabDetgrid);
//		driver.findElement(FabDetgrid).click();
		WebElement table = driver.findElement(FabDetgrid);

        // Get the rows of the table
        java.util.List<WebElement> rows = table.findElements(By.tagName("tr"));

        // Get the count of rows (excluding the header row)
        int rowCount = rows.size();

        // Assert the expected record count
//        int expectedRowCount = 11; // Change this value based on your expectation
//        Assert.assertEquals(expectedRowCount, rowCount);
        System.out.println("Display the count of the Fabrics added to the grid - " +rowCount);
    }
	
	public void click_on_Add_data_button() throws Throwable {
		utilities.webDriverWait(driver,buttAdd);
		driver.findElement(buttAdd).click();
		driver.findElement(navAddFabricSheet);
		WebElement RevFabSheet = driver.findElement(navAddFabricSheet);
		String RevisedFabricSheet = RevFabSheet.getText();
		if(RevFabSheet.isDisplayed()){
			System.out.println("The screen is navigated to " + RevisedFabricSheet + " screen");
		} else {
			System.out.println("The screen is not navigated to " + RevisedFabricSheet);
		}
	}
	public void Click_on_the_Is_Nominated_textbox_field() throws Throwable {
		utilities.webDriverWait(driver,IsNominated);
		driver.findElement(IsNominated).click();
	}
	public void Verify_whether_the_Supplier_Name_field_is_changed_to_enbaled_state_or_not() throws Throwable {
		utilities.webDriverWait(driver,Supplier);
		WebElement IsNominate = driver.findElement(Supplier);
		if (IsNominate.isEnabled())
		{
			System.out.println("The Is Nominated field is in 'Enabled' state");
		}else {
			System.out.println("The Is Nominated field is in 'Disabled' state");
		}
//		boolean IsNominated = nominate.isEnabled();
//		Assert.assertEquals(IsNominated, "The Is Nominated field is in an enabled state.");
	}
	public void Click_in_the_Supplier_Name_dropdown_field() throws Throwable {
		utilities.webDriverWait(driver,Supplier);
		driver.findElement(Supplier).click();
	}
	public void Select_a_Supplier_from_the_dropdown_field() throws Throwable {
		utilities.webDriverWait(driver,Select_Supplier);
		driver.findElement(Select_Supplier).click();
		WebElement Supplier = driver.findElement(Select_Supplier);
		String SupplierName = Supplier.getText();
		System.out.println("Display the selected Supplier Name : " + SupplierName);
	}
	public void Verify_whether_the_user_is_able_to_select_the_Fabric_Quality_from_the_dropdown_list_in_the_Fabric_Quality_field() throws Throwable {
		utilities.webDriverWait(driver,FabricQuality);
		driver.findElement(FabricQuality).click();
		utilities.MediumWait(driver);
		driver.findElement(SelectFabricQuality).click();
		WebElement Quality = driver.findElement(SelectFabricQuality);
		String QualityName = Quality.getText();
		System.out.println("Selected Fabric Quality - " + QualityName);
	}
	public void Verify_whether_the_Contetnt_value_is_selected_or_not_for_the_selected_fabric() throws Throwable {
		utilities.webDriverWait(driver,Content);
		driver.findElement(Content).click();
		utilities.MediumWait(driver);
		driver.findElement(SelectContent).click();
		WebElement Content = driver.findElement(SelectContent);
		String ContentName = Content.getText();
		System.out.println("Selected Content - " + ContentName);
	}
	public void Verify_whether_the_Count_Construction_value_is_selected_or_not_for_the_selected_fabric() throws Throwable {
		utilities.webDriverWait(driver,Count);
		driver.findElement(Count).click();
		utilities.MediumWait(driver);
		driver.findElement(selectCount).click();
		WebElement CountCon = driver.findElement(selectCount);
		String ConstructionName = CountCon.getText();
		System.out.println("Selected Count/Construnction - " + ConstructionName);	
	}
	public void Verify_whether_the_GSM_value_is_selected_or_not_for_the_selected_fabric() throws Throwable {
		utilities.webDriverWait(driver,GSM);
		driver.findElement(GSM).click();
		utilities.MediumWait(driver);
		driver.findElement(SelectGSM).click();
		WebElement GSMval = driver.findElement(SelectGSM);
		String GSMvalue = GSMval.getText();
		System.out.println("Selected GSM - " + GSMvalue);
		
	}
	public void Verify_whether_the_Cuttable_Width_value_is_selected_or_not_for_the_selected_fabric() throws Throwable {
		utilities.webDriverWait(driver,CuttableWdt);
		driver.findElement(CuttableWdt).click();
		utilities.MediumWait(driver);
		driver.findElement(SelectCuttableWdt).click();
		WebElement Cuttable = driver.findElement(SelectCuttableWdt);
		String Cuttablevalue = Cuttable.getText();
		System.out.println("Selected Cuttable Width - " + Cuttablevalue);
	}
	public void Verify_whether_the_Use_value_is_selected_or_not_for_the_selected_fabric() throws Throwable {
		utilities.webDriverWait(driver,Use);
		driver.findElement(Use).click();
		utilities.MediumWait(driver);
		driver.findElement(SelectUse).click();
		WebElement Usetype = driver.findElement(SelectUse);
		String Usevalue = Usetype.getText();
		System.out.println("Selected Use - " + Usevalue);
	}
	public void Verify_whether_the_Supplier_Internal_Code_value_is_selected_or_not_for_the_selected_fabric() throws Throwable {
		utilities.webDriverWait(driver,Code);
		driver.findElement(Code).click();
		utilities.MediumWait(driver);
		driver.findElement(SelectCode).click();
		WebElement InterCode = driver.findElement(SelectCode);
		String SupplierCode = InterCode.getText();
		System.out.println("Selected Supplier/Internal Code - " + SupplierCode);
	}
	public void Enter_the_data_in_the_Finish_Special_Requirements_textbox_field() throws Throwable {
		utilities.webDriverWait(driver,Finish);
		driver.findElement(Finish).sendKeys("Finish 1");
		WebElement SpeReq = driver.findElement(Finish);
		String FinishSpeReq = SpeReq.getAttribute("value");
		System.out.println("Display the entered Finish Special Requirment - " + FinishSpeReq);
	}
	public void Verify_whether_the_Color_is_selected_or_not_for_the_selected_fabric() throws Throwable {
		utilities.webDriverWait(driver,Color);
		driver.findElement(Color).click();
		utilities.MediumWait(driver);
		driver.findElement(SelectColor).click();
		WebElement color = driver.findElement(SelectColor);
		String secColor = color.getText();
		System.out.println("Display the Selected Color - " + secColor);
	}
	public void Verify_whether_the_Applicable_Combo_is_selected_or_not_for_the_selected_fabric() throws Throwable {
		utilities.webDriverWait(driver,Combo);
		driver.findElement(Combo).click();
		utilities.MediumWait(driver);
		driver.findElement(SelectCombo).click();
		WebElement AppCombo = driver.findElement(SelectCombo);
		String ApplicableCombo = AppCombo.getText();
		System.out.println("Display the Selected Applicable Combo - " + ApplicableCombo);
	}
	public void Enter_the_data_in_the_Additional_Information_textbox_field() throws Throwable {
		utilities.webDriverWait(driver,AddlInfo);
		driver.findElement(AddlInfo).sendKeys("Test Additional Information");
		WebElement info = driver.findElement(AddlInfo);
		String AddInfo = info.getAttribute("value");
		System.out.println("Display the entered Additional Information msg - " + AddInfo);
	}
	public void Enter_the_data_in_the_Additional_percentage_textbox_field() throws Throwable {
		utilities.webDriverWait(driver,Addl);
		driver.findElement(Addl).clear();
		driver.findElement(Addl).sendKeys("4");
		WebElement addtional = driver.findElement(Addl);
		String Additionalpercentage = addtional.getAttribute("value");
		System.out.println("Display the entered Additional percentage - " + Additionalpercentage);
	}
	public void Enter_the_data_in_the_Missy_Garment_Avg_textbox_field() throws Throwable {
		utilities.webDriverWait(driver,MissyGarmentAvg);
		driver.findElement(MissyGarmentAvg).clear();
		driver.findElement(MissyGarmentAvg).sendKeys("6");
		WebElement MissyGarAvg = driver.findElement(MissyGarmentAvg);
		String Missy = MissyGarAvg.getAttribute("value");
		System.out.println("Display the entered Missy Garment Average - " + Missy);
	}
	public void Enter_the_data_in_the_Petite_Garment_Avg_textbox_field() throws Throwable {
		utilities.webDriverWait(driver,PetiteGarmentAvg);
		driver.findElement(PetiteGarmentAvg).clear();
		driver.findElement(PetiteGarmentAvg).sendKeys("8");
		WebElement PetiteGArAvg = driver.findElement(PetiteGarmentAvg);
		String Petite = PetiteGArAvg.getAttribute("value");
		System.out.println("Display the entered Petite Garment Average - " + Petite);
	}
	public void Verifying_the_Garment_Average_UOM_dropdown_field_default_value() throws Throwable {
		utilities.webDriverWait(driver,GarAvgUOM);
//		driver.findElement(GarAvgUOM).sendKeys("8");
		WebElement GArAvg = driver.findElement(GarAvgUOM);
		String GArAvgValue = GArAvg.getAttribute("value");
		System.out.println("Display the default Garment Avgerage UOM - " + GArAvgValue);
	}
	public void Verifying_the_Required_UOM_dropdown_field_default_value() throws Throwable {
		utilities.webDriverWait(driver,ReqUOM);
//		driver.findElement(ReqUOM).sendKeys("8");
		WebElement Requnit = driver.findElement(ReqUOM);
		String ReqUOMVal = Requnit.getAttribute("value");
		System.out.println("Display the default Required UOM - " + ReqUOMVal);	
	}
	public void Verifying_the_Cutting_Wastage_textbox_field_default_value() throws Throwable {
		utilities.webDriverWait(driver,CuttingWastage);
//		driver.findElement(CuttingWastage).sendKeys("8");
		WebElement CutWas = driver.findElement(CuttingWastage);
		String CutWastage = CutWas.getAttribute("value");
		System.out.println("Display Default Cutting Wastage value - " + CutWastage);
	}
	public void Verifying_the_Fabric_Required_For_Cutting_value() throws Throwable {
		utilities.webDriverWait(driver,FabReqCut);
//		driver.findElement(FabReqCut).sendKeys("8");
		WebElement CutReq = driver.findElement(FabReqCut);
		String CutReqFab = CutReq.getAttribute("value");
		System.out.println("Display the Fabric Required For Cutting prepopulated value - " + CutReqFab);
	}
	public void Enter_the_value_in_the_Fabric_Required_For_Sampling_textbox_field() throws Throwable {
		utilities.webDriverWait(driver,FabReqSam);
		driver.findElement(FabReqSam).clear();
		driver.findElement(FabReqSam).sendKeys("23.567");
		WebElement Sample = driver.findElement(FabReqSam);
		String FabSampling = Sample.getAttribute("value");
		System.out.println("Display the entered Fabric Required for Sampling value - " + FabSampling);
	}
	public void Verifying_the_Fabric_Total_Fabric_Required_value() throws Throwable {
		utilities.webDriverWait(driver,TotFabReq);
//		driver.findElement(TotFabReq).sendKeys("8");
		WebElement TotFab = driver.findElement(TotFabReq);
		String TotalFabReq= TotFab.getAttribute("value");
		System.out.println("Display the Total Fabric Required prepopulated value - " + TotalFabReq);	
	}
	public void Click_on_Submit_button() throws Throwable {
		utilities.webDriverWait(driver,buttSubmit);
		driver.findElement(buttSubmit).click();
	}
	public void Verify_whether_the_page_is_navigated_to_the_Revised_Fabric_Sheet() throws Throwable {
		utilities.webDriverWait(driver,navRevFabSheet);
//		driver.findElement(navRevFabSheet).click();
		driver.findElement(navRevFabSheet);
		WebElement RevFabSheet = driver.findElement(navRevFabSheet);
		String RevisedFabricSheet = RevFabSheet.getText();
		if(RevFabSheet.isDisplayed()){
			System.out.println("The screen is navigated to " + RevisedFabricSheet + " screen");
		} else {
			System.out.println("The screen is not navigated to " + RevisedFabricSheet);
		}
	}
	public void Click_on_Cancel_button() throws Throwable {
		utilities.webDriverWait(driver,buttCancel);
		driver.findElement(buttCancel).click();
		System.out.println("Clicked on Cancel button");
		driver.findElement(buttGOTOTOP).click();
		driver.findElement(navRevFabSheet);
		WebElement RevFabSheet = driver.findElement(navRevFabSheet);
		String RevisedFabricSheet = RevFabSheet.getText();
		
		if(RevFabSheet.isDisplayed()){
			System.out.println("The screen is navigated to " + RevisedFabricSheet + " screen");
		} else {
			System.out.println("The screen is not navigated to " + RevisedFabricSheet);
		}
		
		try {
            Robot robot = new Robot();
		
            robot.delay(2000);
		
            int scrollAmount = 25;
            for (int i = 0; i < scrollAmount; i++) {
                robot.keyPress(KeyEvent.VK_UP);
                robot.keyRelease(KeyEvent.VK_UP);
                robot.delay(1000);
            }

        } catch (AWTException e) {
            e.printStackTrace();
        }
		driver.findElement(buttAdd).click();
		System.out.println("Clicked on Add New Fabric button");
	}
	public void Click_on_the_Delete_button_for_a_Quality() throws Throwable {
		utilities.webDriverWait(driver,buttDelete);
		driver.findElement(buttGOTOTOP).click();
		utilities.MinimumWait(driver);
		driver.findElement(buttDelete).click();
		System.out.println("Clicked on the Delete button");
		
	}
	public void Verify_whether_the_Delete_prompt_msg_is_displayed_or_not() throws Throwable {
		utilities.webDriverWait(driver,DeleteValidmsg);
//		driver.findElement(DeleteValidmsg).click();
		WebElement Deletemsg = driver.findElement(DeleteValidmsg);
		String DeleteValidation = Deletemsg.getText();
		if(Deletemsg.isDisplayed()){
			System.out.println("The screen is navigated to " + DeleteValidation + " screen");
		} else {
			System.out.println("The screen is not navigated to " + DeleteValidation);
		}
	}
	public void Click_on_the_No_option_in_the_delete_prompt() throws Throwable {
		utilities.webDriverWait(driver,buttNomsg);
		driver.findElement(buttNomsg).click();
	}
	public void Verify_whether_the_respective_added_Fabric_record_is_deleted_or_not_on_clicking_the_Yes_option() throws Throwable {
		utilities.webDriverWait(driver,buttDelete);
		driver.findElement(buttDelete).click();
		driver.findElement(buttYesmsg).click();
		System.out.println("The first record in the grid has deleted");
//		utilities.webDriverWait(driver,buttSubmitTeam);
//		driver.findElement(buttSubmitTeam).click();
	}
	public void Verify_whether_the_page_is_navigating_to_the_Updated_page_or_not_on_clicking_the_Edit_button() throws Throwable {
//		utilities.webDriverWait(driver,buttGOTOTOP);
//		driver.findElement(buttGOTOTOP).click();
		utilities.MinimumWait(driver);
		utilities.webDriverWait(driver,buttEdit);
		driver.findElement(buttEdit).click();
		System.out.println("Click on the first fabric edit button");
		utilities.webDriverWait(driver,navUpdatefabricsheet);
		driver.findElement(navUpdatefabricsheet);
		WebElement URevFabSheet = driver.findElement(navUpdatefabricsheet);
		String UpRevisedFabricSheet = URevFabSheet.getText();
		if(URevFabSheet.isDisplayed()){
			System.out.println("The screen is navigated to " + UpRevisedFabricSheet + " screen");
		} else {
			System.out.println("The screen is not navigated to " + UpRevisedFabricSheet);
		}
	}
	
	@SuppressWarnings("unused")
	public void Click_on_the_Submit_to_Fabric_Team() throws Throwable {
		utilities.MinimumWait(driver);
		driver.findElement(buttGOTOTOP).click();
		driver.findElement(navRevFabSheet);
		WebElement RevFabSheet = driver.findElement(navRevFabSheet);
		String RevisedFabricSheet = RevFabSheet.getText();
		
		if(RevFabSheet.isDisplayed()){
			System.out.println("The screen is navigated to  " + RevisedFabricSheet + " screen1");
		} else {
			System.out.println("The screen is not navigated to " + RevisedFabricSheet);
		}
		
		try {
            Robot robot = new Robot();
		
            robot.delay(2000);
		
            int scrollAmount = 25;
            for (int i = 0; i < scrollAmount; i++) {
                robot.keyPress(KeyEvent.VK_UP);
                robot.keyRelease(KeyEvent.VK_UP);
                robot.delay(1000);
            }

        } catch (AWTException e) {
            e.printStackTrace();
        }
		driver.findElement(Reason).isDisplayed();
		WebElement reason = driver.findElement(Reason);
		String ReasonRev = reason.getAttribute("value");
		
		if (!(reason == null))
		{
		
//			driver.findElement(buttGOTOTOP).click();
						Thread.sleep(5000);
//			driver.findElement(Reason).clear();
			driver.findElement(Reason).sendKeys("Reason 1");
			driver.findElement(navRevFabSheet);
			WebElement RevFabSheet1 = driver.findElement(navRevFabSheet);
			String RevisedFabricSheet1 = RevFabSheet1.getText();
			
			if(RevFabSheet.isDisplayed()){
				System.out.println("The screen is navigated to " + RevisedFabricSheet1 + " screen2");
			} else {
				System.out.println("The screen is not navigated to " + RevisedFabricSheet1);
			}
			
			try {
	            Robot robot = new Robot();
			
	            robot.delay(2000);
			
	            int scrollAmount = 25;
	            for (int i = 0; i < scrollAmount; i++) {
	                robot.keyPress(KeyEvent.VK_DOWN);
	                robot.keyRelease(KeyEvent.VK_DOWN);
	                robot.delay(1000);
	            }

	        } catch (AWTException e) {
	            e.printStackTrace();
	        }

			utilities.webDriverWait(driver, buttSubmitTeam);
			driver.findElement(buttSubmitTeam).click();
		}
		else {
			utilities.webDriverWait(driver,buttSubmitTeam);
			driver.findElement(buttSubmitTeam).click();
		}
		
	}
	public void Verify_whether_the_Upcharge_Amount_popup_window_is_opened_or_not() throws Throwable {
		utilities.webDriverWait(driver,popupUpchargeAmt);
		driver.findElement(popupUpchargeAmt).isDisplayed();
		WebElement Upcharge = driver.findElement(popupUpchargeAmt);
		String UpchargeAmt = Upcharge.getText();
		System.out.println("Display the Upcharge Amount popup window name " + UpchargeAmt);
	}
	public void Enter_the_value_in_the_Amount_field() throws Throwable {
		utilities.webDriverWait(driver,Amount);
		driver.findElement(Amount).sendKeys("34567");
	}
	public void Enter_the_Remarks() throws Throwable {
		utilities.webDriverWait(driver,Remarks);
		driver.findElement(Remarks).sendKeys("Entering Upcharging Remarks in the field");
	}
	public void Click_on_the_Submit_button_in_the_Upcharge_window() throws Throwable {
		utilities.webDriverWait(driver,buttUpChrSubmit);
		driver.findElement(buttUpChrSubmit).click();
	}
	public void Verify_whether_the_validation_msg_is_displayed_when_click_on_Submit_with_Null_values() throws Throwable {
		utilities.MediumWait(driver);
		driver.findElement(buttUpChrSubmit).click();
		 WebElement AlertMsg = driver.findElement(UpChrgValidationmsg);
		 
			String actualMessage = AlertMsg.getText();

			String expectedMessage = "Give UpCharge Amount";

			if (expectedMessage.equals(actualMessage)) {
				System.out.println("Alert message is correct." + actualMessage);
			} else {
				System.out.println("Alert message is incorrect."+ actualMessage);
			}
	}
	public void Verify_and_Update_the_Field_values_displayed_in_the_fields() throws Throwable {
		utilities.webDriverWait(driver,FabricQuality);
		driver.findElement(FabricQuality).isDisplayed();
		WebElement FabQua = driver.findElement(FabricQuality);
		String FabricQuality = FabQua.getAttribute("value");
		System.out.println("Display the Fabric Quality name - " + FabricQuality);
		
	}
	public void Verify_and_Update_the_field_value_displayed_in_the_Content_field() throws Throwable {
		utilities.webDriverWait(driver,Content);
		driver.findElement(Content).isDisplayed();
		WebElement FabCont = driver.findElement(Content);
		String FabricContent = FabCont.getAttribute("value");
		System.out.println("Display the Fabric Content value - " + FabricContent);
	}
	public void Verify_and_Update_the_field_value_displayed_in_the_Count_field() throws Throwable {
		utilities.webDriverWait(driver,Count);
		driver.findElement(Count).isDisplayed();
		WebElement FabCount = driver.findElement(Count);
		String FabricCount = FabCount.getAttribute("value");
		System.out.println("Display the Fabric Count value - " + FabricCount);
	}
	public void Verify_and_Update_the_field_value_displayed_in_the_GSM_field() throws Throwable {
		utilities.webDriverWait(driver,GSM);
		driver.findElement(GSM).isDisplayed();
		WebElement FabGSM = driver.findElement(GSM);
		String FabricGSM = FabGSM.getAttribute("value");
		System.out.println("Display the Fabric GSM value - " + FabricGSM);
	}
	public void Verify_and_Update_the_field_value_displayed_in_the_Cuttable_Width_field() throws Throwable {
		utilities.webDriverWait(driver,CuttableWdt);
		driver.findElement(CuttableWdt).isDisplayed();
		WebElement FabCW = driver.findElement(CuttableWdt);
		String FabricCW = FabCW.getAttribute("value");
		System.out.println("Display the Fabric Cuttable Width value - " + FabricCW);
	}
	public void Verify_and_Update_the_field_value_displayed_in_the_Use_field() throws Throwable {
		utilities.webDriverWait(driver,SelectUse2);
		driver.findElement(SelectUse2).click();
		driver.findElement(Use).isDisplayed();
		WebElement FabUse = driver.findElement(SelectUse2);
		String FabricUse = FabUse.getText();
		System.out.println("Display the Fabric Use value - " + FabricUse);
		
	}
	public void Verify_and_Update_the_field_value_displayed_in_the_Color_field() throws Throwable {
		utilities.webDriverWait(driver,Color);
		driver.findElement(Color).click();
		driver.findElement(SelectColor2).click();
		driver.findElement(Color).isDisplayed();
		WebElement FabColor = driver.findElement(SelectColor2);
		String FabricColor = FabColor.getAttribute("value");
		System.out.println("Display the Fabric Color value - " + FabricColor);
		
	}
	public void Verify_and_Update_the_field_value_displayed_in_the_Combo_field() throws Throwable {
		utilities.webDriverWait(driver,Combo);
		driver.findElement(Combo).isDisplayed();
		WebElement FabCombo = driver.findElement(SelectCombo);
		String FabricCombo = FabCombo.getText();
		System.out.println("Display the Fabric Combo value - " + FabricCombo);
	}
	public void Verify_and_Update_the_field_value_displayed_in_the_Additional_field() throws Throwable {
		utilities.webDriverWait(driver,Addl);
		driver.findElement(Addl).clear();
		driver.findElement(Addl).sendKeys("3");
		driver.findElement(Addl).isDisplayed();
		WebElement FabAddlper = driver.findElement(Addl);
		String FabricAddlper = FabAddlper.getAttribute("value");
		System.out.println("Display the Additional percentage value - " + FabricAddlper);
	}
	public void Verify_and_Update_the_field_value_displayed_in_the_Garment_Avg_field() throws Throwable {
		utilities.webDriverWait(driver,MissyGarmentAvg);
		driver.findElement(MissyGarmentAvg).clear();
		driver.findElement(MissyGarmentAvg).sendKeys("5");
		driver.findElement(MissyGarmentAvg).isDisplayed();
		WebElement FabGarmentAvg = driver.findElement(MissyGarmentAvg);
		String FabricGarmentAvg = FabGarmentAvg.getAttribute("value");
		System.out.println("Display the Fabric Missy Garment Average value - " + FabricGarmentAvg);
	}
	public void Verify_and_Update_the_field_value_displayed_in_the_Fabric_Required_For_Sampling_field() throws Throwable {
		utilities.webDriverWait(driver,FabReqSam);
		driver.findElement(FabReqSam).clear();
		driver.findElement(FabReqSam).sendKeys("44.444");
		driver.findElement(FabReqSam).isDisplayed();
		WebElement FabReqSamp = driver.findElement(FabReqSam);
		String FabricReqSamp = FabReqSamp.getAttribute("value");
		System.out.println("Display the Fabric Required for Sampling value - " + FabricReqSamp);
	}
	public void Click_on_the_Update_button_in_the_Update_Fabric_Sheet_form() throws Throwable {
		utilities.webDriverWait(driver,buttSubmit);
		driver.findElement(buttSubmit).click();
	}
	public void Verify_whether_the_Import_popup_window_is_opened_when_clicked_on_the_Import_Fabric_Details_button() throws Throwable {
		utilities.webDriverWait(driver,buttImportFabDetl);
		driver.findElement(buttImportFabDetl).click();
		driver.findElement(popImportWin);
		WebElement ImpPopup = driver.findElement(popImportWin);
		String ImpPopupWin = ImpPopup.getText();
		
		if(ImpPopup.isDisplayed()){
			System.out.println("Opened the " + ImpPopupWin );
		} else {
			System.out.println("Did not Opened the " + ImpPopupWin );
		}
	}
	public void Click_on_Close_button_in_the_Import_popup_window() throws Throwable {
		utilities.webDriverWait(driver,buttICancel);
		driver.findElement(buttICancel).click();
		driver.findElement(navAddFabricSheet);
		WebElement AddFabSheet = driver.findElement(navAddFabricSheet);
		String AddFabFabricSheet = AddFabSheet.getText();
		if(AddFabSheet.isDisplayed()){
			System.out.println("The screen is navigated to " + AddFabFabricSheet + " screen");
		} else {
			System.out.println("The screen is not navigated to " + AddFabFabricSheet);
		}
	}
	public void Select_the_WithInIPO_option_in_the_Import_window() throws Throwable {
		utilities.webDriverWait(driver,buttImportFabDetl);
		driver.findElement(buttImportFabDetl).click();
		utilities.webDriverWait(driver,optionWithinIPO);
		driver.findElement(optionWithinIPO).click();
	}
	public void Verify_whether_Mandatory_validation_msg_is_displayed_or_not_on_Onclick_the_Import_button_without_selecting_any_values() throws Throwable {
		utilities.webDriverWait(driver,buttImport);
		driver.findElement(buttImport).click();
		System.out.println("Clicked on the Import button");
//		utilities.webDriverWait(driver,MandatoryValdMsg);
		WebElement Mandatorymsg = driver.findElement(MandatoryValdMsg);
		String MandValdmsg = Mandatorymsg.getText();
		if(Mandatorymsg.isDisplayed()){
			System.out.println("Display the Mandatory msg as " + MandValdmsg );
		} else {
			System.out.println("Did not Display the Mandatory msg as " + MandValdmsg);
		}
	}
	public void Verify_whether_the_user_is_able_to_add_the_selected_fabric_on_Importing() throws Throwable {
		utilities.webDriverWait(driver,ISectFabric);
		driver.findElement(ISectFabric).click();
		utilities.webDriverWait(driver,SelectSectFabric);
		driver.findElement(SelectSectFabric).click();
		System.out.println("Fabric selected");
		WebElement FabSec = driver.findElement(ISectFabric);
		String SelectedFab = FabSec.getText();
		System.out.println("Display the selected Fabric " + SelectedFab);
		utilities.webDriverWait(driver,buttImport);
		driver.findElement(buttImport).click();
	}
	public void Select_the_OtherIPO_option_in_the_Import_window() throws Throwable {
		utilities.webDriverWait(driver,buttImportFabDetl);
		driver.findElement(buttImportFabDetl).click();
		utilities.webDriverWait(driver,optionOtherIPO);
		driver.findElement(optionOtherIPO).click();
	}
	public void Verify_whether_Mandatory_validation_msg_is_displayed_or_not_on_Onclick_the_Import_button_without_selecting_any_value() throws Throwable {
		utilities.webDriverWait(driver,buttImport);
		driver.findElement(buttImport).click();
		WebElement Mandatorymsg = driver.findElement(MandatoryValdMsg);
		String MandValdmsg = Mandatorymsg.getText();
		if(Mandatorymsg.isDisplayed()){
			System.out.println("Display the Mandatory msg as " + MandValdmsg );
		} else {
			System.out.println("Did not Display the Mandatory msg as " + MandValdmsg);
		}
	}
	public void Verify_whether_the_user_is_able_to_select_an_IPO_in_the_dropdown_or_not() throws Throwable {
		utilities.webDriverWait(driver,optionOtherIPO);
		driver.findElement(optionOtherIPO).click();
		utilities.webDriverWait(driver,IIPO);
		driver.findElement(IIPO).click();
		utilities.webDriverWait(driver,selectIIPO);
		driver.findElement(selectIIPO).click();
		WebElement IPO = driver.findElement(selectIIPO);
		String SecIPO = IPO.getText();
		System.out.println("Display the selected IPO in the IPO field - " + SecIPO);
	}
	public void Verify_whether_the_Select_Fabric_field_is_displayed_or_not() throws Throwable {
		utilities.webDriverWait(driver,ISectFabric);
		driver.findElement(ISectFabric).click();
		utilities.webDriverWait(driver,selectIPOFabric);
		driver.findElement(selectIPOFabric).click();
		WebElement Fabric = driver.findElement(selectIPOFabric);
		String SecFabric = Fabric.getText();
		System.out.println("Display the selected IPO in the IPO field - " + SecFabric);
	}
	public void Verify_whether_the_user_is_able_to_add_the_selected_fabric_on_Importing_or_not() throws Throwable {
		utilities.webDriverWait(driver,buttImport);
		driver.findElement(buttImport).click();
		driver.findElement(navAddFabricSheet);
		WebElement AddFabSheet = driver.findElement(navAddFabricSheet);
		String AddFabFabricSheet = AddFabSheet.getText();
		if(AddFabSheet.isDisplayed()){
			System.out.println("The screen is navigated to " + AddFabFabricSheet + " screen");
		} else {
			System.out.println("The screen is not navigated to " + AddFabFabricSheet);
		}
	}
	public void Select_the_PDFDS_option_in_the_Import_window() throws Throwable {
		utilities.webDriverWait(driver,buttImportFabDetl);
		driver.findElement(buttImportFabDetl).click();
		utilities.webDriverWait(driver,optionPDFDSIPO);
		driver.findElement(optionPDFDSIPO).click();
	}
	public void Verify_whether_mandatory_validation_msg_is_displayed_or_not_on_Onclick_the_Import_button_without_selecting_any_values() throws Throwable {
		utilities.webDriverWait(driver,buttImport);
		driver.findElement(buttImport).click();
		WebElement Mandatorymsg = driver.findElement(MandatoryValdMsg);
		String MandValdmsg = Mandatorymsg.getText();
		if(Mandatorymsg.isDisplayed()){
			System.out.println("Display the Mandatory msg as " + MandValdmsg );
		} else {
			System.out.println("Did not Display the Mandatory msg as " + MandValdmsg);
		}
	}
	public void Verify_whether_the_user_is_able_to_add_the_Selected_Fabric_on_Importing() throws Throwable {
		utilities.webDriverWait(driver,ISectFabric);
		driver.findElement(ISectFabric).click();
		utilities.webDriverWait(driver,selectPDFDSFabric);
		driver.findElement(selectPDFDSFabric).click();
		WebElement FabSec = driver.findElement(selectPDFDSFabric);
		String SelectedFab = FabSec.getText();
		System.out.println("Display the selected Fabric " + SelectedFab);
		utilities.webDriverWait(driver,buttImport);
		driver.findElement(buttImport).click();
	}
	public void Verify_whether_the_imported_fabric_is_able_to_Submit_to_the_Fabric_Team_or_not() throws Throwable {
		utilities.webDriverWait(driver,Use);
		driver.findElement(Use).click();
		utilities.MediumWait(driver);
		driver.findElement(SelectUse).click();
		WebElement Usetype = driver.findElement(SelectUse);
		String Usevalue = Usetype.getText();
		System.out.println("Selected Use - " + Usevalue);
		
		utilities.webDriverWait(driver,Color);
		driver.findElement(Color).click();
		utilities.MediumWait(driver);
		driver.findElement(SelectColor).click();
		WebElement color = driver.findElement(SelectColor);
		String secColor = color.getText();
		System.out.println("Display the Selected Color - " + secColor);
		
		utilities.webDriverWait(driver,Addl);
		driver.findElement(Addl).clear();
		driver.findElement(Addl).sendKeys("4");
		
		utilities.webDriverWait(driver,MissyGarmentAvg);
		driver.findElement(MissyGarmentAvg).clear();
		driver.findElement(MissyGarmentAvg).sendKeys("6");
		
		utilities.webDriverWait(driver,FabReqSam);
		driver.findElement(FabReqSam).clear();
		driver.findElement(FabReqSam).sendKeys("12");
		
		utilities.webDriverWait(driver,buttSubmit);
		driver.findElement(buttSubmit).click();
		utilities.webDriverWait(driver,buttSubmitTeam);
		driver.findElement(buttSubmitTeam).click();
		
		utilities.webDriverWait(driver,popupUpchargeAmt);
		driver.findElement(popupUpchargeAmt).click();
		utilities.webDriverWait(driver,Amount);
		driver.findElement(Amount).sendKeys("12345");
		utilities.webDriverWait(driver,buttUpChrSubmit);
		driver.findElement(buttUpChrSubmit).click();
		
	}
	
//	By buttImportFabDetl = By.xpath("//button[@class='btn btn-primary btn-sm']");
//	By popImportWin = By.xpath("//h5[@id='importFabricDetailsLabel']");
//	By buttImport = By.xpath("//h5[@class='btn btn-primary']");
//	By buttICancel = By.xpath("//button[@class='btn btn-danger']");
//	By optionWithinIPO = By.xpath("(//div[@class='form-check form-check-inline'])[1]");
//	By optionOtherIPO = By.xpath("(//div[@class='form-check form-check-inlin'])[2]");
//	By optionPDFDSIPO = By.xpath("(//div[@class='form-check form-check-inlin'])[3]");
//	By ISectFabric = By.xpath("(//ng-select[@formcontrolname='fabricId'])[1]");
//	By SelectSectFabric = By.xpath("//div[@id='ac6fa04c31d7-0']");
//	By IIPO = By.xpath("(//div[@class='ng-input'])[3]");
//	By selectIIPO = By.xpath("//div[@id='a1f3ab5135c7-1']");
//	
	
	


}
