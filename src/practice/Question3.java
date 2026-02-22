package practice;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Question3 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(2000);
		WebElement password =driver.findElement(By.name("password"));
		password.sendKeys("secret_sauce");
		Thread.sleep(2000);
		password.clear();
		Thread.sleep(2000);
		password.sendKeys("secret_sauce");
		Thread.sleep(2000);
		WebElement login = driver.findElement(By.id("login-button"));
		boolean status =login.isDisplayed();
		System.out.println("Login button is Displayed:"+status);
		boolean status1 =login.isEnabled();
		System.out.println("Login button is Enabled:"+status1);
		login.click();
		Thread.sleep(2000);
		System.out.println("Get Attribute Returning Text:"+login.getAttribute("id"));
		Thread.sleep(2000);
		System.out.println("Get text value:"+login.getText());
		driver.close();
		
		
	}

}
