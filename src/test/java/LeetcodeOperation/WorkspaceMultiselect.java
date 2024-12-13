package LeetcodeOperation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class WorkspaceMultiselect {
	static WebDriver driver;
	@Given("Open the multiselect browser")
	public void open_the_multiselect_browser() {
	    driver = new ChromeDriver();
	    driver.get("https://letcode.in/test");
	}

	@And("click on multiselect")
	public void click_on_multiselect() {
	    WebElement click = driver.findElement(By.linkText("AUI - 4"));
	    click.click();
	}

	@And("select all")
	public void select_all(){
		List<WebElement> listItems = driver.findElements(By.id("selectable"));
	    Actions actions = new Actions(driver);
		
		  for (WebElement item : listItems) {
		        actions.moveToElement(item).perform();
		    }
		    WebElement firstItem = listItems.get(0);
		    WebElement lastItem = listItems.get(listItems.size() - 1);

		    actions.clickAndHold(firstItem).moveToElement(lastItem).release().perform();
	    
	}

	
	
}
