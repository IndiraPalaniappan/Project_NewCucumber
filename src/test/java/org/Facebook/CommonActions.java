package org.Facebook;

import java.awt.Robot;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonActions {

	public static WebDriver driver;
	public static Robot r;
	public static WebDriverWait wait;
	public static Select s;
	public static Actions a;
	public static JavascriptExecutor js;
	
	public void launchURL()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, 10);
	}
	
	public void btnType(WebElement e) {
		e.click();
	}

	public void inputText(WebElement e, String txt) {
		e.sendKeys(txt);
	}

	public void selectIndType(WebElement e,Select s,int i) {
		s = new Select(e);
		s.selectByIndex(i);
	}

	public void selectValType(WebElement e,String s1) {
		s = new Select(e);
		s.selectByValue(s1);
	}

	public void selectVisType(String s2,WebElement e) {
		s = new Select(e);
		s.selectByVisibleText(s2);
	}

	public void actionTypeInput(WebDriver driver, String str) {
		a = new Actions(driver);
		a.sendKeys(str).build().perform();

	}

	public void actionTypeClick(WebElement act) {
		a.click(act).build().perform();

	}
	
	public void jsInput(String str,WebDriver driver,WebElement e) {
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].value='str'", e);
}
	public void close()
	{
		driver.close();
	}
	
}
