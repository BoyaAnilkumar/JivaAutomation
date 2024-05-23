package Page;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import util.DriverFactory;
import util.Utilities;

public class SW_PDYDS_Pages extends DriverFactory{
	
 Utilities utilities = new Utilities();
 By PD_YDS = By.xpath("//a[text()='PD YDS ']");
 By Select_IPO = By.xpath("//div/a[@id='v-pills-tabStyle3']");
 By Yarn_Quality = By.xpath("//ng-select[@formcontrolname='yarnQualityId']");
 By Stylesexpansion = By.xpath("//a[@id='sidebarCollapse']");
 By Spin_Type = By.xpath("//select[@formcontrolname='spinType']");
 By color = By.xpath("//ng-select[@formcontrolname='colorId']");
 By Count = By.xpath("//select[@formcontrolname='countOfConstruction']");
 By Finish_Enter = By.xpath("//input[@formcontrolname='finish']");
 By Specific_Requirement = By.xpath("//input[@formcontrolname='specificRequirement']");
 By Yarn_Quantity = By.xpath("//input[@formcontrolname='yarnQuantity']");
 By Use = By.xpath("//select[@formcontrolname='use']");
 By Add_New_Yarn = By.xpath("//a[text()='+ Add new Yarn']");
 By IsNominated = By.xpath("//label[text()=' Is Nominated? ']");
 
 
 
 
 
public void Click_on_PD_YDS_screen() throws Throwable {
	utilities.webDriverWait(driver, PD_YDS);
	driver.findElement(PD_YDS).click();
	utilities.MinimumWait(driver);
	
}

public void Select_the_Style_in_the_list_in_yarn_pd() throws Throwable {
	utilities.webDriverWait(driver, Select_IPO);
	driver.findElement(Select_IPO).click();
	utilities.MinimumWait(driver);
	
	utilities.webDriverWait(driver, Stylesexpansion);
	driver.findElement(Stylesexpansion).click();
	utilities.MinimumWait(driver);
	
}

public void Click_on_Add_New_yarn_in_Yarn_details_sheet() throws Throwable {
	utilities.webDriverWait(driver, Add_New_Yarn);
	driver.findElement(Add_New_Yarn).click();
	utilities.MinimumWait(driver);
	
}

public void Click_on_Yarn_Quality_and_Select_the_yarn_quality() throws Throwable {
	utilities.webDriverWait(driver, Yarn_Quality);
	driver.findElement(Yarn_Quality).click();
	Robot yarnquality = new Robot();
	yarnquality.keyPress(KeyEvent.VK_DOWN);
	yarnquality.keyPress(KeyEvent.VK_ENTER);
	Thread.sleep(1000);
	
	
}

public void Click_on_Spin_Type_and_Select_the(String spintype) throws Throwable {
	utilities.webDriverWait(driver, Spin_Type);
	WebElement SpinTypefield = driver.findElement(Spin_Type);
	Select Spintypedropdown = new Select(SpinTypefield);
	Spintypedropdown.selectByVisibleText(spintype);
	utilities.MinimumWait(driver);
	
}

 public void Click_on_Color_and_Select_the_color() throws Throwable {
	utilities.webDriverWait(driver, color);
	driver.findElement(color).click();
	Thread.sleep(1000);
	Robot Color = new Robot();
	Color.keyPress(KeyEvent.VK_DOWN);
	Color.keyPress(KeyEvent.VK_DOWN);
	Color.keyPress(KeyEvent.VK_ENTER);
	utilities.MinimumWait(driver);
	
	
}

public void click_on_count_and_select_the(String count) throws Throwable {
	utilities.webDriverWait(driver, Count);
	WebElement Countfield = driver.findElement(Count);
	Select Countdropdown = new Select(Countfield);
	Countdropdown.selectByVisibleText(count);
	utilities.MinimumWait(driver);
	
}

public void Enter_the_Finish_data_text_field(String finish) throws Throwable {
	utilities.webDriverWait(driver,Finish_Enter);
	driver.findElement(Finish_Enter).click();
	driver.findElement(Finish_Enter).sendKeys(finish);
	utilities.MinimumWait(driver);
	
	
}

public void Enter_Specific_Requirements(String sreq) throws Throwable {
	utilities.webDriverWait(driver, Specific_Requirement);
	driver.findElement(Specific_Requirement).click();
	driver.findElement(Specific_Requirement).sendKeys(sreq);
	utilities.MinimumWait(driver);
	
}

public void Enter_Yarn_Quantity(String yarnqty) throws Throwable {
	utilities.webDriverWait(driver, Yarn_Quantity);
	driver.findElement(Yarn_Quantity).click();
	driver.findElement(Yarn_Quantity).sendKeys(yarnqty);
	utilities.MinimumWait(driver);
}

public void Select_the_Use_from_dropdown(String use2) throws Throwable {
	utilities.webDriverWait(driver, Use);
	WebElement usedropdown = driver.findElement(Use);
	Select Usefield = new Select(usedropdown);
	Usefield.selectByVisibleText(use2);
	utilities.MinimumWait(driver);
	
}

public void Select_Is_Nominated_checkbox() throws Throwable {
	utilities.webDriverWait(driver, IsNominated);
	driver.findElement(IsNominated).click();
	utilities.MinimumWait(driver);
	
}




 
}
