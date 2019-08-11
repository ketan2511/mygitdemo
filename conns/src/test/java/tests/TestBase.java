package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class TestBase {
	
	WebDriver driver;
	@Test
	public void main()
	{
	  driver.get("https://www.conns.com/");
	}
	
	@BeforeTest
	public void beforeclass()
	{
		System.setProperty("webdriver.chrome.driver", "F:/eclipse/selenium/chromedriver_win32(3)/chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@AfterTest
	  public void afterClass() 
	{
		  driver.quit();  
	}

}
