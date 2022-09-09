package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\workplace\\\\chromedriver\\\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/dragabble");
		WebElement src=driver.findElement(By.xpath("//div[@id='dragBox']"));
		Actions Act = new Actions(driver);
		Act.moveToElement(src);
		//Act.clickAndHold(src).moveToElement(src).release().build().perform();
		
		
		

	}

}
