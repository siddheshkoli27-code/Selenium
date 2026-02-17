package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCheckboxEx {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.letskodeit.com/practice?utm_source=chatgpt.com%22);");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement checkbox = driver.findElement(By.xpath("//input[@id=\"hondacheck\"]"));
		checkbox.click();
		Thread.sleep(2000);
		System.out.println("After Click - Is Selected: " + checkbox.isSelected());
		if (checkbox.isSelected()) {
			checkbox.click();
		}
		Thread.sleep(2000);
		System.out.println("After Click - Is Selected: " + checkbox.isSelected());
		Thread.sleep(2000);
		driver.close();
	}

}
