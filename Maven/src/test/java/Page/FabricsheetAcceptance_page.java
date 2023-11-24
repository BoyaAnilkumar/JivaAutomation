package Page;

import org.openqa.selenium.By;

import util.Utilities;

public class FabricsheetAcceptance_page {
	
Utilities utilities = new Utilities();
	
	//Login Details and Select PD Orders
		By username 		= By.xpath("//input[@id='userName']");
		By password 		= By.xpath("//input[@id='userpassword']");
		By SignIn   		= By.xpath("//button[@class='btn btn-block btn-primary btn-lg font-weight-medium auth-form-btn']");
	
	//Navigating to Fabric Sheet Acceptance	
		By Woven 			= By.xpath ("//div[@class='nav_title']//span[text()='Woven / knit']");
		By Fabricsourcing 	= By.xpath("//span[text()='Fabric Sourcing ']");
		By Fabshtacceptance	= By.xpath("//a[text()='Fabric Sheet Acceptance']");
		
	//Verifying the filter	
		By stylesexpansion	= By.xpath("//a[@id='sidebarCollapse']");
		By Filtericon		= By.xpath("//button[@class='btn btn-primary btn-sm mb-2 float-right']");
		By Clearfilter		= By.xpath("//button[@class='btn btn-outline-secondary btn-sm mr-2 mb-2 float-right ng-star-inserted']");
		By Buyerdrp			= By.xpath("//div[@class='p-multiselect-label ng-tns-c92-28 p-placeholder']");
	
	public void Fabric_Manager_should_login_to_accept_the_fabric_sheet() {
		
		
	}

	public void navigate_to_dashboard_after_login_the_application_or_not() {
		
		
	}

	public void user_should_navigate_to_Fabric_sheet_acceptance_screen_by_clicking_on_menu() {
		
		
	}

	public void user_should_click_on_styles_expansion_to_view_the_IPOs() {
		
		
	}

	public void Verify_that_IPOs_are_displaying_in_styles_expansion_view() {
		
		
	}

	public void Click_on_filters_icon_to_apply_the_filter_to_get_the_IPOs() {
	
		
	}

}
