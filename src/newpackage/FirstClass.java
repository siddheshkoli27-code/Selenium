package newpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstClass {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		String title=driver.getTitle();
		System.out.println(title);
		String currentURL = driver.getCurrentUrl();
		System.out.println(currentURL);
		System.out.println("Page Source is:"+driver.getPageSource());
		Thread.sleep(500);
		driver.quit();
	}

}
