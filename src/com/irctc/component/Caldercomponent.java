package com.irctc.component;

import java.util.List;

import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebComponent;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;

public class Caldercomponent extends QAFWebComponent {
	

	public Caldercomponent(String locator) {
		super(locator);
	}
	public Caldercomponent() {
		super("comp.calender.first");
	}
	@FindBy(locator = "comp.arrow.previous")
	private QAFWebElement compArrowPrevious;

	@FindBy(locator = "comp.arrow.next")
	private QAFWebElement compArrowNext;

	@FindBy(locator = "comp.date.pick")
	private List<QAFWebElement> compDatePick;

	@FindBy(locator = "comp.month.pick")
	private QAFWebElement compMonthPick;

	@FindBy(locator = "comp.year.pick")
	private QAFWebElement compYearPick;

	public QAFWebElement getCompArrowPrevious() {
		return compArrowPrevious;
	}

	public QAFWebElement getCompArrowNext() {
		return compArrowNext;
	}

	public List<QAFWebElement> getCompDatePick() {
		return compDatePick;
	}

	public QAFWebElement getCompMonthPick() {
		return compMonthPick;
	}
                                             
	public QAFWebElement getCompYearPick() {
		return compYearPick;
	}

	public void setDate(String date) {
		setMonthAndYear(date.split(" ")[1],date.split(" ")[2]);
		for(QAFWebElement ele:getCompDatePick())
		{
			if(ele.getText().trim().contentEquals(date.split(" ")[0])) {
				ele.click();
				break;
			}
		}
	}
	
	private void setMonthAndYear(String month,String year) {
		if(getCompYearPick().getText().trim().contains(year)) {
			if(!getCompMonthPick().getText().trim().contains(month)) {
				getCompArrowNext().click();
			}
		}
	}
		
}
