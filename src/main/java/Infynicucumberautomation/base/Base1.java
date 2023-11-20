package Infynicucumberautomation.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


import Infynicucumberautomation.utils.PropertyReader;
import io.cucumber.java.After;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Base1 {
	public static WebDriver driver;// driver should be visible for all the classes in the project
	//reusable method to launch browser
    
		public static void launchBrowser(String browser)

		{
			if (browser.equals("chrome")) {
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();

			} else if (browser.equals("Edge")) {
				WebDriverManager.chromedriver().setup();
				driver = new EdgeDriver();
			}
			driver.manage().window().maximize();
			
			
		}

	//reusable method to launch application
		  
		public static void launchApp() throws IOException {
			launchBrowser("chrome");
			String url=PropertyReader.readDataFromPropertyFile("appurl");
			driver.get(url);
			implicitWait(5);
			
		}
	//reusable method for implicit wait
		public static void implicitWait(long seconds) {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
		}
	
		public static void loadData()
		{
			System.out.println("BeforeSuite:This method will run before all the testcases");
		}
		
		public static void closeData()
		{
			System.out.println("AfterSuite:This method will run after all the testcases");
		}
		
		public static void testData()
		{
			System.out.println("BeforeTest:This method will run before all the testcases");
		}
		
		public static void closetestData()
		{
			System.out.println("AfterTest:This method will run after all the testcases");
		}
	//reusable method to close application
		@After
		public static void closeApp() {
			driver.close();
		}
		
	}



