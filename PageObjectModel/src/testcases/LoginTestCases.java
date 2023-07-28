package testcases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageobject.LoginPageobject;

public class LoginTestCases {
	
	@Test
	public void login() {
		
		System.setProperty("webdriver.gecko.driver", "D:\\Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//we use pageFactory class  
		/*
		 * PageFactory.initElements(driver, LoginPageobject.class);
		 * 
		 * LoginPageobject.username.sendKeys("Admin");
		 * LoginPageobject.password.sendKeys("admin123"); LoginPageobject.login.click();
		 */	
		
		//this is used to FindEement methods
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

			LoginPageobject.username(driver).sendKeys("Admin");
			LoginPageobject.password(driver).sendKeys("admin123");
			LoginPageobject.login(driver).click();
			
		
	
	
	
	}

}
