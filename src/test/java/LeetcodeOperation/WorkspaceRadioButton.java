package LeetcodeOperation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class WorkspaceRadioButton {
	static WebDriver driver;
	@Given("Open the workspaceBrowser")
	public void open_the_workspace_browser() {
	    driver = new ChromeDriver();
	    driver.get("https://letcode.in/test");
	}

	@Then("Click on toggle")
	public void click_on_toggle() {
	    WebElement toogle_button = driver.findElement(By.linkText("Toggle"));
	    toogle_button.click();
	}

	@And("Select any one")
	public void select_any_one() {
	    WebElement click1 = driver.findElement(By.id("yes"));
	    click1.click();
	}

	@And("Cofirm radio button")
	public void cofirm_radio_button() {
	   WebElement radio_button = driver.findElement(By.id("one"));
	   radio_button.click();
	}
	@Given("find bug")
	public void find_bug() {
	   
	}

	@Given("Find which one is selected")
	public void find_which_one_is_selected() {
	    WebElement Findbug = driver.findElement(By.id("nobug"));
	    Findbug.click();
	    if(Findbug.isSelected()) {
	    	System.out.println("no bug");
	    }else {
	    	WebElement Findbug1 = driver.findElement(By.id("bug"));
	    	Findbug1.click();	
	    }
	}
	@Given("Find whichselected")
	public void find_whichselected() {
		WebElement unselected = driver.findElement(By.id("foo"));
		WebElement selected = driver.findElement(By.id("notfoo"));
		if(unselected.isSelected()) {
			System.out.println("foo selected");
		}else {
			System.out.println("Bar selected");
		}
		

	}
	@Given("Confirm last field disabled")
	public void confirm_last_field_disabled() {
	    WebElement disabled_check = driver.findElement(By.id("maybe"));
	    if(disabled_check.isEnabled()) {
	    	System.out.println("button is enabled");
	    }else {
	    	System.out.println("button is disabled");
	    }
	    
	}
	@Given("Find ifthe checkbox selected")
	public void find_ifthe_checkbox_selected() {
		WebElement check_selected = driver.findElement(By.cssSelector("input[type = 'checkbox']"));
		//check_selected.click();
		System.out.println(check_selected.isSelected());
	}
	@Given("Accept T&C")
	public void accept_t_c() {
		WebElement Accepts = driver.findElement(By.xpath("/html/body/app-root/app-radio-check/section[1]/div/div/div[1]/div/div/div[7]/label[2]/input"));
		Accepts.click();
	    
	}





}
