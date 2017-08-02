package com.irctc.pages;

import org.hamcrest.Matchers;

import com.irctc.databean.DetailsDatabean;
import com.irctc.property.IrctcProperties;
import com.qmetry.qaf.automation.core.QAFTestBase;
import com.qmetry.qaf.automation.step.QAFTestStep;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;
import com.qmetry.qaf.automation.util.Reporter;
import com.qmetry.qaf.automation.util.Validator;

public class HomeTestPage extends WebDriverBaseTestPage<WebDriverTestPage> {

	DetailsDatabean bean = new DetailsDatabean();

	@FindBy(locator = "txtbx.from.homepage")
	private QAFWebElement txtbxFromHomepage;

	@FindBy(locator = "txtbx.to.homepage")
	private QAFWebElement txtbxToHomepage;

	@FindBy(locator = "calender.homepage")
	private QAFWebElement calenderHomepage;

	@FindBy(locator = "adult.dropdown.homepage")
	private QAFWebElement adultDropdownHomepage;

	@FindBy(locator = "child.dropdown.homepage")
	private QAFWebElement childDropdownHomepage;

	@FindBy(locator = "infant.dropdown.homepage")
	private QAFWebElement infantDropdownHomepage;

	@FindBy(locator = "classtype.dropdown.homepage")
	private QAFWebElement classtypeDropdownHomepage;

	@FindBy(locator = "airline.dropdown.homepage")
	private QAFWebElement airlineDropdownHomepage;

	@FindBy(locator = "search.btn.homepage")
	private QAFWebElement searchBtnHomepage;

	@FindBy(locator = "hometab.btn.homepage")
	private QAFWebElement hometabBtnHomepage;

	@FindBy(locator = "caleder.img.homepage")
	private QAFWebElement calederImgHomepage;

	@FindBy(locator = "Inttxtbx.from.homepage")
	private QAFWebElement inttxtbxFromHomepage;

	@FindBy(locator = "Inttxtbx.to.homepage")
	private QAFWebElement inttxtbxToHomepage;

	@FindBy(locator = "Intcaleder.img.homepage")
	private QAFWebElement intcalederImgHomepage;

	@FindBy(locator = "Intadult.dropdown.homepage")
	private QAFWebElement intadultDropdownHomepage;

	@FindBy(locator = "Intchild.dropdown.homepage")
	private QAFWebElement intchildDropdownHomepage;

	@FindBy(locator = "Intinfant.dropdown.homepage")
	private QAFWebElement intinfantDropdownHomepage;

	@FindBy(locator = "Intclasstype.dropdown.homepage")
	private QAFWebElement intclasstypeDropdownHomepage;

	@FindBy(locator = "radiobtn.triptype.homepage")
	private QAFWebElement radiobtnTriptypeHomepage;

	@Override
	
	protected void openPage(PageLocator pageLocator, Object... args) {
		driver.get("/");
		driver.manage().window().maximize();
	}

	public QAFWebElement getTxtbxFromHomepage() {
		return txtbxFromHomepage;
	}

	public QAFWebElement getTxtbxToHomepage() {
		return txtbxToHomepage;
	}

	public QAFWebElement getCalenderHomepage() {
		return calenderHomepage;
	}

	public QAFWebElement getAdultDropdownHomepage() {
		return adultDropdownHomepage;
	}

	public QAFWebElement getChildDropdownHomepage() {
		return childDropdownHomepage;
	}

	public QAFWebElement getInfantDropdownHomepage() {
		return infantDropdownHomepage;
	}

	public QAFWebElement getClasstypeDropdownHomepage() {
		return classtypeDropdownHomepage;
	}

	public QAFWebElement getAirlineDropdownHomepage() {
		return airlineDropdownHomepage;
	}

	public QAFWebElement getSearchBtnHomepage() {
		return searchBtnHomepage;
	}

	public QAFWebElement getHometabBtnHomepage() {
		return hometabBtnHomepage;
	}

	public QAFWebElement getCalederImgHomepage() {
		return calederImgHomepage;
	}

	public QAFWebElement getInttxtbxFromHomepage() {
		return inttxtbxFromHomepage;
	}

	public QAFWebElement getInttxtbxToHomepage() {
		return inttxtbxToHomepage;
	}

	public QAFWebElement getIntcalederImgHomepage() {
		return intcalederImgHomepage;
	}

	public QAFWebElement getIntadultDropdownHomepage() {
		return intadultDropdownHomepage;
	}

	public QAFWebElement getIntchildDropdownHomepage() {
		return intchildDropdownHomepage;
	}

	public QAFWebElement getIntinfantDropdownHomepage() {
		return intinfantDropdownHomepage;
	}

	public QAFWebElement getIntclasstypeDropdownHomepage() {
		return intclasstypeDropdownHomepage;
	}

	public QAFWebElement getRadiobtnTriptypeHomepage() {
		return radiobtnTriptypeHomepage;
	}
	
	@Override
	public void waitForPageToLoad() {
		super.waitForPageToLoad();
		System.out.println("Property title : "+IrctcProperties.getProp());
		Validator.verifyThat(driver.getTitle(), Matchers.equalToIgnoringCase(IrctcProperties.getProp()));
	}

	
	public void fillForm() {
		bean.fillRandomData();
		Reporter.log("Bean Details : "+bean);
		bean.fillUiElements();
	}

	

}
