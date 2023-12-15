package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:target/cucumber-html-report.html", "json:test-output-reports/JsonReport/report.json","junit:test-output-reports/JunitReport/report.xml"
				               ,"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}, 
				  glue="Stepdefinition1",
				  features = "Features",
<<<<<<< HEAD
				  monochrome = true,

		          tags ="@RevisedFabricSheeet1")




public class TestRunner {
=======
>>>>>>> refs/remotes/origin/main
	
				  monochrome = true,
				  tags ="@tag1")

<<<<<<< HEAD



=======
                  tags ="@MerchandisingTAndA1")

		         
>>>>>>> refs/remotes/origin/main
public class TestRunner {

}
