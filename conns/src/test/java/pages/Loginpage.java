package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Loginpage {
	
	WebDriver driver;

    public Loginpage(WebDriver driver)
    { 
            this.driver=driver; 
    }
    
    @FindBy(how=How.XPATH, using="//li[@class='link-customer']//a[contains(text(),'Login')]")WebElement signin;
    @FindBy(how=How.XPATH, using="//input[@id='email']")WebElement mailid;
    @FindBy(how=How.XPATH, using="//fieldset[@class='fieldset login']//input[@id='pass']")WebElement password;
    @FindBy(how=How.XPATH, using="//fieldset[@class='fieldset login']//button[@id='send2']")WebElement login;
    
    public void clickonsignin()
    {
    	signin.click();
    }
    
    public void Login(String name,String pw) throws InterruptedException
    {
    	mailid.sendKeys(name);
    	password.sendKeys(pw);
    	Thread.sleep(2000);
    	login.click();
    }

//    public void setpassword()
//    {
//    	password.sendKeys("abc");
//    }
//
//    public void clickonlogin()
//    {
//    	login.click();
//    }

    
}
