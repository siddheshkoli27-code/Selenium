package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementSubmit {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/facebook.html");
		WebElement email=driver.findElement(By.id("email"));
		email.sendKeys("abc@123.com");
		Thread.sleep(2000);
		WebElement password=driver.findElement(By.id("pass"));
		password.sendKeys("1234");
		Thread.sleep(2000);
		WebElement submit=driver.findElement(By.id("u_0_b"));
		submit.submit();
		driver.quit();
	}

}
