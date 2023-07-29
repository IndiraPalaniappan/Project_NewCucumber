package org.Facebook;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\indir\\eclipse-workspace\\Training\\Project_NewCucumber\\src\\test\\resources\\org\\Facebook\\Facebook.feature",
				glue="org.Facebook",
				tags="@smoke",
				dryRun=false,
				monochrome=true,
				plugin= {"html:target/index.html", "json:target/report.json"}
				
				)
public class TestRunner {
	

}
