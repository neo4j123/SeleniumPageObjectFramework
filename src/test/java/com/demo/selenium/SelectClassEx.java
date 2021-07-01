package com.demo.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SelectClassEx {

	WebDriver driver;

	@Test
	public void openSelects() {

		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "/src/test/resources/executables/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[contains(text(), 'Create New Account')]")).click();

		WebElement day = driver.findElement(By.id("day"));
		Select sel = new Select(day);
		sel.selectByValue("5");
		
		WebElement month = driver.findElement(By.id("month"));
		sel = new Select(month);
		sel.selectByIndex(1);

	}

}
