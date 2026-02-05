package newpackage;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Exercise3 {

	public static void main(String[] args) throws InterruptedException {

		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
		String title=driver.getCurrentUrl();
		System.out.println(title);
		String currentURL=driver.getCurrentUrl();
		System.out.println(currentURL);
		System.out.println("Page Source Code is:"+driver.getPageSource());
		Thread.sleep(1000);
		driver.close();
		
	}

}
