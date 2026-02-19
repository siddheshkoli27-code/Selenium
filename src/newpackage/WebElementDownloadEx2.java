package newpackage;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebElementDownloadEx2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://eternallybored.org/misc/wget/");
		Thread.sleep(2000);
		WebElement download = driver.findElement(By.linkText("ZIP"));
		download.click();
		Thread.sleep(2000);

	}

}
