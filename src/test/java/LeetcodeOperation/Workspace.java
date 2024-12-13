package LeetcodeOperation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Workspace {
	static WebDriver driver;
	@Given("Open theBrowser")
	public void open_the_browser() {
	    driver = new ChromeDriver();
	    driver.get("https://letcode.in/test");
	}

	@Then("Click on edit")
	public void click_on_edit() {
	   WebElement editButton = driver.findElement(By.linkText("Edit"));
	   editButton.click();
	}

	@Then("Enter FullName")
	public void enter_full_name() {
	    WebElement Fullnamedata = driver.findElement(By.id("fullName"));
	    Fullnamedata.sendKeys("sunny Ishi");
	}
	@And("Keyword Entering and Clickon tab")
	public void keyword_entering_and_clickon_tab() {
	   WebElement Append_data = driver.findElement(By.id("join"));
	   Append_data.sendKeys("Boy");
	   Append_data.sendKeys(Keys.TAB);
	}
	
	@And("Find the attribute bymethod")
	public void find_the_attribute_bymethod() {
	   WebElement print_attribute = driver.findElement(By.id("getMe"));
	   String value= print_attribute.getAttribute("value");
	   System.out.println(value);
	   print_attribute.sendKeys(Keys.TAB);
	}
	@Then("Clear The Text")
	public void clear_the_text() {
	    WebElement Clear_data = driver.findElement(By.id("clearMe"));
	    Clear_data.clear();
	}
	@And("Check disabled")
	public void check_disabled() {
		WebElement DisabledBox =driver.findElement(By.id("noEdit"));
		
		if(DisabledBox.isEnabled())
		{
			System.out.println("Box is Enabled1");
		}
		else
		{
			DisabledBox.click();
			System.out.println("Box is Disabled1");
		}
	}

	@And("Ckeck element is enabled")
	public void ckeck_element_is_enabled() {
		WebElement EnabledBox =driver.findElement(By.id("dontwrite"));
		
		if(EnabledBox.isEnabled())
		{
			EnabledBox.click();
			System.out.println("Box is Enabled2");
		}
		else
		{
			System.out.println("Box is Disabled2");
		}
	    
	}



}
