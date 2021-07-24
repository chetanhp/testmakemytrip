/**
 * 
 */
package com.makemytrip.testcases;

	import java.io.FileInputStream;
	import java.util.Properties;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.ie.InternetExplorerDriver;



	/**
	 * @author User
	 *
	 */
	public class BaseClass {

			public static Properties prop;
			public static WebDriver driver;
			
			public BaseClass() {
				try {
					prop=new Properties();
					FileInputStream fis=new FileInputStream("./config/property");
					prop.load(fis);
				}
				catch(Exception e) {
					e.printStackTrace();
				}
			}
			
			public static void initilization() {
				String browserName=prop.getProperty("browser");
				
				if(browserName.equalsIgnoreCase("ie")) {
					System.setProperty("webdriver.ie.driver", "./drivers/IEDriverServer.exe");
					driver=new InternetExplorerDriver();		
				}
				else if(browserName.equalsIgnoreCase("chrome")) {
					System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
					driver=new ChromeDriver();	
			}
				else if(browserName.equalsIgnoreCase("firefox")) {
					System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
					driver=new FirefoxDriver();
				}
				else {
					System.out.println("we did not recogise the browser");
				}
				
				driver.manage().window().maximize();
				driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
				driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
				driver.get(prop.getProperty("url"));
			
			}}
