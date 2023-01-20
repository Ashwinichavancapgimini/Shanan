package stepDef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class Acti1 {
	WebDriver driver = null;
	@Given("Browser is open and User is on login page")
	public void browser_is_open_and_user_is_on_login_page() {
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ashwini\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	    driver= new ChromeDriver();
	    driver.get("https://demo.actitime.com/login.do");
	    
	    
	}

	@When("User enter un and pswd")
	public void user_enter_un_and_pswd() {
	    driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
	    driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	    
	}

	@When("User click on login btn")
	public void user_click_on_login_btn() {
	    driver.findElement(By.xpath("//div[text()='Login ']")).click();
	    
	}

	@Then("User should neavigate on homepage")
	public void user_should_neavigate_on_homepage() {
	    String exptT= "Enter Time-Track	";
	    String actT =driver.findElement(By.xpath("//td[text()='Enter Time-Track']")).getText();
	    if(actT.equals(exptT)) {
	    	System.out.println("USER ON HOME PAGE");
	    }
	    else {
	    	System.out.println("TC IS FAIL");
	    	
	    }
	    
	}

}
