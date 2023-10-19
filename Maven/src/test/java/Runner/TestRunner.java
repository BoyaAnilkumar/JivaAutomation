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
	          tags =" @NEWIPO")
=======
<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
<<<<<<< HEAD
>>>>>>> refs/remotes/origin/main
		          tags ="@StyleTest1")
<<<<<<< HEAD
=======
=======
<<<<<<< HEAD
>>>>>>> refs/remotes/origin/main
		          tags =" @IPOList")
>>>>>>> refs/remotes/origin/main

<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
                  
=======
<<<<<<< HEAD
		          tags ="@Test2")
>>>>>>> branch 'main' of https://github.com/BoyaAnilkumar/JivaAutomation.git
>>>>>>> refs/remotes/origin/main
>>>>>>> branch 'main' of https://github.com/BoyaAnilkumar/JivaAutomation.git

<<<<<<< HEAD
=======

<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======

>>>>>>> refs/remotes/origin/main
>>>>>>> refs/remotes/origin/main
>>>>>>> branch 'main' of https://github.com/BoyaAnilkumar/JivaAutomation.git
>>>>>>> refs/remotes/origin/main
>>>>>>> refs/remotes/origin/main
>>>>>>> branch 'main' of https://github.com/BoyaAnilkumar/JivaAutomation.git
public class TestRunner {
	
}

               