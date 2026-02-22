package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question5 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement element = driver.findElement(By.xpath("//h5[text()='Elements']"));
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		js.executeScript("arguments[0].click();", element);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Radio Button']"));
		Thread.sleep(2000);
		WebElement radiobutton1 = driver.findElement(By.xpath("//input[@id='yesRadio']"));
		radiobutton1.click();
		Thread.sleep(2000);
		boolean radiobutton1status = radiobutton1.isSelected();
		System.out.println("Status of Radio button after selection is:" + radiobutton1status);
		Thread.sleep(2000);
		WebElement message = driver.findElement(By.xpath("//span[@class='text-success']"));
		System.out.println("Success message is:" + message.getText());
		Thread.sleep(2000);
		WebElement radiobutton2 = driver.findElement(By.id("noRadio"));
		System.out.println("Is No Radio button enabled ?" + radiobutton2.isEnabled());
	}

}
