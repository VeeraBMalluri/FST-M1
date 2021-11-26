package cucumberTest;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
    features = "Features",
    glue = {"stepDefinition"},
    //tags = "@activity1_3"
   // tags = "@SmokeTest",
   // plugin = {"pretty"},
    //monochrome = true
   // plugin = {"html: test-reports"},
   // monochrome = true
    tags = "@SimpleAlert",
    plugin = {"json: test-reports1/json-report.json"},
    monochrome = true
    
)

public class Runner6 
{
	
	
}
