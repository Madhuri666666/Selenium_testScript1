package testScripts;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import config.Common;

public class AlerDemo1 extends Common {
	@Test
      public void alert() throws Exception {
		
		d.get("https://retail.onlinesbi.sbi/retail/login.htm");
		assertEquals(d.getTitle(),"State Bank of India - Personal Banking");
		d.findElement(By.linkText("CONTINUE TO LOGIN")).click();
		d.findElement(By.id("Button2")).click();
	//	 assertEquals(d.switchTo().alert().getText(),"Enter username");
	Alert al=	d.switchTo().alert();      // return type alert
	assertEquals(al.getText(),"Enter username");
	
	 al.accept();
	 d.findElement(By.id("username")).sendKeys("Selenium");
	 d.findElement(By.id("Button2")).click();
	 al.accept();
	 d.findElement(By.id("label2")).sendKeys("password");
	 d.findElement(By.id("Button2")).click();
	 Thread.sleep(3000);
	 
	}
	
}
