package newpackage;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebElementUploadEx2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/upload/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement choosefile=driver.findElement(By.xpath("//input[@id='uploadfile_0']"));
		Thread.sleep(2000);
		choosefile.sendKeys("D:\\Siddhesh\\code.txt");
		Thread.sleep(2000);
		WebElement terms=driver.findElement(By.xpath("//input[@id='terms']"));
		terms.click();
		Thread.sleep(2000);
		WebElement submit=driver.findElement(By.name("send"));
		submit.click();
		Thread.sleep(2000);
		driver.close();
		
	}

}
