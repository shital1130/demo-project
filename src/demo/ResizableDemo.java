package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ResizableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\workplace\\\\chromedriver\\\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
       driver.get("https://demoqa.com/resizable");
       //WebElement frame= driver.findElement(By.xpath());
      WebElement element= driver.findElement(By.xpath("(//span[@class='react-resizable-handle react-resizable-handle-se'])[2]"));
      Actions act=new Actions(driver);
      act.dragAndDropBy(element, 200, 200).build().perform();
		
	}

}
