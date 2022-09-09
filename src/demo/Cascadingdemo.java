package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Cascadingdemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\workplace\\chromedriver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://phppot.com/demo/country-state-city-example-cascading-jquery-dependent-dropdown/");
		driver.manage().window().maximize();
		Select select =new Select(driver.findElement(By.xpath("//select[@id='country-list']")));
		select.selectByVisibleText("India");
		Thread.sleep(2000);
		
		Select select1 =new Select(driver.findElement(By.xpath("//select[@id='state-list']")));
		select1.selectByVisibleText("Haryana");
		Thread.sleep(2000);
		
		Select select2 =new Select(driver.findElement(By.xpath("//select[@id='city-list']")));
		select2.selectByVisibleText("Rewari");
		Thread.sleep(2000);
		driver.quit();
		


 }
		
		
	
    }


	


