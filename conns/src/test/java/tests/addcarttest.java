package tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.Loginpage;
import pages.addtocartpage;

public class addcarttest extends TestBase {

	XSSFWorkbook workbook;
    XSSFSheet sheet;
	
	@Test(dataProvider="testdata")
	public void init(String un,String pw) throws InterruptedException, IOException{
		
//		HomePage homepage=PageFactory.initElements(driver, HomePage.class);
//		homepage.clickonshopmenu();
//		homepage.clickonsubmenu();
//		homepage.clickonheadphones();
//		homepage.clickonproduct();
//	
//	    addtocartpage cartpage=PageFactory.initElements(driver, addtocartpage.class);
//	    cartpage.setzipcode();
//	    cartpage.clickonaddtocart();
//	    cartpage.clickonaddcart();
//	    cartpage.clickoncheckout();
//	    Thread.sleep(10000);
//	    cartpage.setname();
	    
		Loginpage loginpage=PageFactory.initElements(driver, Loginpage.class);
	    loginpage.clickonsignin();
	    loginpage.Login(un,pw);
//	    loginpage.setpassword();
//	    loginpage.clickonlogin();
		
	}
	   
	@DataProvider(name="testdata")
	    public Object[][] testdata() throws IOException
	    {
	    	
	    File src=new File("F:\\eclipse\\selenium\\exceldata\\TestData.xlsx");        
		
		FileInputStream fis=new FileInputStream(src);                               
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);                                      		
		
		XSSFSheet sheet=wb.getSheetAt(1);                                          
		
		int row=sheet.getLastRowNum()+1;
		int coloumn=sheet.getRow(0).getLastCellNum();
		
		System.out.println("total row count is "+(row));
		System.out.println("total row count is "+(coloumn));
		
		
		Object [][] facebookdata=new Object[row][coloumn];
		
		for(int i=0;i<row;i++)
		{
			facebookdata[i][0]=sheet.getRow(i).getCell(0).getStringCellValue();
			facebookdata[i][1]=sheet.getRow(i).getCell(1).getStringCellValue();

		}
		return facebookdata;
	    
	    }
	    
	}
