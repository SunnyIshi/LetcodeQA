package LeetcodeOperation;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Workspaceindow {
	static WebDriver driver;
	@Given("Open tab browser")
	public void open_tab_browser() {
		 driver = new ChromeDriver();
		 driver.get("https://letcode.in/test");
	}

	@And("click on tab button")
	public void click_on_tab_button() {
		 WebElement click_tab = driver.findElement(By.linkText("Tabs"));
		 click_tab.click();
	}

	@And("Goto Home")
	public void goto_home() {
		 WebElement home_tab = driver.findElement(By.id("home"));
		 home_tab.click();
		 //gives id of parent window
		 String parentWindow = driver.getWindowHandle();
		 driver.switchTo().window(parentWindow);
		 String parent_windowname = driver.getTitle();
		 System.out.println(parent_windowname);
		
	}
	@Given("Open muiltple windows")
	public void open_muiltple_windows() {
		WebElement multiple_window = driver.findElement(By.id("multi"));
		multiple_window.click();
		Set<String> Window =driver.getWindowHandles();
		
		for(String handle : Window)
		{
			driver.switchTo().window(handle);
			String WindowTitle =driver.getTitle();
			System.out.println(WindowTitle);
			driver.close();
		}
		
		
	}
	
	

}
