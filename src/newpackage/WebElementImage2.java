package newpackage;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebElementImage2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/facebook.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement password = driver.findElement(By.partialLinkText("Forgot your password?"));
		password.click();
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement message = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='lfloat']"))
        );
		WebElement image = driver.findElement(By.xpath("//a[@class='lfloat']"));
		image.click();
		Thread.sleep(2000);
		driver.close();
	}

}
