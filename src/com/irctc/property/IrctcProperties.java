package com.irctc.property;

import com.qmetry.qaf.automation.core.ConfigurationManager;
import com.qmetry.qaf.automation.util.PropertyUtil;

public class IrctcProperties {

	public static PropertyUtil propertyUtil = ConfigurationManager.getBundle();

	//public static final String IRCTC_HOME_PAGE=propertyUtil.getString("irctc.home.page");
	
	
	
	 // Page properties
	public IrctcProperties(){
		propertyUtil.addProperty(
				"irctc.home.page", "IRCTC, Flight Ticket, Air Ticket, Cheap Flight, Low Fare Flight");			
	}
	
	public static String getProp() {
		return propertyUtil.getString("irctc.home.page");
	}
	 
}
