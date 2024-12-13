package LeetcodeOperation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class log_in {
	static WebDriver driver;
	@Given("Open the Browser")
	public void open_the_browser() {
	    driver = new ChromeDriver();
	    driver.get("https://letcode.in/test");
	    driver.manage().window().maximize();
	}

	@Then("Click on log in button")
	public void click_on_log_in_button() {
	    WebElement login_button = driver.findElement(By.linkText("Log in"));
	    login_button.click();
	}

	@And("Enter the registered Email")
	public void enter_the_registered_email() {
		WebElement email_data = driver.findElement(By.name("email"));
		email_data.sendKeys("dinexo474@rustetic.com");
	}

	@Then("Enter the registered Password")
	public void enter_the_registered_password() {
		WebElement password_data = driver.findElement(By.name("password"));
		password_data.sendKeys("John@123");
	}
	
	@Then("Click on login button")
	public void click_on_login_button() {
		WebElement login_button = driver.findElement(By.xpath("/html/body/app-root/app-signin/div/div/div/div/form/div[3]/p/button"));
		login_button.click();
	}
	
}