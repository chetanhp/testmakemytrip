/**
 * 
 */
package utilities;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

/**
 * @author User
 *
 */
public class ScreenShotUtiltity {
	
	@Test
	public static void captureScrenshot(WebDriver driver ,String screenshotName) {
		
		try {
			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(src, new File("./FailedScreenshots/"+screenshotName+".png"));
			System.out.println("screenshot taken");
		}
		catch(Exception e) {
			System.out.println("exception while taking screenshot"+e.getMessage());
		}
	}

}
