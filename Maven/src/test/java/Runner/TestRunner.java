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
=======
>>>>>>> branch 'main' of https://github.com/BoyaAnilkumar/JivaAutomation.git

<<<<<<< HEAD
		          tags ="@Smoketest")
=======
<<<<<<< HEAD
		          tags ="@RevisedMUWorking1")
=======
		          tags ="@tag2")
>>>>>>> branch 'main' of https://github.com/BoyaAnilkumar/JivaAutomation.git


<<<<<<< HEAD
>>>>>>> branch 'main' of https://github.com/BoyaAnilkumar/JivaAutomation.git


public class TestRunner {
	
=======
public class TestRunner {

>>>>>>> branch 'main' of https://github.com/BoyaAnilkumar/JivaAutomation.git
}








