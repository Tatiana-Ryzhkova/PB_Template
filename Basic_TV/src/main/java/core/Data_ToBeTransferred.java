package core;


// import org.testng.annotations.AfterMethod;

// import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.*;
import java.util.concurrent.TimeUnit;

import java.net.URLClassLoader;
import java.net.URL;

public class Data_ToBeTransferred {
	
	
	
	@Test 
	public void pbAssert() { 
		WebDriver driver=new FirefoxDriver(); 
	String titleActual = driver.getTitle();
	driver.get("http://www.potterybarn.com/");
	Assert.assertEquals("Home Furnishings, Home Decor, Outdoor Furniture & Modern Furniture | Pottery Barn",titleActual);
	driver.quit();
	 } }
	 
	// @Test
   // public void pbAssert() {
       
   //     driver.get("http://www.potterybarn.com");

   //     Boolean isElementPresent = IsElementPresent(driver.findElements(By.id("nav-account-links")).size() > 0);

   //     Assert.assertTrue(isElementPresent); }

	
	// Reports report;
    // Test logger;
  
	
	// report=new Reports("/Users/screenshot");

   // logger=report.startTest("VerifyTitle");

  //  driver=new FirefoxDriver();

 //   driver.manage().window().maximize();

 //   logger.log(LogStatus.INFO, "Browser started ");

 //   driver.get("http://www.potterybarn.com");

 //   logger.log(LogStatus.INFO, "running");

 //   String title=driver.getTitle();

 //   Assert.assertTrue(title.contains("Home Furnishings, Home Decor, Outdoor Furniture & Modern Furniture | Pottery Barn"));

 //   logger.log(LogStatus.PASS, "Title verified");
    
    // @AfterMethod
    // public void tearDown(ITestResult result)
    // {
       // if(result.getStatus()==ITestResult.FAILURE)
        // {

          //  String screenshot_path= Utility.captureScreenshot(driver, result.getName());
          //  String image= logger.addScreenCapture(screenshot_path);
          //  logger.log(LogStatus.FAIL, "Title verification", image);

        // }

   //     report.endTest(logger);
   //     report.flush();    }

	
	// WebDriver driver = new FirefoxDriver();
	
	// driver.get(url);
	// driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    // String title_actual = driver.getTitle();
	
	// String text_case_id = "TC-01";
	// String url = "http://www.potterybarn.com/";
	// String title_expected = "Home Furnishings, Home Decor, Outdoor Furniture & Modern Furniture | Pottery Barn";
			
	// driver.get(url);
	// driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	// String title_actual = driver.getTitle();