package demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class flipkart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\workplace\\chromedriver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Actions ac=new Actions(driver);
		//click on cross icon
		WebElement a1=driver.findElement(By.xpath("//button[contains(text(),'✕')]"));
		ac.click(a1).perform();
		Thread.sleep(1000);
		//click on view all 
		WebElement a2 =driver.findElement(By.xpath("//a[normalize-space()='VIEW ALL']"));
		ac.click(a2).perform();
		Thread.sleep(1000);
		//scroll down and click last product of page
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(100,350)", "");
	    Thread.sleep(1000);
	    WebElement a3=driver.findElement(By.xpath("//img[@alt='LUXOR Premium Exercise Notebook Regular Notebook Ruled 180 Pages']"));
	    ac.click(a3).build().perform();
	    Thread.sleep(1000);
		//scroll down and go to 3 page
	    JavascriptExecutor js1 = (JavascriptExecutor) driver;
	    js1.executeScript("window.scrollBy(0,5050)", "");
	    Thread.sleep(2000);
	    WebElement a4=driver.findElement(By.xpath("//a[normalize-space()='3']"));
	    ac.click(a4).build().perform();
	    Thread.sleep(2000);
	    //select product and add to cart
	   
	   WebElement a5=driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/a[1]/div[1]/div[1]"));
	   ac.click(a5).build().perform();
	  
	   Set<String>windows=driver.getWindowHandles();
		Iterator<String> it=windows.iterator();
		String p_window=it.next();
		String c_window=it.next();
		driver.switchTo().window(c_window);
		Thread.sleep(1000);
        driver.findElement(By.xpath("//button[normalize-space()='BUY NOW']")).click();
       
	    
		
	}

}
