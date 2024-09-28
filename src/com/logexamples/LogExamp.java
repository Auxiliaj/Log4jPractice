package com.logexamples;


import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;


public class LogExamp {
	
	 static Logger logger= Logger.getLogger(LogExamp.class);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BasicConfigurator.configure();
		logger.debug("Debugging");
		logger.info("Info");
		logger.warn("Warning Msg");
		logger.error("Error message");
		logger.fatal("Error is fatal");
		
		
	}

}
