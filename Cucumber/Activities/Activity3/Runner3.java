package cucumberTest;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
    features = "Features",
    glue = {"stepDefinition"},
    tags = "@activity1_3"
    //tags = "@SmokeTest"
  
)
public class Runner3 
{

}
