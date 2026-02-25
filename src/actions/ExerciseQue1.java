package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ExerciseQue1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Actions action = new Actions(driver);
		driver.get("https://demoqa.com/menu/");

		WebElement MainItem1 = driver.findElement(By.xpath("//a[text()='Main Item 1']"));
		Thread.sleep(2000);
		action.moveToElement(MainItem1).perform();
		Thread.sleep(2000);

		WebElement MainItem2 = driver.findElement(By.xpath("//a[text()='Main Item 2']"));
		action.moveToElement(MainItem2).perform();
		Thread.sleep(2000);

		WebElement SUBSUBList = driver.findElement(By.xpath("//a[text()='SUB SUB LIST »']"));
		action.moveToElement(SUBSUBList).perform();
		Thread.sleep(2000);
		SUBSUBList.click();
		driver.quit();

	}

}
