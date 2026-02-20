package newpackage;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotExample {

	public static void main(String[] args) throws IOException, InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		TakesScreenshot ts = (TakesScreenshot) driver; 			//TypeCasting driver to Screenshot
		File source = ts.getScreenshotAs(OutputType.FILE); 		//Capture Screenshot
		File destination = new File("C:\\Users\\Admin\\eclipse-workspace\\Selenium\\screenshot.png"); //Destination File Path
		FileUtils.copyFile(source, destination); //Copy File to Destination
		Thread.sleep(2000);
		System.out.println("Screenshot taken Successfully");
		driver.quit();
	}

}
