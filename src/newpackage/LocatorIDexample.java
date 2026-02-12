package newpackage;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LocatorIDexample {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/ajax.html");
		driver.findElement(By.id("no")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("buttoncheck")).click();
		Thread.sleep(1000);
		driver.close();
	}

}
