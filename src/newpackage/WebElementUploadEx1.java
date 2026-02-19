package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementUploadEx1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		String baseURL="https://the-internet.herokuapp.com/upload";
		driver.get(baseURL);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement upload = driver.findElement(By.id("file-upload"));
		Thread.sleep(1000);
		upload.sendKeys("D:\\Siddhesh\\code.txt");
		Thread.sleep(1000);
		WebElement upload2 = driver.findElement(By.id("file-submit"));
		upload2.click();
		Thread.sleep(1000);
		driver.close();
	}

}
