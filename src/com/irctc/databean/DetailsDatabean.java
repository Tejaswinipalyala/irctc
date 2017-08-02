package com.irctc.databean;

import org.openqa.selenium.Keys;
import com.irctc.component.Caldercomponent;
import com.qmetry.qaf.automation.core.ConfigurationManager;
import com.qmetry.qaf.automation.core.QAFTestBase;
import com.qmetry.qaf.automation.data.BaseFormDataBean;
import com.qmetry.qaf.automation.ui.annotations.UiElement;
import com.qmetry.qaf.automation.ui.annotations.UiElement.Type;
import com.qmetry.qaf.automation.ui.webdriver.QAFExtendedWebElement;
import com.qmetry.qaf.automation.util.Randomizer;

public class DetailsDatabean extends BaseFormDataBean {

	@Randomizer(dataset = { "International", "LTC" })
	@UiElement(fieldLoc = "hometab.btn.homepage", order = 1)
	private String homepanel;

	@Randomizer(dataset = { "Hyderabad", "Hyderabad", "Hyderabad" })
	@UiElement(fieldLoc = "txtbx.from.homepage", order = 2, dependsOnField = "homepanel", dependingValue = "LTC")
	private String fromPlace;

	@Randomizer(dataset = { "Hyderabad", "Hyderabad", "Hyderabad" })
	@UiElement(fieldLoc = "Inttxtbx.from.homepage", order = 2, dependsOnField = "homepanel", dependingValue = "International")
	private String fromPlaceInt;

	@Randomizer(dataset = { "pune", "pune", "pune" })
	@UiElement(fieldLoc = "txtbx.to.homepage", order = 3, dependsOnField = "homepanel", dependingValue = "LTC")
	private String toPlace;

	@Randomizer(dataset = { "New York", "New York", "New York" })
	@UiElement(fieldLoc = "Inttxtbx.to.homepage", order = 3, dependsOnField = "homepanel", dependingValue = "International")
	private String toPlaceInt;

	@Randomizer(dataset = "date")
	// @UiElement(fieldLoc = "calender.homepage", order = 4)
	@UiElement(fieldLoc = "caleder.img.homepage", order = 4, dependsOnField = "homepanel", dependingValue = "LTC")
	private String calender;

	@Randomizer(dataset = "date")
	// @UiElement(fieldLoc = "calender.homepage", order = 4)
	@UiElement(fieldLoc = "Intcaleder.img.homepage", order = 4, dependsOnField = "homepanel", dependingValue = "International")
	private String calenderInt;

	// @Randomizer(dataset = {"One Way","Round Trip"})
	// @UiElement(fieldLoc = "radiobtn.triptype.homepage", order
	// =2,fieldType=Type.optionbox)
	// private String triptype;

	@UiElement(fieldLoc = "adult.dropdown.homepage", fieldType = Type.selectbox, dependsOnField = "homepanel", dependingValue = "LTC", order = 5)
	@Randomizer(minval = 2, maxval = 5)
	private int adults;

	@UiElement(fieldLoc = "Intadult.dropdown.homepage", fieldType = Type.selectbox, dependsOnField = "homepanel", dependingValue = "International", order = 5)
	@Randomizer(minval = 2, maxval = 3)
	private int adultsInt;

	@UiElement(fieldLoc = "child.dropdown.homepage", fieldType = Type.selectbox, dependsOnField = "homepanel", dependingValue = "LTC", order = 6)
	@Randomizer(minval = 1, maxval = 3)
	private int child;

	@UiElement(fieldLoc = "Intchild.dropdown.homepage", fieldType = Type.selectbox, dependsOnField = "homepanel", dependingValue = "International", order = 6)
	@Randomizer(minval = 1, maxval = 3)
	private int childInt;

	@UiElement(fieldLoc = "infant.dropdown.homepage", fieldType = Type.selectbox, dependsOnField = "homepanel", dependingValue = "LTC", order = 7)
	@Randomizer(minval = 0, maxval = 1)
	private int infants;

