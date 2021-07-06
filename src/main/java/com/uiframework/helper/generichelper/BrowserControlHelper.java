package com.uiframework.helper.generichelper;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import com.uiframework.loggers.LoggerHelper;
import com.uiframework.switchers.WindowsHelper;

public class BrowserControlHelper {

	private WebDriver driver;
	private Logger log = LoggerHelper.getLogger(WindowsHelper.class);

	public BrowserControlHelper(WebDriver driver) {
		this.driver = driver;
	}

	public void navigateBack() {
		log.info("Navigate back");
		driver.navigate().back();
	}

	public void refreshBrowser() {
		log.info("Refresh the browser");
		driver.navigate().refresh();
	}
}
