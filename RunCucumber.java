package runner;

import io.cucumber.testng.CucumberOptions;
import stepdefinition.ProjectSpecificMethods;

	@CucumberOptions(features={"src/test/java/features"},
			 glue={"stepdefinition"},
			 monochrome= true,
			 publish= true)
	public class RunCucumber extends ProjectSpecificMethods{

}
