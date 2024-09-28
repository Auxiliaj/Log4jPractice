package com.logexamples;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class Log4jxmlConfigurator {
	
	static Logger logger= Logger.getLogger(Log4jxmlConfigurator.class);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DOMConfigurator.configure("log4j.xml");
		
		logger.debug("Debugging");
		logger.info("Info");
		logger.warn("Warning");
		logger.error("Error Message");
		logger.fatal("Error is fatal");

	}

}
