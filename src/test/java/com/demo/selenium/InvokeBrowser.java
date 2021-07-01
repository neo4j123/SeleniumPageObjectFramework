package com.demo.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class InvokeBrowser {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\executables\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		/*WebDriver driver1 = new WebDriver();
		driver1 = new FirefoxDriver();*/
		driver = new FirefoxDriver();
		driver.get("https://www.selenium.dev/");
		// driver.findElement(By.name("q")).sendKeys("Testing", Keys.ENTER);
		// driver.manage().window().maximize();
		Thread.sleep(2000);

		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);

		System.out.println(driver.getCurrentUrl());
		driver.manage().window().fullscreen();

		driver.quit();

	}

}
