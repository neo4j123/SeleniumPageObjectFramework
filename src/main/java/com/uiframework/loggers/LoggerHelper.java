package com.uiframework.loggers;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import com.uiframeowrk.utilities.ResourceHelper;

public class LoggerHelper {

	public static boolean root = false;

	@SuppressWarnings("rawtypes")
	public static Logger getLogger(Class cls) {

		if (root) {

			return Logger.getLogger(cls);
		}

		PropertyConfigurator.configure(ResourceHelper
				.getResourcePath("//src//main//resources//com//uiframework//configfiles//log4j.properties"));
		root = true;
		return Logger.getLogger(cls);

	}

}
