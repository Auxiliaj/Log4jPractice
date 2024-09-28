package com.logexamples;


import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class PropertyFileConfigExample {
	
	static Logger logger=LogManager.getLogger(PropertyFileConfigExample.class);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//final Logger logger = LogManager.getLogger(PropertyFileConfigExample.class);

		PropertyConfigurator.configure("log4j.properties");
		
		//PropertyConfigurator.configure("D:\\files\\log4j.properties");
		logger.debug("Debugging");
		logger.info("Info");
		logger.warn("Warning");
		logger.error("Error Message");
		logger.fatal("Error is fatal");
	}

}
