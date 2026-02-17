package newpackage;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class WebElementDisableEnabled {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.letskodeit.com/practice?utm_source=chatgpt.com%22);");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		WebElement enable = driver.findElement(By.id("enabled-button"));
		enable.click();
		Thread.sleep(2000);
		System.out.println("is Enabled status:"+driver.findElement(By.id("enabled-example-input")).isEnabled());
		Thread.sleep(2000);
		driver.findElement(By.id("disabled-button")).click();
		Thread.sleep(2000);
		System.out.println("is Enable status:"+driver.findElement(By.id("enabled-example-input")).isEnabled());
		Thread.sleep(2000);
		System.out.println("Get Tagname method returning text:"+enable.getTagName());
		System.out.println("Get Attribute method returning text:"+enable.getAttribute("id"));
		System.out.println("Get Size method returning text:"+enable.getSize());
		System.out.println("Get CSS Value method returning text:"+enable.getCssValue("id"));
		driver.close();
	}

}
