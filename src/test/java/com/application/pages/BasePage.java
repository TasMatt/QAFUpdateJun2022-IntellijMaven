package com.application.pages;

import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;

public class BasePage extends WebDriverBaseTestPage<WebDriverTestPage> {

	@Override
	protected void openPage(PageLocator locator, Object... args) {
		// TODO Auto-generated method stub

	}

	public void openWebsite() {
		driver.get("/");
		driver.manage().window().maximize();
	}

	@FindBy(locator = "//h2[text()='Welcome to Valley']")
	public QAFWebElement labelHeadingWelcomeToValley;


	@FindBy(locator = "//nav/div[1]/div/ul/li[1]/a[text()='Open an Account']")
	public QAFWebElement labelTopMenuOpenAnAccount;


}
