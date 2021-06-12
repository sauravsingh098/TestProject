package StackTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class HomePage {
	
	public static WebDriver driver =null;
	
	@BeforeSuite
	public void HomePages () throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\loc\\chromedriver.exe");
	     driver =new ChromeDriver();
	     driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 driver.get("https://stackmybiz.com/");
		
		
		driver.findElement(By.xpath("//a[contains(text(),'Careers')]")).click();
		Thread.sleep(3000);
		
		
		
		driver.findElement(By.xpath("//h6[contains(text(),'QA Automation Test Engineer')]")).click();
		Thread.sleep(3000);
		
		
		
	}
	
     @AfterSuite
	
	public void TestDown(){
		HomePage.driver.quit();
	}

}
