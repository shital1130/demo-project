package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestiondemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\workplace\\chromedriver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@title='Search']")).click();
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("mumbai");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys(Keys.ENTER);
		
	}

}
