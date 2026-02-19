package newpackage;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebElementDownloadEx {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		String baseURL = "https://the-internet.herokuapp.com/download";
		driver.get(baseURL);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement download = driver.findElement(By.xpath("//a[@href=\"download/demo-file.txt\"]"));
		download.click();
		Thread.sleep(1000);
	}

}
