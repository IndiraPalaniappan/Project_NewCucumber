package org.Facebook;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookStepDefinition extends CommonActions {
	CommonActions ca = new CommonActions();
	FacebookObjectRepository f = new FacebookObjectRepository();

	// public static WebDriver driver;
	public static Robot r;
	public static WebDriverWait wait;
	public static Select s;

	@Given("launch the URL")
	public void launch_the_URL() {
		driver.navigate().to("https://www.facebook.com/");
	}

	@When("creating new account")
	public void creating_new_account() {
		ca.btnType(f.getCreateBtn());
//		driver.findElement(By.xpath("//div[@class='_8ien']"))));

	}

	@When("entering personal details {string} {string}")
	public void entering_personal_details(String fname, String lname) {
		ca.inputText(f.getFname(), fname);
		ca.inputText(f.getLname(), lname);
	}

	@When("entering {string} {string}")
	public void entering(String mobile, String password) {
		ca.inputText(f.getMobile(), mobile);
		ca.inputText(f.getPassword(), password);
	}

	@When("selecting DOB {string} {string} {string} {string}")
	public void selecting_DOB(String date, String month, String year, String gender) {

		s = new Select(f.getDob());
		s.selectByValue(date);

		s = new Select(f.getMth());
		s.selectByValue(month);

		s = new Select(f.getYr());
		s.selectByValue(year);

		if (gender.contains("Female")) {

			ca.btnType(f.getFemaleBtn());
		} else if (gender.contains("Male")) {
			ca.btnType(f.getFemaleBtn());
		} else {
			f.getCustom().click();
		}
	}

	@Then("create Account")
	public void create_Account() {
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		WebElement content = driver.findElement(By.xpath("((//div[@class='x1e56ztr x1xmf6yo'])[2]//div)[1]"));
		String txt = content.getText();
		String msg = "We'll take you through a few steps to confirm your account on Facebook.";
		Boolean b = txt.contains(msg);
		System.out.println(b);
		
	}
	
	

}
