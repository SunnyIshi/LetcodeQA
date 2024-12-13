package LeetcodeOperation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Signup {
	static WebDriver driver;
	@Given("Open the browser")
	public void open_the_browser() {
	    driver = new ChromeDriver();
	    driver.get("https://letcode.in/test");
	}

	@Then("click on sign up button")
	public void click_on_sign_up_button() {
		WebElement clicktosignup = driver.findElement(By.linkText("Sign up"));
		clicktosignup.click();
	}
	@Then("Enter The name")
	public void enter_the_name() {
	    WebElement namedata = driver.findElement(By.id("name"));
	    namedata.sendKeys("John");
	}

	@And("Enter the Email")
	public void enter_the_email() {
		WebElement emaildata = driver.findElement(By.id("email"));
		emaildata.sendKeys("dinexo474@rustetic.com");
	}
	    

	@And("Enter The password")
	public void enter_the_password() {
		WebElement passworddata = driver.findElement(By.id("pass"));
		passworddata.sendKeys("John@123");
	}

	@Then("Click the checkbox")
	public void click_the_checkbox() {
	    WebElement checkbox = driver.findElement(By.cssSelector("input[type = 'checkbox']"));
	    checkbox.click();
	}

	@And("Click on sign up button")
	public void clickon_sign_up_button() {
	    WebElement signup_Button = driver.findElement(By.xpath("/html/body/app-root/app-signup/div/div/div/div/form/div[5]/p/button"));
	    signup_Button.click();
	}
	@Then("Click on sign out button")
	public void click_on_sign_out_button() {
	    WebElement signout_button = driver.findElement(By.xpath("/html/body/app-root/app-header/nav/div/div[2]/div[2]/div/div/a"));
	    signout_button.click();
	}
	
}
