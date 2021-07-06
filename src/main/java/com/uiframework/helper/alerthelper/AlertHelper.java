package com.uiframework.helper.alerthelper;

import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import com.uiframework.loggers.LoggerHelper;

public class AlertHelper {

	private WebDriver driver;
	private Logger log = LoggerHelper.getLogger(AlertHelper.class);

	/**
	 * @author Administrator
	 * This method will accept alerts
	 */
	public void acceptingAlert() {

		log.info("Accepting the alert");
		Alert alt = driver.switchTo().alert();
		alt.accept();
	}

	/**
	 * @author Administrator
	 * This method will dismiss alerts
	 */
	public void dismissingAlert() {

		log.info("Dismissing the alert");
		Alert alt = driver.switchTo().alert();
		alt.dismiss();
	}

	/**
	 * @author Administrator
	 * This method will get text from alert
	 */
	public String getTextFromAlert() {

		log.info("Dismissing the alert");
		Alert alt = driver.switchTo().alert();
		return alt.getText();
	}
}
