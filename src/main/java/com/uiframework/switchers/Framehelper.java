package com.uiframework.switchers;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.uiframework.loggers.LoggerHelper;

public class Framehelper {

	private WebDriver driver;
	private Logger log = LoggerHelper.getLogger(Framehelper.class);

	public Framehelper(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * <p>
	 * Switching to frame by index
	 * 
	 * @param frameIndex
	 */
	public void switchFrameByIndex(int frameIndex) {

		log.info("Switch to frame by index");
		driver.switchTo().frame(frameIndex);

	}

	/**
	 * 
	 * <p>
	 * Switching to frame by Name
	 * 
	 * @param frameName
	 */
	public void switchFrameByName(String frameName) {

		log.info("Switch to frame by Name: "+frameName.toString());
		driver.switchTo().frame(frameName);

	}

	/**
	 * 
	 * <p>
	 * Switching to frame by Id
	 * 
	 * @param frameId
	 */
	public void switchFrameById(String frameId) {

		log.info("Switch to frame by ID: "+frameId.toString());
		driver.switchTo().frame(frameId);

	}
	
	/**
	 * Switching to parent window
	 */
	public void switchToParentWindow() {
		log.info("Switching to Parent Window");
		driver.switchTo().defaultContent();
	}

}
