package newpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		String title=driver.getTitle();
		System.out.println(title);
		String currentURL=driver.getCurrentUrl();
		System.out.println(currentURL);
		System.out.println("Page Source Code is:"+driver.getPageSource());
		Thread.sleep(1000);
		driver.close();
	}

}
