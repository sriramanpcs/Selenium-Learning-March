package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features="src/test/java/features/Login2.feature",glue="Steps",
monochrome=true,dryRun=true,snippets=SnippetType.CAMELCASE) //-- after implementing the class it is not required

public class RunTest extends AbstractTestNGCucumberTests{

}
