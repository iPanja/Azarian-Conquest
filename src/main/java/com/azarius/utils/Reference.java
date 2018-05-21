package com.azarius.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Reference {
	public static final String AUTHOR = "Project Azarius";
	public static final String VERSION = "1.0.0A";
	public static final String MODID = "ac";
	public static final String NAME = "Azarian Conquest";
	
	public static final String COMMONPROXY = "com.azarius.proxy.CommonProxy";
	public static final String CLIENTPROXY = "com.azarius.proxy.ClientProxy";
	
	
	private static Logger logger; 
	
	public static Logger getLogger() {
		if (logger == null) {
			logger = LogManager.getFormatterLogger(Reference.MODID);
		}
		return logger;
	}
	
}
