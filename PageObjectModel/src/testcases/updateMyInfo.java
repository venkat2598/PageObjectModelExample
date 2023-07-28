package testcases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageobject.LoginPageobject;
import pageobject.UpdateMyInfoObject;

public class updateMyInfo {

	@Test
	public void myinfo() {
		System.setProperty("webdriver.gecko.driver", "D:\\Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		
		//we use the module in PageFactory class its very simplest ways to identify elements
		
		
		/*
		 * PageFactory.initElements(driver, LoginPageobject.class);
		 * 
		 * LoginPageobject.username.sendKeys("Admin");
		 * LoginPageobject.password.sendKeys("admin123"); LoginPageobject.login.click();
		 */	
		
		
		PageFactory.initElements(driver,UpdateMyInfoObject.class);
		UpdateMyInfoObject.Myinfo.click();
		UpdateMyInfoObject.ContactDetails.click();
		UpdateMyInfoObject.Street1.clear();
		UpdateMyInfoObject.Street1.sendKeys("chennai");
		UpdateMyInfoObject.Mobile.clear();
		UpdateMyInfoObject.Mobile.sendKeys("8192762921");
		UpdateMyInfoObject.save.click();
		







	}


}
