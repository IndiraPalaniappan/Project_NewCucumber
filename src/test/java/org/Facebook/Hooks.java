
package org.Facebook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;



public class Hooks extends CommonActions {

	CommonActions ca=new CommonActions();
	
@Before
public void launch(Scenario scenario)
{
	System.out.println("Hooks Before Method");
	ca.launchURL();
	final byte[] bef=((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
	scenario.embed(bef, "image/png");
	
	
	
}

@After
public void terminate(Scenario scen)
{
	System.out.println("Hooks After Method");
	final byte[] aft=((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
	scen.embed(aft, "image/png");
	ca.close();
}
	

}

