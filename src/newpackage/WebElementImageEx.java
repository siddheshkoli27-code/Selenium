package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementImageEx {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement username = driver.findElement(By.id("user-name"));
		username.sendKeys("standard_user");
		Thread.sleep(2000);
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("secret_sauce");
		Thread.sleep(2000);
		WebElement login = driver.findElement(By.xpath("//input[@id=\"login-button\"]"));
		login.click();
		Thread.sleep(2000);
		WebElement item = driver.findElement(By.id("item_4_img_link"));
		item.click();
		Thread.sleep(2000);
		driver.close();
	}

}
