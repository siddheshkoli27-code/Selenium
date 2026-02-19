package newpackage;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class DropdownSelectionEx2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		String baseURL="https://www.letskodeit.com/practice";
		driver.get(baseURL);
		Thread.sleep(2000);
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.id("carselect"));
		Select select = new Select(element);
		select.selectByIndex(0);
		Thread.sleep(2000);
		select.selectByValue("benz");
		Thread.sleep(2000);
		select.deselectByIndex(1);
		select.deselectByVisibleText("Honda");
		Thread.sleep(2000);
		driver.quit();
	}

}
