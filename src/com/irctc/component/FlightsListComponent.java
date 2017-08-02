package com.irctc.component;

import java.util.List;

import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebComponent;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;

public class FlightsListComponent extends QAFWebComponent {

	

	@FindBy(locator = "name.flights.Flightslistcomp")
	private QAFWebElement nameFlightsFlightslistcomp;

	@FindBy(locator = "departuretime.flights.Flightslistcomp")
	private QAFWebElement departuretimeFlightsFlightslistcomp;

	@FindBy(locator = "departureplace.flights.Flightslistcomp")
	private QAFWebElement departureplaceFlightsFlightslistcomp;

	@FindBy(locator = "arrivalplace.flights.Flightslistcomp")
	private QAFWebElement arrivalplaceFlightsFlightslistcomp;

	@FindBy(locator = "arrivaltime.flights.Flightslistcomp")
	private QAFWebElement arrivaltimeFlightsFlightslistcomp;

	@FindBy(locator = "duration.flights.Flightslistcomp")
	private QAFWebElement durationFlightsFlightslistcomp;

	@FindBy(locator = "ticketprice.flights.Flightslistcomp")
	private QAFWebElement ticketpriceFlightsFlightslistcomp;

	public FlightsListComponent(String locator) {
		super(locator);
	}

	/*public FlightsListComponent() {
		super("container.flights.Flightslistcomp");
	}*/

	

	public QAFWebElement getNameFlightsFlightslistcomp() {
		return nameFlightsFlightslistcomp;
	}

	public QAFWebElement getDeparturetimeFlightsFlightslistcomp() {
		return departuretimeFlightsFlightslistcomp;
	}

	public QAFWebElement getDepartureplaceFlightsFlightslistcomp() {
		return departureplaceFlightsFlightslistcomp;
	}

	public QAFWebElement getArrivalplaceFlightsFlightslistcomp() {
		return arrivalplaceFlightsFlightslistcomp;
	}

	public QAFWebElement getArrivaltimeFlightsFlightslistcomp() {
		return arrivaltimeFlightsFlightslistcomp;
	}

	public QAFWebElement getDurationFlightsFlightslistcomp() {
		return durationFlightsFlightslistcomp;
	}

	public QAFWebElement getTicketpriceFlightsFlightslistcomp() {
		return ticketpriceFlightsFlightslistcomp;
	}

}
