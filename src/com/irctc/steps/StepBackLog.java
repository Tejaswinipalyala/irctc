package com.irctc.steps;

import com.irctc.pages.FlightSearchTestPagez;
import com.irctc.pages.HomeTestPage;
import com.qmetry.qaf.automation.step.QAFTestStep;

/**
 * @author tejaswini.palyala
 *
 */

public class StepBackLog {
	HomeTestPage homeTestPage;	
	FlightSearchTestPagez flightSearchTestPagez;
	
	@QAFTestStep(description = "User opens the IRCTC home page")
	public void userOpensIRCTC(){	
		homeTestPage=new HomeTestPage();
		homeTestPage.launchPage(null);
	}
	
	@QAFTestStep(description = "User Verifiy the page")
	public void userVerifiesPage(){
		homeTestPage.waitForPageToLoad();
	}
	
	@QAFTestStep(description = "User Fill the Flight form")
	public void userFillFlightform(){
		homeTestPage.fillForm();
	}
	
	@QAFTestStep(description = "User hit the submit button")
	public void userClickSubmit(){
		homeTestPage.getSearchBtnHomepage().waitForVisible();
		homeTestPage.getSearchBtnHomepage().click();
	}
	
	@QAFTestStep(description = "User will get the information of all the available flights")
	public void flightdInfo(){
		flightSearchTestPagez=new FlightSearchTestPagez();
		flightSearchTestPagez.DeatilsOfAllFlights();
	}
}
