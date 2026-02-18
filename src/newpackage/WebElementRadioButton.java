package newpackage;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebElementRadioButton {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.letskodeit.com/practice?utm_source=chatgpt.com%22);");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement radiobutton1 = driver.findElement(By.id("bmwradio"));
		radiobutton1.click();
		Thread.sleep(2000);
		WebElement radiobutton2 = driver.findElement(By.id("benzradio"));
		radiobutton2.click();
		Thread.sleep(2000);
		driver.close();
	}

}
