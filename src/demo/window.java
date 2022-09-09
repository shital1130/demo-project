package demo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class window {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\workplace\\chromedriver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://demo.guru99.com/popup.php/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Click Here")).click();
		Set<String>windows=driver.getWindowHandles();

		Iterator<String> it=windows.iterator();
		String p_window=it.next();
		String c_window=it.next();
		driver.switchTo().window(c_window);
		Thread.sleep(1000);
		
		
	}

}
