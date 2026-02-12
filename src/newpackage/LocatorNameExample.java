package newpackage;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LocatorNameExample {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/login.php");
		driver.manage().window().maximize();
		driver.findElement(By.name("userName")).sendKeys("sidd");
		Thread.sleep(1000);
		driver.findElement(By.name("password")).sendKeys("123");
		Thread.sleep(1000);
		driver.findElement(By.name("submit")).click();
		Thread.sleep(1000);
		driver.close();

	}

}
