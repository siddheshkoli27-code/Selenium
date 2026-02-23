package newpackage;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindowHandleEx1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		driver.get("https://demoqa.com/browser-windows");
		System.out.println("Main Page Title is:"+driver.getTitle());
		driver.findElement(By.id("tabButton")).click();
		Thread.sleep(3000);
		/// Get all window IDs
		Set<String> ids=driver.getWindowHandles();
		Iterator<String> it =ids.iterator();
		String parentid=it.next();	 //Main window
		String childid=it.next();	//Child window
		Thread.sleep(3000);
		//Switch to child window
		driver.switchTo().window(childid);
		System.out.println("Child Page Title:"+driver.getTitle());
		Thread.sleep(3000);
		//Switch to parent window
		driver.switchTo().window(parentid);
		System.out.println("Parent Page title:"+driver.getTitle());
		Thread.sleep(3000);
		driver.quit();
	}

}
