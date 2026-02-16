package newpackage;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebElementExample {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.toolsqa.com/selenium-training?q=banner#enroll-form");
		driver.manage().window().maximize();
		WebElement firstname = driver.findElement(By.name("firstName"));
		firstname.sendKeys("Siddhesh");
		Thread.sleep(2000);
		WebElement element1 = driver.findElement(By.name("firstName"));
		element1.clear();
		WebElement lastname = driver.findElement(By.name("lastName"));
		lastname.sendKeys("lastName");
		Thread.sleep(2000);
		WebElement element2 = driver.findElement(By.name("lastName"));
		element2.clear();
		WebElement element4 = driver.findElement(By.name("lastName"));
		boolean status2 = element4.isEnabled();
		System.out.println(status2);
		WebElement element3 = driver.findElement(By.xpath("//button[@class=\"btn btn-block btn-primary\"]"));
		element3.click();
		Thread.sleep(2000);
		WebElement display = driver.findElement(By.id("email"));
		boolean status1 = display.isDisplayed();
		System.out.println(status1);
		Thread.sleep(2000);
		driver.quit();

	}

}
