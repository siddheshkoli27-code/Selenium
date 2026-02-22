package practice;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Question2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/login");
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys("tomsmith");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("SuperSecretPassword!");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int totalLinks = links.size();
		System.out.println("Total Number of links are:"+ totalLinks);
		driver.close();
		
	}

}
