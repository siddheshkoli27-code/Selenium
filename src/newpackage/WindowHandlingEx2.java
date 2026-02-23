package newpackage;

import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WindowHandlingEx2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");
		String parentId=driver.getWindowHandle();
		//Click all child window buttons
		driver.findElement(By.id("tabButton")).click();
		driver.findElement(By.id("windowButton")).click();
		Thread.sleep(3000);
		//Get all windows
		Set<String> allwindows=driver.getWindowHandles();
		for(String id : allwindows) {
			//if it is not parent then it is child
			if(!id.equals(parentId)) {
				driver.switchTo().window(id);
				Thread.sleep(3000);
				//Print text from child window
				String text =driver.findElement(By.id("sampleHeading")).getText();
				System.out.println("Child window text:"+text);
				driver.close();
			}
		}
		Thread.sleep(3000);
		//Switch back to parent window
		driver.switchTo().window(parentId);
		Thread.sleep(3000);
		//Print parent heading
		String parentHeading=driver.findElement(By.xpath("//h1")).getText();
		System.out.println("Parent heading:"+parentHeading);
		Thread.sleep(3000);
		driver.quit();
		
	}

}
