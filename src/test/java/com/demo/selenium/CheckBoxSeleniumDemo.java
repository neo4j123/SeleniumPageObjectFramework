package com.demo.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CheckBoxSeleniumDemo {

	WebDriver driver;

	@Test
	public void verifyCheckBox() {

		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "/src/test/resources/executables/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/checkbox");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement checkbox = driver.findElement(By.xpath("//span[@class='rct-text']/label/span[1]"));
		System.out.println(checkbox.isSelected());
		checkbox.click();
		System.out.println(checkbox.isSelected());

	}

}
