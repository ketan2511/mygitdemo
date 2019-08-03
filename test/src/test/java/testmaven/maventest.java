package testmaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class maventest {

	public WebDriver driver;
	
	@Test
	public void openMyBlog() {
		driver.get("https://www.softwaretestingmaterial.com/");
	  }
	  
	  @BeforeClass
	  public void beforeClass() {
		  
		  System.setProperty("webdriver.gecko.driver", "F:/eclipse/selenium/geckodriver-v0.20.0-win64/geckodriver.exe");
		  driver = new FirefoxDriver();
		  
	  }

	  @AfterClass
	  public void afterClass() {
		  driver.quit();
	  }
}
