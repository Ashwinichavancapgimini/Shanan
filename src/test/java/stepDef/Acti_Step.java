package stepDef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class Acti_Step {
	WebDriver driver = null;
	@Given("User should open browser")
	public void browserOpen() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ashwini\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    // Write code here that turns the phrase above into concrete actions
	   
	}
	@Given("User is on login page")
	public void openApp() {
		driver.get("https://demo.actitime.com/login.do");
		
	}

	@When("User enter username and password")
	public void user_enter_username_and_password() {
		driver.findElement(By.xpath("input[@id='username")).sendKeys("admin");
		driver.findElement(By.xpath("input[@name='pwd']")).sendKeys("manager");
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("Click on login btn")
	public void click_on_login_btn() {
		driver.findElement(By.xpath("div[text()='Login ")).click();
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("User shoud navigate on homepage")
	public void user_shoud_navigate_on_homepage() {
		String expT= "Enter Time-Track";
		String actT =driver.findElement(By.xpath("//td[text()='Enter Time-Track']")).getText();
		if(actT.equals(expT)){
			System.out.println("USER IS ON HOMEPAGE");
			
		}
		else{
			System.out.println("TC IS FAIL");
		}
		
	
	    // Write code here that turns the phrase above into concrete actions
	    
	}
}
