package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class addtocartpage {
	WebDriver driver;

    public addtocartpage(WebDriver driver)
    { 
            this.driver=driver; 
    }
    
    @FindBy(how=How.XPATH, using="//input[@id='zipcode']")WebElement zipcode;
    @FindBy(how=How.XPATH, using="//div[@class='fieldset']//button[@id='product-addtocart-button']")WebElement addtocart;
    @FindBy(how=How.XPATH, using="//button[@id='addtocart-button']")WebElement addcart;
    @FindBy(how=How.XPATH, using="//div[@class='page-title-wrapper']//a[@class='action primary checkout'][contains(text(),'Proceed to Checkout')]")WebElement checkout;
    @FindBy(how=How.XPATH, using="//div[@name='shippingAddress.firstname']")WebElement name;
    
    public void setzipcode() throws InterruptedException
    {
    	zipcode.sendKeys("36117");;
    }
   
    public void clickonaddtocart()
    {
    	addtocart.click();
    }
    
    public void clickonaddcart()
    {
    	addcart.click();
    }
	
    public void clickoncheckout()
    {
    	checkout.click();
    }
	
    public void setname() throws InterruptedException
    {
    	name.click();
    	Thread.sleep(10000);
    	name.sendKeys("abc");;
    }
    
}
