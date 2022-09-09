package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\workplace\\chromedriver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://demoqa.com/droppable");
		driver.manage().window().maximize();
		
		WebElement src=driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement targt =driver.findElement(By.xpath("//div[@id='simpleDropContainer']//div[@id='droppable']"));
		Actions act =new Actions(driver);
		act.dragAndDrop(src, targt);
		act.build().perform();
		
		
		
	}

}
