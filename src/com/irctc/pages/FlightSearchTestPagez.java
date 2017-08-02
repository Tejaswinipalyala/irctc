package com.irctc.pages;

import java.util.List;
import org.hamcrest.Matchers;
import com.irctc.component.FlightsListComponent;
import com.irctc.property.IrctcProperties;
import com.qmetry.qaf.automation.core.QAFTestBase;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;
import com.qmetry.qaf.automation.util.Reporter;
import com.qmetry.qaf.automation.util.Validator;

public class FlightSearchTestPagez extends WebDriverBaseTestPage<WebDriverTestPage> {

	@FindBy(locator = "container.flights.Flightslistcomp")
	private List<FlightsListComponent> containerFlightsFlightslistcomp;

	@FindBy(locator = "tabview.menu.flightsearchpage")
	private QAFWebElement tabviewMenuFlightsearchpage;

	@Override
	protected void openPage(PageLocator pageLocator, Object... args) {
	}

	public QAFWebElement getTabviewMenuFlightsearchpage() {
		return tabviewMenuFlightsearchpage;
	}

	public List<FlightsListComponent> getContainerFlightsFlightslistcomp() {
		return containerFlightsFlightslistcomp;
	}

	@Override
	public void waitForPageToLoad() {
		QAFTestBase.pause(10000);
		Validator.verifyThat(driver.getTitle(), Matchers.equalToIgnoringCase(IrctcProperties.getProp()));
		getTabviewMenuFlightsearchpage().waitForPresent();
	}

	public void DeatilsOfAllFlights() {

		Reporter.log("Number of flights available :" + getContainerFlightsFlightslistcomp().size());
		
		for (FlightsListComponent details : containerFlightsFlightslistcomp) {
			Reporter.log("Details of Flight :" + details);
			System.out.println(
								  " Name of the Flight is : "+details.
								  getNameFlightsFlightslistcomp().getText()+
								 "  " + "\n Departute Place  of the Flight is : "
					+ details.getDepartureplaceFlightsFlightslistcomp().getText() + "  "
					+ "\n Departute Time  of the Flight is : "
					+ details.getDeparturetimeFlightsFlightslistcomp().getText() + "  "
					+ "\n Arrival Place  of the Flight is : "
					+ details.getArrivalplaceFlightsFlightslistcomp().getText() + "  "
					+ "\n Arrival Time  of the Flight is : "
					+ details.getArrivaltimeFlightsFlightslistcomp().getText() + "  "
					+ "\n Duration  of the Flight is : " + details.getDurationFlightsFlightslistcomp().getText() + "  "
					+ "\n Ticket Price  of the Flight is : " + details.getTicketpriceFlightsFlightslistcomp().getText()+"\n\n");
		}

	}
}
