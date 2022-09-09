package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionclassdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Set system properties for geckodriver This is required since Selenium 3.0
		System.setProperty("webdriver.chrome.driver", "C:\\workplace\\chromedriver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		

driver.get("https://www.amazon.in/");
		
		//maximise the window
		driver.manage().window().maximize();

		//create an object for the Actions class and pass the driver argument 
		Actions action = new Actions(driver);
	
		//specify the locator of the search box in which the product has to be typed
		WebElement elementToType = driver.findElement(By.id("twotabsearchtextbox"));
		
		//pass the value of the product
		action.sendKeys(elementToType, "iphone").build().perform();
		
		//specify the locator of the search button
		WebElement elementToClick = driver.findElement(By.className("nav-input"));

		//perform a mouse click on the search button
		action.click(elementToClick).build().perform();
		
		
		 
	}


	 }
	 
	


