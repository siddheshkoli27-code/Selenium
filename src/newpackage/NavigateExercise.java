package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateExercise {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		String URL="https://www.toolsqa.com/selenium-training/";
		driver.manage().window().maximize();
		driver.navigate().to(URL);
		driver.findElement(By.xpath("//a[contains(text(),'Go To Registration')]")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().forward();
		Thread.sleep(1000);
		driver.navigate().to(URL);
		Thread.sleep(1000);
		driver.navigate().refresh();
		Thread.sleep(1000);
		driver.close();
	}

}
