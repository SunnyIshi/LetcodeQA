package LeetcodeOperation;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class Workspace_dragAndDrop {
	static WebDriver driver;
	@Given("Open the drag browser")
	public void open_the_drag_browser() {
		driver = new ChromeDriver();
		driver.get("https://letcode.in/test");
	}
	@And("Click on drop")
	public void click_on_drop() {
	    WebElement clickdrop = driver.findElement(By.linkText("AUI - 2"));
	    clickdrop.click();
	}

	@And("perform drag and drop operation")
	public void perform_drag_and_drop_operation() {
	    WebElement drag = driver.findElement(By.id("draggable"));
	    WebElement drop = driver.findElement(By.id("droppable"));
	    Actions a = new Actions(driver);
	    a.dragAndDrop(drag, drop).perform();
	    
	   
	}


}
