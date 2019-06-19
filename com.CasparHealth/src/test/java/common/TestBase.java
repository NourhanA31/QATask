package common;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class TestBase {
	 public static WebDriver driver;
	   public static String BaseUrl;

	   @BeforeMethod
	   @Parameters({"browser","url"})

	   public void Startup(String WindowBrowser, String url){

	      BaseUrl = url;
	      if (WindowBrowser.equalsIgnoreCase("firefox") )
	      {
	         System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+ "/Assets/geckodriver.exe");
	         driver = new FirefoxDriver();
	         driver.navigate().to(BaseUrl);
	      }
	      else if(WindowBrowser.equalsIgnoreCase("chrome"))
	      {
	         System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "/Assets/chromedriver.exe");
	         driver = new ChromeDriver();
	         driver.navigate().to(BaseUrl);
	      }
	      else if(WindowBrowser.equalsIgnoreCase("ie"))
	      {
	         System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/Assets/IEDriverServer.exe");
	         driver = new InternetExplorerDriver();
	         driver.navigate().to(BaseUrl);
	      }

	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(500, TimeUnit.MILLISECONDS);
	   }
	   @AfterMethod
	   public void Close(ITestResult result)
	   {
		   if(ITestResult.FAILURE==result.getStatus()){
		   try {
		   TakesScreenshot screenShot=(TakesScreenshot)driver;
		   File srcFile=screenShot.getScreenshotAs(OutputType.FILE);
		   File destFile = new File(CommonConstants.SCREENSHOT_FOLDER + result.getName() + "-Failed.png");
		   FileUtils.copyFile(srcFile, destFile);
		   } 
		   catch (Exception e)
		   {
		   System.out.println("Exception while taking screenshot "+e.getMessage());
		   }    
		 }
	      driver.quit();
	   }

}
