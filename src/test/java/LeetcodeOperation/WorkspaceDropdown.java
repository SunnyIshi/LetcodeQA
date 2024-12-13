package LeetcodeOperation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class WorkspaceDropdown {
	static WebDriver driver;
	@Given("Open given Browser")
	public void open_given_browser() {
		driver = new ChromeDriver();
		driver.get("https://letcode.in/test");
	}
	@Then("Click on dropdown button")
	public void click_on_dropdown_button() {
	   WebElement dropdown_button = driver.findElement(By.linkText("Drop-Down"));
	   dropdown_button.click();
	}

	@And("Select visible text")
	public void select_visible_text() {
		WebElement select_text = driver.findElement(By.id("fruits"));
		//select_text.click();
		Select fruit = new Select(select_text);
		fruit.selectByVisibleText("Apple");
		
	}

	@And("Select super heros")
	public void select_super_heros() {
	    WebElement select_hero = driver.findElement(By.id("superheros"));
	    Select hero = new Select(select_hero);
	    hero.selectByVisibleText("The Avengers");
	    
	}
	@Given("Select  last programminglanguage print options")
	public void select_last_programminglanguage_print_options() {
	    WebElement language_select = driver.findElement(By.id("lang"));
	    Select language = new Select(language_select);
	    language.selectByVisibleText("C#");
	    List<WebElement> list1 = language.getOptions();
		for(WebElement elements: list1)
		{
			System.out.println(elements.getText());
		}
	}
	@Then("Select India & print selected value")
	public void select_india_print_selected_value() {
	   WebElement country = driver.findElement(By.id("country"));
	   //country.click();
	   Select MY_language = new Select(country);
	   MY_language.selectByVisibleText("India");
	   WebElement a = MY_language.getFirstSelectedOption();
	   System.out.println(a.getText());
	   
	}


}
