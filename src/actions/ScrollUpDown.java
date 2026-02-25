package actions;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class ScrollUpDown {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://export.ebay.com/in/");
		Thread.sleep(2000);
		
		//Reject cookies
		try {
			driver.findElement(By.id("onetrust-reject-all-handler")).click();
		}catch(Exception e) {
			System.out.println("Cookie not displayed");
		}
		
		Actions action = new Actions(driver);
		//Scroll down using Keyboard
		action.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(2000);
		
		//Scroll up using Keyboard
		action.sendKeys(Keys.PAGE_UP).perform();
		Thread.sleep(2000);
		
		//Scroll bottom using keyboard
		action.sendKeys(Keys.END).perform();
		Thread.sleep(2000);
		
		//Scroll top using keyboard
		action.sendKeys(Keys.HOME).perform();
		Thread.sleep(2000);
		
		driver.quit();

	}

}
