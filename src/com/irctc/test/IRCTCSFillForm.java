package com.irctc.test;

import org.testng.annotations.Test;

import com.irctc.pages.FlightSearchTestPagez;
import com.irctc.pages.HomeTestPage;
import com.irctc.property.IrctcProperties;
import com.qmetry.qaf.automation.core.QAFTestBase;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;

public class IRCTCSFillForm extends WebDriverTestCase {

	@Test(description = "fill a form in irctc railways page")
	public void FillFormIN_Railways() {
		IrctcProperties irctcProperties=new IrctcProperties();
		HomeTestPage homeTestPage=new HomeTestPage();		
		homeTestPage.launchPage(null);
		homeTestPage.waitForPageToLoad();
		homeTestPage.fillForm();
		FlightSearchTestPagez flightSearchTestPagez=new FlightSearchTestPagez();
		flightSearchTestPagez.DeatilsOfAllFlights();
		
	}

}
