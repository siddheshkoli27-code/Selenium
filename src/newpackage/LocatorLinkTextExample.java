package newpackage;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LocatorLinkTextExample {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/facebook.html");
		WebElement element = driver.findElement(By.linkText("Forgot your password?"));
		System.out.println("Get Text" + element.getText());
		element.click();
		Thread.sleep(1000);
		driver.close();
	}

}
