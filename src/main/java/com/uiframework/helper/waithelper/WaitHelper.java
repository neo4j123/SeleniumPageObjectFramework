package com.uiframework.helper.waithelper;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.uiframework.loggers.LoggerHelper;

@SuppressWarnings("unused")
public class WaitHelper {

	private WebDriver driver;
	private Logger log = LoggerHelper.getLogger(WaitHelper.class);

	/**
	 * 
	 * @param timeOut
	 * @param unit
	 */
	public void setImplicitWait(long timeOut, TimeUnit unit) {

		log.info("Setting up an page timeout to be : " + timeOut);
		driver.manage().timeouts().implicitlyWait(timeOut, unit);

	}

	/**
	 * 
	 * @param timeOut
	 * @param element
	 */
	private void waitingForElementToBeClickable(long timeOut, WebElement element) {

		log.info("Waiting for element to be clickable : " + timeOut);
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	/**
	 * @param timeOut
	 * @param element
	 * @return
	 */
	private WebDriverWait waitingForElement(long timeOut, WebElement element) {

		log.info("Waiting for element be present : " + timeOut);
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		wait.pollingEvery(Duration.ofMillis(500));
		wait.ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		return wait;
	}

	/**
	 * 
	 * @param timeOut
	 * @param element
	 */
	private void waitingForElementToBeVisible(long timeOut, WebElement element) {

		log.info("Waiting for element to be visible : " + timeOut);
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		wait.pollingEvery(Duration.ofMillis(500));
		wait.until(ExpectedConditions.visibilityOf(element));

	}

	/**
	 * 
	 * @param timeOut
	 * @param element
	 * @return
	 */
	private boolean waitingForElementToBePresent(long timeOut, WebElement element) {

		log.info("Waiting for element to be visible : " + timeOut);
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		wait.pollingEvery(Duration.ofMillis(500));
		return wait.until(ExpectedConditions.invisibilityOf(element));

	}

	/**
	 * 
	 * @param timeOut
	 * @param ele
	 */
	private void waitingForFrameSwitch(long timeOut, WebElement ele) {

		log.info("Waiting for frame to be switched : " + timeOut);
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		wait.pollingEvery(Duration.ofMillis(500));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(ele));
		log.info("Ready for frame to be switched : " + timeOut);

	}

	/**
	 * 
	 */
	public void getFluentWait() {

		Wait<WebDriver> fWait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofMillis(500)).ignoring(NoSuchElementException.class);

	}

	/**
	 * @param timeOut
	 */
	public void getPageLoadTime(long timeOut) {

		driver.manage().timeouts().pageLoadTimeout(timeOut, TimeUnit.SECONDS);
	}

}
