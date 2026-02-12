package newpackage;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LocatorLinkTextExample {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/facebook.html");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.close();
	}

}
