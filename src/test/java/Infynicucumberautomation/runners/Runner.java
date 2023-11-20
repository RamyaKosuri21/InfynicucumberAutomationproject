package Infynicucumberautomation.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features= {"Features"},
                 glue= {"Infynicucumberautomation.stepdefinitions"},
                 plugin= {"pretty","html:target/cucumber-reports/cucumberreport.html"},
                 tags= "@invalidlogin",
                 monochrome=true
		)
public class Runner extends AbstractTestNGCucumberTests{

}
