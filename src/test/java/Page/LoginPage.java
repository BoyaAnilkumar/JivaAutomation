package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import util.DriverFactory;
import util.Utilities;

public class LoginPage extends DriverFactory{
	Utilities utilities = new Utilities();
	
	
	By SignIn   						= By.xpath("//button[@class='btn btn-block btn-primary btn-lg font-weight-medium auth-form-btn']");
	By username 						= By.xpath("//input[@id='userName']");
	By password 						= By.xpath("//input[@id='userpassword']");
	By usericon 						= By.xpath("//img[@alt='User']");
	By forgot   						= By.xpath("//a[@class='auth-link text-black']");
	By sign     						= By.xpath("//a[text()='Submit']");
	By toggle   						= By.xpath("//div[@class='invalid-feedback validation-msg ng-star-inserted']");
	By User     						= By.xpath("//input[@placeholder='Enter Username / Email']");
	By Logout   						= By.xpath("//a[text()='Log Out ']");
	By IncorrectValidation 				= By.xpath("//h2[text()='Invalid username and password']");
	By Forgot_Password					= By.xpath("//a[text()='Forgot password?']");
	By ForgotPass_Screen				= By.xpath("//h6[text()='Forgot Password ?']");
	By Submit_ForgotPass				= By.xpath("//a[text()='Submit']");
	By Validation_Msg					= By.xpath("//h2[text()='Mandatory Fields Are Required With  Valid Data.']");
	By Error_Text						= By.xpath("//div[@data-validate='User Name / Email is required']");
	By Enter_Email_Username				= By.xpath("//input[@formcontrolname='email']");
	By SuccessMsg_Forgot				= By.xpath("//h2[text()='Please check your email to reset your password.']");
	
	
	

public void User_navigates_to_Login_page() throws Throwable {
driver.get(prop.getProperty("url"));
utilities.MinimumWait(driver);
		
}
public void User_enters_the_username_and_password() throws Throwable {
utilities.webDriverWait(driver, username);
utilities.webDriverWait(driver, password);

driver.findElement(username).sendKeys("Admin");

driver.findElement(username).sendKeys("Lavanya");

utilities.MinimumWait(driver);
driver.findElement(password).sendKeys("Abcd@123");
utilities.MediumWait(driver);
	
}
	
public void User_click_on_the_signIn() throws Throwable {
utilities.webDriverWait(driver, SignIn);		
driver.findElement(SignIn).click();
utilities.MaximumWait(driver);
		
}
	
public void User_click_on_the_user_icon() throws Throwable {
utilities.webDriverWait(driver, usericon);		
driver.findElement(usericon).click();
utilities.MaximumWait(driver);
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
public void Click_on_Logout() throws Throwable {
	utilities.webDriverWait(driver, Logout);
	driver.findElement(Logout).click();
	utilities.MinimumWait(driver);
	
}
public void User_enters_invalid_username_and_valid_password() throws Throwable {
	utilities.webDriverWait(driver, username);
	driver.findElement(username).click();
	Thread.sleep(1000);
	driver.findElement(username).sendKeys("Anilk");
	Thread.sleep(1000);
	driver.findElement(password).click();
	Thread.sleep(1000);
	driver.findElement(password).sendKeys("Abcd@123");
	Thread.sleep(1000);
	driver.findElement(SignIn).click();
	Thread.sleep(1000);
	
	
}
public void Incorrect_User_Name_validation_message_should_be_displayed() throws Throwable {
	utilities.webDriverWait(driver, IncorrectValidation);
	driver.findElement(IncorrectValidation).click();
	Thread.sleep(1000);
	String incorrectvalid = driver.findElement(IncorrectValidation).getText();
	System.out.println(incorrectvalid);
	Thread.sleep(1000);
	
}
public void User_clicks_on_Forgot_password_link() throws Throwable {
	utilities.webDriverWait(driver, Forgot_Password);
	WebElement ForgotPass = driver.findElement(Forgot_Password);
	ForgotPass.click();
	System.out.println("Clicked on Forgot Password");
	
}
public void User_navigated_to_the_Forgot_Password_page() throws Throwable {
	utilities.webDriverWait(driver, ForgotPass_Screen);
	String ScreenForgotPassword = driver.findElement(ForgotPass_Screen).getText();
	System.out.println("User Navigated to " + ScreenForgotPassword);
	
}
public void User_without_enters_Email_Address_or_Username() throws Throwable {
	utilities.webDriverWait(driver, Submit_ForgotPass);
	driver.findElement(Submit_ForgotPass).click();
	Thread.sleep(1000);
	
	
}
public void validation_message_should_be_displayed_or_not() throws Throwable {
	utilities.webDriverWait(driver, Validation_Msg);
	driver.findElement(Validation_Msg).click();
	Thread.sleep(1000);
	WebElement validation = driver.findElement(Validation_Msg);
	String validation_msg = validation.getText();
	System.out.println("When clicked on submit button without entering email/username  " + validation_msg);
	Thread.sleep(1000);
	
	utilities.webDriverWait(driver, Error_Text);
	driver.findElement(Error_Text).click();
	utilities.MinimumWait(driver);
	
	
}
public void user_enter_the_valid_Email_Address() throws Throwable {
	utilities.webDriverWait(driver, Enter_Email_Username);
	driver.findElement(Enter_Email_Username).click();
	Thread.sleep(1000);
	driver.findElement(Enter_Email_Username).sendKeys("anilkumar@calibrage.in");
	Thread.sleep(1000);	
}
public void click_on_submit_button_in_forgot_password() throws Throwable {
	utilities.webDriverWait(driver, Submit_ForgotPass);
	driver.findElement(Submit_ForgotPass).click();
	Thread.sleep(4000);
	
	utilities.webDriverWait(driver, SuccessMsg_Forgot);
	driver.findElement(Submit_ForgotPass).click();
	Thread.sleep(1000);
	String sucforgot = driver.findElement(SuccessMsg_Forgot).getText();
	System.out.println(sucforgot);
}


//} 
}






	

      
	


	