	@UiElement(fieldLoc = "Intinfant.dropdown.homepage", fieldType = Type.selectbox, dependsOnField = "homepanel", dependingValue = "International", order = 7)
	@Randomizer(minval = 0, maxval = 1)
	private int infantsInt;

	@UiElement(fieldLoc = "classtype.dropdown.homepage", fieldType = Type.selectbox, dependsOnField = "homepanel", dependingValue = "LTC", order = 8)
	@Randomizer(dataset = { "Economy", "Business", "Premium Economy" })
	private String classtype;

	@UiElement(fieldLoc = "Intclasstype.dropdown.homepage", fieldType = Type.selectbox, dependsOnField = "homepanel", dependingValue = "International", order = 8)
	@Randomizer(dataset = { "Economy", "Business" })
	private String classtypeInt;

	@UiElement(fieldLoc = "airline.dropdown.homepage", fieldType = Type.selectbox, dependsOnField = "homepanel", dependingValue = "Domestic", order = 9)
	// @Randomizer(dataset={"All Airlines","Jet Airways","Vistara Airline", "Air
	// India", "Spice Jet",
	// "Indigo", "Go", "Air Asia" })
	@Randomizer(dataset = "Airlines.list")
	private String airlines;

	@Randomizer(dataset = { "Search" })
	@UiElement(fieldLoc = "search.btn.homepage", dependsOnField = "homepanel", dependingValue = "LTC", order = 10)
	private String searchBtn;

	@Randomizer(dataset = { "Search" })
	@UiElement(fieldLoc = "Intsearch.btn.homepage", dependsOnField = "homepanel", dependingValue = "International", order = 10)
	private String IntsearchBtn;

	public void fillFromPlace() {
		QAFExtendedWebElement fromele = new QAFExtendedWebElement("txtbx.from.homepage");
		fromele.sendKeys(fromPlace, Keys.ARROW_DOWN, Keys.TAB);
	}

	public void fillFromPlaceInt() {
		QAFExtendedWebElement fromele = new QAFExtendedWebElement("Inttxtbx.from.homepage");
		fromele.sendKeys(fromPlaceInt, Keys.ARROW_DOWN, Keys.TAB);
	}

	public void fillToPlace() {
		QAFExtendedWebElement toelee = new QAFExtendedWebElement("txtbx.to.homepage");
		toelee.sendKeys(toPlace, Keys.ARROW_DOWN, Keys.TAB);
	}

	public void fillToPlaceInt() {
		QAFExtendedWebElement toelee = new QAFExtendedWebElement("Inttxtbx.to.homepage");
		toelee.sendKeys(toPlaceInt, Keys.ARROW_DOWN, Keys.TAB);
	}

	public void fillHomepanel() {
		QAFExtendedWebElement extendedWebElementTab = new QAFExtendedWebElement(
				String.format(ConfigurationManager.getBundle().getString("hometab.btn.homepage"), homepanel));
		extendedWebElementTab.waitForVisible();
		extendedWebElementTab.click();
	}

	// public void fillTriptype() {
	// QAFExtendedWebElement extendedWebElementTab=
	// new QAFExtendedWebElement(
	// String.format(ConfigurationManager
	// .getBundle()
	// .getString("radiobtn.triptype.homepage"),triptype ));
	// extendedWebElementTab.waitForVisible();
	// extendedWebElementTab.click();
	// }

	public void fillCalender() {
		QAFExtendedWebElement imgCal = new QAFExtendedWebElement("caleder.img.homepage");
		imgCal.click();
		Caldercomponent cal = new Caldercomponent();
		cal.setDate(calender);
	}

	public void fillCalenderInt() {
		QAFExtendedWebElement imgCalInt = new QAFExtendedWebElement("Intcaleder.img.homepage");
		imgCalInt.click();
		Caldercomponent cal = new Caldercomponent();
		cal.setDate(calenderInt);
	}

	public void fillIntsearchBtn() {
		QAFExtendedWebElement intsrhBtn = new QAFExtendedWebElement("Intsearch.btn.homepage");
		intsrhBtn.click();
	}

	public void fillSearchBtn() {
		QAFExtendedWebElement srhBtn = new QAFExtendedWebElement("search.btn.homepage");
		srhBtn.click();
	}
}
