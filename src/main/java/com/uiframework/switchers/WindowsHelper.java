package com.uiframework.switchers;

import java.util.Set;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.uiframework.loggers.LoggerHelper;

public class WindowsHelper {

	private WebDriver driver;
	private Logger log = LoggerHelper.getLogger(WindowsHelper.class);

	public WindowsHelper(WebDriver driver) {
		this.driver = driver;
	}

	public void switchToParentWindow() {
		log.info("Switching to Parent Window");
		driver.switchTo().defaultContent();
	}

	/**
	 * We can directly reach to the particular child window
	 * @param index
	 */
	public void switchToWindow(int index) {

		Set<String> windows = driver.getWindowHandles();
		int i = 1;

		for (String window : windows) {
			if (i == index) {
				log.info("Switching to Child Window");
				driver.switchTo().window(window);
			} else {
				i++;
			}
		}
	}
	
	/**
	 * This will close the child window one by one
	 */
	public void closeAllWindowsTabs() {
		
		Set<String> windows = driver.getWindowHandles();
		String parentWindow = driver.getWindowHandle();
		
		for(String window : windows) {
			log.info("Closing the child Window");
			if(!window.equalsIgnoreCase(parentWindow)) {
				driver.close();
			}
		}
		
		
	}
}
