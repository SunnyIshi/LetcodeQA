package LeetcodeOperation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class WorkspaceElements {
	static WebDriver driver;
	@Given("open the webpage browser")
	public void open_the_webpage_browser() {
	   driver = new ChromeDriver();
	   driver.get("https://letcode.in/test");
	  
	}

	@And("click on find elements")
	public void click_on_find_elements() {
	  WebElement elementweb_click = driver.findElement(By.linkText("Find Elements"));
	  elementweb_click.click();
	  
	}

	@And("Enter git username")
	public void enter_git_username() {
		WebElement enter_name  = driver.findElement(By.name("username"));
		enter_name.sendKeys("ortonikc");
		WebElement search =driver.findElement(By.id("search"));
		search.click();
		
		WebElement image = driver.findElement(By.cssSelector("img[alt = 'Placeholder image']"));
		//to continue
	}


}
