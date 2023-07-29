package org.BigBasket;

import org.junit.rules.Timeout;
import java.util.TreeMap;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.HashMap;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BigBasketStepDefinition {

	public static WebDriver driver;
	public static Robot r;
	public static WebDriverWait wait;
	public String prod1;
	public String mrp;

	
	@Given("Launch the URL")
	public void launch_the_url() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, 10);
		driver.navigate().to("https://www.bigbasket.com/");

	}

	@When("user search the product")
	public void user_search_the_product() throws AWTException {
		driver.findElement(By.xpath("(//input[contains(@placeholder,'Search for Products..')])[1]")).sendKeys("soap");
		r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

	}

	@Then("user displayed with search Results")
	public void user_displayed_with_search_results() {
		List<WebElement> prod = driver.findElements(By.xpath("//div[@qa='product_name']/a"));
		List<WebElement> rate = driver.findElements(By.xpath("//span[@class='discnt-price']"));

		for (int i = 0; i < prod.size(); i++) {
			WebElement product = prod.get(i);
			prod1 = product.getText();

			for (int j = i; j == i; j++) {
				Map<String, String> map = new HashMap<String, String>();
				WebElement price = rate.get(j);
				mrp = price.getText();

				map.put(prod1, mrp);
				Set<Entry<String, String>> s1 = map.entrySet();
				for (Entry<String, String> m : s1) {
					System.out.println(m.getKey() + " " + m.getValue());

				}

			}
		}
	}

	@Given("user searching for  books")
	public void user_searching_for_books() throws AWTException {
		driver.findElement(By.xpath("//input[@qa='searchBar']")).sendKeys("books");
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

	@When("user select the product")
	public void user_select_the_product(io.cucumber.datatable.DataTable dataTable) throws AWTException {
		List<String> products = dataTable.asList();
		String searchProduct = products.get(0);
		driver.findElement(By.xpath("//input[@qa='searchBar']")).sendKeys(searchProduct);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

	@Then("user is able to add the product in cart")
	public void user_is_able_to_add_the_product_in_cart() {
		String opt;
		List<WebElement> results = driver.findElements(By.xpath("//div[@class='item prod-deck row ng-scope']"));
		for (int i = 0; i < results.size(); i++) {
			WebElement colBook = results.get(i);
			opt = colBook.getText();
			System.out.println(opt);

			if (opt.contains("ColorStay")) {
				WebElement sel1 = driver.findElement(By.xpath("(//button[@qa='add'])[" + i + "]"));
				sel1.click();
				driver.findElement(By.xpath("//span[@class='basket-content']")).click();
			}
		}
	}

	@Given("User searching Baby products {string}")
	public void user_searching_baby_products(String string) throws AWTException {
		driver.findElement(By.xpath("//input[@qa='searchBar']")).sendKeys(string);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

	@When("User searching Baby shampoo")
	public void user_searching_baby_shampoo(io.cucumber.datatable.DataTable dataTable) throws AWTException {
		Map<String, String> asMap = dataTable.asMap(String.class, String.class);
		String string1 = asMap.get("Brand1");
		driver.findElement(By.xpath("//input[@qa='searchBar']")).sendKeys(string1);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

	}

	@When("Searching Baby Powder")
	public void searching_baby_powder(io.cucumber.datatable.DataTable dataTable) {
		Map<String, String> asMap = dataTable.asMap(String.class, String.class);
		String string2 = asMap.get("Brand2");
		driver.findElement(By.xpath("//input[@qa='searchBar']")).sendKeys(string2);
		driver.findElement(By.xpath("//button[@qa='searchBtn']")).click();
	}

	@When("Searching Baby Soap")
	public void searching_baby_soap(io.cucumber.datatable.DataTable dataTable) {
		List<String> asList = dataTable.asList();
		String str = asList.get(0);
		driver.findElement(By.xpath("//input[@qa='searchBar']")).sendKeys(str);
		driver.findElement(By.xpath("//button[@qa='searchBtn']")).click();

	}

	@Then("Added Items to cart")
	public void added_items_to_cart() {

		List<WebElement> prodList = driver.findElements(By.xpath("//div[@qa='product']"));
		List<WebElement> price = driver.findElements(By.xpath("//span[@class='discnt-price']"));
		for (int i = 0; i < prodList.size(); i++) {

			WebElement prod = prodList.get(i);
			String prodName = prod.getText();

			for (int j = i; j == i; j++) {
				Map<String, String> map = new TreeMap<String, String>();
				WebElement rate = price.get(j);
				String mrp = rate.getText();

				map.put(prodName, mrp);
				Set<Entry<String, String>> e = map.entrySet();
				for (Entry<String, String> entry : e) {
					System.out.println(entry.getKey() + " " + entry.getValue());
					String d = entry.getValue();
				
					
					if (d.contains("Blossoms")) 
						{
						System.out.println("Active product"+d);

					}
					else
					{
						System.out.println("No such product");
					}
					

				}
			}

		}

	}
}
