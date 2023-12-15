package Page;

import org.openqa.selenium.By;

import util.DriverFactory;
import util.Utilities;

public class LoginPage extends DriverFactory{
	Utilities utilities = new Utilities();
	
	
	By SignIn   = By.xpath("//button[@class='btn btn-block btn-primary btn-lg font-weight-medium auth-form-btn']");
	By username = By.xpath("//input[@id='userName']");
	By password = By.xpath("//input[@id='userpassword']");
	By usericon = By.xpath("//img[@alt='User']");
	By forgot   = By.xpath("//a[@class='auth-link text-black']");
	By sign     = By.xpath("//a[text()='Submit']");
	By toggle   = By.xpath("//div[@class='invalid-feedback validation-msg ng-star-inserted']");
	By User     = By.xpath("//input[@placeholder='Enter Username / Email']");
	By security = By.xpath("//span[text()='Security ']");
	By Masters = By.xpath("//span[text()='Masters ']");
	By machine = By.xpath("//a[text()='Machine ']");
	By Add = By.xpath("//button[@class='btn btn-primary btn-sm shadow-sm float-right ng-star-inserted']");
	By submit = By.xpath("//button[@type='submit']");
	By machinename = By.xpath("//div[@data-validate='Machine Model Name is required']");
	By mingauge = By.xpath("//div[@data-validate='Min Gauge is required']");
	By maxgauge = By.xpath("//div[@data-validate='Max Gauge is required']");	
	By machinemodel = By.xpath("//input[@placeholder='Enter Machine Model Name']");
	By Min = By.xpath("//input[@placeholder='Enter Min Gauge']");
	By max = By.xpath("//input[@placeholder='Enter Max Gauge']");
//	By Woven = By. xpath ("//span[text()='Woven / knit']");
//	By PD = By.xpath("//ul[@class='mm-collapse mm-show']/..//span[text()='PD ']");
//	By StyleMaster = By.xpath("//a[text()=' Style Master ']");
//	By Filter = By.xpath("//button[@class='btn btn-primary btn-sm mr-3']");
//	By Buyer = By.xpath("//select[@class='form-control ng-pristine ng-valid ng-touched']");
//	By Style = By.xpath("//input[@placeholder='Search by style #']");
//	By Apply = By.xpath("//button[text()='Apply']");
//	
public void User_navigates_to_Login_page() throws Throwable {
driver.get(prop.getProperty("url"));
utilities.webDriverWait(driver, SignIn);
//driver.findElement(SignIn).click();
//utilities.MinimumWait(driver);
		
}
public void User_enters_the_username_and_password() throws Throwable {
utilities.webDriverWait(driver, username);
driver.findElement(username).sendKeys("Lokesh");
driver.findElement(password).sendKeys("Abcd@123");
utilities.MediumWait(driver);
	
}
	
public void User_click_on_the_signIn() throws Throwable {
utilities.webDriverWait(driver, password);		
driver.findElement(SignIn).click();
utilities.MaximumWait(driver);
		
}
	
public void User_click_on_the_user_icon() throws Throwable {
utilities.webDriverWait(driver, usericon);		
driver.findElement(usericon).click();
utilities.MaximumWait(driver);
}
	
	
public void User_click_on_the_security() throws Throwable {
utilities.webDriverWait(driver, security);		
driver.findElement(security).click();
utilities.MaximumWait(driver);
		
		
}

public void User_click_on_the_Master() throws Throwable {
utilities.webDriverWait(driver, Masters);		
driver.findElement(Masters).click();
utilities.MaximumWait(driver);
		
}

public void Click_on_the_Machine() throws Throwable {
utilities.webDriverWait(driver, machine);		
driver.findElement(machine).click();
utilities.MaximumWait(driver);
	
}

public void Click_on_the_add_button() throws Throwable {
utilities.webDriverWait(driver, Add);		
driver.findElement(Add).click();
utilities.MaximumWait(driver); 
		
}
public void click_on_the_Submit_button() throws Throwable {
utilities.webDriverWait(driver, submit);		
driver.findElement(submit).click();
utilities.MaximumWait(driver); 
		
		
}
public void click_on_the_machine_model_toggle_icon() throws Throwable {
utilities.webDriverWait(driver, machinename);		
driver.findElement(machinename).click();
utilities.MaximumWait(driver); 
		
}

public void click_on_the_min_gauge_icon() throws Throwable {
utilities.webDriverWait(driver, mingauge);		
driver.findElement(mingauge).click();
utilities.MaximumWait(driver);  
	
}

public void click_on_the_max_gauge_toggle_icon() throws Throwable {
utilities.webDriverWait(driver, maxgauge);		
driver.findElement(maxgauge).click();
utilities.MaximumWait(driver); 
		
}

public void User_enter_the_machine_model_name() throws Throwable {
utilities.webDriverWait(driver, machinemodel);
driver.findElement(machinemodel).sendKeys("ASGTr");
utilities.MediumWait(driver);
		
		
}

public void user_enter_the_Min_gauge()throws Throwable {
utilities.webDriverWait(driver, Min);
driver.findElement(Min).sendKeys("50");
utilities.MediumWait(driver); 
		
}

public void user_enter_the_max_gauge() throws Throwable {
utilities.webDriverWait(driver, max);
driver.findElement(max).sendKeys("60");
driver.findElement(submit).click();
utilities.MediumWait(driver);
	
}

public void User_enter_a_valid_username() throws Throwable {
utilities.webDriverWait(driver, username);
driver.findElement(username).sendKeys("Admin");
utilities.MediumWait(driver);
}

public void User_enter_an_invalid_password() throws Throwable {
utilities.webDriverWait(driver, password);
driver.findElement(password).sendKeys("Abd");
driver.findElement(SignIn).click();
utilities.MediumWait(driver);
}

public void User_leave_the_username_field_empty() throws Throwable {
utilities.webDriverWait(driver, username);
driver.findElement(username).sendKeys(" ");
utilities.MediumWait(driver); 

}

public void User_leave_the_password_field_empty() throws Throwable {
utilities.webDriverWait(driver, password);
driver.findElement(password).sendKeys(" ");
utilities.MediumWait(driver);  
		
}

public void User_click_on_the_forgot_password() throws Throwable {
utilities.webDriverWait(driver, forgot);		
driver.findElement(forgot).click();
utilities.MaximumWait(driver);
}

public void User_click_on_the_submit() throws Throwable {
utilities.webDriverWait(driver, sign);		
driver.findElement(sign).click();
utilities.MaximumWait(driver);
}
		
public void click_on_the_toggle_icon() throws Throwable {
utilities.webDriverWait(driver, toggle);		
driver.findElement(toggle).click();
utilities.MaximumWait(driver);
			
}

public void User_enter_the_username() throws Throwable {
utilities.webDriverWait(driver, User);
driver.findElement(User).sendKeys("Admin");
driver.findElement(sign).click();
utilities.MediumWait(driver);
		
			
}
//public void Click_on_the_Woven_Module() throws Throwable{
//utilities.webDriverWait(driver, Woven );
//driver.findElement(Woven).click();	
//utilities.MediumWait(driver);	
//}
//public void click_on_the_PD_Module() throws Throwable{
//	utilities.webDriverWait(driver, PD );
//	driver.findElement(PD).click();	
//	utilities.MediumWait(driver);	
//
//}
//public void click_on_the_Style_Master_screen() throws Throwable{
//	utilities.webDriverWait(driver, StyleMaster );
//	driver.findElement(StyleMaster).click();	
//	utilities.MediumWait(driver);	
//	
//}
//public void click_on_the_Filter_Icon() throws Throwable{
//	utilities.webDriverWait(driver, Filter );
//	driver.findElement(Filter).click();	
//	utilities.MediumWait(driver);	
//	
//}
//
//
//public void Verify_the_Filter_option_page() throws Throwable{
//	utilities.webDriverWait(driver, Filter );
//	boolean ElementPresent = driver.findElements(Filter).size()>0;
//   if(ElementPresent) {
//	utilities.webDriverWait(driver, Filter );
//	driver.findElement(Filter).click();	
//	utilities.MediumWait(driver);	
//	
//}
//    
public void click_on_the_PD_Module() {
	// TODO Auto-generated method stub
	
}
    

//} 
}






	

      
	


	