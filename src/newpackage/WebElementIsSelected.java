package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementIsSelected {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/ajax.html");
		WebElement element1=driver.findElement(By.id("yes"));
		System.out.println("Before selection:"+" "+element1.isSelected());
		Thread.sleep(2000);
		element1.click();
		Thread.sleep(2000);
		System.out.println("After selection:"+" "+element1.isSelected());
		driver.quit();

	}

}
