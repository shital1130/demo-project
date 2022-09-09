package demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class promptdemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\workplace\\chromedriver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.findElement(By.id("promtButton")).click();
		Alert A = driver.switchTo().alert();
		driver.switchTo().alert().sendKeys("Text");
		 String alertMessage= driver.switchTo().alert().getText();
		 Thread.sleep(2000);
		System.out.println(alertMessage);
		A.accept();		
		
		
		
	}

}
