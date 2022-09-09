package demo;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class scrolldemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\workplace\\chromedriver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://demoqa.com/");
		driver.manage().window().maximize();
		
		Actions ac=new Actions(driver);
		WebElement a1=driver.findElement(By.xpath("//body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]"));
		ac.click(a1).perform();
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(100,350)", "");
	     Thread.sleep(5000);
		WebElement a2=driver.findElement(By.xpath("//body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/span[1]/div[1]"));
		ac.click(a2).perform();
		WebElement a3=driver.findElement(By.xpath("//span[normalize-space()='Date Picker']"));
		ac.click(a3).perform();
		

	}

}
