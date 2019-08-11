package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {

	WebDriver driver;

    public HomePage(WebDriver driver)
    { 
            this.driver=driver; 
    }
    
    @FindBy(how=How.XPATH, using="//a[contains(@class,'nav-anchor subdynamic')]")WebElement shopmenu;
    @FindBy(how=How.XPATH, using="//a[@id='ui-id-5']//span[contains(text(),'TV, Audio & Electronics')]")WebElement submenu;
    @FindBy(how=How.XPATH, using="//div[contains(@class,'content-wrapper nav-promotion')]//div//div[contains(@class,'nav-dropdown')]//div[@id='1545411610565281399']//div[contains(@class,'item-content')]//span[contains(text(),'See All')]")WebElement headphones;
    @FindBy(how=How.XPATH, using="//li[@class='item product product-item product-id-49922']//img[@class='product-image-photo']")WebElement product;
    
    public void clickonshopmenu()
    {
    	shopmenu.click();
    }
    
    public void clickonsubmenu() throws InterruptedException
    {
    	Actions builder=new Actions(driver);
    	builder.moveToElement(submenu).perform();
    	Thread.sleep(2000);
    }
    
    public void clickonheadphones()
    {
    	headphones.click();
    }
    
    public void clickonproduct()
    {
    	product.click();
    }
    
    
    
}

