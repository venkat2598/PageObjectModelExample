package WithoutUsingPageFactoryAnnotation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class WithoutAnnotation {
	
	
	//we are used this module only work with id or name otherwise can't work like x-path locater;
	//this is without using PageFactory @FindBy Annotation 
	
	public static WebElement username;
	public static WebElement password;
	public static WebElement FormsButton2;
	
	@Test
	public void loginmethods() {
		
		
		System.setProperty("webdriver.gecko.driver", "D:\\Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://thedemosite.co.uk/login.php");
		
		
		PageFactory.initElements(driver, WithoutAnnotation.class);
		
		username.sendKeys("Admin");
		password.sendKeys("admin123");
		FormsButton2.click();
		
		driver.close();
		
		
		
	}

}
