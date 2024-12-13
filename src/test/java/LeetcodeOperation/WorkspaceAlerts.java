package LeetcodeOperation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class WorkspaceAlerts {
	static WebDriver driver;
	@Given("Open The given Browser")
	public void open_the_given_browser() {
	  driver = new ChromeDriver();
	  driver.get("https://letcode.in/test");
	}

	@Then("Click on dialog button")
	public void click_on_dialog_button() throws InterruptedException {
	   WebElement dialog_button = driver.findElement(By.linkText("Dialog"));
	   dialog_button.click();
	   Thread.sleep(2000);
	   
	}

	@And("Accept  Alert")
	public void accept_alert() throws InterruptedException {
		WebElement acceptAlert = driver.findElement(By.id("accept"));
		acceptAlert.click();
		Thread.sleep(2000);
		   
		Alert alert1= driver.switchTo().alert();
		alert1.accept();
	}

	@And("Dismiss Alert print alerttext")
	public void dismiss_alert_print_alerttext(){
		WebElement dismissAlert = driver.findElement(By.id("confirm"));
		dismissAlert.click();
	    Alert alert2 = driver.switchTo().alert();
	    System.out.println(alert2.getText());
		alert2.dismiss();
		
		
	}

	@And("Type your nameaccept")
	public void type_your_nameaccept() throws InterruptedException {
		WebElement promptAlert = driver.findElement(By.id("prompt"));
		promptAlert.click();
		Thread.sleep(2000); 
		Alert alert3= driver.switchTo().alert();
		alert3.sendKeys("Sunny");
		alert3.accept();
	}

	@And("Sweet alert")
	public void sweet_alert() {
		WebElement modern_alert = driver.findElement(By.id("modern"));
		modern_alert.click();
	    
	}




}
