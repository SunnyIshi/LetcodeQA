package LeetcodeOperation;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class Workspacewaits {
  
  static  WebDriver driver;
   @Given("Open waits page")
   public void open_waits_page() {
      driver = new ChromeDriver();
      driver.get("https://letcode.in/test");
   }

   @And("Click to timeout")
   public void click_to_timeout() {
       WebElement s = driver.findElement(By.linkText("Timeout"));
       s.click();
   }

   @And("Click on alert")
   public void click_on_alert() throws InterruptedException {
	   WebElement button = driver.findElement(By.id("accept"));
	   button.click();
	   WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(10));
	   w.until(ExpectedConditions.alertIsPresent());
		Alert alert=driver.switchTo().alert();
		alert.accept();
   }
   
}


