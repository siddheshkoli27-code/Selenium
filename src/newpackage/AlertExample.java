package newpackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		Alert alert1 = driver.switchTo().alert();
		System.out.println("Simple Alert Text:" +alert1.getText());
		Thread.sleep(2000);
		alert1.accept();
		
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		Alert alert2 = driver.switchTo().alert();
		System.out.println("Confirm Alert Text:"+alert2.getText());
		Thread.sleep(2000);
		alert2.dismiss();
		
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Alert alert3 = driver.switchTo().alert();
		System.out.println("Prompt alert Text: " + alert3.getText());
		alert3.sendKeys("Selenium");
		alert3.accept();
		Thread.sleep(2000);
		driver.quit();
		
	}

}
