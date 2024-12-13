package LeetcodeOperation;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class WorkspaceButton {
	static WebDriver driver;
	@Given("Open The Browser")
	public void open_the_browser() {
	    driver = new ChromeDriver();
	    driver.get("https://letcode.in/test");
	}

	@Then("Click on click button")
	public void click_on_click_button() {
	    WebElement click_button = driver.findElement(By.linkText("Click"));
	    click_button.click();
	}

	@And("Goto Home and come back  using driver command")
	public void goto_home_and_come_back_using_driver_command() {
	    WebElement operation = driver.findElement(By.id("home"));
	    operation.click();
	    driver.navigate().to("https://letcode.in/buttons");
	    //driver.navigate().to("Interact with Button fields");
	       
	}
	@Given("Get the X & Y co-ordinates")
	public void get_the_x_y_co_ordinates() {
	    WebElement locations = driver.findElement(By.id("position"));
	    
	    System.out.println(locations.getLocation());
	}
	@Given("Find the color of the button")
	public void find_the_color_of_the_button() {
	    WebElement color_data = driver.findElement(By.id("color"));
	    String s = color_data.getCssValue("background-color");
	    System.out.println(s);
	}

	@Given("Find the height & width of the button")
	public void find_the_height_width_of_the_button() {
	    WebElement tallWidth_data = driver.findElement(By.id("property"));
	    Dimension s1 = tallWidth_data.getSize();
	    System.out.println(s1);
	}
	@Given("Confirm button is disabled")
	public void confirm_button_is_disabled() {
    WebElement checkisdisabled = driver.findElement(By.id("isDisabled"));
		
		if(checkisdisabled.isEnabled())
		{
			System.out.println("Button is Enabled");
		}
		else
		{
			checkisdisabled.click();
			System.out.println("Button is Disabled");
		}
	}

	@Given("Click and Hold button")
	public void click_and_hold_button() {
	    WebElement click_hold = driver.findElement(By.xpath("/html/body/app-root/app-buttons/section[1]/div/div/div[1]/div/div/div[6]/div/button"));
	    Actions s2 = new Actions(driver);
	    s2.clickAndHold(click_hold);
	    s2.perform();
	    
	}



}
