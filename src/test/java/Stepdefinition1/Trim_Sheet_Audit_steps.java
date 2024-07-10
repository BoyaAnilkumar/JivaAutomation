package Stepdefinition1;

import Page.Trim_Sheet_Audit_Page;
import io.cucumber.java.en.Then;

public class Trim_Sheet_Audit_steps {
       Trim_Sheet_Audit_Page   Trim_Sheet_Audit  = new Trim_Sheet_Audit_Page();
       
       
       @Then ("^Click on the Trim Sheet Audit under the Audit module$")
       public void Click_on_the_Trim_Sheet_Audit_under_the_Audit_module() throws Throwable {
    	   Trim_Sheet_Audit.Click_on_the_Trim_Sheet_Audit_under_the_Audit_module();
       }
}
