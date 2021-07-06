package com.uiframework.helper.javascripthelper;

import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.uiframework.loggers.LoggerHelper;

public class JavscriptHelper {

	private WebDriver driver;

	private Logger log = LoggerHelper.getLogger(JavscriptHelper.class);

	public JavscriptHelper(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * 
	 * @param script
	 * @return
	 */
	public Object executeScript(String script) {

		log.info("Execute JavaScript executor");
		JavascriptExecutor jScript = (JavascriptExecutor) driver;
		return jScript.executeScript(script);
	}

	/**
	 * 
	 * @param script
	 * @param args
	 * @return
	 */
	public Object executeScript(String script, Object... args) {

		log.info("Execute JavaScript executor");
		JavascriptExecutor jScript = (JavascriptExecutor) driver;
		return jScript.executeScript(script, args);
	}

	/**
	 * 
	 * @param element
	 */
	public void scrollToElement(WebElement element) {

		log.info("Scrolling a window to a particular element");
		JavascriptExecutor jScript = (JavascriptExecutor) driver;
		jScript.executeAsyncScript("windows.scrollTo(arguments[0], arguments[1])", element.getLocation().x,
				element.getLocation().y);
	}

	/**
	 * 
	 * @param element
	 */
	public void scrollToElementAndClick(WebElement element) {

		log.info("Scrolling a window to a particular element");
		JavascriptExecutor jScript = (JavascriptExecutor) driver;
		jScript.executeAsyncScript("windows.scrollTo(arguments[0], arguments[1])", element.getLocation().x,
				element.getLocation().y);
		log.info("After scrolling clicked an element");
		element.click();
	}

	/**
	 * 
	 * @param element
	 */
	public void scrollIntoView(WebElement element) {

		log.info("Scrolling and viewing to a particular element");
		JavascriptExecutor jScript = (JavascriptExecutor) driver;
		jScript.executeAsyncScript("arguments[0]. scrollIntoView(true)", element);

	}
}
