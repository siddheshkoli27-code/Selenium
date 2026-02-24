package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionEx {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Actions action = new Actions(driver);
		
		//Double Click & Right Click
		driver.get("https://demoqa.com/buttons");
		Thread.sleep(2000);
		WebElement doubleClickBtn=driver.findElement(By.id("doubleClickBtn"));
		WebElement rightClickBtn=driver.findElement(By.id("rightClickBtn"));
		
		//DoubleClick
		action.doubleClick(doubleClickBtn).perform();
		System.out.println("Double Click successfully");
		Thread.sleep(2000);
		
		//RightClick
		action.contextClick(rightClickBtn).perform();
		System.out.println("Right Clicked successfully");
		Thread.sleep(2000);
		
		//Click and Hold
		action.clickAndHold(doubleClickBtn).pause(2000).release().perform();
		Thread.sleep(2000);
		
		driver.quit();
		
	}

}
