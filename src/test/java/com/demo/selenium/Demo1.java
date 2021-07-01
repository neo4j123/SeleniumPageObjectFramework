package com.demo.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo1 {
	
	WebDriver driver;

	@Test
	public void doLogin() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "/src/test/resources/executables/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//100 lines
		driver.findElement(By.xpath("//*[@id=\"gs_tti50\"]")).sendKeys("Selenium", Keys.ENTER);
		
		driver.quit();
	}

}
