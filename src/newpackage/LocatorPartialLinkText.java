package newpackage;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LocatorPartialLinkText {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.partialLinkText("Forgotten")).click();
		Thread.sleep(1000);
		driver.close();
	}

}
