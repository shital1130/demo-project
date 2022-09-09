package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class accordian {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\workplace\\chromedriver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://demoqa.com/accordian");
		driver.manage().window().maximize();
		WebElement firstcard= driver.findElement(By.xpath("//div[@class='card'][1]/div[2]"));
		String className=firstcard.getAttribute("class");
		System.out.println(className);
		
		driver.findElement(By.id("section1Heading")).click();
		className=firstcard.getAttribute("class");
		System.out.println(className);
		Thread.sleep(2000);
		
		WebElement secondcard =driver.findElement(By.xpath("//div[@class='card'][1]/div[2]"));
		String className1=secondcard.getAttribute("class");
		System.out.println(className1);
		Thread.sleep(2000);
		
		driver.findElement(By.id("section2Heading")).click();
		className1=secondcard.getAttribute("class");
		System.out.println(className1);
		Thread.sleep(2000);
		
		WebElement thirdcard =driver.findElement(By.xpath("//div[@class='card'][3]/div[2]"));
		String className2=secondcard.getAttribute("class");
		System.out.println(className2);
		Thread.sleep(2000);
		
		driver.findElement(By.id("section3Heading")).click();
		className2=secondcard.getAttribute("class");
		System.out.println(className2);
		Thread.sleep(2000);
		

	}

}
