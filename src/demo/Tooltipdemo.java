package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Tooltipdemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\workplace\\chromedriver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://demoqa.com/tool-tips");
		Actions act =new Actions(driver);
		WebElement tultip =driver.findElement(By.id("toolTipButton"));
		act.moveToElement(tultip).perform();
		Thread.sleep(2000);
		 Actions act1 =new Actions(driver);
		 WebElement tultip1=driver.findElement(By.id("toolTipTextField"));
		 act1.moveToElement(tultip1).perform();
		 
		
	}

}
