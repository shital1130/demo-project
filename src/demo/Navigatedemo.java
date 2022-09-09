package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigatedemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\workplace\\chromedriver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		System.out.println("Before"+ driver.getTitle());
		Thread.sleep(1000);
        driver.navigate().to("http://www.google.com");
        driver.navigate().to("http://www.facebook.com");
        driver.navigate().to("http://www.india.com");
        Thread.sleep(1000);
        driver.navigate().back();
        driver.quit();
        

	}

}
