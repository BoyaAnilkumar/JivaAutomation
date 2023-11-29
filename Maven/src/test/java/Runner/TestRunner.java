package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:target/cucumber-html-report.html", "json:test-output-reports/JsonReport/report.json","junit:test-output-reports/JunitReport/report.xml"
				               ,"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}, 
				  glue="Stepdefinition1",
				  features = "Features",
				  monochrome = true,
<<<<<<< HEAD
=======

				  tags ="@CreatePDorders")
>>>>>>> refs/remotes/origin/main

		          tags ="@StylePODetails")


public class TestRunner {

<<<<<<< HEAD
=======


>>>>>>> refs/remotes/origin/main
}
<<<<<<< HEAD

=======
>>>>>>> refs/remotes/origin/main
