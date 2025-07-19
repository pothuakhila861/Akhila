package Runner;

import org.testng.annotations.AfterClass;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = {"features"},
                 glue =     {"StepDefinations"},
                 plugin =    { "pretty","html:target/cucumber-reports",
    		     "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
                	tags="@Smoke",	 
                  monochrome = true )

public class Runnerclass extends AbstractTestNGCucumberTests{
	
	}