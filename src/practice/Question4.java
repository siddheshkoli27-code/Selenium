package practice;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Question4 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/checkboxes");
		driver.manage().window().maximize();
		WebElement checkbox1=driver.findElement(By.xpath("//input[@type='checkbox'][1]"));
		Thread.sleep(2000);
		if(!checkbox1.isSelected()) {
			checkbox1.click();
			System.out.println("Checkbox 1 was not selected.Now It is selected");
		}
		Thread.sleep(2000);
		WebElement checkbox2=driver.findElement(By.xpath("//input[@type='checkbox'][2]"));
		Thread.sleep(2000);
		if(checkbox2.isSelected()) {
			checkbox2.click();
			Thread.sleep(2000);
			System.out.println("Checkbox 2 was selected. Now it is deselected.");
		}
		boolean checkbox1Status=checkbox1.isSelected();
		boolean checkbox2Status=checkbox2.isSelected();
		System.out.println("Final Status:");
		System.out.println("Final status of checkbox 1 is:"+checkbox1Status);
		System.out.println("Final status of checkbox 2 is:"+checkbox2Status);

		driver.close();
	}
}

