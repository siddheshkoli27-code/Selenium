package newpackage;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LocatorClassNameExample {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/facebook.html");
		driver.manage().window().maximize();
		driver.findElement(By.className("inputtext")).sendKeys("sidd");
		Thread.sleep(1000);
		driver.findElement(By.id("pass")).sendKeys("1234");
		Thread.sleep(1000);
		driver.findElement(By.id("u_0_b")).click();
		Thread.sleep(1000);
		driver.close();

	}

}
