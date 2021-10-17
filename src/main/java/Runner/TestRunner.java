package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		       //features="C:\\Users\\z00467ka\\eclipse-workspace\\FreeCrmBDDFramework\\src\\main\\java\\Features",
		       //features="C:\\Users\\z00467ka\\eclipse-workspace\\FreeCrmBDDFramework\\src\\main\\java\\Features\\contacts.feature",
		       //features="C:\\Users\\z00467ka\\eclipse-workspace\\FreeCrmBDDFramework\\src\\main\\java\\Features\\deals.feature",
		       //features="C:\\Users\\z00467ka\\eclipse-workspace\\FreeCrmBDDFramework\\src\\main\\java\\Features\\dealsmap.feature",
		       //features="C:\\Users\\z00467ka\\eclipse-workspace\\FreeCrmBDDFramework\\src\\main\\java\\Features\\hooks.feature",
		       features="C:\\Users\\z00467ka\\eclipse-workspace\\FreeCrmBDDFramework\\src\\main\\java\\Features\\taggedhooks.feature",
		       glue={"stepDefinations"},
		       plugin = {"pretty","html:test-output"},
		       //format={"pretty","html:test-output"}, deprecated not in use anymore in cucumber BBD
		       monochrome=true,
		       //monochrome=false,
		       strict=true,
		       dryRun=false
		       //tags= {"@SmokeTest"}
		       //tags= {"@SmokeTest,@RegressionTest"} // OR
		       //tags= {"@SmokeTest","@RegressionTest"}//AND
		      //tags={"~@SmokeTest","@RegressionTest"}//executes only @regression tests
		       //tags={"~@SmokeTest","~@RegressionTest"}
		
		)

public class TestRunner 
{
     
}
//OR is represented by , tags= {"@SmokeTest,@RegressionTest"} execute all test tagged as @@SmokeTest or @RegressionTest //ajeet
//And - executes all the test cases which is tagged as smoke & regression
