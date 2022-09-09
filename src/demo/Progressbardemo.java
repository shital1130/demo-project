package demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Progressbardemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\workplace\\chromedriver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://demoqa.com/progress-bar");
		driver.findElement(By.xpath("//button[@id='startStopButton']")).click(); 	
		WebElement progressbar = driver.findElement(By.xpath("//button[@id='startStopButton']"));
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(60));
		boolean progressstus= wait.until(ExpectedConditions.attributeToBe(progressbar, "aria-valuenow","100"));
		if(progressstus==true)
		{
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@id='resetButton']"))).click();
		}
		
	}

}
